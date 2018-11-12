package club.zhongd.easy_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"club.zhongd.easy_client.service.remote"})
@ComponentScan(basePackages = {"club.zhongd","club.zhongd.easy_client.service.remote"})
public class EasyClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EasyClientApplication.class, args);
    }
}
