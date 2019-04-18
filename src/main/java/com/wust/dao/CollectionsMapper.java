package com.wust.dao;

import com.wust.model.Collections;
import com.wust.model.CollectionsKey;
import java.util.*;

public interface CollectionsMapper {
    int deleteByPrimaryKey(CollectionsKey key);

    int insert(Collections record);

    int insertSelective(Collections record);

    Collections selectByPrimaryKey(CollectionsKey key);

    List<Collections> selectAllCollections(CollectionsKey key);

    int updateByPrimaryKeySelective(Collections record);

    int updateByPrimaryKey(Collections record);
}