package com.company;
import java.util.*;

public class Hourly {
    private Employee employee;
    private int total;

    public Hourly(Employee employee, int total){
        this.employee = employee;
        this.total = total;
    }

    @Override
    public String toString() {
        return "Hourly{" +
                "employee=" + employee +
                ", total=" + total +
                '}';
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
