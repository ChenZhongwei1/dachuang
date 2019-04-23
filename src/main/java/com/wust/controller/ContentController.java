package com.wust.controller;

import com.wust.model.Collections;
import com.wust.model.Content;
import com.wust.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/Content")
public class ContentController {
    @Autowired
    private ContentService contentService;

    @RequestMapping(value = "/deleteByPrimaryKey",method = RequestMethod.GET)
    public boolean deleteByPrimaryKey(@RequestParam("contentid")@Valid String contentId,
                                     @RequestParam("paraid")@Valid String paraId){
        Integer contentid=Integer.parseInt(contentId);
        Integer paraid=Integer.parseInt(paraId);
        boolean flag=contentService.deleteByPrimaryKey(contentid,paraid);
        return flag;
    }

    @RequestMapping(value = "/insert",method = RequestMethod.GET)
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

    @RequestMapping(value = "/selectSingle",method = RequestMethod.GET)
    public Content selectSingle(@RequestParam("contentid")@Valid String contentId,
                               @RequestParam("paraid")@Valid String paraId){
        Integer contentid=Integer.parseInt(contentId);
        Integer paraid=Integer.parseInt(paraId);
        Content content=contentService.selectSingle(contentid,paraid);
        return content;
    }

    @RequestMapping(value = "/selectAllContent",method = RequestMethod.GET)
    public List<Content> selectAllContent(@RequestParam("contentid")@Valid String contentId){
        Integer contentid=Integer.parseInt(contentId);
        List<Content> list=contentService.selectAllContent(contentid);
        return list;
    }

    @RequestMapping(value = "/update",method = RequestMethod.GET)
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
