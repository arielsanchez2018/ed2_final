package com.example.ed2_image_ariel_sanchez;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Ed2 Image Test Room Mapping");

        img=(ImageView)findViewById(R.id.imageroom);
        Glide.with(this).load("https://s3.us-east-1.amazonaws.com/arieled2/room_mapping/test.jpg").into(img);

    }
}