package com.qiuxk.more_thread.base.service.impl;

import com.qiuxk.more_thread.base.service.ICourse;

public class PhpCourse implements ICourse {
    @Override
    public String record() {
        System.out.println("I study php");
        return "I study php";
    }
}
