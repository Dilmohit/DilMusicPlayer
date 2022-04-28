package com.diltech.dilmusicplayer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

public class AboutUsActivity extends AppCompatActivity {

    ImageView imgTwitter, imgDevcomm;

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == android.R.id.home){
            onBackPressed();
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        // This code is for hiding Status bar in this Activity
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        getSupportActionBar().setTitle("About Us");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        imgTwitter = findViewById(R.id.imgTwitter);
        imgDevcomm = findViewById(R.id.imgDevComm);

        imgTwitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent twitterIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/Dilmohit007"));
                startActivity(twitterIntent);
            }
        });

        imgDevcomm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent devcommIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://dev.to/dilmohit"));
                startActivity(devcommIntent);
            }
        });
    }
}