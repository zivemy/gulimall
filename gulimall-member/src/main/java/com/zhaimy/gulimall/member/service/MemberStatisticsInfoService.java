package com.zhaimy.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhaimy.common.utils.PageUtils;
import com.zhaimy.gulimall.member.entity.MemberStatisticsInfoEntity;

import java.util.Map;

/**
 * 会员统计信息
 *
 * @author zhaimy
 * @email zhaimy_5@163.com
 * @date 2020-10-17 23:40:33
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}
