package com.oscar.career.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    // onsavedinstantstate, onrestoreinstantestate

    private static final String TAG = "activty";

//    EditText ed;

    ViewPager vp;
    TabLayout tabs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        vp = findViewById(R.id.pager);
        tabs = findViewById(R.id.tabs);

        vp.setAdapter(new MyPAgerAdpater(getSupportFragmentManager()));
        tabs.setupWithViewPager(vp);






//        ed = findViewById(R.id.name);
//
//        if (savedInstanceState != null){
//            String s = savedInstanceState.getString("data_key");
//            ed.setText(s);
//        }

        Log.d(TAG, "onCreate: ");

    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d(TAG, "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: ");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

//        String tempData = ed.getText().toString();
//        outState.putString("data_key", tempData);


        Log.d(TAG, "onSaveInstanceState: ");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(TAG, "onRestoreInstanceState: ");
//
//        String data = savedInstanceState.getString("data_key");
//        ed.setText(data);

    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d(TAG, "onRestart: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }
}