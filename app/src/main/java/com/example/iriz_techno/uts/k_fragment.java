package com.example.iriz_techno.uts;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class k_fragment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_k_fragment);

        Button btn_syntax = (Button) findViewById(R.id.b_syntax);

        btn_syntax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(k_fragment.this,s_fragment.class);
                startActivity(intent);
            }}
        );
        Button btn_link = (Button) findViewById(R.id.b_link);

        btn_link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_link = new Intent(Intent.ACTION_VIEW);
                intent_link.setData(Uri.parse("https://www.codepolitan.com/membuat-dan-menggunakan-fragment-59f80eff061a4"));
                startActivity(intent_link);
            }}
        );
    }
}
