package com.example.alarmmanager;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationCompat;

import static android.content.Context.NOTIFICATION_SERVICE;

public class MyReceiver extends BroadcastReceiver {

    String CHANNE_ID = "ANDRIOD_CHANNEL";
    String CHANNE_NAME = "ANDRIOD_CHANNEL";
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onReceive(Context context, Intent intent) {

        Toast.makeText(context, "ab", Toast.LENGTH_SHORT).show();
        //STEP1 : Create a reference of notification manager throgh notificationMangaer
        NotificationManager nm = (NotificationManager) context.getSystemService(NOTIFICATION_SERVICE); //GLOBAL SERVICE

        //STEP 2.1 : Create an intent to open an applicaton
        Intent intent1  = new Intent(context,MainActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(context,0,intent1,0);
        //step 2.2 : creating action
        NotificationCompat.Action action = new NotificationCompat.Action(R.drawable.notification_icon_foreground,"OPEN",null);
        //STEP2.3 : Build a notifcation using notification builder
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context,CHANNE_ID).
                setContentTitle("Test Notification").
                setContentText("This is notication").setAutoCancel(true).
                setSmallIcon(R.drawable.notification_icon_foreground).setContentIntent(pendingIntent).addAction(action);

        Notification notification = builder.build();



        //STEP3:
        NotificationChannel notificationChannel = new NotificationChannel(CHANNE_ID,CHANNE_NAME,NotificationManager.IMPORTANCE_DEFAULT);
        nm.createNotificationChannel(notificationChannel);
        //STEP4:
        nm.notify(12345,notification);
    }
}
