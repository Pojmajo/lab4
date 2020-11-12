package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class photoDisplay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_display);

        Intent intent = getIntent();
        String message = intent.getExtras().getString("EXTRA_PHOTO_PATH");
        setPic(message);
    }

    private void setPic(String currentPhotoPath) {
        ImageView photo_view = (ImageView) findViewById(R.id.photo_view);
        Bitmap bitmap = BitmapFactory.decodeFile(currentPhotoPath);
        photo_view.setImageBitmap(bitmap);
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, second.class);
        EditText editText = (EditText) findViewById(R.id.main_editText);
        String message = "Check photo!";
        intent.putExtra("EXTRA_MESSAGE", message);
        startActivity(intent);

    }
}