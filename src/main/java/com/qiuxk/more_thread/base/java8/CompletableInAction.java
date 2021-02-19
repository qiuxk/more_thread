package com.qiuxk.more_thread.base.java8;


import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

/**
 * Completable各种实际方法
 * 
 * @author qiuxk|qxk1101@163.com
 * @classes com.qiuxk.more_thread.base.java8.CompletableInAction
 * @date 2020-12-14 6:54 下午
 */
public class CompletableInAction {

     /**
       * @description 有异常处理的CompletableFuture方法
       * @param
       * @return
       * @author qiuxk  qxk1101@163.com
       * @date 2020/12/14 6:59 下午
       */
    public Future<Double> getPriceAsync(String product){
        // 一行代码重新如下代码
        // return   CompletableFuture.supplyAsync(()->calculatePrice(product));
        CompletableFuture<Double> futureObject = new CompletableFuture<>();
        new Thread(()->{
            try {
                double price = calculatePrice(product);
                futureObject.complete(price);
            }catch (Exception ex){
                futureObject.completeExceptionally(ex);
            }
        }
        ).start();

        return  futureObject;
    }

    private double calculatePrice(String product){
        return 1.23D;
    }
}
