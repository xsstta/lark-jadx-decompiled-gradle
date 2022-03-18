package com.google.android.play.core.missingsplits;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.play.core.internal.C22630b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.missingsplits.c */
public final class C22660c {

    /* renamed from: a */
    private static final C22630b f56068a = new C22630b("MissingSplitsAppComponentsHelper");

    /* renamed from: b */
    private final Context f56069b;

    /* renamed from: c */
    private final PackageManager f56070c;

    C22660c(Context context, PackageManager packageManager) {
        this.f56069b = context;
        this.f56070c = packageManager;
    }

    /* renamed from: a */
    private final void m82480a(List<ComponentInfo> list, int i) {
        for (ComponentInfo componentInfo : list) {
            this.f56070c.setComponentEnabledSetting(new ComponentName(componentInfo.packageName, componentInfo.name), i, 1);
        }
    }

    /* renamed from: d */
    private final List<ComponentInfo> m82481d() {
        try {
            ArrayList arrayList = new ArrayList();
            PackageInfo packageInfo = this.f56070c.getPackageInfo(this.f56069b.getPackageName(), 526);
            if (packageInfo.providers != null) {
                Collections.addAll(arrayList, packageInfo.providers);
            }
            if (packageInfo.receivers != null) {
                Collections.addAll(arrayList, packageInfo.receivers);
            }
            if (packageInfo.services != null) {
                Collections.addAll(arrayList, packageInfo.services);
            }
            return arrayList;
        } catch (PackageManager.NameNotFoundException e) {
            f56068a.mo78875d("Failed to resolve own package : %s", e);
            return Collections.emptyList();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo78970a() {
        for (ComponentInfo componentInfo : m82481d()) {
            if (this.f56070c.getComponentEnabledSetting(new ComponentName(componentInfo.packageName, componentInfo.name)) != 2) {
                f56068a.mo78871a("Not all non-activity components are disabled", new Object[0]);
                return false;
            }
        }
        f56068a.mo78871a("All non-activity components are disabled", new Object[0]);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo78971b() {
        f56068a.mo78874c("Disabling all non-activity components", new Object[0]);
        m82480a(m82481d(), 2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo78972c() {
        f56068a.mo78874c("Resetting enabled state of all non-activity components", new Object[0]);
        m82480a(m82481d(), 0);
    }
}
