package com.wust.controller;

import com.wust.model.Collections;
import com.wust.service.CollectionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/Collections")
public class CollectionsController {
    @Autowired
    private CollectionsService collectionsService;
    @Autowired
    private HttpServletRequest request;

    @RequestMapping("/")
    public String index(){
        return "/index";
    }

    @RequestMapping("/deleteByPrimaryKey")
    public String deleteByPrimaryKey(){
        Integer userid=Integer.parseInt(request.getParameter("userid"));
        Integer collectionid=Integer.parseInt(request.getParameter("collectionid"));
        collectionsService.deleteByPrimaryKey(userid,collectionid);
        return "/index";
    }

    @RequestMapping("/insert")
    public String insert(){
        Integer userid=Integer.parseInt(request.getParameter("userid"));
        Integer collectionid=Integer.parseInt(request.getParameter("collectionid"));
        Integer moduleid=Integer.parseInt(request.getParameter("moduleid"));
        Integer contentid=Integer.parseInt(request.getParameter("contentid"));
        Collections collections=new Collections(userid,collectionid,moduleid,contentid);
        collectionsService.insert(collections);
        return "/index";
    }

    @RequestMapping("/selectSingle")
    public String selectSingle(){
        Integer userid=Integer.parseInt(request.getParameter("userid"));
        Integer collectionid=Integer.parseInt(request.getParameter("collectionid"));
        collectionsService.selectSingle(userid,collectionid);
        return "/index";
    }

    @RequestMapping("/selectAllCollections")
    public String selectAllCollections(){
        Integer userid=Integer.parseInt(request.getParameter("userid"));
        collectionsService.selectAllCollections(userid);
        return "/index";
    }

    @RequestMapping("/update")
    public String update(){
        Integer userid=Integer.parseInt(request.getParameter("userid"));
        Integer collectionid=Integer.parseInt(request.getParameter("collectionid"));
        Integer moduleid=Integer.parseInt(request.getParameter("moduleid"));
        Integer contentid=Integer.parseInt(request.getParameter("contentid"));
        Collections collections=new Collections(userid,collectionid,moduleid,contentid);
        collectionsService.update(collections);
        return "/index";
    }
}
