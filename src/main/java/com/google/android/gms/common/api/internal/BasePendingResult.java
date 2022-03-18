package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.AbstractC21631d;
import com.google.android.gms.common.api.AbstractC21635e;
import com.google.android.gms.common.api.AbstractC21639g;
import com.google.android.gms.common.api.AbstractC21641i;
import com.google.android.gms.common.api.AbstractC21692j;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.base.HandlerC21909h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public abstract class BasePendingResult<R extends AbstractC21641i> extends AbstractC21635e<R> {

    /* renamed from: c */
    static final ThreadLocal<Boolean> f52602c = new cj();

    /* renamed from: a */
    private final Object f52603a;

    /* renamed from: b */
    private final HandlerC21642a<R> f52604b;

    /* renamed from: d */
    private final WeakReference<AbstractC21631d> f52605d;

    /* renamed from: e */
    private final CountDownLatch f52606e;

    /* renamed from: f */
    private final ArrayList<AbstractC21635e.AbstractC21636a> f52607f;

    /* renamed from: g */
    private AbstractC21692j<? super R> f52608g;

    /* renamed from: h */
    private final AtomicReference<bw> f52609h;

    /* renamed from: i */
    private R f52610i;

    /* renamed from: j */
    private Status f52611j;

    /* renamed from: k */
    private volatile boolean f52612k;

    /* renamed from: l */
    private boolean f52613l;

    /* renamed from: m */
    private boolean f52614m;
    private C21643b mResultGuardian;

    /* renamed from: n */
    private ICancelToken f52615n;

    /* renamed from: o */
    private volatile bq<R> f52616o;

    /* renamed from: p */
    private boolean f52617p;

    /* access modifiers changed from: private */
    /* renamed from: com.google.android.gms.common.api.internal.BasePendingResult$b */
    public final class C21643b {
        private C21643b() {
        }

        /* access modifiers changed from: protected */
        public final void finalize() throws Throwable {
            BasePendingResult.m78324c(BasePendingResult.this.f52610i);
            super.finalize();
        }

        /* synthetic */ C21643b(BasePendingResult basePendingResult, cj cjVar) {
            this();
        }
    }

    BasePendingResult() {
        this.f52603a = new Object();
        this.f52606e = new CountDownLatch(1);
        this.f52607f = new ArrayList<>();
        this.f52609h = new AtomicReference<>();
        this.f52617p = false;
        this.f52604b = new HandlerC21642a<>(Looper.getMainLooper());
        this.f52605d = new WeakReference<>(null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract R mo73103a(Status status);

    @Override // com.google.android.gms.common.api.AbstractC21635e
    /* renamed from: c */
    public final Integer mo73294c() {
        return null;
    }

    /* renamed from: com.google.android.gms.common.api.internal.BasePendingResult$a */
    public static class HandlerC21642a<R extends AbstractC21641i> extends HandlerC21909h {
        public HandlerC21642a() {
            this(Looper.getMainLooper());
        }

        public HandlerC21642a(Looper looper) {
            super(looper);
        }

        /* renamed from: a */
        public final void mo73319a(AbstractC21692j<? super R> jVar, R r) {
            sendMessage(obtainMessage(1, new Pair(jVar, r)));
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: com.google.android.gms.common.api.j */
        /* JADX WARN: Multi-variable type inference failed */
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                Pair pair = (Pair) message.obj;
                AbstractC21692j jVar = (AbstractC21692j) pair.first;
                AbstractC21641i iVar = (AbstractC21641i) pair.second;
                try {
                    jVar.mo73359a(iVar);
                } catch (RuntimeException e) {
                    BasePendingResult.m78324c(iVar);
                    throw e;
                }
            } else if (i != 2) {
                int i2 = message.what;
                StringBuilder sb = new StringBuilder(45);
                sb.append("Don't know how to handle message: ");
                sb.append(i2);
                Log.wtf("BasePendingResult", sb.toString(), new Exception());
            } else {
                ((BasePendingResult) message.obj).mo73315c(Status.RESULT_TIMEOUT);
            }
        }
    }

    protected BasePendingResult(AbstractC21631d dVar) {
        this.f52603a = new Object();
        this.f52606e = new CountDownLatch(1);
        this.f52607f = new ArrayList<>();
        this.f52609h = new AtomicReference<>();
        this.f52617p = false;
        this.f52604b = new HandlerC21642a<>(dVar != null ? dVar.mo73271c() : Looper.getMainLooper());
        this.f52605d = new WeakReference<>(dVar);
    }

    /* renamed from: f */
    public final boolean mo73316f() {
        return this.f52606e.getCount() == 0;
    }

    @Override // com.google.android.gms.common.api.AbstractC21635e
    /* renamed from: a */
    public final R mo73289a(long j, TimeUnit timeUnit) {
        if (j > 0) {
            Preconditions.checkNotMainThread("await must not be called on the UI thread when time is greater than zero.");
        }
        boolean z = true;
        Preconditions.checkState(!this.f52612k, "Result has already been consumed.");
        if (this.f52616o != null) {
            z = false;
        }
        Preconditions.checkState(z, "Cannot await if then() has been called.");
        try {
            if (!this.f52606e.await(j, timeUnit)) {
                mo73315c(Status.RESULT_TIMEOUT);
            }
        } catch (InterruptedException unused) {
            mo73315c(Status.RESULT_INTERRUPTED);
        }
        Preconditions.checkState(mo73316f(), "Result is not ready.");
        return mo73388d();
    }

    @Override // com.google.android.gms.common.api.AbstractC21635e
    /* renamed from: a */
    public final void mo73292a(AbstractC21692j<? super R> jVar) {
        synchronized (this.f52603a) {
            if (jVar == null) {
                this.f52608g = null;
                return;
            }
            boolean z = true;
            Preconditions.checkState(!this.f52612k, "Result has already been consumed.");
            if (this.f52616o != null) {
                z = false;
            }
            Preconditions.checkState(z, "Cannot set callbacks if then() has been called.");
            if (!mo73293b()) {
                if (mo73316f()) {
                    this.f52604b.mo73319a(jVar, mo73388d());
                } else {
                    this.f52608g = jVar;
                }
            }
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC21635e
    /* renamed from: a */
    public final void mo73291a(AbstractC21635e.AbstractC21636a aVar) {
        Preconditions.checkArgument(aVar != null, "Callback cannot be null.");
        synchronized (this.f52603a) {
            if (mo73316f()) {
                aVar.mo73295a(this.f52611j);
            } else {
                this.f52607f.add(aVar);
            }
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC21635e
    /* renamed from: a */
    public void mo73290a() {
        synchronized (this.f52603a) {
            if (!this.f52613l) {
                if (!this.f52612k) {
                    ICancelToken iCancelToken = this.f52615n;
                    if (iCancelToken != null) {
                        try {
                            iCancelToken.cancel();
                        } catch (RemoteException unused) {
                        }
                    }
                    m78324c(this.f52610i);
                    this.f52613l = true;
                    mo73384a(mo73103a(Status.RESULT_CANCELED));
                }
            }
        }
    }

    /* renamed from: g */
    public final boolean mo73317g() {
        boolean b;
        synchronized (this.f52603a) {
            if (this.f52605d.get() == null || !this.f52617p) {
                mo73290a();
            }
            b = mo73293b();
        }
        return b;
    }

    @Override // com.google.android.gms.common.api.AbstractC21635e
    /* renamed from: b */
    public boolean mo73293b() {
        boolean z;
        synchronized (this.f52603a) {
            z = this.f52613l;
        }
        return z;
    }

    /* renamed from: b */
    public final void mo73314b(R r) {
        synchronized (this.f52603a) {
            if (this.f52614m || this.f52613l) {
                m78324c(r);
                return;
            }
            mo73316f();
            boolean z = true;
            Preconditions.checkState(!mo73316f(), "Results have already been set");
            if (this.f52612k) {
                z = false;
            }
            Preconditions.checkState(z, "Result has already been consumed");
            mo73384a(r);
        }
    }

    /* renamed from: c */
    public final void mo73315c(Status status) {
        synchronized (this.f52603a) {
            if (!mo73316f()) {
                mo73314b(mo73103a(status));
                this.f52614m = true;
            }
        }
    }

    /* renamed from: a */
    public final void mo73313a(bw bwVar) {
        this.f52609h.set(bwVar);
    }

    /* renamed from: h */
    public final void mo73318h() {
        this.f52617p = this.f52617p || f52602c.get().booleanValue();
    }

    /* renamed from: d */
    private final R mo73388d() {
        R r;
        synchronized (this.f52603a) {
            Preconditions.checkState(!this.f52612k, "Result has already been consumed.");
            Preconditions.checkState(mo73316f(), "Result is not ready.");
            r = this.f52610i;
            this.f52610i = null;
            this.f52608g = null;
            this.f52612k = true;
        }
        bw andSet = this.f52609h.getAndSet(null);
        if (andSet != null) {
            andSet.mo73408a(this);
        }
        return r;
    }

    /* renamed from: a */
    private final void mo73384a(R r) {
        this.f52610i = r;
        this.f52615n = null;
        this.f52606e.countDown();
        this.f52611j = this.f52610i.getStatus();
        if (this.f52613l) {
            this.f52608g = null;
        } else if (this.f52608g != null) {
            this.f52604b.removeMessages(2);
            this.f52604b.mo73319a(this.f52608g, mo73388d());
        } else if (this.f52610i instanceof AbstractC21639g) {
            this.mResultGuardian = new C21643b(this, null);
        }
        ArrayList<AbstractC21635e.AbstractC21636a> arrayList = this.f52607f;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            AbstractC21635e.AbstractC21636a aVar = arrayList.get(i);
            i++;
            aVar.mo73295a(this.f52611j);
        }
        this.f52607f.clear();
    }

    /* renamed from: c */
    public static void m78324c(AbstractC21641i iVar) {
        if (iVar instanceof AbstractC21639g) {
            try {
                ((AbstractC21639g) iVar).mo73296a();
            } catch (RuntimeException e) {
                String valueOf = String.valueOf(iVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                sb.append("Unable to release ");
                sb.append(valueOf);
                Log.w("BasePendingResult", sb.toString(), e);
            }
        }
    }
}
