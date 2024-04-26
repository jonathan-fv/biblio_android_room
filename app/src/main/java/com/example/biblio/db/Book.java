package com.example.biblio.db;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Book {
    @PrimaryKey(autoGenerate = true)
    public int uid;
    @ColumnInfo(name = "title")
    public String title;
    @ColumnInfo(name = "author")
    public String author;

    @ColumnInfo(name = "resume")
    public String resume;

    @ColumnInfo(name = "isbn")
    public String isbn;

    @ColumnInfo(name = "nb_pages")
    public String nb_pages;
}
