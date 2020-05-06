package com.example.forummah.dhikrazkar;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Tasweeh extends Activity{

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            RelativeLayout defaultLayout = new RelativeLayout(this);
            final Button setAlarmButton = new Button(this);
            final EditText getAlarmNumberEditText = new EditText(this);
            final Button reSetAllCountButton = new Button(this);
            final TextView counterTextView = new TextView(this);
            final Button tasbeehButton = new Button(this);
            setContentView(defaultLayout);
            setAlarmButton.setId(1);
            getAlarmNumberEditText.setId(2);
            reSetAllCountButton.setId(3);
            counterTextView.setId(4);
            tasbeehButton.setId(5);


            setAlarmButton.setText("SET");
            setAlarmButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setAlarmButton.setEnabled(false);
                    int count = Integer.parseInt(String.valueOf(counterTextView.getText()));
                    int alarmNumber = Integer.parseInt(String.valueOf(getAlarmNumberEditText.getText())) ;
                    if(alarmNumber==count){
                        setAlarmButton.setEnabled(true);
                    }else if(alarmNumber<count){
                        setAlarmButton.setEnabled(true);
                        counterTextView.setText("0");
                    }
                }
            });
            setAlarmButton.setTextSize(TypedValue.COMPLEX_UNIT_DIP,30);
            //setAlarmButton.setTooltipText("Give an alarm on given number");
            RelativeLayout.LayoutParams setAlarmButtonDetails =
                    new RelativeLayout.LayoutParams(
                            RelativeLayout.LayoutParams.WRAP_CONTENT,
                            RelativeLayout.LayoutParams.WRAP_CONTENT
                    );
            setAlarmButtonDetails.addRule(RelativeLayout.ALIGN_PARENT_TOP);

            getAlarmNumberEditText.setText("0");
            getAlarmNumberEditText.setTextSize(TypedValue.COMPLEX_UNIT_DIP,30);
            getAlarmNumberEditText.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            getAlarmNumberEditText.setBackgroundColor(Color.TRANSPARENT);
            // getAlarmNumberEditText.setInputType(Integer);
            getAlarmNumberEditText.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    getAlarmNumberEditText.setText(null);
                    setAlarmButton.setEnabled(true);
                    //  counterTextView.setText("0");
                    counterTextView.setBackgroundColor(Color.TRANSPARENT);
                }
            });
            RelativeLayout.LayoutParams getAlarmNumberEditTextDetails =
                    new RelativeLayout.LayoutParams(
                            RelativeLayout.LayoutParams.WRAP_CONTENT,
                            RelativeLayout.LayoutParams.WRAP_CONTENT
                    );
            getAlarmNumberEditTextDetails.addRule(RelativeLayout.CENTER_HORIZONTAL,RelativeLayout.ALIGN_BOTTOM);
            getAlarmNumberEditTextDetails.addRule(RelativeLayout.RIGHT_OF,setAlarmButton.getId());
            getAlarmNumberEditTextDetails.setMargins(5,0,0,0);
            Resources resourcesOfGetAlarmNumberEditText = getResources();
            int pixelOfGetGetAlarmNumberEditText = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,155,resourcesOfGetAlarmNumberEditText.getDisplayMetrics());
            getAlarmNumberEditText.setWidth(pixelOfGetGetAlarmNumberEditText);

            reSetAllCountButton.setText("RESET");
            reSetAllCountButton.setTextSize(TypedValue.COMPLEX_UNIT_DIP,30);
            reSetAllCountButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    counterTextView.setText("0");
                    counterTextView.setBackgroundColor(Color.TRANSPARENT);
                    getAlarmNumberEditText.setText("0");
                    setAlarmButton.setEnabled(true);

                }
            });
            RelativeLayout.LayoutParams reSetAllCountButtonDetails =
                    new RelativeLayout.LayoutParams(
                            RelativeLayout.LayoutParams.WRAP_CONTENT,
                            RelativeLayout.LayoutParams.WRAP_CONTENT
                    );
            reSetAllCountButtonDetails.addRule(RelativeLayout.ALIGN_TOP);
            reSetAllCountButtonDetails.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
            reSetAllCountButtonDetails.setMargins(5,0,0,0);

            counterTextView.setText("0");
            counterTextView.setBackgroundColor(Color.TRANSPARENT);
            counterTextView.setTextSize(TypedValue.COMPLEX_UNIT_DIP,150);
            RelativeLayout.LayoutParams counterTextViewDetails =
                    new RelativeLayout.LayoutParams(
                            RelativeLayout.LayoutParams.WRAP_CONTENT,
                            RelativeLayout.LayoutParams.WRAP_CONTENT
                    );
            counterTextViewDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
            counterTextViewDetails.addRule(RelativeLayout.ABOVE,tasbeehButton.getId());
            counterTextViewDetails.setMargins(0,0,0,5);

            tasbeehButton.setText("TASBEEH");
            tasbeehButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int count = Integer.parseInt(String.valueOf(counterTextView.getText()));
                    int alarmNumber = Integer.parseInt(String.valueOf(getAlarmNumberEditText.getText())) ;
                    if(setAlarmButton.isEnabled()){
                        count++;
                        counterTextView.setText(String.valueOf(count));
                    }
                    else{

                        if (alarmNumber!=count&&alarmNumber>count){
                            count++;
                            counterTextView.setText(String.valueOf(count));
                        }
                        else if(alarmNumber!=count&&alarmNumber<count){
                            count= 0;
                            counterTextView.setText(String.valueOf(count));
                        }
                        else {
                            counterTextView.setBackgroundColor(Color.RED);
                        }
                    }

                }
            });
            // tasbeehButton.setTooltipText("Click here to count tasbeeh");
            tasbeehButton.setTextSize(TypedValue.COMPLEX_UNIT_DIP,50);
            RelativeLayout.LayoutParams tasbeehButtonDetails =
                    new RelativeLayout.LayoutParams(
                            RelativeLayout.LayoutParams.MATCH_PARENT,
                            RelativeLayout.LayoutParams.WRAP_CONTENT
                    );
            Resources resourceOfTasbeehButton = getResources();
            int pixelOfTasbeehButton = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,250,resourceOfTasbeehButton.getDisplayMetrics());
            tasbeehButton.setHeight(pixelOfTasbeehButton);
            tasbeehButtonDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
            tasbeehButtonDetails.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
            tasbeehButtonDetails.setMargins(0,5,0,0);

            defaultLayout.setBackgroundColor(Color.DKGRAY);
            defaultLayout.addView(setAlarmButton,setAlarmButtonDetails);
            defaultLayout.addView(getAlarmNumberEditText,getAlarmNumberEditTextDetails);
            defaultLayout.addView(reSetAllCountButton,reSetAllCountButtonDetails);
            defaultLayout.addView(counterTextView,counterTextViewDetails);
            defaultLayout.addView(tasbeehButton,tasbeehButtonDetails);

        }
    }


