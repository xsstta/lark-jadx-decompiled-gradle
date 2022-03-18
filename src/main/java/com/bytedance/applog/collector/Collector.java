package com.bytedance.applog.collector;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.applog.p197a.C3373e;
import com.bytedance.applog.util.C3469r;

public class Collector extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        String[] stringArrayExtra = intent.getStringArrayExtra("K_DATA");
        if (stringArrayExtra == null || stringArrayExtra.length <= 0) {
            C3469r.m14667a((Throwable) null);
        } else {
            C3373e.m14087a(stringArrayExtra);
        }
    }
}
