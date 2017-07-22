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
        return "file"; // 此时会跳转到 resources/file.html文件下
    }
}
