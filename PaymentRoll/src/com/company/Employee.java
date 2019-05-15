package com.company;
import java.util.*;

public class Employee {
    private String name;
    private String address;
    private String type;
    private int attribute;
    private String number;
    private double salaryValue;

    public double getSalaryValue() {
        return salaryValue;
    }

    public void setSalaryValue(double salaryValue) {
        this.salaryValue = salaryValue;
    }

    public Employee() {}

    public Employee(String name, String address, String type, int attribute, String number, double salaryValue) {
        this.name = name;
        this.address = address;
        this.type = type;
        this.attribute = attribute;
        this.number = number;
        this.salaryValue = salaryValue;
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

    public int getAttribute() {
        return attribute;
    }

    public void setAttribute(int attribute) {
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
                ", attribute=" + attribute +
                ", number='" + number + '\'' +
                ", salaryValue=" + salaryValue +
                '}';
    }
}
