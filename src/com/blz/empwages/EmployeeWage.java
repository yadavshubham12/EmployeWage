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
        double salary;
        Random random = new Random();
        int randomCheck = random.nextInt(3);
        System.out.println(randomCheck);

        if (randomCheck == isFullTime ) {
            System.out.println("Employee is Full Time Present");
            salary = (fullDayHr * wagePerHr);
            System.out.println("DailyWage of employee is :" + salary);
        } else if (randomCheck == isPartTIme) {
            System.out.println("Employee is Part Time Present");
            salary = (halfDayHr * wagePerHr);
            System.out.println("Daily Salary of Empl0yee is :" + salary);
        } else {
            System.out.println("Employee is abscent");
        }
    }
}
