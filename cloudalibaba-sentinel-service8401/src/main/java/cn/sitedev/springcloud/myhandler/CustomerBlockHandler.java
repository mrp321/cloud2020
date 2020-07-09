package cn.sitedev.springcloud.myhandler;

import cn.sitedev.springcloud.entities.CommonResult;
import com.alibaba.csp.sentinel.slots.block.BlockException;

public class CustomerBlockHandler {
    public static CommonResult handleException(BlockException exception) {
        return new CommonResult(2020, "自定义的限流处理信息...CustomerBlockHandler");
    }
}
