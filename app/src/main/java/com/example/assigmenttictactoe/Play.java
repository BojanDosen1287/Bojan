package com.example.assigmenttictactoe;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import static com.example.assigmenttictactoe.R.drawable.o_sign;

public class Play extends AppCompatActivity {


    ImageView one;
    ImageView two;
    ImageView three;
    ImageView four;
    ImageView five;
    ImageView six;
    ImageView seven;
    ImageView eight;
    ImageView nine;
    ImageView wonImg;
    TextView wonTxt;
    TextView drawn;
    boolean redTurn = true;
    int oneN = 0;
    int twoN = 0;
    int threeN = 0;
    int fourN = 0;
    int fiveN = 0;
    int sixN = 0;
    int sevenN = 0;
    int eightN = 0;
    int nineN = 0;
    int drawnTriger = 0;
    int triger = 0;
    int tapped;
    Random random;
    ArrayList<Integer> arrlist;
    Animation bounce;


    int gameTime = 0;
    int lastMove = 0;


    public void stop() {
        one.setClickable(false);
        two.setClickable(false);
        three.setClickable(false);
        four.setClickable(false);
        five.setClickable(false);
        six.setClickable(false);
        seven.setClickable(false);
        eight.setClickable(false);
        nine.setClickable(false);

    }

    public void setWinerO() {

       /* wonTxt.animate().alpha(1f).setDuration(2000);
        wonTxt.setText(" is winer!");
        wonImg.animate().alpha(1f).setDuration(2000);
        wonImg.setImageResource(R.drawable.x_sign);*/
        wonTxt.startAnimation(bounce);
        wonImg.startAnimation(bounce);
        wonImg.setImageResource(R.drawable.x_sign);
        wonTxt.setText(" is winner!");
    }

    public void setWinerX() {
        wonTxt.startAnimation(bounce);
        wonImg.startAnimation(bounce);
        wonImg.setImageResource(R.drawable.o_sign);
        wonTxt.setText(" is winner!");

    }

