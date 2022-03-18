package com.bytedance.ee.bridge.p597a;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.ee.bridge.C12577a;
import com.bytedance.ee.bridge.connectormodule.AbstractC12607c;
import com.bytedance.ee.bridge.connectormodule.C12603a;
import com.bytedance.ee.log.C13479a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.ee.bridge.a.f */
public class C12586f implements C12577a.AbstractC12579a, AbstractC12607c {

    /* renamed from: a */
    public final AbstractC12585e f33703a;

    /* renamed from: b */
    public final AbstractC12585e f33704b;

    /* renamed from: c */
    private final C12577a f33705c;

    /* renamed from: d */
    private AtomicInteger f33706d = new AtomicInteger(1);

    /* renamed from: e */
    private List<AbstractC12589a> f33707e = new ArrayList();

    /* renamed from: f */
    private C12603a f33708f;

    /* renamed from: g */
    private Handler f33709g = new Handler(Looper.getMainLooper());

    /* renamed from: h */
    private final AbstractC12584d f33710h;

    /* renamed from: com.bytedance.ee.bridge.a.f$a */
    public interface AbstractC12589a<T extends AbstractC12582b> {
        /* renamed from: a */
        void mo40290a(T t);

        /* renamed from: d */
        void mo40297d();

        /* renamed from: e */
        void mo40299e();
    }

    /* renamed from: d */
    public void mo47851d() {
        this.f33705c.mo47821b();
    }

    /* renamed from: e */
    public int mo47852e() {
        return this.f33706d.get();
    }

    /* renamed from: h */
    private List<AbstractC12589a> m52241h() {
        ArrayList arrayList;
        synchronized (this.f33707e) {
            arrayList = new ArrayList(this.f33707e);
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m52245l() {
        if (this.f33706d.get() == 1) {
            this.f33706d.set(2);
            this.f33705c.mo47819a(this);
        }
    }

    /* renamed from: i */
    private void m52242i() {
        for (AbstractC12589a aVar : m52241h()) {
            aVar.mo40299e();
        }
    }

    /* renamed from: j */
    private void m52243j() {
        for (AbstractC12589a aVar : m52241h()) {
            aVar.mo40297d();
        }
    }

    /* renamed from: b */
    public void mo47846b() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            m52245l();
        } else {
            this.f33709g.post(new Runnable() {
                /* class com.bytedance.ee.bridge.p597a.$$Lambda$f$F4w4igDKJMgXdXfuSNOB5fpbc */

                public final void run() {
                    C12586f.this.m52245l();
                }
            });
        }
    }

    /* renamed from: c */
    public void mo47849c() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            m52244k();
        } else {
            this.f33709g.post(new Runnable() {
                /* class com.bytedance.ee.bridge.p597a.$$Lambda$f$rFkZKr_wAzwe7sTF9FQIsxUN9T4 */

                public final void run() {
                    C12586f.this.m52244k();
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m52244k() {
        this.f33705c.mo47822c();
        if (this.f33706d.get() == 3) {
            this.f33705c.mo47817a().mo47891b(this);
            m52242i();
        }
        this.f33710h.mo47839a();
        this.f33706d.set(1);
    }

    @Override // com.bytedance.ee.bridge.C12577a.AbstractC12579a
    /* renamed from: a */
    public void mo47824a() {
        C12603a aVar;
        C12603a a = this.f33705c.mo47817a();
        if (this.f33706d.get() == 2 || ((aVar = this.f33708f) != null && !aVar.equals(a))) {
            this.f33708f = a;
            this.f33706d.set(3);
            this.f33705c.mo47817a().mo47889a(this);
            m52243j();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo47841a(Activity activity) {
        this.f33705c.mo47818a(activity);
    }

    /* renamed from: a */
    public void mo47844a(String str) {
        this.f33705c.mo47820a(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo47847b(AbstractC12589a aVar) {
        synchronized (this.f33707e) {
            this.f33707e.remove(aVar);
        }
    }

    /* renamed from: a */
    public void mo47842a(AbstractC12582b bVar) {
        for (AbstractC12589a aVar : m52241h()) {
            aVar.mo40290a(bVar);
        }
    }

    @Override // com.bytedance.ee.bridge.connectormodule.AbstractC12607c
    /* renamed from: b */
    public void mo47848b(final String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f33710h.mo47840a(new Runnable() {
                /* class com.bytedance.ee.bridge.p597a.C12586f.RunnableC125871 */

                public void run() {
                    AbstractC12582b b = C12586f.this.f33703a.mo40275b();
                    b.mo40272a(str);
                    if (b != null) {
                        C12586f.this.mo47842a(b);
                        C13479a.m54772d("RNBridge->JSBridgeConnector", "responseFromJs responseId: " + b.mo40271a());
                        return;
                    }
                    C13479a.m54764b("RNBridge->JSBridgeConnector", "responseFromJs response is null ");
                }
            });
        }
    }

    @Override // com.bytedance.ee.bridge.connectormodule.AbstractC12607c
    /* renamed from: c */
    public void mo47850c(final String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f33710h.mo47840a(new Runnable() {
                /* class com.bytedance.ee.bridge.p597a.C12586f.RunnableC125882 */

                public void run() {
                    AbstractC12582b b = C12586f.this.f33704b.mo40275b();
                    b.mo40272a(str);
                    if (b != null) {
                        C12586f.this.mo47842a(b);
                        C13479a.m54772d("RNBridge->JSBridgeConnector", "responseFromDocs responseId: " + b.mo40271a());
                        return;
                    }
                    C13479a.m54764b("RNBridge->JSBridgeConnector", "responseFromDocs response is null ");
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo47843a(AbstractC12589a aVar) {
        synchronized (this.f33707e) {
            if (aVar != null) {
                if (!this.f33707e.contains(aVar)) {
                    this.f33707e.add(aVar);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo47845a(String str, String str2) {
        if ("requestFromNative".equals(str)) {
            this.f33705c.mo47817a().mo47893c(str2);
        } else if ("requestFromDocs".equals(str)) {
            this.f33705c.mo47817a().mo47894d(str2);
        }
    }

    C12586f(C12577a aVar, AbstractC12584d dVar, AbstractC12585e eVar, AbstractC12585e eVar2) {
        this.f33705c = aVar;
        this.f33710h = dVar;
        this.f33703a = eVar;
        this.f33704b = eVar2;
    }
}
