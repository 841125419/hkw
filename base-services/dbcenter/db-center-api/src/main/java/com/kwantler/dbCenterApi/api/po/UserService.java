package com.kwantler.dbCenterApi.api.po;

import com.kwantler.dbCenterApi.entity.UserEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 用户信息
 */
@RequestMapping(value = "/user")
public interface UserService {
    @RequestMapping(value = "/add1")
    public void add1(UserEntity user);

    @RequestMapping(value = "/delete")
    public void delete(@PathVariable("id") Long id);

    @RequestMapping(value = "/getAll")
    public List<UserEntity> getAll();
}
