package com.quintrix.jepsen.erik.tenth.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Component;

@Component
@Entity
public class TenthUser {
  @Id
  private Integer userId;
  private String userName;
  private String url;

  /**
   * A do-nothing class constructor that should never ever be used by anyone, anywhen, anywhere,
   * ever, and I really, really mean it!
   */
  @SuppressWarnings("unused")
  private TenthUser() {
    userId = -1;
    userName = "";
    url = "";
  }

  public TenthUser(OAuth2User principal) {
    userName = principal.getName();
    if (principal.getAttribute("url").toString().startsWith("https://api.github.com/")) {
      userId = principal.getAttribute("node_id");
      url = principal.getAttribute("url").toString();
    } else {
      userId = (int) (System.currentTimeMillis() % Integer.MAX_VALUE);
      url = "";
    }
  }
}
