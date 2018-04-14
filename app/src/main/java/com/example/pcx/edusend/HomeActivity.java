package com.example.pcx.edusend;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    List<Book> lstBook;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        lstBook = new ArrayList<>();
        lstBook.add(new Book("The Test Book","Sci-Fi","A Sci-Fi Book",R.drawable.img1));
        lstBook.add(new Book("The Test Book2","Sci-Fi2","A Sci-Fi Book2",R.drawable.img1));
        lstBook.add(new Book("The Test Book3","Sci-Fi3","A Sci-Fi Book3",R.drawable.img1));
        lstBook.add(new Book("The Test Book4","Sci-Fi4","A Sci-Fi Book4",R.drawable.img1));
        lstBook.add(new Book("The Test Book5","Sci-Fi5","A Sci-Fi Book5",R.drawable.img1));
        lstBook.add(new Book("The Test Book6","Sci-Fi6","A Sci-Fi Book6",R.drawable.img1));

        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,lstBook);
        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv.setAdapter(myAdapter);
        //testGIT
    }
}
