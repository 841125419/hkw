package com.kwantler.controller;

import com.kwantler.entity.UserEntity;
import com.kwantler.service.User1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

public class UserController {

    @Autowired
    private User1Service user1Service;

    @RequestMapping(value = "add1")
    public void add1(UserEntity user){
        user1Service.add1(user);
    }

    @RequestMapping(value = "delete")
    public void delete(@PathVariable("id") Long id){
        user1Service.delete(id);
    }

    @RequestMapping(value = "getAll")
    public void getAll(){
        user1Service.getAll();
    }

}
