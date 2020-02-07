package com.cooper.pojo;

import lombok.Data;

@Data //如果不写Data注释那么就需要写get，set，toString方法
public class User {
    private int age;
    private String name;
//    private String pwd;


//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    @Override
//    public String toString() {
//        return "User{" +
//                "age=" + age +
//                ", name='" + name + '\'' +
//                '}';
//    }
}
