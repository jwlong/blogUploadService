import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by longjinwen on 22/07/2017.
 */
public class TestInputStream {
    @Test
    public  void test1() throws IOException {
        System.out.println("hello");
        String path = "F://springBootRes";
        File file = new File(path);

        if(file.isDirectory()){
                // 再创建一个txt文件 并往里面随便写几个字符
            String fileName = "testTxt"; //如果 这样就直接 写到class path下了，不太好
            String fileNamePath = path+"/"+fileName+".txt";
            File txtFile = new File(fileNamePath);
            FileOutputStream outputStream = null;
            if(!txtFile.exists()){
                //创建了txt 文件 成功
                if(txtFile.createNewFile()){
                    //再往里面去写内容
                    outputStream = new FileOutputStream(txtFile);
                    String needWriteStr = "testsetsetset";
                    String chineseStr = "添加中文试试";
                    String str = needWriteStr+chineseStr;
                    outputStream.write(str.getBytes("utf-8"));
                }
            }{
                //已经存在的情况
                //追加内容
                outputStream = new FileOutputStream(txtFile);
                //就是在定位到已经有文件内容的结尾再加
//                while(file.re)
//                outputStream.write();
                //替换内容

            }
        }
      //  FileInputStream fileInputStream = new FileInputStream()
    }
}
