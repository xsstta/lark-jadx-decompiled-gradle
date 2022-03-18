package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import androidx.collection.ArrayMap;
import androidx.collection.C0513a;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.google.android.gms.common.C21608a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.AbstractC21631d;
import com.google.android.gms.common.api.AbstractC21641i;
import com.google.android.gms.common.api.C21611a;
import com.google.android.gms.common.api.C21628c;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.api.internal.C21655b;
import com.google.android.gms.common.api.internal.C21668f;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.C21751j;
import com.google.android.gms.common.internal.C21756m;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.base.HandlerC21909h;
import com.google.android.gms.signin.AbstractC22071e;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.huawei.hms.android.HwBuildEx;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.common.api.internal.c */
public class C21661c implements Handler.Callback {

    /* renamed from: a */
    public static final Status f52737a = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* renamed from: b */
    private static final Status f52738b = new Status(4, "The user must be signed in to make this API call.");

    /* renamed from: f */
    private static final Object f52739f = new Object();

    /* renamed from: g */
    private static C21661c f52740g;

    /* renamed from: c */
    private long f52741c = 5000;

    /* renamed from: d */
    private long f52742d = 120000;

    /* renamed from: e */
    private long f52743e = 10000;

    /* renamed from: h */
    private final Context f52744h;

    /* renamed from: i */
    private final C21608a f52745i;

    /* renamed from: j */
    private final C21751j f52746j;

    /* renamed from: k */
    private final AtomicInteger f52747k = new AtomicInteger(1);

    /* renamed from: l */
    private final AtomicInteger f52748l = new AtomicInteger(0);

    /* renamed from: m */
    private final Map<cc<?>, C21662a<?>> f52749m = new ConcurrentHashMap(5, 0.75f, 1);

    /* renamed from: n */
    private C21684s f52750n = null;

    /* renamed from: o */
    private final Set<cc<?>> f52751o = new C0513a();

    /* renamed from: p */
    private final Set<cc<?>> f52752p = new C0513a();

    /* renamed from: q */
    private final Handler f52753q;

    /* renamed from: a */
    public static HandlerThread m78521a(String str, int i) {
        return C20341a.m74147a() ? C20339a.m74145a(str, i, C20341a.f49621b) : new HandlerThread(str, i);
    }

