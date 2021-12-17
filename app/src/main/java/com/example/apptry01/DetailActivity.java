package com.example.apptry01;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import androidx.annotation.NonNull;

import androidx.appcompat.app.AppCompatActivity;
// 동아리 메뉴 클릭시 나오는 액티비티

public class DetailActivity extends AppCompatActivity {
    private Intent intent;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        intent = getIntent();
        imageView = (ImageView) findViewById(R.id.imageView);

        imageView.setImageResource(intent.getIntExtra("imgRes", 0));
    }
}