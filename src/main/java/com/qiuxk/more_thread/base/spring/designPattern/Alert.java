package com.qiuxk.more_thread.base.spring.designPattern;

import com.qiuxk.more_thread.base.model.entity.ApiStatInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * 错误信息告警类
 *
 * @author qiuxk|qxk1101@163.com
 * @classes com.qiuxk.more_thread.base.spring.designPattern.Alert
 * @date 2021-03-18 4:56 下午
 */
public class Alert {
     private List<AlertHandler> alertHandlerList = new ArrayList<>();

     public void addAlertHand(AlertHandler alertHandler){
         alertHandlerList.add(alertHandler);
     }
     public  void check(ApiStatInfo apiStatInfo){
         alertHandlerList.stream().forEach(a-> a.check(apiStatInfo));
     }


}
