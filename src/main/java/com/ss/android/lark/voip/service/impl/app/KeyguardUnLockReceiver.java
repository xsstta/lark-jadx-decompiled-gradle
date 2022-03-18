package com.ss.android.lark.voip.service.impl.app;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.ss.android.lark.permission.C51327f;
import com.ss.android.lark.voip.C57977a;
import com.ss.android.lark.voip.p2911a.AbstractC57987d;
import com.ss.android.lark.voip.service.impl.C58151d;
import com.ss.android.lark.voip.service.impl.util.VoipUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/voip/service/impl/app/KeyguardUnLockReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "voip_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class KeyguardUnLockReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        String str;
        PendingIntent activity;
        Boolean bool = null;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (TextUtils.equals(str, "android.intent.action.USER_PRESENT")) {
            Intent e = VoipUtil.m225810e();
            C58151d.m225578a("ui", "ui", "goto voip call interface", "[KeyguardUnLockReceiver] gotoVoipCallInterface KeyguardUnLockReceiver = " + e);
            if (e != null) {
                AbstractC57987d c = C57977a.m224905c();
                if (c != null) {
                    bool = Boolean.valueOf(c.isAppRealForeground());
                }
                if (Intrinsics.areEqual((Object) bool, (Object) true)) {
                    if (context != null) {
                        context.startActivity(e);
                    }
                } else if (Intrinsics.areEqual((Object) bool, (Object) false)) {
                    if (C51327f.m199081a(context, "android.permission.SYSTEM_ALERT_WINDOW") && (activity = PendingIntent.getActivity(context, 0, e, 134217728)) != null) {
                        try {
                            activity.send();
                        } catch (Exception unused) {
                            if (context != null) {
                                context.startActivity(e);
                            }
                        }
                    }
                } else if (bool == null && context != null) {
                    context.startActivity(e);
                }
            }
        }
    }
}
