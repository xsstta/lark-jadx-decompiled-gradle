package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.common.wrappers.Wrappers;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;

/* renamed from: com.google.android.gms.common.util.b */
public class C21805b {
    /* renamed from: a */
    public static boolean m79078a() {
        return false;
    }

    /* renamed from: a */
    public static int m79077a(Context context, String str) {
        Bundle bundle;
        PackageInfo c = m79080c(context, str);
        if (c == null || c.applicationInfo == null || (bundle = c.applicationInfo.metaData) == null) {
            return -1;
        }
        return bundle.getInt("com.google.android.gms.version", -1);
    }

    /* renamed from: c */
    private static PackageInfo m79080c(Context context, String str) {
        try {
            return Wrappers.packageManager(context).getPackageInfo(str, SmActions.ACTION_ONTHECALL_EXIT);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static boolean m79079b(Context context, String str) {
        "com.google.android.gms".equals(str);
        try {
            if ((Wrappers.packageManager(context).getApplicationInfo(str, 0).flags & 2097152) != 0) {
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }
}
