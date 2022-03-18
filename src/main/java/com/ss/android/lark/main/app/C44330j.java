package com.ss.android.lark.main.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.main.p2231a.AbstractC44136a;

/* renamed from: com.ss.android.lark.main.app.j */
public class C44330j {
    /* renamed from: a */
    public static void m175848a(Activity activity, AbstractC44136a aVar) {
        Bundle extras;
        if (aVar.mo133263s()) {
            Log.m165389i("PushHandler", "handlePushJump");
            Intent intent = activity.getIntent();
            if (intent != null && (extras = intent.getExtras()) != null) {
                boolean z = extras.getBoolean(aVar.mo133262r(), false);
                Log.m165389i("PushHandler", "handlePushJump jumpMail:" + z);
                if (z) {
                    extras.putInt("mail_push_start_type", 1);
                    aVar.mo133223a(activity, intent);
                    return;
                }
                return;
            }
            return;
        }
        Log.m165389i("PushHandler", "isMailPushOptimizeFGOpen false");
    }
}
