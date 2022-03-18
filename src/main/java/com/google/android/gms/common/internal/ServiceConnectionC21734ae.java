package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.internal.AbstractC21748h;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.util.HashSet;
import java.util.Set;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.internal.ae */
public final class ServiceConnectionC21734ae implements ServiceConnection {

    /* renamed from: a */
    private final Set<ServiceConnection> f53033a = new HashSet();

    /* renamed from: b */
    private int f53034b = 2;

    /* renamed from: c */
    private boolean f53035c;

    /* renamed from: d */
    private IBinder f53036d;

    /* renamed from: e */
    private final AbstractC21748h.C21749a f53037e;

    /* renamed from: f */
    private ComponentName f53038f;

    /* renamed from: g */
    private final /* synthetic */ C21733ad f53039g;

    public ServiceConnectionC21734ae(C21733ad adVar, AbstractC21748h.C21749a aVar) {
        this.f53039g = adVar;
        this.f53037e = aVar;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f53039g.f53027a) {
            this.f53039g.f53029c.removeMessages(1, this.f53037e);
            this.f53036d = iBinder;
            this.f53038f = componentName;
            for (ServiceConnection serviceConnection : this.f53033a) {
                serviceConnection.onServiceConnected(componentName, iBinder);
            }
            this.f53034b = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f53039g.f53027a) {
            this.f53039g.f53029c.removeMessages(1, this.f53037e);
            this.f53036d = null;
            this.f53038f = componentName;
            for (ServiceConnection serviceConnection : this.f53033a) {
                serviceConnection.onServiceDisconnected(componentName);
            }
            this.f53034b = 2;
        }
    }

    /* renamed from: a */
    public final void mo73669a(String str) {
        this.f53034b = 3;
        boolean zza = this.f53039g.f53030d.zza(this.f53039g.f53028b, str, this.f53037e.mo73717a(this.f53039g.f53028b), this, this.f53037e.mo73720c());
        this.f53035c = zza;
        if (zza) {
            this.f53039g.f53029c.sendMessageDelayed(this.f53039g.f53029c.obtainMessage(1, this.f53037e), this.f53039g.f53032f);
            return;
        }
        this.f53034b = 2;
        try {
            this.f53039g.f53030d.unbindService(this.f53039g.f53028b, this);
        } catch (IllegalArgumentException unused) {
        }
    }

    /* renamed from: b */
    public final void mo73674b(String str) {
        this.f53039g.f53029c.removeMessages(1, this.f53037e);
        this.f53039g.f53030d.unbindService(this.f53039g.f53028b, this);
        this.f53035c = false;
        this.f53034b = 2;
    }

    /* renamed from: a */
    public final void mo73668a(ServiceConnection serviceConnection, String str) {
        ConnectionTracker unused = this.f53039g.f53030d;
        Context unused2 = this.f53039g.f53028b;
        this.f53037e.mo73717a(this.f53039g.f53028b);
        this.f53033a.add(serviceConnection);
    }

    /* renamed from: b */
    public final void mo73673b(ServiceConnection serviceConnection, String str) {
        ConnectionTracker unused = this.f53039g.f53030d;
        Context unused2 = this.f53039g.f53028b;
        this.f53033a.remove(serviceConnection);
    }

    /* renamed from: a */
    public final boolean mo73670a() {
        return this.f53035c;
    }

    /* renamed from: b */
    public final int mo73672b() {
        return this.f53034b;
    }

    /* renamed from: a */
    public final boolean mo73671a(ServiceConnection serviceConnection) {
        return this.f53033a.contains(serviceConnection);
    }

    /* renamed from: c */
    public final boolean mo73675c() {
        return this.f53033a.isEmpty();
    }

    /* renamed from: d */
    public final IBinder mo73676d() {
        return this.f53036d;
    }

    /* renamed from: e */
    public final ComponentName mo73677e() {
        return this.f53038f;
    }
}
