package com.zhaimy.gulimall.coupon.dao;

import com.zhaimy.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author zhaimy
 * @email zhaimy_5@163.com
 * @date 2020-10-17 23:45:37
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
