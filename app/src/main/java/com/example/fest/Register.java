package com.example.fest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    Button btnRegister;
    Button snkbar;
    Button btninp;
    EditText editTextname;
    String editTextnameval;
    EditText editTextnum;
    String editTextnumval;
    EditText editTextemail;
    String editTextemailval;
    EditText editTextcoll;
    String editTextcollval;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        btnRegister = (Button) findViewById(R.id.button);
        btninp = (Button) findViewById(R.id.button13);
        snkbar = (Button) findViewById(R.id.button6);
        editTextname = (EditText) findViewById(R.id.editText);
        editTextnum = (EditText) findViewById(R.id.editText2);
        editTextemail = (EditText) findViewById(R.id.editText3);
        editTextcoll = (EditText) findViewById(R.id.editText4);
    }

    public void btnClkReg(View v){
        Toast.makeText(this,"DETAILS SUBMITTED SUCCESSFULLY",Toast.LENGTH_SHORT).show();
        Intent i = new Intent(this,Confirm.class);
        editTextnameval = editTextname.getText().toString();
        i.putExtra("Value",editTextnameval);
        editTextnumval = editTextnum.getText().toString();
        i.putExtra("Value2",editTextnumval);
        editTextemailval = editTextemail.getText().toString();
        i.putExtra("Value3",editTextemailval);
        editTextcollval = editTextcoll.getText().toString();
        i.putExtra("Value4",editTextcollval);
        startActivity(i);
        finish();
    }

    public void btnsnk(View v) {
        Intent i = new Intent(this,Snack.class);
        startActivity(i);
        finish();
    }

    public void btninp(View v){
        Intent i = new Intent(this,Inputcont.class);
        startActivity(i);
        finish();
    }
}
