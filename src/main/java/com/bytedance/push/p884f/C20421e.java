package com.bytedance.push.p884f;

import com.bytedance.apm.trace.api.AbstractC3082a;
import com.bytedance.apm.trace.api.C3085d;
import com.bytedance.apm.trace.api.TracingMode;
import com.bytedance.push.p884f.p885a.AbstractC20415a;
import com.bytedance.push.utils.C20552c;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.push.f.e */
public final class C20421e implements AbstractC20415a {

    /* renamed from: a */
    public AtomicBoolean f49906a = new AtomicBoolean(false);

    /* renamed from: b */
    public AbstractC3082a f49907b;

    /* renamed from: c */
    private Map<Integer, AbstractC3082a> f49908c = new ConcurrentHashMap();

    /* renamed from: d */
    private C20430i f49909d = new C20430i();

    /* renamed from: e */
    private final C3085d f49910e = new C3085d("ug_push_launch", TracingMode.BATCH, true);

    /* renamed from: f */
    private AbstractC3082a f49911f;

    /* renamed from: g */
    private AbstractC3082a f49912g;

    /* renamed from: h */
    private AbstractC3082a f49913h;

    /* renamed from: e */
    public void mo68863e() {
        this.f49910e.mo12960b();
        this.f49909d.mo68871a();
    }

    @Override // com.bytedance.push.p884f.p885a.AbstractC20415a
    /* renamed from: a */
    public void mo68843a() {
        this.f49910e.mo12958a();
        AbstractC3082a a = this.f49910e.mo12957a("ttpush_init");
        if (a != null) {
            a.mo12948a();
            this.f49913h = a;
            return;
        }
        C20552c.m74849b("error when create init span, tracingContext not start or has end?");
    }

    @Override // com.bytedance.push.p884f.p885a.AbstractC20415a
    /* renamed from: c */
    public void mo68850c() {
        synchronized (this) {
            if (this.f49907b != null && this.f49906a.compareAndSet(false, true)) {
                this.f49907b.mo12949b();
            }
            this.f49909d.mo68871a();
        }
    }

    @Override // com.bytedance.push.p884f.p885a.AbstractC20415a
    /* renamed from: b */
    public void mo68848b() {
        AbstractC3082a aVar;
        this.f49913h.mo12949b();
        AbstractC3082a a = this.f49910e.mo12957a("ttpush_start");
        if (!(a == null || (aVar = this.f49913h) == null)) {
            a.mo12950a(aVar.mo12955c());
            a.mo12948a();
        }
        this.f49907b = a;
        this.f49909d.mo68872a(TimeUnit.MINUTES.toMillis(2), new Runnable() {
            /* class com.bytedance.push.p884f.C20421e.RunnableC204221 */

            public void run() {
                synchronized (this) {
                    if (C20421e.this.f49907b != null && C20421e.this.f49906a.compareAndSet(false, true)) {
                        C20421e.this.f49907b.mo12952a("error", "not call push start method after 2 min");
                        C20421e.this.f49907b.mo12949b();
                        C20421e.this.mo68863e();
                    }
                }
            }
        });
    }

    @Override // com.bytedance.push.p884f.p885a.AbstractC20415a
    /* renamed from: d */
    public void mo68851d() {
        AbstractC3082a a = this.f49910e.mo12957a("ttpush_request_sender");
        if (this.f49907b == null || a == null) {
            C20552c.m74849b("error when create requestSenderSpan, tracingContext not start? or has end? or you haven't call BDPush#getPushService()#init method?");
        } else {
            a.mo12948a();
            a.mo12950a(this.f49907b.mo12955c());
        }
        this.f49911f = a;
    }

    @Override // com.bytedance.push.p884f.p885a.AbstractC20415a
    /* renamed from: a */
    public void mo68844a(final int i) {
        C3085d dVar = this.f49910e;
        AbstractC3082a a = dVar.mo12957a("ttpush_register_sender_for_type_" + i);
        if (a == null) {
            C20552c.m74849b("error when create senderCheckSpan, tracingContext not start? or has end? or you haven't call BDPush#getPushService()#init method?");
            return;
        }
        a.mo12948a();
        AbstractC3082a aVar = this.f49912g;
        if (aVar != null) {
            a.mo12950a(aVar.mo12955c());
        }
        this.f49908c.put(Integer.valueOf(i), a);
        this.f49909d.mo68872a(TimeUnit.MINUTES.toMillis(1), new Runnable() {
            /* class com.bytedance.push.p884f.C20421e.RunnableC204232 */

            public void run() {
                C20421e eVar = C20421e.this;
                int i = i;
                eVar.mo68846a(false, i, 108, "register " + i + " timeout");
            }
        });
    }

    @Override // com.bytedance.push.p884f.p885a.AbstractC20415a
    /* renamed from: b */
    public void mo68849b(String str, boolean z) {
        AbstractC3082a aVar = this.f49912g;
        if (aVar == null) {
            C20552c.m74849b("error internal. mSenderCheckSpan is null");
            return;
        }
        if (!z) {
            aVar.mo12952a("error", "sender = " + str + ", fromServer  = false");
        }
        this.f49912g.mo12949b();
    }

    @Override // com.bytedance.push.p884f.p885a.AbstractC20415a
    /* renamed from: a */
    public void mo68845a(String str, boolean z) {
        AbstractC3082a a = this.f49910e.mo12957a("ttpush_sender_check_valid");
        if (this.f49907b == null || a == null) {
            C20552c.m74849b("error when create senderCheckSpan, tracingContext not start? or has end? or you haven't call BDPush#getPushService()#init method?");
            return;
        }
        a.mo12948a();
        a.mo12954b("sender = " + str + ", fromServer  = " + z);
        AbstractC3082a aVar = this.f49911f;
        if (aVar != null) {
            a.mo12950a(aVar.mo12955c());
        } else {
            a.mo12950a(this.f49907b.mo12955c());
        }
        this.f49912g = a;
    }

    @Override // com.bytedance.push.p884f.p885a.AbstractC20415a
    /* renamed from: a */
    public void mo68847a(boolean z, int i, String str) {
        AbstractC3082a aVar = this.f49911f;
        if (aVar == null) {
            C20552c.m74849b("error internal. mRequestSenderSpan is null");
            return;
        }
        if (!z) {
            aVar.mo12952a("error", "errorCode: " + i + ", errorMsg:" + str);
        }
        this.f49911f.mo12949b();
    }

    @Override // com.bytedance.push.p884f.p885a.AbstractC20415a
    /* renamed from: a */
    public synchronized void mo68846a(boolean z, int i, int i2, String str) {
        AbstractC3082a remove = this.f49908c.remove(Integer.valueOf(i));
        if (remove != null) {
            if (!z) {
                remove.mo12952a("error", "pushType:" + i + ", errorCode: " + i2 + ", errorMsg:" + str);
            }
            remove.mo12949b();
            if (this.f49908c.isEmpty()) {
                mo68863e();
            }
        }
    }
}
