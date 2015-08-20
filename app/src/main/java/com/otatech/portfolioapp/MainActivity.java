package com.otatech.portfolioapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

//this is where the code for the application starts
public class MainActivity extends AppCompatActivity {

    //Creating the app along with the view and other content
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Listening for the soft click of the Capstone Button
        findViewById(R.id.capstoneBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = getApplicationContext();
                CharSequence text = "This button will launch my Capstone Project App";
                int duration = Toast.LENGTH_SHORT;

                //Have some toast
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        //Listening for the sensual click of the XYZ Reader
        findViewById(R.id.xyzReaderBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = getApplicationContext();
                CharSequence text = "This button will launch my XYZ Reader App";
                int duration = Toast.LENGTH_SHORT;

                //Butter??
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        //listening for the rough click of Build it Bigger
        findViewById(R.id.buildItBiggerBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = getApplicationContext();
                CharSequence text = "This button will launch my Build It Bigger App";
                int duration = Toast.LENGTH_SHORT;

                //Jam??
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        //listening for the quiet click of the Library App
        findViewById(R.id.libraryAppBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = getApplicationContext();
                CharSequence text = "This button will launch my Library App";
                int duration = Toast.LENGTH_SHORT;

                //Whats the difference between Jam and Jelly?
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        //Listening for the loud click of the Scores App
        findViewById(R.id.scoresAppBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = getApplicationContext();
                CharSequence text = "This button will launch my Scores App";
                int duration = Toast.LENGTH_SHORT;

                //The spellings...
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        //listening for the voyeuristic click of the Spotify Streamer....
        findViewById(R.id.spotifyBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = getApplicationContext();
                CharSequence text = "This button will launch my Spotify Streamer App";
                int duration = Toast.LENGTH_SHORT;

                //What does voyeuristic even sound like???
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
    }

    //Here's our menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    long lastPress;
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.action_settings) {
            //lets stick a quit in here for the time being...
            long currentTime = System.currentTimeMillis();
            if(currentTime - lastPress > 5000){
                Toast.makeText(getBaseContext(), "Press back to exit", Toast.LENGTH_LONG).show();
                lastPress = currentTime;
            }else{
                super.onBackPressed();
            }
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
