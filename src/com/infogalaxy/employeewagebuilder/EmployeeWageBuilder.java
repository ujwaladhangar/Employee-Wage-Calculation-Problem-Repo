package com.infogalaxy.employeewagebuilder;

import java.util.Random;

public class EmployeeWageBuilder {
    public static void main(String[] args) {
        // Welcome Message for User
        System.out.println("Welcome To Employee Wage Builder Made By Ujwala Dhangar.");

        //UC-2 Calculate Employee Daily Wage or Hour
        final int WAGE_PER_HR = 20;
        final int PART_TIME_HR = 4;
        final int FULL_TIME_HR = 8;

        //UC-1 Employee Attendance
        //Create Random object and generate 0 or 1 using % Operator
        Random random = new Random();

        //UC-5 Calculating Employee Wage for 20 Days
        for (int i = 1; i <= 20; i++) {
            int total_Wage = 0;
            int empAttendance = random.nextInt() % 2;
            System.out.println(empAttendance);
            if (empAttendance == 0) {
                System.out.println("Employee is Absent.");
            } else {
                System.out.println("Employee is Present.");

                //UC-3 Add Part Time Employee and Wage
                int emp_Type = random.nextInt() % 2;

                //UC-4 Using switch case Statement
                switch (emp_Type) {
                    case 0:
                        System.out.println("Employee is Part Time.");
                        total_Wage = WAGE_PER_HR * PART_TIME_HR;
                        break;
                    case -1:
                    case 1:
                        System.out.println("Employee is Full Time.");
                        total_Wage = WAGE_PER_HR * FULL_TIME_HR;
                        break;
                }
            }
            System.out.println("Total Wage " + total_Wage);
        }
    }
}
