package com.wust.dao;

import com.wust.model.User;
import java.util.*;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userid);

    List<User> selectAllUser( );

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}