package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.wrappers.Wrappers;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;

/* renamed from: com.google.android.gms.common.internal.ah */
public final class C21737ah {

    /* renamed from: a */
    private static Object f53046a = new Object();

    /* renamed from: b */
    private static boolean f53047b;

    /* renamed from: c */
    private static String f53048c;

    /* renamed from: d */
    private static int f53049d;

    /* renamed from: a */
    public static String m78941a(Context context) {
        m78943c(context);
        return f53048c;
    }

    /* renamed from: b */
    public static int m78942b(Context context) {
        m78943c(context);
        return f53049d;
    }

    /* renamed from: c */
    private static void m78943c(Context context) {
        synchronized (f53046a) {
            if (!f53047b) {
                f53047b = true;
                try {
                    Bundle bundle = Wrappers.packageManager(context).getApplicationInfo(context.getPackageName(), SmActions.ACTION_ONTHECALL_EXIT).metaData;
                    if (bundle != null) {
                        f53048c = bundle.getString("com.google.app.id");
                        f53049d = bundle.getInt("com.google.android.gms.version");
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e);
                }
            }
        }
    }
}
