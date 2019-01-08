package com.example.danielsanchez.buscaminasyo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView space0;
    ImageView space1;
    ImageView space2;
    ImageView space3;
    ImageView space4;
    ImageView space5;
    ImageView space6;
    ImageView space7;
    ImageView space8;
    ImageView space9;
    ImageView space10;
    ImageView space11;
    ImageView space12;
    ImageView space13;
    ImageView space14;
    ImageView space15;
    ImageView space16;
    ImageView space17;
    ImageView space18;
    ImageView space19;
    ImageView space20;
    ImageView space21;
    ImageView space22;
    ImageView space23;
    ImageView space24;
    Button playButton;
    GridLayout gridLayout;
    TextView textView;
    boolean gameIsActive= false;
    int[] placedBombs = {99, 99,99,99,99};
    ArrayList<String> tappedPlaces = new ArrayList<String>();




    public void startButton(View view){
        gameIsActive=true;
        textView.setVisibility(View.INVISIBLE);
        playButton.setVisibility(View.INVISIBLE);
        space0.setVisibility(View.VISIBLE);
        space1.setVisibility(View.VISIBLE);
        space2.setVisibility(View.VISIBLE);
        space3.setVisibility(View.VISIBLE);
        space4.setVisibility(View.VISIBLE);
        space5.setVisibility(View.VISIBLE);
        space6.setVisibility(View.VISIBLE);
        space7.setVisibility(View.VISIBLE);
        space8.setVisibility(View.VISIBLE);
        space9.setVisibility(View.VISIBLE);
        space10.setVisibility(View.VISIBLE);
        space11.setVisibility(View.VISIBLE);
        space12.setVisibility(View.VISIBLE);
        space13.setVisibility(View.VISIBLE);
        space14.setVisibility(View.VISIBLE);
        space15.setVisibility(View.VISIBLE);
        space16.setVisibility(View.VISIBLE);
        space17.setVisibility(View.VISIBLE);
        space18.setVisibility(View.VISIBLE);
        space19.setVisibility(View.VISIBLE);
        space20.setVisibility(View.VISIBLE);
        space21.setVisibility(View.VISIBLE);
        space22.setVisibility(View.VISIBLE);
        space23.setVisibility(View.VISIBLE);
        space24.setVisibility(View.VISIBLE);
        gridLayout.setVisibility(View.VISIBLE);

       tappedPlaces.clear();

        for (int i=0;i<gridLayout.getChildCount();i++){
            ImageView counter= (ImageView)gridLayout.getChildAt(i);
            counter.setImageDrawable(null);
        }




        for (int i=0; i<placedBombs.length;i++){
            Random random= new Random();
            int randomNumber= random.nextInt(24);
            while (randomNumber== placedBombs[0]||randomNumber== placedBombs[1]||randomNumber== placedBombs[2]||randomNumber== placedBombs[3]||randomNumber== placedBombs[4]){
                randomNumber= random.nextInt(24);
            }


            placedBombs[i]= randomNumber;
            Log.i("placedbomb",Integer.toString(i)+" "+Integer.toString(placedBombs[i]));
        }
    }


    public void numberSelected(View view){

        ImageView view1= (ImageView)view;
        int placeOfNumber= Integer.parseInt(view1.getTag().toString());

            int countOfBombsAround=0;

            for (int e=0;e<placedBombs.length;e++){
                if (placeOfNumber== placedBombs[e]){

                }else {
                    if (placeOfNumber == 6 || placeOfNumber == 7 || placeOfNumber == 8 || placeOfNumber == 11 || placeOfNumber == 12 || placeOfNumber == 13 || placeOfNumber == 16 || placeOfNumber == 17 || placeOfNumber == 18) {


                        if (placeOfNumber - 6 == placedBombs[e]) {
                            countOfBombsAround = countOfBombsAround + 1;
                        }
                        if (placeOfNumber - 5 == placedBombs[e]) {
                            countOfBombsAround = countOfBombsAround + 1;
                        }
                        if (placeOfNumber - 4 == placedBombs[e]) {
                            countOfBombsAround = countOfBombsAround + 1;
                        }
                        if (placeOfNumber - 1 == placedBombs[e]) {
                            countOfBombsAround = countOfBombsAround + 1;
                        }
                        if (placeOfNumber + 1 == placedBombs[e]) {
                            countOfBombsAround = countOfBombsAround + 1;
                        }
                        if (placeOfNumber + 4 == placedBombs[e]) {
                            countOfBombsAround = countOfBombsAround + 1;
                        }
                        if (placeOfNumber + 5 == placedBombs[e]) {
                            countOfBombsAround = countOfBombsAround + 1;
                        }
                        if (placeOfNumber + 6 == placedBombs[e]) {
                            countOfBombsAround = countOfBombsAround + 1;
                        }
                    } else if (placeOfNumber == 0 || placeOfNumber == 5 || placeOfNumber == 10 || placeOfNumber == 15 || placeOfNumber == 20) {
                        if (placeOfNumber - 5 == placedBombs[e]) {
                            countOfBombsAround = countOfBombsAround + 1;
                        }
                        if (placeOfNumber - 4 == placedBombs[e]) {
                            countOfBombsAround = countOfBombsAround + 1;
                        }
                        if (placeOfNumber + 1 == placedBombs[e]) {
                            countOfBombsAround = countOfBombsAround + 1;
                        }
                        if (placeOfNumber + 5 == placedBombs[e]) {
                            countOfBombsAround = countOfBombsAround + 1;
                        }
                        if (placeOfNumber + 6 == placedBombs[e]) {
                            countOfBombsAround = countOfBombsAround + 1;
                        }
                    } else if (placeOfNumber == 1 || placeOfNumber == 2 || placeOfNumber == 3) {
                        if (placeOfNumber - 1 == placedBombs[e]) {
                            countOfBombsAround = countOfBombsAround + 1;
                        }
                        if (placeOfNumber + 1 == placedBombs[e]) {
                            countOfBombsAround = countOfBombsAround + 1;
                        }
                        if (placeOfNumber + 4 == placedBombs[e]) {
                            countOfBombsAround = countOfBombsAround + 1;
                        }
                        if (placeOfNumber + 5 == placedBombs[e]) {
                            countOfBombsAround = countOfBombsAround + 1;
                        }
                        if (placeOfNumber + 6 == placedBombs[e]) {
                            countOfBombsAround = countOfBombsAround + 1;
                        }
                    } else if (placeOfNumber == 4 || placeOfNumber == 9 || placeOfNumber == 14 || placeOfNumber == 19 || placeOfNumber == 24) {
                        if (placeOfNumber - 5 == placedBombs[e]) {
                            countOfBombsAround = countOfBombsAround + 1;
                        }
                        if (placeOfNumber - 6 == placedBombs[e]) {
                            countOfBombsAround = countOfBombsAround + 1;
                        }
                        if (placeOfNumber - 1 == placedBombs[e]) {
                            countOfBombsAround = countOfBombsAround + 1;
                        }
                        if (placeOfNumber + 4 == placedBombs[e]) {
                            countOfBombsAround = countOfBombsAround + 1;
                        }
                        if (placeOfNumber + 5 == placedBombs[e]) {
                            countOfBombsAround = countOfBombsAround + 1;
                        }
                         }else{
                        if (placeOfNumber - 1 == placedBombs[e]) {
                            countOfBombsAround = countOfBombsAround + 1;
                        }
                        if (placeOfNumber +1 == placedBombs[e]) {
                            countOfBombsAround = countOfBombsAround + 1;
                        }
                        if (placeOfNumber - 4 == placedBombs[e]) {
                            countOfBombsAround = countOfBombsAround + 1;
                        }
                        if (placeOfNumber - 6 == placedBombs[e]) {
                            countOfBombsAround = countOfBombsAround + 1;
                        }
                        if (placeOfNumber -5 == placedBombs[e]) {
                            countOfBombsAround = countOfBombsAround + 1;
                        }
                    }
                }
            Log.i("Placed checked:",Integer.toString(e));

            }

            if (countOfBombsAround==0){
                view1.setImageResource(R.drawable.cero);
            }else if (countOfBombsAround==1){
                view1.setImageResource(R.drawable.uno);
            }else if (countOfBombsAround==2){
                view1.setImageResource(R.drawable.dos);
            }else if (countOfBombsAround==3){
                view1.setImageResource(R.drawable.tres);
            }else if (countOfBombsAround==4){
                view1.setImageResource(R.drawable.cuatro);
            }else if (countOfBombsAround==5){
                view1.setImageResource(R.drawable.cinco);
            }else if (countOfBombsAround==6){
                view1.setImageResource(R.drawable.seis);
            }else if (countOfBombsAround==7){
                view1.setImageResource(R.drawable.siete);
            }else if (countOfBombsAround==8){
                view1.setImageResource(R.drawable.ocho);
            }
    }


    public void placedTouched(View view) {
        ImageView imageView = (ImageView) view;
        int place = Integer.parseInt(imageView.getTag().toString());



        if(imageView.getDrawable()==null){
            tappedPlaces.add(Integer.toString(place));
        }else{

        }

        Log.i("place touched", view.getTag().toString());
        Log.i("place touched", String.valueOf(imageView.getDrawable()));



        for (int i = 0; i < placedBombs.length; i++) {
            if (place == placedBombs[i]) {
                imageView.setImageResource(R.drawable.bomba);
                gameIsActive = false;
            }
        }

        if (gameIsActive && tappedPlaces.size()!=20) {
            numberSelected(view);

            }else {

            if (tappedPlaces.size()==20){
                gameIsActive=false;
                playButton.setText("Play Again!");
                playButton.setVisibility(View.VISIBLE);
                textView.setText("You won!");
                textView.setVisibility(View.VISIBLE);
            }else {
                playButton.setText("Play Again!");
                playButton.setVisibility(View.VISIBLE);
                textView.setText("You touched a bomb");
                textView.setVisibility(View.VISIBLE);
            }
            for(int e=0; e<placedBombs.length;e++) {
                if (placedBombs[e] == 0) {
                    space0.setImageResource(R.drawable.bomba);
                    space0.setVisibility(View.VISIBLE);
                } else if (placedBombs[e] == 1) {
                    space1.setImageResource(R.drawable.bomba);
                    space1.setVisibility(View.VISIBLE);
                } else if (placedBombs[e] == 2) {
                    space2.setImageResource(R.drawable.bomba);
                    space2.setVisibility(View.VISIBLE);
                } else if (placedBombs[e] == 3) {
                    space3.setImageResource(R.drawable.bomba);
                    space3.setVisibility(View.VISIBLE);
                } else if (placedBombs[e] == 4) {
                    space4.setImageResource(R.drawable.bomba);
                    space4.setVisibility(View.VISIBLE);
                } else if (placedBombs[e] == 5) {
                    space5.setImageResource(R.drawable.bomba);
                    space5.setVisibility(View.VISIBLE);
                } else if (placedBombs[e] == 6) {
                    space6.setImageResource(R.drawable.bomba);
                    space6.setVisibility(View.VISIBLE);
                } else if (placedBombs[e] == 7) {
                    space7.setImageResource(R.drawable.bomba);
                    space7.setVisibility(View.VISIBLE);
                } else if (placedBombs[e] == 8) {
                    space8.setImageResource(R.drawable.bomba);
                    space8.setVisibility(View.VISIBLE);
                } else if (placedBombs[e] == 9) {
                    space9.setImageResource(R.drawable.bomba);
                    space9.setVisibility(View.VISIBLE);
                } else if (placedBombs[e] == 10) {
                    space10.setImageResource(R.drawable.bomba);
                    space10.setVisibility(View.VISIBLE);
                } else if (placedBombs[e] == 11) {
                    space11.setImageResource(R.drawable.bomba);
                    space11.setVisibility(View.VISIBLE);
                } else if (placedBombs[e] == 12) {
                    space12.setImageResource(R.drawable.bomba);
                    space12.setVisibility(View.VISIBLE);
                } else if (placedBombs[e] == 13) {
                    space13.setImageResource(R.drawable.bomba);
                    space13.setVisibility(View.VISIBLE);
                } else if (placedBombs[e] == 14) {
                    space14.setImageResource(R.drawable.bomba);
                    space14.setVisibility(View.VISIBLE);
                } else if (placedBombs[e] == 15) {
                    space15.setImageResource(R.drawable.bomba);
                    space15.setVisibility(View.VISIBLE);
                } else if (placedBombs[e] == 16) {
                    space16.setImageResource(R.drawable.bomba);
                    space16.setVisibility(View.VISIBLE);
                } else if (placedBombs[e] == 17) {
                    space17.setImageResource(R.drawable.bomba);
                    space17.setVisibility(View.VISIBLE);
                } else if (placedBombs[e] == 18) {
                    space18.setImageResource(R.drawable.bomba);
                    space18.setVisibility(View.VISIBLE);
                } else if (placedBombs[e] == 19) {
                    space19.setImageResource(R.drawable.bomba);
                    space19.setVisibility(View.VISIBLE);
                } else if (placedBombs[e] == 20) {
                    space20.setImageResource(R.drawable.bomba);
                    space20.setVisibility(View.VISIBLE);
                } else if (placedBombs[e] == 21) {
                    space21.setImageResource(R.drawable.bomba);
                    space21.setVisibility(View.VISIBLE);
                } else if (placedBombs[e] == 22) {
                    space22.setImageResource(R.drawable.bomba);
                    space22.setVisibility(View.VISIBLE);
                } else if (placedBombs[e] == 23) {
                    space23.setImageResource(R.drawable.bomba);
                    space23.setVisibility(View.VISIBLE);
                } else if (placedBombs[e] == 24) {
                    space24.setImageResource(R.drawable.bomba);
                    space24.setVisibility(View.VISIBLE);
                }
            }

        }

    }











    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        space0= (ImageView)findViewById(R.id.imageView0);
        space1= (ImageView)findViewById(R.id.imageView1);
        space2= (ImageView)findViewById(R.id.imageView2);
        space3= (ImageView)findViewById(R.id.imageView3);
        space4= (ImageView)findViewById(R.id.imageView4);
        space5= (ImageView)findViewById(R.id.imageView5);
        space6= (ImageView)findViewById(R.id.imageView6);
        space7= (ImageView)findViewById(R.id.imageView7);
        space8= (ImageView)findViewById(R.id.imageView8);
        space9= (ImageView)findViewById(R.id.imageView9);
        space10= (ImageView)findViewById(R.id.imageView10);
        space11= (ImageView)findViewById(R.id.imageView11);
        space12= (ImageView)findViewById(R.id.imageView12);
        space13= (ImageView)findViewById(R.id.imageView13);
        space14= (ImageView)findViewById(R.id.imageView14);
        space15= (ImageView)findViewById(R.id.imageView15);
        space16= (ImageView)findViewById(R.id.imageView16);
        space17= (ImageView)findViewById(R.id.imageView17);
        space18= (ImageView)findViewById(R.id.imageView18);
        space19= (ImageView)findViewById(R.id.imageView19);
        space20= (ImageView)findViewById(R.id.imageView20);
        space21= (ImageView)findViewById(R.id.imageView21);
        space22= (ImageView)findViewById(R.id.imageView22);
        space23= (ImageView)findViewById(R.id.imageView23);
        space24= (ImageView)findViewById(R.id.imageView24);
        textView=(TextView)findViewById(R.id.textView);
        gridLayout=(GridLayout)findViewById(R.id.gridBuscaMinas);
        playButton=(Button)findViewById(R.id.button);

        space0.setVisibility(View.INVISIBLE);
        space1.setVisibility(View.INVISIBLE);
        space2.setVisibility(View.INVISIBLE);
        space3.setVisibility(View.INVISIBLE);
        space4.setVisibility(View.INVISIBLE);
        space5.setVisibility(View.INVISIBLE);
        space6.setVisibility(View.INVISIBLE);
        space7.setVisibility(View.INVISIBLE);
        space8.setVisibility(View.INVISIBLE);
        space9.setVisibility(View.INVISIBLE);
        space10.setVisibility(View.INVISIBLE);
        space11.setVisibility(View.INVISIBLE);
        space12.setVisibility(View.INVISIBLE);
        space13.setVisibility(View.INVISIBLE);


        space14.setVisibility(View.INVISIBLE);
        space15.setVisibility(View.INVISIBLE);
        space16.setVisibility(View.INVISIBLE);
        space17.setVisibility(View.INVISIBLE);
        space18.setVisibility(View.INVISIBLE);
        space19.setVisibility(View.INVISIBLE);
        space20.setVisibility(View.INVISIBLE);
        space21.setVisibility(View.INVISIBLE);
        space22.setVisibility(View.INVISIBLE);
        space23.setVisibility(View.INVISIBLE);
        space24.setVisibility(View.INVISIBLE);
        gridLayout.setVisibility(View.INVISIBLE);





    }
}

