package com.zhaimy.gulimall.member.dao;

import com.zhaimy.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author zhaimy
 * @email zhaimy_5@163.com
 * @date 2020-10-17 23:40:33
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
