package com.qiuxk.more_thread.base.java8;

import com.qiuxk.more_thread.base.model.Apple;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Stream中各种操作
 *
 * @author qiuxk|qxk1101@163.com
 * @classes com.qiuxk.more_thread.base.java8.StreamInAction
 * @date 2020-12-08 11:33 上午
 */
public class StreamInAction {

    /**
     * flatMap方法是把一个流中的每个值都转成另一个流，然后把所有的流连接起来成为一个流
     *
     * @param
     * @return
     * @author qiuxk  qxk1101@163.com
     * @date 2020/12/8 11:34 上午
     */
    public void flatMap() {
        String[] arrayWord = {"Goodbye", "World"};
        Stream<String> stream = Arrays.stream(arrayWord);
        List<Stream<String>> collect = stream.map(word -> word.split("")).map(Arrays::stream).distinct().collect(Collectors.toList());
        List<String> result = stream.map(word -> word.split("")).flatMap(Arrays::stream).distinct().collect(Collectors.toList());
    }

    /**
     * 创建流的方法
     *
     * @param
     * @return
     * @author qiuxk  qxk1101@163.com
     * @date 2020/12/9 9:09 上午
     */
    public void createStream() {
        //创建无限流的方法 必须用limit限制 两个方法的参数不同
        Stream.iterate(0, a -> a + 2).limit(10).forEach(System.out::println);
        Stream.generate(Math::random).forEach(System.out::println);
    }


     /**
       * @description 对集合进行排序
       * @param
       * @return
       * @author qiuxk  qxk1101@163.com
       * @date 2020/12/14 5:26 下午
       */
    public List<Apple> sortList(List<Apple> list){
        //这种写法不支持a1，a2的写法
       //list.stream().sorted((a1,a2)->a1.getWeight());
        /**方法1**/
        list.stream().sorted(Comparator.comparing(Apple::getColor));
        /**方法2**/
        list.sort((a1,a2)-> a1.getWeight()-a2.getWeight());
        list.sort(Comparator.comparingInt(Apple::getWeight));

        /**方法3 多字段排序 颜色相同时 根据名字排序**/
        list.sort(Comparator.comparing(Apple::getColor).thenComparing(Apple::getName));
        return list;
    }

    public void collect() {
        //Collector比较器  Comparator比较器 compare比较
        // Collectors  中多是静态方法(工厂方法) 多数方法返回Collector接口的实现类 例如常用的Collectors.toList() Collector可以理解为收集器
        //传入比较器  获取最大/最小值  ps: 创建比较器的方法 返回一个Comparator接口Comparator.comparing() Comparator.comparingInt()等
        //Collectors.maxBy()
        // Collectors.minBy()

        /**2.以下是累加器**/
        //Collectors.summingDouble()
        //Collectors.summingInt()
        //Collectors.summingLong()
        /**3.以下是求平均值**/
        //Collectors.averagingDouble()
        //Collectors.averagingInt()
        //Collectors.averagingLong()
        /**4.连接字符串**/
       // Collectors.joining() 有参 无参
        /**5.分组**/
       // 实现一级分组 Collectors.groupingBy()//参数是function
        //实现二级分组
       // Collectors.groupingBy() //参数是Function Collector  第二个参数又可以传入一个收集器进行分组
       // Collectors.groupingBy(null,Collectors.counting());
        //Collectors.collectingAndThen(Collectors.maxBy(), Optional::get);

        /**6.分区函数 符合条件的分一组  不符合条件的分到另一组 返回结果都是Map<Object,List></>**/
        //Collectors.partitioningBy() 参数本身也是Predicate
        //Collectors.partitioningBy() Predicate 和 Collector可以实现多级分组


    }

    public static void main(String[] args) {
        int b = 3;
        List<int[]> collect = IntStream.rangeClosed(1, 100).filter(a -> Math.sqrt(a * a + b * b) == 0).mapToObj(a -> new int[]{a, b, (int) Math.sqrt(a * a + b * b)}).collect(Collectors.toList());

    }

}
