package com.example.rebbitmq.vo;

public class Member {

    private String name;
    private int age;
    private String tel;

    public Member(String name, int age, String tel) {
        this.name = name;
        this.age = age;
        this.tel = tel;
    }

    public Member() {
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", tel='" + tel + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTel(String tel) {
        this.tel = tel;
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
