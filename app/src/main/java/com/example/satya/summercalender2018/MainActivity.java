package com.example.satya.summercalender2018;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Color;
import android.icu.text.SimpleDateFormat;
import android.os.Build;
import android.os.PersistableBundle;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.Toast;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;

import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;

import static java.util.logging.Logger.global;

public class MainActivity extends AppCompatActivity {

    private static final String uniqueID ="com.example.satya.summercalender2018" ;
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    CalendarView calendarView;

        calendarView = (CalendarView) findViewById(R.id.simpleCalendarView); // get the reference of CalendarView
        calendarView.setFocusedMonthDateColor(Color.RED); // set the red color for the dates of  focused month
        calendarView.setUnfocusedMonthDateColor(Color.BLUE); // set the yellow color for the dates of an unfocused month
        calendarView.setSelectedWeekBackgroundColor(Color.RED); // red color for the selected week's background
        calendarView.setWeekSeparatorLineColor(Color.GREEN); // green color for the week separator line


        // perform setOnDateChangeListener event on CalendarView
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth) {
                // display the selected date by using a toast

                if(year==2018 && month==4 && dayOfMonth ==4) {
                    Calnotify();
                    Toast.makeText(getApplicationContext(), dayOfMonth + "/" + (month+1) + "/" + year + " " + "Higher Maths - E 114", Toast.LENGTH_LONG).show();
                }
                else if(year==2018 && month==4 && dayOfMonth ==9) {
                    Calnotify();
                    Toast.makeText(getApplicationContext(), dayOfMonth + "/" + (month+1) + "/" + year + " " + "Higher Maths - E 114", Toast.LENGTH_LONG).show();
                }
                else if(year==2018 && month==5 && dayOfMonth ==19) {
                    Calnotify();
                    Toast.makeText(getApplicationContext(), dayOfMonth + "/" + (month+1) + "/" + year + " " + "Higher Maths - E 114", Toast.LENGTH_LONG).show();
                }
                else if(year==2018 && month==5 && dayOfMonth ==24) {
                    Calnotify();
                    Toast.makeText(getApplicationContext(), dayOfMonth + "/" + (month+1) + "/" + year + " " + "Higher Maths - E 114", Toast.LENGTH_LONG).show();
                }
                else if(year==2018 && month==5 && dayOfMonth ==29) {
                    Calnotify();
                    Toast.makeText(getApplicationContext(), dayOfMonth + "/" + (month+1) + "/" + year + " " + "Higher Maths - E 114", Toast.LENGTH_LONG).show();
                }
                else if(year==2018 && month==4 && dayOfMonth ==1) {
                    Calnotify();
                    Toast.makeText(getApplicationContext(), dayOfMonth + "/" + (month+1) + "/" + year + " " + "Arithmetic - E 314", Toast.LENGTH_LONG).show();
                }
                else if(year==2018 && month==4 && dayOfMonth ==6) {
                    Calnotify();
                    Toast.makeText(getApplicationContext(), dayOfMonth + "/" + (month+1) + "/" + year + " " + "Arithmetic - E 314", Toast.LENGTH_LONG).show();
                }
                else if(year==2018 && month==4 && dayOfMonth ==11) {
                    Calnotify();
                    Toast.makeText(getApplicationContext(), dayOfMonth + "/" + (month+1) + "/" + year + " " + "Arithmetic - E 314", Toast.LENGTH_LONG).show();
                }
                else if(year==2018 && month==5 && dayOfMonth ==21) {
                    Calnotify();
                    Toast.makeText(getApplicationContext(), dayOfMonth + "/" + (month+1) + "/" + year + " " + "Arithmetic - E 314", Toast.LENGTH_LONG).show();
                }
                else if(year==2018 && month==5 && dayOfMonth ==26) {
                    Calnotify();
                    Toast.makeText(getApplicationContext(), dayOfMonth + "/" + (month+1) + "/" + year + " " + "Arithmetic - E 314", Toast.LENGTH_LONG).show();
                }
                else if(year==2018 && month==4 && dayOfMonth ==3) {
                    Calnotify();
                    Toast.makeText(getApplicationContext(), dayOfMonth + "/" + (month+1) + "/" + year + " " + "Reasoning - E 414", Toast.LENGTH_LONG).show();
                }
                else if(year==2018 && month==4 && dayOfMonth ==8) {
                    Calnotify();
                    Toast.makeText(getApplicationContext(), dayOfMonth + "/" + (month+1) + "/" + year + " " + "Reasoning - E 414", Toast.LENGTH_LONG).show();
                }
                else if(year==2018 && month==5 && dayOfMonth ==18) {
                    Calnotify();
                    Toast.makeText(getApplicationContext(), dayOfMonth + "/" + (month+1) + "/" + year + " " + "Reasoning - E 414", Toast.LENGTH_LONG).show();
                }
                else if(year==2018 && month==5 && dayOfMonth ==23) {
                    Calnotify();
                    Toast.makeText(getApplicationContext(), dayOfMonth + "/" + (month+1) + "/" + year + " " + "Reasoning - E 414", Toast.LENGTH_LONG).show();
                }
                else if(year==2018 && month==5 && dayOfMonth ==27) {
                    Calnotify();
                    Toast.makeText(getApplicationContext(), dayOfMonth + "/" + (month+1) + "/" + year + " " + "Reasoning - E 414", Toast.LENGTH_LONG).show();
                }
                else if(year==2018 && month==4 && dayOfMonth ==2) {
                    Calnotify();
                    Toast.makeText(getApplicationContext(), dayOfMonth + "/" + (month+1) + "/" + year + " " + "English 1 - E 514", Toast.LENGTH_LONG).show();
                }
                else if(year==2018 && month==4 && dayOfMonth ==7) {
                    Calnotify();
                    Toast.makeText(getApplicationContext(), dayOfMonth + "/" + (month+1) + "/" + year + " " + "English 1 - E 514", Toast.LENGTH_LONG).show();
                }
                else if(year==2018 && month==4 && dayOfMonth ==12) {
                    Calnotify();
                    Toast.makeText(getApplicationContext(), dayOfMonth + "/" + (month+1) + "/" + year + " " + "English 1 - E 514", Toast.LENGTH_LONG).show();
                }
                else if(year==2018 && month==5 && dayOfMonth ==22) {
                    Calnotify();
                    Toast.makeText(getApplicationContext(), dayOfMonth + "/" + (month+1) + "/" + year + " " + "English 1 - E 514", Toast.LENGTH_LONG).show();
                }
                else if(year==2018 && month==5 && dayOfMonth ==27) {
                    Calnotify();
                    Toast.makeText(getApplicationContext(), dayOfMonth + "/" + (month+1) + "/" + year + " " + "English 1 - E 514", Toast.LENGTH_LONG).show();
                }
                else if(year==2018 && month==4 && dayOfMonth ==5) {
                    Calnotify();
                    Toast.makeText(getApplicationContext(), dayOfMonth + "/" + (month+1) + "/" + year + " " + "English 2 - E 515", Toast.LENGTH_LONG).show();
                }
                else if(year==2018 && month==4 && dayOfMonth ==10) {
                    Calnotify();
                    Toast.makeText(getApplicationContext(), dayOfMonth + "/" + (month+1) + "/" + year + " " + "English 2 - E 515", Toast.LENGTH_LONG).show();
                }
                else if(year==2018 && month==5 && dayOfMonth ==20) {
                    Calnotify();
                    Toast.makeText(getApplicationContext(), dayOfMonth + "/" + (month+1) + "/" + year + " " + "English 2 - E 515", Toast.LENGTH_LONG).show();
                }
                else if(year==2018 && month==5 && dayOfMonth ==25) {
                    Calnotify();
                    Toast.makeText(getApplicationContext(), dayOfMonth + "/" + (month+1) + "/" + year + " " + "English 2 - E 515", Toast.LENGTH_LONG).show();
                }
                else if(year==2018 && month==5 && dayOfMonth ==30) {
                    Calnotify();
                    Toast.makeText(getApplicationContext(), dayOfMonth + "/" + (month+1) + "/" + year + " " + "English 2 - E 515", Toast.LENGTH_LONG).show();
                }
                else if((year==2018 && month==4 && dayOfMonth >=15) || (year==2018 && month==5 && dayOfMonth <=15)){
                    Cal2notify();
                    Toast.makeText(getApplicationContext(), dayOfMonth + "/" + (month+1) + "/" + year + " " + "Internship", Toast.LENGTH_LONG).show();
                }
                else{
                    Cal1notify();
                    Toast.makeText(getApplicationContext(), dayOfMonth + "/" + (month+1) + "/" + year + " " + "NO CLASSES", Toast.LENGTH_LONG).show();
                }
            }

        });
    }

    public void Calnotify(){
        NotificationCompat.Builder  notification = new NotificationCompat.Builder(this,uniqueID);

        //Build the notification
        notification.setSmallIcon(R.drawable.ic_event_available_black_24dp);
        notification.setTicker("This is the ticker");
        notification.setWhen(System.currentTimeMillis());
        notification.setContentTitle("PPT CLASS");
        notification.setContentText( "At 3.00 PM");

        Intent intent = new Intent(this, MainActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
        notification.setContentIntent(pendingIntent);
        notification.setAutoCancel(true);
        //Builds notification and issues it
        NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        nm.notify(0, notification.build());
    }

    public void Cal1notify(){
        NotificationCompat.Builder  notification = new NotificationCompat.Builder(this,uniqueID);
        //Build the notification
        notification.setSmallIcon(R.drawable.ic_event_busy_black_24dp);
        notification.setTicker("This is the ticker");
        notification.setWhen(System.currentTimeMillis());
        notification.setContentTitle("NO PPT CLASS");
        notification.setContentText( "Enjoy");

        Intent intent = new Intent(this, MainActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
        notification.setContentIntent(pendingIntent);
        notification.setAutoCancel(true);
        //Builds notification and issues it
        NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        nm.notify(0, notification.build());
    }

    public void Cal2notify(){
        NotificationCompat.Builder  notification = new NotificationCompat.Builder(this,uniqueID);

        //Build the notification
        notification.setSmallIcon(R.drawable.ic_event_note_black_24dp);
        notification.setTicker("This is the ticker");
        notification.setWhen(System.currentTimeMillis());
        notification.setContentTitle("INTERNSHIP ");
        notification.setContentText( "9:00 AM - 5:00 PM");

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




}
