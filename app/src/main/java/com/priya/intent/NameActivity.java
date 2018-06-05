package com.priya.intent;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NameActivity extends AppCompatActivity {

    public EditText name;
    public Button submit;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.name_activity);

        name=findViewById(R.id.NameEt);
        submit=findViewById(R.id.submitBt);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Name = name.getText().toString();
                Intent data = new Intent();
                data.putExtra("name",Name);
                setResult(RESULT_OK,data);
                finish();
            }

        });
    }
}
