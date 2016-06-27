package com.ingsoft.magic_assistant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class DiceActivity extends AppCompatActivity {

    Button b_roll;
    ImageView iv_dice;
    Random r;
    int rolledNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice);

        b_roll = (Button) findViewById(R.id.b_roll);
        iv_dice = (ImageView) findViewById(R.id.iv_dice);
        r = new Random();
        b_roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rolledNumber = r.nextInt(7) + 1;
                if (rolledNumber == 1){
                    iv_dice.setImageResource(R.drawable.dice1);
                }
                if (rolledNumber == 2){
                    iv_dice.setImageResource(R.drawable.dice2);
                }
                if (rolledNumber == 3){
                    iv_dice.setImageResource(R.drawable.dice3);
                }
                if (rolledNumber == 4){
                    iv_dice.setImageResource(R.drawable.dice4);
                }
                if (rolledNumber == 5){
                    iv_dice.setImageResource(R.drawable.dice5);
                }
                if (rolledNumber == 6){
                    iv_dice.setImageResource(R.drawable.dice6);
                }
                if (rolledNumber == 7){
                    iv_dice.setImageResource(R.drawable.dice7);
                }
                Toast.makeText(DiceActivity.this, "Lanzado " ,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
