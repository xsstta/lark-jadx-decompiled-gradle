package com.ss.lark.android.passport.biz.compat.verify_code.mvp;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49021b;
import com.ss.android.lark.passport.infra.base.network.handler.UnknownCodeHandler;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.base.router.RouterScene;
import com.ss.android.lark.passport.infra.base.statistics.C49096b;
import com.ss.android.lark.passport.infra.base.statistics.perf.C49099a;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.util.C49203q;
import com.ss.android.lark.passport.infra.util.storage.C49216a;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a;
import com.ss.lark.android.passport.biz.compat.v2.featurec.model.ApplyCodeErrorData;
import com.ss.lark.android.passport.biz.compat.v2.featurec.network.responese.ApplyCodeData;
import com.ss.lark.android.passport.biz.compat.v2.http.base.V2ResponseModel;
import com.ss.lark.android.passport.biz.compat.verify_code.VerifyIdentityStepInfo;
import com.ss.lark.android.passport.biz.compat.verify_code.mvp.C64536a;
import com.ss.lark.android.passport.biz.compat.verify_code.mvp.C64541c;

/* renamed from: com.ss.lark.android.passport.biz.compat.verify_code.mvp.c */
public class C64541c extends AbstractC49021b<C64536a.AbstractC64537a, C64536a.AbstractC64538b, C64536a.AbstractC64538b.AbstractC64539a> {

    /* renamed from: d */
    public Activity f162940d;

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C64536a.AbstractC64538b.AbstractC64539a mo171180c() {
        return new C64545a();
    }

    /* renamed from: j */
    public void mo223242j() {
        ((C64536a.AbstractC64537a) mo171182e()).mo223221a(new AbstractC49352d<V2ResponseModel<ApplyCodeData>>() {
            /* class com.ss.lark.android.passport.biz.compat.verify_code.mvp.C64541c.C645432 */

            @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
            /* renamed from: a */
            public void mo145178a(NetworkErrorResult networkErrorResult) {
                PassportLog passportLog = C64541c.this.f123081c;
                PassportLog passportLog2 = C64541c.this.f123081c;
                passportLog.mo171471d("LoginVerifyCodePresenter", PassportLog.m193687a("sendRequest apply Code error", networkErrorResult));
                UnknownCodeHandler.f123256a.mo171329a(C64541c.this.f162940d, networkErrorResult);
            }

            /* renamed from: a */
            public void mo145179a(V2ResponseModel<ApplyCodeData> v2ResponseModel) {
                PassportLog passportLog = C64541c.this.f123081c;
                passportLog.mo171465b("LoginVerifyCodePresenter", "sendRequest apply Code suc, code: " + v2ResponseModel.code);
                if (v2ResponseModel.code == 0) {
                    ((C64536a.AbstractC64538b) C64541c.this.mo171181d()).mo223205d();
                } else if (4206 == v2ResponseModel.code) {
                    C64541c.this.f123081c.mo171465b("LoginVerifyCodePresenter", "sendRequest apply Code expire");
                    ApplyCodeErrorData applyCodeErrorData = (ApplyCodeErrorData) v2ResponseModel.data;
                    if (applyCodeErrorData != null) {
                        ((C64536a.AbstractC64538b) C64541c.this.mo171181d()).mo223200a(applyCodeErrorData.expire);
                    }
                }
            }
        });
    }

    /* renamed from: com.ss.lark.android.passport.biz.compat.verify_code.mvp.c$a */
    public class C64545a implements C64536a.AbstractC64538b.AbstractC64539a {
        @Override // com.ss.lark.android.passport.biz.compat.verify_code.mvp.C64536a.AbstractC64538b.AbstractC64539a
        /* renamed from: d */
        public int mo223235d() {
            return R.string.Lark_Login_DescOfAuthentication;
        }

        @Override // com.ss.lark.android.passport.biz.compat.verify_code.mvp.C64536a.AbstractC64538b.AbstractC64539a
        /* renamed from: b */
        public String mo223232b() {
            if (((C64536a.AbstractC64537a) C64541c.this.mo171182e()).ck_() == null) {
                return "";
            }
            return ((C64536a.AbstractC64537a) C64541c.this.mo171182e()).ck_().type;
        }

        @Override // com.ss.lark.android.passport.biz.compat.verify_code.mvp.C64536a.AbstractC64538b.AbstractC64539a
        /* renamed from: c */
        public String mo223234c() {
            VerifyIdentityStepInfo.VerifyIdentifyBean cj_;
            if (C64541c.this.f162940d == null || (cj_ = ((C64536a.AbstractC64537a) C64541c.this.mo171182e()).cj_()) == null) {
                return "";
            }
            return cj_.verifyCodeTip;
        }

        @Override // com.ss.lark.android.passport.biz.compat.verify_code.mvp.C64536a.AbstractC64538b.AbstractC64539a
        /* renamed from: e */
        public void mo223236e() {
            C49096b.m193589e("login_page_enter_verify_code");
            if (C64541c.this.mo223240h()) {
                ((C64536a.AbstractC64538b) C64541c.this.mo171181d()).mo223203a("cancelVerify", false);
                if (C49203q.m193977c(C64541c.this.f162940d)) {
                    C49203q.m193973a((Context) C64541c.this.f162940d);
                }
            }
            C64541c.this.f162940d.finish();
        }