    /* renamed from: a */
    public static C21661c m78523a(Context context) {
        C21661c cVar;
        synchronized (f52739f) {
            if (f52740g == null) {
                HandlerThread a = m78521a("GoogleApiHandler", 9);
                a.start();
                f52740g = new C21661c(context.getApplicationContext(), a.getLooper(), C21608a.m78228a());
            }
            cVar = f52740g;
        }
        return cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.google.android.gms.common.api.internal.c$b */
    public static class C21663b {

        /* renamed from: a */
        private final cc<?> f52767a;

        /* renamed from: b */
        private final Feature f52768b;

        private C21663b(cc<?> ccVar, Feature feature) {
            this.f52767a = ccVar;
            this.f52768b = feature;
        }

        public final boolean equals(Object obj) {
            if (obj != null && (obj instanceof C21663b)) {
                C21663b bVar = (C21663b) obj;
                if (!Objects.equal(this.f52767a, bVar.f52767a) || !Objects.equal(this.f52768b, bVar.f52768b)) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hashCode(this.f52767a, this.f52768b);
        }

        public final String toString() {
            return Objects.toStringHelper(this).add("key", this.f52767a).add("feature", this.f52768b).toString();
        }

        /* synthetic */ C21663b(cc ccVar, Feature feature, aw awVar) {
            this(ccVar, feature);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.google.android.gms.common.api.internal.c$c */
    public class C21664c implements bo, BaseGmsClient.AbstractC21720a {

        /* renamed from: b */
        private final C21611a.AbstractC21622f f52770b;

        /* renamed from: c */
        private final cc<?> f52771c;

        /* renamed from: d */
        private IAccountAccessor f52772d;

        /* renamed from: e */
        private Set<Scope> f52773e;

        /* renamed from: f */
        private boolean f52774f;

        public C21664c(C21611a.AbstractC21622f fVar, cc<?> ccVar) {
            this.f52770b = fVar;
            this.f52771c = ccVar;
        }

        @Override // com.google.android.gms.common.internal.BaseGmsClient.AbstractC21720a
        /* renamed from: a */
        public final void mo73335a(ConnectionResult connectionResult) {
            C21661c.this.f52753q.post(new bc(this, connectionResult));
        }

        @Override // com.google.android.gms.common.api.internal.bo
        /* renamed from: b */
        public final void mo73399b(ConnectionResult connectionResult) {
            ((C21662a) C21661c.this.f52749m.get(this.f52771c)).mo73427a(connectionResult);
        }

        @Override // com.google.android.gms.common.api.internal.bo
        /* renamed from: a */
        public final void mo73398a(IAccountAccessor iAccountAccessor, Set<Scope> set) {
            if (iAccountAccessor == null || set == null) {
                Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                mo73399b(new ConnectionResult(4));
                return;
            }
            this.f52772d = iAccountAccessor;
            this.f52773e = set;
            m78591a();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m78591a() {
            IAccountAccessor iAccountAccessor;
            if (this.f52774f && (iAccountAccessor = this.f52772d) != null) {
                this.f52770b.getRemoteService(iAccountAccessor, this.f52773e);
            }
        }
    }

    /* renamed from: a */
    public static C21661c m78522a() {
        C21661c cVar;
        synchronized (f52739f) {
            Preconditions.checkNotNull(f52740g, "Must guarantee manager is non-null before using getInstance");
            cVar = f52740g;
        }
        return cVar;
    }

    /* renamed from: b */
    public static void m78525b() {
        synchronized (f52739f) {
            C21661c cVar = f52740g;
            if (cVar != null) {
                cVar.f52748l.incrementAndGet();
                Handler handler = cVar.f52753q;
                handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
            }
        }
    }

    /* renamed from: com.google.android.gms.common.api.internal.c$a */
    public class C21662a<O extends C21611a.AbstractC21615d> implements AbstractC21631d.AbstractC21633b, AbstractC21631d.AbstractC21634c, cl {

        /* renamed from: b */
        private final Queue<an> f52755b = new LinkedList();

        /* renamed from: c */
        private final C21611a.AbstractC21622f f52756c;

        /* renamed from: d */
        private final C21611a.AbstractC21613b f52757d;

        /* renamed from: e */
        private final cc<O> f52758e;

        /* renamed from: f */
        private final C21681p f52759f;

        /* renamed from: g */
        private final Set<ce> f52760g = new HashSet();

        /* renamed from: h */
        private final Map<C21668f.C21669a<?>, bi> f52761h = new HashMap();

        /* renamed from: i */
        private final int f52762i;

        /* renamed from: j */
        private final zace f52763j;

        /* renamed from: k */
        private boolean f52764k;

        /* renamed from: l */
        private final List<C21663b> f52765l = new ArrayList();

        /* renamed from: m */
        private ConnectionResult f52766m = null;

        public C21662a(C21628c<O> cVar) {
            C21611a.AbstractC21622f a = cVar.mo73243a(C21661c.this.f52753q.getLooper(), this);
            this.f52756c = a;
            if (a instanceof C21756m) {
                this.f52757d = ((C21756m) a).mo73729a();
            } else {
                this.f52757d = a;
            }
            this.f52758e = cVar.mo73252e();
            this.f52759f = new C21681p();
            this.f52762i = cVar.mo73253f();
            if (a.requiresSignIn()) {
                this.f52763j = cVar.mo73245a(C21661c.this.f52744h, C21661c.this.f52753q);
            } else {
                this.f52763j = null;
            }
        }

        @Override // com.google.android.gms.common.api.AbstractC21631d.AbstractC21633b
        public final void onConnected(Bundle bundle) {
            if (Looper.myLooper() == C21661c.this.f52753q.getLooper()) {
                m78565n();
            } else {
                C21661c.this.f52753q.post(new ax(this));
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: n */
        public final void m78565n() {
            mo73433d();
            m78563c(ConnectionResult.RESULT_SUCCESS);
            m78568q();
            Iterator<bi> it = this.f52761h.values().iterator();
            while (it.hasNext()) {
                bi next = it.next();
                if (m78551a(next.f52705a.mo73492c()) != null) {
                    it.remove();
                } else {
                    try {
                        next.f52705a.mo73490a(this.f52757d, new TaskCompletionSource<>());
                    } catch (DeadObjectException unused) {
                        onConnectionSuspended(1);
                        this.f52756c.disconnect();
                    } catch (RemoteException unused2) {
                        it.remove();
                    }
                }
            }
            m78567p();
            m78569r();
        }

        @Override // com.google.android.gms.common.api.AbstractC21631d.AbstractC21633b
        public final void onConnectionSuspended(int i) {
            if (Looper.myLooper() == C21661c.this.f52753q.getLooper()) {
                m78566o();
            } else {
                C21661c.this.f52753q.post(new ay(this));
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: o */
        public final void m78566o() {
            mo73433d();
            this.f52764k = true;
            this.f52759f.mo73503c();
            C21661c.this.f52753q.sendMessageDelayed(Message.obtain(C21661c.this.f52753q, 9, this.f52758e), C21661c.this.f52741c);
            C21661c.this.f52753q.sendMessageDelayed(Message.obtain(C21661c.this.f52753q, 11, this.f52758e), C21661c.this.f52742d);
            C21661c.this.f52746j.mo73725a();
        }

        /* renamed from: a */
        public final void mo73427a(ConnectionResult connectionResult) {
            Preconditions.checkHandlerThread(C21661c.this.f52753q);
            this.f52756c.disconnect();
            onConnectionFailed(connectionResult);
        }

        /* renamed from: b */
        private final boolean m78560b(ConnectionResult connectionResult) {
            synchronized (C21661c.f52739f) {
                if (C21661c.this.f52750n == null || !C21661c.this.f52751o.contains(this.f52758e)) {
                    return false;
                }
                C21661c.this.f52750n.mo73456b(connectionResult, this.f52762i);
                return true;
            }
        }

        @Override // com.google.android.gms.common.api.internal.cl
        /* renamed from: a */
        public final void mo73365a(ConnectionResult connectionResult, C21611a<?> aVar, boolean z) {
            if (Looper.myLooper() == C21661c.this.f52753q.getLooper()) {
                onConnectionFailed(connectionResult);
            } else {
                C21661c.this.f52753q.post(new az(this, connectionResult));
            }
        }

        @Override // com.google.android.gms.common.api.AbstractC21631d.AbstractC21634c
        public final void onConnectionFailed(ConnectionResult connectionResult) {
            Preconditions.checkHandlerThread(C21661c.this.f52753q);
            zace zace = this.f52763j;
            if (zace != null) {
                zace.zabs();
            }
            mo73433d();
            C21661c.this.f52746j.mo73725a();
            m78563c(connectionResult);
            if (connectionResult.getErrorCode() == 4) {
                mo73428a(C21661c.f52738b);
            } else if (this.f52755b.isEmpty()) {
                this.f52766m = connectionResult;
            } else if (!m78560b(connectionResult) && !C21661c.this.mo73419a(connectionResult, this.f52762i)) {
                if (connectionResult.getErrorCode() == 18) {
                    this.f52764k = true;
                }
                if (this.f52764k) {
                    C21661c.this.f52753q.sendMessageDelayed(Message.obtain(C21661c.this.f52753q, 9, this.f52758e), C21661c.this.f52741c);
                    return;
                }
                String a = this.f52758e.mo73446a();
                StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 38);
                sb.append("API: ");
                sb.append(a);
                sb.append(" is not available on this device.");
                mo73428a(new Status(17, sb.toString()));
            }
        }

        /* renamed from: p */
        private final void m78567p() {
            ArrayList arrayList = new ArrayList(this.f52755b);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                an anVar = (an) obj;
                if (!this.f52756c.isConnected()) {
                    return;
                }
                if (m78561b(anVar)) {
                    this.f52755b.remove(anVar);
                }
            }
        }

        /* renamed from: a */
        public final void mo73429a(an anVar) {
            Preconditions.checkHandlerThread(C21661c.this.f52753q);
            if (!this.f52756c.isConnected()) {
                this.f52755b.add(anVar);
                ConnectionResult connectionResult = this.f52766m;
                if (connectionResult == null || !connectionResult.hasResolution()) {
                    mo73438i();
                } else {
                    onConnectionFailed(this.f52766m);
                }
            } else if (m78561b(anVar)) {
                m78569r();
            } else {
                this.f52755b.add(anVar);
            }
        }

        /* renamed from: a */
        public final void mo73426a() {
            Preconditions.checkHandlerThread(C21661c.this.f52753q);
            mo73428a(C21661c.f52737a);
            this.f52759f.mo73502b();
            for (C21668f.C21669a aVar : (C21668f.C21669a[]) this.f52761h.keySet().toArray(new C21668f.C21669a[this.f52761h.size()])) {
                mo73429a(new cb(aVar, new TaskCompletionSource()));
            }
            m78563c(new ConnectionResult(4));
            if (this.f52756c.isConnected()) {
                this.f52756c.onUserSignOut(new ba(this));
            }
        }

        /* renamed from: b */
        public final C21611a.AbstractC21622f mo73431b() {
            return this.f52756c;
        }

        /* renamed from: c */
        public final Map<C21668f.C21669a<?>, bi> mo73432c() {
            return this.f52761h;
        }

        /* renamed from: d */
        public final void mo73433d() {
            Preconditions.checkHandlerThread(C21661c.this.f52753q);
            this.f52766m = null;
        }

        /* renamed from: e */
        public final ConnectionResult mo73434e() {
            Preconditions.checkHandlerThread(C21661c.this.f52753q);
            return this.f52766m;
        }

        /* renamed from: b */
        private final boolean m78561b(an anVar) {
            if (!(anVar instanceof bj)) {
                m78564c(anVar);
                return true;
            }
            bj bjVar = (bj) anVar;
            Feature a = m78551a(bjVar.mo73393b((C21662a<?>) this));
            if (a == null) {
                m78564c(anVar);
                return true;
            } else if (bjVar.mo73394c(this)) {
                C21663b bVar = new C21663b(this.f52758e, a, null);
                int indexOf = this.f52765l.indexOf(bVar);
                if (indexOf >= 0) {
                    C21663b bVar2 = this.f52765l.get(indexOf);
                    C21661c.this.f52753q.removeMessages(15, bVar2);
                    C21661c.this.f52753q.sendMessageDelayed(Message.obtain(C21661c.this.f52753q, 15, bVar2), C21661c.this.f52741c);
                    return false;
                }
                this.f52765l.add(bVar);
                C21661c.this.f52753q.sendMessageDelayed(Message.obtain(C21661c.this.f52753q, 15, bVar), C21661c.this.f52741c);
                C21661c.this.f52753q.sendMessageDelayed(Message.obtain(C21661c.this.f52753q, 16, bVar), C21661c.this.f52742d);
                ConnectionResult connectionResult = new ConnectionResult(2, null);
                if (m78560b(connectionResult)) {
                    return false;
                }
                C21661c.this.mo73419a(connectionResult, this.f52762i);
                return false;
            } else {
                bjVar.mo73358a(new UnsupportedApiCallException(a));
                return false;
            }
        }

        /* renamed from: c */
        private final void m78564c(an anVar) {
            anVar.mo73357a(this.f52759f, mo73440k());
            try {
                anVar.mo73356a((C21662a<?>) this);
            } catch (DeadObjectException unused) {
                onConnectionSuspended(1);
                this.f52756c.disconnect();
            }
        }

        /* renamed from: a */
        public final void mo73428a(Status status) {
            Preconditions.checkHandlerThread(C21661c.this.f52753q);
            for (an anVar : this.f52755b) {
                anVar.mo73355a(status);
            }
            this.f52755b.clear();
        }

        /* renamed from: f */
        public final void mo73435f() {
            Preconditions.checkHandlerThread(C21661c.this.f52753q);
            if (this.f52764k) {
                mo73438i();
            }
        }

        /* renamed from: q */
        private final void m78568q() {
            if (this.f52764k) {
                C21661c.this.f52753q.removeMessages(11, this.f52758e);
                C21661c.this.f52753q.removeMessages(9, this.f52758e);
                this.f52764k = false;
            }
        }

        /* renamed from: g */
        public final void mo73436g() {
            Status status;
            Preconditions.checkHandlerThread(C21661c.this.f52753q);
            if (this.f52764k) {
                m78568q();
                if (C21661c.this.f52745i.isGooglePlayServicesAvailable(C21661c.this.f52744h) == 18) {
                    status = new Status(8, "Connection timed out while waiting for Google Play services update to complete.");
                } else {
                    status = new Status(8, "API failed to connect while resuming due to an unknown error.");
                }
                mo73428a(status);
                this.f52756c.disconnect();
            }
        }

        /* renamed from: r */
        private final void m78569r() {
            C21661c.this.f52753q.removeMessages(12, this.f52758e);
            C21661c.this.f52753q.sendMessageDelayed(C21661c.this.f52753q.obtainMessage(12, this.f52758e), C21661c.this.f52743e);
        }

        /* renamed from: h */
        public final boolean mo73437h() {
            return m78556a(true);
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: a */
        private final boolean m78556a(boolean z) {
            Preconditions.checkHandlerThread(C21661c.this.f52753q);
            if (!this.f52756c.isConnected() || this.f52761h.size() != 0) {
                return false;
            }
            if (this.f52759f.mo73501a()) {
                if (z) {
                    m78569r();
                }
                return false;
            }
            this.f52756c.disconnect();
            return true;
        }

        /* renamed from: i */
        public final void mo73438i() {
            Preconditions.checkHandlerThread(C21661c.this.f52753q);
            if (!this.f52756c.isConnected() && !this.f52756c.isConnecting()) {
                int a = C21661c.this.f52746j.mo73724a(C21661c.this.f52744h, this.f52756c);
                if (a != 0) {
                    onConnectionFailed(new ConnectionResult(a, null));
                    return;
                }
                C21664c cVar = new C21664c(this.f52756c, this.f52758e);
                if (this.f52756c.requiresSignIn()) {
                    this.f52763j.zaa(cVar);
                }
                this.f52756c.connect(cVar);
            }
        }

        /* renamed from: a */
        public final void mo73430a(ce ceVar) {
            Preconditions.checkHandlerThread(C21661c.this.f52753q);
            this.f52760g.add(ceVar);
        }

        /* renamed from: c */
        private final void m78563c(ConnectionResult connectionResult) {
            for (ce ceVar : this.f52760g) {
                String str = null;
                if (Objects.equal(connectionResult, ConnectionResult.RESULT_SUCCESS)) {
                    str = this.f52756c.getEndpointPackageName();
                }
                ceVar.mo73454a(this.f52758e, connectionResult, str);
            }
            this.f52760g.clear();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public final boolean mo73439j() {
            return this.f52756c.isConnected();
        }

        /* renamed from: k */
        public final boolean mo73440k() {
            return this.f52756c.requiresSignIn();
        }

        /* renamed from: l */
        public final int mo73441l() {
            return this.f52762i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public final AbstractC22071e mo73442m() {
            zace zace = this.f52763j;
            if (zace == null) {
                return null;
            }
            return zace.zabq();
        }

        /* renamed from: a */
        private final Feature m78551a(Feature[] featureArr) {
            if (!(featureArr == null || featureArr.length == 0)) {
                Feature[] availableFeatures = this.f52756c.getAvailableFeatures();
                if (availableFeatures == null) {
                    availableFeatures = new Feature[0];
                }
                ArrayMap arrayMap = new ArrayMap(availableFeatures.length);
                for (Feature feature : availableFeatures) {
                    arrayMap.put(feature.mo73143a(), Long.valueOf(feature.mo73144b()));
                }
                for (Feature feature2 : featureArr) {
                    if (!arrayMap.containsKey(feature2.mo73143a()) || ((Long) arrayMap.get(feature2.mo73143a())).longValue() < feature2.mo73144b()) {
                        return feature2;
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: a */
        private final void m78554a(C21663b bVar) {
            if (!this.f52765l.contains(bVar) || this.f52764k) {
                return;
            }
            if (!this.f52756c.isConnected()) {
                mo73438i();
            } else {
                m78567p();
            }
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: b */
        private final void m78559b(C21663b bVar) {
            Feature[] b;
            if (this.f52765l.remove(bVar)) {
                C21661c.this.f52753q.removeMessages(15, bVar);
                C21661c.this.f52753q.removeMessages(16, bVar);
                Feature feature = bVar.f52768b;
                ArrayList arrayList = new ArrayList(this.f52755b.size());
                for (an anVar : this.f52755b) {
                    if ((anVar instanceof bj) && (b = ((bj) anVar).mo73393b((C21662a<?>) this)) != null && ArrayUtils.contains(b, feature)) {
                        arrayList.add(anVar);
                    }
                }
                ArrayList arrayList2 = arrayList;
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    an anVar2 = (an) obj;
                    this.f52755b.remove(anVar2);
                    anVar2.mo73358a(new UnsupportedApiCallException(feature));
                }
            }
        }
    }

    private C21661c(Context context, Looper looper, C21608a aVar) {
        this.f52744h = context;
        HandlerC21909h hVar = new HandlerC21909h(looper, this);
        this.f52753q = hVar;
        this.f52745i = aVar;
        this.f52746j = new C21751j(aVar);
        hVar.sendMessage(hVar.obtainMessage(6));
    }

    /* renamed from: c */
    public final int mo73422c() {
        return this.f52747k.getAndIncrement();
    }

    /* renamed from: a */
    public final void mo73415a(C21628c<?> cVar) {
        Handler handler = this.f52753q;
        handler.sendMessage(handler.obtainMessage(7, cVar));
    }

    /* renamed from: b */
    private final void m78526b(C21628c<?> cVar) {
        cc<?> e = cVar.mo73252e();
        C21662a<?> aVar = this.f52749m.get(e);
        if (aVar == null) {
            aVar = new C21662a<>(cVar);
            this.f52749m.put(e, aVar);
        }
        if (aVar.mo73440k()) {
            this.f52752p.add(e);
        }
        aVar.mo73438i();
    }

    /* renamed from: a */
    public final void mo73418a(C21684s sVar) {
        synchronized (f52739f) {
            if (this.f52750n != sVar) {
                this.f52750n = sVar;
                this.f52751o.clear();
            }
            this.f52751o.addAll(sVar.mo73504g());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo73421b(C21684s sVar) {
        synchronized (f52739f) {
            if (this.f52750n == sVar) {
                this.f52750n = null;
                this.f52751o.clear();
            }
        }
    }

    /* renamed from: a */
    public final Task<Map<cc<?>, String>> mo73414a(Iterable<? extends C21628c<?>> iterable) {
        ce ceVar = new ce(iterable);
        Handler handler = this.f52753q;
        handler.sendMessage(handler.obtainMessage(2, ceVar));
        return ceVar.mo73455b();
    }

    /* renamed from: d */
    public final void mo73423d() {
        Handler handler = this.f52753q;
        handler.sendMessage(handler.obtainMessage(3));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo73424e() {
        this.f52748l.incrementAndGet();
        Handler handler = this.f52753q;
        handler.sendMessage(handler.obtainMessage(10));
    }

    /* renamed from: a */
    public final <O extends C21611a.AbstractC21615d> void mo73416a(C21628c<O> cVar, int i, C21655b.AbstractC21656a<? extends AbstractC21641i, C21611a.AbstractC21613b> aVar) {
        C21660by byVar = new C21660by(i, aVar);
        Handler handler = this.f52753q;
        handler.sendMessage(handler.obtainMessage(4, new bh(byVar, this.f52748l.get(), cVar)));
    }

    /* renamed from: a */
    public final <O extends C21611a.AbstractC21615d, ResultT> void mo73417a(C21628c<O> cVar, int i, AbstractC21677l<C21611a.AbstractC21613b, ResultT> lVar, TaskCompletionSource<ResultT> taskCompletionSource, AbstractC21675j jVar) {
        ca caVar = new ca(i, lVar, taskCompletionSource, jVar);
        Handler handler = this.f52753q;
        handler.sendMessage(handler.obtainMessage(4, new bh(caVar, this.f52748l.get(), cVar)));
    }

    /* renamed from: a */
    public final <O extends C21611a.AbstractC21615d> Task<Void> mo73413a(C21628c<O> cVar, AbstractC21673h<C21611a.AbstractC21613b, ?> hVar, AbstractC21679n<C21611a.AbstractC21613b, ?> nVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        bz bzVar = new bz(new bi(hVar, nVar), taskCompletionSource);
        Handler handler = this.f52753q;
        handler.sendMessage(handler.obtainMessage(8, new bh(bzVar, this.f52748l.get(), cVar)));
        return taskCompletionSource.getTask();
    }

    /* renamed from: a */
    public final <O extends C21611a.AbstractC21615d> Task<Boolean> mo73412a(C21628c<O> cVar, C21668f.C21669a<?> aVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        cb cbVar = new cb(aVar, taskCompletionSource);
        Handler handler = this.f52753q;
        handler.sendMessage(handler.obtainMessage(13, new bh(cbVar, this.f52748l.get(), cVar)));
        return taskCompletionSource.getTask();
    }

    public boolean handleMessage(Message message) {
        long j = 300000;
        C21662a<?> aVar = null;
        switch (message.what) {
            case 1:
                if (((Boolean) message.obj).booleanValue()) {
                    j = 10000;
                }
                this.f52743e = j;
                this.f52753q.removeMessages(12);
                for (cc<?> ccVar : this.f52749m.keySet()) {
                    Handler handler = this.f52753q;
                    handler.sendMessageDelayed(handler.obtainMessage(12, ccVar), this.f52743e);
                }
                break;
            case 2:
                ce ceVar = (ce) message.obj;
                Iterator<cc<?>> it = ceVar.mo73453a().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        cc<?> next = it.next();
                        C21662a<?> aVar2 = this.f52749m.get(next);
                        if (aVar2 == null) {
                            ceVar.mo73454a(next, new ConnectionResult(13), null);
                            break;
                        } else if (aVar2.mo73439j()) {
                            ceVar.mo73454a(next, ConnectionResult.RESULT_SUCCESS, aVar2.mo73431b().getEndpointPackageName());
                        } else if (aVar2.mo73434e() != null) {
                            ceVar.mo73454a(next, aVar2.mo73434e(), null);
                        } else {
                            aVar2.mo73430a(ceVar);
                            aVar2.mo73438i();
                        }
                    }
                }
            case 3:
                for (C21662a<?> aVar3 : this.f52749m.values()) {
                    aVar3.mo73433d();
                    aVar3.mo73438i();
                }
                break;
            case 4:
            case 8:
            case 13:
                bh bhVar = (bh) message.obj;
                C21662a<?> aVar4 = this.f52749m.get(bhVar.f52704c.mo73252e());
                if (aVar4 == null) {
                    m78526b(bhVar.f52704c);
                    aVar4 = this.f52749m.get(bhVar.f52704c.mo73252e());
                }
                if (!aVar4.mo73440k() || this.f52748l.get() == bhVar.f52703b) {
                    aVar4.mo73429a(bhVar.f52702a);
                    break;
                } else {
                    bhVar.f52702a.mo73355a(f52737a);
                    aVar4.mo73426a();
                    break;
                }
                break;
            case 5:
                int i = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                Iterator<C21662a<?>> it2 = this.f52749m.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        C21662a<?> next2 = it2.next();
                        if (next2.mo73441l() == i) {
                            aVar = next2;
                        }
                    }
                }
                if (aVar != null) {
                    String errorString = this.f52745i.getErrorString(connectionResult.getErrorCode());
                    String errorMessage = connectionResult.getErrorMessage();
                    StringBuilder sb = new StringBuilder(String.valueOf(errorString).length() + 69 + String.valueOf(errorMessage).length());
                    sb.append("Error resolution was canceled by the user, original error message: ");
                    sb.append(errorString);
                    sb.append(": ");
                    sb.append(errorMessage);
                    aVar.mo73428a(new Status(17, sb.toString()));
                    break;
                } else {
                    StringBuilder sb2 = new StringBuilder(76);
                    sb2.append("Could not find API instance ");
                    sb2.append(i);
                    sb2.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb2.toString(), new Exception());
                    break;
                }
            case 6:
                if (PlatformVersion.isAtLeastIceCreamSandwich() && (this.f52744h.getApplicationContext() instanceof Application)) {
                    BackgroundDetector.initialize((Application) this.f52744h.getApplicationContext());
                    BackgroundDetector.getInstance().addListener(new aw(this));
                    if (!BackgroundDetector.getInstance().readCurrentStateIfPossible(true)) {
                        this.f52743e = 300000;
                        break;
                    }
                }
                break;
            case 7:
                m78526b((C21628c) message.obj);
                break;
            case 9:
                if (this.f52749m.containsKey(message.obj)) {
                    this.f52749m.get(message.obj).mo73435f();
                    break;
                }
                break;
            case 10:
                for (cc<?> ccVar2 : this.f52752p) {
                    this.f52749m.remove(ccVar2).mo73426a();
                }
                this.f52752p.clear();
                break;
            case 11:
                if (this.f52749m.containsKey(message.obj)) {
                    this.f52749m.get(message.obj).mo73436g();
                    break;
                }
                break;
            case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                if (this.f52749m.containsKey(message.obj)) {
                    this.f52749m.get(message.obj).mo73437h();
                    break;
                }
                break;
            case 14:
                C21685t tVar = (C21685t) message.obj;
                cc<?> a = tVar.mo73505a();
                if (!this.f52749m.containsKey(a)) {
                    tVar.mo73506b().setResult(false);
                    break;
                } else {
                    tVar.mo73506b().setResult(Boolean.valueOf(this.f52749m.get(a).m78556a((C21662a) false)));
                    break;
                }
            case 15:
                C21663b bVar = (C21663b) message.obj;
                if (this.f52749m.containsKey(bVar.f52767a)) {
                    this.f52749m.get(bVar.f52767a).m78554a((C21662a) bVar);
                    break;
                }
                break;
            case 16:
                C21663b bVar2 = (C21663b) message.obj;
                if (this.f52749m.containsKey(bVar2.f52767a)) {
                    this.f52749m.get(bVar2.f52767a).m78559b((C21662a) bVar2);
                    break;
                }
                break;
            default:
                int i2 = message.what;
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(i2);
                Log.w("GoogleApiManager", sb3.toString());
                return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final PendingIntent mo73411a(cc<?> ccVar, int i) {
        AbstractC22071e m;
        C21662a<?> aVar = this.f52749m.get(ccVar);
        if (aVar == null || (m = aVar.mo73442m()) == null) {
            return null;
        }
        return PendingIntent.getActivity(this.f52744h, i, m.getSignInIntent(), 134217728);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo73419a(ConnectionResult connectionResult, int i) {
        return this.f52745i.mo73182a(this.f52744h, connectionResult, i);
    }

    /* renamed from: b */
    public final void mo73420b(ConnectionResult connectionResult, int i) {
        if (!mo73419a(connectionResult, i)) {
            Handler handler = this.f52753q;
            handler.sendMessage(handler.obtainMessage(5, i, 0, connectionResult));
        }
    }
}
