package com.wust.dao;

import com.wust.model.Content;
import com.wust.model.ContentKey;
import java.util.*;

public interface ContentMapper {
    int deleteByPrimaryKey(ContentKey key);

    int insert(Content record);

    int insertSelective(Content record);

    Content selectByPrimaryKey(ContentKey key);

    List<Content> selectAllContent(ContentKey key);

    int updateByPrimaryKeySelective(Content record);

    int updateByPrimaryKeyWithBLOBs(Content record);
}