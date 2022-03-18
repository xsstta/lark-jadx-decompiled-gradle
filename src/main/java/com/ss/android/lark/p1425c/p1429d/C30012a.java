package com.ss.android.lark.p1425c.p1429d;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.collection.ArrayMap;
import com.huawei.hms.common.PackageConstants;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p1425c.C29992a;
import java.util.List;

/* renamed from: com.ss.android.lark.c.d.a */
public class C30012a {

    /* renamed from: a */
    private static ArrayMap<String, String> f74852a;

    /* renamed from: b */
    private static List<String> m110978b() {
        return C29992a.m110932a().mo108074b().mo108077a();
    }

    /* renamed from: c */
    private static String m110979c() {
        String packageName = C30015c.m110992a().getPackageName();
        if (packageName.endsWith(".debug")) {
            return packageName.substring(0, packageName.length() - 6);
        }
        return packageName;
    }

    /* renamed from: a */
    public static Intent m110975a() {
        Intent b;
        Intent a;
        String c = m110979c();
        if (C29992a.m110932a().mo108076d()) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + c));
            intent.setPackage("com.android.vending");
            intent.addFlags(268435456);
            if (m110974a(intent) > 0) {
                return intent;
            }
            return null;
        } else if (C30013b.m110985b() && (a = m110976a(c)) != null) {
            return a;
        } else {
            if (C30013b.m110982a() && (b = m110977b(c)) != null) {
                return b;
            }
            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + c));
            intent2.addFlags(268435456);
            List<ResolveInfo> queryIntentActivities = C30015c.m110992a().getPackageManager().queryIntentActivities(intent2, 65536);
            if (queryIntentActivities == null || queryIntentActivities.size() == 0) {
                Log.m165383e("AppRating", "No app store!");
                return null;
            }
            if (Build.VERSION.SDK_INT >= 24) {
                List<ResolveInfo> queryIntentActivities2 = C30015c.m110992a().getPackageManager().queryIntentActivities(intent2, 1048576);
                if (queryIntentActivities2 != null && queryIntentActivities2.size() > 0) {
                    for (ResolveInfo resolveInfo : queryIntentActivities2) {
                        if (!"com.android.vending".equals(resolveInfo.activityInfo.packageName)) {
                            intent2.setPackage(resolveInfo.activityInfo.packageName);
                            return intent2;
                        }
                    }
                }
            } else {
                for (ResolveInfo resolveInfo2 : queryIntentActivities) {
                    if (!"com.android.vending".equals(resolveInfo2.activityInfo.packageName) && m110980c(resolveInfo2.activityInfo.packageName)) {
                        intent2.setPackage(resolveInfo2.activityInfo.packageName);
                        return intent2;
                    }
                }
            }
            List<String> b2 = m110978b();
            if (b2 != null && !b2.isEmpty()) {
                if (f74852a == null) {
                    ArrayMap<String, String> arrayMap = new ArrayMap<>();
                    f74852a = arrayMap;
                    arrayMap.put("yingyongbao", "com.tencent.android.qqdownloader");
                    f74852a.put("360", "com.qihoo.appstore");
                    f74852a.put("wandoujia", "com.wandoujia.phoenix2");
                    f74852a.put("xiaomi", "com.xiaomi.shop");
                    f74852a.put("oppo", "com.oppo.appStore");
                    f74852a.put("huawei", PackageConstants.SERVICES_PACKAGE_APPMARKET);
                    f74852a.put("meizu", "com.meizu.mstore");
                    f74852a.put("vivo", "com.bbk.appstore");
                    f74852a.put("sanxing", "com.sec.android.app.samsungapps");
                    f74852a.put("baidu", "com.baidu.appsearch");
                    f74852a.put("sougou", "com.sogou.appmall");
                    f74852a.put("yingyonghui", "com.yingyonghui.appStore");
                    f74852a.put("anzhi", "cn.goapk.appStore");
                }
                for (String str : b2) {
                    String str2 = f74852a.get(str);
                    if (str2 != null) {
                        intent2.setPackage(str2);
                        if (m110974a(intent2) > 0) {
                            return intent2;
                        }
                    }
                }
            }
            for (ResolveInfo resolveInfo3 : queryIntentActivities) {
                if (!"com.android.vending".equals(resolveInfo3.activityInfo.packageName)) {
                    intent2.setPackage(resolveInfo3.activityInfo.packageName);
                    return intent2;
                }
            }
            return null;
        }
    }

    /* renamed from: a */
    private static int m110974a(Intent intent) {
        return C30015c.m110992a().getPackageManager().queryIntentActivities(intent, 65536).size();
    }

    /* renamed from: a */
    private static Intent m110976a(String str) {
        Intent intent = new Intent();
        intent.setClassName("com.sec.android.app.samsungapps", "com.sec.android.app.samsungapps.Main");
        intent.setData(Uri.parse("http://www.samsungapps.com/appquery/appDetail.as?appId=" + str));
        intent.addFlags(268435456);
        if (m110974a(intent) > 0) {
            return intent;
        }
        return null;
    }

    /* renamed from: b */
    private static Intent m110977b(String str) {
        Intent intent = new Intent();
        intent.setClassName("com.letv.app.appstore", "com.letv.app.appstore.appmodule.details.DetailsActivity");
        intent.setAction("com.letv.app.appstore.appdetailactivity");
        intent.putExtra("packageName", str);
        intent.addFlags(268435456);
        if (m110974a(intent) > 0) {
            return intent;
        }
        return null;
    }

    /* renamed from: c */
    private static boolean m110980c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            ApplicationInfo applicationInfo = C30015c.m110992a().getPackageManager().getApplicationInfo(str, 0);
            if (applicationInfo == null || (applicationInfo.flags & 1) == 0) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }
}
