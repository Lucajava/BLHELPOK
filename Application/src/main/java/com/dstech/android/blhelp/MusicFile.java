package com.dstech.android.blhelp;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

public class MusicFile extends Activity {
 Button submit;
    public static final String MUSIC = "Music";
    String scelta;
    Spinner music, music2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_file);
        music = (Spinner) findViewById(R.id.spinner1);


        addListenerOnButton();
        addListenerOnSpinnerItemSelection();
    }




    public void addListenerOnSpinnerItemSelection() {
        music = (Spinner) findViewById(R.id.spinner1);

    }

    // get the selected dropdown list value
    public void addListenerOnButton() {

        music = (Spinner) findViewById(R.id.spinner1);

        submit = (Button) findViewById(R.id.btnSubmit);

        submit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

              scelta= String.valueOf(music.getSelectedItem());
Log.d("scelta", scelta);
                SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();

                editor.putString("key_music", scelta);  // Saving string

// Save the changes in SharedPreferences
                editor.commit(); // commit changes

            }

        });
    }
}

