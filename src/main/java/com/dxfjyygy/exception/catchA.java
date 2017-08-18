package com.dxfjyygy.exception;

/**
 * Created by longjinwen on 18/08/2017.
 */
public class catchA {
    public void test() {
        try{
            int i=1;
            System.out.println(1/0);
        }catch(Exception e){
            e.printStackTrace();
        }
    }


    public void testCatchThrow1()  throws Exception{
        try{
            int i=1;
            System.out.println(1/0);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void testNotCatchThrow() throws  Exception{
        System.out.println(1/0);
    }
}
