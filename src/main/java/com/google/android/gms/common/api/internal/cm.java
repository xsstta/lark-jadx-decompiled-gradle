package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.AbstractC21641i;
import com.google.android.gms.common.api.C21611a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C21655b;
import com.google.android.gms.common.internal.C21740c;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.base.HandlerC21909h;
import com.google.android.gms.signin.AbstractC22071e;
import com.google.android.gms.signin.C22066a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;

/* access modifiers changed from: package-private */
public final class cm implements bf {

    /* renamed from: a */
    private final Context f52806a;

    /* renamed from: b */
    private final aj f52807b;

    /* renamed from: c */
    private final Looper f52808c;

    /* renamed from: d */
    private final as f52809d;

    /* renamed from: e */
    private final as f52810e;

    /* renamed from: f */
    private final Map<C21611a.C21614c<?>, as> f52811f;

    /* renamed from: g */
    private final Set<AbstractC21674i> f52812g = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: h */
    private final C21611a.AbstractC21622f f52813h;

    /* renamed from: i */
    private Bundle f52814i;

    /* renamed from: j */
    private ConnectionResult f52815j = null;

    /* renamed from: k */
    private ConnectionResult f52816k = null;

    /* renamed from: l */
    private boolean f52817l = false;

    /* renamed from: m */
    private final Lock f52818m;

    /* renamed from: n */
    private int f52819n = 0;

