package com.wust.controller;

import com.wust.model.User;
import com.wust.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/User")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private HttpServletRequest request;

    @RequestMapping("/")
    public String index(){
        return "/index";
    }

    @RequestMapping("/deleteByUserid")
    public String deleteByUserid(){
        Integer userid=Integer.parseInt(request.getParameter("userid"));
        userService.deleteByUserid(userid);
        return "/index";
    }

    @RequestMapping("/insert")
    public String insert(){
        Integer userid=Integer.parseInt(request.getParameter("userid"));
        String username=request.getParameter("username");
        String sex=request.getParameter("sex");
        String userimage=request.getParameter("userimage");
        String phonenum=request.getParameter("phonenum");
        String eMail=request.getParameter("eMail");
        String address=request.getParameter("address");
        Integer wallet=Integer.parseInt(request.getParameter("wallet"));
        Integer myCollection=Integer.parseInt(request.getParameter("myCollection"));
        String password=request.getParameter("password");
        User user=new User(userid,username,sex,userimage,phonenum,eMail,address,wallet,myCollection,password);
        userService.insert(user);
        return "/index";
    }

    @RequestMapping("/selectByUserid")
    public String selectByUserid(){
        Integer userid=Integer.parseInt(request.getParameter("userid"));
        userService.selectByUserid(userid);
        return "/index";
    }

    @RequestMapping("/selectByUsername")
    public String selectByUsername(){
        String username=request.getParameter("username");
        userService.selectByUsername(username);
        return "/index";
    }

    @RequestMapping("/selectAllUser")
    public String selectAllUser(){
        userService.selectAllUser();
        return "/index";
    }

    @RequestMapping("/update")
    public String update(){
        Integer userid=Integer.parseInt(request.getParameter("userid"));
        String username=request.getParameter("username");
        String sex=request.getParameter("sex");
        String userimage=request.getParameter("userimage");
        String phonenum=request.getParameter("phonenum");
        String eMail=request.getParameter("eMail");
        String address=request.getParameter("address");
        Integer wallet=Integer.parseInt(request.getParameter("wallet"));
        Integer myCollection=Integer.parseInt(request.getParameter("myCollection"));
        String password=request.getParameter("password");
        User user=new User(userid,username,sex,userimage,phonenum,eMail,address,wallet,myCollection,password);
        userService.update(user);
        return "/index";
    }
}
