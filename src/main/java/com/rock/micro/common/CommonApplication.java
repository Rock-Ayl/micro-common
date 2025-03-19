package com.rock.micro.common;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

//开启注解 @Async
@EnableAsync
//开启注解 @Scheduled
@EnableScheduling
//MyBatis-Plus扫描所有mapper路径
@MapperScan("com.rock.micro.common.mapper")
//启动程序注解
@SpringBootApplication(scanBasePackages = {"com.rock.micro"})
public class CommonApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommonApplication.class, args);
    }

}