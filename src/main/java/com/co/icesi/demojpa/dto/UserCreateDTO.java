package com.co.icesi.demojpa.dto;


import lombok.Data;

@Data
public class UserCreateDTO {
    private String firstName;
    private String lastName;
    private Boolean isActive;
    private String email;
    private String passWord;
}
