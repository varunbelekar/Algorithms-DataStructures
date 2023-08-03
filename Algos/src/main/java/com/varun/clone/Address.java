package com.varun.clone;

import lombok.Data;

@Data
public class Address implements Cloneable {
    private String streeName;

    @Override
    public Address clone() throws CloneNotSupportedException {
        return (Address) super.clone();
    }
}
