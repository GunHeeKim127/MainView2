package com.example.mainview;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {
    //View List
    private Button ok;
    private Button cancle;
    private EditText ID;
    private EditText Passward;
    private String TAG;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        init();
    }
    //각 Button 클릭시 화면 전환



    public void init(){
        ok=findViewById(R.id.OK);
        cancle=findViewById(R.id.cancle);
        //Al_status=findViewById(R.id.Al_status);
        //BPlist=findViewById(R.id.OK);
        //Enrollment=findViewById(R.id.Enrollment);
        //Diabet=findViewById(R.id.Diabet);

    }
    public void finish(View view) {
        moveTaskToBack(true);						// 태스크를 백그라운드로 이동
        finishAndRemoveTask();						// 액티비티 종료 + 태스크 리스트에서 지우기
        android.os.Process.killProcess(android.os.Process.myPid());	// 앱 프로세스 종료
    }

    public void OK(View view) {
        Intent intent = new Intent (this,MainActivity.class);
        Toast.makeText(getApplicationContext(),"onCreate():",Toast.LENGTH_LONG).show();
        Log.i(TAG,"onCreat():");
        startActivity(intent);
    }
}