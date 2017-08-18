package com.dxfjyygy.exception;

import org.junit.Test;

/**
 * Created by longjinwen on 18/08/2017.
 */
public class ExceptionTest {

    @org.junit.Test
    public void test1(){
       try {
           new catchA().test();
       }catch (Exception e){
           e.printStackTrace();
           System.out.println("came in");
           System.out.println(e.getMessage());
       }

    }


    @Test
    public void test2(){
        try {
            //这里虽然方法是throw 异常了，但是在方法体里捕捉了异常，在这时仍然不会抛回给调用者
            //想要抛回给调用者，得不进行捕捉直接抛出
            new catchA().testCatchThrow1();
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("came in");
            System.out.println(e.getMessage());
        }
    }


    @Test
    public void test3(){
        try {
            // 此时的就异常就直接抛出了。
            new catchA().testNotCatchThrow();
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("came in");
            System.out.println(e.getMessage());
        }
    }

}
