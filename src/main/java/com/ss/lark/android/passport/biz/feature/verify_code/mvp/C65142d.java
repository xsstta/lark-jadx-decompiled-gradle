package com.ss.lark.android.passport.biz.feature.verify_code.mvp;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.suite.R;
import com.ss.android.lark.p2069j.p2070a.C40654u;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49021b;
import com.ss.android.lark.passport.infra.base.network.handler.UnknownCodeHandler;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.base.router.RouterScene;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.model.C49121a;
import com.ss.android.lark.passport.infra.util.C49202p;
import com.ss.android.lark.passport.infra.util.C49203q;
import com.ss.android.lark.passport.infra.util.storage.C49216a;
import com.ss.android.lark.passport.infra.watcher.WatcherHelper;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.base.network.ICallback;
import com.ss.android.lark.passport.signinsdk_api.base.network.ResponseModel;
import com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a;
import com.ss.lark.android.passport.biz.compat.v2.featurec.model.ApplyCodeErrorData;
import com.ss.lark.android.passport.biz.compat.v2.featurec.model.VerifyIdentityStepInfo;
import com.ss.lark.android.passport.biz.compat.v2.featurec.network.responese.ApplyCodeData;
import com.ss.lark.android.passport.biz.feature.verify_code.VerifyCodeStatisticsHelper;
import com.ss.lark.android.passport.biz.feature.verify_code.mvp.C65136b;
import com.ss.lark.android.passport.biz.feature.verify_code.mvp.C65142d;
import java.lang.reflect.Type;
import java.util.HashMap;

/* renamed from: com.ss.lark.android.passport.biz.feature.verify_code.mvp.d */
public class C65142d extends AbstractC49021b<C65136b.AbstractC65137a, C65136b.AbstractC65138b, C65136b.AbstractC65138b.AbstractC65139a> {

    /* renamed from: d */
    public final Activity f164060d;

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C65136b.AbstractC65138b.AbstractC65139a mo171180c() {
        return new C65147a();
    }

    /* renamed from: com.ss.lark.android.passport.biz.feature.verify_code.mvp.d$a */
    public class C65147a implements C65136b.AbstractC65138b.AbstractC65139a {
        @Override // com.ss.lark.android.passport.biz.feature.verify_code.mvp.C65136b.AbstractC65138b.AbstractC65139a
        /* renamed from: c */
        public int mo224356c() {
            return R.string.Lark_Login_DescOfAuthentication;
        }

        /* renamed from: f */
        public String mo224366f() {
            return ((C65136b.AbstractC65137a) C65142d.this.mo171182e()).mo224350e();
        }

        @Override // com.ss.lark.android.passport.biz.feature.verify_code.mvp.C65136b.AbstractC65138b.AbstractC65139a
        /* renamed from: b */
        public String mo224355b() {
            VerifyIdentityStepInfo.VerifyIdentifyBean c;
            if (C65142d.this.f164060d == null || (c = ((C65136b.AbstractC65137a) C65142d.this.mo171182e()).mo224347c()) == null) {
                return "";
            }
            return c.verifyCodeTip;
        }

        @Override // com.ss.lark.android.passport.biz.feature.verify_code.mvp.C65136b.AbstractC65138b.AbstractC65139a
        /* renamed from: d */
        public void mo224357d() {
            if (C65142d.this.mo224363h()) {
                ((C65136b.AbstractC65138b) C65142d.this.mo171181d()).mo224324a("cancelVerify", false);
                if (C49203q.m193977c(C65142d.this.f164060d)) {
                    C49203q.m193973a((Context) C65142d.this.f164060d);
                }
            }
            C65142d.this.f164060d.finish();
        }

        @Override // com.ss.lark.android.passport.biz.feature.verify_code.mvp.C65136b.AbstractC65138b.AbstractC65139a
        /* renamed from: e */
        public boolean mo224358e() {
            if (((C65136b.AbstractC65137a) C65142d.this.mo171182e()).mo224347c() == null || !TextUtils.equals("contact_verify", ((C65136b.AbstractC65137a) C65142d.this.mo171182e()).mo224347c().scope)) {
                return false;
            }
            return true;
        }

        @Override // com.ss.lark.android.passport.biz.feature.verify_code.mvp.C65136b.AbstractC65138b.AbstractC65139a
        /* renamed from: a */
        public void mo224352a() {
            if (C65142d.this.f164060d != null) {
                VerifyCodeStatisticsHelper.m255796d(mo224366f(), ((C65136b.AbstractC65137a) C65142d.this.mo171182e()).mo224347c());
                C65142d.this.f123081c.mo171465b("n_action_verify_code_verify", "verifyCode Regain");
                if (C65142d.this.mo224363h()) {
                    C65142d.this.mo224364i();
                } else {
                    C65142d.this.mo224365j();
                }
                ((C65136b.AbstractC65138b) C65142d.this.mo171181d()).mo224327d();
            }
        }

