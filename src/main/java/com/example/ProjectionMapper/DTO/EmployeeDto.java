package com.example.ProjectionMapper.DTO;

public class EmployeeDto {

    int id;
    String fname;
    String lname;
    int sal;
    String city;

    public EmployeeDto(int id, String fname, String lname, int sal, String city) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.sal = sal;
        this.city = city;
    }

    public EmployeeDto(int id, String fname, String lname) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
