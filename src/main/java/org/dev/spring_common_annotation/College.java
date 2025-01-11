package org.dev.spring_common_annotation;

public class College {
    private String name;
    private String address;

    public College(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
