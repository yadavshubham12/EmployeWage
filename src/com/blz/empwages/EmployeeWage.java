package com.blz.empwages;

import java.util.Random;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to employee wage computation programme");
        int isPresent=1;
        Random random = new Random();
        int randomCheck = random.nextInt(2);
        System.out.println(randomCheck);

        if (randomCheck == isPresent){
            System.out.println("Employee is present");
        }
        else {
            System.out.println("Employee is abscent");
        }
    }
}
