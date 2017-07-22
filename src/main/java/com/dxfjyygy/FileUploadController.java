package com.dxfjyygy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by longjinwen on 22/07/2017.
 */
@Controller
public class FileUploadController {

    @RequestMapping("file")
    public String file(){
        return "/file";
    }
    @RequestMapping("mutilFile")
    public String mutilFile(){
        return "/mutilfile";
    }
    @RequestMapping("fileUpload")
    public String upload(@RequestParam("fileName") MultipartFile file){
        System.out.println(file.getOriginalFilename());
        //存放的文件放在F盘上
        String storePath = "F://springBootRes";
        try {
            FileInputStream in = (FileInputStream) file.getInputStream();
           // FileOutputStream os = new FileOutputStream(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "/success";
    }

}
