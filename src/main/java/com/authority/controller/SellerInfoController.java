package com.authority.controller;

import com.authority.model.SellerInfo;
import com.authority.service.impl.SellerInfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: 欧阳正雄
 * @Date: 2018/6/23 0023 04:16
 * @Description:
 */
@Controller
@RequestMapping("/sys/sell")
public class SellerInfoController {

    @Autowired
    private SellerInfoServiceImpl infoService;

    @RequestMapping("/test")
    @ResponseBody
    public String test() {
        List<SellerInfo> sellerInfoList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            SellerInfo sellerInfo = new SellerInfo();
            sellerInfo.setSellerId("11111"+i);
            sellerInfo.setUserName("赵四"+ i);
            sellerInfo.setPassword("12345"+i);
            sellerInfo.setOpenid(""+i);
            sellerInfoList.add(sellerInfo);
        }
        int save = infoService.save(sellerInfoList);

        return save == 1 ? "完成" : "失败";
    }
}
