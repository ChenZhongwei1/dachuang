package com.wust.controller;

import com.wust.model.Deal;
import com.wust.service.DealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Controller
@RequestMapping("/Deal")
public class DealController {
    @Autowired
    private DealService dealService;
    @Autowired
    private HttpServletRequest request;

    @RequestMapping("/")
    public String index(){
        return "/index";
    }

    @RequestMapping("/deleteByPrimaryKey")
    public String deleteByPrimaryKey(){
        Integer userid=Integer.parseInt(request.getParameter("userid"));
        Integer dealid=Integer.parseInt(request.getParameter("dealid"));
        dealService.deleteByPrimaryKey(userid,dealid);
        return "/index";
    }

    @RequestMapping("/insert")
    public String insert(){
        Integer userid=Integer.parseInt(request.getParameter("userid"));
        Integer dealid=Integer.parseInt(request.getParameter("dealid"));
        Integer dealAmount=Integer.parseInt(request.getParameter("dealAmount"));
        String method=request.getParameter("method");
        Integer afterWallet=Integer.parseInt(request.getParameter("afterWallet"));
        Date dealtime=new Date();
        Deal deal=new Deal(userid,dealid,dealAmount,method,afterWallet,dealtime);
        dealService.insert(deal);
        return "/index";
    }

    @RequestMapping("/selectSingle")
    public String selectSingle(){
        Integer userid=Integer.parseInt(request.getParameter("userid"));
        Integer dealid=Integer.parseInt(request.getParameter("dealid"));
        dealService.selectSingle(userid,dealid);
        return "/index";
    }

    @RequestMapping("/selectAllDeal")
    public String selectAllDeal(){
        Integer userid=Integer.parseInt(request.getParameter("userid"));
        dealService.selectAllDeal(userid);
        return "/index";
    }

    @RequestMapping("/update")
    public String update(){
        Integer userid=Integer.parseInt(request.getParameter("userid"));
        Integer dealid=Integer.parseInt(request.getParameter("dealid"));
        Integer dealAmount=Integer.parseInt(request.getParameter("dealAmount"));
        String method=request.getParameter("method");
        Integer afterWallet=Integer.parseInt(request.getParameter("afterWallet"));
        Date dealtime=new Date();
        Deal deal=new Deal(userid,dealid,dealAmount,method,afterWallet,dealtime);
        dealService.update(deal);
        return "/index";
    }
}
