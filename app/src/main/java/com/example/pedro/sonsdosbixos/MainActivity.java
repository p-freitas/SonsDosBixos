package com.example.pedro.sonsdosbixos;

import android.media.MediaPlayer;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView cao;
    private ImageView gato;
    private ImageView leao;
    private ImageView vaca;
    private ImageView macaco;
    private ImageView ovelha;
    private ImageView dino;

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cao=(ImageView) findViewById(R.id.cao);
        gato=(ImageView) findViewById(R.id.gato);
        leao=(ImageView) findViewById(R.id.leao);
        vaca=(ImageView) findViewById(R.id.vaca);
        macaco=(ImageView) findViewById(R.id.macaco);
        ovelha=(ImageView) findViewById(R.id.ovelha);
        dino=(ImageView) findViewById(R.id.dino);

        cao.setOnClickListener(this);
        gato.setOnClickListener(this);
        leao.setOnClickListener(this);
        vaca.setOnClickListener(this);
        macaco.setOnClickListener(this);
        ovelha.setOnClickListener(this);
        dino.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch ( v.getId()){
            case R.id.cao:
                mediaPlayer = mediaPlayer.create(MainActivity.this, R.raw.cao);
                tocarSom();

                break;
        }
        switch ( v.getId()){
            case R.id.gato:
                mediaPlayer = mediaPlayer.create(MainActivity.this, R.raw.gato);
                tocarSom();

                break;
        }
        switch ( v.getId()){
            case R.id.leao:
                mediaPlayer = mediaPlayer.create(MainActivity.this, R.raw.leao);
                tocarSom();

                break;
        }
        switch ( v.getId()){
            case R.id.vaca:
                mediaPlayer = mediaPlayer.create(MainActivity.this, R.raw.vaca);
                tocarSom();

                break;
        }
        switch ( v.getId()){
            case R.id.macaco:
                mediaPlayer = mediaPlayer.create(MainActivity.this, R.raw.macaco);
                tocarSom();

                break;
        }
        switch ( v.getId()){
            case R.id.ovelha:
                mediaPlayer = mediaPlayer.create(MainActivity.this, R.raw.ovelha);
                tocarSom();

                break;
        }
        switch ( v.getId()){
            case R.id.dino:
                mediaPlayer = mediaPlayer.create(MainActivity.this, R.raw.dino);
                tocarSom();

                break;
        }

        if ( !(mediaPlayer.isPlaying()) ){

            mediaPlayer.start();}

    }



    public void tocarSom(){
        if (mediaPlayer != null){
            mediaPlayer.start();

            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    mediaPlayer.release();
                    mediaPlayer = null;
                }
            });
        }
    }

    @Override
    protected void onDestroy() {
        if (mediaPlayer!=null){
            mediaPlayer.release();
            mediaPlayer = null;
        }
        super.onDestroy();
    }

}
