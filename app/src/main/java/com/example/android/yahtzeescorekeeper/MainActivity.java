package com.example.android.yahtzeescorekeeper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreType = 0;
    String scoreUpdate;
    int scoreSet = 0;
    int playerOneScore = 0;
    int playerTwoScore = 0;
    int scoreInt = 0;

    boolean playerOne;
    boolean playerTwo;

    TextView aces;
    TextView twos;
    TextView threes;
    TextView fours;
    TextView fives;
    TextView sixes;
    TextView bonus;
    TextView threeOfKind;
    TextView fourOfKind;
    TextView fullHouse;
    TextView smStraight;
    TextView lgStraight;
    TextView yahtzee;
    TextView chance;
    TextView yahtzeeBonus;
    TextView total;
    TextView player1Aces;
    TextView player1Twos;
    TextView player1Threes;
    TextView player1Fours;
    TextView player1Fives;
    TextView player1Sixes;
    TextView player1Bonus;
    TextView player13OfKind;
    TextView player14OfKind;
    TextView player1FullHouse;
    TextView player1SmStraight;
    TextView player1LgStraight;
    TextView player1Yahtzee;
    TextView player1Chance;
    TextView player1YahtzeeBonus;
    TextView player1Total;
    TextView player2Aces;
    TextView player2Twos;
    TextView player2Threes;
    TextView player2Fours;
    TextView player2Fives;
    TextView player2Sixes;
    TextView player2Bonus;
    TextView player23OfKind;
    TextView player24OfKind;
    TextView player2FullHouse;
    TextView player2SmStraight;
    TextView player2LgStraight;
    TextView player2Yahtzee;
    TextView player2Chance;
    TextView player2YahtzeeBonus;
    TextView player2Total;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aces = findViewById(R.id.aces);
        twos = findViewById(R.id.twos);
        threes = findViewById(R.id.threes);
        fours = findViewById(R.id.fours);
        fives = findViewById(R.id.fives);
        sixes = findViewById(R.id.sixes);
        bonus = findViewById(R.id.bonus);
        threeOfKind = findViewById(R.id.three_of_kind);
        fourOfKind = findViewById(R.id.four_of_kind);
        fullHouse = findViewById(R.id.full_house);
        smStraight = findViewById(R.id.sm_straight);
        lgStraight = findViewById(R.id.lg_straight);
        yahtzee = findViewById(R.id.yahtzee);
        chance = findViewById(R.id.chance);
        yahtzeeBonus = findViewById(R.id.yahtzee_bonus);
        total = findViewById(R.id.total);
        player1Aces = findViewById(R.id.player1_aces);
        player1Twos = findViewById(R.id.player1_twos);
        player1Threes = findViewById(R.id.player1_threes);
        player1Fours = findViewById(R.id.player1_fours);
        player1Fives = findViewById(R.id.player1_fives);
        player1Sixes = findViewById(R.id.player1_sixes);
        player1Bonus = findViewById(R.id.player1_bonus);
        player13OfKind = findViewById(R.id.player1_three_of_kind);
        player14OfKind = findViewById(R.id.player1_four_of_kind);
        player1FullHouse = findViewById(R.id.player1_full_house);
        player1SmStraight = findViewById(R.id.player1_sm_straight);
        player1LgStraight = findViewById(R.id.player1_lg_straight);
        player1Yahtzee = findViewById(R.id.player1_yahtzee);
        player1Chance = findViewById(R.id.player1_chance);
        player1YahtzeeBonus = findViewById(R.id.player1_yahtzee_bonus);
        player1Total = findViewById(R.id.player1_total);
        player2Aces = findViewById(R.id.player2_aces);
        player2Twos = findViewById(R.id.player2_twos);
        player2Threes = findViewById(R.id.player2_threes);
        player2Fours = findViewById(R.id.player2_fours);
        player2Fives = findViewById(R.id.player2_fives);
        player2Sixes = findViewById(R.id.player2_sixes);
        player2Bonus = findViewById(R.id.player2_bonus);
        player23OfKind = findViewById(R.id.player2_three_of_kind);
        player24OfKind = findViewById(R.id.player2_four_of_kind);
        player2FullHouse = findViewById(R.id.player2_full_house);
        player2SmStraight = findViewById(R.id.player2_sm_straight);
        player2LgStraight = findViewById(R.id.player2_lg_straight);
        player2Yahtzee = findViewById(R.id.player2_yahtzee);
        player2Chance = findViewById(R.id.player2_chance);
        player2YahtzeeBonus = findViewById(R.id.player2_yahtzee_bonus);
        player2Total = findViewById(R.id.player2_total);

        aces.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                scoreType = 1;
                Intent intent = new Intent(MainActivity.this, ScoreActivity.class);
                startActivity(intent);
            }
        });

        twos.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                scoreType = 2;
                Intent intent = new Intent(MainActivity.this, ScoreActivity.class);
                intent.putExtra("scoreType", scoreType);
                startActivity(intent);
            }
        });

        threes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                scoreType = 3;
                Intent intent = new Intent(MainActivity.this, ScoreActivity.class);
                intent.putExtra("scoreType", scoreType);
                startActivity(intent);
            }
        });

        fours.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                scoreType = 4;
                Intent intent = new Intent(MainActivity.this, ScoreActivity.class);
                intent.putExtra("scoreType", scoreType);
                startActivity(intent);
            }
        });

        fives.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                scoreType = 5;
                Intent intent = new Intent(MainActivity.this, ScoreActivity.class);
                intent.putExtra("scoreType", scoreType);
                startActivity(intent);
            }
        });

        sixes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                scoreType = 6;
                Intent intent = new Intent(MainActivity.this, ScoreActivity.class);
                intent.putExtra("scoreType", scoreType);
                startActivity(intent);
            }
        });

        threeOfKind.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                scoreType = 7;
                Intent intent = new Intent(MainActivity.this, ScoreActivity.class);
                intent.putExtra("scoreType", scoreType);
                startActivity(intent);
            }
        });

        fourOfKind.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                scoreType = 8;
                Intent intent = new Intent(MainActivity.this, ScoreActivity.class);
                intent.putExtra("scoreType", scoreType);
                startActivity(intent);
            }
        });

        fullHouse.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                scoreType = 9;
                Intent intent = new Intent(MainActivity.this, ScoreActivity.class);
                intent.putExtra("scoreType", scoreType);
                startActivity(intent);
            }
        });

        smStraight.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                scoreType = 10;
                Intent intent = new Intent(MainActivity.this, ScoreActivity.class);
                intent.putExtra("scoreType", scoreType);
                startActivity(intent);
            }
        });

        lgStraight.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                scoreType = 11;
                Intent intent = new Intent(MainActivity.this, ScoreActivity.class);
                intent.putExtra("scoreType", scoreType);
                startActivity(intent);
            }
        });

        yahtzee.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                scoreType = 12;
                Intent intent = new Intent(MainActivity.this, ScoreActivity.class);
                intent.putExtra("scoreType", scoreType);
                startActivity(intent);
            }
        });

        chance.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                scoreType = 13;
                Intent intent = new Intent(MainActivity.this, ScoreActivity.class);
                intent.putExtra("scoreType", scoreType);
                startActivity(intent);
            }
        });

        yahtzeeBonus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                scoreType = 14;
                Intent intent = new Intent(MainActivity.this, ScoreActivity.class);
                intent.putExtra("scoreType", scoreType);
                startActivity(intent);
            }
        });

        Intent intent = getIntent();
        if (intent != null) {
            scoreUpdate = intent.getStringExtra("scoreUpdate");
            scoreSet = intent.getIntExtra("scoreType", 0);
            playerOne = intent.getBooleanExtra("playerOneScore", false);
            playerTwo = intent.getBooleanExtra("playerTwoScore", false);
        }

        switch (scoreSet) {
            case 0:
                break;
            case 1:
                scoreInt = Integer.parseInt(scoreUpdate);
                if (playerOne) {
                    displayPlayer1Aces(scoreInt);
                    playerOneScore += scoreInt;
                    displayPlayerOneScore(playerOneScore);
                    playerOne = false;
                    break;
                }
                if (playerTwo) {
                    displayPlayer2Aces(scoreInt);
                    playerTwoScore += scoreInt;
                    displayPlayerTwoScore(playerTwoScore);
                    playerTwo = false;
                    break;
                }
                break;
            case 2:
                scoreInt = Integer.parseInt(scoreUpdate);
                if (playerOne) {
                    displayPlayer1Twos(scoreInt);
                    playerOneScore += scoreInt;
                    displayPlayerOneScore(playerOneScore);
                    playerOne = false;
                    break;
                }
                if (playerTwo) {
                    displayPlayer2Twos(scoreInt);
                    playerTwoScore += scoreInt;
                    displayPlayerTwoScore(playerTwoScore);
                    playerTwo = false;
                    break;
                }
            case 3:
                scoreInt = Integer.parseInt(scoreUpdate);
                if (playerOne) {
                    displayPlayer1Threes(scoreInt);
                    playerOneScore += scoreInt;
                    displayPlayerOneScore(playerOneScore);
                    playerOne = false;
                    break;
                }
                if (playerTwo) {
                    displayPlayer2Threes(scoreInt);
                    playerTwoScore += scoreInt;
                    displayPlayerTwoScore(playerTwoScore);
                    playerTwo = false;
                    break;
                }
                break;
            case 4:
                scoreInt = Integer.parseInt(scoreUpdate);
                if(playerOne){
                    displayPlayer1Fours(scoreInt);
                    playerOneScore += scoreInt;
                    displayPlayerOneScore(playerOneScore);
                    playerOne = false;
                    break;
                }
                if(playerTwo){
                    displayPlayer2Fours(scoreInt);
                    playerTwoScore += scoreInt;
                    displayPlayerTwoScore(playerTwoScore);
                    playerTwo = false;
                    break;
                }
                break;
            case 5:
                scoreInt = Integer.parseInt(scoreUpdate);
                if(playerOne){
                    displayPlayer1Fives(scoreInt);
                    playerOneScore += scoreInt;
                    displayPlayerOneScore(playerOneScore);
                    playerOne = false;
                    break;
                }
                if(playerTwo){
                    displayPlayer2Fives(scoreInt);
                    playerTwoScore += scoreInt;
                    displayPlayerTwoScore(playerTwoScore);
                    playerTwo = false;
                    break;
                }
                break;
            case 6:
                scoreInt = Integer.parseInt(scoreUpdate);
                if(playerOne){
                    displayPlayer1Sixes(scoreInt);
                    playerOneScore += scoreInt;
                    displayPlayerOneScore(playerOneScore);
                    playerOne = false;
                    break;
                }
                if(playerTwo){
                    displayPlayer2Sixes(scoreInt);
                    playerTwoScore += scoreInt;
                    displayPlayerTwoScore(playerTwoScore);
                    playerTwo = false;
                    break;
                }
                break;
            case 7:
                scoreInt = Integer.parseInt(scoreUpdate);
                if(playerOne){
                    displayPlayer1ThreeOfKind(scoreInt);
                    playerOneScore += scoreInt;
                    displayPlayerOneScore(playerOneScore);
                    playerOne = false;
                    break;
                }
                if(playerTwo){
                    displayPlayer2ThreeOfKind(scoreInt);
                    playerTwoScore += scoreInt;
                    displayPlayerTwoScore(playerTwoScore);
                    playerTwo = false;
                    break;
                }
                break;
            case 8:
                scoreInt = Integer.parseInt(scoreUpdate);
                if(playerOne){
                    displayPlayer1FourOfKind(scoreInt);
                    playerOneScore += scoreInt;
                    displayPlayerOneScore(playerOneScore);
                    playerOne = false;
                    break;
                }
                if(playerTwo){
                    displayPlayer2FourOfKind(scoreInt);
                    playerTwoScore += scoreInt;
                    displayPlayerTwoScore(playerTwoScore);
                    playerTwo = false;
                    break;
                }
                break;
            case 9:
                scoreInt = Integer.parseInt(scoreUpdate);
                if(playerOne){
                    displayPlayer1FullHouse(scoreInt);
                    playerOneScore += scoreInt;
                    displayPlayerOneScore(playerOneScore);
                    playerOne = false;
                    break;
                }
                if(playerTwo){
                    displayPlayer2FullHouse(scoreInt);
                    playerTwoScore += scoreInt;
                    displayPlayerTwoScore(playerTwoScore);
                    playerTwo = false;
                    break;
                }
                break;
            case 10:
                scoreInt = Integer.parseInt(scoreUpdate);
                if(playerOne){
                    displayPlayer1SmStraight(scoreInt);
                    playerOneScore += scoreInt;
                    displayPlayerOneScore(playerOneScore);
                    playerOne = false;
                    break;
                }
                if(playerTwo){
                    displayPlayer2SmStraight(scoreInt);
                    playerTwoScore += scoreInt;
                    displayPlayerTwoScore(playerTwoScore);
                    playerTwo = false;
                    break;
                }
                break;
            case 11:
                scoreInt = Integer.parseInt(scoreUpdate);
                if(playerOne){
                    displayPlayer1LgStraight(scoreInt);
                    playerOneScore += scoreInt;
                    displayPlayerOneScore(playerOneScore);
                    playerOne = false;
                    break;
                }
                if(playerTwo){
                    displayPlayer2LgStraight(scoreInt);
                    playerTwoScore += scoreInt;
                    displayPlayerTwoScore(playerTwoScore);
                    playerTwo = false;
                    break;
                }
                break;
            case 12:
                scoreInt = Integer.parseInt(scoreUpdate);
                if(playerOne){
                    displayPlayer1Yahtzee(scoreInt);
                    playerOneScore += scoreInt;
                    displayPlayerOneScore(playerOneScore);
                    playerOne = false;
                    break;
                }
                if(playerTwo){
                    displayPlayer2Yahtzee(scoreInt);
                    playerTwoScore += scoreInt;
                    displayPlayerTwoScore(playerTwoScore);
                    playerTwo = false;
                    break;
                }
                break;
            case 13:
                scoreInt = Integer.parseInt(scoreUpdate);
                if(playerOne){
                    displayPlayer1Chance(scoreInt);
                    playerOneScore += scoreInt;
                    displayPlayerOneScore(playerOneScore);
                    playerOne = false;
                    break;
                }
                if(playerTwo){
                    displayPlayer2Chance(scoreInt);
                    playerTwoScore += scoreInt;
                    displayPlayerTwoScore(playerTwoScore);
                    playerTwo = false;
                    break;
                }
                break;
            case 14:
                scoreInt = Integer.parseInt(scoreUpdate);
                if(playerOne){
                    displayPlayer1YahtzeeBonus(scoreInt);
                    playerOneScore += scoreInt;
                    displayPlayerOneScore(playerOneScore);
                    playerOne = false;
                    break;
                }
                if(playerTwo){
                    displayPlayer2YahtzeeBonus(scoreInt);
                    playerTwoScore += scoreInt;
                    displayPlayerTwoScore(playerTwoScore);
                    playerTwo = false;
                    break;
                }
                break;
        }


    }

    private void displayPlayerOneScore(int number) {
        String score = "" + number;
        player1Total.setText(score);
    }

    private void displayPlayerTwoScore(int number) {
        String score = "" + number;
        player2Total.setText(score);
    }

    private void displayPlayer1Aces(int number) {
        String score = "" + number;
        player1Aces.setText(score);
    }

    private void displayPlayer2Aces(int number) {
        String score = "" + number;
        player2Aces.setText(score);
    }

    private void displayPlayer1Twos(int number) {
        String score = "" + number;
        player1Twos.setText(score);
    }

    private void displayPlayer2Twos(int number) {
        String score = "" + number;
        player2Twos.setText(score);
    }

    private void displayPlayer1Threes(int number) {
        String score = "" + number;
        player1Threes.setText(score);
    }

    private void displayPlayer2Threes(int number) {
        String score = "" + number;
        player2Threes.setText(score);
    }

    private void displayPlayer1Fours(int number) {
        String score = "" + number;
        player1Fours.setText(score);
    }

    private void displayPlayer2Fours(int number) {
        String score = "" + number;
        player2Fours.setText(score);
    }

    private void displayPlayer1Fives(int number) {
        String score = "" + number;
        player1Fives.setText(score);
    }

    private void displayPlayer2Fives(int number) {
        String score = "" + number;
        player2Fives.setText(score);
    }

    private void displayPlayer1Sixes(int number) {
        String score = "" + number;
        player1Sixes.setText(score);
    }

    private void displayPlayer2Sixes(int number) {
        String score = "" + number;
        player2Sixes.setText(score);
    }

    private void displayPlayer1Bonus(int number) {
        String score = "" + number;
        player1Bonus.setText(score);
    }

    private void displayPlayer2Bonus(int number) {
        String score = "" + number;
        player2Bonus.setText(score);
    }

    private void displayPlayer1ThreeOfKind(int number) {
        String score = "" + number;
        player13OfKind.setText(score);
    }

    private void displayPlayer2ThreeOfKind(int number) {
        String score = "" + number;
        player23OfKind.setText(score);
    }

    private void displayPlayer1FourOfKind(int number) {
        String score = "" + number;
        player14OfKind.setText(score);
    }

    private void displayPlayer2FourOfKind(int number) {
        String score = "" + number;
        player24OfKind.setText(score);
    }

    private void displayPlayer1FullHouse(int number) {
        String score = "" + number;
        player1FullHouse.setText(score);
    }

    private void displayPlayer2FullHouse(int number) {
        String score = "" + number;
        player2FullHouse.setText(score);
    }

    private void displayPlayer1SmStraight(int number) {
        String score = "" + number;
        player1SmStraight.setText(score);
    }

    private void displayPlayer2SmStraight(int number) {
        String score = "" + number;
        player2SmStraight.setText(score);
    }

    private void displayPlayer1LgStraight(int number) {
        String score = "" + number;
        player1LgStraight.setText(score);
    }

    private void displayPlayer2LgStraight(int number) {
        String score = "" + number;
        player2LgStraight.setText(score);
    }

    private void displayPlayer1Yahtzee(int number) {
        String score = "" + number;
        player1Yahtzee.setText(score);
    }

    private void displayPlayer2Yahtzee(int number) {
        String score = "" + number;
        player2Yahtzee.setText(score);
    }

    private void displayPlayer1Chance(int number) {
        String score = "" + number;
        player1Chance.setText(score);
    }

    private void displayPlayer2Chance(int number) {
        String score = "" + number;
        player2Chance.setText(score);
    }

    private void displayPlayer1YahtzeeBonus(int number) {
        String score = "" + number;
        player1Chance.setText(score);
    }

    private void displayPlayer2YahtzeeBonus(int number) {
        String score = "" + number;
        player2Chance.setText(score);
    }
}
