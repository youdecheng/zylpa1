package com.zylpa.system.domain;



import java.util.Date;
import java.util.List;

/**
 * Created by youdecheng on 2020/6/22.
 */

public class Student {
    private String name;//姓名
    private int age;//年龄
    private Date birthday;//生日
    private Float mondy;//钱包
    private List<Student> friends;//朋友列表
    private Student bestFriend;//最好的朋友

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Float getMondy() {
        return mondy;
    }

    public void setMondy(Float mondy) {
        this.mondy = mondy;
    }

    public List<Student> getFriends() {
        return friends;
    }

    public void setFriends(List<Student> friends) {
        this.friends = friends;
    }

    public Student getBestFriend() {
        return bestFriend;
    }

    public void setBestFriend(Student bestFriend) {
        this.bestFriend = bestFriend;
    }
}
