package com.example.employeemgmt;

public class App {
    public static void main(String[] args) {

        // Manually create service and controller (since no Spring/Maven)
        EmployeeService service = new EmployeeService();
        EmployeeController controller = new EmployeeController(service);

        controller.addEmployee(new Employee(1,"Alice","CSE"));
        controller.addEmployee(new Employee(2,"Bob","ECE"));

        controller.showEmployees();
    }
}