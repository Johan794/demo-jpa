package com.co.icesi.demojpa.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserCreateDTO {
    private String firstName;
    private String lastName;
    private Boolean isActive;
    private String email;
    private String passWord;
}
