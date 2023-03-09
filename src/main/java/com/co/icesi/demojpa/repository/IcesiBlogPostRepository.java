package com.co.icesi.demojpa.repository;

import com.co.icesi.demojpa.model.IcesiBlogPost;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IcesiBlogPostRepository extends JpaRepository<IcesiBlogPost, UUID> {

}
