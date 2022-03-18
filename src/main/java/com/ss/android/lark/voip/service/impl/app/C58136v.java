package com.ss.android.lark.voip.service.impl.app;

import com.ss.android.lark.voip.service.impl.app.C58134u;
import com.ss.android.lark.voip.service.impl.service.VoiceCall;
import com.ss.android.lark.voip.service.impl.statistics.VoipHitPoint;
import com.ss.android.lark.voip.service.impl.util.VoIPAudioManager;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.dependency.ar;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.lark.voip.service.impl.app.v */
public class C58136v implements C58134u.AbstractC58135a {

    /* renamed from: g */
    private static C58136v f143009g;

    /* renamed from: a */
    private C58134u f143010a;

    /* renamed from: b */
    private int f143011b;

    /* renamed from: c */
    private int f143012c = this.f143011b;

    /* renamed from: d */
    private boolean f143013d;

    /* renamed from: e */
    private VoIpCallModel f143014e;

    /* renamed from: f */
    private List<AbstractC58137a> f143015f = new CopyOnWriteArrayList();

    /* renamed from: com.ss.android.lark.voip.service.impl.app.v$a */
    public interface AbstractC58137a {
        /* renamed from: c */
        void mo196673c();

        /* renamed from: d */
        void mo196674d();

        /* renamed from: e */
        void mo196675e();
    }

    /* renamed from: g */
    public void mo197022g() {
        f143009g = null;
    }

    /* renamed from: d */
    public boolean mo197020d() {
        if (this.f143011b == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public boolean mo197019c() {
        int i = this.f143011b;
        if (i == 1 || i == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public boolean mo197021e() {
        if (!this.f143013d || !mo197020d()) {
            return false;
        }
        return true;
    }

    private C58136v() {
        m225488h();
    }

    /* renamed from: f */
    public static C58136v m225487f() {
        if (f143009g == null) {
            synchronized (VoIPAudioManager.class) {
                if (f143009g == null) {
                    f143009g = new C58136v();
                }
            }
        }
        return f143009g;
    }

    /* renamed from: h */
    private void m225488h() {
        C60700b.m235851b("VoipTelephoneControl", "[init]", "init");
        if (this.f143010a == null) {
            C58134u uVar = new C58134u(ar.m236694a());
            this.f143010a = uVar;
            uVar.mo197008a(this);
        }
    }

    /* renamed from: a */
    public void mo197013a() {
        if (this.f143010a == null) {
            C58134u uVar = new C58134u(ar.m236694a());
            this.f143010a = uVar;
            uVar.mo197008a(this);
        }
        C60700b.m235851b("VoipTelephoneControl", "[startListener]", "isListening = " + this.f143010a.mo197010c());
        this.f143010a.mo197007a();
    }

    /* renamed from: b */
    public void mo197017b() {
        if (this.f143010a != null) {
            C60700b.m235851b("VoipTelephoneControl", "[stopListener]", "isListening = " + this.f143010a.mo197010c());
            this.f143010a.mo197009b();
            this.f143010a = null;
        }
    }

    /* renamed from: a */
    public void mo197014a(VoIpCallModel voIpCallModel) {
        this.f143014e = voIpCallModel;
    }

    /* renamed from: a */
    public void mo197015a(AbstractC58137a aVar) {
        this.f143015f.add(aVar);
    }

    /* renamed from: b */
    public void mo197018b(AbstractC58137a aVar) {
        this.f143015f.remove(aVar);
    }

    /* renamed from: a */
    public void mo197016a(boolean z) {
        this.f143013d = z;
    }

    @Override // com.ss.android.lark.voip.service.impl.app.C58134u.AbstractC58135a
    /* renamed from: a */
    public void mo197012a(int i, String str) {
        this.f143011b = i;
        if (i == 0) {
            C60700b.m235851b("VoipTelephoneControl", "[onCallStateChanged]", "VC_TELE_STATE_IDLE");
            for (AbstractC58137a aVar : this.f143015f) {
                aVar.mo196675e();
            }
            if (this.f143012c != i) {
                VoIPAudioManager.m225760a().mo197201p();
            }
        } else if (i == 1 || i == 2) {
            C60700b.m235851b("VoipTelephoneControl", "[onCallStateChanged3]", "VC_TELE_STATE_OFFHOOK: getCallState =" + this.f143014e.mo196725e());
            VoiceCall f = this.f143014e.mo196726f();
            VoIpCallModel voIpCallModel = this.f143014e;
            if (voIpCallModel == null || !voIpCallModel.mo196722b() || !(this.f143014e.mo196725e() == VoiceCall.Status.CALLING || this.f143014e.mo196725e() == VoiceCall.Status.RINGING)) {
                VoIpCallModel voIpCallModel2 = this.f143014e;
                if (voIpCallModel2 != null && voIpCallModel2.mo196725e() == VoiceCall.Status.ON_THE_CALL) {
                    mo197016a(!this.f143014e.mo196724d());
                    if (f != null) {
                        VoipHitPoint.m225614a("voip_phone_call_interrupt", true, this.f143014e.mo196726f().getId(), C58133t.m225480a(f));
                    }
                    for (AbstractC58137a aVar2 : this.f143015f) {
                        aVar2.mo196674d();
                    }
                }
            } else {
                if (f != null) {
                    VoipHitPoint.m225614a("voip_phone_call_interrupt", false, this.f143014e.mo196726f().getId(), C58133t.m225480a(f));
                }
                for (AbstractC58137a aVar3 : this.f143015f) {
                    aVar3.mo196673c();
                }
            }
        } else if (i == 3) {
            C60700b.m235851b("VoipTelephoneControl", "[onCallStateChanged2]", "VC_TELE_STATE_RINGING");
        }
        this.f143012c = i;
    }
}
