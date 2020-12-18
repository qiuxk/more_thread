package com.qiuxk.more_thread.base.spring;


import com.qiuxk.more_thread.base.service.ICourse;
import com.qiuxk.more_thread.base.service.impl.JavaCourse;
import com.qiuxk.more_thread.base.service.impl.PhpCourse;
import com.qiuxk.more_thread.base.spring.designPattern.FactoryDesign;

/**
 * 设计模式相关的方法
 *
 *
 *
 * @author qiuxk|qxk1101@163.com
 * @classes com.qiuxk.more_thread.base.spring.DesignPattern
 * @date 2020-12-17 5:57 下午
 */
public class DesignPattern {


    public static void main(String[] args) {
        //1.通过工厂模式创建Java的课程
        //todo 这种方式有个问题 没办法使用lambda 考虑如果改造成 直接传入匿名内部类作为参数
        ICourse javaCourse = FactoryDesign.createCourse(JavaCourse.class);
        ICourse phpCourse = FactoryDesign.createCourse(PhpCourse.class);
        javaCourse.record();
        phpCourse.record();
        //2.通过创建课程工厂 工厂创建课程 再调用具体方法
        FactoryDesign.factoryCourse();
    }


}
