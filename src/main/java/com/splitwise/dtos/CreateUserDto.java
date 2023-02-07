package com.splitwise.dtos;

import com.splitwise.models.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Builder
@Getter
@Setter
public class CreateUserDto {
    private String name;
    private String phoneNumber;
    private String password;

    public User user(String hashedPassword) {
        User user = new User();
        user.setName(name);
        user.setPhoneNumber(phoneNumber);
        user.setHashedPassword(hashedPassword);
        return user;
    }
}
