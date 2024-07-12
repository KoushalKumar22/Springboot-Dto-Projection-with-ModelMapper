package com.example.ProjectionMapper.DTO;

public class SearchDto {
    int id;
    String fname;

    String lname;

//    int sal;
//
//    public SearchDto(int id, String fname, String lname, int sal) {
//        this.id = id;
//        this.fname = fname;
//        this.lname = lname;
//        this.sal = sal;
//    }
//
//
//    public int getSal() {
//        return sal;
//    }
//
//    public void setSal(int sal) {
//        this.sal = sal;
//    }


    public SearchDto(int id, String fname, String lname) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
    }

    public SearchDto() {
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
}
