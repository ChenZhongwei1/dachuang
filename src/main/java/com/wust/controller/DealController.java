package com.wust.controller;

import com.wust.model.Deal;
import com.wust.service.DealService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@RestController
@EnableSwagger2
@RequestMapping("api/Deal")
@Api(value = "Deal",description = "用户充值表")
public class DealController {
    @Autowired
    private DealService dealService;

    @ApiOperation(value ="单个删除")
    @PostMapping(value ="/deleteByPrimaryKey")
    public boolean deleteByPrimaryKey(@RequestParam("userid")@Valid String userId,
                                     @RequestParam("dealid")@Valid String dealId){
        Integer userid=Integer.parseInt(userId);
        Integer dealid=Integer.parseInt(dealId);
        boolean flag=dealService.deleteByPrimaryKey(userid,dealid);
        return flag;
    }

    @ApiOperation(value ="单个插入")
    @PostMapping(value ="/insert")
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

    @ApiOperation(value ="单个查询")
    @PostMapping(value ="/selectSingle")
    public Deal selectSingle(@RequestParam("userid")@Valid String userId,
                               @RequestParam("dealid")@Valid String dealId){
        Integer userid=Integer.parseInt(userId);
        Integer dealid=Integer.parseInt(dealId);
        Deal deal=dealService.selectSingle(userid,dealid);
        return deal;
    }

    @ApiOperation("查询所有")
    @PostMapping(value = "/selectAllDeal")
    public List<Deal> selectAllDeal(@RequestParam("userid")@Valid String userId){
        Integer userid=Integer.parseInt(userId);
        List<Deal> list=dealService.selectAllDeal(userid);
        return list;
    }

    @ApiOperation("更新")
    @PostMapping(value = "/update")
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
