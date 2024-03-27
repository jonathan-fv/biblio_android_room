package com.example.biblio.db;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class User {
    @PrimaryKey(autoGenerate = true)
    public int uid;
    @ColumnInfo(name = "firstname")
    public String firstName;
    @ColumnInfo(name = "lastname")
    public String lastName;
}
