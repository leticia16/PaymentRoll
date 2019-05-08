package com.company;
import java.util.*;

public class Menu {
    public Employee addEmployee(int num){

        Scanner input = new Scanner(System.in);
        Random gerador = new Random();

        System.out.println("Type the attributes: ");
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("\nAddress: ");
        String address = input.nextLine();
        System.out.print("\nType: ");
        String type = input.nextLine();
        System.out.print("\nAttribute: ");
        String attribute = input.nextLine();
        String number = String.valueOf(num);
        System.out.println(number);
        return new Employee(name, address, type, attribute, number);
    }
}
