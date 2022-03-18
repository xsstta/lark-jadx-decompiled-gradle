package com.google.firebase.iid;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Parcelable;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;

public class am {

    /* renamed from: a */
    private static am f56404a;

    /* renamed from: b */
    private String f56405b;

    /* renamed from: c */
    private Boolean f56406c;

    /* renamed from: d */
    private Boolean f56407d;

    /* renamed from: e */
    private final Queue<Intent> f56408e = new ArrayDeque();

    private am() {
    }

    /* renamed from: b */
    public Intent mo79325b() {
        return this.f56408e.poll();
    }

    /* renamed from: a */
    public static synchronized am m82890a() {
        am amVar;
        synchronized (am.class) {
            if (f56404a == null) {
                f56404a = new am();
            }
            amVar = f56404a;
        }
        return amVar;
    }

    /* renamed from: a */
    public static Intent m82889a(Intent intent) {
        Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
        if (parcelableExtra instanceof Intent) {
            return (Intent) parcelableExtra;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo79326b(Context context) {
        boolean z;
        if (this.f56407d == null) {
            if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                z = true;
            } else {
                z = false;
            }
            this.f56407d = Boolean.valueOf(z);
        }
        if (!this.f56406c.booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f56407d.booleanValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo79323a(Context context) {
        boolean z;
        if (this.f56406c == null) {
            if (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
                z = true;
            } else {
                z = false;
            }
            this.f56406c = Boolean.valueOf(z);
        }
        if (!this.f56406c.booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f56406c.booleanValue();
    }

    /* renamed from: b */
    public int mo79324b(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Starting service");
        }
        this.f56408e.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        return m82892c(context, intent2);
    }

    /* renamed from: a */
    public static void m82891a(Context context, Intent intent) {
        context.sendBroadcast(m82888a(context, "com.google.firebase.MESSAGING_EVENT", intent));
    }

    /* renamed from: c */
    private int m82892c(Context context, Intent intent) {
        ComponentName componentName;
        String str;
        String d = m82893d(context, intent);
        if (d != null) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(d);
                if (valueOf.length() != 0) {
                    str = "Restricting intent to a specific service: ".concat(valueOf);
                } else {
                    str = new String("Restricting intent to a specific service: ");
                }
                Log.d("FirebaseInstanceId", str);
            }
            intent.setClassName(context.getPackageName(), d);
        }
        try {
            if (mo79323a(context)) {
                componentName = ap.m82922a(context, intent);
            } else {
                componentName = context.startService(intent);
                Log.d("FirebaseInstanceId", "Missing wake lock permission, service start may be delayed");
            }
            if (componentName != null) {
                return -1;
            }
            Log.e("FirebaseInstanceId", "Error while delivering the message: ServiceIntent not found.");
            return 404;
        } catch (SecurityException e) {
            Log.e("FirebaseInstanceId", "Error while delivering the message to the serviceIntent", e);
            return 401;
        } catch (IllegalStateException e2) {
            String valueOf2 = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 45);
            sb.append("Failed to start service while in background: ");
            sb.append(valueOf2);
            Log.e("FirebaseInstanceId", sb.toString());
            return 402;
        }
    }

    /* renamed from: d */
    private synchronized String m82893d(Context context, Intent intent) {
        String str;
        String str2 = this.f56405b;
        if (str2 != null) {
            return str2;
        }
        ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
        if (resolveService == null || resolveService.serviceInfo == null) {
            Log.e("FirebaseInstanceId", "Failed to resolve target intent service, skipping classname enforcement");
            return null;
        }
        ServiceInfo serviceInfo = resolveService.serviceInfo;
        if (!context.getPackageName().equals(serviceInfo.packageName) || serviceInfo.name == null) {
            String str3 = serviceInfo.packageName;
            String str4 = serviceInfo.name;
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 94 + String.valueOf(str4).length());
            sb.append("Error resolving target intent service, skipping classname enforcement. Resolved service was: ");
            sb.append(str3);
            sb.append("/");
            sb.append(str4);
            Log.e("FirebaseInstanceId", sb.toString());
            return null;
        }
        if (serviceInfo.name.startsWith(".")) {
            String valueOf = String.valueOf(context.getPackageName());
            String valueOf2 = String.valueOf(serviceInfo.name);
            if (valueOf2.length() != 0) {
                str = valueOf.concat(valueOf2);
            } else {
                str = new String(valueOf);
            }
            this.f56405b = str;
        } else {
            this.f56405b = serviceInfo.name;
        }
        return this.f56405b;
    }

    /* renamed from: a */
    private static Intent m82888a(Context context, String str, Intent intent) {
        Intent intent2 = new Intent(context, FirebaseInstanceIdReceiver.class);
        intent2.setAction(str);
        intent2.putExtra("wrapped_intent", intent);
        return intent2;
    }
}
