package cn.zbf.multi.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "cn.zbf.multi")
@MapperScan("cn.zbf.multi.dao.mapper")
public class MultiWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(MultiWebApplication.class, args);
    }

}
