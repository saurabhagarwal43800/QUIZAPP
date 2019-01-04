package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
TextView question;
RadioGroup rg;
RadioButton rb1,rb2,rb3,rb4;
Button b;
int count=0,co=0;
TextView scoreCounter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        question = findViewById(R.id.question);
        rg = findViewById(R.id.rg);
        rb1 = findViewById(R.id.rb1);
        rb2 = findViewById(R.id.rb2);
        rb3 = findViewById(R.id.rb3);
        rb4 = findViewById(R.id.rb4);
        b = findViewById(R.id.b);
        scoreCounter=findViewById(R.id.score);


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                co++;
                switch (co) {
                    case 1:
                        if (rg.getCheckedRadioButtonId() == R.id.rb2) {
                            count++;
                        }
                        scoreCounter.setText("Your Score: " + count);
                        rg.clearCheck();
                        question.setText("Q2.How does the tournament end?");
                        rb1.setText("Goku defeats Hit");
                        rb2.setText("Hit fakes being defeated by Monaka");
                        rb3.setText("Vegita defeated Hit");
                        rb4.setText(" Universe 6 wins");

                        break;
                    case 2:
                        if (rg.getCheckedRadioButtonId() == R.id.rb2) {
                            count++;
                        }
                        scoreCounter.setText("Your Score: " + count);
                        rg.clearCheck();
                        question.setText("Q3.Which past character makes a return in arc following the Universe 6 Saga?");
                        rb1.setText("Bardock");
                        rb2.setText("Cell");
                        rb3.setText("Future Trunks");
                        rb4.setText("Broly");


                        break;
                    case 3:
                        if (rg.getCheckedRadioButtonId() == R.id.rb3) {
                            count++;
                        }
                        scoreCounter.setText("Your Score: " + count);
                        rg.clearCheck();
                        question.setText("Q4.Who is the new villain for the Future Trunks arc??");
                        rb1.setText("Frieza");
                        rb2.setText("Beerus");
                        rb3.setText("Majin Buu");
                        rb4.setText("Black");

                        rg.clearCheck();
                        break;
                    case 4:
                        if (rg.getCheckedRadioButtonId() == R.id.rb4) {
                            count++;
                        }
                        scoreCounter.setText("Your Score: " + count);
                        question.setText("Q5.How do Goku, Trunks, and Vegeta get rid of Zamasu?");
                        rb1.setText("Goku kills him");
                        rb2.setText("Zen-Oh destroys Future Trunks' universe");
                        rb3.setText("Vegeta kills him");
                        rb4.setText("Vegetto kills him");
                        rg.clearCheck();
                        break;
                    case 5:if (rg.getCheckedRadioButtonId() == R.id.rb2) {
                        count++;
                    }

                       scoreCounter.setTextSize(60);
                        scoreCounter.setText("Final Score: " + count);
                       /** question.setText("");
                        rb1.setText("");
                        rb1.clearAnimation();
                        rb2.setText("");
                        rb3.setText("");
                        rb4.setText("");
                        b.setText("");
                        b.setBackgroundColor(111111);**/
                        rg.clearCheck();
                        break;
                }

            }

        });

    }
   /** public void next(View view)
    {
        Intent intent=new Intent(this,Main2Activity.class);
        intent.putExtra("Score",count);
        startActivity(intent);
    }**/
        }
