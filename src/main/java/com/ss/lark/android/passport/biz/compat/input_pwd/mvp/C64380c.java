package com.ss.lark.android.passport.biz.compat.input_pwd.mvp;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49021b;
import com.ss.android.lark.passport.infra.base.network.handler.UnknownCodeHandler;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.base.router.RouterScene;
import com.ss.android.lark.passport.infra.base.statistics.C49096b;
import com.ss.android.lark.passport.infra.base.statistics.perf.C49099a;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a;
import com.ss.lark.android.passport.biz.compat.input_pwd.mvp.C64375a;
import com.ss.lark.android.passport.biz.compat.v2.featurec.network.responese.VerifyPwdData;
import com.ss.lark.android.passport.biz.compat.v2.http.base.V2ResponseModel;
import com.ss.lark.android.passport.biz.compat.verify_code.VerifyIdentityStepInfo;

/* renamed from: com.ss.lark.android.passport.biz.compat.input_pwd.mvp.c */
public class C64380c extends AbstractC49021b<C64375a.AbstractC64376a, C64375a.AbstractC64377b, C64375a.AbstractC64377b.AbstractC64378a> {

    /* renamed from: d */
    public Context f162661d;

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d, com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49021b
    /* renamed from: a */
    public void mo171169a() {
        super.mo171169a();
        mo222937h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C64375a.AbstractC64377b.AbstractC64378a mo171180c() {
        return new C64381a();
    }

    /* renamed from: h */
    public void mo222937h() {
        VerifyIdentityStepInfo cb_ = ((C64375a.AbstractC64376a) mo171182e()).cb_();
        if (cb_ != null) {
            ((C64375a.AbstractC64377b) mo171181d()).mo222915a(cb_.verifyPwd, cb_.isEnableVerifyCode(), cb_.isEnableMagicLink(), cb_.isEnableResetPwd());
            return;
        }
        this.f123081c.mo171465b("InputPwdPresenter", "init pwd page, null stepinfo");
    }

    /* renamed from: com.ss.lark.android.passport.biz.compat.input_pwd.mvp.c$a */
    public class C64381a implements AbstractC49336a, C64375a.AbstractC64377b.AbstractC64378a {
        @Override // com.ss.lark.android.passport.biz.compat.input_pwd.mvp.C64375a.AbstractC64377b.AbstractC64378a
        /* renamed from: a */
        public boolean mo222933a() {
            return false;
        }

        @Override // com.ss.lark.android.passport.biz.compat.input_pwd.mvp.C64375a.AbstractC64377b.AbstractC64378a
        /* renamed from: b */
        public void mo222934b() {
            C49096b.m193605q();
            VerifyIdentityStepInfo cb_ = ((C64375a.AbstractC64376a) C64380c.this.mo171182e()).cb_();
            if (cb_ == null) {
                C64380c.this.f123081c.mo171471d("InputPwdPresenter", "resetPwd, input stepInfo is null");
                return;
            }
            VerifyIdentityStepInfo verifyIdentityStepInfo = new VerifyIdentityStepInfo();
            verifyIdentityStepInfo.type = "forget_verify_code";
            verifyIdentityStepInfo.forgetVerifyCode = cb_.forgetVerifyCode;
            verifyIdentityStepInfo.enableChange = 4;
            verifyIdentityStepInfo.recoverAccountBean = cb_.recoverAccountBean;
            if (verifyIdentityStepInfo.recoverAccountBean != null) {
                verifyIdentityStepInfo.recoverAccountBean.put("source_type", Integer.valueOf(cb_.forgetVerifyCode.sourceType));
            }
            Object json = JSON.toJSON(verifyIdentityStepInfo);
            if (json == null || !(json instanceof JSONObject)) {
                C64380c.this.f123081c.mo171471d("InputPwdPresenter", "resetPwd parse reset json error");
            } else {
                C49092f.m193532a(C64380c.this.f162661d, "new_verify_identity", (JSONObject) json, RouterScene.ALL.value, C64380c.this.f123080b, C64380c.this.f123081c, (AbstractC49336a) null);
            }
        }

        public C64381a() {
        }

        @Override // com.ss.lark.android.passport.biz.compat.input_pwd.mvp.C64375a.AbstractC64377b.AbstractC64378a
        /* renamed from: a */
        public String mo222931a(Context context) {
            return C64380c.this.f162661d.getResources().getString(R.string.Lark_Login_V3_InputPasswordPlaceholder);
        }

        @Override // com.ss.lark.android.passport.biz.compat.input_pwd.mvp.C64375a.AbstractC64377b.AbstractC64378a
        /* renamed from: b */
        public boolean mo222935b(String str) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return true;
        }

        @Override // com.ss.lark.android.passport.biz.compat.input_pwd.mvp.C64375a.AbstractC64377b.AbstractC64378a
        /* renamed from: a */
        public void mo222932a(String str) {
            final C49099a a = new C49099a("passport_enter_verify_pwd").mo171417a();
            C49096b.m193603o();
            ((C64375a.AbstractC64377b) C64380c.this.mo171181d()).mo222917d();
            ((C64375a.AbstractC64376a) C64380c.this.mo171182e()).mo222929a(str, new AbstractC49352d<V2ResponseModel<VerifyPwdData>>() {
                /* class com.ss.lark.android.passport.biz.compat.input_pwd.mvp.C64380c.C64381a.C643821 */

                @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
                /* renamed from: a */
                public void mo145178a(NetworkErrorResult networkErrorResult) {
                    a.mo171420a("result", "other").mo171421b().mo171422c();
                    PassportLog passportLog = C64380c.this.f123081c;
                    passportLog.mo171471d("InputPwdPresenter", "VerifyPwd error " + networkErrorResult.toString());
                    ((C64375a.AbstractC64377b) C64380c.this.mo171181d()).mo222918e();
                    if (networkErrorResult.getErrorCode() == 4203) {
                        LKUIToast.show(C64380c.this.f162661d, networkErrorResult.getErrorMessage());
                        ((C64375a.AbstractC64377b) C64380c.this.mo171181d()).mo222919f();
                        return;
                    }
                    UnknownCodeHandler.f123256a.mo171329a(C64380c.this.f162661d, networkErrorResult);
                }

                /* renamed from: a */
                public void mo145179a(V2ResponseModel<VerifyPwdData> v2ResponseModel) {
                    a.mo171420a("result", "success").mo171421b().mo171422c();
                    PassportLog passportLog = C64380c.this.f123081c;
                    passportLog.mo171465b("InputPwdPresenter", "VerifyPwd suc, code: " + v2ResponseModel.code);
                    if (v2ResponseModel.code == 0) {
                        VerifyPwdData verifyPwdData = (VerifyPwdData) v2ResponseModel.data;
                        if (verifyPwdData == null) {
                            C64380c.this.f123081c.mo171471d("InputPwdPresenter", "verifyPwd rsp data = null");
                            ((C64375a.AbstractC64377b) C64380c.this.mo171181d()).mo222918e();
                            mo145178a(new NetworkErrorResult());
                            return;
                        }
                        PassportLog passportLog2 = C64380c.this.f123081c;
                        passportLog2.mo171465b("InputPwdPresenter", "verifyPwd nextStep " + verifyPwdData.nextStep);
                        C49092f.m193529a(C64380c.this.f162661d, verifyPwdData, RouterScene.ALL.value, C64380c.this.f123080b, C64380c.this.f123081c, C64381a.this);
                    }
                }
            });
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a
        public void onRouterResult(int i, Object obj) {
            if (i == -106) {
                C64380c.this.f123081c.mo171465b("InputPwdPresenter", "enterApp onRouterResult CODE_ENTER_APP_SUCCESS");
            } else {
                PassportLog passportLog = C64380c.this.f123081c;
                passportLog.mo171471d("InputPwdPresenter", "enterApp onRouterResult error code:" + i);
            }
            ((C64375a.AbstractC64377b) C64380c.this.mo171181d()).mo222918e();
        }
    }

    public C64380c(Context context, C64375a.AbstractC64376a aVar, C64375a.AbstractC64377b bVar, UniContext uniContext, PassportLog passportLog) {
        super(aVar, bVar, uniContext, passportLog);
        this.f162661d = context;
    }
}
