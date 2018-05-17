package com.kwantler.userManagerService.bo;

import com.kwantler.dbCenterApi.api.po.UserService;
import com.kwantler.dbCenterApi.entity.UserEntity;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;

import java.util.List;

@FeignClient(value = "db-center-service")
public interface UserBo extends UserService {

}
