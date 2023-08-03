package com.varun.clone;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Employee implements Cloneable {
    private int id;
    private String name;
    private List<String> skills;

    private Address address;

    @Override
    public Employee clone() throws CloneNotSupportedException {
        Employee employee = (Employee) super.clone();
        if (skills != null) {
            List<String> skills = new ArrayList<>(getSkills());
            employee.setSkills(skills);
        }
        if (address != null) {
            employee.setAddress(address.clone());
        }
        return employee;
    }
}
