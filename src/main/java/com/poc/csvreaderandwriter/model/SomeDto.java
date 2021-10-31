package com.poc.csvreaderandwriter.model;

import com.opencsv.bean.CsvBindByName;

public class SomeDto {
    @CsvBindByName
    private String name;

    @CsvBindByName
    private Integer age;

    @CsvBindByName
    private String city;

    public SomeDto() {}

    public SomeDto(String name, Integer age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
