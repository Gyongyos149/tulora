/*
* File: about.Employee.java
* Author: Szücs Gyöngyi
* Copyright: 2026, Szücs Gyöngyi
* Group: SzoftII-E
* Date: 2026-03-15
* Github: https://github.com/gyongyos149/
* Licenc: MIT
*/
package com.example;


public class Employee {
    private String name;
    private String motherName;
    private String city;
    private String address;
    private String birth;
    private Integer salary;
    private Integer bonus;

    public Employee(String name, String motherName, String city, String address, String birth, Integer salary, Integer bonus) {
        this.name = name;
        this.motherName = motherName;
        this.city = city;
        this.address = address;
        this.birth = birth;
        this.salary = salary;
        this.bonus = bonus;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;}
    public String getBirth() {
        return birth;
    }
    public void setBirth(String birth) {
        this.birth = birth;
    }
    
    public Integer getSalary() {
        return salary;
    }
    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
    

