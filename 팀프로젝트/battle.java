package com.wagdev.heromancer;

import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.wagdev.heromancer.R;

public class battle extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    BattleHandler handler;
    clickevent c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);//가로고정
        setContentView(R.layout.activity_battle);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);//바 없애기
        getSupportActionBar().hide();

        c=new clickevent(getResources());
        handler=new BattleHandler((LinearLayout)findViewById(R.id.chat),(ConstraintLayout)findViewById(R.id.window),this,c);
        mediaPlayer = MediaPlayer.create(this, R.raw.battle);
        //사운드 on/off 변경된 설정 반영하기 위해
        if(!Setting.soundOnOff){
            mediaPlayer.pause();
        }
        else if (!mediaPlayer.isPlaying() || Setting.soundOnOff)
        {
            mediaPlayer.start();
        }

    }

    public void end(){
        mediaPlayer.stop();
        finish();
    }

    @Override
    public void onBackPressed() {

    }
}