        public C65147a() {
        }

        @Override // com.ss.lark.android.passport.biz.feature.verify_code.mvp.C65136b.AbstractC65138b.AbstractC65139a
        /* renamed from: a */
        public void mo224354a(String str) {
            if (TextUtils.isEmpty(str) || str.length() != 6) {
                C65142d.this.f123081c.mo171471d("n_action_verify_code_verify", "onVerifyCodeChange error code");
            } else if ("otp_code".equals(mo224366f())) {
                C65142d.this.mo224361b(str);
            } else {
                C65142d.this.mo224360a(str);
            }
        }

        @Override // com.ss.lark.android.passport.biz.feature.verify_code.mvp.C65136b.AbstractC65138b.AbstractC65139a
        /* renamed from: a */
        public void mo224353a(int i) {
            final HashMap hashMap = new HashMap();
            hashMap.put("action", Integer.valueOf(i));
            C65142d.this.f123081c.mo171467b("n_action_account_retrieve_req", "retrieve req", hashMap);
            VerifyCodeStatisticsHelper.m255795b(mo224366f(), ((C65136b.AbstractC65137a) C65142d.this.mo171182e()).mo224347c());
            ((C65136b.AbstractC65138b) C65142d.this.mo171181d()).mo224329f();
            ((C65136b.AbstractC65137a) C65142d.this.mo171182e()).mo224342a(i, new AbstractC49352d<BaseStepData>() {
                /* class com.ss.lark.android.passport.biz.feature.verify_code.mvp.C65142d.C65147a.C651481 */

                @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
                /* renamed from: a */
                public void mo145178a(NetworkErrorResult networkErrorResult) {
                    PassportLog passportLog = C65142d.this.f123081c;
                    passportLog.mo171472d("n_action_account_retrieve_req_fail", "doRetrieve failed, error: " + networkErrorResult, hashMap);
                    ((C65136b.AbstractC65138b) C65142d.this.mo171181d()).mo224330g();
                }

                /* renamed from: a */
                public void mo145179a(BaseStepData baseStepData) {
                    ((C65136b.AbstractC65138b) C65142d.this.mo171181d()).mo224330g();
                    PassportLog passportLog = C65142d.this.f123081c;
                    passportLog.mo171467b("n_action_account_retrieve_req_succ", "doRetrieve success, next: " + baseStepData.nextStep, hashMap);
                    C49092f.m193529a(C65142d.this.f164060d, baseStepData, RouterScene.ALL.value, C65142d.this.f123080b, C65142d.this.f123081c, (AbstractC49336a) null);
                }
            });
        }
    }

