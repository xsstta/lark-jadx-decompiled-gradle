package com.ss.android.lark.security.set;

import android.content.Intent;
import android.os.Bundle;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49021b;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.base.router.RouterFieldAnno;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.security.set.AbstractC54070a;

/* renamed from: com.ss.android.lark.security.set.d */
public class C54077d extends AbstractC49021b<AbstractC54070a.AbstractC54071a, AbstractC54070a.AbstractC54072b, AbstractC54070a.AbstractC54072b.AbstractC54073a> {
    @RouterFieldAnno

    /* renamed from: d */
    public SetSecurityPwdStep f133887d;

    /* renamed from: h */
    private void m209851h() {
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d, com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49021b
    /* renamed from: a */
    public void mo171169a() {
        super.mo171169a();
        m209851h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public AbstractC54070a.AbstractC54072b.AbstractC54073a mo171180c() {
        return new C54079a();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.security.set.d$a */
    public class C54079a implements AbstractC54070a.AbstractC54072b.AbstractC54073a {
        private C54079a() {
        }

        @Override // com.ss.android.lark.security.set.AbstractC54070a.AbstractC54072b.AbstractC54073a
        /* renamed from: a */
        public void mo185116a(String str) {
            C54077d.this.mo185118a(str);
        }
    }

    /* renamed from: a */
    public void mo185118a(String str) {
        String str2;
        SetSecurityPwdStep setSecurityPwdStep = this.f133887d;
        if (setSecurityPwdStep != null) {
            str2 = setSecurityPwdStep.getFlowType();
        } else {
            str2 = "";
        }
        ((AbstractC54070a.AbstractC54072b) mo171181d()).mo185090d();
        ((AbstractC54070a.AbstractC54071a) mo171182e()).mo185115a(str, str2, new UIGetDataCallback(new IGetDataCallback<BaseStepData>() {
            /* class com.ss.android.lark.security.set.C54077d.C540781 */

            /* renamed from: a */
            public void onSuccess(BaseStepData baseStepData) {
                ((AbstractC54070a.AbstractC54072b) C54077d.this.mo171181d()).mo185089a("verify_sec_pwd".equalsIgnoreCase(baseStepData.nextStep));
                ((AbstractC54070a.AbstractC54072b) C54077d.this.mo171181d()).mo185091e();
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                ((AbstractC54070a.AbstractC54072b) C54077d.this.mo171181d()).mo185088a(errorResult.getDisplayMsg());
                ((AbstractC54070a.AbstractC54072b) C54077d.this.mo171181d()).mo185091e();
                Log.m165383e("SetSecurityPasswordPresenter", "setSecurityPwd callback error:" + errorResult);
            }
        }));
    }

    public C54077d(AbstractC54070a.AbstractC54072b bVar, AbstractC54070a.AbstractC54071a aVar, Bundle bundle, UniContext uniContext, PassportLog passportLog) {
        super(aVar, bVar, uniContext, passportLog);
        Intent intent = new Intent();
        intent.putExtras(bundle);
        C49092f.m193525a(this, intent);
    }
}
