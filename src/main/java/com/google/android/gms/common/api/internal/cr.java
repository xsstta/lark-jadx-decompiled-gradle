package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.AbstractC21641i;
import com.google.android.gms.common.api.C21611a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C21655b;
import com.google.android.gms.common.internal.C21740c;
import com.google.android.gms.common.util.concurrent.ExecutorC21807a;
import com.google.android.gms.signin.AbstractC22071e;
import com.google.android.gms.signin.C22066a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public final class cr implements bf {

    /* renamed from: a */
    private final Map<C21611a.C21614c<?>, cq<?>> f52827a = new HashMap();

    /* renamed from: b */
    private final Map<C21611a.C21614c<?>, cq<?>> f52828b = new HashMap();

    /* renamed from: c */
    private final Map<C21611a<?>, Boolean> f52829c;

    /* renamed from: d */
    private final C21661c f52830d;

    /* renamed from: e */
    private final aj f52831e;

    /* renamed from: f */
    private final Lock f52832f;

    /* renamed from: g */
    private final Looper f52833g;

    /* renamed from: h */
    private final GoogleApiAvailabilityLight f52834h;

    /* renamed from: i */
    private final Condition f52835i;

    /* renamed from: j */
    private final C21740c f52836j;

    /* renamed from: k */
    private final boolean f52837k;

    /* renamed from: l */
    private final boolean f52838l;

    /* renamed from: m */
    private final Queue<C21655b.AbstractC21656a<?, ?>> f52839m = new LinkedList();

    /* renamed from: n */
    private boolean f52840n;

    /* renamed from: o */
    private Map<cc<?>, ConnectionResult> f52841o;

    /* renamed from: p */
    private Map<cc<?>, ConnectionResult> f52842p;

    /* renamed from: q */
    private C21680o f52843q;

    /* renamed from: r */
    private ConnectionResult f52844r;

    public cr(Context context, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map<C21611a.C21614c<?>, C21611a.AbstractC21622f> map, C21740c cVar, Map<C21611a<?>, Boolean> map2, C21611a.AbstractC21612a<? extends AbstractC22071e, C22066a> aVar, ArrayList<ck> arrayList, aj ajVar, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        this.f52832f = lock;
        this.f52833g = looper;
        this.f52835i = lock.newCondition();
        this.f52834h = googleApiAvailabilityLight;
        this.f52831e = ajVar;
        this.f52829c = map2;
        this.f52836j = cVar;
        this.f52837k = z;
        HashMap hashMap = new HashMap();
        for (C21611a<?> aVar2 : map2.keySet()) {
            hashMap.put(aVar2.mo73222c(), aVar2);
        }
        HashMap hashMap2 = new HashMap();
        ArrayList<ck> arrayList2 = arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            ck ckVar = arrayList2.get(i);
            i++;
            ck ckVar2 = ckVar;
            hashMap2.put(ckVar2.f52803a, ckVar2);
        }
        boolean z5 = false;
        boolean z6 = true;
        boolean z7 = false;
        for (Map.Entry<C21611a.C21614c<?>, C21611a.AbstractC21622f> entry : map.entrySet()) {
            C21611a aVar3 = (C21611a) hashMap.get(entry.getKey());
            C21611a.AbstractC21622f value = entry.getValue();
            if (value.requiresGooglePlayServices()) {
                z3 = z6;
                if (!this.f52829c.get(aVar3).booleanValue()) {
                    z4 = true;
                    z2 = true;
                } else {
                    z2 = z7;
                    z4 = true;
                }
            } else {
                z4 = z5;
                z2 = z7;
                z3 = false;
            }
            cq<?> cqVar = new cq<>(context, aVar3, looper, value, (ck) hashMap2.get(aVar3), cVar, aVar);
            this.f52827a.put(entry.getKey(), cqVar);
            if (value.requiresSignIn()) {
                this.f52828b.put(entry.getKey(), cqVar);
            }
            z5 = z4;
            z6 = z3;
            z7 = z2;
        }
        this.f52838l = z5 && !z6 && !z7;
        this.f52830d = C21661c.m78522a();
    }

    @Override // com.google.android.gms.common.api.internal.bf
    /* renamed from: a */
    public final void mo73368a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    @Override // com.google.android.gms.common.api.internal.bf
    /* renamed from: i */
    public final void mo73378i() {
    }

    @Override // com.google.android.gms.common.api.internal.bf
    /* renamed from: a */
    public final <A extends C21611a.AbstractC21613b, R extends AbstractC21641i, T extends C21655b.AbstractC21656a<R, A>> T mo73362a(T t) {
        if (this.f52837k && m78692c(t)) {
            return t;
        }
        if (!mo73375f()) {
            this.f52839m.add(t);
            return t;
        }
        this.f52831e.f52639e.mo73406a(t);
        return (T) this.f52827a.get(t.mo73388d()).mo73244a(t);
    }

    @Override // com.google.android.gms.common.api.internal.bf
    /* renamed from: b */
    public final <A extends C21611a.AbstractC21613b, T extends C21655b.AbstractC21656a<? extends AbstractC21641i, A>> T mo73371b(T t) {
        C21611a.C21614c<A> d = t.mo73388d();
        if (this.f52837k && m78692c(t)) {
            return t;
        }
        this.f52831e.f52639e.mo73406a(t);
        return (T) this.f52827a.get(d).mo73249b(t);
    }

    /* renamed from: c */
    private final <T extends C21655b.AbstractC21656a<? extends AbstractC21641i, ? extends C21611a.AbstractC21613b>> boolean m78692c(T t) {
        C21611a.C21614c<?> d = t.mo73388d();
        ConnectionResult a = m78682a(d);
        if (a == null || a.getErrorCode() != 4) {
            return false;
        }
        t.mo73386b(new Status(4, null, this.f52830d.mo73411a(this.f52827a.get(d).mo73252e(), System.identityHashCode(this.f52831e))));
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.bf
    /* renamed from: a */
    public final void mo73363a() {
        this.f52832f.lock();
        try {
            if (!this.f52840n) {
                this.f52840n = true;
                this.f52841o = null;
                this.f52842p = null;
                this.f52843q = null;
                this.f52844r = null;
                this.f52830d.mo73423d();
                this.f52830d.mo73414a(this.f52827a.values()).addOnCompleteListener(new ExecutorC21807a(this.f52833g), new ct(this));
                this.f52832f.unlock();
            }
        } finally {
            this.f52832f.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.bf
    /* renamed from: b */
    public final ConnectionResult mo73370b() {
        mo73363a();
        while (mo73468d()) {
            try {
                this.f52835i.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, null);
            }
        }
        if (mo73375f()) {
            return ConnectionResult.RESULT_SUCCESS;
        }
        ConnectionResult connectionResult = this.f52844r;
        if (connectionResult != null) {
            return connectionResult;
        }
        return new ConnectionResult(13, null);
    }

    @Override // com.google.android.gms.common.api.internal.bf
    /* renamed from: c */
    public final void mo73372c() {
        this.f52832f.lock();
        try {
            this.f52840n = false;
            this.f52841o = null;
            this.f52842p = null;
            C21680o oVar = this.f52843q;
            if (oVar != null) {
                oVar.mo73498a();
                this.f52843q = null;
            }
            this.f52844r = null;
            while (!this.f52839m.isEmpty()) {
                C21655b.AbstractC21656a<?, ?> remove = this.f52839m.remove();
                remove.mo73313a((bw) null);
                remove.mo73290a();
            }
            this.f52835i.signalAll();
        } finally {
            this.f52832f.unlock();
        }
    }

    /* renamed from: a */
    public final ConnectionResult mo73467a(C21611a<?> aVar) {
        return m78682a(aVar.mo73222c());
    }

    /* renamed from: a */
    private final ConnectionResult m78682a(C21611a.C21614c<?> cVar) {
        this.f52832f.lock();
        try {
            cq<?> cqVar = this.f52827a.get(cVar);
            Map<cc<?>, ConnectionResult> map = this.f52841o;
            if (map != null && cqVar != null) {
                return map.get(cqVar.mo73252e());
            }
            this.f52832f.unlock();
            return null;
        } finally {
            this.f52832f.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.bf
    /* renamed from: f */
    public final boolean mo73375f() {
        this.f52832f.lock();
        try {
            return this.f52841o != null && this.f52844r == null;
        } finally {
            this.f52832f.unlock();
        }
    }

    /* renamed from: d */
    public final boolean mo73468d() {
        this.f52832f.lock();
        try {
            return this.f52841o == null && this.f52840n;
        } finally {
            this.f52832f.unlock();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001f A[Catch:{ all -> 0x0044 }] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m78694e() {
        /*
            r3 = this;
            java.util.concurrent.locks.Lock r0 = r3.f52832f
            r0.lock()
            boolean r0 = r3.f52840n     // Catch:{ all -> 0x0044 }
            r1 = 0
            if (r0 == 0) goto L_0x003e
            boolean r0 = r3.f52837k     // Catch:{ all -> 0x0044 }
            if (r0 != 0) goto L_0x000f
            goto L_0x003e
        L_0x000f:
            java.util.Map<com.google.android.gms.common.api.a$c<?>, com.google.android.gms.common.api.internal.cq<?>> r0 = r3.f52828b     // Catch:{ all -> 0x0044 }
            java.util.Set r0 = r0.keySet()     // Catch:{ all -> 0x0044 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0044 }
        L_0x0019:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x0044 }
            if (r2 == 0) goto L_0x0037
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x0044 }
            com.google.android.gms.common.api.a$c r2 = (com.google.android.gms.common.api.C21611a.C21614c) r2     // Catch:{ all -> 0x0044 }
            com.google.android.gms.common.ConnectionResult r2 = r3.m78682a(r2)     // Catch:{ all -> 0x0044 }
            if (r2 == 0) goto L_0x0031
            boolean r2 = r2.isSuccess()     // Catch:{ all -> 0x0044 }
            if (r2 != 0) goto L_0x0019
        L_0x0031:
            java.util.concurrent.locks.Lock r0 = r3.f52832f
            r0.unlock()
            return r1
        L_0x0037:
            java.util.concurrent.locks.Lock r0 = r3.f52832f
            r0.unlock()
            r0 = 1
            return r0
        L_0x003e:
            java.util.concurrent.locks.Lock r0 = r3.f52832f
            r0.unlock()
            return r1
        L_0x0044:
            r0 = move-exception
            java.util.concurrent.locks.Lock r1 = r3.f52832f
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.cr.m78694e():boolean");
    }

    /* JADX INFO: finally extract failed */
    @Override // com.google.android.gms.common.api.internal.bf
    /* renamed from: a */
    public final boolean mo73369a(AbstractC21674i iVar) {
        this.f52832f.lock();
        try {
            if (!this.f52840n || m78694e()) {
                this.f52832f.unlock();
                return false;
            }
            this.f52830d.mo73423d();
            this.f52843q = new C21680o(this, iVar);
            this.f52830d.mo73414a(this.f52828b.values()).addOnCompleteListener(new ExecutorC21807a(this.f52833g), this.f52843q);
            this.f52832f.unlock();
            return true;
        } catch (Throwable th) {
            this.f52832f.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.internal.bf
    /* renamed from: h */
    public final void mo73377h() {
        this.f52832f.lock();
        try {
            this.f52830d.mo73424e();
            C21680o oVar = this.f52843q;
            if (oVar != null) {
                oVar.mo73498a();
                this.f52843q = null;
            }
            if (this.f52842p == null) {
                this.f52842p = new ArrayMap(this.f52828b.size());
            }
            ConnectionResult connectionResult = new ConnectionResult(4);
            for (cq<?> cqVar : this.f52828b.values()) {
                this.f52842p.put(cqVar.mo73252e(), connectionResult);
            }
            Map<cc<?>, ConnectionResult> map = this.f52841o;
            if (map != null) {
                map.putAll(this.f52842p);
            }
        } finally {
            this.f52832f.unlock();
        }
    }

    /* renamed from: g */
    private final void m78698g() {
        if (this.f52836j == null) {
            this.f52831e.f52637c = Collections.emptySet();
            return;
        }
        HashSet hashSet = new HashSet(this.f52836j.mo73690d());
        Map<C21611a<?>, C21740c.C21742b> f = this.f52836j.mo73692f();
        for (C21611a<?> aVar : f.keySet()) {
            ConnectionResult a = mo73467a(aVar);
            if (a != null && a.isSuccess()) {
                hashSet.addAll(f.get(aVar).f53070a);
            }
        }
        this.f52831e.f52637c = hashSet;
    }

    /* renamed from: j */
    private final void m78701j() {
        while (!this.f52839m.isEmpty()) {
            mo73371b(this.f52839m.remove());
        }
        this.f52831e.mo73348a((Bundle) null);
    }

    /* renamed from: a */
    private final boolean m78686a(cq<?> cqVar, ConnectionResult connectionResult) {
        return !connectionResult.isSuccess() && !connectionResult.hasResolution() && this.f52829c.get(cqVar.mo73250c()).booleanValue() && cqVar.mo73466a().requiresGooglePlayServices() && this.f52834h.isUserResolvableError(connectionResult.getErrorCode());
    }

    /* renamed from: k */
    private final ConnectionResult m78703k() {
        int i = 0;
        ConnectionResult connectionResult = null;
        ConnectionResult connectionResult2 = null;
        int i2 = 0;
        for (cq<?> cqVar : this.f52827a.values()) {
            C21611a<?> c = cqVar.mo73250c();
            ConnectionResult connectionResult3 = this.f52841o.get(cqVar.mo73252e());
            if (!connectionResult3.isSuccess() && (!this.f52829c.get(c).booleanValue() || connectionResult3.hasResolution() || this.f52834h.isUserResolvableError(connectionResult3.getErrorCode()))) {
                if (connectionResult3.getErrorCode() != 4 || !this.f52837k) {
                    int a = c.mo73220a().mo73226a();
                    if (connectionResult == null || i > a) {
                        connectionResult = connectionResult3;
                        i = a;
                    }
                } else {
                    int a2 = c.mo73220a().mo73226a();
                    if (connectionResult2 == null || i2 > a2) {
                        connectionResult2 = connectionResult3;
                        i2 = a2;
                    }
                }
            }
        }
        return (connectionResult == null || connectionResult2 == null || i <= i2) ? connectionResult : connectionResult2;
    }

    /* renamed from: a */
    static /* synthetic */ Lock m78685a(cr crVar) {
        return crVar.f52832f;
    }

    /* renamed from: b */
    static /* synthetic */ boolean m78690b(cr crVar) {
        return crVar.f52840n;
    }

    /* renamed from: d */
    static /* synthetic */ Map m78693d(cr crVar) {
        return crVar.f52841o;
    }

    /* renamed from: e */
    static /* synthetic */ boolean m78695e(cr crVar) {
        return crVar.f52838l;
    }

    /* renamed from: a */
    static /* synthetic */ boolean m78687a(cr crVar, cq cqVar, ConnectionResult connectionResult) {
        return crVar.m78686a(cqVar, connectionResult);
    }

    /* renamed from: f */
    static /* synthetic */ ConnectionResult m78696f(cr crVar) {
        return crVar.m78703k();
    }

    /* renamed from: g */
    static /* synthetic */ Map m78697g(cr crVar) {
        return crVar.f52842p;
    }

    /* renamed from: a */
    static /* synthetic */ boolean m78688a(cr crVar, boolean z) {
        crVar.f52840n = false;
        return false;
    }

    /* renamed from: b */
    static /* synthetic */ Map m78689b(cr crVar, Map map) {
        crVar.f52842p = map;
        return map;
    }
}
