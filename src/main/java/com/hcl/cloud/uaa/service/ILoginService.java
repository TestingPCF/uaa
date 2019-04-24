package com.hcl.cloud.uaa.service;

public interface ILoginService {
	
    String login(String username, String password);
    
    boolean logout(String token);

    Boolean isValidToken(String token);

    String createNewToken(String token);
    
}
