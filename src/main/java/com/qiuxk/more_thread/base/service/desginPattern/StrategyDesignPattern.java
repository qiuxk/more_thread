package com.qiuxk.more_thread.base.service.desginPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 策略模式
 *
 * @author qiuxk|qxk1101@163.com
 * @classes com.qiuxk.more_thread.base.service.desginPattern.StrategyDesignPattern
 * @date 2021-03-27 4:01 下午
 */
public class StrategyDesignPattern {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        String s = list.get(3);
        if(null == s){
            System.out.println("list is null");
        }
    }


}
