package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button askButton = findViewById(R.id.button);
        final ImageView answerImage = findViewById(R.id.answerball);
        final int[] answersArray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        final Random randomNumGenerator = new Random();


        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("MagicBall", "O botão foi pressionado!!");
                //int number = randomNumGenerator.nextInt(5);
                answerImage.setImageResource(answersArray[randomNumGenerator.nextInt(5)]);
            }
        });

    }


}
