package com.example.androidfragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);

        btn1.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                changeFragment(v);

            }
        });

        btn2.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                changeFragment(v);

            }
        });


    }
    public void changeFragment(View view) {
        Fragment fragment;
        if (view == findViewById(R.id.btn1)) {
            Log.d("tess","in btn1");
            fragment = new Fragment1();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fgmntDefault, fragment);
            ft.commit();
        }
        if (view == findViewById(R.id.btn2)) {
            Log.d("tess","in btn2");
            fragment = new Fragment2();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fgmntDefault, fragment);
            ft.commit();
        }

    }
}
