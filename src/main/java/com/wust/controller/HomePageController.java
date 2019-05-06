package com.wust.controller;

import com.wust.model.HomePage;
import com.wust.service.HomePageService;
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
@RequestMapping("api/HomePage")
@Api(value = "HomePage",description = "app首页")
public class HomePageController {
    @Autowired
    private HomePageService homePageService;


    @ApiOperation(value ="单个删除")
    @PostMapping(value ="/deleteByContentid")
    public boolean deleteByContentid(@RequestParam("contentid")@Valid String contentId){
        Integer contentid=Integer.parseInt(contentId);
        boolean flag=homePageService.deleteByContentid(contentid);
        return flag;
    }

    @ApiOperation(value ="单个插入")
    @PostMapping(value ="/insert")
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

    @ApiOperation(value ="单个查询")
    @PostMapping(value = "/selectByContentid")
    public HomePage selectByContentid(@RequestParam("contentid")@Valid String contentId){
        Integer contentid=Integer.parseInt(contentId);
        HomePage homePage=homePageService.selectByContentid(contentid);
        return homePage;
    }

    @ApiOperation(value ="题目查询")
    @PostMapping(value = "/selectByTitle")
    public List<HomePage> selectByTitle(@RequestParam("title")@Valid String Title){
        String title=Title;
        List<HomePage> list=homePageService.selectByTitle(title);
        return list;
    }

    @ApiOperation(value ="查询所有")
    @PostMapping(value = "/selectAllHomePage")
    public List<HomePage> selectAllHomePage(){
        List<HomePage> list=homePageService.selectAllHomePage();
        return list;
    }

    @ApiOperation(value ="更新")
    @PostMapping(value = "/update")
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
