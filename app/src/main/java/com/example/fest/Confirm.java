package com.example.fest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.TextView;
import android.widget.Button;

public class Confirm extends AppCompatActivity {
    TextView nametxt;
    TextView mobiletxt;
    TextView emailtxt;
    TextView colltext;
    String nameval;
    String mobileval;
    String emailval;
    String collval;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm);
        btnBack = (Button) findViewById(R.id.button2);
        nametxt = (TextView) findViewById(R.id.textView11);
        mobiletxt = (TextView) findViewById(R.id.textView10);
        emailtxt = (TextView) findViewById(R.id.textView12);
        colltext = (TextView) findViewById(R.id.textView13);
        nameval = getIntent().getExtras().getString("Value");
        nametxt.setText(nameval);
        mobileval = getIntent().getExtras().getString("Value2");
        mobiletxt.setText(mobileval);
        emailval = getIntent().getExtras().getString("Value3");
        emailtxt.setText(emailval);
        collval = getIntent().getExtras().getString("Value4");
        colltext.setText(collval);
    }

    public void btnRet(View v){
        Intent i = new Intent(this,Register.class);
        startActivity(i);
        finish();
    }

}
