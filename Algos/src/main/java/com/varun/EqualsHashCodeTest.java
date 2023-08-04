package com.varun;

import com.varun.clone.Employee;

import java.util.HashSet;
import java.util.Set;

public class EqualsHashCodeTest {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setId(1);

        Employee employee2 = new Employee();
        employee2.setId(1);

        Set<Employee> set = new HashSet<>();
        set.add(employee);
        set.add(employee2);

        System.out.println(set.size());
    }
}
