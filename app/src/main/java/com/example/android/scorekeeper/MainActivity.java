package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.android.scorekeeper.R;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA, scoreTeamB =0;
    int yellowCardTeamA, redCardTeamA = 0;
    int yellowCardTeamB, redCardTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    //Increase the score for Team A by 1 point.

    public void addOneForTeamA(View v) {
        scoreTeamA =scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    // Add Red Card For Team A

    public void addRedCardTeamA(View v){
        redCardTeamA = redCardTeamA +1;
        displayRedCardTeamA(redCardTeamA);
    }

    // Add Yellow Card For Team A

    public void addYellowCardTeamA(View v){
        yellowCardTeamA = yellowCardTeamA +1;
        displayYellowCardTeamA(yellowCardTeamA);
    }

    // Display Red Card Team A

    public void displayRedCardTeamA(int number){
        TextView redCardTeamA = (TextView)findViewById(R.id.red_card_team_a);
        redCardTeamA.setText(String.valueOf(number));
    }
    // Display Yellow Card Team A

    public void displayYellowCardTeamA(int number){
        TextView yellowCardTeamA = (TextView)findViewById(R.id.yellow_card_team_a);
        yellowCardTeamA.setText(String.valueOf(number));
    }

    // Displays the given score for Team A.

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }





    // Increase the score for Team B by 1 point.

    public void addOneForTeamB(View v) {
        scoreTeamB =scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    // Add Red Card For Team B

    public void addRedCardTeamB(View v){
        redCardTeamB = redCardTeamB +1;
        displayRedCardTeamB(redCardTeamB);
    }

    // Add Yellow Card For Team A

    public void addYellowCardTeamB(View v){
        yellowCardTeamB = yellowCardTeamB +1;
        displayYellowCardTeamB(yellowCardTeamB);
    }

    // Display Red Card Team B

    public void displayRedCardTeamB(int number){
        TextView redCardTeamB = (TextView)findViewById(R.id.red_card_team_b);
        redCardTeamB.setText(String.valueOf(number));
    }
    // Display Yellow Card Team B

    public void displayYellowCardTeamB(int number){
        TextView yellowCardTeamB = (TextView)findViewById(R.id.yellow_card_team_b);
        yellowCardTeamB.setText(String.valueOf(number));
    }
    // Displays the given score for Team B.

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void reset(View v){
        scoreTeamA=0;
        scoreTeamB =0;
        yellowCardTeamA=0;
        redCardTeamA = 0;
        yellowCardTeamB=0;
        redCardTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayRedCardTeamA(redCardTeamA);
        displayRedCardTeamB(redCardTeamB);
        displayYellowCardTeamA(yellowCardTeamA);
        displayYellowCardTeamB(yellowCardTeamB);
    }

}