package com.ss.android.vc.meeting.framework.statemachine;

import com.ss.android.vc.meeting.framework.manager.interfaces.AbstractC61287d;
import com.ss.android.vc.meeting.framework.meeting.AbstractC61294b;

/* renamed from: com.ss.android.vc.meeting.framework.statemachine.i */
public abstract class AbstractC61342i implements AbstractC61287d {

    /* renamed from: a */
    protected AbstractC61294b f153699a;

    /* renamed from: b */
    protected StatusNode f153700b = StatusNode.Init;

    /* renamed from: c */
    protected C61363q f153701c;

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo212301d() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo212304g() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo212305h() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo212307j() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public String mo212308k() {
        return "MeetingStateSwitchListener";
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo212309l() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo212311n() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo212299b() {
        this.f153701c.mo212385c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo212302e() {
        this.f153701c.mo212386d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo212306i() {
        this.f153700b = StatusNode.OnTheCall;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo212310m() {
        this.f153700b = StatusNode.Waiting;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo212327p() {
        this.f153701c.mo212384b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo212300c() {
        this.f153700b = StatusNode.Calling;
        this.f153701c.mo212387e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo212303f() {
        this.f153700b = StatusNode.Ringing;
        this.f153701c.mo212388f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo212328q() {
        this.f153700b = StatusNode.Init;
        this.f153701c.mo212389g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo212326o() {
        int i = C613431.f153702a[this.f153700b.ordinal()];
        if (i == 2) {
            mo212301d();
        } else if (i == 3) {
            mo212304g();
        } else if (i == 4) {
            mo212307j();
        } else if (i == 5) {
            mo212311n();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vc.meeting.framework.statemachine.i$1 */
    public static /* synthetic */ class C613431 {

        /* renamed from: a */
        static final /* synthetic */ int[] f153702a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.ss.android.vc.meeting.framework.statemachine.StatusNode[] r0 = com.ss.android.vc.meeting.framework.statemachine.StatusNode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.vc.meeting.framework.statemachine.AbstractC61342i.C613431.f153702a = r0
                com.ss.android.vc.meeting.framework.statemachine.StatusNode r1 = com.ss.android.vc.meeting.framework.statemachine.StatusNode.Init     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.vc.meeting.framework.statemachine.AbstractC61342i.C613431.f153702a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.vc.meeting.framework.statemachine.StatusNode r1 = com.ss.android.vc.meeting.framework.statemachine.StatusNode.Calling     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.vc.meeting.framework.statemachine.AbstractC61342i.C613431.f153702a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.vc.meeting.framework.statemachine.StatusNode r1 = com.ss.android.vc.meeting.framework.statemachine.StatusNode.Ringing     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.vc.meeting.framework.statemachine.AbstractC61342i.C613431.f153702a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.vc.meeting.framework.statemachine.StatusNode r1 = com.ss.android.vc.meeting.framework.statemachine.StatusNode.OnTheCall     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.ss.android.vc.meeting.framework.statemachine.AbstractC61342i.C613431.f153702a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.ss.android.vc.meeting.framework.statemachine.StatusNode r1 = com.ss.android.vc.meeting.framework.statemachine.StatusNode.Waiting     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = com.ss.android.vc.meeting.framework.statemachine.AbstractC61342i.C613431.f153702a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.ss.android.vc.meeting.framework.statemachine.StatusNode r1 = com.ss.android.vc.meeting.framework.statemachine.StatusNode.Idle     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.framework.statemachine.AbstractC61342i.C613431.<clinit>():void");
        }
    }

    public AbstractC61342i(AbstractC61294b bVar) {
        this.f153699a = bVar;
        this.f153701c = new C61363q(bVar);
    }

    @Override // com.ss.android.vc.meeting.framework.manager.interfaces.AbstractC61287d
    /* renamed from: a */
    public void mo211956a(StatusNode statusNode) {
        int i = C613431.f153702a[statusNode.ordinal()];
        if (i == 1) {
            mo212328q();
        } else if (i == 2) {
            mo212300c();
        } else if (i == 3) {
            mo212303f();
        } else if (i == 4) {
            mo212306i();
        } else if (i == 5) {
            mo212310m();
        }
    }

    @Override // com.ss.android.vc.meeting.framework.manager.interfaces.AbstractC61287d
    /* renamed from: b */
    public void mo211957b(StatusNode statusNode) {
        switch (C613431.f153702a[statusNode.ordinal()]) {
            case 1:
                mo212327p();
                return;
            case 2:
                mo212299b();
                return;
            case 3:
                mo212302e();
                return;
            case 4:
                mo212305h();
                return;
            case 5:
                mo212309l();
                return;
            case 6:
                mo212326o();
                return;
            default:
                return;
        }
    }
}
