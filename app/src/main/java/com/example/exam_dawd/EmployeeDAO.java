package com.example.exam_dawd;

import java.util.List;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import static androidx.room.OnConflictStrategy.REPLACE;

public interface EmployeeDAO {
    @Insert(onConflict = REPLACE)
    void insertEmployee(Employees employeeEntity);

    @Update
    void updateEmployee(Employees employeeEntity);

    @Delete
    void deleteEmployee(Employees employeeEntity);

    @Query("SELECT * FROM Employee")
    List<Employees> getAllBookmark();

    @Query("SELECT * FROM Employee WHERE id = :id")
    Employees getBookmark(int id);

    @Query("DELETE  FROM Employee")
    void deleteAll();

}
