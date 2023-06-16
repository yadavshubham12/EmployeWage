package com.blz.empwages;

import java.util.Random;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to employee wage computation programme");
        int isFullTime=1;
        int isPartTIme=2;
        int wagePerHr=20;
        int fullDayHr=8;
        int halfDayHr=4;
        double salary = 0;
        Random random = new Random();
        int randomCheck = random.nextInt(3);
        System.out.println(randomCheck);

        switch (randomCheck){
            case 1: {
                System.out.println("Employee is fullDay present: ");
                salary = fullDayHr * wagePerHr;
            }
            break;
            case 2: {
                System.out.println("Employee is HalfDay Present: ");
                salary = halfDayHr * wagePerHr;
            }
            break;
            case 3: {
                System.out.println("Employee is Absent");
            }
            break;
        }
        System.out.println("Salary of employee is: " +salary);
        System.out.println("Employee Salary: " +salary);
    }
}
