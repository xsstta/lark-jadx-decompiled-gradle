package com.bumptech.glide.p082c;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.bumptech.glide.load.AbstractC2265c;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.bumptech.glide.c.b */
public final class C2118b {

    /* renamed from: a */
    private static final ConcurrentMap<String, AbstractC2265c> f7310a = new ConcurrentHashMap();

    /* renamed from: b */
    private static AbstractC2265c m9170b(Context context) {
        return new C2120d(m9169a(m9171c(context)));
    }

    /* renamed from: a */
    public static AbstractC2265c m9168a(Context context) {
        String packageName = context.getPackageName();
        ConcurrentMap<String, AbstractC2265c> concurrentMap = f7310a;
        AbstractC2265c cVar = concurrentMap.get(packageName);
        if (cVar != null) {
            return cVar;
        }
        AbstractC2265c b = m9170b(context);
        AbstractC2265c putIfAbsent = concurrentMap.putIfAbsent(packageName, b);
        return putIfAbsent == null ? b : putIfAbsent;
    }

    /* renamed from: a */
    private static String m9169a(PackageInfo packageInfo) {
        if (packageInfo != null) {
            return String.valueOf(packageInfo.versionCode);
        }
        return UUID.randomUUID().toString();
    }

    /* renamed from: c */
    private static PackageInfo m9171c(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("AppVersionSignature", "Cannot resolve info for" + context.getPackageName(), e);
            return null;
        }
    }
}
