package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.AbstractC21641i;
import com.google.android.gms.common.api.C21611a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.C21655b;
import com.google.android.gms.common.internal.C21740c;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.AbstractC22071e;
import com.google.android.gms.signin.C22066a;
import com.google.android.gms.signin.internal.zaj;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

/* renamed from: com.google.android.gms.common.api.internal.y */
public final class C21690y implements ar {

    /* renamed from: a */
    private final as f52887a;

    /* renamed from: b */
    private final Lock f52888b;

    /* renamed from: c */
    private final Context f52889c;

    /* renamed from: d */
    private final GoogleApiAvailabilityLight f52890d;

    /* renamed from: e */
    private ConnectionResult f52891e;

    /* renamed from: f */
    private int f52892f;

    /* renamed from: g */
    private int f52893g;

    /* renamed from: h */
    private int f52894h;

    /* renamed from: i */
    private final Bundle f52895i = new Bundle();

    /* renamed from: j */
    private final Set<C21611a.C21614c> f52896j = new HashSet();

    /* renamed from: k */
    private AbstractC22071e f52897k;

    /* renamed from: l */
    private boolean f52898l;

    /* renamed from: m */
    private boolean f52899m;

    /* renamed from: n */
    private boolean f52900n;

    /* renamed from: o */
    private IAccountAccessor f52901o;

    /* renamed from: p */
    private boolean f52902p;

    /* renamed from: q */
    private boolean f52903q;

    /* renamed from: r */
    private final C21740c f52904r;

    /* renamed from: s */
    private final Map<C21611a<?>, Boolean> f52905s;

    /* renamed from: t */
    private final C21611a.AbstractC21612a<? extends AbstractC22071e, C22066a> f52906t;

    /* renamed from: u */
    private ArrayList<Future<?>> f52907u = new ArrayList<>();

    public C21690y(as asVar, C21740c cVar, Map<C21611a<?>, Boolean> map, GoogleApiAvailabilityLight googleApiAvailabilityLight, C21611a.AbstractC21612a<? extends AbstractC22071e, C22066a> aVar, Lock lock, Context context) {
        this.f52887a = asVar;
        this.f52904r = cVar;
        this.f52905s = map;
        this.f52890d = googleApiAvailabilityLight;
        this.f52906t = aVar;
        this.f52888b = lock;
        this.f52889c = context;
    }

    /* renamed from: c */
    private static String m78811c(int i) {
        return i != 0 ? i != 1 ? GrsBaseInfo.CountryCodeSource.UNKNOWN : "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
    }

    @Override // com.google.android.gms.common.api.internal.ar
    /* renamed from: c */
    public final void mo73346c() {
    }

    @Override // com.google.android.gms.common.api.internal.ar
    /* renamed from: a */
    public final void mo73340a() {
        this.f52887a.f52673b.clear();
        this.f52899m = false;
        this.f52891e = null;
        this.f52893g = 0;
        this.f52898l = true;
        this.f52900n = false;
        this.f52902p = false;
        HashMap hashMap = new HashMap();
        boolean z = false;
        for (C21611a<?> aVar : this.f52905s.keySet()) {
            C21611a.AbstractC21622f fVar = this.f52887a.f52672a.get(aVar.mo73222c());
            z |= aVar.mo73220a().mo73226a() == 1;
            boolean booleanValue = this.f52905s.get(aVar).booleanValue();
            if (fVar.requiresSignIn()) {
                this.f52899m = true;
                if (booleanValue) {
                    this.f52896j.add(aVar.mo73222c());
                } else {
                    this.f52898l = false;
                }
            }
            hashMap.put(fVar, new C21645aa(this, aVar, booleanValue));
        }
        if (z) {
            this.f52899m = false;
        }
        if (this.f52899m) {
            this.f52904r.mo73687a(Integer.valueOf(System.identityHashCode(this.f52887a.f52675d)));
            C21651ag agVar = new C21651ag(this, null);
            C21611a.AbstractC21612a<? extends AbstractC22071e, C22066a> aVar2 = this.f52906t;
            Context context = this.f52889c;
            Looper c = this.f52887a.f52675d.mo73271c();
            C21740c cVar = this.f52904r;
            this.f52897k = (AbstractC22071e) aVar2.mo72954a(context, c, cVar, cVar.mo73695i(), agVar, agVar);
        }
        this.f52894h = this.f52887a.f52672a.size();
        this.f52907u.add(av.m78440a().submit(new C21646ab(this, hashMap)));
    }

