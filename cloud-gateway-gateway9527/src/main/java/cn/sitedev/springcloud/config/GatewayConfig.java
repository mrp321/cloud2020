package cn.sitedev.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {
    /**
     * 配置了一个id为path_route_sitedev的路由规则,
     * <p>
     * 当访问http://localhost:9527/guonei时, 会自动转发到地址https://news.baidu.com/guonei
     *
     * @param routeLocatorBuilder
     * @return
     */
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("path_route_sitedev", r -> r.path("/guonei").uri("https://news.baidu.com/guonei")).build();
        return routes.build();
    }

    @Bean
    public RouteLocator customRouteLocator2(RouteLocatorBuilder routeLocatorBuilder) {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("path_route_sitedev2", r -> r.path("/guoji").uri("https://news.baidu.com/guoji")).build();
        return routes.build();
    }
}
