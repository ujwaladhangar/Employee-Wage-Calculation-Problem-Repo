package com.infogalaxy.employeewagebuilder;

import java.util.Random;

public class EmployeeWageBuilder {
    public static void main(String[] args) {

        System.out.println("Welcome TO Employee Wage Builder Made By Ujwala Dhangar");
        //Create Random object and generate 0 or 1 using % Operator
        Random random = new Random();
        int empAttendance = random.nextInt() % 2;

        //Checking for Employee Present or Absent
        if(empAttendance ==0) {
            System.out.println("Employee is Absent");
        }else {
            System.out.println("Employee is Present");
        }
  }
}
