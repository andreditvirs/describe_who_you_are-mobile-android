package com.uwika.describewhoyouare;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class Facebook extends AppCompatActivity {

    WebView wv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook);

        wv1 = findViewById(R.id.webview3);
        wv1.getSettings().setJavaScriptEnabled(true);
        wv1.loadUrl("https://www.facebook.com/AndreDitVirs");
        wv1.reload();
    }
}