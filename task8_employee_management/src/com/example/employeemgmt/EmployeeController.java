package com.example.employeemgmt;

public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    public void addEmployee(Employee emp){
        employeeService.addEmployee(emp);
        System.out.println(emp.getName() + " added successfully!");
    }

    public void showEmployees(){
        System.out.println("All Employees:");
        for(Employee emp : employeeService.getAllEmployees()){
            System.out.println(emp);
        }
    }
}