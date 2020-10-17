package com.zhaimy.gulimall.order.dao;

import com.zhaimy.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author zhaimy
 * @email zhaimy_5@163.com
 * @date 2020-10-17 22:56:07
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
