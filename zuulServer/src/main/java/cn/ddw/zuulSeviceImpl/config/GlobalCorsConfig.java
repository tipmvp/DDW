package cn.ddw.zuulSeviceImpl.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * @author ZYF
 * @date 2019/6/13 16:19
 * @Description :
 */

@Configuration
public class GlobalCorsConfig {


    @Bean
    public CorsFilter corsFilter(){
        CorsConfiguration cors = new CorsConfiguration();
        /// 允许向该服务器提交请求的URI，*表示全部允许
        cors.addAllowedOrigin("*");
        //是否发送cookie信息
        cors.setAllowCredentials(true);
        //允许的请求方式
        cors.addAllowedMethod("OPTIONS");
        cors.addAllowedMethod("HEAD");
        cors.addAllowedMethod("GET");
        cors.addAllowedMethod("PUT");
        cors.addAllowedMethod("POST");
        cors.addAllowedMethod("DELETE");
        cors.addAllowedMethod("PATCH");
        //允许的头信息
        cors.addAllowedHeader("*");
        // 预检请求的缓存时间（秒），即在这个时间段里，对于相同的跨域请求不会再预检了
        cors.setMaxAge(18000L);

        //添加映射路径，拦截一切请求
        UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
        urlBasedCorsConfigurationSource.registerCorsConfiguration("/**",cors);

        //返回新的CorsFilter
        return new CorsFilter(urlBasedCorsConfigurationSource);
    }

}
