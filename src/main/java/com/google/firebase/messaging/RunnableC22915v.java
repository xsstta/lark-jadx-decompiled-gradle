package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.google.firebase.iid.C22809ab;
import java.io.IOException;
import me.ele.lancet.base.annotations.Skip;

/* access modifiers changed from: package-private */
/* renamed from: com.google.firebase.messaging.v */
public class RunnableC22915v implements Runnable {

    /* renamed from: f */
    private static final Object f56645f = new Object();

    /* renamed from: g */
    private static Boolean f56646g;

    /* renamed from: h */
    private static Boolean f56647h;

    /* renamed from: a */
    public final Context f56648a;

    /* renamed from: b */
    public final C22913t f56649b;

    /* renamed from: c */
    private final C22809ab f56650c;

    /* renamed from: d */
    private final PowerManager.WakeLock f56651d;

    /* renamed from: e */
    private final long f56652e;

    /* renamed from: b */
    public static boolean m83281b() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        }
        if (Build.VERSION.SDK_INT != 23 || !Log.isLoggable("FirebaseMessaging", 3)) {
            return false;
        }
        return true;
    }

    /* renamed from: com.google.firebase.messaging.v$a */
    class C22916a extends BroadcastReceiver {

        /* renamed from: b */
        private RunnableC22915v f56654b;

        /* renamed from: a */
        public void mo79550a() {
            if (RunnableC22915v.m83281b()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            m83284a(RunnableC22915v.this.f56648a, this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        public C22916a(RunnableC22915v vVar) {
            this.f56654b = vVar;
        }

        public synchronized void onReceive(Context context, Intent intent) {
            RunnableC22915v vVar = this.f56654b;
            if (vVar != null) {
                if (vVar.mo79548a()) {
                    if (RunnableC22915v.m83281b()) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    this.f56654b.f56649b.mo79540a(this.f56654b, 0);
                    context.unregisterReceiver(this);
                    this.f56654b = null;
                }
            }
        }

        @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
        /* renamed from: a */
        public static Intent m83284a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
            try {
                return context.registerReceiver(broadcastReceiver, intentFilter);
            } catch (Exception e) {
                if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                    return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
                }
                throw e;
            }
        }
    }

    public void run() {
        String str;
        if (m83279a(this.f56648a)) {
            this.f56651d.acquire(Constants.f56559a);
        }
        try {
            this.f56649b.mo79541a(true);
            if (!this.f56650c.mo79307a()) {
                this.f56649b.mo79541a(false);
                if (m83279a(this.f56648a)) {
                    try {
                        this.f56651d.release();
                    } catch (RuntimeException unused) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            } else if (!m83282b(this.f56648a) || mo79548a()) {
                if (this.f56649b.mo79545c()) {
                    this.f56649b.mo79541a(false);
                } else {
                    this.f56649b.mo79539a(this.f56652e);
                }
                if (m83279a(this.f56648a)) {
                    try {
                        this.f56651d.release();
                    } catch (RuntimeException unused2) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            } else {
                new C22916a(this).mo79550a();
                if (m83279a(this.f56648a)) {
                    try {
                        this.f56651d.release();
                    } catch (RuntimeException unused3) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            }
        } catch (IOException e) {
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() != 0) {
                str = "Failed to sync topics. Won't retry sync. ".concat(valueOf);
            } else {
                str = new String("Failed to sync topics. Won't retry sync. ");
            }
            Log.e("FirebaseMessaging", str);
            this.f56649b.mo79541a(false);
            if (m83279a(this.f56648a)) {
                try {
                    this.f56651d.release();
                } catch (RuntimeException unused4) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            }
        } catch (Throwable th) {
            if (m83279a(this.f56648a)) {
                try {
                    this.f56651d.release();
                } catch (RuntimeException unused5) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            }
            throw th;
        }
    }

    /* renamed from: a */
    public synchronized boolean mo79548a() {
        NetworkInfo networkInfo;
        boolean z;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f56648a.getSystemService("connectivity");
        if (connectivityManager != null) {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } else {
            networkInfo = null;
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            z = false;
        } else {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    private static String m83278a(String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 142);
        sb.append("Missing Permission: ");
        sb.append(str);
        sb.append(". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        return sb.toString();
    }

    /* renamed from: b */
    private static boolean m83282b(Context context) {
        boolean z;
        boolean booleanValue;
        synchronized (f56645f) {
            Boolean bool = f56647h;
            if (bool == null) {
                z = m83280a(context, "android.permission.ACCESS_NETWORK_STATE", bool);
            } else {
                z = bool.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(z);
            f56647h = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    /* renamed from: a */
    private static boolean m83279a(Context context) {
        boolean z;
        boolean booleanValue;
        synchronized (f56645f) {
            Boolean bool = f56646g;
            if (bool == null) {
                z = m83280a(context, "android.permission.WAKE_LOCK", bool);
            } else {
                z = bool.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(z);
            f56646g = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    /* renamed from: a */
    private static boolean m83280a(Context context, String str, Boolean bool) {
        boolean z;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context.checkCallingOrSelfPermission(str) == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", m83278a(str));
        }
        return z;
    }

    RunnableC22915v(C22913t tVar, Context context, C22809ab abVar, long j) {
        this.f56649b = tVar;
        this.f56648a = context;
        this.f56652e = j;
        this.f56650c = abVar;
        this.f56651d = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }
}
