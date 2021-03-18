package com.qiuxk.more_thread.base.spring.designPattern;

import lombok.Data;

@Data
public class AlertRule {

    private Rule rule;
    public AlertRule(Rule rule){
        this.rule=rule;
    }


    public Rule getMatchedRule(String api){
        return  this.rule;
    }
}
