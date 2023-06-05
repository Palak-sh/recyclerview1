package com.example.myapplication1;

import java.io.Serializable;

public class model implements Serializable {
    String Name;
    String age ;
    String address;

    public void BeanDemo() {

    }

    public void BeanDemo(String name, String age, String address) {
        this.Name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

