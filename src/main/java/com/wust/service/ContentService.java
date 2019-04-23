package com.wust.service;

import com.wust.model.Content;
import com.wust.model.ContentKey;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ContentService {
    boolean deleteByPrimaryKey(Integer contentid,Integer paraid);

    boolean  insert(Content content);

    Content selectSingle(Integer contentid,Integer paraid);

    List<Content> selectAllContent(Integer contentid);

    boolean  update(Content content);

}
