package com.ss.android.lark.invite_new_tenant.p2066d;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* renamed from: com.ss.android.lark.invite_new_tenant.d.a */
public class C40538a {
    /* renamed from: a */
    public static boolean m160455a(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
