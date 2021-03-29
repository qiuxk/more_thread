package com.qiuxk.more_thread.base.model.entity;

/**
 *  部门、员工的抽象（组合设计模式）
 * @Link com.qiuxk.more_thread.base.service.desginPattern.CompositeDesignPattern
 *
 * @author qiuxk|qxk1101@163.com
 * @classes com.qiuxk.more_thread.base.model.entity.HumanResource
 * @date 2021-03-26 11:25 上午
 */
public abstract class HumanResource {
    protected  long id;
    protected double salary;

    public HumanResource(long id){
        this.id=id;
    }

    public long getId(){
        return id;
    }
     /**
       * @description 计算薪水
       * @param
       * @return
       * @author qiuxk  qxk1101@163.com
       * @date 2021/3/26 11:27 上午
       */
    public abstract  double calculateSalary();


}
