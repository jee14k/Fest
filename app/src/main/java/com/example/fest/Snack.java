package com.example.fest;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Snack extends AppCompatActivity {
    boolean playing = false;
    Button play;
    Button pause;
    Button stop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snack);

        play = (Button) findViewById(R.id.button5);
        pause = (Button) findViewById(R.id.button9);
        stop = (Button) findViewById(R.id.button12);
        final MediaPlayer mp=MediaPlayer.create(getBaseContext(),R.raw.christt_university_anthem);
        play.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(!playing){
                    mp.start();
                    playing=true;
                    ProgressDialog pds = new ProgressDialog(Snack.this);
                    pds.setProgressStyle(ProgressDialog.STYLE_SPINNER);
                    pds.setMessage("Playing song");
                    pds.setIndeterminate(true);
                    pds.setCancelable(true);
                    pds.show();
                }

            }

        });
        pause.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(playing){
                    mp.pause();
                    playing=false;
                }
            }
        });
        stop.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (playing) {
                    mp.stop();
                    playing = false;
                }

            }
        });
    }

    public void snksimp(View v){
        Snackbar snackbar = Snackbar.make(v,"Level 1",Snackbar.LENGTH_LONG);
        snackbar.show();
    }

    public void snkactcall(View v){
        Snackbar snackbar = Snackbar
                .make(v, "Message is deleted", Snackbar.LENGTH_LONG)
                .setAction("UNDO", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Snackbar snackbar1 = Snackbar.make(view, "Message is restored!", Snackbar.LENGTH_SHORT);
                        snackbar1.show();
                    }
                });
        snackbar.show();
    }

    public void snkcol(View v) {
        Snackbar snackbar = Snackbar
                .make(v, "No internet connection!", Snackbar.LENGTH_LONG)
                .setAction("RETRY", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                    }
                });

        // Changing message text color
        snackbar.setActionTextColor(Color.RED);

        // Changing action button text color
        View sbView = snackbar.getView();
        TextView textView = (TextView) sbView.findViewById(android.support.design.R.id.snackbar_text);
        textView.setTextColor(Color.YELLOW);
        snackbar.show();
    }

    public void backbtn(View v) {
        Intent i = new Intent(this,Register.class);
        startActivity(i);
        finish();
    }
}
