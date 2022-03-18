package com.ss.android.vc.meeting.framework.meeting;

import android.os.Handler;
import android.os.Looper;
import com.ss.android.vc.meeting.framework.manager.interfaces.AbstractC61287d;
import com.ss.android.vc.meeting.framework.manager.interfaces.AbstractC61288e;
import com.ss.android.vc.meeting.framework.statemachine.AbstractC61338d;
import com.ss.android.vc.meeting.framework.statemachine.C61344j;
import com.ss.android.vc.meeting.framework.statemachine.C61355p;
import com.ss.android.vc.meeting.framework.statemachine.StatusNode;
import com.ss.android.vc.meeting.framework.statemachine.SyncQueuePolicy;
import com.ss.android.vc.p3088d.p3090b.C60871a;
import com.ss.android.vc.trace.C63784a;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.framework.meeting.v */
public class C61329v implements AbstractC61302j {

    /* renamed from: a */
    public AbstractC61294b f153663a;

    /* renamed from: b */
    private C61323u f153664b = new C61323u();

    /* renamed from: c */
    private C61355p f153665c;

    /* renamed from: d */
    private AbstractC61302j f153666d;

    /* renamed from: e */
    private volatile int f153667e = 1;

    /* renamed from: f */
    private Handler f153668f = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public void mo212261a() {
        this.f153665c.mo212359e();
    }

    /* renamed from: b */
    public C61330w mo212267b() {
        return this.f153664b.mo212255a();
    }

    /* renamed from: c */
    public synchronized int mo212269c() {
        return this.f153667e;
    }

    /* renamed from: e */
    public List<StatusNode> mo212271e() {
        return this.f153665c.mo212380h();
    }

    /* renamed from: f */
    public StatusNode[] mo212272f() {
        return this.f153665c.mo212381i();
    }

    /* renamed from: g */
    public AbstractC61338d mo212273g() {
        return this.f153665c.mo212345a();
    }

    /* renamed from: d */
    public synchronized boolean mo212270d() {
        boolean z;
        if (this.f153667e == 5) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    public void mo212264a(AbstractC61302j jVar) {
        this.f153666d = jVar;
    }

    /* renamed from: b */
    public void mo212268b(SyncQueuePolicy.SyncAction syncAction) {
        this.f153665c.mo212376b(syncAction);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo212262a(AbstractC61287d dVar) {
        this.f153665c.mo212370a(dVar);
    }

    public C61329v(AbstractC61294b bVar) {
        this.f153663a = bVar;
        C61355p pVar = new C61355p(bVar);
        this.f153665c = pVar;
        pVar.mo212372a(this);
    }

    /* renamed from: a */
    public void mo212263a(AbstractC61288e eVar) {
        this.f153665c.mo212371a(eVar);
    }

    /* renamed from: a */
    public void mo212265a(SyncQueuePolicy.SyncAction syncAction) {
        this.f153665c.mo212373a(syncAction);
    }

    /* renamed from: a */
    public void mo212266a(C61344j jVar) {
        C63784a.m250428a("[VideoChat_SManager_sendMessage]");
        this.f153665c.mo212375a(jVar);
        this.f153664b.mo212256a(jVar);
        C63784a.m250429b("[VideoChat_SManager_sendMessage]");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m238903a(int i, int i2, int i3) {
        this.f153667e = i;
        AbstractC61302j jVar = this.f153666d;
        if (jVar != null) {
            jVar.onTransform(i2, i, i3);
        }
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61302j
    public void onTransform(int i, int i2, int i3) {
        C60871a.m236611b("SmManager@", "onTransform mSmState=" + this.f153667e);
        this.f153668f.post(new Runnable(i2, i, i3) {
            /* class com.ss.android.vc.meeting.framework.meeting.$$Lambda$v$ugPR7cfli4g_z100jxKYDB4zs6Y */
            public final /* synthetic */ int f$1;
            public final /* synthetic */ int f$2;
            public final /* synthetic */ int f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void run() {
                C61329v.this.m238903a(this.f$1, this.f$2, this.f$3);
            }
        });
    }
}
