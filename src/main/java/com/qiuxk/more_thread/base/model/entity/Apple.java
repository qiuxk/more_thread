package com.qiuxk.more_thread.base.model.entity;

import lombok.Data;

import java.util.Date;

/**
 *
 * 苹果的实体类
 * @author qiuxk|qxk1101@163.com
 * @classes com.qiuxk.more_thread.base.model.entity.Apple
 * @date 2020-12-14 5:15 下午
 */
@Data
public class Apple {
    /**
     * 品种
     */
    private String name;
    /**
     * 重量
     */
    private int weight;
    /**
     * 颜色
     */
    private String color;

    /**
     * 生产日期
     */
    private Date productionDate;

}
