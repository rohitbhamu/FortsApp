package com.example.rohitkumarbhamu.fortsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class ShanivarwadaActivity extends AppCompatActivity {

    CarouselView carouselView;
    int[] sampleImages = {R.drawable.shanivarwada_1, R.drawable.shanivarwada_2, R.drawable.shanivarwada_3};
    Button mapButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shanivarwada);


        mapButton = findViewById(R.id.buttonShanivarwadaMap);
        mapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShanivarwadaActivity.this, MapsActivity.class);
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
