package com.co.icesi.demojpa.unit.service;

import com.co.icesi.demojpa.dto.UserCreateDTO;
import com.co.icesi.demojpa.mapper.UserMapper;
import com.co.icesi.demojpa.mapper.UserMapperImpl;
import com.co.icesi.demojpa.model.IcesiUser;
import com.co.icesi.demojpa.repository.UserRepository;
import com.co.icesi.demojpa.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

public class UserServiceTest {
    private UserService userService;

    private UserRepository userRepository;

    @BeforeEach
    private void init(){
        userRepository = mock(UserRepository.class);
        UserMapper userMapper = spy(UserMapperImpl.class);
        userService= new UserService(userRepository, userMapper);
    }

    @Test
    public  void  testCreateUser(){
        userService.save(defaultUserDto());
        IcesiUser icesiUser = IcesiUser.builder()
                .firstName("Jhon")
                .lastName("Ricardo")
                .passWord("123456")
                .isActive(true)
                .build();
        verify(userRepository,times(1)).save(argThat(new IcesiUserMatcher(icesiUser)));

    }

    @Test
    public void testCreateUserWhenEmailAlreadyExist(){
        when(userRepository.findIcesiUserByEmail(any())).thenReturn(Optional.of(defaultIcesiUser()));
        assertThrows(RuntimeException.class, () -> userService.save(defaultUserDto()));
    }

    private UserCreateDTO defaultUserDto(){
        return UserCreateDTO.builder()
                .firstName("Jhon")
                .lastName("Done")
                .isActive(true)
                .email("jhonDoe@java.org.co")
                .passWord("123234")
                .build();
    }

    private IcesiUser defaultIcesiUser(){
        return IcesiUser.builder()
                .firstName("Jhon")
                .lastName("Ricardo")
                .passWord("123456")
                .isActive(true)
                .build();
    }
}
