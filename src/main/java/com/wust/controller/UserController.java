package com.wust.controller;

import com.wust.model.User;
import com.wust.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;


@Controller
@RequestMapping("/User")
public class UserController {
    @Autowired
    private UserService userService;


    @RequestMapping(value = "/deleteByUserid",method = RequestMethod.GET)
    public boolean deleteByUserid(@RequestParam("userid")@Valid String userId){
        Integer userid=Integer.parseInt(userId);
        boolean flag=userService.deleteByUserid(userid);
        return flag;
    }

    @RequestMapping(value = "/insert",method = RequestMethod.GET)
    public boolean insert(@RequestParam("userid")@Valid String userId,
                         @RequestParam("username")@Valid String userName,
                          @RequestParam("sex")@Valid String Sex,
                         @RequestParam("userimage")@Valid String userImage,
                         @RequestParam("phonenum")@Valid String phoneNum,
                         @RequestParam("eMail")@Valid String EMail,
                         @RequestParam("address")@Valid String Address,
                         @RequestParam("wallet")@Valid String Wallet,
                         @RequestParam("myCollection")@Valid String mycollection,
                         @RequestParam("password")@Valid String passWord){
        Integer userid=Integer.parseInt(userId);
        String username=userName;
        String sex=Sex;
        String userimage=userImage;
        String phonenum=phoneNum;
        String eMail=EMail;
        String address=Address;
        Integer wallet=Integer.parseInt(Wallet);
        Integer myCollection=Integer.parseInt(mycollection);
        String password=passWord;
        User user=new User(userid,username,sex,userimage,phonenum,eMail,address,wallet,myCollection,password);
        boolean flag=userService.insert(user);
        return flag;
    }

    @RequestMapping(value = "/selectByUserid",method = RequestMethod.GET)
    public User selectByUserid(@RequestParam("userid")@Valid String userId){
        Integer userid=Integer.parseInt(userId);
        User user=userService.selectByUserid(userid);
        return user;
    }

    @RequestMapping(value = "/selectByUsername",method = RequestMethod.GET)
    public List<User> selectByUsername(@RequestParam("username")@Valid String userName){
        String username=userName;
        List<User> list=userService.selectByUsername(username);
        return list;
    }

    @RequestMapping(value = "/selectAllUser",method = RequestMethod.GET)
    public List<User> selectAllUser(){
        List<User> list=userService.selectAllUser();
        return list;
    }

    @RequestMapping(value = "/update",method = RequestMethod.GET)
    public boolean update(@RequestParam("userid")@Valid String userId,
                         @RequestParam("username")@Valid String userName,
                          @RequestParam("sex")@Valid String Sex,
                         @RequestParam("userimage")@Valid String userImage,
                         @RequestParam("phonenum")@Valid String phoneNum,
                         @RequestParam("eMail")@Valid String EMail,
                         @RequestParam("address")@Valid String Address,
                         @RequestParam("wallet")@Valid String Wallet,
                         @RequestParam("myCollection")@Valid String mycollection,
                         @RequestParam("password")@Valid String passWord){
        Integer userid=Integer.parseInt(userId);
        String username=userName;
        String sex=Sex;
        String userimage=userImage;
        String phonenum=phoneNum;
        String eMail=EMail;
        String address=Address;
        Integer wallet=Integer.parseInt(Wallet);
        Integer myCollection=Integer.parseInt(mycollection);
        String password=passWord;
        User user=new User(userid,username,sex,userimage,phonenum,eMail,address,wallet,myCollection,password);
        boolean flag=userService.update(user);
        return flag;
    }
}
