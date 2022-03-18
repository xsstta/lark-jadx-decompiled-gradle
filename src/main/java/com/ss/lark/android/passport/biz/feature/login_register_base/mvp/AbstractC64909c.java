package com.ss.lark.android.passport.biz.feature.login_register_base.mvp;

import android.app.Activity;
import android.text.TextUtils;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49021b;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.base.router.RouterScene;
import com.ss.android.lark.passport.infra.base.statistics.AuthChannelEnum;
import com.ss.android.lark.passport.infra.config.PassportConfigHelper;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.model.C49121a;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.country.CountryBean;
import com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a;
import com.ss.lark.android.passport.biz.feature.login_register_base.mvp.AbstractC64907b;
import com.ss.lark.android.passport.biz.feature.login_register_base.mvp.C64903a;
import com.ss.lark.android.passport.biz.feature.login_register_base.mvp.LoginRegisterBaseView;
import java.util.HashMap;

/* renamed from: com.ss.lark.android.passport.biz.feature.login_register_base.mvp.c */
public abstract class AbstractC64909c<M extends AbstractC64907b, V extends LoginRegisterBaseView> extends AbstractC49021b<M, V, C64903a.AbstractC64905b.AbstractC64906a> {

    /* renamed from: f */
    protected Activity f163612f;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo223842a(CountryBean countryBean);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo223844a(String str);

    /* renamed from: com.ss.lark.android.passport.biz.feature.login_register_base.mvp.c$a */
    public class C64910a implements C64903a.AbstractC64905b.AbstractC64906a {
        @Override // com.ss.lark.android.passport.biz.feature.login_register_base.mvp.C64903a.AbstractC64905b.AbstractC64906a
        /* renamed from: b */
        public void mo223908b(String str) {
        }

        @Override // com.ss.lark.android.passport.biz.feature.login_register_base.mvp.C64903a.AbstractC64905b.AbstractC64906a
        /* renamed from: a */
        public void mo223904a() {
            AbstractC64909c.this.mo223913k();
        }

        @Override // com.ss.lark.android.passport.biz.feature.login_register_base.mvp.C64903a.AbstractC64905b.AbstractC64906a
        /* renamed from: b */
        public int mo223907b() {
            return ((AbstractC64907b) AbstractC64909c.this.mo171182e()).mo223912h();
        }

        public C64910a() {
        }

        @Override // com.ss.lark.android.passport.biz.feature.login_register_base.mvp.C64903a.AbstractC64905b.AbstractC64906a
        /* renamed from: c */
        public void mo223909c(String str) {
            AbstractC64909c.this.mo223844a(str);
        }

        @Override // com.ss.lark.android.passport.biz.feature.login_register_base.mvp.C64903a.AbstractC64905b.AbstractC64906a
        /* renamed from: a */
        public boolean mo223906a(String str) {
            if (TextUtils.isEmpty(str) || !str.matches(PassportConfigHelper.m193031m())) {
                return false;
            }
            return true;
        }

        @Override // com.ss.lark.android.passport.biz.feature.login_register_base.mvp.C64903a.AbstractC64905b.AbstractC64906a
        /* renamed from: a */
        public void mo223905a(AuthChannelEnum authChannelEnum) {
            HashMap hashMap = new HashMap();
            hashMap.put("channel", authChannelEnum.value());
            AbstractC64909c.this.f123081c.mo171467b("n_action_login_idp_auth_url_req", "c idp login clicked, fetch sso url", hashMap);
            ((LoginRegisterBaseView) AbstractC64909c.this.mo171181d()).mo223885l();
            ((AbstractC64907b) AbstractC64909c.this.mo171182e()).mo223911a(authChannelEnum, new AbstractC49352d<BaseStepData>() {
                /* class com.ss.lark.android.passport.biz.feature.login_register_base.mvp.AbstractC64909c.C64910a.C649111 */

                @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
                /* renamed from: a */
                public void mo145178a(NetworkErrorResult networkErrorResult) {
                    ((LoginRegisterBaseView) AbstractC64909c.this.mo171181d()).mo223886m();
                    PassportLog passportLog = AbstractC64909c.this.f123081c;
                    PassportLog passportLog2 = AbstractC64909c.this.f123081c;
                    passportLog.mo171471d("n_action_login_idp_auth_url_req_fail", PassportLog.m193687a("clickIdpItem onError", networkErrorResult));
                }

                /* renamed from: a */
                public void mo145179a(BaseStepData baseStepData) {
                    ((LoginRegisterBaseView) AbstractC64909c.this.mo171181d()).mo223886m();
                    if (baseStepData == null) {
                        AbstractC64909c.this.f123081c.mo171471d("n_action_login_idp_auth_url_req_fail", "SsoUrlResponse is null");
                        return;
                    }
                    PassportLog passportLog = AbstractC64909c.this.f123081c;
                    passportLog.mo171465b("n_action_login_idp_auth_url_req_suc", "fetch sso url success, next: " + baseStepData.getNextStep());
                    C49092f.m193529a(AbstractC64909c.this.f163612f, baseStepData, RouterScene.ALL.value, AbstractC64909c.this.f123080b, AbstractC64909c.this.f123081c, (AbstractC49336a) null);
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public C64910a mo171180c() {
        return new C64910a();
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d, com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49021b
    /* renamed from: a */
    public void mo171169a() {
        super.mo171169a();
        ((LoginRegisterBaseView) mo171181d()).mo223880b(((AbstractC64907b) mo171182e()).mo223912h());
        mo223842a(C49121a.m193727a().mo171510d());
    }

    /* renamed from: k */
    public int mo223913k() {
        ((AbstractC64907b) mo171182e()).mo223910a((((AbstractC64907b) mo171182e()).mo223912h() % 2) + 1);
        int h = ((AbstractC64907b) mo171182e()).mo223912h();
        ((LoginRegisterBaseView) mo171181d()).mo223880b(h);
        return h;
    }

    public AbstractC64909c(Activity activity, M m, V v, UniContext uniContext, PassportLog passportLog) {
        super(m, v, uniContext, passportLog);
        this.f163612f = activity;
    }
}
