package com.karabel;

import com.karabel.config.ApplicationConfig;
import com.karabel.service.DepartmentService;
import com.karabel.service.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);


        EmployeeService employeeService = context.getBean(EmployeeService.class);
        System.out.println(employeeService.checkDepartment());

    }
}
