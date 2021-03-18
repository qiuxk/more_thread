package com.qiuxk.more_thread.base.spring.designPattern;

import lombok.Data;

import java.util.List;

@Data
public class Notification {

    private String level;

    private List<String> to;

    private String noticeMsg;

    public void notice(String level,List<String> to,String noticeMsg){
        System.out.println("notice balala");
    }


}
