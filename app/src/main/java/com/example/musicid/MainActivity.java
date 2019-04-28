package com.example.musicid;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;

public class MainActivity extends AppCompatActivity {

    Button buMusic;
    AdView newAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buMusic = (Button) findViewById(R.id.buMusic);
        newAdView = findViewById(R.id.newAdView);

        buMusic.setOnClickListener(new View.OnClickListener() {
            //add animation

            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(getBaseContext(), ResultActivity.class);
                startActivity(intent);
            }
        });

//        newAdView.setAdSize(AdSize.BANNER);
//        newAdView.setAdUnitId("ca-app-pub-3940256099942544/6300978111");
        AdRequest adRequest = new AdRequest.Builder().build();
        newAdView.loadAd(adRequest);
    }


}
