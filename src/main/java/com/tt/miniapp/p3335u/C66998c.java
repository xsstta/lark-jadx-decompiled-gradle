package com.tt.miniapp.p3335u;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.permission.C66578b;
import com.tt.miniapphost.data.C67485a;
import com.tt.refer.common.util.C67866g;
import com.tt.refer.p3400a.p3412i.AbstractC67733a;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/* renamed from: com.tt.miniapp.u.c */
public class C66998c {

    /* renamed from: a */
    public SparseBooleanArray f168944a = new SparseBooleanArray();

    /* renamed from: b */
    public SparseArray<Object> f168945b = new SparseArray<>();

    /* renamed from: c */
    public final Object f168946c = new Object();

    /* renamed from: d */
    public IAppContext f168947d;

    /* renamed from: e */
    private SparseArray<List<WeakReference<AbstractC66990a>>> f168948e = new SparseArray<>();

    /* renamed from: a */
    public static C66998c m261128a(IAppContext iAppContext) {
        return C67485a.m262488a(iAppContext).mo234303x();
    }

    /* renamed from: c */
    public boolean mo233048c(int i) {
        AbstractC67733a aVar = (AbstractC67733a) this.f168947d.findServiceByInterface(AbstractC67733a.class);
        if (aVar.mo50179a(i, false) || !aVar.mo50184b(i)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private List<WeakReference<AbstractC66990a>> m261133d(int i) {
        List<WeakReference<AbstractC66990a>> list = this.f168948e.get(i);
        if (list != null) {
            return list;
        }
        synchronized (this) {
            List<WeakReference<AbstractC66990a>> list2 = this.f168948e.get(i);
            if (list2 != null) {
                return list2;
            }
            LinkedList linkedList = new LinkedList();
            this.f168948e.put(i, linkedList);
            return linkedList;
        }
    }

    public C66998c(IAppContext iAppContext) {
        this.f168947d = iAppContext;
        for (Integer num : C66578b.m260106a()) {
            this.f168945b.put(num.intValue(), new Object());
        }
    }

    /* renamed from: b */
    public boolean mo233047b(int i) {
        synchronized (this.f168945b.get(i, this.f168946c)) {
            if (!this.f168944a.get(i, true)) {
                AppBrandLogger.m52828d("SecrecyManager", "notifyStateStop: no value!!!");
                return false;
            }
            this.f168944a.put(i, false);
            m261132b(i, false);
            AppBrandLogger.m52828d("SecrecyManager", "notifyStateStop: " + i);
            return true;
        }
    }

    /* renamed from: a */
    public boolean mo233045a(int i) {
        synchronized (this.f168945b.get(i, this.f168946c)) {
            if (this.f168944a.get(i, false)) {
                AppBrandLogger.m52828d("SecrecyManager", "notifyStateStart: repeated!!!");
                return false;
            }
            this.f168944a.put(i, true);
            m261132b(i, true);
            AppBrandLogger.m52828d("SecrecyManager", "notifyStateStart: " + i);
            return true;
        }
    }

    /* renamed from: a */
    private void m261129a(Runnable runnable, boolean z) {
        if (!z) {
            runnable.run();
        } else {
            AppbrandApplicationImpl.getInst(this.f168947d).getMainHandler().post(runnable);
        }
    }

    /* renamed from: b */
    private void m261132b(int i, boolean z) {
        List<WeakReference<AbstractC66990a>> list = this.f168948e.get(i);
        if (list != null) {
            m261130a(list, i, z);
        }
        List<WeakReference<AbstractC66990a>> list2 = this.f168948e.get(-1);
        if (list2 != null) {
            m261130a(list2, i, z);
        }
    }

    /* renamed from: a */
    private boolean m261131a(WeakReference<AbstractC66990a> weakReference, List<WeakReference<AbstractC66990a>> list) {
        if (weakReference.get() == null) {
            return list.remove(weakReference);
        }
        return false;
    }

    /* renamed from: b */
    public void mo233046b(int i, AbstractC66990a aVar) {
        List<WeakReference<AbstractC66990a>> list;
        Object obj;
        if (!(aVar == null || (list = this.f168948e.get(i)) == null)) {
            for (WeakReference<AbstractC66990a> weakReference : list) {
                AbstractC66990a aVar2 = weakReference.get();
                if (!m261131a(weakReference, list) && aVar2 != null && Objects.equals(aVar2, aVar)) {
                    list.remove(weakReference);
                }
            }
            Object[] objArr = new Object[1];
            StringBuilder sb = new StringBuilder();
            sb.append("unregisterListener: ");
            if (-1 == i) {
                obj = "all";
            } else {
                obj = Integer.valueOf(i);
            }
            sb.append(obj);
            sb.append(" list=");
            sb.append(list.size());
            objArr[0] = sb.toString();
            AppBrandLogger.m52828d("SecrecyManager", objArr);
        }
    }

    /* renamed from: a */
    public void mo233043a(int i, AbstractC66990a aVar) {
        Object obj;
        if (aVar != null) {
            List<WeakReference<AbstractC66990a>> d = m261133d(i);
            boolean z = false;
            for (WeakReference<AbstractC66990a> weakReference : d) {
                AbstractC66990a aVar2 = weakReference.get();
                if (!m261131a(weakReference, d) && Objects.equals(aVar2, aVar)) {
                    z = true;
                }
            }
            if (!z) {
                d.add(new WeakReference<>(aVar));
                Object[] objArr = new Object[1];
                StringBuilder sb = new StringBuilder();
                sb.append("registerListener: ");
                if (-1 != i) {
                    obj = Integer.valueOf(i);
                } else {
                    obj = "all";
                }
                sb.append(obj);
                sb.append(" list=");
                sb.append(d.size());
                objArr[0] = sb.toString();
                AppBrandLogger.m52828d("SecrecyManager", objArr);
            }
        }
    }

    /* renamed from: a */
    public void mo233044a(final int i, boolean z) {
        if (!z) {
            C67866g.m264026a(new Action() {
                /* class com.tt.miniapp.p3335u.C66998c.C669991 */

                /* JADX WARNING: Code restructure failed: missing block: B:10:0x002f, code lost:
                    if (13 != r2) goto L_0x003c;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:11:0x0031, code lost:
                    com.tt.miniapp.audio.C65754b.m257769a(r5.f168950b.f168947d).mo230393c();
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:12:0x003c, code lost:
                    r5.f168950b.mo233047b(r2);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:13:0x0043, code lost:
                    return;
                 */
                @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void act() {
                    /*
                        r5 = this;
                        com.tt.miniapp.u.c r0 = com.tt.miniapp.p3335u.C66998c.this
                        android.util.SparseArray<java.lang.Object> r0 = r0.f168945b
                        int r1 = r2
                        com.tt.miniapp.u.c r2 = com.tt.miniapp.p3335u.C66998c.this
                        java.lang.Object r2 = r2.f168946c
                        java.lang.Object r0 = r0.get(r1, r2)
                        monitor-enter(r0)
                        com.tt.miniapp.u.c r1 = com.tt.miniapp.p3335u.C66998c.this     // Catch:{ all -> 0x0044 }
                        android.util.SparseBooleanArray r1 = r1.f168944a     // Catch:{ all -> 0x0044 }
                        int r2 = r2     // Catch:{ all -> 0x0044 }
                        r3 = 1
                        boolean r1 = r1.get(r2, r3)     // Catch:{ all -> 0x0044 }
                        if (r1 != 0) goto L_0x002a
                        java.lang.String r1 = "SecrecyManager"
                        java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ all -> 0x0044 }
                        r3 = 0
                        java.lang.String r4 = "secrecyPermissionChanged: not using"
                        r2[r3] = r4     // Catch:{ all -> 0x0044 }
                        com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger.m52828d(r1, r2)     // Catch:{ all -> 0x0044 }
                        monitor-exit(r0)     // Catch:{ all -> 0x0044 }
                        return
                    L_0x002a:
                        monitor-exit(r0)     // Catch:{ all -> 0x0044 }
                        r0 = 13
                        int r1 = r2
                        if (r0 != r1) goto L_0x003c
                        com.tt.miniapp.u.c r0 = com.tt.miniapp.p3335u.C66998c.this
                        com.bytedance.ee.lark.infra.sandbox.context.IAppContext r0 = r0.f168947d
                        com.tt.miniapp.audio.b r0 = com.tt.miniapp.audio.C65754b.m257769a(r0)
                        r0.mo230393c()
                    L_0x003c:
                        com.tt.miniapp.u.c r0 = com.tt.miniapp.p3335u.C66998c.this
                        int r1 = r2
                        r0.mo233047b(r1)
                        return
                    L_0x0044:
                        r1 = move-exception
                        monitor-exit(r0)
                        throw r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapp.p3335u.C66998c.C669991.act():void");
                }
            }, Schedulers.shortIO(), false);
        }
    }

    /* renamed from: a */
    private void m261130a(List<WeakReference<AbstractC66990a>> list, final int i, final boolean z) {
        for (WeakReference<AbstractC66990a> weakReference : list) {
            final AbstractC66990a aVar = weakReference.get();
            if (!m261131a(weakReference, list) && aVar != null) {
                m261129a(new Runnable() {
                    /* class com.tt.miniapp.p3335u.C66998c.RunnableC670002 */

                    public void run() {
                        if (z) {
                            aVar.mo233023a(i);
                        } else {
                            aVar.mo233025b(i);
                        }
                    }
                }, aVar.mo233024a());
            }
        }
    }
}
