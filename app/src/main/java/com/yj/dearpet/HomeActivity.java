package com.yj.dearpet;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button 음성들려주기btn = (Button) findViewById(R.id.음성들려주기btn);

        음성들려주기btn.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ConnectionActivity.class);
                startActivity(intent);

            }

        });


        Button 음성녹음하기btn = (Button) findViewById(R.id.음성녹음하기btn);
        음성녹음하기btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ConnectionActivity.class);
                startActivity(intent);

            }


        });

    }
}
