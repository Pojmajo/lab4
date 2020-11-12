package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        EditText editText = (EditText) findViewById(R.id.main_editText);
        String message = editText.getText().toString();
        intent.putExtra("EXTRA_MESSAGE", message);
        startActivity(intent);
    }

    public void goDrawing(View view) {
        Intent intent = new Intent(this, DrawingActivity.class);
        startActivity(intent);
    }
}