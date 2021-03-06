package com.wust.service.impl;

import com.wust.dao.DealMapper;
import com.wust.model.Deal;
import com.wust.model.DealKey;
import com.wust.service.DealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("DealService")
public class DealImpl implements DealService {
    @Autowired
    DealMapper dealmapper;

    @Override
    public boolean deleteByPrimaryKey(Integer userid, Integer dealid) {
        DealKey dealKey=new DealKey(userid,dealid);
        int i=dealmapper.deleteByPrimaryKey(dealKey);
        if(i>0)
            return true;
        else
            return false;
    }

    @Override
    public boolean insert(Deal deal) {
        int i=dealmapper.insertSelective(deal);
        if(i>0)
            return true;
        else
            return false;
    }

    @Override
    public Deal selectSingle(Integer userid, Integer dealid) {
        DealKey dealKey=new DealKey(userid,dealid);
        Deal deal=dealmapper.selectByPrimaryKey(dealKey);
        return deal;
    }

    @Override
    public List<Deal> selectAllDeal(Integer userid) {
        DealKey dealKey=new DealKey(userid,null);
        List<Deal> list=dealmapper.selectAllDeal(dealKey);
        return list;
    }

    @Override
    public boolean update(Deal deal) {
        int i=dealmapper.updateByPrimaryKeySelective(deal);
        if(i>0)
            return true;
        else
            return false;
    }
}
