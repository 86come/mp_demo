package com.xxt.mp_demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xxt.mp_demo.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao extends BaseMapper<User> {

}

