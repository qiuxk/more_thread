package com.qiuxk.more_thread.base.service.desginPattern;

import com.qiuxk.more_thread.base.model.entity.Department;

/**
 * 组合模式
 *
 * @author qiuxk|qxk1101@163.com
 * @classes com.qiuxk.more_thread.base.service.desginPattern.CompositeDesignPattern
 * @date 2021-03-26 11:23 上午
 */
public class CompositeDesignPattern {


    public static final int DEPARTMENT_ID = 123;

    public void buildOrganization(){
        Department rootDepartment = new Department(DEPARTMENT_ID);
        buildOrganization(rootDepartment);
    }

    private void buildOrganization(Department department){

    }



}
