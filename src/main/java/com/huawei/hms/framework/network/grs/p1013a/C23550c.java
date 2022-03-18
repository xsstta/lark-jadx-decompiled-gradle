package com.huawei.hms.framework.network.grs.p1013a;

import android.content.Context;
import android.content.pm.PackageManager;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.PLSharedPreferences;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.Map;

/* renamed from: com.huawei.hms.framework.network.grs.a.c */
public class C23550c {

    /* renamed from: a */
    private static final String f58049a = "c";

    /* renamed from: b */
    private PLSharedPreferences f58050b = null;

    public C23550c(Context context) {
        String packageName = context.getPackageName();
        Logger.m85367d(f58049a, "get pkgname from context is{%s}", packageName);
        this.f58050b = new PLSharedPreferences(context, "share_pre_grs_conf_" + packageName);
        m85404a(context);
    }

    /* renamed from: a */
    private void m85404a(Context context) {
        try {
            String l = Long.toString((long) context.getPackageManager().getPackageInfo(context.getPackageName(), 16384).versionCode);
            String a = mo82847a(HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "");
            if (!l.equals(a)) {
                Logger.m85372i(f58049a, "app version changed! old version{%s} and new version{%s}", a, l);
                mo82852c();
                mo82851b(HiAnalyticsConstant.HaKey.BI_KEY_VERSION, l);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Logger.m85375w(f58049a, "get app version failed and catch NameNotFoundException");
        }
    }

    /* renamed from: a */
    public String mo82847a(String str, String str2) {
        return this.f58050b.getString(str, str2);
    }

    /* renamed from: a */
    public Map<String, ?> mo82848a() {
        return this.f58050b.getAll();
    }

    /* renamed from: a */
    public void mo82849a(String str) {
        this.f58050b.remove(str);
    }

    /* renamed from: b */
    public String mo82850b() {
        return mo82847a("cp", "");
    }

    /* renamed from: b */
    public void mo82851b(String str, String str2) {
        this.f58050b.putString(str, str2);
    }

    /* renamed from: c */
    public void mo82852c() {
        this.f58050b.clear();
    }
}
