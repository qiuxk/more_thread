package com.qiuxk.more_thread.base.model.entity;


import lombok.Data;

@Data
public class ApiStatInfo {

    private String api;
    /**
     * 请求次数
     */
    private Long requestCount;
    /**
     * 错误次数
     */
    private Long errorCount;
    /**
     * 请求耗时
     */
    private Long durationOfSeconds;

}
