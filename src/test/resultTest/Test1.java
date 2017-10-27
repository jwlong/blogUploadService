package resultTest;

import com.dxfjyygy.aopService.ResultBean;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by longjinwen on 01/09/2017.
 */
public class Test1 {

    @Test
    public void test1(){
        //System.out.println("test1");

   }
   public Map<String,Object> update(){
        Map<String,Object> resultMap = new HashMap<String, Object>();
        //直接模拟update 成功 xxService.updateXx()
        boolean flag = true;
        if(flag){
            resultMap.put("success",flag);
        }else
            resultMap.put("errorMsg","update fail xxx");
        resultMap.put("success",flag);
        return resultMap;
   }
   public ResultBean update2(){
        ResultBean resultBean = new ResultBean();
        return resultBean;
   }
}
