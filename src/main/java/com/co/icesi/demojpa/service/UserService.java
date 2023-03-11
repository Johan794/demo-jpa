package com.co.icesi.demojpa.service;

import com.co.icesi.demojpa.dto.UserCreateDTO;
import com.co.icesi.demojpa.mapper.UserMapper;
import com.co.icesi.demojpa.model.IcesiUser;
import com.co.icesi.demojpa.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@AllArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;
    private final UserMapper mapper;

    public IcesiUser save (UserCreateDTO user){
        if(userRepository.findIcesiUserByEmail(user.getEmail()).isPresent()){
            throw  new RuntimeException();
        }
        IcesiUser icesiUser = mapper.fromUserDTO(user);
        icesiUser.setUserID(UUID.randomUUID());
        return userRepository.save(icesiUser);
    }

    public Optional<IcesiUser> findById(UUID id){
        return Optional.of(userRepository.findById(id).orElseThrow());
    }

}
