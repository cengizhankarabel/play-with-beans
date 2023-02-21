package com.karabel;

import com.karabel.service.DepartmentService;
import com.karabel.service.EmployeeService;

public class App {

    public static void main(String[] args) {
        DepartmentService departmentService = new DepartmentService();
        EmployeeService employeeService = new EmployeeService(departmentService);
        System.out.println(employeeService.checkDepartment());
    }
}
