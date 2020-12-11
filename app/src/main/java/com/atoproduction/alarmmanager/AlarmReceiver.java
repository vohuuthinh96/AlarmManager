package com.atoproduction.alarmmanager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by : Thinhvh on 12/11/2020
 * Phone      : 0962890153 - 0398477967
 * Facebook   : https://www.facebook.com/thinh.super22
 * Skype      : https://join.skype.com/invite/fvfRTDLcGPJN
 * Mail       : thinhvhph04204@gmail.com
 */
public class AlarmReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        // For our recurring task, we'll just display a message
        Log.d("thinhvh", "onReceive: ");
        Toast.makeText(context, "I'm running", Toast.LENGTH_SHORT).show();
//        Intent intent1 = new Intent(context, MainActivity.class);
//        context.startActivity(intent1);
    }
}