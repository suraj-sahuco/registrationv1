package com.api.stream;

import com.api.Employee;
import com.api.EmployeeDto;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class A {

    public static void main(String[] args){
        List<Employee> employees = Arrays.asList(
                new Employee(1,"mike"),
                new Employee(2,"stallin"),
                new Employee(3,"adam")
        );
        List<EmployeeDto> dtos = employees.stream().map(A::maptoDto).collect(Collectors.toList());
    }

   static EmployeeDto maptoDto(Employee employee){
        EmployeeDto dto = new EmployeeDto();
        dto.setId(employee.getId());
        dto.setName(employee.getName());
        return dto;
    }
}
