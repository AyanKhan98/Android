package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.Button;
import android.graphics.Color;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout myLayout=new RelativeLayout(this);

        RelativeLayout.LayoutParams buttonDetails= new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        buttonDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        buttonDetails.addRule(RelativeLayout.CENTER_VERTICAL);
        Button button=new Button(this);
        myLayout.setBackgroundColor(Color.MAGENTA);
        button.setBackgroundColor(Color.BLUE);
        button.setText("Click");
        myLayout.addView(button,buttonDetails);

        EditText editText= new EditText(this);
        button.setId(1);
        editText.setId(2);
        RelativeLayout.LayoutParams editTextDetails= new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        //editText.addRule(RelativeLayout.ABOVE,button.getId());
        //editText.addRule(RelativeLayout.CENTER_HORIZONTAL);
        //Margin setting to editText
        //editText.setMargins(0,0,0,50);

        myLayout.addView(editText,editTextDetails);


        setContentView(myLayout);
    }
}