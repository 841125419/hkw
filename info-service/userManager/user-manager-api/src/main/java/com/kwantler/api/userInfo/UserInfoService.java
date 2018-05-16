package com.kwantler.api.userInfo;

import com.kwantler.dbCenterApi.entity.UserEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

public interface UserInfoService {
    @RequestMapping(value = "getAllUsers",method = RequestMethod.GET)
    List<UserEntity> getAllUsers();
}
