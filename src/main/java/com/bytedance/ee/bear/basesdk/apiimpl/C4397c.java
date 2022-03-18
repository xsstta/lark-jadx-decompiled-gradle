package com.bytedance.ee.bear.basesdk.apiimpl;

import android.content.Context;
import android.content.res.Configuration;
import com.bytedance.ee.bear.basesdk.IDocInit;
import com.bytedance.ee.bear.basesdk.api.AbstractC4376b;
import com.bytedance.ee.bear.contract.C5102ai;
import com.bytedance.ee.bear.integrator.p399a.C7870a;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p701d.C13629i;

/* renamed from: com.bytedance.ee.bear.basesdk.apiimpl.c */
public final class C4397c implements AbstractC4376b {

    /* renamed from: a */
    private IDocInit f13005a;

    public C4397c(IDocInit iDocInit) {
        this.f13005a = iDocInit;
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4376b
    /* renamed from: b */
    public void mo17022b(boolean z) {
        C13479a.m54764b("AppStatusImpl", "setIsAppInBackground()... process  = " + C13629i.m55303b((Context) null) + ",  isAppFront = " + z);
        C5102ai.m20869b(z);
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4376b
    /* renamed from: a */
    public void mo17021a(boolean z) {
        C13479a.m54764b("AppStatusImpl", "setIsDoze()... process  = " + C13629i.m55303b((Context) null) + ",  isDoze = " + z);
        C5102ai.m20870c(z);
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4376b
    /* renamed from: a */
    public void mo17020a(Context context, Configuration configuration) {
        C13479a.m54764b("AppStatusImpl", "onConfigurationChanged()... process  = " + C13629i.m55303b((Context) null) + ",  onConfigurationChanged");
        C7870a.m31582a().mo30703a(context, configuration);
    }
}
