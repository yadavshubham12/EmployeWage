package com.blz.empwages;

import java.util.Random;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to employee wage computation programme");
        int isPresent=1;
        int wagePerHr=20;
        int fullDayHr=8;
        double salary;
        Random random = new Random();
        int randomCheck = random.nextInt(2);
        System.out.println(randomCheck);

        if (randomCheck == isPresent){
            System.out.println("Employee is present");
          salary = (fullDayHr * wagePerHr);
            System.out.println("DailyWage of employee is :" +salary);
        }
        else {
            System.out.println("Employee is abscent");
        }
    }
}
