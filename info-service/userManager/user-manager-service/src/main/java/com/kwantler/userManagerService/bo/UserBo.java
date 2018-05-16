package com.kwantler.userManagerService.bo;

import com.kwantler.dbCenterApi.api.po.UserService;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(value = "db-center-service")
public interface UserBo extends UserService {


}
