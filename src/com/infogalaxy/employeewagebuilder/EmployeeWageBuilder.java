package com.infogalaxy.employeewagebuilder;
import java.util.Random;
public class EmployeeWageBuilder {

    int working_days = 0;
    int working_hrs = 0;
    int total_Wage = 0;
    Random random = new Random();

    public void empWageCalculate() {
        System.out.println("Welcome To Employee Wage Builder Made By Ujwala Dhangar.");
        while (working_hrs <= Constants.TOTAL_WORKING_HRS && working_days < Constants.WORKING_DAYS) {
            working_days++;
            System.out.println("Day = " + working_days);
            int empAttendance = random.nextInt() % 2;
            if (empAttendance == Constants.IS_ABSENT) {
                System.out.println("Employee is Absent.");

            } else {
                System.out.println("Employee is Present.");
                int emp_Type = random.nextInt() % 2;
                if (emp_Type < 0) {
                    emp_Type = -emp_Type;
                }
                switch (emp_Type) {
                    case Constants.IS_PART_TIME:
                        System.out.println("Employee is Part Time.");
                        total_Wage = total_Wage + (Constants.WAGE_PER_HR * Constants.PART_TIME_HR);
                        working_hrs = working_hrs + Constants.PART_TIME_HR;
                        break;
                    case Constants.IS_FULL_TIME:
                        System.out.println("Employee is Full Time.");
                        total_Wage = total_Wage + (Constants.WAGE_PER_HR * Constants.FULL_TIME_HR);
                        working_hrs = working_hrs + Constants.FULL_TIME_HR;
                        break;
                }
            }
        }
    }
    public void showEmpWage() {
        System.out.println("Total Wage " + total_Wage);
        System.out.println("Total Working Hrs = " + working_hrs);
    }

    public static void main(String[] args) {
        EmployeeWageBuilder employeeWageBuilder = new EmployeeWageBuilder();
        employeeWageBuilder.empWageCalculate();
        employeeWageBuilder.showEmpWage();
    }
}
