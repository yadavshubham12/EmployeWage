package com.blz.empwages;

import java.util.Random;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to employee wage computation programme");
        int isFullTime = 1;
        int isPartTIme = 2;
        int wagePerHr = 20;
        int fullDayHr = 8;
        int halfDayHr = 4;
        int workingDays = 20;
        double dailySalary = 0;
        double monthlyWage = 0;

        Random random = new Random();
        int randomCheck = random.nextInt(3);
        System.out.println(randomCheck);

        if (randomCheck == isFullTime){
            System.out.println(" Is fullDayPresent : ");
            dailySalary = wagePerHr * fullDayHr;
            System.out.println("DailyWage :" + dailySalary);
            monthlyWage =(dailySalary * workingDays);
            System.out.println("Empoloyee Monthly Salary is : " +monthlyWage );
        }
        else if (randomCheck == isPartTIme) {
            System.out.println("is HalfDayPresent : ");
            dailySalary = wagePerHr * halfDayHr;
            System.out.println("HalfDayPresent salary : " +dailySalary);
            monthlyWage = dailySalary * workingDays;
            System.out.println("Employee monthly salary is : " +monthlyWage);
        }
        else {
            System.out.println("Employee is absent");
        }
    }
}
