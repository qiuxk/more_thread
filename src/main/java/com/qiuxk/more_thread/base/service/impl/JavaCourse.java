package com.qiuxk.more_thread.base.service.impl;

import com.qiuxk.more_thread.base.service.ICourse;

public class JavaCourse implements ICourse {

    @Override
    public String record() {
        System.out.println("I study java");
        return "I study java";
    }
}
