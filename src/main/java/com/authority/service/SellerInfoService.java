package com.authority.service;

import com.authority.model.SellerInfo;

import java.util.List;

/**
 * @Auther: 欧阳正雄
 * @Date: 2018/6/23 0023 03:22
 * @Description:
 */
public interface SellerInfoService {

    int save(List<SellerInfo> sellerInfoList);

    int update(List<SellerInfo> sellerInfoList);
}
