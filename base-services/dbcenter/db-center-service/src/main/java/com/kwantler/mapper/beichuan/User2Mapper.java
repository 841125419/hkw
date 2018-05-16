package com.kwantler.mapper.beichuan;

import com.kwantler.dbCenterApi.entity.UserEntity;

import java.util.List;

public interface User2Mapper {
	
	List<UserEntity> getAll2();
	
	UserEntity getOne2(Long id);

	void add2(UserEntity user);

	void update2(UserEntity user);

	void delete2(Long id);

}