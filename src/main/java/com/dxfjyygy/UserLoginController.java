package com.dxfjyygy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by longjinwen on 22/07/2017.
 */
@Controller
public class UserLoginController {
    @RequestMapping(value = "/")
    public String index(){
        return "index"; // 此时会跳转到 resources/index.html文件下
    }
    @RequestMapping("/helloReact")
    public String helloReactJs(){
        return "demo02/index";
    }

    @RequestMapping("/webpackTest")
    public String webpackTest(){
        return "demo02/test";
    }
}
