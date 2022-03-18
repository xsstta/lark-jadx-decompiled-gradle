package com.bytedance.lynx.webview.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.lynx.webview.TTWebSdk;
import com.google.firebase.messaging.Constants;

public class MSReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        C20048g.m73161a("Receiver data is " + stringExtra);
        if (TTWebSdk.isTTWebView()) {
            TTWebSdk.onCallMS(stringExtra);
            C20048g.m73161a("on call MS " + stringExtra);
            return;
        }
        C20048g.m73161a("Not load TTWebview");
    }
}
