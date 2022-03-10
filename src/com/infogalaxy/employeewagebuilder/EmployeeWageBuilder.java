package com.infogalaxy.employeewagebuilder;
import java.util.Random;
public class EmployeeWageBuilder {
    public static void main(String[] args) {
        // Welcome Message for User
        System.out.println("Welcome To Employee Wage Builder Made By Ujwala Dhangar.");

        //UC-2 Calculate Employee Daily Wage or Hour
        //UC-1 Employee Attendance
        //Create Random object and generate 0 or 1 using % Operator
        int working_days = 0;
        int working_hrs = 0;
        Random random = new Random();

        //UC- 6 Working Hours 100
        //UC-5 Calculating Employee Wage for 20 Days
        while(working_hrs <= Constants.TOTAL_WORKING_HRS && working_days < Constants.WORKING_DAYS) {
        int total_Wage = 0;
        working_days++;
            System.out.println("Day = "+working_days);
            int empAttendance = random.nextInt() % 2;
            if (empAttendance == Constants.IS_ABSENT) {
                System.out.println("Employee is Absent.");
            } else {
                System.out.println("Employee is Present.");

                //UC-3 Add Part Time Employee and Wage
                int emp_Type = random.nextInt() % 2;
                if(emp_Type < 0) {
                    emp_Type = -emp_Type;
                }
                //UC-4 Using switch case Statement
                switch (emp_Type) {
                    case Constants.IS_PART_TIME:
                        System.out.println("Employee is Part Time.");
                        total_Wage = Constants.WAGE_PER_HR * Constants.PART_TIME_HR;
                        working_hrs = working_hrs + Constants.PART_TIME_HR;
                        break;
                    case Constants.IS_FULL_TIME:
                        System.out.println("Employee is Full Time.");
                        total_Wage = Constants.WAGE_PER_HR * Constants.FULL_TIME_HR;
                        working_hrs = working_hrs + Constants.FULL_TIME_HR;
                        break;
                }
            }
            System.out.println("Total Wage " + total_Wage);
            System.out.println("Total Working Hrs = "+ working_hrs);
        }
    }
}

