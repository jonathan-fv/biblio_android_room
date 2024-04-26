package com.example.biblio;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.biblio.db.AppDatabase;
import com.example.biblio.db.Book;

public class AddNewBookActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_book);
        final EditText titleInput = findViewById(R.id.titleInput);
        final EditText authorInput = findViewById(R.id.authorInput);
        final EditText resumeInput = findViewById(R.id.resumeInput);
        final EditText isbnInput = findViewById(R.id.isbnInput);
        final EditText nb_pagesInput = findViewById(R.id.nb_pagesInput);
        Button saveBookButton = findViewById(R.id.saveBookButton);
        saveBookButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveNewBook(titleInput.getText().toString(),authorInput.getText().toString(),resumeInput.getText().toString(), isbnInput.getText().toString(), nb_pagesInput.getText().toString());

            }
        });
    }

    private void saveNewBook(String title, String author, String resume, String isbn, String nb_pages){
        AppDatabase db = AppDatabase.getDbInstance(this.getApplicationContext());
        Book book = new Book();
        book.title = title;
        book.author = author;
        book.resume = resume;
        book.isbn = isbn;
        book.nb_pages = nb_pages;
        db.bookDao().insertBook(book);

        finish();
    }
}
