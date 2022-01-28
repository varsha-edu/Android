package com.example.firstexperiment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.QuickContactBadge;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 TextView tv;
 Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //initialize button and textview
        tv = (TextView) findViewById(R.id.text);
        btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             btn.setTextSize(20);
             tv.setText("Hello there ");
             tv.setTextSize(18);

             btn.setBackgroundColor(Color.parseColor());
            }
        });
    }
}