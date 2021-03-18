package com.qiuxk.more_thread.base.spring.designPattern;

import lombok.Data;

@Data
public class Rule {
    private String ruleName;

    private long maxTps;

    private long maxErrorCount;
}
