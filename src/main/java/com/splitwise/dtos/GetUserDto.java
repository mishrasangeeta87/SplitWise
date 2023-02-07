package com.splitwise.dtos;

import com.splitwise.models.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Builder
public class GetUserDto {
    private String name;
    private String phoneNumber;

}
