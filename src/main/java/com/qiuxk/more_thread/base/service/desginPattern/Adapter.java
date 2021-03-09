package com.qiuxk.more_thread.base.service.desginPattern;

/**
 * 适配器模式
 *
 * @author qiuxk|qxk1101@163.com
 * @classes com.qiuxk.more_thread.base.service.desginPattern.Adapter
 * @date 2021-03-08 11:24 上午
 */
public abstract class Adapter {
    private String a="a";
    protected String b="b";

    public abstract  String command();

    public String execCommand(){
        return "execCommand";
    }


    public String test(String a,int b){
        return "";
    }

    public String test(int b,String a){
        return "";
    }



}
