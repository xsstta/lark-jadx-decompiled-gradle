package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.content.Intent;

/* renamed from: com.google.android.play.core.splitinstall.c */
final class C22704c implements AbstractC22722t {

    /* renamed from: a */
    final /* synthetic */ SplitInstallSessionState f56188a;

    /* renamed from: b */
    final /* synthetic */ Intent f56189b;

    /* renamed from: c */
    final /* synthetic */ Context f56190c;

    /* renamed from: d */
    final /* synthetic */ C22706e f56191d;

    C22704c(C22706e eVar, SplitInstallSessionState splitInstallSessionState, Intent intent, Context context) {
        this.f56191d = eVar;
        this.f56188a = splitInstallSessionState;
        this.f56189b = intent;
        this.f56190c = context;
    }

    @Override // com.google.android.play.core.splitinstall.AbstractC22722t
    /* renamed from: a */
    public final void mo79039a() {
        C22706e eVar;
        eVar.f56197d.post(new RunnableC22705d(this.f56191d, this.f56188a, 5, 0));
    }

    @Override // com.google.android.play.core.splitinstall.AbstractC22722t
    /* renamed from: a */
    public final void mo79040a(int i) {
        C22706e eVar;
        eVar.f56197d.post(new RunnableC22705d(this.f56191d, this.f56188a, 6, i));
    }

    @Override // com.google.android.play.core.splitinstall.AbstractC22722t
    /* renamed from: b */
    public final void mo79041b() {
        if (!this.f56189b.getBooleanExtra("triggered_from_app_after_verification", false)) {
            this.f56189b.putExtra("triggered_from_app_after_verification", true);
            this.f56190c.sendBroadcast(this.f56189b);
            return;
        }
        this.f56191d.f55610a.mo78873b("Splits copied and verified more than once.", new Object[0]);
    }
}
