package com.dxfjyygy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;

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
            InputStream in = file.getInputStream();
            // create new file
            String  filePath = storePath+"/"+file.getOriginalFilename();
            File storeFile = new File(filePath);
            if(!storeFile.exists()){
                storeFile.createNewFile();
            }
            BufferedOutputStream os = new BufferedOutputStream(new FileOutputStream(storeFile));
            int cha = 0;
            while ((cha= in.read()) != -1){
                os.write(cha);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return "/success";
    }

}
