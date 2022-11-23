package com.jav8;

//POJO for Employee
public class Employee {

    private int id;
    private String name;
    private String department;
    private String gender;
    private double salary;
    private int experinceInYears;


    public Employee(){
    }

    public Employee(int id, String name, String department, String gender, double salary,int experinceInYears) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.gender = gender;
        this.salary = salary;
        this.experinceInYears=experinceInYears;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getExperinceInYears() {
        return experinceInYears;
    }

    public void setExperinceInYears(int experinceInYears) {
        this.experinceInYears = experinceInYears;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                ", experinceInYears=" + experinceInYears +
                '}';
    }
}
