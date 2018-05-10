package com.example.pc.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    BookAdapter bookAdapter;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    public void initView(){
        recyclerView = findViewById(R.id.recyclerView);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getApplicationContext(),3);
        recyclerView.setLayoutManager(gridLayoutManager);
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(R.drawable.qqq,"haha"));
        books.add(new Book(R.drawable.www,"haha"));
        books.add(new Book(R.drawable.eee,"haha"));
        books.add(new Book(R.drawable.yyy,"haha"));
        books.add(new Book(R.drawable.uuu,"haha"));
        books.add(new Book(R.drawable.iii,"haha"));
        books.add(new Book(R.drawable.ooo,"haha"));
        books.add(new Book(R.drawable.ppp,"haha"));
        books.add(new Book(R.drawable.sss,"haha"));
        bookAdapter = new BookAdapter(getApplicationContext(),books);
        recyclerView.setAdapter(bookAdapter);
    }
}
