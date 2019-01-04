package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
       /** int score = getIntent().getIntExtra("Score",0);
        TextView txt2=(TextView)findViewById(R.id.txt2);
        txt2.setText(" "+score);*
        **/
    }
}
