package com.qiuxk.more_thread.base.spring.designPattern;

import com.qiuxk.more_thread.base.service.ICourse;
import com.qiuxk.more_thread.base.service.ICourseFactory;
import com.qiuxk.more_thread.base.service.impl.JavaCourseFactory;
import com.qiuxk.more_thread.base.service.impl.PhpCourseFactory;

/**
 * 工厂模式
 *
 * @author qiuxk|qxk1101@163.com
 * @classes com.qiuxk.more_thread.base.spring.designPattern.SimpleFactory
 * @date 2020-12-17 6:12 下午
 */
public class FactoryDesign {

     /**
      *  简单工厂 设置模式
      *  简单工厂的缺点就是 工厂的职责相对过重，不宜扩展，实现类会过多
      *  传入需要的类的实现类，通过反射获取类的对象，获取实例进行使用
       * @description 创建课程
       * @param
       * @return
       * @author qiuxk  qxk1101@163.com
       * @date 2020/12/18 9:34 上午
       */
    public static ICourse createCourse(Class<? extends  ICourse> clazz){
        try {
            if(null != clazz){
                return  clazz.newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;

    }

     /**
       * @description 需要哪个类 先创建需要的工厂 再通过工厂
       * @param
       * @return
       * @author qiuxk  qxk1101@163.com
       * @date 2020/12/18 10:23 上午
       */
    public static void factoryCourse(){
        ICourseFactory javaCourseFactory = new JavaCourseFactory();
        ICourse javaCourse = javaCourseFactory.createCourseFactory();
        javaCourse.record();

        ICourseFactory phpCourseFactory = new PhpCourseFactory();
        ICourse phpCourse = phpCourseFactory.createCourseFactory();
        phpCourse.record();

    }

}