    /* access modifiers changed from: public */
    /* renamed from: d */
    private final boolean m78814d() {
        int i = this.f52894h - 1;
        this.f52894h = i;
        if (i > 0) {
            return false;
        }
        if (i < 0) {
            Log.w("GoogleApiClientConnecting", this.f52887a.f52675d.mo73352n());
            Log.wtf("GoogleApiClientConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            m78807b(new ConnectionResult(8, null));
            return false;
        } else if (this.f52891e == null) {
            return true;
        } else {
            this.f52887a.f52674c = this.f52892f;
            m78807b(this.f52891e);
            return false;
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private final void m78802a(zaj zaj) {
        if (m78809b(0)) {
            ConnectionResult a = zaj.mo74987a();
            if (a.isSuccess()) {
                ResolveAccountResponse b = zaj.mo74988b();
                ConnectionResult b2 = b.mo73648b();
                if (!b2.isSuccess()) {
                    String valueOf = String.valueOf(b2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
                    sb.append("Sign-in succeeded with resolve account failure: ");
                    sb.append(valueOf);
                    Log.wtf("GoogleApiClientConnecting", sb.toString(), new Exception());
                    m78807b(b2);
                    return;
                }
                this.f52900n = true;
                this.f52901o = b.mo73647a();
                this.f52902p = b.mo73649c();
                this.f52903q = b.mo73650d();
                m78815e();
            } else if (m78804a(a)) {
                m78820g();
                m78815e();
            } else {
                m78807b(a);
            }
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: e */
    private final void m78815e() {
        if (this.f52894h == 0) {
            if (!this.f52899m || this.f52900n) {
                ArrayList arrayList = new ArrayList();
                this.f52893g = 1;
                this.f52894h = this.f52887a.f52672a.size();
                for (C21611a.C21614c<?> cVar : this.f52887a.f52672a.keySet()) {
                    if (!this.f52887a.f52673b.containsKey(cVar)) {
                        arrayList.add(this.f52887a.f52672a.get(cVar));
                    } else if (m78814d()) {
                        m78818f();
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.f52907u.add(av.m78440a().submit(new C21649ae(this, arrayList)));
                }
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.ar
    /* renamed from: a */
    public final void mo73342a(Bundle bundle) {
        if (m78809b(1)) {
            if (bundle != null) {
                this.f52895i.putAll(bundle);
            }
            if (m78814d()) {
                m78818f();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.ar
    /* renamed from: a */
    public final void mo73343a(ConnectionResult connectionResult, C21611a<?> aVar, boolean z) {
        if (m78809b(1)) {
            m78808b(connectionResult, aVar, z);
            if (m78814d()) {
                m78818f();
            }
        }
    }

    /* renamed from: f */
    private final void m78818f() {
        this.f52887a.mo73374e();
        av.m78440a().execute(new RunnableC21691z(this));
        AbstractC22071e eVar = this.f52897k;
        if (eVar != null) {
            if (this.f52902p) {
                eVar.mo74969a(this.f52901o, this.f52903q);
            }
            m78803a(false);
        }
        for (C21611a.C21614c<?> cVar : this.f52887a.f52673b.keySet()) {
            this.f52887a.f52672a.get(cVar).disconnect();
        }
        this.f52887a.f52676e.mo73348a(this.f52895i.isEmpty() ? null : this.f52895i);
    }

    @Override // com.google.android.gms.common.api.internal.ar
    /* renamed from: a */
    public final <A extends C21611a.AbstractC21613b, R extends AbstractC21641i, T extends C21655b.AbstractC21656a<R, A>> T mo73339a(T t) {
        this.f52887a.f52675d.f52635a.add(t);
        return t;
    }

    @Override // com.google.android.gms.common.api.internal.ar
    /* renamed from: b */
    public final <A extends C21611a.AbstractC21613b, T extends C21655b.AbstractC21656a<? extends AbstractC21641i, A>> T mo73344b(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // com.google.android.gms.common.api.internal.ar
    /* renamed from: b */
    public final boolean mo73345b() {
        m78822h();
        m78803a(true);
        this.f52887a.mo73364a((ConnectionResult) null);
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.ar
    /* renamed from: a */
    public final void mo73341a(int i) {
        m78807b(new ConnectionResult(8, null));
    }

    /* access modifiers changed from: public */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        if (r7 != false) goto L_0x0024;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m78808b(com.google.android.gms.common.ConnectionResult r5, com.google.android.gms.common.api.C21611a<?> r6, boolean r7) {
        /*
            r4 = this;
            com.google.android.gms.common.api.a$e r0 = r6.mo73220a()
            int r0 = r0.mo73226a()
            r1 = 0
            r2 = 1
            if (r7 == 0) goto L_0x0024
            boolean r7 = r5.hasResolution()
            if (r7 == 0) goto L_0x0014
        L_0x0012:
            r7 = 1
            goto L_0x0022
        L_0x0014:
            com.google.android.gms.common.GoogleApiAvailabilityLight r7 = r4.f52890d
            int r3 = r5.getErrorCode()
            android.content.Intent r7 = r7.getErrorResolutionIntent(r3)
            if (r7 == 0) goto L_0x0021
            goto L_0x0012
        L_0x0021:
            r7 = 0
        L_0x0022:
            if (r7 == 0) goto L_0x002d
        L_0x0024:
            com.google.android.gms.common.ConnectionResult r7 = r4.f52891e
            if (r7 == 0) goto L_0x002c
            int r7 = r4.f52892f
            if (r0 >= r7) goto L_0x002d
        L_0x002c:
            r1 = 1
        L_0x002d:
            if (r1 == 0) goto L_0x0033
            r4.f52891e = r5
            r4.f52892f = r0
        L_0x0033:
            com.google.android.gms.common.api.internal.as r7 = r4.f52887a
            java.util.Map<com.google.android.gms.common.api.a$c<?>, com.google.android.gms.common.ConnectionResult> r7 = r7.f52673b
            com.google.android.gms.common.api.a$c r6 = r6.mo73222c()
            r7.put(r6, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C21690y.m78808b(com.google.android.gms.common.ConnectionResult, com.google.android.gms.common.api.a, boolean):void");
    }

    /* access modifiers changed from: public */
    /* renamed from: g */
    private final void m78820g() {
        this.f52899m = false;
        this.f52887a.f52675d.f52637c = Collections.emptySet();
        for (C21611a.C21614c<?> cVar : this.f52896j) {
            if (!this.f52887a.f52673b.containsKey(cVar)) {
                this.f52887a.f52673b.put(cVar, new ConnectionResult(17, null));
            }
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private final boolean m78804a(ConnectionResult connectionResult) {
        return this.f52898l && !connectionResult.hasResolution();
    }

    /* renamed from: b */
    private final void m78807b(ConnectionResult connectionResult) {
        m78822h();
        m78803a(!connectionResult.hasResolution());
        this.f52887a.mo73364a(connectionResult);
        this.f52887a.f52676e.mo73349a(connectionResult);
    }

    /* renamed from: a */
    private final void m78803a(boolean z) {
        AbstractC22071e eVar = this.f52897k;
        if (eVar != null) {
            if (eVar.isConnected() && z) {
                this.f52897k.mo74968a();
            }
            this.f52897k.disconnect();
            if (this.f52904r.mo73697k()) {
                this.f52897k = null;
            }
            this.f52901o = null;
        }
    }

    /* renamed from: h */
    private final void m78822h() {
        ArrayList<Future<?>> arrayList = this.f52907u;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Future<?> future = arrayList.get(i);
            i++;
            future.cancel(true);
        }
        this.f52907u.clear();
    }

    /* access modifiers changed from: public */
    /* renamed from: i */
    private final Set<Scope> m78824i() {
        if (this.f52904r == null) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(this.f52904r.mo73690d());
        Map<C21611a<?>, C21740c.C21742b> f = this.f52904r.mo73692f();
        for (C21611a<?> aVar : f.keySet()) {
            if (!this.f52887a.f52673b.containsKey(aVar.mo73222c())) {
                hashSet.addAll(f.get(aVar).f53070a);
            }
        }
        return hashSet;
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private final boolean m78809b(int i) {
        if (this.f52893g == i) {
            return true;
        }
        Log.w("GoogleApiClientConnecting", this.f52887a.f52675d.mo73352n());
        String valueOf = String.valueOf(this);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
        sb.append("Unexpected callback in ");
        sb.append(valueOf);
        Log.w("GoogleApiClientConnecting", sb.toString());
        int i2 = this.f52894h;
        StringBuilder sb2 = new StringBuilder(33);
        sb2.append("mRemainingConnections=");
        sb2.append(i2);
        Log.w("GoogleApiClientConnecting", sb2.toString());
        String c = m78811c(this.f52893g);
        String c2 = m78811c(i);
        StringBuilder sb3 = new StringBuilder(String.valueOf(c).length() + 70 + String.valueOf(c2).length());
        sb3.append("GoogleApiClient connecting is in step ");
        sb3.append(c);
        sb3.append(" but received callback for step ");
        sb3.append(c2);
        Log.wtf("GoogleApiClientConnecting", sb3.toString(), new Exception());
        m78807b(new ConnectionResult(8, null));
        return false;
    }

    /* renamed from: a */
    static /* synthetic */ void m78799a(C21690y yVar, ConnectionResult connectionResult) {
        yVar.m78807b(connectionResult);
    }
}
