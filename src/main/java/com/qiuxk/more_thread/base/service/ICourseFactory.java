package com.qiuxk.more_thread.base.service;


/**
 *  课程的工厂类  创建其他课程的工厂类
 *
 * @author qiuxk|qxk1101@163.com
 * @classes com.qiuxk.more_thread.base.service.ICourseFactory
 * @date 2020-12-18 10:11 上午
 */
public interface ICourseFactory {

      /**
        * @description 创建 课程工厂
        * @param
        * @return
        * @author qiuxk  qxk1101@163.com
        * @date 2020/12/18 10:13 上午
        */
     ICourse createCourseFactory();
}
