package com.priya.intent;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class IntentResultActivity extends AppCompatActivity {

    public TextView hi;
    public Button getname;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intentresultactivity);

        hi=findViewById(R.id.buttonTv);
        getname=findViewById(R.id.Get_Name);

        getname.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent result = new Intent(IntentResultActivity.this,NameActivity.class);
                startActivity(result);

            }
        });
    }
}
