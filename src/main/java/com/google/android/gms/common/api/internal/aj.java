package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.C21608a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AbstractC21631d;
import com.google.android.gms.common.api.AbstractC21635e;
import com.google.android.gms.common.api.AbstractC21641i;
import com.google.android.gms.common.api.C21611a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C21655b;
import com.google.android.gms.common.internal.C21740c;
import com.google.android.gms.common.internal.C21746g;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.service.C21764a;
import com.google.android.gms.common.util.C21805b;
import com.google.android.gms.signin.AbstractC22071e;
import com.google.android.gms.signin.C22066a;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;

public final class aj extends AbstractC21631d implements AbstractC21658bg {

    /* renamed from: a */
    final Queue<C21655b.AbstractC21656a<?, ?>> f52635a = new LinkedList();

    /* renamed from: b */
    final Map<C21611a.C21614c<?>, C21611a.AbstractC21622f> f52636b;

    /* renamed from: c */
    Set<Scope> f52637c;

    /* renamed from: d */
    Set<bq> f52638d;

    /* renamed from: e */
    final bt f52639e;

    /* renamed from: f */
    private final Lock f52640f;

    /* renamed from: g */
    private boolean f52641g;

    /* renamed from: h */
    private final C21746g f52642h;

    /* renamed from: i */
    private bf f52643i;

    /* renamed from: j */
    private final int f52644j;

    /* renamed from: k */
    private final Context f52645k;

    /* renamed from: l */
    private final Looper f52646l;

    /* renamed from: m */
    private volatile boolean f52647m;

    /* renamed from: n */
    private long f52648n;

    /* renamed from: o */
    private long f52649o;

    /* renamed from: p */
    private final ap f52650p;

    /* renamed from: q */
    private final C21608a f52651q;

    /* renamed from: r */
    private zabq f52652r;

    /* renamed from: s */
    private final C21740c f52653s;

    /* renamed from: t */
    private final Map<C21611a<?>, Boolean> f52654t;

    /* renamed from: u */
    private final C21611a.AbstractC21612a<? extends AbstractC22071e, C22066a> f52655u;

    /* renamed from: v */
    private final C21672g f52656v;

    /* renamed from: w */
    private final ArrayList<ck> f52657w;

    /* renamed from: x */
    private Integer f52658x;

    /* renamed from: y */
    private final C21746g.AbstractC21747a f52659y;

    public aj(Context context, Lock lock, Looper looper, C21740c cVar, C21608a aVar, C21611a.AbstractC21612a<? extends AbstractC22071e, C22066a> aVar2, Map<C21611a<?>, Boolean> map, List<AbstractC21631d.AbstractC21633b> list, List<AbstractC21631d.AbstractC21634c> list2, Map<C21611a.C21614c<?>, C21611a.AbstractC21622f> map2, int i, int i2, ArrayList<ck> arrayList, boolean z) {
        this.f52648n = C21805b.m79078a() ? 10000 : 120000;
        this.f52649o = 5000;
        this.f52637c = new HashSet();
        this.f52656v = new C21672g();
        this.f52658x = null;
        this.f52638d = null;
        ak akVar = new ak(this);
        this.f52659y = akVar;
        this.f52645k = context;
        this.f52640f = lock;
        this.f52641g = false;
        this.f52642h = new C21746g(looper, akVar);
        this.f52646l = looper;
        this.f52650p = new ap(this, looper);
        this.f52651q = aVar;
        this.f52644j = i;
        if (i >= 0) {
            this.f52658x = Integer.valueOf(i2);
        }
        this.f52654t = map;
        this.f52636b = map2;
        this.f52657w = arrayList;
        this.f52639e = new bt(map2);
        for (AbstractC21631d.AbstractC21633b bVar : list) {
            this.f52642h.mo73711a(bVar);
        }
        for (AbstractC21631d.AbstractC21634c cVar2 : list2) {
            this.f52642h.mo73712a(cVar2);
        }
        this.f52653s = cVar;
        this.f52655u = aVar2;
    }

    /* renamed from: c */
    private static String m78375c(int i) {
        return i != 1 ? i != 2 ? i != 3 ? GrsBaseInfo.CountryCodeSource.UNKNOWN : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
    }

