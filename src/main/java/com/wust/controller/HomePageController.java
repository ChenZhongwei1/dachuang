package com.wust.controller;

import com.wust.model.HomePage;
import com.wust.service.HomePageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/HomePage")
public class HomePageController {
    @Autowired
    private HomePageService homePageService;
    @Autowired
    private HttpServletRequest request;

    @RequestMapping("/")
    public String index(){
        return "/index";
    }

    @RequestMapping("/deleteByContentid")
    public String deleteByContentid(){
        Integer contentid=Integer.parseInt(request.getParameter("contentid"));
        homePageService.deleteByContentid(contentid);
        return "/index";
    }

    @RequestMapping("/insert")
    public String insert(){
        Integer contentid=Integer.parseInt(request.getParameter("contentid"));
        String title=request.getParameter("title");
        String summary=request.getParameter("summary");
        String picture=request.getParameter("picture");
        Integer paraNum=Integer.parseInt(request.getParameter("paraNum"));
        HomePage homePage=new HomePage(contentid,title,summary,picture,paraNum);
        homePageService.insert(homePage);
        return "/index";
    }

    @RequestMapping("/selectByContentid")
    public String selectByContentid(){
        Integer contentid=Integer.parseInt(request.getParameter("contentid"));
        homePageService.selectByContentid(contentid);
        return "/index";
    }

    @RequestMapping("/selectByTitle")
    public String selectByTitle(){
        String title=request.getParameter("title");
        homePageService.selectByTitle(title);
        return "/index";
    }

    @RequestMapping("/selectAllHomePage")
    public String selectAllHomePage(){
        homePageService.selectAllHomePage();
        return "/index";
    }

    @RequestMapping("/update")
    public String update(){
        Integer contentid=Integer.parseInt(request.getParameter("contentid"));
        String title=request.getParameter("title");
        String summary=request.getParameter("summary");
        String picture=request.getParameter("picture");
        Integer paraNum=Integer.parseInt(request.getParameter("paraNum"));
        HomePage homePage=new HomePage(contentid,title,summary,picture,paraNum);
        homePageService.update(homePage);
        return "/index";
    }
}
