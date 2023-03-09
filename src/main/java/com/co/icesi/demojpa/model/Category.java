package com.co.icesi.demojpa.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;
import java.util.UUID;

@Entity
@Data
public class Category {
    @Id
    private UUID categoryId;

    private String name;

    private String description;

    @ManyToMany(mappedBy = "categories")
    private List<IcesiBlogPost> icesiBlogPosts;
}
