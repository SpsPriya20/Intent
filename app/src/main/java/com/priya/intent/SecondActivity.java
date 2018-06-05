package com.priya.intent;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    public Button button;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String cart= getIntent().getStringExtra("cart");
        Toast.makeText(this,cart,Toast.LENGTH_SHORT).show();
        button=findViewById(R.id.NextBt);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ThirdActivity= new Intent(SecondActivity.this,ThirdActivity.class);
                startActivity(ThirdActivity);
            }
        });
    }
}
