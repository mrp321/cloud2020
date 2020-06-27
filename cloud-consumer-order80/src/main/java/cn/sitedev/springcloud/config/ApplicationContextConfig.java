package cn.sitedev.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationContextConfig {

//    @LoadBalanced // 暂时去除该注解,以测试自定义的负载均衡器
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
