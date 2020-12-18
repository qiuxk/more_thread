package com.qiuxk.more_thread.base.service.impl;

import com.qiuxk.more_thread.base.service.ICourse;
import com.qiuxk.more_thread.base.service.ICourseFactory;

/**
 *  创建Java课程的工厂类
 *
 * @author qiuxk|qxk1101@163.com
 * @classes com.qiuxk.more_thread.base.service.impl.JavaCourseFactory
 * @date 2020-12-18 10:15 上午
 */
public class JavaCourseFactory implements ICourseFactory {

    @Override
    public ICourse createCourseFactory() {
        return new JavaCourse();
    }
}
