package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import com.google.android.play.core.internal.C22630b;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class bc {

    /* renamed from: a */
    private static final C22630b f56185a = new C22630b("SplitInstallInfoProvider");

    /* renamed from: b */
    private final Context f56186b;

    /* renamed from: c */
    private final String f56187c;

    public bc(Context context, String str) {
        this.f56186b = context;
        this.f56187c = str;
    }

    /* renamed from: a */
    public static boolean m82619a(String str) {
        return str.startsWith("config.");
    }

    /* renamed from: b */
    public static boolean m82620b(String str) {
        return m82619a(str) || str.contains(".config.");
    }

    /* renamed from: d */
    private final Set<String> m82621d() {
        HashSet hashSet = new HashSet();
        Bundle e = m82622e();
        if (e != null) {
            String string = e.getString("com.android.dynamic.apk.fused.modules");
            if (string == null || string.isEmpty()) {
                f56185a.mo78871a("App has no fused modules.", new Object[0]);
            } else {
                Collections.addAll(hashSet, string.split(",", -1));
                hashSet.remove("");
                hashSet.remove("base");
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            String[] strArr = null;
            try {
                PackageInfo packageInfo = this.f56186b.getPackageManager().getPackageInfo(this.f56187c, 0);
                if (packageInfo != null) {
                    strArr = packageInfo.splitNames;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                f56185a.mo78875d("App is not found in PackageManager", new Object[0]);
            }
            if (strArr != null) {
                f56185a.mo78871a("Adding splits from package manager: %s", Arrays.toString(strArr));
                Collections.addAll(hashSet, strArr);
            } else {
                f56185a.mo78871a("No splits are found or app cannot be found in package manager.", new Object[0]);
            }
            ba a = bb.m82617a();
            if (a != null) {
                hashSet.addAll(a.mo78999a());
            }
        }
        return hashSet;
    }

    /* renamed from: e */
    private final Bundle m82622e() {
        try {
            ApplicationInfo applicationInfo = this.f56186b.getPackageManager().getApplicationInfo(this.f56187c, SmActions.ACTION_ONTHECALL_EXIT);
            if (applicationInfo != null && applicationInfo.metaData != null) {
                return applicationInfo.metaData;
            }
            f56185a.mo78871a("App has no applicationInfo or metaData", new Object[0]);
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            f56185a.mo78875d("App is not found in PackageManager", new Object[0]);
            return null;
        }
    }

    /* renamed from: a */
    public final Set<String> mo79050a() {
        HashSet hashSet = new HashSet();
        for (String str : m82621d()) {
            if (!m82620b(str)) {
                hashSet.add(str);
            }
        }
        return hashSet;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Set<String> mo79051b() {
        C22693aa c = mo79052c();
        if (c == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        Set<String> d = m82621d();
        d.add("");
        Set<String> a = mo79050a();
        a.add("");
        for (Map.Entry<String, Set<String>> entry : c.mo79042a(a).entrySet()) {
            if (d.containsAll(entry.getValue())) {
                hashSet.add(entry.getKey());
            }
        }
        return hashSet;
    }

    /* renamed from: c */
    public final C22693aa mo79052c() {
        Bundle e = m82622e();
        if (e == null) {
            f56185a.mo78875d("No metadata found in Context.", new Object[0]);
            return null;
        }
        int i = e.getInt("com.android.vending.splits");
        if (i == 0) {
            f56185a.mo78875d("No metadata found in AndroidManifest.", new Object[0]);
            return null;
        }
        try {
            C22693aa a = new C22724v(this.f56186b.getResources().getXml(i)).mo79065a();
            if (a == null) {
                f56185a.mo78875d("Can't parse languages metadata.", new Object[0]);
            }
            return a;
        } catch (Resources.NotFoundException unused) {
            f56185a.mo78875d("Resource with languages metadata doesn't exist.", new Object[0]);
            return null;
        }
    }
}
