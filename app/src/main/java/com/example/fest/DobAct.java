package com.example.fest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DobAct extends AppCompatActivity {
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dob);
        back = (Button) findViewById(R.id.button5);
    }

    public void goback(View v) {
        Intent i = new Intent(this,Register.class);
        startActivity(i);
        finish();
    }
}
