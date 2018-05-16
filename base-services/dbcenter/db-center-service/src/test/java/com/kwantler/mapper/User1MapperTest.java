package com.kwantler.mapper;

import com.kwantler.dbCenterApi.entity.UserEntity;
import com.kwantler.dbCenterApi.enums.UserSexEnum;
import com.kwantler.mapper.beichuan.User2Mapper;
import com.kwantler.mapper.test1.User1Mapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class User1MapperTest {

    @Autowired
    private User1Mapper user1Mapper;
    @Autowired
    private User2Mapper user2Mapper;

    @Test
    public void testInsert() throws Exception {
        user1Mapper.add1(new UserEntity("aa", "a123456", UserSexEnum.MAN));
        user1Mapper.add1(new UserEntity("bb", "b123456", UserSexEnum.WOMAN));
        user1Mapper.add1(new UserEntity("cc", "b123456", UserSexEnum.WOMAN));

    }

//    @Test
    public void testInsert2() throws Exception {
        user2Mapper.add2(new UserEntity(1L,"aa", "a123456", UserSexEnum.MAN));
        user2Mapper.add2(new UserEntity(2L,"bb", "b123456", UserSexEnum.WOMAN));
        user2Mapper.add2(new UserEntity(3L,"cc", "b123456", UserSexEnum.WOMAN));

    }
}
