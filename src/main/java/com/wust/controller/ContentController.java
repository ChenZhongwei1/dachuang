package com.wust.controller;

import com.wust.model.Collections;
import com.wust.model.Content;
import com.wust.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/Content")
public class ContentController {
    @Autowired
    private ContentService contentService;
    @Autowired
    private HttpServletRequest request;

    @RequestMapping("/")
    public String index(){
        return "/index";
    }

    @RequestMapping("/deleteByPrimaryKey")
    public String deleteByPrimaryKey(){
        Integer contentid=Integer.parseInt(request.getParameter("contentid"));
        Integer paraid=Integer.parseInt(request.getParameter("paraid"));
        contentService.deleteByPrimaryKey(contentid,paraid);
        return "/index";
    }

    @RequestMapping("/insert")
    public String insert(){
        Integer contentid=Integer.parseInt(request.getParameter("contentid"));
        Integer paraid=Integer.parseInt(request.getParameter("paraid"));
        String paracon=request.getParameter("paracon");
        Content content=new Content(contentid,paraid,paracon);
        contentService.insert(content);
        return "/index";
    }

    @RequestMapping("/selectSingle")
    public String selectSingle(){
        Integer contentid=Integer.parseInt(request.getParameter("contentid"));
        Integer paraid=Integer.parseInt(request.getParameter("paraid"));
        contentService.selectSingle(contentid,paraid);
        return "/index";
    }

    @RequestMapping("/selectAllContent")
    public String selectAllContent(){
        Integer contentid=Integer.parseInt(request.getParameter("contentid"));
        contentService.selectAllContent(contentid);
        return "/index";
    }

    @RequestMapping("/update")
    public String update(){
        Integer contentid=Integer.parseInt(request.getParameter("contentid"));
        Integer paraid=Integer.parseInt(request.getParameter("paraid"));
        String paracon=request.getParameter("paracon");
        Content content=new Content(contentid,paraid,paracon);
        contentService.update(content);
        return "/index";
    }
}
