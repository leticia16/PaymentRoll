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
//                System.out.println( employee.toString()); // DEBUG ####
                menu.addEmployee(employee,employeesList);
                menu.verifyType(employee, hourlyEmployees,salariedEmployees, commissionedEmployees);// ADD Employee to correct arrayList
//                System.out.println(hourlyEmployees.toString()); // DEBUG ####
            }
            if(op == 2){ //Remove Employee
                menu.removeEmployee(employeesList, hourlyEmployees,salariedEmployees, commissionedEmployees);
            }
            if(op == 3){ // Launch Card Point
//                menu.printEmployees(hourlyEmployees); DEBUG ####
                menu.cardPoint(hourlyEmployees);
            }
            if(op == 0){
                break;
            }
        }
    }
}
