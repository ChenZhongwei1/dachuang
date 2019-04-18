package com.wust.service;

import com.wust.model.User;
import java.util.List;

public interface UserService {
    boolean deleteByUserid(Integer userid);

    boolean insert(User user);

    User selectByUserid(Integer userid);

    List<User> selectByUsername(String username);

    List<User> selectAllUser( );

    boolean update(User user);
}
