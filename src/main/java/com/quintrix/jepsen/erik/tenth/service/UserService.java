/*
 * package com.quintrix.jepsen.erik.tenth.service;
 * 
 * import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest; import
 * org.springframework.security.oauth2.client.userinfo.OAuth2UserService; import
 * org.springframework.security.oauth2.core.OAuth2AuthenticationException; import
 * org.springframework.stereotype.Service; import com.quintrix.jepsen.erik.tenth.model.TenthUser;
 * import com.quintrix.jepsen.erik.tenth.repository.UserRepository;
 * 
 * @Service public class UserService implements OAuth2UserService<OAuth2UserRequest, TenthUser> {
 * private UserRepository userRepository;
 * 
 * public UserService(UserRepository userRepository) { this.userRepository = userRepository; }
 * 
 * @Override public TenthUser loadUser(OAuth2UserRequest userRequest) throws
 * OAuth2AuthenticationException { String userId; TenthUser user; userId =
 * userRequest.getClientRegistration().getProviderDetails().getUserInfoEndpoint()
 * .getUserNameAttributeName(); user = userRepository.findById(userId.hashCode()).orElse(null);
 * return user; } }
 */
