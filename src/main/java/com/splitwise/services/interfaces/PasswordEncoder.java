package com.splitwise.services.interfaces;

//Proxy interface
public interface PasswordEncoder {
    String encode(String password);
    boolean matches(String plainText, String hashed);
}
