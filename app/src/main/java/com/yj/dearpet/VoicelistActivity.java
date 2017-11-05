package com.yj.dearpet;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by yunjisim on 2017. 11. 5..
 */


public class VoicelistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voicelist);


        Button device1btn = (Button) findViewById(R.id.voice1btn);
        device1btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), GovoiceActivity.class);
                startActivity(intent);
            }
    });
  }
}




