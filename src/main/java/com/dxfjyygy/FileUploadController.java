package com.dxfjyygy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by longjinwen on 22/07/2017.
 */
@Controller
public class FileUploadController {

    @RequestMapping("file")
    public String file(){
        return "/file";
    }

    @RequestMapping("fileUpload")
    public String upload(@RequestParam("fileName") MultipartFile file){
        System.out.println(file.getOriginalFilename());
        return "/success";
    }

}
