package com.qiuxk.more_thread.base.spring.designPattern.buildPattern;
import lombok.Data;




@Data
public class ConstructorArgBuilder {

    private Boolean isRef=false;
    private Class type;
    private Object arg;

    public ConstructorArg build(){
        if(isRef && (null == arg || arg.getClass() != String.class)){
            throw new IllegalArgumentException("param is illegal");
        }
        if(!isRef && (null == arg || null ==  type)){
            throw new IllegalArgumentException("param is illegal");
        }
        return new ConstructorArg(this);
    }

    public ConstructorArgBuilder setIsRef(boolean isRef) {
        this.isRef=isRef;
        return this;
    }
    public ConstructorArgBuilder setType(Class<?> clazz){
        this.type=clazz;
        return this;
    }
    public ConstructorArgBuilder setArg(Object object){
        this.arg=object;
        return this;
    }

    public static void main(String[] args) throws ClassNotFoundException {
        ConstructorArgBuilder builder = new ConstructorArgBuilder();
        ConstructorArg constructor = builder.setType(Class.forName("java.lang.String")).setIsRef(Boolean.FALSE).setArg("123").build();
        System.out.println("type="+constructor.getType()+"isRef="+constructor.getArg()+"arg="+constructor.getIsRef());
    }


}
