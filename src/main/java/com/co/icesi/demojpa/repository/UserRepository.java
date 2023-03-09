package com.co.icesi.demojpa.repository;

import com.co.icesi.demojpa.model.IcesiUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository  extends JpaRepository<IcesiUser, UUID> {
    Optional<IcesiUser> findIcesiUserByEmail(String email);

}
