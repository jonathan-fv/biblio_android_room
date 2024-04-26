package com.example.biblio.db;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;
@Dao
public interface BookDao {
    @Query("SELECT * FROM book")
    List<Book> getAllBooks();

    @Insert
    void insertBook(Book... book);

    @Delete
    void deleteBook(Book... book);
}

