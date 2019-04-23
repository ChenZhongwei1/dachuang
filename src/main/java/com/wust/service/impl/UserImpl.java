package com.wust.service.impl;

import com.wust.dao.UserMapper;
import com.wust.model.User;
import com.wust.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service("UserService")
public class UserImpl implements UserService {

    @Autowired
    UserMapper usermapper;

    @Override
    public boolean deleteByUserid(Integer userid) {
        int i=usermapper.deleteByPrimaryKey(userid);
        if(i>0)
            return true;
        else
            return false;
    }

    @Override
    public boolean insert(User user) {
        int i=usermapper.insertSelective(user);
        if(i>0)
            return true;
        else
            return false;
    }

    @Override
    public User selectByUserid(Integer userid) {
        User user=usermapper.selectByPrimaryKey(userid);
        return user;
    }

    @Override
    public List<User> selectByUsername(String username) {
        List<User> list=usermapper.selectAllUser();
        List<User> l=new ArrayList<User>();;
        for(int i=0;i<list.size();i++){
            if(list.get(i).getUsername().equals(username))
                l.add(list.get(i));
        }
        return l;
    }

    @Override
    public List<User> selectAllUser() {
        List<User> list=usermapper.selectAllUser();
        return list;
    }

    @Override
    public boolean update(User user) {
        int i=usermapper.updateByPrimaryKeySelective(user);
        if(i>0)
            return true;
        else
            return false;
    }
}
