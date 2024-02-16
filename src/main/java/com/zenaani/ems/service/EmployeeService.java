package com.zenaani.ems.service;

import com.zenaani.ems.dto.EmployeeDto;

import java.util.List;


public interface EmployeeService {

    EmployeeDto createEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployeeById(Long id);

    List<EmployeeDto> getAllEmployee();

    EmployeeDto updateEmployee(Long id, EmployeeDto updatedEmployee);

    EmployeeDto deleteEmployee(Long id);

}
