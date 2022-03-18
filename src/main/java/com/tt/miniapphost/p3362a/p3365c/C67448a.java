package com.tt.miniapphost.p3362a.p3365c;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.AbstractC12887b;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67433a;
import com.tt.miniapphost.p3362a.p3367e.C67460f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.tt.miniapphost.a.c.a */
public class C67448a {

    /* renamed from: a */
    public final boolean f170045a;

    /* renamed from: b */
    private List<C67451b> f170046b;

    /* renamed from: c */
    private List<C67451b> f170047c;

    /* renamed from: d */
    private Context f170048d;

    /* renamed from: e */
    private AbstractC67433a f170049e;

    /* renamed from: f */
    private volatile boolean f170050f;

    /* renamed from: g */
    private AbstractC67453c f170051g;

    /* access modifiers changed from: private */
    /* renamed from: com.tt.miniapphost.a.c.a$a */
    public static class C67450a {

        /* renamed from: a */
        public static C67448a f170052a = new C67448a();
    }

    /* renamed from: c */
    public void mo234184c() {
        this.f170050f = true;
    }

    /* renamed from: a */
    public static C67448a m262353a() {
        return C67450a.f170052a;
    }

    /* renamed from: d */
    public AbstractC67433a mo234185d() {
        return new C67460f(this.f170048d);
    }

    /* renamed from: f */
    public void mo234187f() {
        this.f170047c.clear();
    }

