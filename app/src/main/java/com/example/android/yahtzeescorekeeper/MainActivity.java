package com.example.android.yahtzeescorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

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

    }


}
