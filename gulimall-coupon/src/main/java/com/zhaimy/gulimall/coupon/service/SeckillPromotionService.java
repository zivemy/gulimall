package com.zhaimy.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhaimy.common.utils.PageUtils;
import com.zhaimy.gulimall.coupon.entity.SeckillPromotionEntity;

import java.util.Map;

/**
 * 秒杀活动
 *
 * @author zhaimy
 * @email zhaimy_5@163.com
 * @date 2020-10-17 23:45:37
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

