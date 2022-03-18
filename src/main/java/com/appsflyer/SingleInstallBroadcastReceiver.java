package com.appsflyer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class SingleInstallBroadcastReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        String str;
        if (intent != null) {
            try {
                str = intent.getStringExtra("referrer");
            } catch (Throwable th) {
                AFLogger.afErrorLog("error in BroadcastReceiver ", th);
                str = null;
            }
            if (str != null) {
                if (str.contains("AppsFlyer_Test") && intent.getStringExtra("TestIntegrationMode") != null) {
                    AppsFlyerLibCore.getInstance().mo9985(context, intent);
                    return;
                } else if (AppsFlyerLibCore.getSharedPreferences(context).getString("referrer", null) != null) {
                    AppsFlyerLibCore.getInstance();
                    AppsFlyerLibCore.m8765(context, str);
                    return;
                }
            }
            String string = AppsFlyerProperties.getInstance().getString("referrer_timestamp");
            long currentTimeMillis = System.currentTimeMillis();
            if (string == null || currentTimeMillis - Long.valueOf(string).longValue() >= 2000) {
                AFLogger.afInfoLog("SingleInstallBroadcastReceiver called");
                AppsFlyerLibCore.getInstance().mo9985(context, intent);
                AppsFlyerProperties.getInstance().set("referrer_timestamp", String.valueOf(System.currentTimeMillis()));
            }
        }
    }
}
