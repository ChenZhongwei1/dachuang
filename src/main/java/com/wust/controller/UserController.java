package com.wust.controller;

import com.wust.model.User;
import com.wust.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.validation.Valid;
import java.util.List;


@RestController
@EnableSwagger2
@RequestMapping("api/User")
@Api(value = "User",description = "用户表")
public class UserController {
    @Autowired
    private UserService userService;


    @ApiOperation(value = "单个删除")
    @PostMapping(value = "/deleteByUserid")
    public boolean deleteByUserid(@RequestParam("userid")@Valid String userId){
        Integer userid=Integer.parseInt(userId);
        boolean flag=userService.deleteByUserid(userid);
        return flag;
    }

    @ApiOperation(value = "单个插入")
    @PostMapping(value = "/insert")
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

    @ApiOperation(value = "ID查询")
    @PostMapping(value = "/selectByUserid")
    public User selectByUserid(@RequestParam("userid")@Valid String userId){
        Integer userid=Integer.parseInt(userId);
        User user=userService.selectByUserid(userid);
        return user;
    }

    @ApiOperation(value = "用户名查询")
    @PostMapping(value = "/selectByUsername")
    public List<User> selectByUsername(@RequestParam("username")@Valid String userName){
        String username=userName;
        List<User> list=userService.selectByUsername(username);
        return list;
    }

    @ApiOperation(value = "查询所有")
    @PostMapping(value = "/selectAllUser")
    public List<User> selectAllUser(){
        List<User> list=userService.selectAllUser();
        return list;
    }

    @ApiOperation(value = "更新")
    @PostMapping(value = "/update")
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
