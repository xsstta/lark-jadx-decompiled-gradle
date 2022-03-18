package com.bytedance.sysoptimizer;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

public class ReceiverRegisterCrashOptimizer {
    private static Application sApplication;

    public static boolean fixedOpen() {
        if (sApplication != null) {
            return true;
        }
        return false;
    }

    public static void fix(Application application) {
        sApplication = application;
    }

    public static Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        Application application = sApplication;
        if (application == null) {
            return null;
        }
        return application.getBaseContext().registerReceiver(broadcastReceiver, intentFilter);
    }

    public static Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i) {
        Application application = sApplication;
        if (application == null) {
            return null;
        }
        return application.getBaseContext().registerReceiver(broadcastReceiver, intentFilter, i);
    }

    public static Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler) {
        Application application = sApplication;
        if (application == null) {
            return null;
        }
        return application.getBaseContext().registerReceiver(broadcastReceiver, intentFilter, str, handler);
    }

    public static Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
        Application application = sApplication;
        if (application == null) {
            return null;
        }
        return application.getBaseContext().registerReceiver(broadcastReceiver, intentFilter, str, handler, i);
    }
}
