package com.example.ahmed6610.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    double player1_score = 0;
    double player2_score = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * Increase the score for Player 1 by 1 point.
     */
    public void addVictoryForPlayer1(View v) {
        player1_score = player1_score + 1.0;
        displayForPlayer1(player1_score);
    }

    /**
     * Don`t increase the score for Player 1.
     */
    public void addLossForPlayer1(View v) {
        player1_score = player1_score + 2.0;
        displayForPlayer1(player1_score);
    }

    /**
     * Increase the score for Player 1 by 0.5 point.
     */
    public void addDrawForPlayer1(View v) {
        player1_score = player1_score + 3.0;
        displayForPlayer1(player1_score);
    }

    /**
     * Increase the score for Player 2 by 1 point.
     */
    public void addVictoryForPlayer2(View v) {
        player2_score = player2_score + 1.0;
        displayForPlayer2(player2_score);
    }

    public void addLossForPlayer2(View v) {
        player2_score = player2_score + 2.0;
        displayForPlayer2(player2_score);
    }

    public void addDrawForPlayer2(View v) {
        player2_score = player2_score + 3.0;
        displayForPlayer2(player2_score);
    }


    public void displayForPlayer1(double score) {
        TextView scoreView = (TextView) findViewById(R.id.player1_score);
        scoreView.setText(String.valueOf(score));
    }

    /*--------------------------------------*/
    public void displayForPlayer2(double score) {
        TextView scoreView = (TextView) findViewById(R.id.player2_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Resets the score for both players back to 0.
     */
    public void ResetScore(View v) {
        player1_score = 0;
        player2_score = 0;
        displayForPlayer1(player1_score);
        displayForPlayer2(player2_score);
    }
}
