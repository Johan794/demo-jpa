package com.co.icesi.demojpa.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Data
public class IcesiBlogPost {
    @Id
    private UUID postId;
    private String content;
    private String title;

    @ManyToOne
    @JoinColumn(name= "icesi_user_user_id")
    private IcesiUser user;

    @ManyToMany
    @JoinTable(
       name = "category_icesi_blog_post" ,
       joinColumns = @JoinColumn(name ="category_category_id" ),
       inverseJoinColumns = @JoinColumn(name = "icesi_blog_post_post_id")
    )
    private List<Category> categories;



}
