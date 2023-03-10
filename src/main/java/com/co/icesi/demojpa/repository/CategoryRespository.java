package com.co.icesi.demojpa.repository;

import com.co.icesi.demojpa.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CategoryRespository extends JpaRepository<Category, UUID> {
}
