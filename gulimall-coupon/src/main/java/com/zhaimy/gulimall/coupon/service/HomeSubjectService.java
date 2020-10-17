package com.zhaimy.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhaimy.common.utils.PageUtils;
import com.zhaimy.gulimall.coupon.entity.HomeSubjectEntity;

import java.util.Map;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author zhaimy
 * @email zhaimy_5@163.com
 * @date 2020-10-17 23:45:37
 */
public interface HomeSubjectService extends IService<HomeSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

