package com.company;
import java.util.*;

public class Menu {
    Scanner input = new Scanner(System.in);

    public void menu(){
        System.out.println("\nIndex of Options");
        System.out.println("(1) Add an Employee");
        System.out.println("(2) Remove an Employee");
        System.out.println("(3) Launch a Card Point");
        System.out.println("(0) End");
    }
    public Employee createEmployee(int num){
        System.out.println("Type the attributes of Employee: ");
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Address: ");
        String address = input.nextLine();
        System.out.print("Type: \n (1) hourly; \n (2) salaried; \n (3) commissioned)\n ");
        String type = input.nextLine();
        System.out.print("Salary: \n (1) hour salary; \n (2) monthly salary; \n (3) commission\n ");
        String attribute = input.nextLine();
        String number = String.valueOf(num);
        return new Employee(name, address, type, attribute, number);
    }
    public void addEmployee(Employee employee, ArrayList<Employee> employeesList){
        employeesList.add(employee);
        System.out.println(employeesList.size());
    }
    public void verifyType(ArrayList<Employee> empl, ArrayList<Employee> hourlyEmplo,
                           ArrayList<Employee> salariedEmplo, ArrayList<Employee> commmiEmplo){

        for(Employee e: empl){
            System.out.println(e.getName());
            if(e.getType().equals("1")){
                hourlyEmplo.add(e);
            }
            if(e.getType().equals("2")){
                salariedEmplo.add(e);
            }
            if(e.getType().equals("3")){
                commmiEmplo.add(e);
            }
        }
    }

    public void removeEmployee(ArrayList<Employee> empl, ArrayList<Employee> hourlyEmplo,
                           ArrayList<Employee> salariedEmplo, ArrayList<Employee> commmiEmplo){
        System.out.print("\n______________\nindex| Name\n");
        for(Employee e : empl){
            System.out.printf(" %s   | %s\n",e.getNumber(), e.getName());
        }
        System.out.print("_____________\n");
       String op  = input.nextLine();
       boolean flag = true;
       for(Employee e : empl){
           if(e.getNumber().equals(op)){
               empl.remove(e);
               if(e.getType().equals("1")){
                   hourlyEmplo.remove(e);
               }
               else if(e.getType().equals("2")){
                   salariedEmplo.remove(e);
               }
               else if(e.getType().equals("3")){
                   commmiEmplo.remove(e);
               }
               System.out.println("Employee removed!");
               flag = false;
               break;
           }
       }
       if(flag){
           System.out.println("We can't find this Employee");
       }
    }
    public void cardPoint(){
        System.out.print("\nTime of Entry:");
        String entryHour = input.nextLine();
        System.out.print("\nTime of Exit:");
        String exitHour = input.nextLine();
    }
}
