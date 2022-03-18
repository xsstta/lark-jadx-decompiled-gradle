package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.AbstractC21641i;
import com.google.android.gms.common.api.C21611a;
import com.google.android.gms.common.api.internal.C21655b;
import com.google.android.gms.common.internal.C21740c;
import com.google.android.gms.signin.AbstractC22071e;
import com.google.android.gms.signin.C22066a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public final class as implements bf, cl {

    /* renamed from: a */
    final Map<C21611a.C21614c<?>, C21611a.AbstractC21622f> f52672a;

    /* renamed from: b */
    final Map<C21611a.C21614c<?>, ConnectionResult> f52673b = new HashMap();

    /* renamed from: c */
    int f52674c;

    /* renamed from: d */
    final aj f52675d;

    /* renamed from: e */
    final AbstractC21658bg f52676e;

    /* renamed from: f */
    private final Lock f52677f;

    /* renamed from: g */
    private final Condition f52678g;

    /* renamed from: h */
    private final Context f52679h;

    /* renamed from: i */
    private final GoogleApiAvailabilityLight f52680i;

    /* renamed from: j */
    private final au f52681j;

    /* renamed from: k */
    private final C21740c f52682k;

    /* renamed from: l */
    private final Map<C21611a<?>, Boolean> f52683l;

    /* renamed from: m */
    private final C21611a.AbstractC21612a<? extends AbstractC22071e, C22066a> f52684m;

    /* renamed from: n */
    private volatile ar f52685n;

    /* renamed from: o */
    private ConnectionResult f52686o = null;

    public as(Context context, aj ajVar, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map<C21611a.C21614c<?>, C21611a.AbstractC21622f> map, C21740c cVar, Map<C21611a<?>, Boolean> map2, C21611a.AbstractC21612a<? extends AbstractC22071e, C22066a> aVar, ArrayList<ck> arrayList, AbstractC21658bg bgVar) {
        this.f52679h = context;
        this.f52677f = lock;
        this.f52680i = googleApiAvailabilityLight;
        this.f52672a = map;
        this.f52682k = cVar;
        this.f52683l = map2;
        this.f52684m = aVar;
        this.f52675d = ajVar;
        this.f52676e = bgVar;
        ArrayList<ck> arrayList2 = arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            ck ckVar = arrayList2.get(i);
            i++;
            ckVar.mo73463a(this);
        }
        this.f52681j = new au(this, looper);
        this.f52678g = lock.newCondition();
        this.f52685n = new C21653ai(this);
    }

    @Override // com.google.android.gms.common.api.internal.bf
    /* renamed from: a */
    public final boolean mo73369a(AbstractC21674i iVar) {
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.bf
    /* renamed from: h */
    public final void mo73377h() {
    }

    @Override // com.google.android.gms.common.api.internal.bf
    /* renamed from: a */
    public final <A extends C21611a.AbstractC21613b, R extends AbstractC21641i, T extends C21655b.AbstractC21656a<R, A>> T mo73362a(T t) {
        t.mo73318h();
        return (T) this.f52685n.mo73339a(t);
    }

    @Override // com.google.android.gms.common.api.internal.bf
    /* renamed from: b */
    public final <A extends C21611a.AbstractC21613b, T extends C21655b.AbstractC21656a<? extends AbstractC21641i, A>> T mo73371b(T t) {
        t.mo73318h();
        return (T) this.f52685n.mo73344b(t);
    }

    @Override // com.google.android.gms.common.api.internal.bf
    /* renamed from: a */
    public final void mo73363a() {
        this.f52685n.mo73346c();
    }

    @Override // com.google.android.gms.common.api.internal.bf
    /* renamed from: b */
    public final ConnectionResult mo73370b() {
        mo73363a();
        while (mo73376g()) {
            try {
                this.f52678g.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, null);
            }
        }
        if (mo73375f()) {
            return ConnectionResult.RESULT_SUCCESS;
        }
        ConnectionResult connectionResult = this.f52686o;
        if (connectionResult != null) {
            return connectionResult;
        }
        return new ConnectionResult(13, null);
    }

    @Override // com.google.android.gms.common.api.internal.bf
    /* renamed from: c */
    public final void mo73372c() {
        if (this.f52685n.mo73345b()) {
            this.f52673b.clear();
        }
    }

    /* renamed from: d */
    public final void mo73373d() {
        this.f52677f.lock();
        try {
            this.f52685n = new C21690y(this, this.f52682k, this.f52683l, this.f52680i, this.f52684m, this.f52677f, this.f52679h);
            this.f52685n.mo73340a();
            this.f52678g.signalAll();
        } finally {
            this.f52677f.unlock();
        }
    }

    /* renamed from: e */
    public final void mo73374e() {
        this.f52677f.lock();
        try {
            this.f52675d.mo73350l();
            this.f52685n = new C21687v(this);
            this.f52685n.mo73340a();
            this.f52678g.signalAll();
        } finally {
            this.f52677f.unlock();
        }
    }

    /* renamed from: a */
    public final void mo73364a(ConnectionResult connectionResult) {
        this.f52677f.lock();
        try {
            this.f52686o = connectionResult;
            this.f52685n = new C21653ai(this);
            this.f52685n.mo73340a();
            this.f52678g.signalAll();
        } finally {
            this.f52677f.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.bf
    /* renamed from: f */
    public final boolean mo73375f() {
        return this.f52685n instanceof C21687v;
    }

    /* renamed from: g */
    public final boolean mo73376g() {
        return this.f52685n instanceof C21690y;
    }

    @Override // com.google.android.gms.common.api.internal.bf
    /* renamed from: i */
    public final void mo73378i() {
        if (mo73375f()) {
            ((C21687v) this.f52685n).mo73507d();
        }
    }

    @Override // com.google.android.gms.common.api.internal.cl
    /* renamed from: a */
    public final void mo73365a(ConnectionResult connectionResult, C21611a<?> aVar, boolean z) {
        this.f52677f.lock();
        try {
            this.f52685n.mo73343a(connectionResult, aVar, z);
        } finally {
            this.f52677f.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC21631d.AbstractC21633b
    public final void onConnected(Bundle bundle) {
        this.f52677f.lock();
        try {
            this.f52685n.mo73342a(bundle);
        } finally {
            this.f52677f.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC21631d.AbstractC21633b
    public final void onConnectionSuspended(int i) {
        this.f52677f.lock();
        try {
            this.f52685n.mo73341a(i);
        } finally {
            this.f52677f.unlock();
        }
    }

    /* renamed from: a */
    public final void mo73366a(AbstractC21654at atVar) {
        this.f52681j.sendMessage(this.f52681j.obtainMessage(1, atVar));
    }

    /* renamed from: a */
    public final void mo73367a(RuntimeException runtimeException) {
        this.f52681j.sendMessage(this.f52681j.obtainMessage(2, runtimeException));
    }

    @Override // com.google.android.gms.common.api.internal.bf
    /* renamed from: a */
    public final void mo73368a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String concat = String.valueOf(str).concat("  ");
        printWriter.append((CharSequence) str).append("mState=").println(this.f52685n);
        for (C21611a<?> aVar : this.f52683l.keySet()) {
            printWriter.append((CharSequence) str).append((CharSequence) aVar.mo73223d()).println(":");
            this.f52672a.get(aVar.mo73222c()).dump(concat, fileDescriptor, printWriter, strArr);
        }
    }
}
