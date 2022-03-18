package com.bytedance.ee.bridge.p597a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.ee.bridge.p597a.C12586f;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bridge.a.g */
public class C12590g implements Handler.Callback, AbstractC12583c, C12586f.AbstractC12589a {

    /* renamed from: a */
    public C12593i f33715a;

    /* renamed from: b */
    public AbstractC12581a f33716b;

    /* renamed from: c */
    public AbstractC12592h f33717c;

    /* renamed from: d */
    public Handler f33718d = new Handler(Looper.getMainLooper(), this);

    /* renamed from: e */
    private AbstractC12582b f33719e;

    /* renamed from: c */
    private void m52263c() {
        if (m52267i()) {
            this.f33715a.mo47866d().mo47846b();
        }
    }

    /* renamed from: f */
    private void m52264f() {
        this.f33715a.mo47865c().mo47840a(new Runnable() {
            /* class com.bytedance.ee.bridge.p597a.C12590g.RunnableC125911 */

            public void run() {
                C12590g.this.f33715a.mo47866d().mo47845a(C12590g.this.f33716b.mo40268a(), C12590g.this.f33716b.mo40278c());
                if (C12590g.this.f33717c != null) {
                    C12590g.this.f33718d.sendEmptyMessageDelayed(2, C12590g.this.mo47855b());
                }
                C13479a.m54772d("RNBridge->JSCall", "hashCode: " + hashCode() + "->sendJSMessage->requestId: " + C12590g.this.f33716b.mo40270b());
            }
        });
    }

    /* renamed from: i */
    private boolean m52267i() {
        if (this.f33715a.mo47866d().mo47852e() == 1) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bridge.p597a.AbstractC12583c
    /* renamed from: a */
    public void mo47837a() {
        if (m52266h()) {
            m52264f();
        }
    }

    /* renamed from: g */
    private long m52265g() {
        if (this.f33716b.mo47835d() != -1) {
            return this.f33716b.mo47835d();
        }
        return this.f33715a.mo47867e();
    }

    /* renamed from: h */
    private boolean m52266h() {
        if (this.f33715a.mo47866d().mo47852e() == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    private void m52268j() {
        C13479a.m54764b("RNBridge->JSCall", "hashCode: " + hashCode() + "->startCall");
        this.f33718d.sendEmptyMessage(3);
        this.f33715a.mo47866d().mo47843a(this);
    }

    /* renamed from: k */
    private void m52269k() {
        this.f33718d.removeMessages(2);
        this.f33718d.removeMessages(1);
        this.f33718d.removeMessages(4);
        this.f33718d.removeMessages(3);
        this.f33715a.mo47866d().mo47847b(this);
    }

    /* renamed from: b */
    public long mo47855b() {
        if (this.f33716b.mo47836e() != -1) {
            return this.f33716b.mo47836e();
        }
        return this.f33715a.mo47868f();
    }

    @Override // com.bytedance.ee.bridge.p597a.C12586f.AbstractC12589a
    /* renamed from: d */
    public void mo40297d() {
        C13479a.m54764b("RNBridge->JSCall", "hashCode: " + hashCode() + "->connected");
        m52264f();
    }

    @Override // com.bytedance.ee.bridge.p597a.C12586f.AbstractC12589a
    /* renamed from: e */
    public void mo40299e() {
        C13479a.m54764b("RNBridge->JSCall", "hashCode: " + hashCode() + "->disconnect");
        m52269k();
        AbstractC12592h hVar = this.f33717c;
        if (hVar != null) {
            hVar.mo40303a("NB202", C12597k.m52300a("NB202"));
        }
    }

    @Override // com.bytedance.ee.bridge.p597a.C12586f.AbstractC12589a
    /* renamed from: a */
    public void mo40290a(AbstractC12582b bVar) {
        m52262b(bVar);
    }

    @Override // com.bytedance.ee.bridge.p597a.AbstractC12583c
    /* renamed from: a */
    public void mo47838a(AbstractC12592h hVar) {
        this.f33717c = hVar;
        m52268j();
    }

    /* renamed from: b */
    private void m52262b(AbstractC12582b bVar) {
        if (this.f33716b.mo40270b().equals(bVar.mo40271a())) {
            this.f33719e = bVar;
            this.f33718d.sendEmptyMessage(4);
        }
    }

    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            if (i == 2) {
                m52269k();
                AbstractC12592h hVar = this.f33717c;
                if (hVar == null) {
                    return false;
                }
                hVar.mo40303a("NB201", C12597k.m52300a("NB201"));
                return false;
            } else if (i != 3) {
                if (i != 4) {
                    return false;
                }
                m52269k();
                if (this.f33717c == null) {
                    return false;
                }
                C13479a.m54772d("RNBridge->JSCall", "hashCode: " + hashCode() + "->received bridge data");
                this.f33717c.mo40302a(this.f33719e);
                return false;
            } else if (m52266h()) {
                m52264f();
                return false;
            } else {
                C13479a.m54772d("RNBridge->JSCall", "hashCode: " + hashCode() + "->waitting connected");
                this.f33718d.sendEmptyMessageDelayed(1, m52265g());
                return false;
            }
        } else if (m52266h()) {
            return false;
        } else {
            m52269k();
            AbstractC12592h hVar2 = this.f33717c;
            if (hVar2 == null) {
                return false;
            }
            hVar2.mo40303a("NB200", C12597k.m52300a("NB200"));
            return false;
        }
    }

    C12590g(C12593i iVar, AbstractC12581a aVar) {
        this.f33715a = iVar;
        this.f33716b = aVar;
        m52263c();
    }
}
