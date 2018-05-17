package com.kwantler.controller;

import com.kwantler.dbCenterApi.api.po.UserService;
import com.kwantler.dbCenterApi.entity.UserEntity;
import com.kwantler.service.User1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController implements UserService {

    @Autowired
    private User1Service user1Service;

    @Value("${server.port}")
    private String port;

    public void add1(UserEntity user){
        user1Service.add1(user);
    }

    public void delete(@PathVariable("id") Long id){
        user1Service.delete(id);
    }

    public List<UserEntity> getAll(){
        System.out.println("db-center-servcie: " + port);
        return user1Service.getAll();
    }

}
