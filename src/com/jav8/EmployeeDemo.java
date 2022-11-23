package com.jav8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class EmployeeDemo {
    public static void main(String[] args) {

    List<Employee> employees= new ArrayList<Employee>();

        //Hardcoded Employee objects

        Employee e1= new Employee(10010,"Ajay K","IT","Male",50000);
        Employee e2= new Employee(10019,"Kartik H","IT","Male",45000);
        Employee e3= new Employee(10078,"Peter","HR","Male",60000);
        Employee e4= new Employee(10060,"Kajal","Admin","Female",35000);
        Employee e5= new Employee(10078,"Rita","HR","Female",37000);
        Employee e6= new Employee(10034,"Ram","Admin","Male",58000);
        Employee e7= new Employee(10077,"Krish","IT","Male",49000);

        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        employees.add(e6);
        employees.add(e7);

        System.out.println("\nEmployees Sorted on the basis of Id");
        employees.stream().sorted(Comparator.comparing(Employee::getId)).forEach(e-> System.out.println(e));

        System.out.println("\nEmployees Sorted on the basis of Name");
        employees.stream().sorted(Comparator.comparing(Employee::getName)).forEach(e-> System.out.println(e));

        System.out.println("\nEmployees Sorted on the basis of Salary");
        employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).forEach(e-> System.out.println(e));

        System.out.println("\nEmployee name who belongs HR department and sorted them as per salary");
        employees.stream().filter(emp->emp.getDepartment().equalsIgnoreCase("HR")).
                sorted(Comparator.comparing(Employee::getSalary).reversed()).forEach(e-> System.out.println(e));

        System.out.println("\n3rd Highest salary");
        employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
                .skip(2).limit(1).forEach(e-> System.out.println(e));

        System.out.println("Count the number of female employees");
        long femaleCount= employees.stream().filter(emp->emp.getGender().equalsIgnoreCase("Female")).count();
        System.out.println("\nFemale Count = " +femaleCount);




    }
}

