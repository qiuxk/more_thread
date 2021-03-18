package com.qiuxk.more_thread.base.service.impl;

import com.qiuxk.more_thread.base.service.ICourse;

public   abstract  class AbstractCourseImpl implements ICourse {


    @Override
    public String record() {
        return null;
    }
     /**
       * @description 这样就可以重写定义抽象方法 要想继承这个方法 那必须得实现才行
       * @param
       * @return
       * @author qiuxk  qxk1101@163.com
       * @date 2021/3/16 5:31 下午
       */
    public abstract String send();
}
