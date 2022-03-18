package com.ss.lark.android.passport.biz.feature.login_input.mvp;

import android.content.Intent;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.passport.infra.base.storage.util.IsolateStorageUtil;
import com.ss.android.lark.passport.infra.log.MonitorKeys;
import com.ss.android.lark.passport.infra.log.MonitorUtil;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.infra.util.p2440b.C49160a;
import com.ss.android.lark.passport.signinsdk_api.base.network.ICallback;
import com.ss.android.lark.passport.signinsdk_api.entity.SigninParams;
import com.ss.lark.android.passport.biz.feature.FeatureCApi;
import com.ss.lark.android.passport.biz.feature.login_register_base.mvp.AbstractC64907b;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* renamed from: com.ss.lark.android.passport.biz.feature.login_input.mvp.c */
public class C64883c extends AbstractC64907b implements AbstractC64880a {

    /* renamed from: c */
    SigninParams f163550c;

    /* renamed from: g */
    public SigninParams mo223852g() {
        return this.f163550c;
    }

    /* renamed from: i */
    private void m254823i() {
        CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
            /* class com.ss.lark.android.passport.biz.feature.login_input.mvp.C64883c.RunnableC648852 */

            public void run() {
                try {
                    PublicSuffixDatabase.get().getEffectiveTldPlusOne("preload.domain");
                } catch (Exception e) {
                    C64883c.this.f123075b.mo171462a("LoginInputModel", "preloadPublicSuffixes error", e);
                }
            }
        });
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d, com.ss.android.lark.passport.infra.base.architecture.p2424a.C49020a, com.ss.lark.android.passport.biz.feature.login_register_base.mvp.AbstractC64907b
    /* renamed from: a */
    public void mo171169a() {
        super.mo171169a();
        if (!ServiceFinder.m193748c().isLogin()) {
            MonitorUtil.m193719c("");
            IsolateStorageUtil.f123196a.mo171253b(MonitorKeys.f123360a, "");
        }
    }

    public C64883c(Intent intent) {
        super(intent);
    }

    /* renamed from: a */
    public void mo223850a(SigninParams signinParams) {
        this.f163550c = signinParams;
    }

    /* renamed from: a */
    public void mo223851a(final String str, int i, ICallback aVar) {
        CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
            /* class com.ss.lark.android.passport.biz.feature.login_input.mvp.C64883c.RunnableC648841 */

            public void run() {
                String a = C49160a.m193855a(str, "EE");
                if (C64883c.this.f123074a != null) {
                    C64883c.this.f123074a.setCp(a);
                }
                MonitorUtil.m193719c(a);
                IsolateStorageUtil.f123196a.mo171253b(MonitorKeys.f123360a, a);
            }
        });
        mo171171a(FeatureCApi.m253695a(str, i, this.f123074a, aVar));
        m254823i();
    }
}