        @Override // com.ss.lark.android.passport.biz.compat.verify_code.mvp.C64536a.AbstractC64538b.AbstractC64539a
        /* renamed from: f */
        public boolean mo223237f() {
            if (((C64536a.AbstractC64537a) C64541c.this.mo171182e()).cj_() == null || !TextUtils.equals("contact_verify", ((C64536a.AbstractC64537a) C64541c.this.mo171182e()).cj_().scope)) {
                return false;
            }
            return true;
        }

        @Override // com.ss.lark.android.passport.biz.compat.verify_code.mvp.C64536a.AbstractC64538b.AbstractC64539a
        /* renamed from: a */
        public void mo223230a() {
            C49096b.m193608t();
            if (C64541c.this.f162940d != null) {
                C64541c.this.f123081c.mo171465b("LoginVerifyCodePresenter", "verifyCode Regain");
                if (!((C64536a.AbstractC64537a) C64541c.this.mo171182e()).mo223228g()) {
                    C49096b.m193586d();
                }
                if (C64541c.this.mo223240h()) {
                    C64541c.this.mo223241i();
                } else {
                    C64541c.this.mo223242j();
                }
                ((C64536a.AbstractC64538b) C64541c.this.mo171181d()).mo223205d();
            }
        }

        public C64545a() {
        }

        @Override // com.ss.lark.android.passport.biz.compat.verify_code.mvp.C64536a.AbstractC64538b.AbstractC64539a
        /* renamed from: a */
        public void mo223231a(String str) {
            if (TextUtils.isEmpty(str) || str.length() != 6) {
                C64541c.this.f123081c.mo171471d("LoginVerifyCodePresenter", "onVertifyCodeChange error code");
                return;
            }
            C64541c.this.mo223238a(str);
            if (!((C64536a.AbstractC64537a) C64541c.this.mo171182e()).mo223228g()) {
                C49096b.m193584c();
            } else {
                C49096b.m193592g();
            }
        }

        @Override // com.ss.lark.android.passport.biz.compat.verify_code.mvp.C64536a.AbstractC64538b.AbstractC64539a
        /* renamed from: b */
        public void mo223233b(String str) {
            JSONObject e = ((C64536a.AbstractC64537a) C64541c.this.mo171182e()).mo223227e();
            if (e != null) {
                e.put("from", (Object) str);
            }
            C49092f.m193532a(C64541c.this.f162940d, "op_three_and_gov_face", ((C64536a.AbstractC64537a) C64541c.this.mo171182e()).mo223227e(), RouterScene.BEFORE_LOGIN.value, C64541c.this.f123080b, C64541c.this.f123081c, (AbstractC49336a) null);
        }
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d, com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49021b
    /* renamed from: a */
    public void mo171169a() {
        super.mo171169a();
        if (mo223240h()) {
            mo223241i();
        } else {
            mo223242j();
        }
        ((C64536a.AbstractC64538b) mo171181d()).mo223201a(((C64536a.AbstractC64537a) mo171182e()).cj_(), ((C64536a.AbstractC64537a) mo171182e()).mo223229h());
    }

