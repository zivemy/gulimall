package com.zhaimy.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhaimy.common.utils.PageUtils;
import com.zhaimy.gulimall.ware.entity.WareOrderTaskDetailEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author zhaimy
 * @email zhaimy_5@163.com
 * @date 2020-10-17 23:24:47
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

