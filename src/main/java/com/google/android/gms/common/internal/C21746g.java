package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AbstractC21631d;
import com.google.android.gms.internal.base.HandlerC21909h;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.common.internal.g */
public final class C21746g implements Handler.Callback {

    /* renamed from: a */
    private final AbstractC21747a f53075a;

    /* renamed from: b */
    private final ArrayList<AbstractC21631d.AbstractC21633b> f53076b = new ArrayList<>();

    /* renamed from: c */
    private final ArrayList<AbstractC21631d.AbstractC21633b> f53077c = new ArrayList<>();

    /* renamed from: d */
    private final ArrayList<AbstractC21631d.AbstractC21634c> f53078d = new ArrayList<>();

    /* renamed from: e */
    private volatile boolean f53079e = false;

    /* renamed from: f */
    private final AtomicInteger f53080f = new AtomicInteger(0);

    /* renamed from: g */
    private boolean f53081g = false;

    /* renamed from: h */
    private final Handler f53082h;

    /* renamed from: i */
    private final Object f53083i = new Object();

    /* renamed from: com.google.android.gms.common.internal.g$a */
    public interface AbstractC21747a {
        Bundle getConnectionHint();

        boolean isConnected();
    }

    public C21746g(Looper looper, AbstractC21747a aVar) {
        this.f53075a = aVar;
        this.f53082h = new HandlerC21909h(looper, this);
    }

    /* renamed from: a */
    public final void mo73707a() {
        this.f53079e = false;
        this.f53080f.incrementAndGet();
    }

    /* renamed from: b */
    public final void mo73713b() {
        this.f53079e = true;
    }

    /* renamed from: a */
    public final void mo73709a(Bundle bundle) {
        Preconditions.checkHandlerThread(this.f53082h, "onConnectionSuccess must only be called on the Handler thread");
        synchronized (this.f53083i) {
            boolean z = true;
            Preconditions.checkState(!this.f53081g);
            this.f53082h.removeMessages(1);
            this.f53081g = true;
            if (this.f53077c.size() != 0) {
                z = false;
            }
            Preconditions.checkState(z);
            ArrayList arrayList = new ArrayList(this.f53076b);
            int i = this.f53080f.get();
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList2.get(i2);
                i2++;
                AbstractC21631d.AbstractC21633b bVar = (AbstractC21631d.AbstractC21633b) obj;
                if (!this.f53079e || !this.f53075a.isConnected() || this.f53080f.get() != i) {
                    break;
                } else if (!this.f53077c.contains(bVar)) {
                    bVar.onConnected(bundle);
                }
            }
            this.f53077c.clear();
            this.f53081g = false;
        }
    }

    /* renamed from: a */
    public final void mo73708a(int i) {
        Preconditions.checkHandlerThread(this.f53082h, "onUnintentionalDisconnection must only be called on the Handler thread");
        this.f53082h.removeMessages(1);
        synchronized (this.f53083i) {
            this.f53081g = true;
            ArrayList arrayList = new ArrayList(this.f53076b);
            int i2 = this.f53080f.get();
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                AbstractC21631d.AbstractC21633b bVar = (AbstractC21631d.AbstractC21633b) obj;
                if (!this.f53079e || this.f53080f.get() != i2) {
                    break;
                } else if (this.f53076b.contains(bVar)) {
                    bVar.onConnectionSuspended(i);
                }
            }
            this.f53077c.clear();
            this.f53081g = false;
        }
    }

    /* renamed from: a */
    public final void mo73710a(ConnectionResult connectionResult) {
        Preconditions.checkHandlerThread(this.f53082h, "onConnectionFailure must only be called on the Handler thread");
        this.f53082h.removeMessages(1);
        synchronized (this.f53083i) {
            ArrayList arrayList = new ArrayList(this.f53078d);
            int i = this.f53080f.get();
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList2.get(i2);
                i2++;
                AbstractC21631d.AbstractC21634c cVar = (AbstractC21631d.AbstractC21634c) obj;
                if (this.f53079e) {
                    if (this.f53080f.get() == i) {
                        if (this.f53078d.contains(cVar)) {
                            cVar.onConnectionFailed(connectionResult);
                        }
                    }
                }
                return;
            }
        }
    }

    /* renamed from: a */
    public final void mo73711a(AbstractC21631d.AbstractC21633b bVar) {
        Preconditions.checkNotNull(bVar);
        synchronized (this.f53083i) {
            if (this.f53076b.contains(bVar)) {
                String valueOf = String.valueOf(bVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 62);
                sb.append("registerConnectionCallbacks(): listener ");
                sb.append(valueOf);
                sb.append(" is already registered");
                Log.w("GmsClientEvents", sb.toString());
            } else {
                this.f53076b.add(bVar);
            }
        }
        if (this.f53075a.isConnected()) {
            Handler handler = this.f53082h;
            handler.sendMessage(handler.obtainMessage(1, bVar));
        }
    }

    /* renamed from: a */
    public final void mo73712a(AbstractC21631d.AbstractC21634c cVar) {
        Preconditions.checkNotNull(cVar);
        synchronized (this.f53083i) {
            if (this.f53078d.contains(cVar)) {
                String valueOf = String.valueOf(cVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 67);
                sb.append("registerConnectionFailedListener(): listener ");
                sb.append(valueOf);
                sb.append(" is already registered");
                Log.w("GmsClientEvents", sb.toString());
            } else {
                this.f53078d.add(cVar);
            }
        }
    }

    /* renamed from: b */
    public final void mo73714b(AbstractC21631d.AbstractC21634c cVar) {
        Preconditions.checkNotNull(cVar);
        synchronized (this.f53083i) {
            if (!this.f53078d.remove(cVar)) {
                String valueOf = String.valueOf(cVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57);
                sb.append("unregisterConnectionFailedListener(): listener ");
                sb.append(valueOf);
                sb.append(" not found");
                Log.w("GmsClientEvents", sb.toString());
            }
        }
    }

    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            AbstractC21631d.AbstractC21633b bVar = (AbstractC21631d.AbstractC21633b) message.obj;
            synchronized (this.f53083i) {
                if (this.f53079e && this.f53075a.isConnected() && this.f53076b.contains(bVar)) {
                    bVar.onConnected(this.f53075a.getConnectionHint());
                }
            }
            return true;
        }
        int i = message.what;
        StringBuilder sb = new StringBuilder(45);
        sb.append("Don't know how to handle message: ");
        sb.append(i);
        Log.wtf("GmsClientEvents", sb.toString(), new Exception());
        return false;
    }
}
