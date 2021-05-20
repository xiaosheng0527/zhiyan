package edu.ptu.zhiyan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class ZhiyanApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZhiyanApplication.class, args);
    }

}
