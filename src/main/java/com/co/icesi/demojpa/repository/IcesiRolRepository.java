package com.co.icesi.demojpa.repository;

import com.co.icesi.demojpa.model.IcesiRole;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface IcesiRolRepository extends JpaRepository<IcesiRole, UUID> {


}

