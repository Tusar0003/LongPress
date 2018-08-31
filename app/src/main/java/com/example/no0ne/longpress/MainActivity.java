package com.example.no0ne.longpress;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setLongPressMethod();
    }

    public void setLongPressMethod() {
        TextView textView = (TextView) findViewById(R.id.textView);

        textView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(MainActivity.this, "You Have Pressed it Long :)", Toast.LENGTH_SHORT).show();

                return true;
            }
        });


        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Not Long Enough", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
