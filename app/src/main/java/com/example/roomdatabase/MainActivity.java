package com.example.roomdatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StudentRepository repository=new StudentRepository(getApplicationContext());
        Student student=new Student("101","James Trudo","238293819","M");
        Student student2=new Student("102","Frank K. Trudo","238293819","M");
        repository.InsertTask(student);
        repository.InsertTask(student2);
    }
}