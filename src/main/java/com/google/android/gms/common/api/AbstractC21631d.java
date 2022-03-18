package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.C21608a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C21611a;
import com.google.android.gms.common.api.internal.AbstractC21674i;
import com.google.android.gms.common.api.internal.C21655b;
import com.google.android.gms.common.api.internal.C21666d;
import com.google.android.gms.common.api.internal.aj;
import com.google.android.gms.common.api.internal.bq;
import com.google.android.gms.common.api.internal.cd;
import com.google.android.gms.common.api.internal.ck;
import com.google.android.gms.common.internal.C21740c;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.signin.AbstractC22071e;
import com.google.android.gms.signin.C22066a;
import com.google.android.gms.signin.C22068b;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.google.android.gms.common.api.d */
public abstract class AbstractC21631d {

    /* renamed from: a */
    private static final Set<AbstractC21631d> f52579a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: com.google.android.gms.common.api.d$b */
    public interface AbstractC21633b {
        void onConnected(Bundle bundle);

        void onConnectionSuspended(int i);
    }

    /* renamed from: com.google.android.gms.common.api.d$c */
    public interface AbstractC21634c {
        void onConnectionFailed(ConnectionResult connectionResult);
    }

    /* renamed from: a */
    public abstract void mo73263a(AbstractC21634c cVar);

    /* renamed from: a */
    public abstract void mo73265a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: b */
    public abstract void mo73269b(AbstractC21634c cVar);

    /* renamed from: e */
    public abstract void mo73273e();

    /* renamed from: f */
    public abstract ConnectionResult mo73274f();

    /* renamed from: g */
    public abstract void mo73275g();

    /* renamed from: h */
    public abstract void mo73276h();

    /* renamed from: i */
    public abstract AbstractC21635e<Status> mo73277i();

    /* renamed from: j */
    public abstract boolean mo73278j();

    /* renamed from: a */
    public static Set<AbstractC21631d> m78282a() {
        Set<AbstractC21631d> set = f52579a;
        synchronized (set) {
        }
        return set;
    }

