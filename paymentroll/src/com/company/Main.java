package com.company;
import java.util.*;


public class Main {

    public static void main(String[] args) {
//        ArrayList<Employee> aux = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        Menu menu = new Menu();

        ArrayList<Employee> employeesList = new ArrayList<>(); // List with all employess
        ArrayList<Employee> hourlyEmployees = new ArrayList<>();
        ArrayList<Employee> salariedEmployees = new ArrayList<>();
        ArrayList<Employee> commissionedEmployees = new ArrayList<>();

        int number = 0;
        while(true) {
            menu.menu();
            int op = input.nextInt();
            input.nextLine();
            if(op == 1){ //Add Employee
                number += 1;
                Employee employee = menu.createEmployee(number); // Creating an Employee
                menu.addEmployee(employee,employeesList);
                menu.verifyType(employeesList, hourlyEmployees,salariedEmployees, commissionedEmployees);
            }
            if(op == 2){ //Remove Employee
                menu.removeEmployee(employeesList, hourlyEmployees,salariedEmployees, commissionedEmployees);
            }
            if(op == 3){ // Launch Card Point
                menu.cardPoint();
            }
            if(op == 0){
                break;
            }
        }
    }
}
