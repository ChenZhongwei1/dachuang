package com.wust.dao;

import com.wust.model.HomePage;
import java.util.List;

public interface HomePageMapper {
    int deleteByPrimaryKey(Integer contentid);

    int insert(HomePage record);

    int insertSelective(HomePage record);

    HomePage selectByPrimaryKey(Integer contentid);

    List<HomePage> selectAllHomePage( );

    int updateByPrimaryKeySelective(HomePage record);

    int updateByPrimaryKey(HomePage record);
}