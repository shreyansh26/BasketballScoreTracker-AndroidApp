package com.example.shreyanshsingh.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
    }
     int scoreA=0;
    int scoreB=0;
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void add3(View view){
        scoreA+=3;
        displayForTeamA(scoreA);
    }

    public void add2(View view){
        scoreA+=2;
        displayForTeamA(scoreA);
    }
    public void add1(View view){
        scoreA+=1;
        displayForTeamA(scoreA);
    }

    public void reset(View view){
        scoreA=0;
        scoreB=0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }
    public void addB3(View view){
        scoreB+=3;
        displayForTeamB(scoreB);
    }
    public void addB2(View view){
        scoreB+=2;
        displayForTeamB(scoreB);
    }
    public void addB1(View view){
        scoreB+=1;
        displayForTeamB(scoreB);
    }
}
