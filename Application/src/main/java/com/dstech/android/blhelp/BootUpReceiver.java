package com.dstech.android.blhelp;

/**
 * Created by Luca on 30/12/16.
 */

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;



/**
 * Created by Luca on 30/12/16.
 */



public class BootUpReceiver extends BroadcastReceiver{
    String TAG="boooo";

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.BOOT_COMPLETED") && DeviceScanActivity.getDefaults(DeviceScanActivity.DEVICE_ADDRESS,context)!=null) {
            context.startService(new Intent(context, BleBackgroundService.class));
        }


    }
}