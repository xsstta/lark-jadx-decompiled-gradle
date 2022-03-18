package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.api.AbstractC21641i;
import com.google.android.gms.common.api.AbstractC21692j;
import com.google.android.gms.common.api.AbstractC21697o;
import com.google.android.gms.common.api.C21611a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C21655b;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public final class bt {

    /* renamed from: a */
    public static final Status f52724a = new Status(8, "The connection to Google Play services was lost");

    /* renamed from: c */
    private static final BasePendingResult<?>[] f52725c = new BasePendingResult[0];

    /* renamed from: b */
    final Set<BasePendingResult<?>> f52726b = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

    /* renamed from: d */
    private final bw f52727d = new bu(this);

    /* renamed from: e */
    private final Map<C21611a.C21614c<?>, C21611a.AbstractC21622f> f52728e;

    public bt(Map<C21611a.C21614c<?>, C21611a.AbstractC21622f> map) {
        this.f52728e = map;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo73406a(BasePendingResult<? extends AbstractC21641i> basePendingResult) {
        this.f52726b.add(basePendingResult);
        basePendingResult.mo73313a(this.f52727d);
    }

    /* renamed from: a */
    public final void mo73405a() {
        BasePendingResult[] basePendingResultArr = (BasePendingResult[]) this.f52726b.toArray(f52725c);
        for (BasePendingResult basePendingResult : basePendingResultArr) {
            AbstractC21697o oVar = null;
            basePendingResult.mo73313a((bw) null);
            if (basePendingResult.mo73294c() != null) {
                basePendingResult.mo73292a((AbstractC21692j) null);
                IBinder serviceBrokerBinder = this.f52728e.get(((C21655b.AbstractC21656a) basePendingResult).mo73388d()).getServiceBrokerBinder();
                if (basePendingResult.mo73316f()) {
                    basePendingResult.mo73313a(new bv(basePendingResult, null, serviceBrokerBinder, null));
                } else if (serviceBrokerBinder == null || !serviceBrokerBinder.isBinderAlive()) {
                    basePendingResult.mo73313a((bw) null);
                    basePendingResult.mo73290a();
                    oVar.mo73528a(basePendingResult.mo73294c().intValue());
                } else {
                    bv bvVar = new bv(basePendingResult, null, serviceBrokerBinder, null);
                    basePendingResult.mo73313a(bvVar);
                    try {
                        serviceBrokerBinder.linkToDeath(bvVar, 0);
                    } catch (RemoteException unused) {
                        basePendingResult.mo73290a();
                        oVar.mo73528a(basePendingResult.mo73294c().intValue());
                    }
                }
                this.f52726b.remove(basePendingResult);
            } else if (basePendingResult.mo73317g()) {
                this.f52726b.remove(basePendingResult);
            }
        }
    }

    /* renamed from: b */
    public final void mo73407b() {
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.f52726b.toArray(f52725c)) {
            basePendingResult.mo73315c(f52724a);
        }
    }
}
