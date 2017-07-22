package com.dxfjyygy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by longjinwen on 22/07/2017.
 */
//@SpringBootApplication注解等价于使用
// @Configuration,@EnableAutoConfiguration
// 和@ComponentScan的默认属性(也可以进行自定义属性):


//@Controller
//@EnableAutoConfiguration
@SpringBootApplication
public class HelloSringBoot {
    public static void main(String[] args) {
        SpringApplication.run(HelloSringBoot.class,args);
    }
}
