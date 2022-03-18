package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC21748h;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.internal.common.HandlerC21912c;
import java.util.HashMap;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.internal.ad */
public final class C21733ad extends AbstractC21748h implements Handler.Callback {

    /* renamed from: a */
    private final HashMap<AbstractC21748h.C21749a, ServiceConnectionC21734ae> f53027a = new HashMap<>();

    /* renamed from: b */
    private final Context f53028b;

    /* renamed from: c */
    private final Handler f53029c;

    /* renamed from: d */
    private final ConnectionTracker f53030d;

    /* renamed from: e */
    private final long f53031e;

    /* renamed from: f */
    private final long f53032f;

    C21733ad(Context context) {
        this.f53028b = context.getApplicationContext();
        this.f53029c = new HandlerC21912c(context.getMainLooper(), this);
        this.f53030d = ConnectionTracker.getInstance();
        this.f53031e = 5000;
        this.f53032f = 300000;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC21748h
    /* renamed from: a */
    public final boolean mo73665a(AbstractC21748h.C21749a aVar, ServiceConnection serviceConnection, String str) {
        boolean a;
        Preconditions.checkNotNull(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f53027a) {
            ServiceConnectionC21734ae aeVar = this.f53027a.get(aVar);
            if (aeVar == null) {
                aeVar = new ServiceConnectionC21734ae(this, aVar);
                aeVar.mo73668a(serviceConnection, str);
                aeVar.mo73669a(str);
                this.f53027a.put(aVar, aeVar);
            } else {
                this.f53029c.removeMessages(0, aVar);
                if (!aeVar.mo73671a(serviceConnection)) {
                    aeVar.mo73668a(serviceConnection, str);
                    int b = aeVar.mo73672b();
                    if (b == 1) {
                        serviceConnection.onServiceConnected(aeVar.mo73677e(), aeVar.mo73676d());
                    } else if (b == 2) {
                        aeVar.mo73669a(str);
                    }
                } else {
                    String valueOf = String.valueOf(aVar);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                }
            }
            a = aeVar.mo73670a();
        }
        return a;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC21748h
    /* renamed from: b */
    public final void mo73666b(AbstractC21748h.C21749a aVar, ServiceConnection serviceConnection, String str) {
        Preconditions.checkNotNull(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f53027a) {
            ServiceConnectionC21734ae aeVar = this.f53027a.get(aVar);
            if (aeVar == null) {
                String valueOf = String.valueOf(aVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(valueOf);
                throw new IllegalStateException(sb.toString());
            } else if (aeVar.mo73671a(serviceConnection)) {
                aeVar.mo73673b(serviceConnection, str);
                if (aeVar.mo73675c()) {
                    this.f53029c.sendMessageDelayed(this.f53029c.obtainMessage(0, aVar), this.f53031e);
                }
            } else {
                String valueOf2 = String.valueOf(aVar);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 76);
                sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb2.append(valueOf2);
                throw new IllegalStateException(sb2.toString());
            }
        }
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            synchronized (this.f53027a) {
                AbstractC21748h.C21749a aVar = (AbstractC21748h.C21749a) message.obj;
                ServiceConnectionC21734ae aeVar = this.f53027a.get(aVar);
                if (aeVar != null && aeVar.mo73675c()) {
                    if (aeVar.mo73670a()) {
                        aeVar.mo73674b("GmsClientSupervisor");
                    }
                    this.f53027a.remove(aVar);
                }
            }
            return true;
        } else if (i != 1) {
            return false;
        } else {
            synchronized (this.f53027a) {
                AbstractC21748h.C21749a aVar2 = (AbstractC21748h.C21749a) message.obj;
                ServiceConnectionC21734ae aeVar2 = this.f53027a.get(aVar2);
                if (aeVar2 != null && aeVar2.mo73672b() == 3) {
                    String valueOf = String.valueOf(aVar2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(valueOf);
                    Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                    ComponentName e = aeVar2.mo73677e();
                    if (e == null) {
                        e = aVar2.mo73719b();
                    }
                    if (e == null) {
                        e = new ComponentName(aVar2.mo73718a(), "unknown");
                    }
                    aeVar2.onServiceDisconnected(e);
                }
            }
            return true;
        }
    }
}
