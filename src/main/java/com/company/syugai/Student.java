package com.company.syugai;

import java.time.LocalDate;
import java.util.Objects;

public class Student {
    private String firstName;
    private String secondName;
    private boolean sex;
    private String birthday;
    private double gpa;

    public Student(String firstName, String secondName, boolean sex, String birthday, double gpa) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.sex = sex;
        this.birthday = birthday;
        this.gpa = gpa;
    }

    public Student() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return sex == student.sex &&
                Double.compare(student.gpa, gpa) == 0 &&
                Objects.equals(firstName, student.firstName) &&
                Objects.equals(secondName, student.secondName) &&
                Objects.equals(birthday, student.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, secondName, sex, birthday, gpa);
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", sex=" + sex +
                ", birthday=" + birthday +
                ", gpa=" + gpa +
                '}';
    }
}
