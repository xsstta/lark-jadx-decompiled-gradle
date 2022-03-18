package com.ss.android.lark.littleapp;

import android.app.Application;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.ref.impl.host.HostInterface;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67435c;
import com.tt.miniapphost.p3362a.p3365c.C67448a;
import com.tt.miniapphost.p3362a.p3367e.AbstractC67457c;
import com.tt.miniapphost.util.ProcessUtil;

/* renamed from: com.ss.android.lark.littleapp.n */
public class C41396n extends AbstractC67457c implements AbstractC67435c {

    /* renamed from: a */
    private Application f105249a;

    /* renamed from: b */
    private AbstractC41371j f105250b;

    /* renamed from: c */
    private HostInterface f105251c;

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IBaseService
    public void release() {
    }

    @Override // com.tt.miniapphost.p3362a.p3363a.AbstractC67435c
    /* renamed from: a */
    public void mo149075a() {
        long currentTimeMillis = System.currentTimeMillis();
        if (ProcessUtil.isMiniappProcess()) {
            AppBrandLogger.m52830i("ServiceInitController", "current is miniProcess, so do not need init new AppContext");
            return;
        }
        AppBrandLogger.m52830i("ServiceInitController", "check if init new AppContext");
        if (!C67448a.m262353a().mo234191j() || !C67448a.m262353a().mo234190i().mo234162b()) {
            AppBrandLogger.m52830i("ServiceInitController", "not have validAppContext,need create New AppContext");
            C67432a.m262319a(C41390l.m164161a(this.f105249a, this.f105250b, this.f105251c)).onCreate();
        }
        AppBrandLogger.m52828d("ServiceInitController", "ServiceInitController init timestamp:" + (System.currentTimeMillis() - currentTimeMillis));
    }

    public C41396n(Application application, AbstractC41371j jVar, HostInterface hostInterface) {
        this.f105249a = application;
        this.f105250b = jVar;
        this.f105251c = hostInterface;
    }
}
