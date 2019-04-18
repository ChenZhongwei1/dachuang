package com.wust.dao;

import com.wust.model.Deal;
import com.wust.model.DealKey;
import java.util.*;

public interface DealMapper {
    int deleteByPrimaryKey(DealKey key);

    int insert(Deal record);

    int insertSelective(Deal record);

    Deal selectByPrimaryKey(DealKey key);

    List<Deal> selectAllDeal(DealKey key);

    int updateByPrimaryKeySelective(Deal record);

    int updateByPrimaryKey(Deal record);
}