package com.wust.controller;

import com.wust.model.Deal;
import com.wust.service.DealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/Deal")
public class DealController {
    @Autowired
    private DealService dealService;

    @RequestMapping(value = "/deleteByPrimaryKey",method = RequestMethod.GET)
    public boolean deleteByPrimaryKey(@RequestParam("userid")@Valid String userId,
                                     @RequestParam("dealid")@Valid String dealId){
        Integer userid=Integer.parseInt(userId);
        Integer dealid=Integer.parseInt(dealId);
        boolean flag=dealService.deleteByPrimaryKey(userid,dealid);
        return flag;
    }

    @RequestMapping(value = "/insert",method = RequestMethod.GET)
    public boolean insert(@RequestParam("userid")@Valid String userId,
                         @RequestParam("dealid")@Valid String dealId,
                         @RequestParam("dealAmount")@Valid String dealamount,
                         @RequestParam("method")@Valid String Method,
                         @RequestParam("afterWallet")@Valid String afterwallet){
        Integer userid=Integer.parseInt(userId);
        Integer dealid=Integer.parseInt(dealId);
        Integer dealAmount=Integer.parseInt(dealamount);
        String method=Method;
        Integer afterWallet=Integer.parseInt(afterwallet);
        Date dealtime=new Date();
        Deal deal=new Deal(userid,dealid,dealAmount,method,afterWallet,dealtime);
        boolean flag=dealService.insert(deal);
        return flag;
    }

    @RequestMapping(value = "/selectSingle",method = RequestMethod.GET)
    public Deal selectSingle(@RequestParam("userid")@Valid String userId,
                               @RequestParam("dealid")@Valid String dealId){
        Integer userid=Integer.parseInt(userId);
        Integer dealid=Integer.parseInt(dealId);
        Deal deal=dealService.selectSingle(userid,dealid);
        return deal;
    }

    @RequestMapping(value = "/selectAllDeal",method = RequestMethod.GET)
    public List<Deal> selectAllDeal(@RequestParam("userid")@Valid String userId){
        Integer userid=Integer.parseInt(userId);
        List<Deal> list=dealService.selectAllDeal(userid);
        return list;
    }

    @RequestMapping(value = "/update",method = RequestMethod.GET)
    public boolean update(@RequestParam("userid")@Valid String userId,
                         @RequestParam("dealid")@Valid String dealId,
                         @RequestParam("dealAmount")@Valid String dealamount,
                         @RequestParam("method")@Valid String Method,
                         @RequestParam("afterWallet")@Valid String afterwallet){
        Integer userid=Integer.parseInt(userId);
        Integer dealid=Integer.parseInt(dealId);
        Integer dealAmount=Integer.parseInt(dealamount);
        String method=Method;
        Integer afterWallet=Integer.parseInt(afterwallet);
        Date dealtime=new Date();
        Deal deal=new Deal(userid,dealid,dealAmount,method,afterWallet,dealtime);
        boolean flag=dealService.update(deal);
        return flag;
    }
}
