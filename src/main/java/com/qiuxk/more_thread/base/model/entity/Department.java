package com.qiuxk.more_thread.base.model.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * 部门类
 *
 * @author qiuxk|qxk1101@163.com
 * @classes com.qiuxk.more_thread.base.model.entity.Department
 * @date 2021-03-26 11:33 上午
 */
public class Department extends  HumanResource {
    private List<HumanResource> subNods= new ArrayList<>();

    @Override
    public double calculateSalary() {
        double totalSalary= 0;
        for(HumanResource hr:subNods){
            totalSalary  = hr.calculateSalary()+totalSalary;
        }
        this.salary = totalSalary;
        return totalSalary;
    }

    public Department(long id){
        super(id);
    }
    public void addSubNode(HumanResource employee){
        subNods.add(employee);
    }

}
