package com.example.apptry01;

import android.content.Intent;
import android.content.res.TypedArray;
import android.view.Menu;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

import java.util.ArrayList;

//로그인 성공시 나오는 메인화면 액티비티

public class MainActivity extends AppCompatActivity {
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_logout:
                Intent intent = new Intent(MainActivity.this,LoginActivity.class);
                startActivity(intent);
                //동작내용
                return true;
            case R.id.action_chat:
                Intent intent2 = new Intent(MainActivity.this,StartActivity.class);
                startActivity(intent2);






        }
        return super.onOptionsItemSelected(item);
    }

    private CustomAdapter adapter;
    private ListView listView;
    private FirebaseAuth mFirebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        adapter = new CustomAdapter();
        listView = (ListView) findViewById(R.id.listView);

        setData();

        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int imgRes = ((CustomDTO)adapter.getItem(position)).getResId();

                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra("imgRes",imgRes);
                startActivity(intent);
            }
        });


    }

    private void setData() {
        TypedArray arrResId = getResources().obtainTypedArray(R.array.resId);
        String[] titles = getResources().getStringArray(R.array.title);
        String[] contents = getResources().getStringArray(R.array.content);

        for (int i = 0; i < arrResId.length(); i++) {
            CustomDTO dto = new CustomDTO();
            dto.setResId(arrResId.getResourceId(i, 0));
            dto.setTitle(titles[i]);
            dto.setContent(contents[i]);

            adapter.addItem(dto);
        }
    }
}
