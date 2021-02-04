package com.example.roomdatabase;

import android.content.Context;
import android.widget.Toast;

import androidx.room.Room;

public class StudentRepository {

    private String DB_Name="databaseGame.db";
    private StudentDatabase studentDatabase;
    private Context context;


    public StudentRepository(Context context) {
        this.context = context;
        studentDatabase= Room.databaseBuilder(
                context,StudentDatabase.class,
                "databaseGame.db"
        ).build();


        Toast.makeText(context,"Database Creation Sucessful",Toast.LENGTH_SHORT).show();
    }
}
