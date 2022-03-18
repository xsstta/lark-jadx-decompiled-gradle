package com.ss.android.lark.notification.offline;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.notification.C48398a;

/* renamed from: com.ss.android.lark.notification.offline.a */
public class C48544a {
    /* renamed from: a */
    public static boolean m191373a(String str) {
        boolean z;
        if (!C48398a.m190922a().mo169355r() || TextUtils.isEmpty(str) || str.equals(C48398a.m190922a().mo169345h().mo169390a())) {
            z = false;
        } else {
            z = true;
        }
        Log.m165389i("NotificationUtils", "needSwitchTenant = " + z);
        return z;
    }

    /* renamed from: a */
    public static Intent m191372a(Context context, String str, Intent intent) {
        Intent intent2 = new Intent(context, NotificationClickReceiver.class);
        intent2.setAction("com.ss.android.lark.notification.receiver");
        intent2.setPackage(context.getPackageName());
        intent2.putExtra("user_id", str);
        intent2.putExtra("origin_intent", intent);
        return intent2;
    }

    /* renamed from: a */
    public static PendingIntent m191371a(Context context, int i, Intent intent, String str) {
        if (!m191373a(str)) {
            return PendingIntent.getActivity(context, i, intent, 134217728);
        }
        intent.putExtra("need_switch_tenant", true);
        return PendingIntent.getBroadcast(context, i, intent, 134217728);
    }
}
