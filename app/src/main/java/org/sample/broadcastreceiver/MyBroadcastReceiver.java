package org.sample.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if(intent.getAction().equals(Intent.ACTION_POWER_CONNECTED))
            Toast.makeText(context, "Charger Connected!", Toast.LENGTH_SHORT).show();
        if(intent.getAction().equals(Intent.ACTION_POWER_DISCONNECTED))
            Toast.makeText(context, "Charger Disconnected!", Toast.LENGTH_SHORT).show();
    }
}
