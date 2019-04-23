package com.wust.controller;

import com.wust.model.Collections;
import com.wust.service.CollectionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/Collections")
public class CollectionsController {
    @Autowired
    private CollectionsService collectionsService;



    @RequestMapping(value = "/deleteByPrimaryKey",method =RequestMethod.GET)
    public boolean deleteByPrimaryKey(@RequestParam("userid")@Valid String userId,
                                      @RequestParam("collectionid")@Valid String collectionId){
        Integer userid=Integer.parseInt(userId);
        Integer collectionid=Integer.parseInt(collectionId);
        boolean flag=collectionsService.deleteByPrimaryKey(userid,collectionid);
        return flag;
    }

    @RequestMapping(value = "/insert",method = RequestMethod.GET)
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

    @RequestMapping(value = "/selectSingle",method = RequestMethod.GET)
    public Collections selectSingle(@RequestParam("userid")@Valid String userId,
                               @RequestParam("collectionid")@Valid String collectionId){
        Integer userid=Integer.parseInt(userId);
        Integer collectionid=Integer.parseInt(collectionId);
        Collections collections=collectionsService.selectSingle(userid,collectionid);
        return collections;
    }

    @RequestMapping(value = "/selectAllCollections",method = RequestMethod.GET)
    public List<Collections> selectAllCollections(@RequestParam("userid")@Valid String userId){
        Integer userid=Integer.parseInt(userId);
        List<Collections> list=collectionsService.selectAllCollections(userid);
        return list;
    }

    @RequestMapping(value = "/update",method = RequestMethod.GET)
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
