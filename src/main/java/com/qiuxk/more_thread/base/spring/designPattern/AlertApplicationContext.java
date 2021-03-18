package com.qiuxk.more_thread.base.spring.designPattern;

import com.qiuxk.more_thread.base.model.entity.ApiStatInfo;

public class AlertApplicationContext {
     private AlertRule alertRule;
     private Notification notification;
     private Alert alert;


      /**
        * @description 初始化方法
        * @param
        * @return
        * @author qiuxk  qxk1101@163.com
        * @date 2021/3/18 5:04 下午
        */
     public void initializeBeans(){
         Rule rule = new Rule();
         alertRule = new AlertRule(rule);
         notification = new Notification();
         alert = new Alert();

         alert.addAlertHand(new TpsAlertHandler(alertRule,notification));
         alert.addAlertHand(new ErrorAlertHandler(alertRule,notification));
     }
     public Alert getAlert(){
         return this.alert;
     }
    //懒汉式单例
     private static final AlertApplicationContext context= new AlertApplicationContext();

     private AlertApplicationContext(){
         initializeBeans();
     }

     public static AlertApplicationContext getInstance(){
         return context;
     }

    public static void main(String[] args) {
        ApiStatInfo apiStatInfo = new ApiStatInfo();
        //初始化容器 获取单利对象  调用具体的check方法
        AlertApplicationContext.getInstance().getAlert().check(apiStatInfo);
    }



}