    /* renamed from: h */
    public boolean mo223240h() {
        if (((C64536a.AbstractC64537a) mo171182e()).cj_() == null || !TextUtils.equals("contact_verify", ((C64536a.AbstractC64537a) mo171182e()).cj_().scope)) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public void mo223241i() {
        if (((C64536a.AbstractC64537a) mo171182e()).cj_() == null) {
            this.f123081c.mo171471d("LoginVerifyCodePresenter", "externalApplyCode VerifyBean is null");
        } else {
            ((C64536a.AbstractC64537a) mo171182e()).mo223223a(((C64536a.AbstractC64537a) mo171182e()).cj_().contact, ((C64536a.AbstractC64537a) mo171182e()).cj_().scope, new AbstractC49352d<V2ResponseModel<ApplyCodeData>>() {
                /* class com.ss.lark.android.passport.biz.compat.verify_code.mvp.C64541c.C645421 */

                @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
                /* renamed from: a */
                public void mo145178a(NetworkErrorResult networkErrorResult) {
                    PassportLog passportLog = C64541c.this.f123081c;
                    passportLog.mo171471d("LoginVerifyCodePresenter", "sendRequest externalApplyCode error " + networkErrorResult.toString());
                    UnknownCodeHandler.f123256a.mo171329a(C64541c.this.f162940d, networkErrorResult);
                }

                /* renamed from: a */
                public void mo145179a(V2ResponseModel<ApplyCodeData> v2ResponseModel) {
                    PassportLog passportLog = C64541c.this.f123081c;
                    passportLog.mo171465b("LoginVerifyCodePresenter", "sendRequest externalApplyCode success, code: " + v2ResponseModel.code);
                    if (v2ResponseModel.code == 0) {
                        ((C64536a.AbstractC64538b) C64541c.this.mo171181d()).mo223205d();
                    } else if (4206 == v2ResponseModel.code) {
                        C64541c.this.f123081c.mo171465b("LoginVerifyCodePresenter", "sendRequest externalApplyCode expire");
                        ApplyCodeErrorData applyCodeErrorData = (ApplyCodeErrorData) v2ResponseModel.data;
                        if (applyCodeErrorData != null) {
                            ((C64536a.AbstractC64538b) C64541c.this.mo171181d()).mo223200a(applyCodeErrorData.expire);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void mo223238a(String str) {
        String str2;
        this.f123081c.mo171465b("n_action_old_verify_code_req", "old verify code req start");
        if (((C64536a.AbstractC64537a) mo171182e()).cl_() == 3) {
            str2 = "forget_pwd";
        } else {
            str2 = "register_or_login";
        }
        final C49099a a = new C49099a("passport_enter_verify_code").mo171420a(ShareHitPoint.f121869d, str2).mo171417a();
        ((C64536a.AbstractC64538b) mo171181d()).mo223207f();
        ((C64536a.AbstractC64537a) mo171182e()).mo223222a(str, new AbstractC49352d<V2ResponseModel<BaseStepData>>() {
            /* class com.ss.lark.android.passport.biz.compat.verify_code.mvp.C64541c.C645443 */

            @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
            /* renamed from: a */
            public void mo145178a(NetworkErrorResult networkErrorResult) {
                a.mo171420a("result", "other").mo171421b().mo171422c();
                PassportLog passportLog = C64541c.this.f123081c;
                passportLog.mo171471d("n_action_old_verify_code_req_fail", "old verify code req failed, error: " + networkErrorResult);
                ((C64536a.AbstractC64538b) C64541c.this.mo171181d()).mo223209h();
                if (4202 == networkErrorResult.getErrorCode()) {
                    LKUIToast.show(C64541c.this.f162940d, networkErrorResult.getErrorMessage());
                } else {
                    UnknownCodeHandler.f123256a.mo171329a(C64541c.this.f162940d, networkErrorResult);
                }
                ((C64536a.AbstractC64538b) C64541c.this.mo171181d()).mo223208g();
            }

            /* renamed from: a */
            public void mo145179a(V2ResponseModel<BaseStepData> v2ResponseModel) {
                a.mo171420a("result", "success").mo171421b().mo171422c();
                if (v2ResponseModel.code == 0) {
                    BaseStepData baseStepData = (BaseStepData) v2ResponseModel.data;
                    if (C64541c.this.mo223240h()) {
                        String a = C49216a.m194036a().mo171739a("X-Verify-Token");
                        if (!TextUtils.isEmpty(a)) {
                            ((C64536a.AbstractC64538b) C64541c.this.mo171181d()).mo223203a(a, true);
                        } else {
                            ((C64536a.AbstractC64538b) C64541c.this.mo171181d()).mo223203a("getVerifyTokenFailed", false);
                        }
                    } else if (baseStepData == null) {
                        C64541c.this.f123081c.mo171471d("n_action_old_verify_code_req_fail", "old verify code req failed rsp data = null");
                        ((C64536a.AbstractC64538b) C64541c.this.mo171181d()).mo223208g();
                        mo145178a(new NetworkErrorResult());
                    } else {
                        PassportLog passportLog = C64541c.this.f123081c;
                        passportLog.mo171465b("n_action_old_verify_code_req_succ", "old verify code req success, next: " + baseStepData.nextStep);
                        C49092f.m193529a(C64541c.this.f162940d, baseStepData, RouterScene.ALL.value, C64541c.this.f123080b, C64541c.this.f123081c, new AbstractC49336a() {
                            /* class com.ss.lark.android.passport.biz.compat.verify_code.mvp.$$Lambda$c$3$TuI9qJdbLOr9TWjBZpmJMvX3N9g */

                            @Override // com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a
                            public final void onRouterResult(int i, Object obj) {
                                C64541c.C645443.lambda$TuI9qJdbLOr9TWjBZpmJMvX3N9g(C64541c.C645443.this, i, obj);
                            }
                        });
                    }
                } else {
                    ((C64536a.AbstractC64538b) C64541c.this.mo171181d()).mo223208g();
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m253592a(int i, Object obj) {
                if (i == -100) {
                    ((C64536a.AbstractC64538b) C64541c.this.mo171181d()).mo223208g();
                    ((C64536a.AbstractC64538b) C64541c.this.mo171181d()).mo223206e();
                    return;
                }
                ((C64536a.AbstractC64538b) C64541c.this.mo171181d()).mo223208g();
            }
        });
    }

    public C64541c(Activity activity, C64536a.AbstractC64537a aVar, C64536a.AbstractC64538b bVar, UniContext uniContext, PassportLog passportLog) {
        super(aVar, bVar, uniContext, passportLog);
        this.f162940d = activity;
    }
}