    /* renamed from: a */
    public <A extends C21611a.AbstractC21613b, R extends AbstractC21641i, T extends C21655b.AbstractC21656a<R, A>> T mo73261a(T t) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public <A extends C21611a.AbstractC21613b, T extends C21655b.AbstractC21656a<? extends AbstractC21641i, A>> T mo73268b(T t) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public Context mo73267b() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public Looper mo73271c() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public boolean mo73266a(AbstractC21674i iVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public void mo73272d() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo73262a(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: com.google.android.gms.common.api.d$a */
    public static final class C21632a {

        /* renamed from: a */
        private Account f52580a;

        /* renamed from: b */
        private final Set<Scope> f52581b = new HashSet();

        /* renamed from: c */
        private final Set<Scope> f52582c = new HashSet();

        /* renamed from: d */
        private int f52583d;

        /* renamed from: e */
        private View f52584e;

        /* renamed from: f */
        private String f52585f;

        /* renamed from: g */
        private String f52586g;

        /* renamed from: h */
        private final Map<C21611a<?>, C21740c.C21742b> f52587h = new ArrayMap();

        /* renamed from: i */
        private boolean f52588i = false;

        /* renamed from: j */
        private final Context f52589j;

        /* renamed from: k */
        private final Map<C21611a<?>, C21611a.AbstractC21615d> f52590k = new ArrayMap();

        /* renamed from: l */
        private C21666d f52591l;

        /* renamed from: m */
        private int f52592m = -1;

        /* renamed from: n */
        private AbstractC21634c f52593n;

        /* renamed from: o */
        private Looper f52594o;

        /* renamed from: p */
        private C21608a f52595p = C21608a.m78228a();

        /* renamed from: q */
        private C21611a.AbstractC21612a<? extends AbstractC22071e, C22066a> f52596q = C22068b.f53678a;

        /* renamed from: r */
        private final ArrayList<AbstractC21633b> f52597r = new ArrayList<>();

        /* renamed from: s */
        private final ArrayList<AbstractC21634c> f52598s = new ArrayList<>();

        /* renamed from: t */
        private boolean f52599t = false;

        public C21632a(Context context) {
            this.f52589j = context;
            this.f52594o = context.getMainLooper();
            this.f52585f = context.getPackageName();
            this.f52586g = context.getClass().getName();
        }

        /* renamed from: a */
        public final C21632a mo73279a(Handler handler) {
            Preconditions.checkNotNull(handler, "Handler must not be null");
            this.f52594o = handler.getLooper();
            return this;
        }

        /* renamed from: a */
        public final C21632a mo73282a(AbstractC21633b bVar) {
            Preconditions.checkNotNull(bVar, "Listener must not be null");
            this.f52597r.add(bVar);
            return this;
        }

        /* renamed from: a */
        public final C21632a mo73283a(AbstractC21634c cVar) {
            Preconditions.checkNotNull(cVar, "Listener must not be null");
            this.f52598s.add(cVar);
            return this;
        }

        /* renamed from: a */
        public final C21632a mo73280a(C21611a<? extends C21611a.AbstractC21615d.AbstractC21619d> aVar) {
            Preconditions.checkNotNull(aVar, "Api must not be null");
            this.f52590k.put(aVar, null);
            List<Scope> a = aVar.mo73220a().mo73020a(null);
            this.f52582c.addAll(a);
            this.f52581b.addAll(a);
            return this;
        }

        /* renamed from: a */
        public final <O extends C21611a.AbstractC21615d.AbstractC21618c> C21632a mo73281a(C21611a<O> aVar, O o) {
            Preconditions.checkNotNull(aVar, "Api must not be null");
            Preconditions.checkNotNull(o, "Null options are not permitted for this Api");
            this.f52590k.put(aVar, o);
            List<Scope> a = aVar.mo73220a().mo73020a(o);
            this.f52582c.addAll(a);
            this.f52581b.addAll(a);
            return this;
        }

        /* renamed from: a */
        public final C21740c mo73284a() {
            C22066a aVar = C22066a.f53669a;
            if (this.f52590k.containsKey(C22068b.f53679b)) {
                aVar = (C22066a) this.f52590k.get(C22068b.f53679b);
            }
            return new C21740c(this.f52580a, this.f52581b, this.f52587h, this.f52583d, this.f52584e, this.f52585f, this.f52586g, aVar, false);
        }

        /* renamed from: b */
        public final AbstractC21631d mo73285b() {
            Preconditions.checkArgument(!this.f52590k.isEmpty(), "must call addApi() to add at least one API");
            C21740c a = mo73284a();
            C21611a<?> aVar = null;
            Map<C21611a<?>, C21740c.C21742b> f = a.mo73692f();
            ArrayMap arrayMap = new ArrayMap();
            ArrayMap arrayMap2 = new ArrayMap();
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (C21611a<?> aVar2 : this.f52590k.keySet()) {
                C21611a.AbstractC21615d dVar = this.f52590k.get(aVar2);
                boolean z2 = f.get(aVar2) != null;
                arrayMap.put(aVar2, Boolean.valueOf(z2));
                ck ckVar = new ck(aVar2, z2);
                arrayList.add(ckVar);
                C21611a.AbstractC21612a<?, ?> b = aVar2.mo73221b();
                C21611a.AbstractC21622f a2 = b.mo72954a(this.f52589j, this.f52594o, a, dVar, ckVar, ckVar);
                arrayMap2.put(aVar2.mo73222c(), a2);
                if (b.mo73226a() == 1) {
                    z = dVar != null;
                }
                if (a2.providesSignIn()) {
                    if (aVar == null) {
                        aVar = aVar2;
                    } else {
                        String d = aVar2.mo73223d();
                        String d2 = aVar.mo73223d();
                        StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 21 + String.valueOf(d2).length());
                        sb.append(d);
                        sb.append(" cannot be used with ");
                        sb.append(d2);
                        throw new IllegalStateException(sb.toString());
                    }
                }
            }
            if (aVar != null) {
                if (!z) {
                    Preconditions.checkState(this.f52580a == null, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", aVar.mo73223d());
                    Preconditions.checkState(this.f52581b.equals(this.f52582c), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", aVar.mo73223d());
                } else {
                    String d3 = aVar.mo73223d();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(d3).length() + 82);
                    sb2.append("With using ");
                    sb2.append(d3);
                    sb2.append(", GamesOptions can only be specified within GoogleSignInOptions.Builder");
                    throw new IllegalStateException(sb2.toString());
                }
            }
            aj ajVar = new aj(this.f52589j, new ReentrantLock(), this.f52594o, a, this.f52595p, this.f52596q, arrayMap, this.f52597r, this.f52598s, arrayMap2, this.f52592m, aj.m78368a((Iterable<C21611a.AbstractC21622f>) arrayMap2.values(), true), arrayList, false);
            synchronized (AbstractC21631d.f52579a) {
                AbstractC21631d.f52579a.add(ajVar);
            }
            if (this.f52592m >= 0) {
                cd.m78614b(this.f52591l).mo73450a(this.f52592m, ajVar, this.f52593n);
            }
            return ajVar;
        }
    }

    /* renamed from: a */
    public void mo73264a(bq bqVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public void mo73270b(bq bqVar) {
        throw new UnsupportedOperationException();
    }
}
