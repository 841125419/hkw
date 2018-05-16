package com.kwantler.userManagerService.controller;

import com.kwantler.api.userInfo.UserInfoService;
import com.kwantler.dbCenterApi.entity.UserEntity;
import com.kwantler.userManagerService.bo.UserBo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController implements UserInfoService {
    @Autowired
    UserBo userBo;

    @Override
    public List<UserEntity> getAllUsers() {
        return userBo.getAll();
    }
}
