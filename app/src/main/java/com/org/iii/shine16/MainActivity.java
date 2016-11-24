package com.org.iii.shine16;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView = (WebView)findViewById(R.id.webView);
        initWebView();
    }
    private void initWebView(){
        //1.
        //webView.loadUrl("http://taichung.iiiedu.org.tw/");
        //2.   //後面的/是根目錄
        webView.loadUrl("file:///android_asset/shine.html");

    }
}
