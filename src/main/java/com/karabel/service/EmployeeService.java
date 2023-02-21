package com.karabel.service;

public class EmployeeService {

    private final DepartmentService departmentService;

    public EmployeeService(DepartmentService departmentService){
        this.departmentService = departmentService;
    }

    public String checkDepartment(){
        System.out.println(this +" checkDepartment");
        return departmentService.getDepartmentService("EMP-0098");
    }
}
