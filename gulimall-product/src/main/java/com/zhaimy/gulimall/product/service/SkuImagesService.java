package com.zhaimy.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhaimy.common.utils.PageUtils;
import com.zhaimy.gulimall.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author zhaimy
 * @email zhaimy_5@163.com
 * @date 2020-10-17 18:12:21
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

