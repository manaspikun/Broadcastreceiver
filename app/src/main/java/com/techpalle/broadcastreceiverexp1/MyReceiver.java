package com.techpalle.broadcastreceiverexp1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {
    public MyReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "CHARGER UN PLUGGED", Toast.LENGTH_SHORT).show();
        String action=intent.getAction();
        switch (action){
            case Intent.ACTION_SCREEN_OFF:
                Toast.makeText(context, "screenoff", Toast.LENGTH_SHORT).show();
                break;
            case Intent.ACTION_POWER_DISCONNECTED:
                Toast.makeText(context, "poweroff", Toast.LENGTH_SHORT).show();
                break;
            case Intent.ACTION_BATTERY_LOW:
                Toast.makeText(context, "batterlow", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
