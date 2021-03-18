package com.qiuxk.more_thread.base.spring.designPattern;

import com.qiuxk.more_thread.base.model.entity.ApiStatInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * 错误信息的实现
 *
 * @author qiuxk|qxk1101@163.com
 * @classes com.qiuxk.more_thread.base.spring.designPattern.ErrorAlertHandler
 * @date 2021-03-18 4:53 下午
 */
public class ErrorAlertHandler extends  AlertHandler {

    public ErrorAlertHandler(AlertRule alertRule, Notification notification){
        super(alertRule, notification);
    }
    @Override
    public void check(ApiStatInfo apiStatInfo) {
        long tps = apiStatInfo.getRequestCount() / apiStatInfo.getDurationOfSeconds();
        List<String> toList = new ArrayList<>();
        toList.add("13700000000");
        if(tps > rule.getMatchedRule(apiStatInfo.getApi()).getMaxErrorCount()){
            notification.notice("1",toList,"系统的错误次数太多了");
        }
    }
}
