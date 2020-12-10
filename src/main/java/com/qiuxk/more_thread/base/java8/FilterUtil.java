package com.qiuxk.more_thread.base.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 根据Java8实战 练习方法
 *
 * @author qiuxk|qxk1101@163.com
 * @classes com.qiuxk.more_thread.base.java8.FilterUtil
 * @date 2020-12-04 4:09 下午
 */
public class FilterUtil {
     /**
       * 筛选符合条件的集合
       * @param  list 要处理的集合
       * @param  p 是判断条件 把具体的动作 封装到这个实现类中
       * @return List<T></>
       * @author qiuxk  qxk1101@163.com
       * @date 2020/12/4 4:19 下午
       */
    public static <T> List<T> filter(List<T> list, Predicate<T> p){
       return list.stream().filter(p).collect(Collectors.toList());
    }

     /**
       * 对集合进行排序
       * @param list 要处理的集合
       * @param  comparator 传入比较器
       * @return
       * @author qiuxk  qxk1101@163.com
       * @date 2020/12/4 4:48 下午
       */
    public static <T> List<T> sort(List<T> list, Comparator<T> comparator){
        list.stream().sorted(comparator);
        return list;
    }
     /**
       * 对集合进行筛选然后进行排序
       * @param list 要处理的集合
       * @param p 是判断条件 把具体的动作 封装到这个实现类中
       * @param comparator 传入比较器
       * @return
       * @author qiuxk  qxk1101@163.com
       * @date 2020/12/4 4:50 下午
       */
    public static <T> List<T> filterAndSort(List<T> list,Predicate<T> p,Comparator<T> comparator){
      return   list.stream().filter(p).sorted(comparator).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        //flatMap方法是把一个流中的每个值都转成另一个流，然后把所有的流连接起来成为一个流
       String[] arrayWord=  {"Goodbye","World"};
        Stream<String> stream = Arrays.stream(arrayWord);
        List<Stream<String>> collect = stream.map(word -> word.split("")).map(Arrays::stream).distinct().collect(Collectors.toList());
        List<String> result = stream.map(word -> word.split("")).flatMap(Arrays::stream).distinct().collect(Collectors.toList());

    }
}
