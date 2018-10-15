package cn.imzcf.thread;

import java.util.concurrent.Callable;

public class Demo {

    public static void main(String[] args) {

        Runnable runnable = () ->
                System.out.println("哈哈");


        Callable<String> callable = () ->"123";

        try {
            String call = callable.call();
            Thread.sleep(3000);
            runnable.run();
            System.out.println(call);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }


}
