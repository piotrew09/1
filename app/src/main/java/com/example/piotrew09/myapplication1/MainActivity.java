package com.example.piotrew09.myapplication1;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView view = (TextView) findViewById(R.id.aaaaaa);
        view.setText("abcd");
        ImageView imageView = (ImageView) findViewById(R.id.ccccc);
        imageView.setImageResource(R.drawable.ic_launcher);
    }
}
