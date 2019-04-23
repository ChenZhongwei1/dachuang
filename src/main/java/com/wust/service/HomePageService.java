package com.wust.service;

import com.wust.model.HomePage;
import org.springframework.stereotype.Service;

import java.util.List;


public interface HomePageService {
    boolean deleteByContentid(Integer contentid);

    boolean insert(HomePage homepage);

    HomePage selectByContentid(Integer contentid);

    List<HomePage> selectByTitle(String title);

    List<HomePage> selectAllHomePage( );

    boolean update(HomePage homepage);
}
