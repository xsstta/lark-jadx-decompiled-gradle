package com.huawei.updatesdk.p1046b.p1047a.p1048a;

import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.huawei.updatesdk.p1029a.p1030a.p1035c.AbstractC23838d;
import com.huawei.updatesdk.p1046b.p1050b.C23878a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.huawei.updatesdk.b.a.a.b */
public class C23872b {

    /* renamed from: b */
    private static C23872b f59111b;

    /* renamed from: a */
    private final Map<String, C23871a> f59112a = new HashMap();

    private C23872b() {
    }

    /* renamed from: a */
    public static synchronized C23872b m87293a() {
        C23872b bVar;
        synchronized (C23872b.class) {
            if (f59111b == null) {
                f59111b = new C23872b();
            }
            bVar = f59111b;
        }
        return bVar;
    }

    /* renamed from: a */
    public String mo85651a(PackageInfo packageInfo) {
        if (packageInfo == null || packageInfo.packageName == null || TextUtils.isEmpty(packageInfo.applicationInfo.sourceDir)) {
            return null;
        }
        C23871a aVar = this.f59112a.get(packageInfo.packageName);
        if (aVar != null && aVar.mo85649b() == packageInfo.lastUpdateTime && aVar.mo85650c() == packageInfo.versionCode) {
            return aVar.mo85645a();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(packageInfo.lastUpdateTime);
        sb.append(packageInfo.versionCode);
        sb.append(packageInfo.packageName);
        String str = "packagekey" + packageInfo.packageName;
        String str2 = "fileshakey" + packageInfo.packageName;
        boolean z = !TextUtils.equals(sb.toString(), C23878a.m87310c().mo85669c(str));
        if (z) {
            C23878a.m87310c().mo85665a(str, sb.toString());
        }
        String c = C23878a.m87310c().mo85669c(str2);
        if (TextUtils.isEmpty(c) || z) {
            c = AbstractC23838d.m87127a(packageInfo.applicationInfo.sourceDir, "SHA-256");
            C23878a.m87310c().mo85665a(str2, c);
        }
        C23871a aVar2 = new C23871a();
        aVar2.mo85648a(c);
        aVar2.mo85647a(packageInfo.lastUpdateTime);
        aVar2.mo85646a(packageInfo.versionCode);
        this.f59112a.put(packageInfo.packageName, aVar2);
        return c;
    }
}
