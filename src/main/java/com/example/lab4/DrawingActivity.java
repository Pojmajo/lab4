package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class DrawingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drawing_activity);
        Drawing Drawing = new Drawing(this);
        setContentView(Drawing);

    }

}



