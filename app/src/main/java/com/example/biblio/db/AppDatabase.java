package com.example.biblio.db;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {User.class, Book.class}, version=1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract UserDao userDao();
    public abstract BookDao bookDao();
    private static AppDatabase INSTANCE;
    public static AppDatabase getDbInstance(Context context){
        if(INSTANCE == null){
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                    AppDatabase.class, "LibraryProject.db")
                    .allowMainThreadQueries()
                    .build();
        }
        return INSTANCE;
    }

}
