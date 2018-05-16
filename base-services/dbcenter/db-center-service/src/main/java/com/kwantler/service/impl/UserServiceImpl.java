package com.kwantler.service.impl;

import com.kwantler.dbCenterApi.entity.UserEntity;
import com.kwantler.mapper.beichuan.User2Mapper;
import com.kwantler.mapper.test1.User1Mapper;
import com.kwantler.service.User1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements User1Service {

    @Autowired
    private User1Mapper user1Mapper;
    @Autowired
    private User2Mapper user2Mapper;

    @Override
    public List<UserEntity> getAll() {
        return user1Mapper.getAll();
    }

    @Override
    public void add1(UserEntity user) {
        user1Mapper.add1(user);
    }

    @Override
    public void delete(Long id) {
        user1Mapper.delete1(id);
    }

    @Override
    public List<UserEntity> getAll2() {
        return user2Mapper.getAll2();
    }

    @Override
    public void add2(UserEntity user) {
        user2Mapper.add2(user);
    }

    @Override
    public void delete2(Long id) {
        user2Mapper.delete2(id);
    }

}
