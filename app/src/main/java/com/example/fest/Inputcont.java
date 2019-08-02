package com.example.fest;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;
import android.app.AlertDialog;

public class Inputcont extends AppCompatActivity {
    CheckBox pizza,coffee,burger;
    Button button_order;
    AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inputcont);
        pizza = (CheckBox) findViewById(R.id.checkBox);
        coffee = (CheckBox) findViewById(R.id.checkBox2);
        burger = (CheckBox) findViewById(R.id.checkBox3);
        button_order = (Button) findViewById(R.id.button);
        builder = new AlertDialog.Builder(this);
    }

    public void addListenerOnButtonClick(View v)
    {
                int totalamount = 0;
                StringBuilder result = new StringBuilder();
                result.append("Selected Items:");
                if (pizza.isChecked()) {
                    result.append("\n Pizza 100 Rs");
                    totalamount += 100;
                }
                if (coffee.isChecked()) {
                    result.append("\n Coffee 50 Rs");
                    totalamount += 50;
                }
                if (burger.isChecked()) {
                    result.append("\n Burger 120 Rs");
                    totalamount += 120;
                }

                result.append("\n Total : " + totalamount + "Rs");
                Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();
    }

    public void cancelord(View v)
    {
        builder.setMessage("Do you want to close this application ?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        finish();
                        Toast.makeText(getApplicationContext(),"Application closed",
                                Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        //  Action for 'NO' Button
                        dialog.cancel();
                        Toast.makeText(getApplicationContext(),"Application Recovered",
                                Toast.LENGTH_SHORT).show();
                    }
                });
        //Creating dialog box
        AlertDialog alert = builder.create();
        //Setting the title manually
        alert.setTitle("ALERT!!!");
        alert.show();
    }
}