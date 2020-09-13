package com.example.mathapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageButton btnMathPlay, btnMathShare, btnMathRate;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton btnMathPlay = (ImageButton) findViewById(R.id.btnMathPlay);
       ImageButton  btnMathShare= (ImageButton) findViewById(R.id.btnMathShare);
       ImageButton btnMathRate = (ImageButton) findViewById(R.id.btnMathRate);

       btnMathPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*
                 *  Example of Explicit Intent
                 *  When you click Play Button on the screen
                 *  Game Activity will be started
                 */

                Intent i = new Intent(MainActivity.this,GameActivity.class);
                startActivity(i);
            }
        });

        btnMathShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*
                 *  Example of Implict Intent
                 *  When you click Share Button on the screen
                 *  Android will find the activities that allow to share messages.
                 */

                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT, "Just Maths - Fun way to learn Maths. http://www.play.google.com");
                startActivity(intent);
            }
        });

        btnMathRate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*
                 *  Simple Toast Message To Display MessaOge For Short Duration
                 *  Link that to your app landing page.
                 */
                Toast.makeText(MainActivity.this,"You can open your Google Play landing page", Toast.LENGTH_LONG).show();
            }
        });

    }
}