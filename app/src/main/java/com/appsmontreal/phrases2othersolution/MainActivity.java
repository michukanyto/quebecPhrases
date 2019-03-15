package com.appsmontreal.phrases2othersolution;

import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void translate(View view){

        Button playButton = (Button) view;
        playButton.animate().rotationY(360).setDuration(1500);
        MediaPlayer mediaPlayer = MediaPlayer.create(this,playButton.getResources().getIdentifier(playButton.getTag().toString(),"raw",getPackageName()));
        mediaPlayer.start();
        Log.i("button pressed : ", playButton.getTag().toString());
        String mesageToast;

        switch(playButton.getTag().toString()){
            case "doyouspeakenglish":
                mesageToast = "Tu parles l'anglais?";
                break;
            case "goodevening" :
                mesageToast = "Bonne soire";
                break;
            case "hello" :
                mesageToast = "Bonjour";
                break;
            case "howareyou" :
                mesageToast = "Ça va?";
                break;
            case "ilivein" :
                mesageToast = "Je habite à...";
                break;
            case "mynameis" :
                mesageToast = "Je m'appelle?";
                break;
            case "please" :
                mesageToast = "S’il vous plaît";
                break;
            case "welcome" :
                mesageToast = "Bienvenue";
                break;
            default:
                mesageToast = "Merci";

        }

        Toast.makeText(this,mesageToast,Toast.LENGTH_LONG).show();

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
