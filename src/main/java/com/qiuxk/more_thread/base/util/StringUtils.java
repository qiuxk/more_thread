package com.qiuxk.more_thread.base.util;

/**
 * 字符串相关的工具类
 *
 * @author qiuxk|qxk1101@163.com
 * @classes com.qiuxk.more_thread.base.util.StringUtils
 * @date 2020-12-15 11:28 上午
 */
public class StringUtils {

    /**
     * 截取字符串
     * @param
     * @return
     * @Author：qiuxk qxk1101@163.com
     * @Date：2020/12/15 11:30 上午
     */
    public static  String subStr(String str,int begin,int end){
        return str.substring(begin,end);
    }

    public static void main(String[] args) {
        String aa="asdfa-adfa-adfa-adfa";
        int begin = aa.indexOf("-");
        int end = aa.length();
        String bb = subStr(aa, begin+1, end);
        System.out.println(bb);
    }
}
