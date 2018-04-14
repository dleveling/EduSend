package com.example.pcx.edusend;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Book_Activity extends AppCompatActivity {

    private TextView tvtitle,tvDescrip,tvcategory;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_);

        tvtitle = (TextView) findViewById(R.id.txttitle);
        tvcategory = (TextView) findViewById(R.id.txtCat);
        tvDescrip = (TextView) findViewById(R.id.txtDes);
        img = (ImageView) findViewById(R.id.bookthumbnail);

    //Recieve Data
    Intent intent = getIntent();
    String Title = intent.getExtras().getString("Title");
    String category = intent.getExtras().getString("cate");
    String Descrip = intent.getExtras().getString("Description");
    int imgintent =  intent.getExtras().getInt("Thumbnail");

    //Setting Values

        tvtitle.setText(Title);
        tvcategory.setText(category);
        tvDescrip.setText(Descrip);
        img.setImageResource(imgintent);

    }
}
