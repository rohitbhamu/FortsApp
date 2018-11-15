package com.example.rohitkumarbhamu.fortsapp;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.support.v7.widget.Toolbar;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

//for animation in opening new activity
import static maes.tech.intentanim.CustomIntent.customType;


public class MainActivity extends AppCompatActivity {

    CarouselView carouselView;
    int[] sampleImages = {R.drawable.image_1 , R.drawable.image_6, R.drawable.image_3, R.drawable.image_4, R.drawable.image_5};
    CardView raigarhView,lohagarhView,shanivarwadaView,sindhugarhView,tornaView,panhalaView,janjiraView,daultabadView,yashwantgarhView,sinhagarhView,partapgarhView,kandharView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
       // setSupportActionBar(toolbar);

        carouselView = findViewById(R.id.carouselView);
        carouselView.setPageCount(sampleImages.length);
        carouselView.setImageListener(imageListener);

        raigarhView = findViewById(R.id.cardViewRaigadh);
        lohagarhView = findViewById(R.id.cardViewLohagadh);
        shanivarwadaView = findViewById(R.id.cardViewShanivarwada);
        sindhugarhView = findViewById(R.id.cardViewSindhugarh);
        tornaView = findViewById(R.id.cardViewTorna);
        panhalaView = findViewById(R.id.cardViewPanhala);
        janjiraView = findViewById(R.id.cardViewJanjira);
        daultabadView = findViewById(R.id.cardViewDaulatabad);
        yashwantgarhView = findViewById(R.id.cardViewYashwantgarh);
        sinhagarhView = findViewById(R.id.cardViewSinhagarh);
        partapgarhView = findViewById(R.id.cardViewPartapgarh);
        kandharView = findViewById(R.id.cardViewKandhar);

        raigarhView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RaigarhActivity.class);
                startActivity(intent);
                customType(MainActivity.this,"left-to-right");
            }
        });
        lohagarhView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LohagarhActivity.class);
                startActivity(intent);
                customType(MainActivity.this,"left-to-right");

            }
        });

        shanivarwadaView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ShanivarwadaActivity.class);
                startActivity(intent);
                customType(MainActivity.this,"right-to-left");

            }
        });
        sindhugarhView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SindhugarhActivity.class);
                startActivity(intent);
                customType(MainActivity.this,"right-to-left");

            }
        });
        tornaView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TornaActivity.class);
                startActivity(intent);
                customType(MainActivity.this,"bottom-to-up");

            }
        });
        panhalaView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, panhalaActivity.class);
                startActivity(intent);
                customType(MainActivity.this,"bottom-to-up");

            }
        });
        janjiraView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, JanjiraActivity.class);
                startActivity(intent);
                customType(MainActivity.this,"up-to-bottom");

            }
        });
        daultabadView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DaulatabadActivity.class);
                startActivity(intent);
                customType(MainActivity.this,"up-to-bottom");

            }
        });
        yashwantgarhView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, YashwantgarhActivity.class);
                startActivity(intent);
                customType(MainActivity.this,"fadein-to-fadeout");

            }
        });
        sinhagarhView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SinhagarhActivity.class);
                startActivity(intent);
                customType(MainActivity.this,"fadein-to-fadeout");

            }
        });
        partapgarhView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PratapgarhActivity.class);
                startActivity(intent);
                customType(MainActivity.this,"rotateout-to-rotatein");

            }
        });
        kandharView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, KandharActivity.class);
                startActivity(intent);
                customType(MainActivity.this,"rotateout-to-rotatein");

            }
        });




        //floating button on the downside right corner

    /*    FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        */
    }

    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(sampleImages[position]);
        }
    };





    //to add menu on the top

/*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings1) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    */
}