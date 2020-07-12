package cn.sitedev.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"cn.sitedev.springcloud.alibaba.dao"})
public class MyBatisConfig {

}
