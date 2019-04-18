package com.wust.serviceimpl;

import com.wust.dao.CollectionsMapper;
import com.wust.model.Collections;
import com.wust.model.CollectionsKey;
import com.wust.service.CollectionsService;

import javax.annotation.Resource;
import java.util.List;

public class CollectionsImpl implements CollectionsService {
    @Resource
    CollectionsMapper collectionsmapper;

    @Override
    public boolean deleteByPrimaryKey(Integer userid, Integer collectionid) {
        CollectionsKey collectionsKey=new CollectionsKey(userid,collectionid);
        int i=collectionsmapper.deleteByPrimaryKey(collectionsKey);
        if(i>0)
            return true;
        else
            return false;
    }

    @Override
    public boolean insert(Collections collections) {
        int i=collectionsmapper.insertSelective(collections);
        if(i>0)
            return true;
        else
            return false;
    }

    @Override
    public Collections selectSingle(Integer userid, Integer collectionid) {
        CollectionsKey collectionsKey=new CollectionsKey(userid,collectionid);
        Collections collections=collectionsmapper.selectByPrimaryKey(collectionsKey);
        return collections;
    }

    @Override
    public List<Collections> selectAllCollections(Integer userid) {
        CollectionsKey collectionsKey=new CollectionsKey(userid,null);
        List<Collections> list=collectionsmapper.selectAllCollections(collectionsKey);
        return list;
    }

    @Override
    public boolean update(Collections collections) {
        int i=collectionsmapper.updateByPrimaryKeySelective(collections);
        if(i>0)
            return true;
        else
            return false;
    }
}
