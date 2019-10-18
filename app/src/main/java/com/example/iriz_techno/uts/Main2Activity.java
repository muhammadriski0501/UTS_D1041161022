package com.example.iriz_techno.uts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button btn_activity = (Button) findViewById(R.id.b_activity);

        btn_activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent= new Intent(Main2Activity.this,kompenen_activity.class);
                startActivity(intent);
                        }
            }
        );

        Button btn_service = (Button) findViewById(R.id.b_SERVICE);

        btn_service.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent_service= new Intent(Main2Activity.this,k_service.class);
                    startActivity(intent_service);
                }}
        );

        Button btn_view = (Button) findViewById(R.id.b_view);

        btn_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_view= new Intent(Main2Activity.this,k_view.class);
                startActivity(intent_view);
            }}
        );

        Button btn_intent = (Button) findViewById(R.id.b_intent);

        btn_intent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_intent= new Intent(Main2Activity.this,k_intent.class);
                startActivity(intent_intent);
            }}
        );

        Button btn_fragment = (Button) findViewById(R.id.b_fragment);

        btn_fragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_fragment= new Intent(Main2Activity.this,k_fragment.class);
                startActivity(intent_fragment);
            }}
        );
    }
}
