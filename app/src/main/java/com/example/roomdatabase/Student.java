package com.example.roomdatabase;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Student {
    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactno() {
        return contactno;
    }

    public void setContactno(String contactno) {
        this.contactno = contactno;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @NonNull
    @PrimaryKey
    private String rollno;
    @ColumnInfo(name = "Name")
    private String name;
    @ColumnInfo(name = "Contact_No")
    private String contactno;
    @ColumnInfo(name = "Gender")
    private String gender;


    public Student(String rollno, String name, String contactno, String gender) {
        this.rollno = rollno;
        this.name = name;
        this.contactno = contactno;
        this.gender = gender;
    }
}
