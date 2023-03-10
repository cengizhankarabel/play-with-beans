package com.karabel.config;

import com.karabel.service.DepartmentService;
import com.karabel.service.EmployeeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public DepartmentService departmentService(){
        return new DepartmentService();
    }

    @Bean
    public EmployeeService employeeService(){
        return new EmployeeService(departmentService());
    }
}
