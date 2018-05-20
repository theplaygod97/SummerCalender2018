package com.example.satya.summercalender2018;


import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.provider.ContactsContract;
import android.support.design.widget.NavigationView;
import android.support.v4.app.NotificationCompat;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.transition.Explode;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Calendar;


public class MainActivity extends AppCompatActivity {

    private static final String uniqueID ="com.example.satya.summercalender2018" ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

        int X=Calendar.DAY_OF_MONTH;
        final ArrayList<Integer> alarmDays= new ArrayList<>();
        alarmDays.add(X);

        ImageView button=(ImageView) findViewById(R.id.onClickAlarm);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void  onClick(View v) {
                SSS(alarmDays);
            }
            void SSS(ArrayList<Integer> A){
                Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM);
                intent.putExtra(AlarmClock.EXTRA_HOUR,12);
                intent.putExtra(AlarmClock.EXTRA_MINUTES,00);
                intent.putExtra(AlarmClock.EXTRA_MESSAGE,"PPT CLASS 3:00 PM");
                intent.putExtra(AlarmClock.EXTRA_DAYS,A);
                startActivity(intent);
            }
        });

        android.support.v7.widget.Toolbar toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("   Home");
        toolbar.setLogo(R.drawable.ic_sun_umbrella);


        final DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,
            drawer,
            toolbar,
            R.string.navigation_drawer_open,
            R.string.navigation_drawer_close);
      drawer.addDrawerListener(toggle);
      toggle.syncState();


        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setItemIconTintList(null);
        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem item) {
                        // set item as selected to persist highlight

                        // close drawer when item is tapped
                        item.setChecked(false);
                        switch (item.getItemId()) {

                                case R.id.nav_about:
                                    Intent intent = new Intent(MainActivity.this, AboutFragment.class);
                                    overridePendingTransition(R.anim.slidein,R.anim.slideout);
                                    startActivity(intent);
                                    finish();
                                    item.setChecked(true);
                                    break;

                            case R.id.nav_share:
                                Intent sendIntent = new Intent();
                                sendIntent.setAction(Intent.ACTION_SEND);
                                sendIntent.putExtra(Intent.EXTRA_TEXT, "This is my text to send.");
                                sendIntent.setType("text/plain");
                                startActivity(sendIntent);
                                item.setChecked(true);
                                break;

                            case R.id.nav_git:
                                Uri uri = Uri.parse("http://www.google.com"); // missing 'http://' will cause crashed
                                Intent Linkintent = new Intent(Intent.ACTION_VIEW, uri);
                                startActivity(Linkintent);
                                item.setChecked(true);
                                break;

                            case R.id.nav_feedback:
                                Uri uri1 = Uri.parse("http://www.google.com"); // missing 'http://' will cause crashed
                                Intent Linkintent1 = new Intent(Intent.ACTION_VIEW, uri1);
                                startActivity(Linkintent1);
                                item.setChecked(true);
                                break;

                        }
                        item.setChecked(false);
                        drawer.closeDrawers();

                        // Add code here to update the UI based on the item selected
                        // For example, swap UI fragments here

                        return true;
                    }
                });


      final CalendarView calendarView;

        calendarView = (CalendarView) findViewById(R.id.simpleCalendarView); // get the reference of CalendarView
        calendarView.setFocusedMonthDateColor(Color.RED); // set the red color for the dates of  focused month
        calendarView.setUnfocusedMonthDateColor(Color.BLUE); // set the yellow color for the dates of an unfocused month
        calendarView.setSelectedWeekBackgroundColor(Color.RED); // red color for the selected week's background
        calendarView.setWeekSeparatorLineColor(Color.GREEN); // green color for the week separator line

        // perform setOnDateChangeListener event on CalendarView
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override

            public void onSelectedDayChange(CalendarView view, int year, int month, final int dayOfMonth) {
                TextView helloTextView = (TextView) findViewById(R.id.Text1);
                android.support.v7.widget.Toolbar toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
                int thisMonth = month;
                if(thisMonth==4)
                    toolbar.setTitle("   MAY");
                else toolbar.setTitle("   JUNE");
                String S1="Higher Maths\nE 114";
                String S2="Arithmetic\nE 314";
                String S3="Reasoning\nE 414";
                String S4="English 1\nE 514";
                String S5="English 2\nE 515";
                String S6="INTERNSHIP";
                String S7="NO CLASSES";

                int D=dayOfMonth;int X=0;
                //MAY
                if(month==4&&(D==5||D==12||D==19||D==26))
                    X=0;
                else if(month==4&&(D==6||D==13||D==20||D==27))
                    X=1;
                else if(month==4&&(D==7||D==14||D==21||D==28))
                    X=2;
                else if(month==4&&(D==1||D==8||D==15||D==22||D==29))
                    X=3;
                else if(month==4&&(D==2||D==9||D==16||D==23||D==30))
                    X=4;
                else if(month==4&&(D==3||D==10||D==17||D==24||D==31))
                    X=5;
                else if(month==4&&(D==4||D==11||D==18||D==25))
                    X=5;
                //JUNE
                else if(month==5&&(D==2||D==9||D==16||D==23||D==30))
                    X=0;
                else if(month==5&&(D==3||D==10||D==17||D==24))
                    X=1;
                else if(month==5&&(D==4||D==11||D==18||D==25))
                    X=2;
                else if(month==5&&(D==5||D==12||D==19||D==26))
                    X=3;
                else if(month==5&&(D==6||D==13||D==20||D==27))
                    X=4;
                else if(month==5&&(D==7||D==14||D==21||D==28))
                    X=5;
                else if(month==5&&(D==1||D==8||D==15||D==22||D==29))
                    X=5;


                final ArrayList<Integer> alarmDays= new ArrayList<>();
                alarmDays.add(X);

                ImageView button=(ImageView) findViewById(R.id.onClickAlarm);
                button.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void  onClick(View v) {
                        Calendar cal = Calendar.getInstance();
                        //24 hour format
                        int thisDay = cal.get(Calendar.DAY_OF_MONTH);

                        int hourofday = cal.get(Calendar.HOUR_OF_DAY);
                        if (thisDay==dayOfMonth&&(hourofday >= 13 && hourofday <= 24)) {        // Creating alert Dialog with two Buttons

                            AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);

                            // Setting Dialog Title
                            alertDialog.setTitle("Why");
                            alertDialog.setIcon(R.drawable.ic_warning_black_24dp);
                            // Setting Dialog Message
                            alertDialog.setMessage("Three o’clock is always too late or too early for anything you want to do.\nEither u missed today's class or you are too early for the next one.");

                            // Setting Positive "Yes" Button
                            alertDialog.setPositiveButton("HMMMM",
                                    new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int which) {

                                            Toast T=new Toast(getApplicationContext());
                                            ImageView view = new ImageView(getApplicationContext());
                                            view.setImageResource(R.drawable.ic_code_black_24dp);
                                            T.setView(view);
                                            T.show();

                                            // Write your code here to execute after dialog
                                            Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM);
                                            intent.putExtra(AlarmClock.EXTRA_HOUR, 12);
                                            intent.putExtra(AlarmClock.EXTRA_MINUTES, 00);
                                            intent.putExtra(AlarmClock.EXTRA_MESSAGE, "CLASS");
                                            intent.putExtra(AlarmClock.EXTRA_DAYS, alarmDays);
                                            startActivity(intent);

                                            dialog.cancel();
                                        }
                                    });


                            // Showing Alert Message
                            alertDialog.show();
                        } else {
                            Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM);
                            intent.putExtra(AlarmClock.EXTRA_HOUR, 12);
                            intent.putExtra(AlarmClock.EXTRA_MINUTES, 00);
                            intent.putExtra(AlarmClock.EXTRA_MESSAGE, "CLASS");
                            intent.putExtra(AlarmClock.EXTRA_DAYS, alarmDays);
                            startActivity(intent);
                        }
                    }

                });

                // display the selected date by using a toast
                Toast toast = new Toast(getApplicationContext());
                ImageView im1 = new ImageView(getApplicationContext());
                im1.setImageResource(R.drawable.ic_blackboard_1);
                ImageView im2 = new ImageView(getApplicationContext());
                im2.setImageResource(R.drawable.ic_the_sum_of);
                ImageView im3 = new ImageView(getApplicationContext());
                im3.setImageResource(R.drawable.ic_brain);
                ImageView im4 = new ImageView(getApplicationContext());
                im4.setImageResource(R.drawable.ic_translate);
                ImageView im5 = new ImageView(getApplicationContext());
                im5.setImageResource(R.drawable.ic_letter);
                ImageView im6 = new ImageView(getApplicationContext());
                im6.setImageResource(R.drawable.ic_workplace);
                ImageView im7 = new ImageView(getApplicationContext());
                im7.setImageResource(R.drawable.ic_summer);



                if(year==2018 && month==4 && dayOfMonth ==4) {
                    Calnotify(dayOfMonth,month,year,S1);
                    helloTextView.setText(dayOfMonth + "/" + (month+1) + "/" + year + " " + S1);
                   toast.setView(im1);toast.show();
                }
                else if(year==2018 && month==4 && dayOfMonth ==9) {
                    Calnotify(dayOfMonth,month,year,S1);
                    helloTextView.setText(dayOfMonth + "/" + (month+1) + "/" + year + " " + S1);
                   toast.setView(im1);toast.show();
                }
                else if(year==2018 && month==5 && dayOfMonth ==19) {
                    Calnotify(dayOfMonth,month,year,S1);
                    helloTextView.setText(dayOfMonth + "/" + (month+1) + "/" + year + " " + S1);
                   toast.setView(im1);toast.show();
                }
                else if(year==2018 && month==5 && dayOfMonth ==24) {
                    Calnotify(dayOfMonth,month,year,S1);
                    helloTextView.setText(dayOfMonth + "/" + (month+1) + "/" + year + " " + S1);
                   toast.setView(im1);toast.show();
                }
                else if(year==2018 && month==5 && dayOfMonth ==29) {
                    Calnotify(dayOfMonth,month,year,S1);
                    helloTextView.setText(dayOfMonth + "/" + (month+1) + "/" + year + " " + S1);
                   toast.setView(im1);toast.show();
                }
                else if(year==2018 && month==4 && dayOfMonth ==1) {
                    Calnotify(dayOfMonth,month,year,S2);
                    helloTextView.setText(dayOfMonth + "/" + (month+1) + "/" + year + " " + S2);
                    toast.setView(im2);toast.show();
                }
                else if(year==2018 && month==4 && dayOfMonth ==6) {
                    Calnotify(dayOfMonth,month,year,S2);
                    helloTextView.setText(dayOfMonth + "/" + (month+1) + "/" + year + " " + S2);
                    toast.setView(im2);toast.show();
                }
                else if(year==2018 && month==4 && dayOfMonth ==11) {
                    Calnotify(dayOfMonth,month,year,S2);
                    helloTextView.setText(dayOfMonth + "/" + (month+1) + "/" + year + " " + S2);
                    toast.setView(im2);toast.show();
                }
                else if(year==2018 && month==5 && dayOfMonth ==21) {
                    Calnotify(dayOfMonth,month,year,S2);
                    helloTextView.setText(dayOfMonth + "/" + (month+1) + "/" + year + " " + S2);
                    toast.setView(im2);toast.show();
                }
                else if(year==2018 && month==5 && dayOfMonth ==26) {
                    Calnotify(dayOfMonth,month,year,S2);
                    helloTextView.setText(dayOfMonth + "/" + (month+1) + "/" + year + " " + S2);
                    toast.setView(im2);toast.show();
                }
                else if(year==2018 && month==4 && dayOfMonth ==3) {
                    Calnotify(dayOfMonth,month,year,S3);
                    helloTextView.setText(dayOfMonth + "/" + (month+1) + "/" + year + " " + S3);
                    toast.setView(im3);toast.show();
                }
                else if(year==2018 && month==4 && dayOfMonth ==8) {
                    Calnotify(dayOfMonth,month,year,S3);
                    helloTextView.setText(dayOfMonth + "/" + (month+1) + "/" + year + " " + S3);
                    toast.setView(im3);toast.show();
                }
                else if(year==2018 && month==5 && dayOfMonth ==18) {
                    Calnotify(dayOfMonth,month,year,S3);
                    helloTextView.setText(dayOfMonth + "/" + (month+1) + "/" + year + " " + S3);
                    toast.setView(im3);toast.show();
                }
                else if(year==2018 && month==5 && dayOfMonth ==23) {
                    Calnotify(dayOfMonth,month,year,S3);
                    helloTextView.setText(dayOfMonth + "/" + (month+1) + "/" + year + " " + S3);
                    toast.setView(im3);toast.show();
                }
                else if(year==2018 && month==5 && dayOfMonth ==27) {
                    Calnotify(dayOfMonth,month,year,S3);
                    helloTextView.setText(dayOfMonth + "/" + (month+1) + "/" + year + " " + S3);
                    toast.setView(im3);toast.show();
                }
                else if(year==2018 && month==4 && dayOfMonth ==2) {
                    Calnotify(dayOfMonth,month,year,S4);
                    helloTextView.setText(dayOfMonth + "/" + (month+1) + "/" + year + " " + S4);
                    toast.setView(im4);toast.show();
                }
                else if(year==2018 && month==4 && dayOfMonth ==7) {
                    Calnotify(dayOfMonth,month,year,S4);
                    helloTextView.setText(dayOfMonth + "/" + (month+1) + "/" + year + " " + S4);
                    toast.setView(im4);toast.show();
                }
                else if(year==2018 && month==4 && dayOfMonth ==12) {
                    Calnotify(dayOfMonth,month,year,S4);
                    helloTextView.setText(dayOfMonth + "/" + (month+1) + "/" + year + " " + S4);
                    toast.setView(im4);toast.show();
                }
                else if(year==2018 && month==5 && dayOfMonth ==22) {
                    Calnotify(dayOfMonth,month,year,S4);
                    helloTextView.setText(dayOfMonth + "/" + (month+1) + "/" + year + " " + S4);
                    toast.setView(im4);toast.show();
                }
                else if(year==2018 && month==5 && dayOfMonth ==27) {
                    Calnotify(dayOfMonth,month,year,S4);
                    helloTextView.setText(dayOfMonth + "/" + (month+1) + "/" + year + " " + S4);
                    toast.setView(im4);toast.show();
                }
                else if(year==2018 && month==4 && dayOfMonth ==5) {
                    Calnotify(dayOfMonth,month,year,S5);
                    helloTextView.setText(dayOfMonth + "/" + (month+1) + "/" + year + " " + S5);
                    toast.setView(im5);toast.show();
                }
                else if(year==2018 && month==4 && dayOfMonth ==10) {
                    Calnotify(dayOfMonth,month,year,S5);
                    helloTextView.setText(dayOfMonth + "/" + (month+1) + "/" + year + " " + S5);
                    toast.setView(im5);toast.show();
                }
                else if(year==2018 && month==5 && dayOfMonth ==20) {
                    Calnotify(dayOfMonth,month,year,S5);
                    helloTextView.setText(dayOfMonth + "/" + (month+1) + "/" + year + " " + S5);
                    toast.setView(im5);toast.show();
                }
                else if(year==2018 && month==5 && dayOfMonth ==25) {
                    Calnotify(dayOfMonth,month,year,S5);
                    helloTextView.setText(dayOfMonth + "/" + (month+1) + "/" + year + " " + S5);
                    toast.setView(im5);toast.show();
                }
                else if(year==2018 && month==5 && dayOfMonth ==30) {
                    Calnotify(dayOfMonth,month,year,S5);
                    helloTextView.setText(dayOfMonth + "/" + (month+1) + "/" + year + " " + S5);
                    toast.setView(im5);toast.show();
                }
                else if((year==2018 && month==4 && dayOfMonth >=15) || (year==2018 && month==5 && dayOfMonth <=15)){
                    Cal2notify(dayOfMonth,month,year,S6);
                    helloTextView.setText(dayOfMonth + "/" + (month+1) + "/" + year + " " + S6);
                    toast.setView(im6);toast.show();
                }
                else{
                    Cal1notify(dayOfMonth,month,year,S7);
                    helloTextView.setText(dayOfMonth + "/" + (month+1) + "/" + year + " " + S7);
                    toast.setView(im7);toast.show();
                }
            }

        });
    }

    public void Calnotify(int w,int x,int y,String z){

        NotificationCompat.Builder  notification = new NotificationCompat.Builder(this,uniqueID);
        //Build the notification
        notification.setSmallIcon(R.drawable.ic_event_available_black_24dp);
        notification.setTicker("Notifier");
        notification.setWhen(System.currentTimeMillis());
        notification.setContentTitle(w + "/" + (x+1) + "/" + y + " " +"PPT CLASS");
        notification.setContentText( z + " " +"At 3.00 PM");

        Intent intent = new Intent(this, MainActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
        notification.setContentIntent(pendingIntent);
        notification.setAutoCancel(true);
        //Builds notification and issues it
        NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        nm.notify(0, notification.build());
    }

    public void Cal1notify (int w,int x,int y,String z){
        NotificationCompat.Builder  notification = new NotificationCompat.Builder(this,uniqueID);
        //Build the notification
        notification.setSmallIcon(R.drawable.ic_event_busy_black_24dp);
        notification.setTicker("This is the ticker");
        notification.setWhen(System.currentTimeMillis());
        notification.setContentTitle(w + "/" + (x+1) + "/" + y + " " +"NO PPT CLASS");
        notification.setContentText( z + " " +"Enjoy");

        Intent intent = new Intent(this, MainActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
        notification.setContentIntent(pendingIntent);
        notification.setAutoCancel(true);
        //Builds notification and issues it
        NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        nm.notify(0, notification.build());
    }

    public void Cal2notify(int w,int x,int y,String z){
        NotificationCompat.Builder  notification = new NotificationCompat.Builder(this,uniqueID);

        //Build the notification
        notification.setSmallIcon(R.drawable.ic_event_note_black_24dp);
        notification.setTicker("This is the ticker");
        notification.setWhen(System.currentTimeMillis());
        notification.setContentTitle(w + "/" + (x+1) + "/" + y + " " +"INTERNSHIP ");
        notification.setContentText( z + " " +"9:00 AM - 5:00 PM");

        Intent intent = new Intent(this, MainActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
        notification.setContentIntent(pendingIntent);
        notification.setAutoCancel(true);
        //Builds notification and issues it
        NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        nm.notify(0, notification.build());
    }


    private void createNotificationChannel() {

        // Create the NotificationChannel, but only on API 26+ because
        // the NotificationChannel class is new and not in the support library
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            CharSequence name = getString(R.string.channel_name);
            String description = getString(R.string.channel_description);
            int importance = NotificationManager.IMPORTANCE_DEFAULT;
            NotificationChannel channel = new NotificationChannel(uniqueID, name, importance);
            channel.setDescription(description);
            // Register the channel with the system; you can't change the importance
            // or other notification behaviors after this
            NotificationManager notificationManager = getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);
        }
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

}