    /* renamed from: g */
    public boolean mo234188g() {
        if (this.f170047c.size() >= 1) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public AbstractC67433a mo234192k() {
        AbstractC67433a aVar = this.f170049e;
        if (aVar != null && aVar.isDestroyed()) {
            this.f170049e = null;
        }
        return this.f170049e;
    }

    private C67448a() {
        this.f170046b = new CopyOnWriteArrayList();
        this.f170047c = new CopyOnWriteArrayList();
        this.f170045a = false;
        this.f170050f = false;
    }

    /* renamed from: b */
    public boolean mo234183b() {
        if (this.f170050f) {
            return true;
        }
        AbstractC67453c cVar = this.f170051g;
        if (cVar != null) {
            return cVar.mo149058a();
        }
        return false;
    }

    /* renamed from: l */
    private AbstractC67433a m262354l() {
        C67460f fVar = new C67460f(this.f170048d);
        AppBrandLogger.m52830i("GadgetAppContextPool", "create new AppContext:" + fVar.toString());
        this.f170046b.add(new C67451b(fVar));
        return fVar;
    }

    /* renamed from: e */
    public List<IAppContext> mo234186e() {
        ArrayList arrayList = new ArrayList();
        for (C67451b bVar : this.f170047c) {
            if (bVar.f170055c) {
                arrayList.add(bVar.f170054b);
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    public AbstractC67433a mo234189h() {
        if (this.f170047c.isEmpty()) {
            return null;
        }
        for (C67451b bVar : this.f170047c) {
            if (bVar.f170055c) {
                this.f170047c.remove(bVar);
                return bVar.f170054b;
            }
        }
        return null;
    }

    /* renamed from: i */
    public synchronized AbstractC67433a mo234190i() {
        if (this.f170046b.isEmpty()) {
            AppBrandLogger.m52830i("GadgetAppContextPool", "allMicroAppContextInfo is empty, need create");
            return m262354l();
        }
        AbstractC67433a aVar = null;
        Iterator<C67451b> it = this.f170046b.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C67451b next = it.next();
            if (TextUtils.isEmpty(next.f170053a)) {
                aVar = next.f170054b;
                break;
            }
        }
        if (aVar == null) {
            AppBrandLogger.m52830i("GadgetAppContextPool", "iMicroAppContext no valid, need create");
            aVar = m262354l();
        } else {
            AppBrandLogger.m52830i("GadgetAppContextPool", "iMicroAppContext valid");
        }
        AppBrandLogger.m52830i("GadgetAppContextPool", "findValidMicroAppContext:" + aVar.toString());
        return aVar;
    }

    /* renamed from: j */
    public boolean mo234191j() {
        if (this.f170046b.isEmpty()) {
            AppBrandLogger.m52829e("GadgetAppContextPool", "allMicroAppContextInfo empty");
            return false;
        }
        for (C67451b bVar : this.f170046b) {
            if (TextUtils.isEmpty(bVar.f170053a)) {
                AppBrandLogger.m52830i("GadgetAppContextPool", "has valid");
                return true;
            }
        }
        AppBrandLogger.m52830i("GadgetAppContextPool", "has not valid");
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.tt.miniapphost.a.c.a$b */
    public static class C67451b {

        /* renamed from: a */
        public String f170053a;

        /* renamed from: b */
        public AbstractC67433a f170054b;

        /* renamed from: c */
        public boolean f170055c;

        /* renamed from: a */
        public void mo234194a(boolean z) {
            this.f170055c = z;
        }

        public C67451b(AbstractC67433a aVar) {
            this.f170054b = aVar;
        }

        /* renamed from: a */
        public void mo234193a(AbstractC12887b bVar) {
            this.f170053a = bVar.mo48643b();
            this.f170054b.mo234157a(bVar);
        }
    }

    /* renamed from: b */
    public void mo234182b(AbstractC67433a aVar) {
        this.f170049e = aVar;
    }

    /* renamed from: a */
    public void mo234180a(AbstractC67453c cVar) {
        this.f170051g = cVar;
    }

    /* renamed from: a */
    public void mo234176a(Context context) {
        this.f170048d = context;
        boolean z = true;
        Object[] objArr = new Object[1];
        StringBuilder sb = new StringBuilder();
        sb.append("context:");
        if (context != null) {
            z = false;
        }
        sb.append(z);
        objArr[0] = sb.toString();
        AppBrandLogger.m52830i("GadgetAppContextPool", objArr);
    }

    /* renamed from: a */
    public void mo234178a(AbstractC67433a aVar) {
        if (aVar == null) {
            AppBrandLogger.m52829e("GadgetAppContextPool", "appContext is null");
            return;
        }
        AppBrandLogger.m52830i("GadgetAppContextPool", "remove appContextKey:" + aVar.mo234166f());
        for (C67451b bVar : this.f170046b) {
            AppBrandLogger.m52830i("GadgetAppContextPool", "info:" + bVar.f170053a);
            if (bVar.f170054b.equals(aVar)) {
                AppBrandLogger.m52828d("GadgetAppContextPool", " remove info:" + bVar.f170053a);
                this.f170046b.remove(bVar);
                return;
            }
        }
    }

    /* renamed from: a */
    public void mo234177a(AbstractC12887b bVar) {
        if (!this.f170046b.isEmpty()) {
            C67451b bVar2 = null;
            String b = bVar.mo48643b();
            boolean z = false;
            for (C67451b bVar3 : this.f170046b) {
                if (TextUtils.isEmpty(bVar3.f170053a)) {
                    bVar2 = bVar3;
                } else if (bVar3.f170053a.equals(b) && !bVar3.f170054b.isDestroying() && !bVar3.f170054b.isDestroyed()) {
                    z = true;
                }
            }
            if (!z && bVar2 != null) {
                AppBrandLogger.m52830i("GadgetAppContextPool", "bind success, appContextKey:" + b);
                bVar2.mo234193a(bVar);
            } else if (bVar2 != null) {
                AppBrandLogger.m52828d("GadgetAppContextPool", " appContextKey = " + b + " bound");
            }
        } else {
            AppBrandLogger.m52829e("GadgetAppContextPool", "allMicroAppContextInfo is empty!");
            throw new IllegalStateException("allMicroAppContextInfo is empty!");
        }
    }

    /* renamed from: b */
    public AbstractC67433a mo234181b(AbstractC12887b bVar) {
        String str;
        if (bVar == null || TextUtils.isEmpty(bVar.mo48643b())) {
            Object[] objArr = new Object[1];
            StringBuilder sb = new StringBuilder();
            sb.append("find by empty appContextKey:");
            if (bVar != null) {
                str = bVar.mo48643b();
            } else {
                str = "null";
            }
            sb.append(str);
            objArr[0] = sb.toString();
            AppBrandLogger.m52830i("GadgetAppContextPool", objArr);
            return mo234190i();
        }
        AbstractC67433a aVar = null;
        String b = bVar.mo48643b();
        Iterator<C67451b> it = this.f170046b.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C67451b next = it.next();
            if (b.equals(next.f170053a) && next.f170054b != null && !next.f170054b.isDestroying() && !next.f170054b.isDestroyed()) {
                AppBrandLogger.m52830i("GadgetAppContextPool", "find by appContextKey:" + b + " success");
                aVar = next.f170054b;
                break;
            }
        }
        if (aVar != null) {
            AppBrandLogger.m52830i("GadgetAppContextPool", "findMicroAppContextByBuilder:" + b + " appContext:" + aVar.toString());
        }
        return aVar;
    }

    /* renamed from: a */
    public void mo234179a(AbstractC67433a aVar, boolean z) {
        C67451b bVar = new C67451b(aVar);
        bVar.mo234194a(z);
        this.f170047c.add(bVar);
    }
}
