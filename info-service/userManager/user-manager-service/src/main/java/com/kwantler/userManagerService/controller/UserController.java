package com.kwantler.userManagerService.controller;

import com.kwantler.api.userInfo.UserInfoService;
import com.kwantler.dbCenterApi.entity.UserEntity;
import com.kwantler.userManagerService.bo.UserBo;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController implements UserInfoService {
    @Autowired
    UserBo userBo;

    @Override
    @HystrixCommand(fallbackMethod = "a")
    public List<UserEntity> getAllUsers() {
        return userBo.getAll();
    }
    public List<UserEntity> a() {
        List<UserEntity> list = new ArrayList<>();
        UserEntity userEntity = new UserEntity();
        userEntity.setId(0L);
        list.add(userEntity);
        return list;
    }


}
