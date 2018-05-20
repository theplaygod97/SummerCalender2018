package com.example.satya.summercalender2018;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {
    LinearLayout T1,T2;
    Animation updown,downup;
    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        T1 = (LinearLayout) findViewById(R.id.T1);
        T2 = (LinearLayout) findViewById(R.id.T2);
        updown = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.up_down);
        downup = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.down_up);
        T1.setAnimation(updown);
        T2.setAnimation(downup);

        final String[] Quotes={"You may have to fight a battle more than once to win it. - Margaret Thatcher",
                "As we look ahead into the next century, leaders will be those who empower others. - Bill Gates",
                "Innovation distinguishes between a leader and a follower. - Steve Jobs",
                "f you can’t explain it simply, you don’t understand it well enough. - Albert Einstein",
                "What seems to us as bitter trials are often blessings in disguise. - Oscar Wilde",
                "All our dreams can come true if we have the courage to pursue them. - Walt Disney",
                " I attribute my success to this: I never gave or took any excuse. – Florence Nightingale",
                " Every child is an artist.  The problem is how to remain an artist once he grows up. – Pablo Picasso",
                "The best revenge is massive success. – Frank Sinatra",
                "The two most important days in your life are the day you are born and the day you find out why. – Mark Twain"
                ,"Whether you think you can or you think you can’t, you’re right. – Henry Ford",
                "Certain things catch your eye, but pursue only those that capture the heart. – Ancient Indian Proverb",
                "It’s not the years in your life that count. It’s the life in your years. – Abraham Lincoln",
                "Inspire Others."};

        final TextView Text1=(TextView)findViewById(R.id.textView3);
        int rand1=(int)(Math.random()*14);
        Text1.setText(Quotes[rand1]);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 2500);

    }


}