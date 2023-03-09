package com.co.icesi.demojpa.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Data
@Entity
public class IcesiUser {
    @Id
    private UUID userID;
    private String firstName;
    private String lastName;
    private Boolean isActive;
    private String email;
    private String passWord;

    @ManyToOne
    @JoinColumn(name = "icesi_role_role_id")
    private IcesiRole role;

    @OneToMany(mappedBy = "user")
    private List<IcesiBlogPost> blogPostList;
}
