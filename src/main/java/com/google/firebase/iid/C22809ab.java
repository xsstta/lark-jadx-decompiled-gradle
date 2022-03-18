package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.firebase.FirebaseApp;
import java.util.List;

/* renamed from: com.google.firebase.iid.ab */
public class C22809ab {

    /* renamed from: a */
    private final Context f56375a;

    /* renamed from: b */
    private String f56376b;

    /* renamed from: c */
    private String f56377c;

    /* renamed from: d */
    private int f56378d;

    /* renamed from: e */
    private int f56379e;

    /* renamed from: a */
    public boolean mo79307a() {
        if (mo79308b() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public synchronized String mo79309c() {
        if (this.f56376b == null) {
            m82862f();
        }
        return this.f56376b;
    }

    /* renamed from: d */
    public synchronized String mo79310d() {
        if (this.f56377c == null) {
            m82862f();
        }
        return this.f56377c;
    }

    /* renamed from: f */
    private synchronized void m82862f() {
        PackageInfo a = m82860a(this.f56375a.getPackageName());
        if (a != null) {
            this.f56376b = Integer.toString(a.versionCode);
            this.f56377c = a.versionName;
        }
    }

    /* renamed from: e */
    public synchronized int mo79311e() {
        PackageInfo a;
        if (this.f56378d == 0 && (a = m82860a("com.google.android.gms")) != null) {
            this.f56378d = a.versionCode;
        }
        return this.f56378d;
    }

    /* renamed from: b */
    public synchronized int mo79308b() {
        int i = this.f56379e;
        if (i != 0) {
            return i;
        }
        PackageManager packageManager = this.f56375a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseInstanceId", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!PlatformVersion.isAtLeastO()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f56379e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
            Log.w("FirebaseInstanceId", "Failed to resolve IID implementation package, falling back");
            if (PlatformVersion.isAtLeastO()) {
                this.f56379e = 2;
            } else {
                this.f56379e = 1;
            }
            return this.f56379e;
        }
        this.f56379e = 2;
        return 2;
    }

    public C22809ab(Context context) {
        this.f56375a = context;
    }

    /* renamed from: a */
    private PackageInfo m82860a(String str) {
        try {
            return this.f56375a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("Failed to find package ");
            sb.append(valueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }

    /* renamed from: a */
    public static String m82861a(FirebaseApp firebaseApp) {
        String c = firebaseApp.getOptions().mo79143c();
        if (c != null) {
            return c;
        }
        String b = firebaseApp.getOptions().mo79142b();
        if (!b.startsWith("1:")) {
            return b;
        }
        String[] split = b.split(":");
        if (split.length < 2) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }
}
