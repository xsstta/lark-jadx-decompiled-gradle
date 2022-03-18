package com.google.android.play.core.p993a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.google.android.play.core.internal.C22630b;
import com.google.android.play.core.splitcompat.C22679r;
import com.google.android.play.core.splitinstall.az;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import me.ele.lancet.base.annotations.Skip;

/* renamed from: com.google.android.play.core.a.c */
public abstract class AbstractC22566c<StateT> {

    /* renamed from: a */
    protected final C22630b f55610a;

    /* renamed from: b */
    protected final Set<AbstractC22564a<StateT>> f55611b = new HashSet();

    /* renamed from: c */
    private final IntentFilter f55612c;

    /* renamed from: d */
    private final Context f55613d;

    /* renamed from: e */
    private C22565b f55614e = null;

    /* renamed from: f */
    private volatile boolean f55615f = false;

    protected AbstractC22566c(C22630b bVar, IntentFilter intentFilter, Context context) {
        this.f55610a = bVar;
        this.f55612c = intentFilter;
        this.f55613d = az.m82612a(context);
    }

    /* renamed from: b */
    private final void m81877b() {
        C22565b bVar;
        if ((this.f55615f || !this.f55611b.isEmpty()) && this.f55614e == null) {
            C22565b bVar2 = new C22565b(this);
            this.f55614e = bVar2;
            m81876a(this.f55613d, bVar2, this.f55612c);
        }
        if (!this.f55615f && this.f55611b.isEmpty() && (bVar = this.f55614e) != null) {
            this.f55613d.unregisterReceiver(bVar);
            this.f55614e = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo78655a(Context context, Intent intent);

    /* renamed from: a */
    public final synchronized void mo78656a(AbstractC22564a<StateT> aVar) {
        this.f55610a.mo78874c("registerListener", new Object[0]);
        C22679r.m82539a(aVar, "Registered Play Core listener should not be null.");
        this.f55611b.add(aVar);
        m81877b();
    }

    /* renamed from: a */
    public final synchronized void mo78657a(StateT statet) {
        Iterator it = new HashSet(this.f55611b).iterator();
        while (it.hasNext()) {
            ((AbstractC22564a) it.next()).mo68366a(statet);
        }
    }

    /* renamed from: a */
    public final synchronized void mo78658a(boolean z) {
        this.f55615f = z;
        m81877b();
    }

    /* renamed from: a */
    public final synchronized boolean mo78659a() {
        return this.f55614e != null;
    }

    /* renamed from: b */
    public final synchronized void mo78660b(AbstractC22564a<StateT> aVar) {
        this.f55610a.mo78874c("unregisterListener", new Object[0]);
        C22679r.m82539a(aVar, "Unregistered Play Core listener should not be null.");
        this.f55611b.remove(aVar);
        m81877b();
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    /* renamed from: a */
    public static Intent m81876a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
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
