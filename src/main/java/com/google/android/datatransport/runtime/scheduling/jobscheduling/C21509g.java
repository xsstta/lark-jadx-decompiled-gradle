package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.datatransport.runtime.AbstractC21439l;
import com.google.android.datatransport.runtime.backends.AbstractC21412e;
import com.google.android.datatransport.runtime.backends.AbstractC21414g;
import com.google.android.datatransport.runtime.backends.AbstractC21422m;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import com.google.android.datatransport.runtime.p971a.C21399a;
import com.google.android.datatransport.runtime.scheduling.p974a.AbstractC21461c;
import com.google.android.datatransport.runtime.scheduling.p974a.AbstractC21467h;
import com.google.android.datatransport.runtime.synchronization.AbstractC21521a;
import com.google.android.datatransport.runtime.time.AbstractC21523a;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import javax.inject.Inject;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.g */
public class C21509g {

    /* renamed from: a */
    private final Context f52171a;

    /* renamed from: b */
    private final AbstractC21412e f52172b;

    /* renamed from: c */
    private final AbstractC21461c f52173c;

    /* renamed from: d */
    private final AbstractC21520r f52174d;

    /* renamed from: e */
    private final Executor f52175e;

    /* renamed from: f */
    private final AbstractC21521a f52176f;

    /* renamed from: g */
    private final AbstractC21523a f52177g;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo72776a() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f52171a.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo72774a(AbstractC21439l lVar, int i) {
        BackendResponse backendResponse;
        AbstractC21422m a = this.f52172b.mo72656a(lVar.mo72661a());
        Iterable<AbstractC21467h> iterable = (Iterable) this.f52176f.mo72737a(C21511i.m77805a(this, lVar));
        if (iterable.iterator().hasNext()) {
            if (a == null) {
                C21399a.m77445a("Uploader", "Unknown backend for %s, deleting event batch for it...", lVar);
                backendResponse = BackendResponse.m77465d();
            } else {
                ArrayList arrayList = new ArrayList();
                for (AbstractC21467h hVar : iterable) {
                    arrayList.add(hVar.mo72722c());
                }
                backendResponse = a.mo72596a(AbstractC21414g.m77480c().mo72643a(arrayList).mo72644a(lVar.mo72662b()).mo72645a());
            }
            this.f52176f.mo72737a(C21512j.m77807a(this, backendResponse, iterable, lVar, i));
        }
    }

    /* renamed from: a */
    public void mo72775a(AbstractC21439l lVar, int i, Runnable runnable) {
        this.f52175e.execute(RunnableC21510h.m77804a(this, lVar, i, runnable));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:6|7) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002f, code lost:
        r5.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0022, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        r2.f52174d.mo72763a(r3, r4 + 1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0024 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void m77800a(com.google.android.datatransport.runtime.scheduling.jobscheduling.C21509g r2, com.google.android.datatransport.runtime.AbstractC21439l r3, int r4, java.lang.Runnable r5) {
        /*
            com.google.android.datatransport.runtime.synchronization.a r0 = r2.f52176f     // Catch:{ SynchronizationException -> 0x0024 }
            com.google.android.datatransport.runtime.scheduling.a.c r1 = r2.f52173c     // Catch:{ SynchronizationException -> 0x0024 }
            r1.getClass()     // Catch:{ SynchronizationException -> 0x0024 }
            com.google.android.datatransport.runtime.synchronization.a$a r1 = com.google.android.datatransport.runtime.scheduling.jobscheduling.C21513k.m77809a(r1)     // Catch:{ SynchronizationException -> 0x0024 }
            r0.mo72737a(r1)     // Catch:{ SynchronizationException -> 0x0024 }
            boolean r0 = r2.mo72776a()     // Catch:{ SynchronizationException -> 0x0024 }
            if (r0 != 0) goto L_0x001e
            com.google.android.datatransport.runtime.synchronization.a r0 = r2.f52176f     // Catch:{ SynchronizationException -> 0x0024 }
            com.google.android.datatransport.runtime.synchronization.a$a r1 = com.google.android.datatransport.runtime.scheduling.jobscheduling.C21514l.m77811a(r2, r3, r4)     // Catch:{ SynchronizationException -> 0x0024 }
            r0.mo72737a(r1)     // Catch:{ SynchronizationException -> 0x0024 }
            goto L_0x002b
        L_0x001e:
            r2.mo72774a(r3, r4)     // Catch:{ SynchronizationException -> 0x0024 }
            goto L_0x002b
        L_0x0022:
            r2 = move-exception
            goto L_0x002f
        L_0x0024:
            com.google.android.datatransport.runtime.scheduling.jobscheduling.r r2 = r2.f52174d     // Catch:{ all -> 0x0022 }
            int r4 = r4 + 1
            r2.mo72763a(r3, r4)     // Catch:{ all -> 0x0022 }
        L_0x002b:
            r5.run()
            return
        L_0x002f:
            r5.run()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.datatransport.runtime.scheduling.jobscheduling.C21509g.m77800a(com.google.android.datatransport.runtime.scheduling.jobscheduling.g, com.google.android.datatransport.runtime.l, int, java.lang.Runnable):void");
    }

    /* renamed from: a */
    static /* synthetic */ Object m77798a(C21509g gVar, BackendResponse backendResponse, Iterable iterable, AbstractC21439l lVar, int i) {
        if (backendResponse.mo72635a() == BackendResponse.Status.TRANSIENT_ERROR) {
            gVar.f52173c.mo72730a(iterable);
            gVar.f52174d.mo72763a(lVar, i + 1);
            return null;
        }
        gVar.f52173c.mo72732b(iterable);
        if (backendResponse.mo72635a() == BackendResponse.Status.OK) {
            gVar.f52173c.mo72729a(lVar, gVar.f52177g.mo72782a() + backendResponse.mo72636b());
        }
        if (!gVar.f52173c.mo72733b(lVar)) {
            return null;
        }
        gVar.f52174d.mo72763a(lVar, 1);
        return null;
    }

    @Inject
    public C21509g(Context context, AbstractC21412e eVar, AbstractC21461c cVar, AbstractC21520r rVar, Executor executor, AbstractC21521a aVar, AbstractC21523a aVar2) {
        this.f52171a = context;
        this.f52172b = eVar;
        this.f52173c = cVar;
        this.f52174d = rVar;
        this.f52175e = executor;
        this.f52176f = aVar;
        this.f52177g = aVar2;
    }
}
