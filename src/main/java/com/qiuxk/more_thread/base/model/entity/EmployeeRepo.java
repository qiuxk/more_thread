package com.qiuxk.more_thread.base.model.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * 员工类对应的数据库实体类
 *
 * @author qiuxk|qxk1101@163.com
 * @classes com.qiuxk.more_thread.base.model.entity.EmployeeRepo
 * @date 2021-03-26 11:55 上午
 */
public class EmployeeRepo {

    private long id;
    private long department_id;
    private double salary;

     /**
       * @description 获取当前部门所有的员工id
       * @param
       * @return
       * @author qiuxk  qxk1101@163.com
       * @date 2021/3/26 11:59 上午
       */
    public List<Long> getDepartmentEmployeeIds(long departmentId){
        return  new ArrayList<>();
    }


}
