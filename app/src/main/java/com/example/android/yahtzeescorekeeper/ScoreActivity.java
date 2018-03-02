package com.example.android.yahtzeescorekeeper;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ScoreActivity extends AppCompatActivity {

    boolean playerOneScore;
    boolean playerTwoScore;

    int scoreType;

    TextView choosePlayer;
    Button player1;
    Button player2;
    EditText score;
    Button ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        choosePlayer = findViewById(R.id.choose_player);
        player1 = findViewById(R.id.player1);
        player2 = findViewById(R.id.player2);
        score = findViewById(R.id.score);
        ok = findViewById(R.id.ok);

        score.setVisibility(View.INVISIBLE);
        ok.setVisibility(View.INVISIBLE);

        Intent intent = getIntent();
        //gets name user entered in welcome screen
        scoreType = intent.getIntExtra("scoreType", 0);
        //gets score calculated from quiz questions activity
    }

    public void playerOneClicked(View view){
        choosePlayer.setVisibility(View.GONE);
        player1.setVisibility(View.GONE);
        player2.setVisibility(View.GONE);

        playerOneScore = true;

        score.setVisibility(View.VISIBLE);
        ok.setVisibility(View.VISIBLE);
    }

    public void playerTwoClicked(View view){
        choosePlayer.setVisibility(View.GONE);
        player1.setVisibility(View.GONE);
        player2.setVisibility(View.GONE);

        playerTwoScore = true;

        score.setVisibility(View.VISIBLE);
        ok.setVisibility(View.VISIBLE);
    }

    public void okClicked(View view){
        String scoreUpdate = score.getText().toString();

        Intent intent = new Intent(ScoreActivity.this, MainActivity.class);
        //sends name and score information to results activity
        intent.putExtra("playerOneScore", playerOneScore);
        intent.putExtra("playerTwoScore", playerTwoScore);
        intent.putExtra("scoreUpdate", scoreUpdate);
        intent.putExtra("scoreType", scoreType);
        startActivity(intent);
    }
}
