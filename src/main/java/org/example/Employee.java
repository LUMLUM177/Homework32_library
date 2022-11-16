package org.example;

import org.apache.commons.lang3.StringUtils;

import java.util.concurrent.atomic.AtomicInteger;

public class Employee {
    private static final AtomicInteger COUNTER = new AtomicInteger(1);

    private final int id;
    private String firstName;
    private String lastName;
    private int department;
    private double salary;

    public Employee(String firstName, String lastName, int department, double salary) {
        id = COUNTER.getAndIncrement();
        setFirstName(firstName);
        setLastName(lastName);
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setFirstName(String firstName) {
        if (StringUtils.isBlank(firstName) || !StringUtils.isAlphaSpace(firstName)) {
            throw new RuntimeException("400 Bad Request");
        }
        this.firstName = StringUtils.capitalize(firstName);
    }

    public void setLastName(String lastName) {
        if (StringUtils.isBlank(lastName) || !StringUtils.isAlphaSpace(lastName)) {
            throw new RuntimeException("400 Bad Request");
        }
        this.lastName = StringUtils.capitalize(lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }





    public String toString() {
        return getId() + ": " + getFirstName() + " " + getLastName() + " работает в " + getDepartment()
                + " отделе, зарплата составляет " + getSalary() + " рублей.";
    }


}
