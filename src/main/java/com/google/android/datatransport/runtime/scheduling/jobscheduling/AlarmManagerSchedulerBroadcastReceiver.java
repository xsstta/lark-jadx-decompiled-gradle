package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.google.android.datatransport.runtime.AbstractC21439l;
import com.google.android.datatransport.runtime.C21445q;
import com.google.android.datatransport.runtime.p973c.C21426a;

public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    /* renamed from: a */
    static /* synthetic */ void m77759a() {
    }

    public void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        C21445q.m77586a(context);
        AbstractC21439l.AbstractC21440a a = AbstractC21439l.m77567d().mo72667a(queryParameter).mo72666a(C21426a.m77513a(intValue));
        if (queryParameter2 != null) {
            a.mo72668a(Base64.decode(queryParameter2, 0));
        }
        C21445q.m77585a().mo72696b().mo72775a(a.mo72669a(), i, RunnableC21502b.m77783a());
    }
}
