package com.wust.controller;

import com.wust.model.Collections;
import com.wust.model.Content;
import com.wust.service.ContentService;
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
@RequestMapping("api/Content")
@Api(value = "Content",description = "正文部分")
public class ContentController {
    @Autowired
    private ContentService contentService;

    @ApiOperation("单个删除")
    @PostMapping(value = "/deleteByPrimaryKey")
    public boolean deleteByPrimaryKey(@RequestParam("contentid")@Valid String contentId,
                                     @RequestParam("paraid")@Valid String paraId){
        Integer contentid=Integer.parseInt(contentId);
        Integer paraid=Integer.parseInt(paraId);
        boolean flag=contentService.deleteByPrimaryKey(contentid,paraid);
        return flag;
    }

    @ApiOperation("单个插入")
    @PostMapping(value = "/insert")
    public boolean insert(@RequestParam("contentid")@Valid String contentId,
                         @RequestParam("paraid")@Valid String paraId,
                         @RequestParam("paracon")@Valid String paraCon){
        Integer contentid=Integer.parseInt(contentId);
        Integer paraid=Integer.parseInt(paraId);
        String paracon=paraCon;
        Content content=new Content(contentid,paraid,paracon);
        boolean flag=contentService.insert(content);
        return flag;
    }

    @ApiOperation("单个查询")
    @PostMapping(value = "/selectSingle")
    public Content selectSingle(@RequestParam("contentid")@Valid String contentId,
                               @RequestParam("paraid")@Valid String paraId){
        Integer contentid=Integer.parseInt(contentId);
        Integer paraid=Integer.parseInt(paraId);
        Content content=contentService.selectSingle(contentid,paraid);
        return content;
    }

    @ApiOperation("查询所有")
    @PostMapping(value = "/selectAllContent")
    public List<Content> selectAllContent(@RequestParam("contentid")@Valid String contentId){
        Integer contentid=Integer.parseInt(contentId);
        List<Content> list=contentService.selectAllContent(contentid);
        return list;
    }

    @ApiOperation("更新")
    @PostMapping(value = "/update")
    public boolean update(@RequestParam("contentid")@Valid String contentId,
                         @RequestParam("paraid")@Valid String paraId,
                         @RequestParam("paracon")@Valid String paraCon){
        Integer contentid=Integer.parseInt(contentId);
        Integer paraid=Integer.parseInt(paraId);
        String paracon=paraCon;
        Content content=new Content(contentid,paraid,paracon);
        boolean flag=contentService.update(content);
        return flag;
    }
}