    /* renamed from: j */
    public void mo224365j() {
        this.f123081c.mo171465b("n_action_verify_code_apply", "applyCode start");
        ((C65136b.AbstractC65137a) mo171182e()).mo224343a(new ICallback<ApplyCodeData>() {
            /* class com.ss.lark.android.passport.biz.feature.verify_code.mvp.C65142d.C651442 */

            @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
            /* renamed from: a */
            public Type mo101474a() {
                return ApplyCodeData.class;
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
            /* renamed from: a */
            public void mo101475a(NetworkErrorResult networkErrorResult) {
                C65142d.this.f123081c.mo171471d("n_action_verify_code_apply", PassportLog.m193687a("sendRequest apply Code error", networkErrorResult));
                UnknownCodeHandler.f123256a.mo171331c(C65142d.this.f164060d, networkErrorResult);
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
            /* renamed from: a */
            public void mo101476a(ResponseModel<ApplyCodeData> responseModel) {
                PassportLog passportLog = C65142d.this.f123081c;
                passportLog.mo171465b("n_action_verify_code_apply", "sendRequest apply Code suc, code: " + responseModel.getCode());
                if (responseModel.getCode() == 0) {
                    WatcherHelper.m193664a(C65142d.this.f123080b, C40654u.f103180c);
                    ((C65136b.AbstractC65138b) C65142d.this.mo171181d()).mo224327d();
                } else if (4206 == responseModel.getCode()) {
                    C65142d.this.f123081c.mo171465b("n_action_verify_code_apply", "sendRequest apply Code expire");
                    ApplyCodeErrorData applyCodeErrorData = (ApplyCodeErrorData) JSON.parseObject(responseModel.getOriginData().getString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE), ApplyCodeErrorData.class);
                    if (applyCodeErrorData != null) {
                        ((C65136b.AbstractC65138b) C65142d.this.mo171181d()).mo224319a(applyCodeErrorData.expire);
                    }
                } else {
                    PassportLog passportLog2 = C65142d.this.f123081c;
                    passportLog2.mo171468c("n_action_verify_code_apply", "sendRequest apply Code" + responseModel.getOriginData().toJSONString());
                }
            }
        });
    }

    /* renamed from: h */
    public boolean mo224363h() {
        if (((C65136b.AbstractC65137a) mo171182e()).mo224347c() == null || !TextUtils.equals("contact_verify", ((C65136b.AbstractC65137a) mo171182e()).cB_().scope)) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public void mo224364i() {
        if (((C65136b.AbstractC65137a) mo171182e()).mo224347c() == null) {
            this.f123081c.mo171471d("n_action_verify_code_apply", "externalApplyCode VerifyBean is null");
            return;
        }
        this.f123081c.mo171465b("n_action_verify_code_apply", "externalApplyCode start");
        ((C65136b.AbstractC65137a) mo171182e()).mo224346b(new ICallback<ApplyCodeData>() {
            /* class com.ss.lark.android.passport.biz.feature.verify_code.mvp.C65142d.C651431 */

            @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
            /* renamed from: a */
            public Type mo101474a() {
                return ApplyCodeData.class;
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
            /* renamed from: a */
            public void mo101475a(NetworkErrorResult networkErrorResult) {
                PassportLog passportLog = C65142d.this.f123081c;
                passportLog.mo171471d("n_action_verify_code_apply", "sendRequest externalApplyCode error " + networkErrorResult.toString());
                UnknownCodeHandler.f123256a.mo171331c(C65142d.this.f164060d, networkErrorResult);
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
            /* renamed from: a */
            public void mo101476a(ResponseModel<ApplyCodeData> responseModel) {
                PassportLog passportLog = C65142d.this.f123081c;
                passportLog.mo171465b("n_action_verify_code_apply", "sendRequest externalApplyCode success, code: " + responseModel.getCode());
                if (responseModel.getCode() == 0) {
                    ((C65136b.AbstractC65138b) C65142d.this.mo171181d()).mo224327d();
                } else if (4206 == responseModel.getCode()) {
                    C65142d.this.f123081c.mo171465b("n_action_verify_code_apply", "sendRequest externalApplyCode expire");
                    ApplyCodeErrorData applyCodeErrorData = (ApplyCodeErrorData) JSON.parseObject(responseModel.getOriginData().getString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE), ApplyCodeErrorData.class);
                    if (applyCodeErrorData != null) {
                        ((C65136b.AbstractC65138b) C65142d.this.mo171181d()).mo224319a(applyCodeErrorData.expire);
                    }
                }
            }
        });
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d, com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49021b
    /* renamed from: a */
    public void mo171169a() {
        boolean z;
        VerifyIdentityStepInfo.VerifyIdentifyBean.RetrieveInfo retrieveInfo;
        super.mo171169a();
        if (!"otp_code".equals(((C65136b.AbstractC65137a) mo171182e()).mo224350e())) {
            if (mo224363h()) {
                mo224364i();
            } else {
                mo224365j();
            }
        }
        VerifyIdentityStepInfo.VerifyIdentifyBean c = ((C65136b.AbstractC65137a) mo171182e()).mo224347c();
        if (c != null) {
            ((C65136b.AbstractC65138b) mo171181d()).mo224320a(((C65136b.AbstractC65137a) mo171182e()).mo224347c(), ((C65136b.AbstractC65137a) mo171182e()).mo224350e(), ((C65136b.AbstractC65137a) mo171182e()).cC_(), ((C65136b.AbstractC65137a) mo171182e()).mo224351g());
            boolean c2 = C49121a.m193727a().mo171509c(4);
            boolean z2 = true;
            if (c.retrieveButton == null || c.retrieveButton.next == null || (retrieveInfo = (VerifyIdentityStepInfo.VerifyIdentifyBean.RetrieveInfo) C49202p.m193967a(c.retrieveButton.next.stepInfo, VerifyIdentityStepInfo.VerifyIdentifyBean.RetrieveInfo.class)) == null) {
                z = false;
            } else {
                String e = ((C65136b.AbstractC65137a) mo171182e()).mo224350e();
                if (c2) {
                    ((C65136b.AbstractC65138b) mo171181d()).mo224323a(c.retrieveButton.text, retrieveInfo.action, e);
                }
                z = true;
            }
            C65136b.AbstractC65138b bVar = (C65136b.AbstractC65138b) mo171181d();
            if (!c2 || !z) {
                z2 = false;
            }
            bVar.mo224325a(z2);
        }
    }

    /* renamed from: a */
    public void mo224360a(String str) {
        this.f123081c.mo171465b("n_action_verify_code_verify", "send verifyCode");
        ((C65136b.AbstractC65138b) mo171181d()).mo224329f();
        ((C65136b.AbstractC65137a) mo171182e()).mo224345a(str, mo224363h(), new ICallback<BaseStepData>() {
            /* class com.ss.lark.android.passport.biz.feature.verify_code.mvp.C65142d.C651453 */

            @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
            /* renamed from: a */
            public Type mo101474a() {
                return BaseStepData.class;
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
            /* renamed from: a */
            public void mo101475a(NetworkErrorResult networkErrorResult) {
                VerifyCodeStatisticsHelper.m255794a(((C65136b.AbstractC65137a) C65142d.this.mo171182e()).mo224350e(), ((C65136b.AbstractC65137a) C65142d.this.mo171182e()).mo224347c(), false);
                C65142d.this.f123081c.mo171471d("n_action_verify_code_verify", PassportLog.m193687a("sendRequst verifyCode error", networkErrorResult));
                ((C65136b.AbstractC65138b) C65142d.this.mo171181d()).mo224331h();
                if (4202 == networkErrorResult.getErrorCode()) {
                    LKUIToast.show(C65142d.this.f164060d, networkErrorResult.getErrorMessage());
                } else {
                    UnknownCodeHandler.f123256a.mo171329a(C65142d.this.f164060d, networkErrorResult);
                }
                ((C65136b.AbstractC65138b) C65142d.this.mo171181d()).mo224330g();
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
            /* renamed from: a */
            public void mo101476a(ResponseModel<BaseStepData> responseModel) {
                VerifyCodeStatisticsHelper.m255794a(((C65136b.AbstractC65137a) C65142d.this.mo171182e()).mo224350e(), ((C65136b.AbstractC65137a) C65142d.this.mo171182e()).mo224347c(), true);
                PassportLog passportLog = C65142d.this.f123081c;
                passportLog.mo171465b("n_action_verify_code_verify", "sendRequst verifyCode suc, code: " + responseModel.getCode());
                if (responseModel.getCode() == 0) {
                    BaseStepData data = responseModel.getData();
                    if (C65142d.this.mo224363h()) {
                        if (data != null && data.stepInfo != null) {
                            String string = data.stepInfo.getString("verify_token_key");
                            if (!TextUtils.isEmpty(string)) {
                                C49216a.m194036a().mo171740a("X-Verify-Token", string);
                                ((C65136b.AbstractC65138b) C65142d.this.mo171181d()).mo224324a(string, true);
                                return;
                            }
                            ((C65136b.AbstractC65138b) C65142d.this.mo171181d()).mo224324a("getVerifyTokenFailed", false);
                        }
                    } else if (data == null) {
                        C65142d.this.f123081c.mo171471d("n_action_verify_code_verify", "verifyCode rsp data = null");
                        ((C65136b.AbstractC65138b) C65142d.this.mo171181d()).mo224330g();
                        mo101475a(new NetworkErrorResult());
                    } else {
                        PassportLog passportLog2 = C65142d.this.f123081c;
                        passportLog2.mo171465b("n_action_verify_code_verify", "sendRequest verifyCode nextStep " + data.nextStep);
                        if (!(data.stepInfo == null || C65142d.this.mo171182e() == null || ((C65136b.AbstractC65137a) C65142d.this.mo171182e()).cB_() == null)) {
                            data.stepInfo.put("from_recover_account", (Object) Boolean.valueOf(((C65136b.AbstractC65137a) C65142d.this.mo171182e()).cB_().fromRecoverAccount));
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put("next_step", data.nextStep);
                        WatcherHelper.m193665a(C65142d.this.f123080b, C40654u.f103181d, hashMap);
                        ((C65136b.AbstractC65138b) C65142d.this.mo171181d()).mo224330g();
                        C49092f.m193529a(C65142d.this.f164060d, data, RouterScene.ALL.value, C65142d.this.f123080b, C65142d.this.f123081c, new AbstractC49336a() {
                            /* class com.ss.lark.android.passport.biz.feature.verify_code.mvp.$$Lambda$d$3$JG2bx97ZcCSKMw2bsVPAuYdems */

                            @Override // com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a
                            public final void onRouterResult(int i, Object obj) {
                                C65142d.C651453.m271541lambda$JG2bx97ZcCSKMw2bsVPAuYdems(C65142d.C651453.this, i, obj);
                            }
                        });
                    }
                } else {
                    ((C65136b.AbstractC65138b) C65142d.this.mo171181d()).mo224330g();
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m255883a(int i, Object obj) {
                ((C65136b.AbstractC65138b) C65142d.this.mo171181d()).mo224328e();
            }
        });
    }

    /* renamed from: b */
    public void mo224361b(String str) {
        this.f123081c.mo171465b("n_action_otp_verify", "send verifyOtp");
        ((C65136b.AbstractC65138b) mo171181d()).mo224329f();
        ((C65136b.AbstractC65137a) mo171182e()).mo224344a(str, new ICallback<BaseStepData>() {
            /* class com.ss.lark.android.passport.biz.feature.verify_code.mvp.C65142d.C651464 */

            @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
            /* renamed from: a */
            public Type mo101474a() {
                return BaseStepData.class;
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
            /* renamed from: a */
            public void mo101475a(NetworkErrorResult networkErrorResult) {
                VerifyCodeStatisticsHelper.m255794a(((C65136b.AbstractC65137a) C65142d.this.mo171182e()).mo224350e(), ((C65136b.AbstractC65137a) C65142d.this.mo171182e()).mo224347c(), false);
                ((C65136b.AbstractC65138b) C65142d.this.mo171181d()).mo224330g();
                PassportLog passportLog = C65142d.this.f123081c;
                passportLog.mo171471d("n_action_otp_verify", "sendRequest verifyOtp error " + networkErrorResult.toString());
                if (4202 == networkErrorResult.getErrorCode()) {
                    LKUIToast.show(C65142d.this.f164060d, networkErrorResult.getErrorMessage());
                    ((C65136b.AbstractC65138b) C65142d.this.mo171181d()).mo224331h();
                }
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
            /* renamed from: a */
            public void mo101476a(ResponseModel<BaseStepData> responseModel) {
                VerifyCodeStatisticsHelper.m255794a(((C65136b.AbstractC65137a) C65142d.this.mo171182e()).mo224350e(), ((C65136b.AbstractC65137a) C65142d.this.mo171182e()).mo224347c(), true);
                C65142d.this.f123081c.mo171465b("n_action_otp_verify", "sendRequst verifyOtp suc ");
                if (responseModel.getCode() == 0) {
                    BaseStepData data = responseModel.getData();
                    if (data == null) {
                        ((C65136b.AbstractC65138b) C65142d.this.mo171181d()).mo224330g();
                        C65142d.this.f123081c.mo171471d("n_action_otp_verify", "verifyOtp rsp data = null");
                        mo101475a(new NetworkErrorResult(-1, "onSuccess unknown empty"));
                        return;
                    }
                    PassportLog passportLog = C65142d.this.f123081c;
                    passportLog.mo171465b("n_action_otp_verify", "sendRequest verifyOtp nextStep " + data.getNextStep());
                    HashMap hashMap = new HashMap();
                    hashMap.put("next_step", data.nextStep);
                    WatcherHelper.m193665a(C65142d.this.f123080b, C40654u.f103183f, hashMap);
                    C49092f.m193529a(C65142d.this.f164060d, data, RouterScene.ALL.value, C65142d.this.f123080b, C65142d.this.f123081c, new AbstractC49336a() {
                        /* class com.ss.lark.android.passport.biz.feature.verify_code.mvp.$$Lambda$d$4$HFSJEROIGgZe9XWW6E8rm45N1a8 */

                        @Override // com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a
                        public final void onRouterResult(int i, Object obj) {
                            C65142d.C651464.lambda$HFSJEROIGgZe9XWW6E8rm45N1a8(C65142d.C651464.this, i, obj);
                        }
                    });
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m255887a(int i, Object obj) {
                ((C65136b.AbstractC65138b) C65142d.this.mo171181d()).mo224330g();
                ((C65136b.AbstractC65138b) C65142d.this.mo171181d()).mo224328e();
            }
        });
    }

    public C65142d(Activity activity, C65136b.AbstractC65137a aVar, C65136b.AbstractC65138b bVar, UniContext uniContext, PassportLog passportLog) {
        super(aVar, bVar, uniContext, passportLog);
        this.f164060d = activity;
    }
}
