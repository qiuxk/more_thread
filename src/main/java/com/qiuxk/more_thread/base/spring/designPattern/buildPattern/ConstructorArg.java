package com.qiuxk.more_thread.base.spring.designPattern.buildPattern;

import lombok.Getter;

/**
 * 设计模式之建造者模式
 *
 * @author qiuxk|qxk1101@163.com
 * @classes com.qiuxk.more_thread.base.spring.designPattern.buildPattern.ConstructorArg
 * @date 2021-03-23 2:06 下午
 */
public class ConstructorArg {
    @Getter
    private Boolean isRef;
    @Getter
    private Class type;
    @Getter
    private Object arg;

    private ConstructorArg(Builder builder) {
        this.isRef = builder.getIsRef();
        this.type = builder.getType();
        this.arg = builder.getArg();
    }

    public ConstructorArg(ConstructorArgBuilder builder) {
        this.isRef = builder.getIsRef();
        this.type = builder.getType();
        this.arg = builder.getArg();
    }


    public static class Builder {
        @Getter
        private Boolean isRef = false;
        @Getter
        private Class type;
        @Getter
        private Object arg;

        public ConstructorArg build() {
            if (isRef && (null == arg || arg.getClass() != String.class)) {
                throw new IllegalArgumentException("param is illegal");
            }
            if (!isRef && (null == arg || null == type)) {
                throw new IllegalArgumentException("param is illegal");
            }
            return new ConstructorArg(this);
        }

        public Builder setIsRef(boolean isRef) {
            this.isRef = isRef;
            return this;
        }

        public Builder setType(Class<?> clazz) {
            this.type = clazz;
            return this;
        }

        public Builder setArg(Object object) {
            this.arg = object;
            return this;
        }
    }

    public static void main(String[] args) throws ClassNotFoundException {
        ConstructorArg constructorArg = new Builder().setType(Class.forName("java.lang.String")).setIsRef(Boolean.FALSE).setArg("123").build();

        System.out.println("type="+constructorArg.getType()+"isRef="+constructorArg.getArg()+"arg="+constructorArg.getIsRef());

    }


}
