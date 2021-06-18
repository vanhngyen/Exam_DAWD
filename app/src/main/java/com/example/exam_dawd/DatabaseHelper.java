package com.example.exam_dawd;


import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.exam_dawd.EmployeeDAO;
import com.example.exam_dawd.Employees;

@Database(entities = {Employees.class},version = 1)
public abstract class DatabaseHelper extends RoomDatabase {
    private static DatabaseHelper appDatabase;
    public abstract EmployeeDAO employeeDao();

    public static DatabaseHelper getAppDatabase(Context context){
        if (appDatabase == null){
            appDatabase = Room.databaseBuilder(context,
                    DatabaseHelper.class,"News").allowMainThreadQueries().build();
        }
        return appDatabase;
    }
}
