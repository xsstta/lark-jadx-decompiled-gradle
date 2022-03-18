package com.tt.miniapp.p3279e;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import com.bytedance.apm.p143i.C2959c;
import com.bytedance.apm.p143i.p144a.C2947a;
import com.bytedance.apm.util.C3112b;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.storage.p640c.C12899a;
import com.tt.miniapphost.C67554l;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67433a;
import com.tt.miniapphost.p3371e.p3372a.C67500a;
import com.tt.miniapphost.p3371e.p3372a.C67501b;

/* renamed from: com.tt.miniapp.e.a */
public class C66004a {
    /* renamed from: a */
    public static boolean m258479a(int i) {
        return i == 0 || i == 3 || i == 6;
    }

    /* renamed from: a */
    public static void m258478a(final Context context, final AbstractC67433a aVar, final String str) {
        C67554l.m262725b().execute(new Runnable() {
            /* class com.tt.miniapp.p3279e.C66004a.RunnableC660051 */

            public void run() {
                try {
                    PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                    SharedPreferences a = C12899a.m53203a(context, "CPULoad");
                    int i = a.getInt("last_open_time" + packageInfo.versionCode, 0);
                    if (i < 10) {
                        SharedPreferences.Editor edit = a.edit();
                        edit.putInt("last_open_time" + packageInfo.versionCode, i + 1).apply();
                        boolean featureGating = HostDependManager.getInst().getFeatureGating("openplatform.gadget.app_cpu_load", false);
                        AppBrandLogger.m52830i("CPULoad", "cpu app Rate fgEnable " + featureGating);
                        if (featureGating && C3112b.m12944a() && C66004a.m258479a(i)) {
                            C2947a a2 = C2959c.m12446a();
                            AppBrandLogger.m52830i("CPULoad", "cpu app Rate is " + a2.f9461a);
                            new C67500a("mp_app_start_cpu_load", C67501b.f170255w, aVar).addCategoryValue("app_id", str).addCategoryValue("open_count", Integer.valueOf(i)).addMetricValue("cpu_load", Double.valueOf(a2.f9461a)).addMetricValue("cpu_speed", Double.valueOf(a2.f9462b)).flush();
                        }
                    }
                } catch (Exception e) {
                    AppBrandLogger.m52829e("CPULoad", e);
                }
            }
        });
    }
}
