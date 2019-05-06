package com.wust.controller;

import com.wust.model.Collections;
import com.wust.service.CollectionsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.validation.Valid;
import java.util.List;

@RestController
@EnableSwagger2
@RequestMapping("api/Collections")
@Api(value = "Collections",description = "用户收藏表")
public class CollectionsController {
    @Autowired
    private CollectionsService collectionsService;


    @ApiOperation(value ="单个删除")
    @PostMapping(value ="/deleteByPrimaryKey")
    public boolean deleteByPrimaryKey(@RequestParam("userid")@Valid String userId,
                                      @RequestParam("collectionid")@Valid String collectionId){
        Integer userid=Integer.parseInt(userId);
        Integer collectionid=Integer.parseInt(collectionId);
        boolean flag=collectionsService.deleteByPrimaryKey(userid,collectionid);
        return flag;
    }

    @ApiOperation(value ="单个插入")
    @PostMapping(value ="/insert")
    public boolean insert(@RequestParam("userid")@Valid String userId,
                          @RequestParam("collectionid")@Valid String collectionId,
                          @RequestParam("moduleid")@Valid String moduleId,
                          @RequestParam("contentid")@Valid String contentId){
        Integer userid=Integer.parseInt(userId);
        Integer collectionid=Integer.parseInt(collectionId);
        Integer moduleid=Integer.parseInt(moduleId);
        Integer contentid=Integer.parseInt(contentId);
        Collections collections=new Collections(userid,collectionid,moduleid,contentid);
        boolean flag=collectionsService.insert(collections);
        return flag;
    }

    @ApiOperation(value ="单个查询")
    @PostMapping(value ="/selectSingle")
    public Collections selectSingle(@RequestParam("userid")@Valid String userId,
                               @RequestParam("collectionid")@Valid String collectionId){
        Integer userid=Integer.parseInt(userId);
        Integer collectionid=Integer.parseInt(collectionId);
        Collections collections=collectionsService.selectSingle(userid,collectionid);
        return collections;
    }

    @ApiOperation(value ="查询所有")
    @PostMapping(value ="/selectAllCollections")
    public List<Collections> selectAllCollections(@RequestParam("userid")@Valid String userId){
        Integer userid=Integer.parseInt(userId);
        List<Collections> list=collectionsService.selectAllCollections(userid);
        return list;
    }

    @ApiOperation(value ="更新")
    @PostMapping(value ="/update")
    public boolean update(@RequestParam("userid")@Valid String userId,
                         @RequestParam("collectionid")@Valid String collectionId,
                         @RequestParam("moduleid")@Valid String moduleId,
                         @RequestParam("contentid")@Valid String contentId){
        Integer userid=Integer.parseInt(userId);
        Integer collectionid=Integer.parseInt(collectionId);
        Integer moduleid=Integer.parseInt(moduleId);
        Integer contentid=Integer.parseInt(contentId);
        Collections collections=new Collections(userid,collectionid,moduleid,contentid);
        boolean flag=collectionsService.update(collections);
        return flag;
    }
}
