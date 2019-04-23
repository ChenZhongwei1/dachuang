package com.wust.service.impl;

import com.wust.dao.HomePageMapper;
import com.wust.model.HomePage;
import com.wust.service.HomePageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("HomePageService")
public class HomePageImpl implements HomePageService {
    @Autowired
    HomePageMapper homepagemapper;

    @Override
    public boolean deleteByContentid(Integer contentid) {
        int i=homepagemapper.deleteByPrimaryKey(contentid);
        if(i>0)
            return true;
        else
            return false;
    }

    @Override
    public boolean insert(HomePage homepage) {
        int i=homepagemapper.insertSelective(homepage);
        if(i>0)
            return true;
        else
            return false;
    }

    @Override
    public HomePage selectByContentid(Integer contentid) {
        HomePage homepage=homepagemapper.selectByPrimaryKey(contentid);
        return homepage;
    }

    @Override
    public List<HomePage> selectByTitle(String title) {
        List<HomePage> list=homepagemapper.selectAllHomePage();
        List<HomePage> l=new ArrayList<>();
        for(int i=0;i<list.size();i++){
            if(list.get(i).getTitle().equals(title))
                l.add(list.get(i));
        }
        return l;
    }

    @Override
    public List<HomePage> selectAllHomePage() {
        List<HomePage> list=homepagemapper.selectAllHomePage();
        return list;
    }

    @Override
    public boolean update(HomePage homepage) {
        int i=homepagemapper.updateByPrimaryKeySelective(homepage);
        if(i>0)
            return true;
        else
            return false;
    }
}
