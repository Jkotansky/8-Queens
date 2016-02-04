package com.example.joshuak.lab2;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageButton a1;
    ImageButton b1;
    ImageButton c1;
    ImageButton d1;
    ImageButton e1;
    ImageButton f1;
    ImageButton g1;
    ImageButton h1;
    ImageButton a2;
    ImageButton b2;
    ImageButton c2;
    ImageButton d2;
    ImageButton e2;
    ImageButton f2;
    ImageButton g2;
    ImageButton h2;
    ImageButton a3;
    ImageButton b3;
    ImageButton c3;
    ImageButton d3;
    ImageButton e3;
    ImageButton f3;
    ImageButton g3;
    ImageButton h3;
    ImageButton a4;
    ImageButton b4;
    ImageButton c4;
    ImageButton d4;
    ImageButton e4;
    ImageButton f4;
    ImageButton g4;
    ImageButton h4;
    ImageButton a5;
    ImageButton b5;
    ImageButton c5;
    ImageButton d5;
    ImageButton e5;
    ImageButton f5;
    ImageButton g5;
    ImageButton h5;
    ImageButton a6;
    ImageButton b6;
    ImageButton c6;
    ImageButton d6;
    ImageButton e6;
    ImageButton f6;
    ImageButton g6;
    ImageButton h6;
    ImageButton a7;
    ImageButton b7;
    ImageButton c7;
    ImageButton d7;
    ImageButton e7;
    ImageButton f7;
    ImageButton g7;
    ImageButton h7;
    ImageButton a8;
    ImageButton b8;
    ImageButton c8;
    ImageButton d8;
    ImageButton e8;
    ImageButton f8;
    ImageButton g8;
    ImageButton h8;
    EightQueens queens;
    int[][] board;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        queens = new EightQueens();
        board = queens.getBoard();
        showPop("Welcome to 8 Queens");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onClick(View view) {

        a1 = (ImageButton) findViewById(R.id.imageButtona1);
        b1 = (ImageButton) findViewById(R.id.imageButtonb1);
        c1 = (ImageButton) findViewById(R.id.imageButtonc1);
        d1 = (ImageButton) findViewById(R.id.imageButtond1);
        e1 = (ImageButton) findViewById(R.id.imageButtone1);
        f1 = (ImageButton) findViewById(R.id.imageButtonf1);
        g1 = (ImageButton) findViewById(R.id.imageButtong1);
        h1 = (ImageButton) findViewById(R.id.imageButtonh1);
        a2 = (ImageButton) findViewById(R.id.imageButtona2);
        b2 = (ImageButton) findViewById(R.id.imageButtonb2);
        c2 = (ImageButton) findViewById(R.id.imageButtonc2);
        d2 = (ImageButton) findViewById(R.id.imageButtond2);
        e2 = (ImageButton) findViewById(R.id.imageButtone2);
        f2 = (ImageButton) findViewById(R.id.imageButtonf2);
        g2 = (ImageButton) findViewById(R.id.imageButtong2);
        h2 = (ImageButton) findViewById(R.id.imageButtonh2);
        a3 = (ImageButton) findViewById(R.id.imageButtona3);
        b3 = (ImageButton) findViewById(R.id.imageButtonb3);
        c3 = (ImageButton) findViewById(R.id.imageButtonc3);
        d3 = (ImageButton) findViewById(R.id.imageButtond3);
        e3 = (ImageButton) findViewById(R.id.imageButtone3);
        f3 = (ImageButton) findViewById(R.id.imageButtonf3);
        g3 = (ImageButton) findViewById(R.id.imageButtong3);
        h3 = (ImageButton) findViewById(R.id.imageButtonh3);
        a4 = (ImageButton) findViewById(R.id.imageButtona4);
        b4 = (ImageButton) findViewById(R.id.imageButtonb4);
        c4 = (ImageButton) findViewById(R.id.imageButtonc4);
        d4 = (ImageButton) findViewById(R.id.imageButtond4);
        e4 = (ImageButton) findViewById(R.id.imageButtone4);
        f4 = (ImageButton) findViewById(R.id.imageButtonf4);
        g4 = (ImageButton) findViewById(R.id.imageButtong4);
        h4 = (ImageButton) findViewById(R.id.imageButtonh4);
        a5 = (ImageButton) findViewById(R.id.imageButtona5);
        b5 = (ImageButton) findViewById(R.id.imageButtonb5);
        c5 = (ImageButton) findViewById(R.id.imageButtonc5);
        d5 = (ImageButton) findViewById(R.id.imageButtond5);
        e5 = (ImageButton) findViewById(R.id.imageButtone5);
        f5 = (ImageButton) findViewById(R.id.imageButtonf5);
        g5 = (ImageButton) findViewById(R.id.imageButtong5);
        h5 = (ImageButton) findViewById(R.id.imageButtonh5);
        a6 = (ImageButton) findViewById(R.id.imageButtona6);
        b6 = (ImageButton) findViewById(R.id.imageButtonb6);
        c6 = (ImageButton) findViewById(R.id.imageButtonc6);
        d6 = (ImageButton) findViewById(R.id.imageButtond6);
        e6 = (ImageButton) findViewById(R.id.imageButtone6);
        f6 = (ImageButton) findViewById(R.id.imageButtonf6);
        g6 = (ImageButton) findViewById(R.id.imageButtong6);
        h6 = (ImageButton) findViewById(R.id.imageButtonh6);
        a7 = (ImageButton) findViewById(R.id.imageButtona7);
        b7 = (ImageButton) findViewById(R.id.imageButtonb7);
        c7 = (ImageButton) findViewById(R.id.imageButtonc7);
        d7 = (ImageButton) findViewById(R.id.imageButtond7);
        e7 = (ImageButton) findViewById(R.id.imageButtone7);
        f7 = (ImageButton) findViewById(R.id.imageButtonf7);
        g7 = (ImageButton) findViewById(R.id.imageButtong7);
        h7 = (ImageButton) findViewById(R.id.imageButtonh7);
        a8 = (ImageButton) findViewById(R.id.imageButtona8);
        b8 = (ImageButton) findViewById(R.id.imageButtonb8);
        c8 = (ImageButton) findViewById(R.id.imageButtonc8);
        d8 = (ImageButton) findViewById(R.id.imageButtond8);
        e8 = (ImageButton) findViewById(R.id.imageButtone8);
        f8 = (ImageButton) findViewById(R.id.imageButtonf8);
        g8 = (ImageButton) findViewById(R.id.imageButtong8);
        h8 = (ImageButton) findViewById(R.id.imageButtonh8);

        board = queens.getBoard();

        int log1 = Log.v("SOMETHING", "onClick works");

        switch (view.getId()) {
            case R.id.imageButtona1:
                int log2 = Log.v("SOMETHING", "case1 works");
                if(board[0][0] == 0){
                int log3 = Log.v("SOMETHING", "case1 if 1 works");
                        if(queens.isSafe(board,0,0) == true){
                            int log4 = Log.v("SOMETHING", "case1 if 2 works");
                            queens.setBoardToOne(0,0);
                            a1.setImageResource(R.drawable.whitequeen);
                        }else{
                            showPop("You've been attacked! , Try a different maneuver");
                        }
            }else{
                a1.setImageResource(R.drawable.whitepiece);
                    board[0][0] = 0;
            } ;
                break;
            case R.id.imageButtonb1: if(board[0][1] == 0){
                if(queens.isSafe(board,0,1) == true){
                    queens.setBoardToOne(0,1);
                    b1.setImageResource(R.drawable.colorqueen);
                }else{
                    showPop("You've been attacked! , Try a different maneuver");
                }
            }else{
                b1.setImageResource(R.drawable.colorpiece);
                board[0][1] =0;
            } ;
                break;
            case R.id.imageButtonc1: if(board[0][2] == 0){
                if(queens.isSafe(board,0,2) == true){
                    queens.setBoardToOne(0,2);
                    c1.setImageResource(R.drawable.whitequeen);
                }else{
                    showPop("You've been attacked! , Try a different maneuver");
                }
            }else{
                c1.setImageResource(R.drawable.whitepiece);
                board[0][2] =0;
            } ;
                break;
            case R.id.imageButtond1: if(board[0][3] == 0){
                if(queens.isSafe(board,0,3) == true){
                    queens.setBoardToOne(0,3);
                    d1.setImageResource(R.drawable.colorqueen);
                }else{
                    showPop("You've been attacked! , Try a different maneuver");
                }
            }else{
                d1.setImageResource(R.drawable.colorpiece);
                board[0][3] =0;
            } ;
                break;
            case R.id.imageButtone1: if(board[0][4] == 0){
                if(queens.isSafe(board,0,4) == true){
                    queens.setBoardToOne(0,4);
                    e1.setImageResource(R.drawable.whitequeen);
                }else{
                    showPop("You've been attacked! , Try a different maneuver");
                }
            }else{
                e1.setImageResource(R.drawable.whitepiece);
                board[0][4] =0;
            } ;
                break;
            case R.id.imageButtonf1: if(board[0][5] == 0){
                if(queens.isSafe(board,0,5) == true){
                    queens.setBoardToOne(0,5);
                    f1.setImageResource(R.drawable.colorqueen);
                }else{
                    showPop("You've been attacked! , Try a different maneuver");
                }
            }else{
                f1.setImageResource(R.drawable.colorpiece);
                board[0][5] =0;
            } ;
                break;
            case R.id.imageButtong1: if(board[0][6] == 0){
                if(queens.isSafe(board,0,6) == true){
                    queens.setBoardToOne(0,6);
                    g1.setImageResource(R.drawable.whitequeen);
                }else{
                    showPop("You've been attacked! , Try a different maneuver");
                }
            }else{
                g1.setImageResource(R.drawable.whitepiece);
                board[0][6] =0;
            } ;
                break;
            case R.id.imageButtonh1: if(board[0][7] == 0){
                if(queens.isSafe(board,0,7) == true) {
                    queens.setBoardToOne(0,7);
                    h1.setImageResource(R.drawable.colorqueen);
                }else{
                    showPop("You've been attacked! , Try a different maneuver");
                }
            }else{
                h1.setImageResource(R.drawable.colorpiece);
                board[0][7] =0;
            } ;
                break;
            case R.id.imageButtona2: if(board[1][0] == 0){
                if(queens.isSafe(board,1,0) == true) {
                    queens.setBoardToOne(1,0);
                    a2.setImageResource(R.drawable.colorqueen);
                }else{
                    showPop("You've been attacked! , Try a different maneuver");
                }
            }else{
                a2.setImageResource(R.drawable.colorpiece);
                board[1][0] =0;
            } ;
                break;
            case R.id.imageButtonb2: if(board[1][1] == 0){
                if(queens.isSafe(board,1,1) == true) {
                    queens.setBoardToOne(1,1);
                    b2.setImageResource(R.drawable.whitequeen);
                }else{
                    showPop("You've been attacked! , Try a different maneuver");
                }
            }else{
                b2.setImageResource(R.drawable.whitepiece);
                board[1][1] =0;
            } ;
                break;
            case R.id.imageButtonc2: if(board[1][2] == 0){
                if(queens.isSafe(board,1,2) == true) {
                    queens.setBoardToOne(1,2);
                    c2.setImageResource(R.drawable.colorqueen);
                }else{
                    showPop("You've been attacked! , Try a different maneuver");
                }
            }else{
                c2.setImageResource(R.drawable.colorpiece);
                board[1][2] =0;
            } ;
                break;
            case R.id.imageButtond2: if(board[1][3] == 0){
                if(queens.isSafe(board,1,3) == true) {
                    queens.setBoardToOne(1,3);
                    d2.setImageResource(R.drawable.whitequeen);
                }else{
                    showPop("You've been attacked! , Try a different maneuver");
                }
            }else{
                d2.setImageResource(R.drawable.whitepiece);
                board[1][3] =0;
            } ;
                break;
            case R.id.imageButtone2: if(board[1][4] == 0){
                if(queens.isSafe(board,1,4) == true) {
                    queens.setBoardToOne(1,4);
                    e2.setImageResource(R.drawable.colorqueen);
                }else{
                    showPop("You've been attacked! , Try a different maneuver");
                }
            }else{
                e2.setImageResource(R.drawable.colorpiece);
                board[1][4] =0;
            } ;
                break;
            case R.id.imageButtonf2: if(board[1][5] == 0){
                if(queens.isSafe(board,1,5) == true) {
                    queens.setBoardToOne(1,5);
                    f2.setImageResource(R.drawable.whitequeen);
                }else{
                    showPop("You've been attacked! , Try a different maneuver");
                }
            }else{
                f2.setImageResource(R.drawable.whitepiece);
                board[1][5] =0;
            } ;
                break;
            case R.id.imageButtong2: if(board[1][6] == 0){
                if(queens.isSafe(board,1,6) == true) {
                    queens.setBoardToOne(1,6);
                    g2.setImageResource(R.drawable.colorqueen);
                }else{
                    showPop("You've been attacked! , Try a different maneuver");
                }
            }else{
                g2.setImageResource(R.drawable.colorpiece);
                board[1][6] =0;
            } ;
                break;
            case R.id.imageButtonh2: if(board[1][7] == 0){
                if(queens.isSafe(board,1,7) == true) {
                    queens.setBoardToOne(1,7);
                    h2.setImageResource(R.drawable.whitequeen);
                }else{
                    showPop("You've been attacked! , Try a different maneuver");
                }
            }else{
                h2.setImageResource(R.drawable.whitepiece);
                board[1][7] =0;
            } ;
                break;
            case R.id.imageButtona3: if(board[2][0] == 0){
                if(queens.isSafe(board,2,0) == true) {
                    queens.setBoardToOne(2,0);
                    a3.setImageResource(R.drawable.whitequeen);
                }else{
                    showPop("You've been attacked! , Try a different maneuver");
                }
            }else{
                a3.setImageResource(R.drawable.whitepiece);
                board[2][0] =0;
            } ;
                break;
            case R.id.imageButtonb3: if(board[2][1] == 0){
                if(queens.isSafe(board,2,1) == true) {
                    queens.setBoardToOne(2,1);
                    b3.setImageResource(R.drawable.colorqueen);
                }else{
                    showPop("You've been attacked! , Try a different maneuver");
                }
            }else{
                b3.setImageResource(R.drawable.colorpiece);
                board[2][1] =0;
            } ;
                break;
            case R.id.imageButtonc3: if(board[2][2] == 0){
                if(queens.isSafe(board,2,2) == true) {
                    queens.setBoardToOne(2,2);
                    c3.setImageResource(R.drawable.whitequeen);
                }else{
                    showPop("You've been attacked! , Try a different maneuver");
                }
            }else{
                c3.setImageResource(R.drawable.whitepiece);
                board[2][2] =0;
            } ;
                break;
            case R.id.imageButtond3: if(board[2][3] == 0){
                if(queens.isSafe(board,2,3) == true) {
                    queens.setBoardToOne(2,3);
                    d3.setImageResource(R.drawable.colorqueen);
                }else{
                    showPop("You've been attacked! , Try a different maneuver");
                }
            }else{
                d3.setImageResource(R.drawable.colorpiece);
                board[2][3] =0;
            } ;
                break;
            case R.id.imageButtone3: if(board[2][4] == 0){
                if(queens.isSafe(board,2,4) == true) {
                    queens.setBoardToOne(2,4);
                    e3.setImageResource(R.drawable.whitequeen);
                }else{
                    showPop("You've been attacked! , Try a different maneuver");
                }
            }else{
                e3.setImageResource(R.drawable.whitepiece);
                board[2][4] =0;
            } ;
                break;
            case R.id.imageButtonf3: if(board[2][5] == 0){
                if(queens.isSafe(board,2,5) == true) {
                    queens.setBoardToOne(2,5);
                    f3.setImageResource(R.drawable.colorqueen);
                }else{
                    showPop("You've been attacked! , Try a different maneuver");
                }
            }else{
                f3.setImageResource(R.drawable.colorpiece);
                board[2][5] =0;
            } ;
                break;
            case R.id.imageButtong3: if(board[2][6] == 0){
                if(queens.isSafe(board,2,6) == true) {
                    queens.setBoardToOne(2,6);
                    g3.setImageResource(R.drawable.whitequeen);
                }else{
                    showPop("You've been attacked! , Try a different maneuver");
                }
            }else{
                g3.setImageResource(R.drawable.whitepiece);
                board[2][6] =0;
            } ;
                break;
            case R.id.imageButtonh3: if(board[2][7] == 0){
                if(queens.isSafe(board,2,7) == true) {
                    queens.setBoardToOne(2,7);
                    h3.setImageResource(R.drawable.colorqueen);
                }else{
                    showPop("You've been attacked! , Try a different maneuver");
                }
            }else{
                h3.setImageResource(R.drawable.colorpiece);
                board[2][7] =0;
            } ;
                break;
            case R.id.imageButtona4: if( board[3][0] == 0){
                if(queens.isSafe(board,3,0) == true) {
                    queens.setBoardToOne(3,0);
                    a4.setImageResource(R.drawable.colorqueen);
                }else{
                    showPop("You've been attacked! , Try a different maneuver");
                }
            }else{
                a4.setImageResource(R.drawable.colorpiece);
                board[3][0] =0;
            } ;
                break;
            case R.id.imageButtonb4: if( board[3][1] == 0){
                if(queens.isSafe(board,3,1) == true) {
                    queens.setBoardToOne(3,1);
                    b4.setImageResource(R.drawable.whitequeen);
                }else{
                    showPop("You've been attacked! , Try a different maneuver");
                }
            }else{
                b4.setImageResource(R.drawable.whitepiece);
                board[3][1] =0;
            } ;
                break;
            case R.id.imageButtonc4: if( board[3][2] == 0){
                if(queens.isSafe(board,3,2) == true) {
                    queens.setBoardToOne(3,2);
                    c4.setImageResource(R.drawable.colorqueen);
                }else{
                    showPop("You've been attacked! , Try a different maneuver");
                }
            }else{
                c4.setImageResource(R.drawable.colorpiece);
                board[3][2] =0;
            } ;
                break;
            case R.id.imageButtond4: if( board[3][3] == 0){
                if(queens.isSafe(board,3,3) == true) {
                    queens.setBoardToOne(3,3);
                    d4.setImageResource(R.drawable.whitequeen);
                }else{
                    showPop("You've been attacked! , Try a different maneuver");
                }
            }else{
                d4.setImageResource(R.drawable.whitepiece);
                board[3][3] =0;
            } ;
                break;
            case R.id.imageButtone4: if( board[3][4] == 0){
                if(queens.isSafe(board,3,4) == true) {
                    queens.setBoardToOne(3,4);
                    e4.setImageResource(R.drawable.colorqueen);
                }else{
                    showPop("You've been attacked! , Try a different maneuver");
                }
            }else{
                e4.setImageResource(R.drawable.colorpiece);
                board[3][4] =0;
            } ;
                break;
            case R.id.imageButtonf4: if( board[3][5] == 0){
                if(queens.isSafe(board,3,5) == true) {
                    queens.setBoardToOne(3,5);
                    f4.setImageResource(R.drawable.whitequeen);
                }else{
                    showPop("You've been attacked! , Try a different maneuver");;
                }
            }else{
                f4.setImageResource(R.drawable.whitepiece);
                board[3][5] =0;
            } ;
                break;
            case R.id.imageButtong4: if( board[3][6] == 0){
                if(queens.isSafe(board,3,6) == true) {
                    queens.setBoardToOne(3,6);
                    g4.setImageResource(R.drawable.colorqueen);
                }else{
                    showPop("You've been attacked! , Try a different maneuver");
                }
            }else{
                g4.setImageResource(R.drawable.colorpiece);
                board[3][6] =0;
            } ;
                break;
            case R.id.imageButtonh4: if(board[3][7] == 0){
                if(queens.isSafe(board,3,7) == true) {
                    queens.setBoardToOne(3,7);
                    h4.setImageResource(R.drawable.whitequeen);
                }else{
                    showPop("You've been attacked! , Try a different maneuver");
                }
            }else{
                h4.setImageResource(R.drawable.whitepiece);
                board[3][7] =0;
            } ;
                break;
            case R.id.imageButtona5: if(board[4][0] == 0){
                if(queens.isSafe(board,4,0) == true) {
                    queens.setBoardToOne(4,0);
                    a5.setImageResource(R.drawable.whitequeen);
                }else{
                    showPop("You've been attacked! , Try a different maneuver");
                }
            }else{
                a5.setImageResource(R.drawable.whitepiece);
                board[4][0] =0;
            } ;
                break;
            case R.id.imageButtonb5: if(board[4][1] == 0){
                if(queens.isSafe(board,4,1) == true) {
                    queens.setBoardToOne(4,1);
                    b5.setImageResource(R.drawable.colorqueen);
                }else{
                    showPop("You've been attacked! , Try a different maneuver");
                }
            }else{
                b5.setImageResource(R.drawable.colorpiece);
                board[4][1] =0;
            } ;
                break;
            case R.id.imageButtonc5: if(board[4][2] == 0){
                if(queens.isSafe(board,4,2) == true) {
                    queens.setBoardToOne(4,2);
                    c5.setImageResource(R.drawable.whitequeen);
                }else{
                    showPop("You've been attacked! , Try a different maneuver");
                }
            }else{
                c5.setImageResource(R.drawable.whitepiece);
                board[4][2] =0;
            } ;
                break;
            case R.id.imageButtond5: if(board[4][3] == 0){
                if(queens.isSafe(board,4,3) == true) {
                    queens.setBoardToOne(4,3);
                    d5.setImageResource(R.drawable.colorqueen);
                }else{
                    showPop("You've been attacked! , Try a different maneuver");
                }
            }else{
                d5.setImageResource(R.drawable.colorpiece);
                board[4][3] =0;
            } ;
                break;
            case R.id.imageButtone5: if(board[4][4] == 0){
                if(queens.isSafe(board,4,4) == true) {
                    queens.setBoardToOne(4,4);
                    e5.setImageResource(R.drawable.whitequeen);
                }else{
                    showPop("You've been attacked! , Try a different maneuver");
                }
            }else{
                e5.setImageResource(R.drawable.whitepiece);
                board[4][4] =0;
            } ;
                break;
            case R.id.imageButtonf5: if(board[4][5] == 0){
                if(queens.isSafe(board,4,5) == true) {
                    queens.setBoardToOne(4,5);
                    f5.setImageResource(R.drawable.colorqueen);
                }else{
                    showPop("You've been attacked! , Try a different maneuver");
                }
            }else{
                f5.setImageResource(R.drawable.colorpiece);
                board[4][5] =0;
            } ;
                break;
            case R.id.imageButtong5: if(board[4][6] == 0){
                if(queens.isSafe(board,4,6) == true) {
                    queens.setBoardToOne(4,6);
                    g5.setImageResource(R.drawable.whitequeen);
                }else{
                    showPop("You've been attacked! , Try a different maneuver");
                }
            }else{
                g5.setImageResource(R.drawable.whitepiece);
                board[4][6] =0;
            } ;
                break;
            case R.id.imageButtonh5: if(board[4][7] == 0){
                if(queens.isSafe(board,4,7) == true) {
                    queens.setBoardToOne(4,7);
                    h5.setImageResource(R.drawable.colorqueen);
                }else{
                    showPop("You've been attacked! , Try a different maneuver");
                }
            }else{
                h5.setImageResource(R.drawable.colorpiece);
                board[4][7] =0;
            } ;
                break;
            case R.id.imageButtona6: if(board[5][0] == 0){
                if(queens.isSafe(board,5,0) == true) {
                    queens.setBoardToOne(5,0);
                    a6.setImageResource(R.drawable.colorqueen);
                }else{
                    showPop("You've been attacked! , Try a different maneuver");
                }
            }else{
                a6.setImageResource(R.drawable.colorpiece);
                board[5][0] =0;
            } ;
                break;
            case R.id.imageButtonb6: if(board[5][1] == 0){
                if(queens.isSafe(board,5,1) == true) {
                    queens.setBoardToOne(5,1);
                    b6.setImageResource(R.drawable.whitequeen);
                }else{
                    showPop("You've been attacked! , Try a different maneuver");
                }
            }else{
                b6.setImageResource(R.drawable.whitepiece);
                board[5][1] =0;
            } ;
                break;
            case R.id.imageButtonc6: if(board[5][2] == 0){
                if(queens.isSafe(board,5,2) == true) {
                    queens.setBoardToOne(5,2);
                    c6.setImageResource(R.drawable.colorqueen);
                }else{
                    showPop("You've been attacked! , Try a different maneuver");
                }
            }else{
                c6.setImageResource(R.drawable.colorpiece);
                board[5][2] =0;
            } ;
                break;
            case R.id.imageButtond6: if(board[5][3] == 0){
                if(queens.isSafe(board,5,3) == true) {
                    queens.setBoardToOne(5,3);
                    d6.setImageResource(R.drawable.whitequeen);
                }else{
                    showPop("You've been attacked! , Try a different maneuver");
                }
            }else{
                d6.setImageResource(R.drawable.whitepiece);
                board[5][3] = 0;
            } ;
                break;
            case R.id.imageButtone6: if(board[5][4] == 0){
                if(queens.isSafe(board,5,4) == true) {
                    queens.setBoardToOne(5,4);
                    e6.setImageResource(R.drawable.colorqueen);
                }else{
                    showPop("You've been attacked! , Try a different maneuver");
                }
            }else{
                e6.setImageResource(R.drawable.colorpiece);
                board[5][4] =0;
            } ;
                break;
            case R.id.imageButtonf6: if(board[5][5] == 0){
                if(queens.isSafe(board,5,5) == true) {
                    queens.setBoardToOne(5,5);
                    f6.setImageResource(R.drawable.whitequeen);
                }else{
                    showPop("You've been attacked! , Try a different maneuver");
                }
            }else{
                f6.setImageResource(R.drawable.whitepiece);
                board[5][5] =0;
            } ;
                break;
            case R.id.imageButtong6: if(board[5][6] == 0){
                if(queens.isSafe(board,5,6) == true) {
                    queens.setBoardToOne(5,6);
                    g6.setImageResource(R.drawable.colorqueen);
                }else{
                    showPop("You've been attacked! , Try a different maneuver");
                }
            }else{
                g6.setImageResource(R.drawable.colorpiece);
                board[5][6] =0;
            } ;
                break;
            case R.id.imageButtonh6: if(board[5][7] == 0){
                if(queens.isSafe(board,5,7) == true) {
                    queens.setBoardToOne(5,7);
                    h6.setImageResource(R.drawable.whitequeen);
                }else{
                    showPop("You've been attacked! , Try a different maneuver");
                }
            }else{
                h6.setImageResource(R.drawable.whitepiece);
                board[5][7] =0;
            } ;
                break;
            case R.id.imageButtona7: if(board[6][0] == 0){
                if(queens.isSafe(board,6,0) == true) {
                    queens.setBoardToOne(6,0);
                    a7.setImageResource(R.drawable.whitequeen);
                }else{
                    showPop("You've been attacked! , Try a different maneuver");
                }
            }else{
                a7.setImageResource(R.drawable.whitepiece);
                board[6][0] =0;
            } ;
                break;
            case R.id.imageButtonb7: if(board[6][1] == 0){
                if(queens.isSafe(board,6,1) == true) {
                    queens.setBoardToOne(6,1);
                    b7.setImageResource(R.drawable.colorqueen);
                }else{
                    showPop("You've been attacked! , Try a different maneuver");
                }
            }else{
                b7.setImageResource(R.drawable.colorpiece);
                board[6][1] =0;
            } ;
                break;
            case R.id.imageButtonc7: if(board[6][2] == 0){
                if(queens.isSafe(board,6,2) == true) {
                    queens.setBoardToOne(6,2);
                    c7.setImageResource(R.drawable.whitequeen);
                }else{
                    showPop("You've been attacked! , Try a different maneuver");
                }
            }else{
                c7.setImageResource(R.drawable.whitepiece);
                board[6][2] =0;
            } ;
                break;
            case R.id.imageButtond7: if(board[6][3] == 0){
                if(queens.isSafe(board,6,3) == true) {
                    queens.setBoardToOne(6,3);
                    d7.setImageResource(R.drawable.colorqueen);
                }else{
                    showPop("You've been attacked! , Try a different maneuver");
                }
            }else{
                d7.setImageResource(R.drawable.colorpiece);
                board[6][3] =0;
            } ;
                break;
            case R.id.imageButtone7: if(board[6][4] == 0){
                if(queens.isSafe(board,6,4) == true) {
                    queens.setBoardToOne(6,4);
                    e7.setImageResource(R.drawable.whitequeen);
                }else{
                    showPop("You've been attacked! , Try a different maneuver");
                }
            }else{
                e7.setImageResource(R.drawable.whitepiece);
                board[6][4] =0;
            } ;
                break;
            case R.id.imageButtonf7: if(board[6][5] == 0){
                if(queens.isSafe(board,6,5) == true) {
                    queens.setBoardToOne(6,5);
                    f7.setImageResource(R.drawable.colorqueen);
                }else{
                    showPop("You've been attacked! , Try a different maneuver");
                }
            }else{
                f7.setImageResource(R.drawable.colorpiece);
                board[6][5] =0;
            } ;
                break;
            case R.id.imageButtong7: if(board[6][6] == 0){
                if(queens.isSafe(board,6,6) == true) {
                    queens.setBoardToOne(6,6);
                    g7.setImageResource(R.drawable.whitequeen);
                }else{
                    showPop("You've been attacked! , Try a different maneuver");
                }
            }else{
                g7.setImageResource(R.drawable.whitepiece);
                board[6][6] =0;
            } ;
                break;
            case R.id.imageButtonh7: if(board[6][7] == 0){
                if(queens.isSafe(board,6,7) == true) {
                    queens.setBoardToOne(6,7);
                    h7.setImageResource(R.drawable.colorqueen);
                }else{
                    showPop("You've been attacked! , Try a different maneuver");
                }
            }else{
                h7.setImageResource(R.drawable.colorpiece);
                board[6][7] =0;
            } ;
                break;
            case R.id.imageButtona8: if(board[7][0] == 0){
                if(queens.isSafe(board,7,0) == true) {
                    queens.setBoardToOne(7,0);
                    a8.setImageResource(R.drawable.colorqueen);
                }else{
                    showPop("You've been attacked! , Try a different maneuver");
                }
            }else{
                a8.setImageResource(R.drawable.colorpiece);
                board[7][0] =0;
            } ;
                break;
            case R.id.imageButtonb8: if(board[7][1] == 0){
                if(queens.isSafe(board,7,1) == true) {
                    queens.setBoardToOne(7,1);
                    b8.setImageResource(R.drawable.whitequeen);
                }else{
                    showPop("You've been attacked! , Try a different maneuver");
                }
            }else{
                b8.setImageResource(R.drawable.whitepiece);
                board[7][1] =0;
            } ;
                break;
            case R.id.imageButtonc8: if(board[7][2] == 0){
                if(queens.isSafe(board,7,2) == true) {
                    queens.setBoardToOne(7,2);
                    c8.setImageResource(R.drawable.colorqueen);
                }else{
                    showPop("You've been attacked! , Try a different maneuver");
                }
            }else{
                c8.setImageResource(R.drawable.colorpiece);
                board[7][2] = 0;
            } ;
                break;
            case R.id.imageButtond8: if(board[7][3]== 0){
                if(queens.isSafe(board,7,3) == true) {
                    queens.setBoardToOne(7,3);
                    d8.setImageResource(R.drawable.whitequeen);
                }else{
                    showPop("You've been attacked! , Try a different maneuver");
                }
            }else{
                d8.setImageResource(R.drawable.whitepiece);
                board[7][3] = 0;
            } ;
                break;
            case R.id.imageButtone8: if(board[7][4] == 0){
                if(queens.isSafe(board,7,4) == true) {
                    queens.setBoardToOne(7,4);
                    e8.setImageResource(R.drawable.colorqueen);
                }else{
                    showPop("You've been attacked! , Try a different maneuver");
                }
            }else{
                e8.setImageResource(R.drawable.colorpiece);
                board[7][4] = 0;
            } ;
                break;
            case R.id.imageButtonf8: if(board[7][5] == 0){
                if(queens.isSafe(board,7,5) == true) {
                    queens.setBoardToOne(7,5);
                    f8.setImageResource(R.drawable.whitequeen);
                }else{
                    showPop("You've been attacked! , Try a different maneuver");
                }
            }else{
                f8.setImageResource(R.drawable.whitepiece);
                board[7][5] = 0;
            } ;
                break;
            case R.id.imageButtong8: if(board[7][6] == 0){
                if(queens.isSafe(board,7,6) == true) {
                    queens.setBoardToOne(7,6);
                    g8.setImageResource(R.drawable.colorqueen);
                }else{
                    showPop("You've been attacked! , Try a different maneuver");
                }
            }else{
                g8.setImageResource(R.drawable.colorpiece);
                board[7][6] = 0;
            } ;
                break;
            case R.id.imageButtonh8: if(board[7][7] == 0){
                if(queens.isSafe(board,7,7) == true) {
                    queens.setBoardToOne(7,7);
                    h8.setImageResource(R.drawable.whitequeen);
                }else{
                    showPop("You've been attacked! , Try a different maneuver");
                }
            }else{
                h8.setImageResource(R.drawable.whitepiece);
                board[7][7] = 0;
            } ;
                break;
        }

    }

    public void giveUp(View v){
        a1 = (ImageButton) findViewById(R.id.imageButtona1);
        b1 = (ImageButton) findViewById(R.id.imageButtonb1);
        c1 = (ImageButton) findViewById(R.id.imageButtonc1);
        d1 = (ImageButton) findViewById(R.id.imageButtond1);
        e1 = (ImageButton) findViewById(R.id.imageButtone1);
        f1 = (ImageButton) findViewById(R.id.imageButtonf1);
        g1 = (ImageButton) findViewById(R.id.imageButtong1);
        h1 = (ImageButton) findViewById(R.id.imageButtonh1);
        a2 = (ImageButton) findViewById(R.id.imageButtona2);
        b2 = (ImageButton) findViewById(R.id.imageButtonb2);
        c2 = (ImageButton) findViewById(R.id.imageButtonc2);
        d2 = (ImageButton) findViewById(R.id.imageButtond2);
        e2 = (ImageButton) findViewById(R.id.imageButtone2);
        f2 = (ImageButton) findViewById(R.id.imageButtonf2);
        g2 = (ImageButton) findViewById(R.id.imageButtong2);
        h2 = (ImageButton) findViewById(R.id.imageButtonh2);
        a3 = (ImageButton) findViewById(R.id.imageButtona3);
        b3 = (ImageButton) findViewById(R.id.imageButtonb3);
        c3 = (ImageButton) findViewById(R.id.imageButtonc3);
        d3 = (ImageButton) findViewById(R.id.imageButtond3);
        e3 = (ImageButton) findViewById(R.id.imageButtone3);
        f3 = (ImageButton) findViewById(R.id.imageButtonf3);
        g3 = (ImageButton) findViewById(R.id.imageButtong3);
        h3 = (ImageButton) findViewById(R.id.imageButtonh3);
        a4 = (ImageButton) findViewById(R.id.imageButtona4);
        b4 = (ImageButton) findViewById(R.id.imageButtonb4);
        c4 = (ImageButton) findViewById(R.id.imageButtonc4);
        d4 = (ImageButton) findViewById(R.id.imageButtond4);
        e4 = (ImageButton) findViewById(R.id.imageButtone4);
        f4 = (ImageButton) findViewById(R.id.imageButtonf4);
        g4 = (ImageButton) findViewById(R.id.imageButtong4);
        h4 = (ImageButton) findViewById(R.id.imageButtonh4);
        a5 = (ImageButton) findViewById(R.id.imageButtona5);
        b5 = (ImageButton) findViewById(R.id.imageButtonb5);
        c5 = (ImageButton) findViewById(R.id.imageButtonc5);
        d5 = (ImageButton) findViewById(R.id.imageButtond5);
        e5 = (ImageButton) findViewById(R.id.imageButtone5);
        f5 = (ImageButton) findViewById(R.id.imageButtonf5);
        g5 = (ImageButton) findViewById(R.id.imageButtong5);
        h5 = (ImageButton) findViewById(R.id.imageButtonh5);
        a6 = (ImageButton) findViewById(R.id.imageButtona6);
        b6 = (ImageButton) findViewById(R.id.imageButtonb6);
        c6 = (ImageButton) findViewById(R.id.imageButtonc6);
        d6 = (ImageButton) findViewById(R.id.imageButtond6);
        e6 = (ImageButton) findViewById(R.id.imageButtone6);
        f6 = (ImageButton) findViewById(R.id.imageButtonf6);
        g6 = (ImageButton) findViewById(R.id.imageButtong6);
        h6 = (ImageButton) findViewById(R.id.imageButtonh6);
        a7 = (ImageButton) findViewById(R.id.imageButtona7);
        b7 = (ImageButton) findViewById(R.id.imageButtonb7);
        c7 = (ImageButton) findViewById(R.id.imageButtonc7);
        d7 = (ImageButton) findViewById(R.id.imageButtond7);
        e7 = (ImageButton) findViewById(R.id.imageButtone7);
        f7 = (ImageButton) findViewById(R.id.imageButtonf7);
        g7 = (ImageButton) findViewById(R.id.imageButtong7);
        h7 = (ImageButton) findViewById(R.id.imageButtonh7);
        a8 = (ImageButton) findViewById(R.id.imageButtona8);
        b8 = (ImageButton) findViewById(R.id.imageButtonb8);
        c8 = (ImageButton) findViewById(R.id.imageButtonc8);
        d8 = (ImageButton) findViewById(R.id.imageButtond8);
        e8 = (ImageButton) findViewById(R.id.imageButtone8);
        f8 = (ImageButton) findViewById(R.id.imageButtonf8);
        g8 = (ImageButton) findViewById(R.id.imageButtong8);
        h8 = (ImageButton) findViewById(R.id.imageButtonh8);
        board = queens.getBoard();
        Button giveUp = (Button) findViewById(R.id.button);
        int count = 0;

        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                if(board[i][j] == 1){
                    count++;
                }
            }
        }
       if (count < 8){
        if(queens.solveNQUtil(board,count)){
            board = queens.getBoard();
            if(board[0][0] == 1){
                a1.setImageResource(R.drawable.whitequeen);
            }
            if(board[0][1] == 1){
                b1.setImageResource(R.drawable.colorqueen);
            }
            if(board[0][2] == 1){
                c1.setImageResource(R.drawable.whitequeen);
            }
            if(board[0][3] == 1){
                d1.setImageResource(R.drawable.colorqueen);
            }
            if(board[0][4] == 1){
                e1.setImageResource(R.drawable.whitequeen);
            }
            if(board[0][5] == 1){
                f1.setImageResource(R.drawable.colorqueen);
            }
            if(board[0][6] == 1){
                g1.setImageResource(R.drawable.whitequeen);
            }
            if(board[0][7] == 1){
                h1.setImageResource(R.drawable.colorqueen);
            }
            if(board[1][0] == 1){
                a2.setImageResource(R.drawable.colorqueen);
            }
            if(board[1][1] == 1){
                b2.setImageResource(R.drawable.whitequeen);
            }
            if(board[1][2] == 1){
                c2.setImageResource(R.drawable.colorqueen);
            }
            if(board[1][3] == 1){
                d2.setImageResource(R.drawable.whitequeen);
            }
            if(board[1][4] == 1){
                e2.setImageResource(R.drawable.colorqueen);
            }
            if(board[1][5] == 1){
                f2.setImageResource(R.drawable.whitequeen);
            }
            if(board[1][6] == 1){
                g2.setImageResource(R.drawable.colorqueen);
            }
            if(board[1][7] == 1){
                h2.setImageResource(R.drawable.whitequeen);
            }
            if(board[2][0] == 1){
                a3.setImageResource(R.drawable.whitequeen);
            }
            if(board[2][1] == 1){
                b3.setImageResource(R.drawable.colorqueen);
            }
            if(board[2][2] == 1){
                c3.setImageResource(R.drawable.whitequeen);
            }
            if(board[2][3] == 1){
                d3.setImageResource(R.drawable.colorqueen);
            }
            if(board[2][4] == 1){
                e3.setImageResource(R.drawable.whitequeen);
            }
            if(board[2][5] == 1){
                f3.setImageResource(R.drawable.colorqueen);
            }
            if(board[2][6] == 1){
                g3.setImageResource(R.drawable.whitequeen);
            }
            if(board[2][7] == 1){
                h3.setImageResource(R.drawable.colorqueen);
            }
            if(board[3][0] == 1){
                a4.setImageResource(R.drawable.colorqueen);
            }
            if(board[3][1] == 1){
                b4.setImageResource(R.drawable.whitequeen);
            }
            if(board[3][2] == 1){
                c4.setImageResource(R.drawable.colorqueen);
            }
            if(board[3][3] == 1){
                d4.setImageResource(R.drawable.whitequeen);
            }
            if(board[3][4] == 1){
                e4.setImageResource(R.drawable.colorqueen);
            }
            if(board[3][5] == 1){
                f4.setImageResource(R.drawable.whitequeen);
            }
            if(board[3][6] == 1){
                g4.setImageResource(R.drawable.colorqueen);
            }
            if(board[3][7] == 1){
                h4.setImageResource(R.drawable.whitequeen);
            }
            if(board[4][0] == 1){
                a5.setImageResource(R.drawable.whitequeen);
            }
            if(board[4][1] == 1){
                b5.setImageResource(R.drawable.colorqueen);
            }
            if(board[4][2] == 1){
                c5.setImageResource(R.drawable.whitequeen);
            }
            if(board[4][3] == 1){
                d5.setImageResource(R.drawable.colorqueen);
            }
            if(board[4][4] == 1){
                e5.setImageResource(R.drawable.whitequeen);
            }
            if(board[4][5] == 1){
                f5.setImageResource(R.drawable.colorqueen);
            }
            if(board[4][6] == 1){
                g5.setImageResource(R.drawable.whitequeen);
            }
            if(board[4][7] == 1){
                h5.setImageResource(R.drawable.colorqueen);
            }
            if(board[5][0] == 1){
                a6.setImageResource(R.drawable.colorqueen);
            }
            if(board[5][1] == 1){
                b6.setImageResource(R.drawable.whitequeen);
            }
            if(board[5][2] == 1){
                c6.setImageResource(R.drawable.colorqueen);
            }
            if(board[5][3] == 1){
                d6.setImageResource(R.drawable.whitequeen);
            }
            if(board[5][4] == 1){
                e6.setImageResource(R.drawable.colorqueen);
            }
            if(board[5][5] == 1){
                f6.setImageResource(R.drawable.whitequeen);
            }
            if(board[5][6] == 1){
                g6.setImageResource(R.drawable.colorqueen);
            }
            if(board[5][7] == 1){
                h6.setImageResource(R.drawable.whitequeen);
            }
            if(board[6][0] == 1){
                a7.setImageResource(R.drawable.whitequeen);
            }
            if(board[6][1] == 1){
                b7.setImageResource(R.drawable.colorqueen);
            }
            if(board[6][2] == 1){
                c7.setImageResource(R.drawable.whitequeen);
            }
            if(board[6][3] == 1){
                d7.setImageResource(R.drawable.colorqueen);
            }
            if(board[6][4] == 1){
                e7.setImageResource(R.drawable.whitequeen);
            }
            if(board[6][5] == 1){
                f7.setImageResource(R.drawable.colorqueen);
            }
            if(board[6][6] == 1){
                g7.setImageResource(R.drawable.whitequeen);
            }
            if(board[6][7] == 1){
                h7.setImageResource(R.drawable.colorqueen);
            }
            if(board[7][0] == 1){
                a8.setImageResource(R.drawable.colorqueen);
            }
            if(board[7][1] == 1){
                b8.setImageResource(R.drawable.whitequeen);
            }
            if(board[7][2] == 1){
                c8.setImageResource(R.drawable.colorqueen);
            }
            if(board[7][3] == 1){
                d8.setImageResource(R.drawable.whitequeen);
            }
            if(board[7][4] == 1){
                e8.setImageResource(R.drawable.colorqueen);
            }
            if(board[7][5] == 1){
                f8.setImageResource(R.drawable.whitequeen);
            }
            if(board[7][6] == 1){
                g8.setImageResource(R.drawable.colorqueen);
            }
            if(board[7][7] == 1){
                h8.setImageResource(R.drawable.whitequeen);
            }
        }else{
            showPop("unsolvable");
        }
       }else{
           showPop("unsolvable");
       }
    }

    public void showPop(String s){
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context,s,duration);
        toast.show();
    }
}