    @Override // com.google.android.gms.common.api.AbstractC21631d
    /* renamed from: a */
    public final <A extends C21611a.AbstractC21613b, R extends AbstractC21641i, T extends C21655b.AbstractC21656a<R, A>> T mo73261a(T t) {
        Preconditions.checkArgument(t.mo73388d() != null, "This task can not be enqueued (it's probably a Batch or malformed)");
        boolean containsKey = this.f52636b.containsKey(t.mo73388d());
        String d = t.mo73389e() != null ? t.mo73389e().mo73223d() : "the API";
        StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(d);
        sb.append(" required for this call.");
        Preconditions.checkArgument(containsKey, sb.toString());
        this.f52640f.lock();
        try {
            bf bfVar = this.f52643i;
            if (bfVar == null) {
                this.f52635a.add(t);
                return t;
            }
            T t2 = (T) bfVar.mo73362a(t);
            this.f52640f.unlock();
            return t2;
        } finally {
            this.f52640f.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC21631d
    /* renamed from: b */
    public final <A extends C21611a.AbstractC21613b, T extends C21655b.AbstractC21656a<? extends AbstractC21641i, A>> T mo73268b(T t) {
        Preconditions.checkArgument(t.mo73388d() != null, "This task can not be executed (it's probably a Batch or malformed)");
        boolean containsKey = this.f52636b.containsKey(t.mo73388d());
        String d = t.mo73389e() != null ? t.mo73389e().mo73223d() : "the API";
        StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(d);
        sb.append(" required for this call.");
        Preconditions.checkArgument(containsKey, sb.toString());
        this.f52640f.lock();
        try {
            if (this.f52643i == null) {
                throw new IllegalStateException("GoogleApiClient is not connected yet.");
            } else if (this.f52647m) {
                this.f52635a.add(t);
                while (!this.f52635a.isEmpty()) {
                    C21655b.AbstractC21656a<?, ?> remove = this.f52635a.remove();
                    this.f52639e.mo73406a(remove);
                    remove.mo73386b(Status.RESULT_INTERNAL_ERROR);
                }
                return t;
            } else {
                T t2 = (T) this.f52643i.mo73371b(t);
                this.f52640f.unlock();
                return t2;
            }
        } finally {
            this.f52640f.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC21631d
    /* renamed from: e */
    public final void mo73273e() {
        this.f52640f.lock();
        try {
            boolean z = false;
            if (this.f52644j >= 0) {
                if (this.f52658x != null) {
                    z = true;
                }
                Preconditions.checkState(z, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = this.f52658x;
                if (num == null) {
                    this.f52658x = Integer.valueOf(m78368a((Iterable<C21611a.AbstractC21622f>) this.f52636b.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            mo73262a(this.f52658x.intValue());
        } finally {
            this.f52640f.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC21631d
    /* renamed from: a */
    public final void mo73262a(int i) {
        this.f52640f.lock();
        boolean z = true;
        if (!(i == 3 || i == 1 || i == 2)) {
            z = false;
        }
        try {
            StringBuilder sb = new StringBuilder(33);
            sb.append("Illegal sign-in mode: ");
            sb.append(i);
            Preconditions.checkArgument(z, sb.toString());
            m78372b(i);
            m78376o();
        } finally {
            this.f52640f.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC21631d
    /* renamed from: f */
    public final ConnectionResult mo73274f() {
        boolean z = true;
        Preconditions.checkState(Looper.myLooper() != Looper.getMainLooper(), "blockingConnect must not be called on the UI thread");
        this.f52640f.lock();
        try {
            if (this.f52644j >= 0) {
                if (this.f52658x == null) {
                    z = false;
                }
                Preconditions.checkState(z, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = this.f52658x;
                if (num == null) {
                    this.f52658x = Integer.valueOf(m78368a((Iterable<C21611a.AbstractC21622f>) this.f52636b.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            m78372b(this.f52658x.intValue());
            this.f52642h.mo73713b();
            return this.f52643i.mo73370b();
        } finally {
            this.f52640f.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC21631d
    /* renamed from: g */
    public final void mo73275g() {
        this.f52640f.lock();
        try {
            this.f52639e.mo73405a();
            bf bfVar = this.f52643i;
            if (bfVar != null) {
                bfVar.mo73372c();
            }
            this.f52656v.mo73488a();
            for (C21655b.AbstractC21656a<?, ?> aVar : this.f52635a) {
                aVar.mo73313a((bw) null);
                aVar.mo73290a();
            }
            this.f52635a.clear();
            if (this.f52643i != null) {
                mo73350l();
                this.f52642h.mo73707a();
                this.f52640f.unlock();
            }
        } finally {
            this.f52640f.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC21631d
    /* renamed from: h */
    public final void mo73276h() {
        mo73275g();
        mo73273e();
    }

    @Override // com.google.android.gms.common.api.AbstractC21631d
    /* renamed from: i */
    public final AbstractC21635e<Status> mo73277i() {
        Preconditions.checkState(mo73278j(), "GoogleApiClient is not connected yet.");
        Preconditions.checkState(this.f52658x.intValue() != 2, "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API");
        C21676k kVar = new C21676k(this);
        if (this.f52636b.containsKey(C21764a.f53106a)) {
            m78369a(this, kVar, false);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            AbstractC21631d b = new AbstractC21631d.C21632a(this.f52645k).mo73280a(C21764a.f53107b).mo73282a(new al(this, atomicReference, kVar)).mo73283a(new am(this, kVar)).mo73279a(this.f52650p).mo73285b();
            atomicReference.set(b);
            b.mo73273e();
        }
        return kVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m78369a(AbstractC21631d dVar, C21676k kVar, boolean z) {
        C21764a.f53108c.mo73748a(dVar).mo73292a(new ao(this, kVar, z, dVar));
    }

    @Override // com.google.android.gms.common.api.AbstractC21631d
    /* renamed from: j */
    public final boolean mo73278j() {
        bf bfVar = this.f52643i;
        return bfVar != null && bfVar.mo73375f();
    }

    /* renamed from: b */
    private final void m78372b(int i) {
        Integer num = this.f52658x;
        if (num == null) {
            this.f52658x = Integer.valueOf(i);
        } else if (num.intValue() != i) {
            String c = m78375c(i);
            String c2 = m78375c(this.f52658x.intValue());
            StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 51 + String.valueOf(c2).length());
            sb.append("Cannot use sign-in mode: ");
            sb.append(c);
            sb.append(". Mode was already set to ");
            sb.append(c2);
            throw new IllegalStateException(sb.toString());
        }
        if (this.f52643i == null) {
            boolean z = false;
            boolean z2 = false;
            for (C21611a.AbstractC21622f fVar : this.f52636b.values()) {
                if (fVar.requiresSignIn()) {
                    z = true;
                }
                if (fVar.providesSignIn()) {
                    z2 = true;
                }
            }
            int intValue = this.f52658x.intValue();
            if (intValue != 1) {
                if (intValue == 2 && z) {
                    if (this.f52641g) {
                        this.f52643i = new cr(this.f52645k, this.f52640f, this.f52646l, this.f52651q, this.f52636b, this.f52653s, this.f52654t, this.f52655u, this.f52657w, this, true);
                        return;
                    } else {
                        this.f52643i = cm.m78642a(this.f52645k, this, this.f52640f, this.f52646l, this.f52651q, this.f52636b, this.f52653s, this.f52654t, this.f52655u, this.f52657w);
                        return;
                    }
                }
            } else if (!z) {
                throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
            } else if (z2) {
                throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            if (!this.f52641g || z2) {
                this.f52643i = new as(this.f52645k, this, this.f52640f, this.f52646l, this.f52651q, this.f52636b, this.f52653s, this.f52654t, this.f52655u, this.f52657w, this);
            } else {
                this.f52643i = new cr(this.f52645k, this.f52640f, this.f52646l, this.f52651q, this.f52636b, this.f52653s, this.f52654t, this.f52655u, this.f52657w, this, false);
            }
        }
    }

    /* renamed from: o */
    private final void m78376o() {
        this.f52642h.mo73713b();
        this.f52643i.mo73363a();
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public final void m78377p() {
        this.f52640f.lock();
        try {
            if (this.f52647m) {
                m78376o();
            }
        } finally {
            this.f52640f.unlock();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public final void m78378q() {
        this.f52640f.lock();
        try {
            if (mo73350l()) {
                m78376o();
            }
        } finally {
            this.f52640f.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final boolean mo73350l() {
        if (!this.f52647m) {
            return false;
        }
        this.f52647m = false;
        this.f52650p.removeMessages(2);
        this.f52650p.removeMessages(1);
        zabq zabq = this.f52652r;
        if (zabq != null) {
            zabq.mo73510a();
            this.f52652r = null;
        }
        return true;
    }

    @Override // com.google.android.gms.common.api.AbstractC21631d
    /* renamed from: a */
    public final void mo73263a(AbstractC21631d.AbstractC21634c cVar) {
        this.f52642h.mo73712a(cVar);
    }

    @Override // com.google.android.gms.common.api.AbstractC21631d
    /* renamed from: b */
    public final void mo73269b(AbstractC21631d.AbstractC21634c cVar) {
        this.f52642h.mo73714b(cVar);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC21658bg
    /* renamed from: a */
    public final void mo73348a(Bundle bundle) {
        while (!this.f52635a.isEmpty()) {
            mo73268b(this.f52635a.remove());
        }
        this.f52642h.mo73709a(bundle);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC21658bg
    /* renamed from: a */
    public final void mo73349a(ConnectionResult connectionResult) {
        if (!this.f52651q.isPlayServicesPossiblyUpdating(this.f52645k, connectionResult.getErrorCode())) {
            mo73350l();
        }
        if (!this.f52647m) {
            this.f52642h.mo73710a(connectionResult);
            this.f52642h.mo73707a();
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC21658bg
    /* renamed from: a */
    public final void mo73347a(int i, boolean z) {
        if (i == 1 && !z && !this.f52647m) {
            this.f52647m = true;
            if (this.f52652r == null && !C21805b.m79078a()) {
                this.f52652r = this.f52651q.mo73178a(this.f52645k.getApplicationContext(), new aq(this));
            }
            ap apVar = this.f52650p;
            apVar.sendMessageDelayed(apVar.obtainMessage(1), this.f52648n);
            ap apVar2 = this.f52650p;
            apVar2.sendMessageDelayed(apVar2.obtainMessage(2), this.f52649o);
        }
        this.f52639e.mo73407b();
        this.f52642h.mo73708a(i);
        this.f52642h.mo73707a();
        if (i == 2) {
            m78376o();
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC21631d
    /* renamed from: b */
    public final Context mo73267b() {
        return this.f52645k;
    }

    @Override // com.google.android.gms.common.api.AbstractC21631d
    /* renamed from: c */
    public final Looper mo73271c() {
        return this.f52646l;
    }

    @Override // com.google.android.gms.common.api.AbstractC21631d
    /* renamed from: a */
    public final boolean mo73266a(AbstractC21674i iVar) {
        bf bfVar = this.f52643i;
        return bfVar != null && bfVar.mo73369a(iVar);
    }

    @Override // com.google.android.gms.common.api.AbstractC21631d
    /* renamed from: d */
    public final void mo73272d() {
        bf bfVar = this.f52643i;
        if (bfVar != null) {
            bfVar.mo73377h();
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC21631d
    /* renamed from: a */
    public final void mo73264a(bq bqVar) {
        this.f52640f.lock();
        try {
            if (this.f52638d == null) {
                this.f52638d = new HashSet();
            }
            this.f52638d.add(bqVar);
        } finally {
            this.f52640f.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC21631d
    /* renamed from: b */
    public final void mo73270b(bq bqVar) {
        this.f52640f.lock();
        try {
            Set<bq> set = this.f52638d;
            if (set == null) {
                Log.wtf("GoogleApiClientImpl", "Attempted to remove pending transform when no transforms are registered.", new Exception());
            } else if (!set.remove(bqVar)) {
                Log.wtf("GoogleApiClientImpl", "Failed to remove pending transform - this may lead to memory leaks!", new Exception());
            } else if (!mo73351m()) {
                this.f52643i.mo73378i();
            }
        } finally {
            this.f52640f.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final boolean mo73351m() {
        this.f52640f.lock();
        try {
            Set<bq> set = this.f52638d;
            if (set == null) {
                this.f52640f.unlock();
                return false;
            }
            boolean z = !set.isEmpty();
            this.f52640f.unlock();
            return z;
        } catch (Throwable th) {
            this.f52640f.unlock();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final String mo73352n() {
        StringWriter stringWriter = new StringWriter();
        mo73265a("", (FileDescriptor) null, new PrintWriter(stringWriter), (String[]) null);
        return stringWriter.toString();
    }

    @Override // com.google.android.gms.common.api.AbstractC21631d
    /* renamed from: a */
    public final void mo73265a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("mContext=").println(this.f52645k);
        printWriter.append((CharSequence) str).append("mResuming=").print(this.f52647m);
        printWriter.append(" mWorkQueue.size()=").print(this.f52635a.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.f52639e.f52726b.size());
        bf bfVar = this.f52643i;
        if (bfVar != null) {
            bfVar.mo73368a(str, fileDescriptor, printWriter, strArr);
        }
    }

    /* renamed from: a */
    public static int m78368a(Iterable<C21611a.AbstractC21622f> iterable, boolean z) {
        boolean z2 = false;
        boolean z3 = false;
        for (C21611a.AbstractC21622f fVar : iterable) {
            if (fVar.requiresSignIn()) {
                z2 = true;
            }
            if (fVar.providesSignIn()) {
                z3 = true;
            }
        }
        if (!z2) {
            return 3;
        }
        if (!z3 || !z) {
            return 1;
        }
        return 2;
    }
}
