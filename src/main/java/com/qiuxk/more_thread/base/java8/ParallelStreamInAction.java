package com.qiuxk.more_thread.base.java8;

import java.util.concurrent.RecursiveTask;
import java.util.stream.Stream;

/**
 *  并行流相关的测试
 *
 * @author qiuxk|qxk1101@163.com
 * @classes com.qiuxk.more_thread.base.java8.ParallelStreamInAction
 * @date 2020-12-10 9:40 上午
 */
public class ParallelStreamInAction {
    /**
     * 并行处理可以理解为，多个线程各种处理自己的模块，然后计算出来结果，将这个结果再合并到一起返回
     * 并行流中的默认使用Fork/Join框架处理，默认开启的线程数就是处理器的数量(待验证)
     *
     * 并行操作，LongSteam.rangeClosed 可以产生原始类型的数据，可以避免装箱、拆箱的操作
     */


      /**
        * @description 从0到n的累计  并行处理
        * @param
        * @return
        * @author qiuxk  qxk1101@163.com
        * @date 2020/12/10 9:44 上午
        */
    public static  long parallelSum(long n){
       return Stream.iterate(1L,a->a+1).limit(n).parallel().reduce(0L,Long::sum);
    }

}
