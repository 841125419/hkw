package com.kwantler.mapper.test1;

import com.kwantler.entity.UserEntity;

import java.util.List;

public interface User1Mapper {
	
	List<UserEntity> getAll();
	
	UserEntity getOne(Long id);

	void add1(UserEntity user);

	void update1(UserEntity user);

	void delete1(Long id);

}