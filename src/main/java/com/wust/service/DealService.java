package com.wust.service;

import com.wust.model.Deal;
import org.springframework.stereotype.Service;

import java.util.List;


public interface DealService {
    boolean deleteByPrimaryKey(Integer userid,Integer dealid);

    boolean insert(Deal deal);

    Deal selectSingle(Integer userid,Integer dealid);

    List<Deal> selectAllDeal(Integer userid);

    boolean update(Deal deal);
}
