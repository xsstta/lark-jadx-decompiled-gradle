package com.ss.lark.android.passport.biz.feature.auth_type.mvp;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49021b;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.base.router.RouterScene;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.contants.ButtonType;
import com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a;
import com.ss.lark.android.passport.biz.feature.auth_type.mvp.C64634c;

/* renamed from: com.ss.lark.android.passport.biz.feature.auth_type.mvp.b */
public class C64630b extends AbstractC49021b<C64634c.AbstractC64635a, C64634c.AbstractC64636b, C64634c.AbstractC64636b.AbstractC64637a> {

    /* renamed from: d */
    public final Activity f163107d;

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C64634c.AbstractC64636b.AbstractC64637a mo171180c() {
        return new C64632a();
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d, com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49021b
    /* renamed from: a */
    public void mo171169a() {
        super.mo171169a();
        ((C64634c.AbstractC64636b) mo171181d()).mo223433a(((C64634c.AbstractC64635a) mo171182e()).mo223439g());
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.lark.android.passport.biz.feature.auth_type.mvp.b$a */
    public class C64632a implements C64634c.AbstractC64636b.AbstractC64637a {
        private C64632a() {
        }

        @Override // com.ss.lark.android.passport.biz.feature.auth_type.mvp.C64634c.AbstractC64636b.AbstractC64637a
        /* renamed from: a */
        public void mo223441a(BaseStepData baseStepData, ButtonType buttonType) {
            if (baseStepData == null) {
                C64630b.this.f123081c.mo171471d("AuthTypePresenter", "clickVerifyItem typeData == null");
                return;
            }
            PassportLog passportLog = C64630b.this.f123081c;
            passportLog.mo171465b("AuthTypePresenter", "step is:" + baseStepData.nextStep);
            if (!(buttonType == ButtonType.VERIFY_PHONE && buttonType == ButtonType.VERIFY_EMAIL)) {
                ((C64634c.AbstractC64636b) C64630b.this.mo171181d()).mo223436e();
            }
            C49092f.m193532a(C64630b.this.f163107d, baseStepData.nextStep, baseStepData.stepInfo, RouterScene.ALL.value, C64630b.this.f123080b, C64630b.this.f123081c, new AbstractC49336a() {
                /* class com.ss.lark.android.passport.biz.feature.auth_type.mvp.C64630b.C64632a.C646331 */

                @Override // com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a
                public void onRouterResult(int i, Object obj) {
                    C64630b.this.f123081c.mo171465b("AuthTypePresenter", "jump success");
                    ((C64634c.AbstractC64636b) C64630b.this.mo171181d()).mo223437f();
                }
            });
        }
    }

    public C64630b(FragmentActivity fragmentActivity, AuthTypeView authTypeView, C64629a aVar, UniContext uniContext, PassportLog passportLog) {
        super(aVar, authTypeView, uniContext, passportLog);
        this.f163107d = fragmentActivity;
        authTypeView.mo171188a(mo171180c());
    }
}
