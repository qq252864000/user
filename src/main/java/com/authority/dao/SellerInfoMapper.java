package com.authority.dao;

import com.authority.model.SellerInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Auther: 欧阳正雄
 * @Date: 2018/6/23 0023 03:11
 * @Description:
 */
public interface SellerInfoMapper {

    int save (@Param("sellerInfoList") List<SellerInfo> sellerInfoList);

    int update(@Param("sellerInfoList") List<SellerInfo> sellerInfoList);

}
