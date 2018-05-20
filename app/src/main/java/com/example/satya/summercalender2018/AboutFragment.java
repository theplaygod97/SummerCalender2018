package com.example.satya.summercalender2018;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;


public class AboutFragment extends AppCompatActivity {
   RelativeLayout R1;
    Animation updown,downup;
    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);


        overridePendingTransition(R.anim.fadein, R.anim.fadeoutr);
        R1 = (RelativeLayout) findViewById(R.id.R1);
        updown = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.up_down);
        downup = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.down_up);
        R1.setAnimation(updown);


        ImageView img = (ImageView)findViewById(R.id.fb);
        img.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://fb.com"));
                startActivity(intent);
            }
        });
        ImageView img1 = (ImageView)findViewById(R.id.ln);
        img1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://linkedn.com"));
                startActivity(intent);
            }
        });
        ImageView img2 = (ImageView)findViewById(R.id.gith);
        img2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://github.com"));
                startActivity(intent);
            }
        });

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(AboutFragment.this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        overridePendingTransition(R.anim.animenter, R.anim.animleave);
        startActivity(intent);
        finish();

    }
}