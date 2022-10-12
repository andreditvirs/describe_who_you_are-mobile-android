package com.uwika.describewhoyouare;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class Website extends AppCompatActivity {

    WebView wv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_website);

        wv1 = findViewById(R.id.webview1);
        wv1.getSettings().setJavaScriptEnabled(true);
        wv1.loadUrl("https://andreditvirs.github.io");
        wv1.reload();
    }
}