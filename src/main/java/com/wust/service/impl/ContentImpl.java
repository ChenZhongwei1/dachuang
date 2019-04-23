package com.wust.service.impl;

import com.wust.dao.ContentMapper;
import com.wust.model.Content;
import com.wust.model.ContentKey;
import com.wust.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ContentService")
public class ContentImpl implements ContentService {
    @Autowired
    ContentMapper contentmapper;

    @Override
    public boolean deleteByPrimaryKey(Integer contentid, Integer paraid) {
        ContentKey contentKey=new ContentKey(contentid,paraid);
        int i=contentmapper.deleteByPrimaryKey(contentKey);
        if(i>0)
            return true;
        else
            return false;
    }

    @Override
    public boolean insert(Content content) {
        int i=contentmapper.insertSelective(content);
        if(i>0)
            return true;
        else
            return false;
    }

    @Override
    public Content selectSingle(Integer contentid, Integer paraid) {
        ContentKey contentKey=new ContentKey(contentid,paraid);
        Content content=contentmapper.selectByPrimaryKey(contentKey);
        return content;
    }

    @Override
    public List<Content> selectAllContent(Integer contentid) {
        ContentKey contentKey=new ContentKey(contentid,null);
        List<Content> list=contentmapper.selectAllContent(contentKey);
        return list;
    }

    @Override
    public boolean update(Content content) {
        int i=contentmapper.updateByPrimaryKeySelective(content);
        if(i>0)
            return true;
        else
            return false;
    }
}
