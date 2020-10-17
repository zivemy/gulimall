package com.zhaimy.gulimall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zhaimy.gulimall.product.entity.BrandEntity;
import com.zhaimy.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class GulimallProductApplicationTests {

    @Resource
    private BrandService brandService;

    @Test
    void contextLoads() {
        /*BrandEntity brandEntity = new BrandEntity();
        brandEntity.setBrandId(1L);
        brandEntity.setName("华为");
        brandEntity.setDescript("中华有为");
        brandEntity.setShowStatus(1);*/

      /*  boolean b = brandService.updateById(brandEntity);

        if (b=true){
            System.out.println("更新成功");
        }else {
            System.out.println("更新失败");
        }*/

        List<BrandEntity> brand_id = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        for (BrandEntity brandEntity : brand_id) {
            System.out.println(brandEntity);
        }

    }

}
