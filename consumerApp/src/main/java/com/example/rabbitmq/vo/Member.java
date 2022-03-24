package com.example.rabbitmq.vo;

import java.io.Serializable;

public class Member implements Serializable {

    private static final long serialVersionUID = 6529685098267757690L;
    private String name;
    private int age;
    private String tel;

    public Member(String name, int age, String tel) {
        this.name = name;
        this.age = age;
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", tel='" + tel + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getTel() {
        return tel;
    }
}
