package com.zhaimy.gulimall.member.feign;
import com.zhaimy.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

//这里要写在nacos里注册的微服务的名字
@FeignClient("gulimall-coupon")
public interface CouponFeignService {
    //从对应的服务模块中复制需要调用的方法名称到这里，这里的路径名要写完整

    //查询会员的所有优惠券信息
    @RequestMapping("/coupon/coupon/member/list")
    public R memberCoupons();
}
