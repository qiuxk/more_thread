package com.qiuxk.more_thread.base.basicExercises;

/**
 * 自定义Builder模式的实现
 *  ps：也可以使用lombok中的@Builder注解去实现
 * 
 * @author qiuxk|qxk1101@163.com
 * @classes com.qiuxk.more_thread.base.basicExercises.BuilderPattern
 * @date 2021-02-18 10:46 上午
 */
public class BuilderPattern {
    private int age;
    private String name;

    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public static Builder build(){
        return new Builder();
    }

    public static class Builder{
        private String name;
        private int age;

        public Builder name(String name){
            this.name=name;
            return this;
        }

        public Builder age(int age){
            this.age=age;
            return this;
        }

        public BuilderPattern builder(){
            BuilderPattern builderPattern = new BuilderPattern();
            builderPattern.setAge(age);
            builderPattern.setName(name);
            return  builderPattern;
        }


    }

    public static void main(String[] args) {
        BuilderPattern shadiao = BuilderPattern.build().name("shadiao").age(10).builder();
        System.out.println(shadiao.getAge());
        System.out.println(shadiao.getName());
    }

}
