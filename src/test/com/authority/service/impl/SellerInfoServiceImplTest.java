package com.authority.service.impl;

import com.authority.model.SellerInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Auther: 欧阳正雄
 * @Date: 2018/6/23 0023 03:30
 * @Description:
 */
//整合junit和spring，让junit在启动时候加载springIOC容器
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring的配置文件,需要用到的配置文件，如果是dao的话可以不用spring-service.xml
@ContextConfiguration({ "classpath:applicationContext.xml"})
public class SellerInfoServiceImplTest {

    @Autowired
    private SellerInfoServiceImpl infoService;

    @Test
    public void save() {
        List<SellerInfo> sellerInfoList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            SellerInfo sellerInfo = new SellerInfo();
            sellerInfo.setSellerId("11111"+i);
            sellerInfo.setUserName("赵四1"+ i);
            sellerInfo.setPassword("12345"+i);
            sellerInfo.setOpenid(""+i);
            sellerInfoList.add(sellerInfo);
        }
        int save = infoService.save(sellerInfoList);
        if (save == 1) {
            System.out.print("完成");
        } else {
            System.out.print("失败");
        }


    }

    @Test
    public void update() {
        List<SellerInfo> sellerInfoList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            SellerInfo sellerInfo = new SellerInfo();
            sellerInfo.setSellerId("11111"+i);
            sellerInfo.setUserName("Mr zhang"+ i);
            sellerInfo.setPassword("66666"+i);
            sellerInfo.setOpenid("999"+i);
            sellerInfoList.add(sellerInfo);
        }
        int save = infoService.update(sellerInfoList);
        Assert.assertTrue("成功",save > 0);
    }
}