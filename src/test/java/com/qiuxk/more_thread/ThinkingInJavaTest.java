package com.qiuxk.more_thread;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

@SpringBootTest
public class ThinkingInJavaTest {

    @Test
    public void test(){
        Map<String, String> map = new HashMap<>();
        for(int i=1000;i<9999;i++){
            Integer a = Integer.valueOf(i);
            String[] split = a.toString().split("");
            List<String> list = Arrays.asList(split);
           // HashSet<String> hashSet = new HashSet<>(Arrays.asList(split));
            for(int m=0;m<4;m++){
                for(int j=0;j<4;j++){
                    int another = 3 -  j;
                    if(another == m){
                        continue;
                    }
                    String endValue = split[m];
                    String startValue = split[another];
                    String mm = startValue + endValue;
                    String dd =  endValue + startValue;
                    if(checkData(a, mm, list)>0){
                        map.put(a.toString(),mm+","+checkData(a, mm, list));
                    }
                    if(checkData(a,dd,list)>0){
                        map.put(a.toString(),dd+","+checkData(a, dd, list));
                    }
                }
            }
        }
        System.out.println(map);
    }

    private int  checkData (int a ,String mm,List<String> list) {
        int value = Integer.parseInt(mm);
        if (value < 10 || a % value != 0 || a / value > 99) {
            return -1;
        }
        int anotherValue = a / value;
       // String result = mm + Integer.valueOf(anotherValue).toString();
        List<String> strings = Arrays.asList(mm.split(""));


        String aString = a + "";
        int i = aString.indexOf(strings.get(0));
        aString = aString.replaceFirst(strings.get(0),"");
        aString = aString.replaceFirst(strings.get(1),"");
        String[] b = aString.split("");
        if( (b[0]+b[1]).equals(anotherValue+"") ||(b[1]+b[0]).equals(anotherValue+"")){
            return anotherValue;
        }
        return -1;
    }



}
