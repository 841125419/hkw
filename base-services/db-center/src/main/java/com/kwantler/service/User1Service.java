package com.kwantler.service;

import com.kwantler.entity.UserEntity;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping(value = "user")
public interface User1Service {

    List<UserEntity> getAll();
    void add(UserEntity user);
}
