package com.xxt.mp_demo;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
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
    void testInsert(){
        User user = new User();
        user.setName("张三");
        user.setAge(23);
        user.setTel("123456789");
        user.setPassword("123456");
        int insert = userDao.insert(user);
        System.out.println(insert);
    }

    @Test
    void testDel(){
        userDao.deleteById(1L);
    }

    @Test
    void testUpd(){
        User user = new User();
        user.setId(2L);
        user.setName("张三");
        user.setAge(23);
        user.setTel("123456789");
        user.setPassword("123456");
        userDao.updateById(user);
    }
    @Test
    void testGetAll(){
        List<User> userList = userDao.selectList(null);
        System.out.println(userList);
    }


    @Test
    void testSelectPage(){
        IPage<User> page = new Page<>(1, 3);

        userDao.selectPage(page,null);

        System.out.println("当前页码值："+page.getCurrent());
        System.out.println("每页显示数："+page.getSize());
        System.out.println("总页数："+page.getPages());
        System.out.println("总条数："+page.getTotal());
        System.out.println("当前页数据："+page.getRecords());
    }

}
