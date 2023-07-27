package com.example.helloworldbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //creating button object but not assigning anything yet
    Button buttonPress;
    TextView buttonText; //same here
    ImageView imageview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonPress = findViewById(R.id.button); //assigning by using button id
        buttonText = findViewById(R.id.buttonText); //assigning by using buttonText id
        imageview = (ImageView)findViewById(R.id.imageView);

        buttonPress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonText.setText("Hello world");
                imageview.setVisibility(View.VISIBLE);
            }
        });

    }

}