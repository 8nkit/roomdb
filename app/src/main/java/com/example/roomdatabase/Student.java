package com.example.roomdatabase;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Student {

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
