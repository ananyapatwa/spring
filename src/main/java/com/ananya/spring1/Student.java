package com.ananya.spring1;

public class Student {
    private int studentid;
    private String studentname;
    private String studentaddress;

    public String getStudentname() {
        return studentname;
    }
    public int getStudentid() {
        return studentid;
    }
    public String getStudentaddress() {
        return studentaddress;
    }
    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }
    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public void setStudentaddress(String studentaddress) {
        this.studentaddress = studentaddress;
    }

    public Student(int studentid, String studentname, String studentaddress) {
        this.studentid = studentid;
        this.studentname = studentname;
        this.studentaddress = studentaddress;
    }
    public Student() {
        super();
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentid=" + studentid +
                ", studentname='" + studentname + '\'' +
                ", studentaddress='" + studentaddress + '\'' +
                '}';
    }
}