    /* renamed from: a */
    public static cm m78642a(Context context, aj ajVar, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map<C21611a.C21614c<?>, C21611a.AbstractC21622f> map, C21740c cVar, Map<C21611a<?>, Boolean> map2, C21611a.AbstractC21612a<? extends AbstractC22071e, C22066a> aVar, ArrayList<ck> arrayList) {
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = new ArrayMap();
        C21611a.AbstractC21622f fVar = null;
        for (Map.Entry<C21611a.C21614c<?>, C21611a.AbstractC21622f> entry : map.entrySet()) {
            C21611a.AbstractC21622f value = entry.getValue();
            if (value.providesSignIn()) {
                fVar = value;
            }
            if (value.requiresSignIn()) {
                arrayMap.put(entry.getKey(), value);
            } else {
                arrayMap2.put(entry.getKey(), value);
            }
        }
        Preconditions.checkState(!arrayMap.isEmpty(), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        ArrayMap arrayMap3 = new ArrayMap();
        ArrayMap arrayMap4 = new ArrayMap();
        for (C21611a<?> aVar2 : map2.keySet()) {
            C21611a.C21614c<?> c = aVar2.mo73222c();
            if (arrayMap.containsKey(c)) {
                arrayMap3.put(aVar2, map2.get(aVar2));
            } else if (arrayMap2.containsKey(c)) {
                arrayMap4.put(aVar2, map2.get(aVar2));
            } else {
                throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList<ck> arrayList4 = arrayList;
        int size = arrayList4.size();
        int i = 0;
        while (i < size) {
            ck ckVar = arrayList4.get(i);
            i++;
            ck ckVar2 = ckVar;
            if (arrayMap3.containsKey(ckVar2.f52803a)) {
                arrayList2.add(ckVar2);
            } else if (arrayMap4.containsKey(ckVar2.f52803a)) {
                arrayList3.add(ckVar2);
            } else {
                throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
            }
        }
        return new cm(context, ajVar, lock, looper, googleApiAvailabilityLight, arrayMap, arrayMap2, cVar, aVar, fVar, arrayList2, arrayList3, arrayMap3, arrayMap4);
    }

    private cm(Context context, aj ajVar, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map<C21611a.C21614c<?>, C21611a.AbstractC21622f> map, Map<C21611a.C21614c<?>, C21611a.AbstractC21622f> map2, C21740c cVar, C21611a.AbstractC21612a<? extends AbstractC22071e, C22066a> aVar, C21611a.AbstractC21622f fVar, ArrayList<ck> arrayList, ArrayList<ck> arrayList2, Map<C21611a<?>, Boolean> map3, Map<C21611a<?>, Boolean> map4) {
        this.f52806a = context;
        this.f52807b = ajVar;
        this.f52818m = lock;
        this.f52808c = looper;
        this.f52813h = fVar;
        this.f52809d = new as(context, ajVar, lock, looper, googleApiAvailabilityLight, map2, null, map4, null, arrayList2, new co(this, null));
        this.f52810e = new as(context, ajVar, lock, looper, googleApiAvailabilityLight, map, cVar, map3, aVar, arrayList, new cp(this, null));
        ArrayMap arrayMap = new ArrayMap();
        for (C21611a.C21614c<?> cVar2 : map2.keySet()) {
            arrayMap.put(cVar2, this.f52809d);
        }
        for (C21611a.C21614c<?> cVar3 : map.keySet()) {
            arrayMap.put(cVar3, this.f52810e);
        }
        this.f52811f = Collections.unmodifiableMap(arrayMap);
    }

    @Override // com.google.android.gms.common.api.internal.bf
    /* renamed from: a */
    public final <A extends C21611a.AbstractC21613b, R extends AbstractC21641i, T extends C21655b.AbstractC21656a<R, A>> T mo73362a(T t) {
        if (!m78653c(t)) {
            return (T) this.f52809d.mo73362a(t);
        }
        if (!m78660j()) {
            return (T) this.f52810e.mo73362a(t);
        }
        t.mo73386b(new Status(4, null, m78661k()));
        return t;
    }

    @Override // com.google.android.gms.common.api.internal.bf
    /* renamed from: b */
    public final <A extends C21611a.AbstractC21613b, T extends C21655b.AbstractC21656a<? extends AbstractC21641i, A>> T mo73371b(T t) {
        if (!m78653c(t)) {
            return (T) this.f52809d.mo73371b(t);
        }
        if (!m78660j()) {
            return (T) this.f52810e.mo73371b(t);
        }
        t.mo73386b(new Status(4, null, m78661k()));
        return t;
    }

    @Override // com.google.android.gms.common.api.internal.bf
    /* renamed from: a */
    public final void mo73363a() {
        this.f52819n = 2;
        this.f52817l = false;
        this.f52816k = null;
        this.f52815j = null;
        this.f52809d.mo73363a();
        this.f52810e.mo73363a();
    }

    @Override // com.google.android.gms.common.api.internal.bf
    /* renamed from: b */
    public final ConnectionResult mo73370b() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.common.api.internal.bf
    /* renamed from: c */
    public final void mo73372c() {
        this.f52816k = null;
        this.f52815j = null;
        this.f52819n = 0;
        this.f52809d.mo73372c();
        this.f52810e.mo73372c();
        m78659g();
    }

    @Override // com.google.android.gms.common.api.internal.bf
    /* renamed from: f */
    public final boolean mo73375f() {
        this.f52818m.lock();
        try {
            boolean z = true;
            if (!this.f52809d.mo73375f() || (!this.f52810e.mo73375f() && !m78660j() && this.f52819n != 1)) {
                z = false;
            }
            return z;
        } finally {
            this.f52818m.unlock();
        }
    }

    /* renamed from: d */
    public final boolean mo73464d() {
        this.f52818m.lock();
        try {
            return this.f52819n == 2;
        } finally {
            this.f52818m.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.bf
    /* renamed from: a */
    public final boolean mo73369a(AbstractC21674i iVar) {
        this.f52818m.lock();
        try {
            if ((mo73464d() || mo73375f()) && !this.f52810e.mo73375f()) {
                this.f52812g.add(iVar);
                if (this.f52819n == 0) {
                    this.f52819n = 1;
                }
                this.f52816k = null;
                this.f52810e.mo73363a();
                return true;
            }
            this.f52818m.unlock();
            return false;
        } finally {
            this.f52818m.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.bf
    /* renamed from: i */
    public final void mo73378i() {
        this.f52809d.mo73378i();
        this.f52810e.mo73378i();
    }

    @Override // com.google.android.gms.common.api.internal.bf
    /* renamed from: h */
    public final void mo73377h() {
        this.f52818m.lock();
        try {
            boolean d = mo73464d();
            this.f52810e.mo73372c();
            this.f52816k = new ConnectionResult(4);
            if (d) {
                new HandlerC21909h(this.f52808c).post(new cn(this));
            } else {
                m78659g();
            }
        } finally {
            this.f52818m.unlock();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: e */
    private final void m78657e() {
        if (m78652b(this.f52815j)) {
            if (m78652b(this.f52816k) || m78660j()) {
                int i = this.f52819n;
                if (i != 1) {
                    if (i != 2) {
                        Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                        this.f52819n = 0;
                        return;
                    }
                    this.f52807b.mo73348a(this.f52814i);
                }
                m78659g();
                this.f52819n = 0;
                return;
            }
            ConnectionResult connectionResult = this.f52816k;
            if (connectionResult == null) {
                return;
            }
            if (this.f52819n == 1) {
                m78659g();
                return;
            }
            m78646a(connectionResult);
            this.f52809d.mo73372c();
        } else if (this.f52815j == null || !m78652b(this.f52816k)) {
            ConnectionResult connectionResult2 = this.f52815j;
            if (connectionResult2 != null && this.f52816k != null) {
                if (this.f52810e.f52674c < this.f52809d.f52674c) {
                    connectionResult2 = this.f52816k;
                }
                m78646a(connectionResult2);
            }
        } else {
            this.f52810e.mo73372c();
            m78646a(this.f52815j);
        }
    }

    /* renamed from: a */
    private final void m78646a(ConnectionResult connectionResult) {
        int i = this.f52819n;
        if (i != 1) {
            if (i != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.f52819n = 0;
            }
            this.f52807b.mo73349a(connectionResult);
        }
        m78659g();
        this.f52819n = 0;
    }

    /* renamed from: g */
    private final void m78659g() {
        for (AbstractC21674i iVar : this.f52812g) {
            iVar.mo73095h();
        }
        this.f52812g.clear();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m78644a(int i, boolean z) {
        this.f52807b.mo73347a(i, z);
        this.f52816k = null;
        this.f52815j = null;
    }

    /* renamed from: j */
    private final boolean m78660j() {
        ConnectionResult connectionResult = this.f52816k;
        return connectionResult != null && connectionResult.getErrorCode() == 4;
    }

    /* renamed from: c */
    private final boolean m78653c(C21655b.AbstractC21656a<? extends AbstractC21641i, ? extends C21611a.AbstractC21613b> aVar) {
        C21611a.C21614c<? extends C21611a.AbstractC21613b> d = aVar.mo73388d();
        Preconditions.checkArgument(this.f52811f.containsKey(d), "GoogleApiClient is not configured to use the API required for this call.");
        return this.f52811f.get(d).equals(this.f52810e);
    }

    /* renamed from: k */
    private final PendingIntent m78661k() {
        if (this.f52813h == null) {
            return null;
        }
        return PendingIntent.getActivity(this.f52806a, System.identityHashCode(this.f52807b), this.f52813h.getSignInIntent(), 134217728);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m78645a(Bundle bundle) {
        Bundle bundle2 = this.f52814i;
        if (bundle2 == null) {
            this.f52814i = bundle;
        } else if (bundle != null) {
            bundle2.putAll(bundle);
        }
    }

    /* renamed from: b */
    private static boolean m78652b(ConnectionResult connectionResult) {
        return connectionResult != null && connectionResult.isSuccess();
    }

    @Override // com.google.android.gms.common.api.internal.bf
    /* renamed from: a */
    public final void mo73368a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(":");
        this.f52810e.mo73368a(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(":");
        this.f52809d.mo73368a(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }
}
