package com.qiuxk.more_thread.base.model.entity;

public class Employee extends  HumanResource {
    @Override
    public double calculateSalary() {
        return salary;
    }

    public Employee(long id ,double salary){
        super(id);
        this.salary=salary;
    }
}