    public void setDrawn() {
        drawn.startAnimation(bounce);
        drawn.setText("Drawn!");


    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play_layout);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Tic Tac Toe");
        one = (ImageView) findViewById(R.id.imageView1);
        two = (ImageView) findViewById(R.id.imageView2);
        three = (ImageView) findViewById(R.id.imageView3);
        four = (ImageView) findViewById(R.id.imageView4);
        five = (ImageView) findViewById(R.id.imageView6);
        six = (ImageView) findViewById(R.id.imageView7);
        seven = (ImageView) findViewById(R.id.imageView8);
        eight = (ImageView) findViewById(R.id.imageView9);
        nine = (ImageView) findViewById(R.id.imageView10);
        wonImg = (ImageView) findViewById(R.id.wonImg);
        wonTxt = (TextView) findViewById(R.id.textWon);
        drawn = (TextView) findViewById(R.id.drawn);
        random = new Random();
        arrlist = new ArrayList<Integer>();
        arrlist.add(1);
        arrlist.add(2);
        arrlist.add(3);
        arrlist.add(4);
        arrlist.add(5);
        arrlist.add(6);
        arrlist.add(7);
        arrlist.add(8);
        arrlist.add(9);
        bounce = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce);


    }


    public void dropIn(View view) throws InterruptedException {
        gameTime++;


        ImageView counter = (ImageView) view;
        counter.setImageResource(R.drawable.x_sign);


        tapped = Integer.parseInt(view.getTag().toString());
        if (tapped == 1) {
            one.setClickable(false);
            oneN++;
            if (((oneN + twoN + threeN) == 3) || ((oneN + fiveN + nineN) == 3) || ((oneN + twoN + threeN) == 3) || ((oneN + fourN + sevenN) == 3)) {
                drawnTriger = 1;
                triger = 11;
                redTurn = false;
                setWinerO();
                stop();
            }

        }
        if (tapped == 2) {
            twoN++;
            if (((oneN + twoN + threeN) == 3) || ((twoN + fiveN + eightN) == 3)) {
                drawnTriger = 1;
                triger = 11;
                redTurn = false;
                setWinerO();
                stop();
            }


        }
        if (tapped == 3) {
            threeN++;
            if (((oneN + twoN + threeN) == 3) || ((threeN + sixN + nineN) == 3) || ((fiveN + sevenN + threeN) == 3)) {
                drawnTriger = 1;
                triger = 11;
                redTurn = false;
                setWinerO();
                stop();
            }


        }
        if (tapped == 4) {
            fourN++;
            if (((oneN + fourN + sevenN) == 3) || ((fourN + fiveN + sixN) == 3)) {
                drawnTriger = 1;
                triger = 11;
                redTurn = false;
                setWinerO();
                stop();
            }


        }
        if (tapped == 5) {
            fiveN++;
            if ((((fourN + fiveN + sixN) == 3) || ((oneN + fiveN + nineN) == 3) || ((threeN + fiveN + sevenN) == 3) || ((twoN + fiveN + eightN) == 3))) {
                drawnTriger = 1;
                triger = 11;
                redTurn = false;
                setWinerO();
                stop();
            }


        }
        if (tapped == 6) {
            sixN++;
            if (((fourN + fiveN + sixN) == 3) || ((threeN + sixN + nineN) == 3)) {
                drawnTriger = 1;
                triger = 11;
                redTurn = false;
                setWinerO();
                stop();
            }

        }
        if (tapped == 7) {
            sevenN++;
            if (((oneN + fourN + sevenN) == 3) || ((threeN + fiveN + sevenN) == 3) || ((sevenN + eightN + nineN) == 3)) {
                drawnTriger = 1;
                triger = 11;
                redTurn = false;
                setWinerO();
                stop();
            }


        }
        if (tapped == 8) {
            eightN++;
            if (((eightN + fiveN + twoN) == 3) || ((sevenN + eightN + nineN) == 3)) {
                drawnTriger = 1;
                triger = 11;
                redTurn = false;
                setWinerO();
                stop();
            }


        }
        if (tapped == 9) {
            nineN++;
            if (((sevenN + eightN + nineN) == 3) || ((oneN + fiveN + nineN) == 3) || ((threeN + sixN + nineN) == 3)) {
                drawnTriger = 1;
                triger = 11;
                redTurn = false;
                setWinerO();
                stop();
            }


        }
        arrlist.removeAll(Arrays.asList(tapped));
        if (lastMove != 4) {
            triger = arrlist.get(random.nextInt(arrlist.size()));
        } else triger = 10;

        if (redTurn) {
            switch (triger) {

                case 1:

                    one.setImageResource(R.drawable.o_sign);
                    lastMove++;
                    arrlist.removeAll(Arrays.asList(1));
                    oneN += 5;
                    if (((oneN + twoN + threeN) == 15) || ((oneN + fiveN + nineN) == 15) || ((oneN + twoN + threeN) == 15) || ((oneN + fourN + sevenN) == 15)) {

                        setWinerX();
                        stop();
                    }

                    break;
                case 2:

                    two.setImageResource(R.drawable.o_sign);
                    lastMove++;
                    arrlist.removeAll(Arrays.asList(2));
                    twoN += 5;
                    if (((oneN + twoN + threeN) == 15) || ((twoN + fiveN + eightN) == 15)) {

                        setWinerX();
                        stop();
                    }

                    break;
                case 3:

                    lastMove++;
                    three.setImageResource(R.drawable.o_sign);
                    arrlist.removeAll(Arrays.asList(3));
                    threeN += 5;
                    if (((oneN + twoN + threeN) == 15) || ((threeN + sixN + nineN) == 15) || ((fiveN + sevenN + threeN) == 15)) {

                        setWinerX();
                        stop();
                    }

                    break;
                case 4:
                    lastMove++;
                    four.setImageResource(R.drawable.o_sign);
                    arrlist.removeAll(Arrays.asList(4));
                    fourN += 5;
                    if (((oneN + fourN + sevenN) == 15) || ((fourN + fiveN + sixN) == 15)) {

                        setWinerX();
                        stop();
                    }

                    break;
                case 5:
                    lastMove++;
                    five.setImageResource(R.drawable.o_sign);
                    arrlist.removeAll(Arrays.asList(5));
                    fiveN += 5;
                    if (((twoN + fiveN + eightN) == 15) || ((fourN + fiveN + sixN) == 15) || ((oneN + fiveN + nineN) == 15) || ((threeN + fiveN + sevenN) == 15)) {

                        setWinerX();
                        stop();
                    }

                    break;
                case 6:
                    lastMove++;
                    six.setImageResource(R.drawable.o_sign);
                    arrlist.removeAll(Arrays.asList(6));
                    sixN += 5;
                    if (((fourN + fiveN + sixN) == 15) || ((threeN + sixN + nineN) == 15)) {

                        setWinerX();
                        stop();
                    }

                    break;
                case 7:
                    lastMove++;
                    seven.setImageResource(R.drawable.o_sign);
                    arrlist.removeAll(Arrays.asList(7));
                    sevenN += 5;
                    if (((oneN + fourN + sevenN) == 15) || ((threeN + fiveN + sevenN) == 15) || ((sevenN + eightN + nineN) == 15)) {

                        setWinerX();
                        stop();
                    }

                    break;
                case 8:
                    lastMove++;
                    eight.setImageResource(R.drawable.o_sign);
                    arrlist.removeAll(Arrays.asList(8));
                    eightN += 5;
                    if (((eightN + fiveN + twoN) == 15) || ((sevenN + eightN + nineN) == 15)) {

                        setWinerX();
                        stop();
                    }

                    break;
                case 9:
                    lastMove++;
                    nine.setImageResource(R.drawable.o_sign);
                    arrlist.removeAll(Arrays.asList(9));
                    nineN += 5;
                    if (((sevenN + eightN + nineN) == 15) || ((oneN + fiveN + nineN) == 15) || ((threeN + sixN + nineN) == 15)) {

                        setWinerX();
                        stop();
                    }


                    break;
                case 10:
                    counter.setImageResource(R.drawable.x_sign);
                    counter.setClickable(false);
                    break;


            }
            if (gameTime == 5 && drawnTriger < 1) {

                setDrawn();

                stop();


            }


        }
    }


}




