package com.ss.lark.android.passport.biz.compat.reset_phone_num.mvp;

import android.content.Context;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49021b;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.base.router.RouterScene;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a;
import com.ss.lark.android.passport.biz.compat.reset_phone_num.mvp.C64425a;

/* renamed from: com.ss.lark.android.passport.biz.compat.reset_phone_num.mvp.c */
public class C64430c extends AbstractC49021b<C64425a.AbstractC64426a, C64425a.AbstractC64427b, C64425a.AbstractC64427b.AbstractC64428a> {

    /* renamed from: d */
    public final Context f162732d;

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C64425a.AbstractC64427b.AbstractC64428a mo171180c() {
        return new C64431a();
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d, com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49021b
    /* renamed from: a */
    public void mo171169a() {
        super.mo171169a();
        ((C64425a.AbstractC64427b) mo171181d()).mo222986a(((C64425a.AbstractC64426a) mo171182e()).cd_());
    }

    /* renamed from: com.ss.lark.android.passport.biz.compat.reset_phone_num.mvp.c$a */
    public class C64431a implements C64425a.AbstractC64427b.AbstractC64428a {
        public C64431a() {
        }

        @Override // com.ss.lark.android.passport.biz.compat.reset_phone_num.mvp.C64425a.AbstractC64427b.AbstractC64428a
        /* renamed from: a */
        public void mo222993a(String str) {
            ((C64425a.AbstractC64427b) C64430c.this.mo171181d()).mo222987d();
            C64430c.this.f123081c.mo171465b("n_action_old_new_credential_next_req", "old set new credential req start");
            ((C64425a.AbstractC64426a) C64430c.this.mo171182e()).mo222991a("+86" + str, new AbstractC49352d<BaseStepData>() {
                /* class com.ss.lark.android.passport.biz.compat.reset_phone_num.mvp.C64430c.C64431a.C644321 */

                @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
                /* renamed from: a */
                public void mo145178a(NetworkErrorResult networkErrorResult) {
                    ((C64425a.AbstractC64427b) C64430c.this.mo171181d()).mo222988e();
                    PassportLog passportLog = C64430c.this.f123081c;
                    passportLog.mo171471d("n_action_old_new_credential_fail", "old set new credential req failed, error: " + networkErrorResult);
                }

                /* renamed from: a */
                public void mo145179a(BaseStepData baseStepData) {
                    PassportLog passportLog = C64430c.this.f123081c;
                    passportLog.mo171465b("n_action_old_new_credential_succ", "old set new credential req success, next: " + baseStepData.nextStep);
                    ((C64425a.AbstractC64427b) C64430c.this.mo171181d()).mo222988e();
                    C49092f.m193532a(C64430c.this.f162732d, baseStepData.nextStep, baseStepData.stepInfo, RouterScene.ALL.value, C64430c.this.f123080b, C64430c.this.f123081c, (AbstractC49336a) null);
                }
            });
        }
    }

    public C64430c(Context context, C64425a.AbstractC64426a aVar, C64425a.AbstractC64427b bVar, UniContext uniContext, PassportLog passportLog) {
        super(aVar, bVar, uniContext, passportLog);
        this.f162732d = context;
    }
}
