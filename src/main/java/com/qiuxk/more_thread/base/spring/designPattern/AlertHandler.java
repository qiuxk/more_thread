package com.qiuxk.more_thread.base.spring.designPattern;

import com.qiuxk.more_thread.base.model.entity.ApiStatInfo;

/**
 * 处理器
 *
 * @author qiuxk|qxk1101@163.com
 * @classes com.qiuxk.more_thread.base.spring.designPattern.AlertHandler
 * @date 2021-03-18 4:32 下午
 */
public abstract class AlertHandler {
    protected AlertRule rule;
    protected Notification notification;

    public AlertHandler(AlertRule alertRule,Notification notification){
        this.notification=notification;
        this.rule=alertRule;
    }

    public abstract void check(ApiStatInfo apiStatInfo);

}
