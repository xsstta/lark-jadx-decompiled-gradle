package com.ss.android.lark.p1425c.p1429d;

import android.content.Context;
import android.content.pm.PackageManager;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.c.d.d */
public class C30016d {
    /* renamed from: a */
    public static int m110993a(Context context) {
        try {
            return (int) ((System.currentTimeMillis() - context.getPackageManager().getPackageInfo(context.getPackageName(), 0).lastUpdateTime) / 3600000);
        } catch (PackageManager.NameNotFoundException e) {
            Log.m165386e("AppRating", e);
            e.printStackTrace();
            return 0;
        }
    }
}
