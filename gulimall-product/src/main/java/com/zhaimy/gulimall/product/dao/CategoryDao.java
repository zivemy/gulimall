package com.zhaimy.gulimall.product.dao;

import com.zhaimy.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author zhaimy
 * @email zhaimy_5@163.com
 * @date 2020-10-17 18:12:22
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
