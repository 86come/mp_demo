package com.xxt.mp_demo;

import com.xxt.mp_demo.mapper.UserDao;
import com.xxt.mp_demo.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MpDemoApplicationTests {

    @Autowired
    private UserDao userDao;
    @Test
    void contextLoads() {

    }

    @Test
    void testGetAll(){
        List<User> userList = userDao.selectList(null);
        System.out.println(userList);
    }

}
