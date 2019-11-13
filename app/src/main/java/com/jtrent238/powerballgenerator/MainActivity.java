package com.jtrent238.powerballgenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public static int getRandomIntegerBetweenRange(int min, int max){
        int x = (int)(Math.random()*((max-min)+1))+min;
        return x;
    }

    public void generateRandomNumber(View view) {
        Button btn = findViewById(R.id.buttonGenerate);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView randomNumber1 = findViewById(R.id.randomNumber1);
                TextView randomNumber2 = findViewById(R.id.randomNumber2);
                TextView randomNumber3 = findViewById(R.id.randomNumber3);
                TextView randomNumber4 = findViewById(R.id.randomNumber4);
                TextView randomNumber5 = findViewById(R.id.randomNumber5);

                randomNumber1.setText(Integer.toString(getRandomIntegerBetweenRange(1, 69)));
                randomNumber2.setText(Integer.toString(getRandomIntegerBetweenRange(1, 69)));
                randomNumber3.setText(Integer.toString(getRandomIntegerBetweenRange(1, 69)));
                randomNumber4.setText(Integer.toString(getRandomIntegerBetweenRange(1, 69)));
                randomNumber5.setText(Integer.toString(getRandomIntegerBetweenRange(1, 26)));
            }
        });
    }


    public void clearNumbers(View view) {

        Button btn = findViewById(R.id.buttonClear);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView randomNumber1 = findViewById(R.id.randomNumber1);
                TextView randomNumber2 = findViewById(R.id.randomNumber2);
                TextView randomNumber3 = findViewById(R.id.randomNumber3);
                TextView randomNumber4 = findViewById(R.id.randomNumber4);
                TextView randomNumber5 = findViewById(R.id.randomNumber5);

                randomNumber1.setText(null);
                randomNumber2.setText(null);
                randomNumber3.setText(null);
                randomNumber4.setText(null);
                randomNumber5.setText(null);

            }
        });
    }

    public void youClickedMe(View view) {

        Button btn = findViewById(R.id.buttonNo);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, YUCLICKME.class));
            }
        });
    }
}
