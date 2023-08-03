package com.varun;

import com.varun.clone.Address;
import com.varun.clone.Employee;

import java.util.ArrayList;
import java.util.List;

public class CloneTest {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("varun");
        List<String> skills = new ArrayList<>();
        skills.add("Backend");
        employee.setSkills(skills);

        Address address = new Address();
        address.setStreeName("G.v Scheme road");
        employee.setAddress(address);

        try {
            Employee cloned = employee.clone();
            System.out.println(cloned);

            cloned.getSkills().add("Frontend");
            System.out.println("Original employee skills: " + employee.getSkills());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
