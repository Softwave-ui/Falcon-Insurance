/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Prince Hossain
 */
public class Employee {
    
    private int employee_id;
    private String name_;
    private String gender;
    private String address;
    private String phone_number;
    private String email;
    private int age;
    private int salary;

    public Employee(int employee_id, String name_, String gender, String address, String phone_number, String email, int age, int salary) {
        this.employee_id = employee_id;
        this.name_ = name_;
        this.gender = gender;
        this.address = address;
        this.phone_number = phone_number;
        this.email = email;
        this.age = age;
        this.salary = salary;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public String getName_() {
        return name_;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    
}
