package com.authority.service.impl;

import com.authority.dao.SellerInfoMapper;
import com.authority.model.SellerInfo;
import com.authority.service.SellerInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: 欧阳正雄
 * @Date: 2018/6/23 0023 03:23
 * @Description:
 */
@Service
public class SellerInfoServiceImpl implements SellerInfoService {

    @Autowired
    private SellerInfoMapper infoMapper;

    @Override
    public int save(List<SellerInfo> sellerInfoList) {
        return infoMapper.save(sellerInfoList);
    }

    @Override
    public int update(List<SellerInfo> sellerInfoList) {
        return infoMapper.update(sellerInfoList);
    }
}
