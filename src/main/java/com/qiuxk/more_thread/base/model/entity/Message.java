package com.qiuxk.more_thread.base.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * kafka封装消息实体类
 *
 * @author qiuxk|qxk1101@163.com
 * @classes com.qiuxk.more_thread.base.model.entity.Message
 * @date 2021-02-19 11:56 上午
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Message implements Serializable {
    private static final long serialVersionUID =1L;
    private String from;
    private String message;

    @Override
    public String toString(){
       return  "Message{" + "from= "+from+"\'"+ ",message="+message +"\'"+
               "}";
    }
}
