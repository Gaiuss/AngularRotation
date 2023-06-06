package com.gaius.angular;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AngularRotationTouchView arView = findViewById(R.id.stv_xueyou);
        //arView.setImageBitamp(Text2BitmapUtils.getBitmap("二字",500,5,3,0xff22133,0x00999999));
        arView.setOnDeleteListener(() -> Log.d("MakeTAG", "onDelete: ------------"));

    }
}