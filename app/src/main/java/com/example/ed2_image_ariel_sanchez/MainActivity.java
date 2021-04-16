package com.example.ed2_image_ariel_sanchez;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

public class MainActivity extends AppCompatActivity {

    private Handler mHandler = new Handler();

    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Ed2 Image Test Room Mapping");
        //img=(ImageView)findViewById(R.id.imageroom);

    }


    public void onClick(View view){
        img=(ImageView)findViewById(R.id.imageroom);
        //for(int i=0; i ==1000000;i++){
          /* Glide.with(this).load("https://s3.us-east-1.amazonaws.com/arieled2/room_mapping/test.jpg").diskCacheStrategy(DiskCacheStrategy.NONE)
                    .skipMemoryCache(true).into(img);
            */
        //}
            mImageRunnable.run();
        }

      public Runnable mImageRunnable = new Runnable() {
          @Override
          public void run() {
             // Glide.with(MainActivity.this).load("https://s3.us-east-1.amazonaws.com/arieled2/room_mapping/test.jpg").diskCacheStrategy(DiskCacheStrategy.NONE)
               //       .skipMemoryCache(true).into(img);
              Glide.with(MainActivity.this).load("https://s3.us-east-1.amazonaws.com/arieled2/room_mapping/test.jpg").placeholder(img.getDrawable()).diskCacheStrategy(DiskCacheStrategy.NONE)
                      .skipMemoryCache(true).into(img);
              mHandler.postDelayed(this,600);
          }
      };



}