package com.example.mainview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //View List
    private Button TakeMe;
    private Button Al_status;
    private Button TakeList;
    private Button BPlist;
    private Button Enrollment;
    private Button Diabet;
    private String TAG;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    //각 Button 클릭시 화면 전환
    public void GotoT(View v){
        Intent intent = new Intent (this,TimerAlam.class);
        Toast.makeText(getApplicationContext(),"onCreate():",Toast.LENGTH_LONG).show();
        Log.i(TAG,"onCreat():");
        startActivity(intent);
    }
    public void GotoA(View v){
        Intent intent = new Intent (this,TimerAlam.class);
        Toast.makeText(getApplicationContext(),"onCreate():",Toast.LENGTH_LONG).show();
        Log.i(TAG,"onCreat():");
        startActivity(intent);
    }
    public void GotoL(View v){
        Intent intent = new Intent (this,TimerAlam.class);
        Toast.makeText(getApplicationContext(),"onCreate():",Toast.LENGTH_LONG).show();
        Log.i(TAG,"onCreat():");
        startActivity(intent);
    }public void GotoE(View v){
        Intent intent = new Intent (this,TimerAlam.class);
        Toast.makeText(getApplicationContext(),"onCreate():",Toast.LENGTH_LONG).show();
        Log.i(TAG,"onCreat():");
        startActivity(intent);
    }
    public void GotoD(View v){
        Intent intent = new Intent (this,TimerAlam.class);
        Toast.makeText(getApplicationContext(),"onCreate():",Toast.LENGTH_LONG).show();
        Log.i(TAG,"onCreat():");
        startActivity(intent);
    }
    public void GotoB(View v){
        Intent intent = new Intent (this,TimerAlam.class);
        Toast.makeText(getApplicationContext(),"onCreate():",Toast.LENGTH_LONG).show();
        Log.i(TAG,"onCreat():");
        startActivity(intent);
    }

    public void init(){
        TakeList=findViewById(R.id.TakeList);
        TakeMe=findViewById(R.id.TakeMe);
        Al_status=findViewById(R.id.Al_status);
        BPlist=findViewById(R.id.OK);
        Enrollment=findViewById(R.id.Enrollment);
        Diabet=findViewById(R.id.Diabet);
    }
}