package com.example.rohitkumarbhamu.fortsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class RaigarhActivity extends AppCompatActivity {

    CarouselView carouselView;
    Button mapButton;
    int[] sampleImages = {R.drawable.raigarh_1, R.drawable.raigarh_5, R.drawable.raigarh_4};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_raigarh);

        mapButton = findViewById(R.id.buttonRaigarhMap);
        mapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RaigarhActivity.this, MapsActivity.class);
                startActivity(intent);
            }
        });
        carouselView = findViewById(R.id.carouselView);
        carouselView.setPageCount(sampleImages.length);
        carouselView.setImageListener(imageListener);
    }
    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(sampleImages[position]);
        }
    };

}
