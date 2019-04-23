package com.wust.controller;

import com.wust.model.HomePage;
import com.wust.service.HomePageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;


@Controller
@RequestMapping("/HomePage")
public class HomePageController {
    @Autowired
    private HomePageService homePageService;


    @RequestMapping(value = "/deleteByContentid",method = RequestMethod.GET)
    public boolean deleteByContentid(@RequestParam("contentid")@Valid String contentId){
        Integer contentid=Integer.parseInt(contentId);
        boolean flag=homePageService.deleteByContentid(contentid);
        return flag;
    }

    @RequestMapping(value = "/insert",method = RequestMethod.GET)
    public boolean insert(@RequestParam("contentid")@Valid String contentId,
                         @RequestParam("title")@Valid String Title,
                         @RequestParam("summary")@Valid String Summary,
                         @RequestParam("picture")@Valid String Picture,
                         @RequestParam("paraNum")@Valid String paranum){
        Integer contentid=Integer.parseInt(contentId);
        String title=Title;
        String summary=Summary;
        String picture=Picture;
        Integer paraNum=Integer.parseInt(paranum);
        HomePage homePage=new HomePage(contentid,title,summary,picture,paraNum);
        boolean flag=homePageService.insert(homePage);
        return flag;
    }

    @RequestMapping(value = "/selectByContentid",method = RequestMethod.GET)
    public HomePage selectByContentid(@RequestParam("contentid")@Valid String contentId){
        Integer contentid=Integer.parseInt(contentId);
        HomePage homePage=homePageService.selectByContentid(contentid);
        return homePage;
    }

    @RequestMapping(value = "/selectByTitle",method = RequestMethod.GET)
    public List<HomePage> selectByTitle(@RequestParam("title")@Valid String Title){
        String title=Title;
        List<HomePage> lsit=homePageService.selectByTitle(title);
        return lsit;
    }

    @RequestMapping(value = "/selectAllHomePage",method = RequestMethod.GET)
    public List<HomePage> selectAllHomePage(){
        List<HomePage> list=homePageService.selectAllHomePage();
        return list;
    }

    @RequestMapping(value = "/update",method = RequestMethod.GET)
    public boolean update(@RequestParam("contentid")@Valid String contentId,
                         @RequestParam("title")@Valid String Title,
                         @RequestParam("summary")@Valid String Summary,
                         @RequestParam("picture")@Valid String Picture,
                         @RequestParam("paraNum")@Valid String paranum){
        Integer contentid=Integer.parseInt(contentId);
        String title=Title;
        String summary=Summary;
        String picture=Picture;
        Integer paraNum=Integer.parseInt(paranum);
        HomePage homePage=new HomePage(contentid,title,summary,picture,paraNum);
        boolean flag=homePageService.update(homePage);
        return flag;
    }
}
