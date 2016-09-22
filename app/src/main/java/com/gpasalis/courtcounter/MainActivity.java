package com.gpasalis.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView scoreA, scoreB;
    private int score_a = 0, score_b = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scoreA = (TextView) findViewById(R.id.score_a);
        scoreA.setText("" + score_a);
        scoreB = (TextView) findViewById(R.id.score_b);
        scoreA.setText("" + score_b);
    }

    // SCORE A
    public void aPlus3(View view) {
        score_a = score_a + 3;
        scoreA.setText("" + score_a);
    }

    public void aPlus2(View view) {
        score_a = score_a + 2;
        scoreA.setText("" + score_a);
    }

    public void aPlus1(View view) {
        score_a = score_a + 1;
        scoreA.setText("" + score_a);
    }

    // SCORE B
    public void bPlus3(View view) {
        score_b = score_b + 3;
        scoreB.setText("" + score_b);
    }

    public void bPlus2(View view) {
        score_b = score_b + 2;
        scoreB.setText("" + score_b);
    }

    public void bPlus1(View view) {
        score_b = score_b + 1;
        scoreB.setText("" + score_b);
    }

    public void reset(View view) {
        score_a = 0;
        scoreA.setText("" + score_a);
        score_b = 0;
        scoreB.setText("" + score_b);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}
