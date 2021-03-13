package com.example.mainview;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class TimerAlam extends AppCompatActivity {
    //View List
    private TextView RealTime;
    private TextView Kind_of_Medical;
    //private TextView ;
    //private TextView ;
    private Button Camera;
    private Button Realam;
    //private TextView ;

    //Camera 연동
    Button btn = null ;
    ImageView iv = null ;

    //Music관련
    MediaPlayer mp=new MediaPlayer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.timeralam);
        init();


    }

    //setup
    public void init(){
       RealTime=findViewById(R.id.Real_Time);
       Kind_of_Medical=findViewById(R.id.Kind_of_medical);
       // Al_status=findViewById(R.id.Al_status);
       // BPlist=findViewById(R.id.BPlist);
        Camera=findViewById(R.id.Camera);
        Realam=findViewById(R.id.ReAlam);
    }

    //Camera setup
    private void setup () {
        btn = (Button) findViewById(R.id.Camera);
        iv = (ImageView) findViewById(R.id.CaIMG);

    }

    //Button Click Method
    //Camera 연동

    public void time(){
        //현재시간 출력
        long mNow = System.currentTimeMillis();
        Date mReDate = new Date(mNow);
        SimpleDateFormat mFormat = new SimpleDateFormat("HH:mm");
        String formatDate = mFormat.format(mReDate);
        RealTime.setText("로그인한 시간은" + mNow);
    }
    public void CameraStart(View v){
        setup();
        stopplay();
        time();
        Intent intent = new Intent (MediaStore. ACTION_IMAGE_CAPTURE );
        startActivity (intent);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        iv .setImageURI (data.getData ());

    }

    //알람 소리 끄기
    private void stopplay(){
        mp.stop();
    }
}