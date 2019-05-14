package com.company;
import java.util.*;

public class Hourly {
    private Employee employee;
    private int entryHour;
    private int exitHour;

    public Hourly(Employee employee, int entryHour, int exitHour){
        this.employee = employee;
        this.entryHour = entryHour;
        this.exitHour = exitHour;
    }

    @Override
    public String toString() {
        return "Hourly{" +
                "employee=" + employee +
                ", entryHour=" + entryHour +
                ", exitHour=" + exitHour +
                '}';
    }
}
