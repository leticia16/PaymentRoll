package com.company;
import java.util.*;


public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Menu menu = new Menu();
        int number = 0;
        while(true) {
            int op = input.nextInt();
            input.nextLine();
            if(op == 1){
                number += 1;
                Employee employee = menu.addEmployee(number);
                employee.toString();
            }
            if(op == 0){
                break;
            }
        }
    }
}
