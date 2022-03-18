package com.bumptech.glide.manager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import com.bumptech.glide.manager.AbstractC2492c;
import com.bumptech.glide.util.C2567j;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import me.ele.lancet.base.annotations.Skip;

/* renamed from: com.bumptech.glide.manager.e */
final class C2495e implements AbstractC2492c {

    /* renamed from: a */
    final AbstractC2492c.AbstractC2493a f8116a;

    /* renamed from: b */
    boolean f8117b;

    /* renamed from: c */
    private final Context f8118c;

    /* renamed from: d */
    private boolean f8119d;

    /* renamed from: e */
    private final BroadcastReceiver f8120e = new BroadcastReceiver() {
        /* class com.bumptech.glide.manager.C2495e.C24961 */

        public void onReceive(Context context, Intent intent) {
            boolean z = C2495e.this.f8117b;
            C2495e eVar = C2495e.this;
            eVar.f8117b = eVar.mo11070a(context);
            if (z != C2495e.this.f8117b) {
                if (Log.isLoggable("ConnectivityMonitor", 3)) {
                    Log.d("ConnectivityMonitor", "connectivity changed, isConnected: " + C2495e.this.f8117b);
                }
                C2495e.this.f8116a.mo10445a(C2495e.this.f8117b);
            }
        }
    };

    @Override // com.bumptech.glide.manager.AbstractC2500i
    /* renamed from: h */
    public void mo10429h() {
    }

    @Override // com.bumptech.glide.manager.AbstractC2500i
    /* renamed from: f */
    public void mo10427f() {
        m10504a();
    }

    @Override // com.bumptech.glide.manager.AbstractC2500i
    /* renamed from: g */
    public void mo10428g() {
        m10505b();
    }

    /* renamed from: b */
    private void m10505b() {
        if (this.f8119d) {
            this.f8118c.unregisterReceiver(this.f8120e);
            this.f8119d = false;
        }
    }

    /* renamed from: a */
    private void m10504a() {
        if (!this.f8119d) {
            this.f8117b = mo11070a(this.f8118c);
            try {
                m10503a(this.f8118c, this.f8120e, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                this.f8119d = true;
            } catch (SecurityException e) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register", e);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo11070a(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) C2567j.m10894a((ConnectivityManager) context.getSystemService("connectivity"))).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return false;
            }
            return true;
        } catch (RuntimeException e) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e);
            }
            return true;
        }
    }

    C2495e(Context context, AbstractC2492c.AbstractC2493a aVar) {
        this.f8118c = context.getApplicationContext();
        this.f8116a = aVar;
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    /* renamed from: a */
    public static Intent m10503a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
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
