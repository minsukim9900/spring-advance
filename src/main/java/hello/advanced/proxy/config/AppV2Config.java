package hello.advanced.proxy.config;

import hello.advanced.proxy.app.v2.OrderRepositoryV2;
import hello.advanced.proxy.app.v2.OrderServiceV2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppV2Config {

    @Bean
    public OrderServiceV2 proxyOrderServiceV2() {
        return new OrderServiceV2(proxyOrderRepositoryV2());
    }

    @Bean
    public OrderRepositoryV2 proxyOrderRepositoryV2() {
        return new OrderRepositoryV2();
    }
}
