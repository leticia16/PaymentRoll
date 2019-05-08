package com.company;

import java.util.*;
public class Employee {
    private String name;
    private String address;
    private String type;
    private String attribute;
    private String number;

    public Employee(String name, String address, String type, String attribute, String number) {
        this.name = name;
        this.address = address;
        this.type = type;
        this.attribute = attribute;
        this.number = number;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", type='" + type + '\'' +
                ", attribute='" + attribute + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
