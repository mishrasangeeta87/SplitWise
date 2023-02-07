package com.splitwise.models;

import com.splitwise.dtos.GetUserDto;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "users")
@Getter
@Setter
public class User extends BaseModel{
    private String name;
    private String phoneNumber;
    private String hashedPassword;

    public GetUserDto dto(){
        return GetUserDto.builder()
                .name(name)
                .phoneNumber(phoneNumber)
                .build();
    }
}
