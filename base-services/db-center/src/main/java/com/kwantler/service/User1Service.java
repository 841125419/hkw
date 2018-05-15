package com.kwantler.service;

import com.kwantler.entity.UserEntity;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping(value = "user")
public interface User1Service {

    List<UserEntity> getAll();
    void add1(UserEntity user);
    void delete(Long id);

    List<UserEntity> getAll2();
    void add2(UserEntity user);
    void delete2(Long id);
}
