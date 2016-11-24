package com.org.iii.shine16;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

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
        //保留上面按鈕用
        MyWebViewClient client = new MyWebViewClient();
        webView.setWebViewClient(client);

        //設定JAVASCRIPT可以使用
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);

        //1.
        //webView.loadUrl("http://taichung.iiiedu.org.tw/");
        //2.   //後面的/是根目錄
        webView.loadUrl("file:///android_asset/shine.html");
        //3.
        //webView.loadData("<h1>SHINE</h1>","text/html;charset=utf-8",null);
    }

    //按鍵設定使用
    private class MyWebViewClient extends WebViewClient {
    }

    //使用B1按鈕來使用 使用javaScript的功用
    public void test1(View v){
        String name = "Eric";
        webView.loadUrl("javaScript:test1('"+name+"')");
    }

}
