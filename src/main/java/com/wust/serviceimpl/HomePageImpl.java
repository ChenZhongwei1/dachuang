package com.wust.serviceimpl;

import com.wust.dao.HomePageMapper;
import com.wust.model.HomePage;
import com.wust.service.HomePageService;

import javax.annotation.Resource;
import java.util.*;

public class HomePageImpl implements HomePageService {
    @Resource
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
