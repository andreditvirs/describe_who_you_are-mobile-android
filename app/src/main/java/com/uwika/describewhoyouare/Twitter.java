package com.uwika.describewhoyouare;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class Twitter extends AppCompatActivity {

    WebView wv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twitter);

        wv1 = findViewById(R.id.webview2);
        wv1.getSettings().setJavaScriptEnabled(true);
        wv1.loadUrl("https://twitter.com/andre_saputra01");
        wv1.reload();
    }
}