package com.splitwise.services;

import com.splitwise.services.interfaces.PasswordEncoder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class BCryptEncoder implements PasswordEncoder {
//Wrapped spring encoder
    private BCryptPasswordEncoder bCryptEncoder = new BCryptPasswordEncoder();

    @Override
    public String encode(String password) {
        return bCryptEncoder.encode(password);
    }

    @Override
    public boolean matches(String plainText, String hashed) {
        return bCryptEncoder.matches(plainText, hashed);
    }
}
