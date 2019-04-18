package com.wust.service;

import com.wust.model.Collections;
import com.wust.model.CollectionsKey;

import java.util.List;

public interface CollectionsService {
    boolean deleteByPrimaryKey(Integer userid,Integer collectionid);

    boolean insert(Collections collections);

    Collections selectSingle(Integer userid,Integer collectionid);

    List<Collections> selectAllCollections(Integer userid);

    boolean update(Collections collections);
}
