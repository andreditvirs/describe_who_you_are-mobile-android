package com.uwika.describewhoyouare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void profileButton(View v){
        Intent intent1 = new Intent(this, Profile.class);
        startActivity(intent1);
    }

    public void fbButton(View v){
        Intent intent1 = new Intent(this, Facebook.class);
        startActivity(intent1);
    }

    public void tweetButton(View v){
        Intent intent1 = new Intent(this, Twitter.class);
        startActivity(intent1);
    }

    public void webButton(View v){
        Intent intent1 = new Intent(this, Website.class);
        startActivity(intent1);
    }

    public void callButton(View v){
        Intent intent1 = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+"089687542332"));
        startActivity(intent1);
    }
}