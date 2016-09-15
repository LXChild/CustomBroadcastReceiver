package com.example.lxchild.custombroadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by LXChild on 8/13/16.
 */
public class MyReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("LXChild", ">>>>>>>>>>>>>>>>>>>>");

        Log.d("LXChild", intent.getStringExtra("key"));

    }
}
