package com.ss.android.lark.integrator.ccm.dependency.p2015a;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.ee.bear.basesdk.apisupport.AbstractC4432r;
import com.bytedance.ee.bear.integrator.cookies.C7918a;
import com.bytedance.ee.bear.lark.p419g.C8042a;
import com.larksuite.framework.utils.C26252ad;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.integrator.ccm.C39234b;
import com.ss.android.lark.integrator.ccm.config.p2012f.C39264a;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.LarkContext;

/* renamed from: com.ss.android.lark.integrator.ccm.dependency.a.al */
class al implements AbstractC4432r {

    /* renamed from: a */
    private final Context f100620a = LarkContext.getApplication();

    @Override // com.bytedance.ee.bear.basesdk.apisupport.AbstractC4432r
    /* renamed from: b */
    public void mo17161b() {
        m154984d();
        m154985e();
    }

    al() {
    }

    /* renamed from: d */
    private void m154984d() {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).registerThirdShare();
    }

    /* renamed from: e */
    private void m154985e() {
        C39234b.m154731a().mo143067b().mo143116f();
    }

    @Override // com.bytedance.ee.bear.basesdk.apisupport.AbstractC4432r
    /* renamed from: a */
    public void mo17160a() {
        C39264a.m154872b(this.f100620a);
        m154986f();
        m154983c();
    }

    /* renamed from: f */
    private void m154986f() {
        new C8042a().mo31079a(SystemClock.uptimeMillis() - ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getBeginCreateApplicationTime());
    }

    /* renamed from: c */
    private void m154983c() {
        if (!C26252ad.m94993b(this.f100620a) || ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getAccountManager() == null) {
            return;
        }
        if (((IPassportApi) ApiUtils.getApi(IPassportApi.class)).isLogin() || ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getAccountManager().mo172423d()) {
            C7918a.m31653a(((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getSession());
        }
    }
}
