package com.ss.lark.android.passport.biz.feature.input_pwd.mvp;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.suite.R;
import com.ss.android.lark.p2069j.p2070a.C40654u;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49021b;
import com.ss.android.lark.passport.infra.base.network.handler.UnknownCodeHandler;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.base.router.RouterScene;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.util.C49202p;
import com.ss.android.lark.passport.infra.watcher.WatcherHelper;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.base.network.ICallback;
import com.ss.android.lark.passport.signinsdk_api.base.network.ResponseModel;
import com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a;
import com.ss.lark.android.passport.biz.compat.v2.featurec.model.VerifyIdentityStepInfo;
import com.ss.lark.android.passport.biz.compat.v2.featurec.network.responese.VerifyPwdData;
import com.ss.lark.android.passport.biz.feature.input_pwd.PwdVerifyStatisticsHelper;
import com.ss.lark.android.passport.biz.feature.input_pwd.mvp.C64787a;
import java.lang.reflect.Type;
import java.util.HashMap;

/* renamed from: com.ss.lark.android.passport.biz.feature.input_pwd.mvp.c */
public class C64793c extends AbstractC49021b<C64787a.AbstractC64788a, C64787a.AbstractC64789b, C64787a.AbstractC64789b.AbstractC64790a> {

    /* renamed from: d */
    public final Activity f163378d;

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d, com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49021b
    /* renamed from: a */
    public void mo171169a() {
        super.mo171169a();
        mo223679h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C64787a.AbstractC64789b.AbstractC64790a mo171180c() {
        return new C64794a();
    }

    /* renamed from: h */
    public void mo223679h() {
        VerifyIdentityStepInfo.VerifyIdentifyBean.RetrieveInfo retrieveInfo;
        VerifyIdentityStepInfo cm_ = ((C64787a.AbstractC64788a) mo171182e()).cm_();
        if (cm_ != null) {
            VerifyIdentityStepInfo.VerifyIdentifyBean verifyIdentifyBean = cm_.verifyPwd;
            ((C64787a.AbstractC64789b) mo171181d()).mo223659a(verifyIdentifyBean);
            if (verifyIdentifyBean != null && verifyIdentifyBean.retrieveButton != null && verifyIdentifyBean.retrieveButton.next != null && (retrieveInfo = (VerifyIdentityStepInfo.VerifyIdentifyBean.RetrieveInfo) C49202p.m193967a(verifyIdentifyBean.retrieveButton.next.stepInfo, VerifyIdentityStepInfo.VerifyIdentifyBean.RetrieveInfo.class)) != null) {
                ((C64787a.AbstractC64789b) mo171181d()).mo223661a(verifyIdentifyBean.retrieveButton.text, retrieveInfo.action);
                return;
            }
            return;
        }
        this.f123081c.mo171465b("n_page_verify_pwd_start", "init pwd page, null stepinfo");
    }

    /* renamed from: com.ss.lark.android.passport.biz.feature.input_pwd.mvp.c$a */
    public class C64794a implements AbstractC49336a, C64787a.AbstractC64789b.AbstractC64790a {
        @Override // com.ss.lark.android.passport.biz.feature.input_pwd.mvp.C64787a.AbstractC64789b.AbstractC64790a
        /* renamed from: a */
        public boolean mo223676a() {
            return false;
        }

        public C64794a() {
        }

        @Override // com.ss.lark.android.passport.biz.feature.input_pwd.mvp.C64787a.AbstractC64789b.AbstractC64790a
        /* renamed from: b */
        public boolean mo223677b(String str) {
            return !TextUtils.isEmpty(str);
        }

        @Override // com.ss.lark.android.passport.biz.feature.input_pwd.mvp.C64787a.AbstractC64789b.AbstractC64790a
        /* renamed from: a */
        public void mo223674a(int i) {
            C64793c.this.f123081c.mo171465b("n_action_verify_pwd_reset", "start reset");
            ((C64787a.AbstractC64789b) C64793c.this.mo171181d()).mo223662d();
            ((C64787a.AbstractC64788a) C64793c.this.mo171182e()).mo223670a(i, new AbstractC49352d<BaseStepData>() {
                /* class com.ss.lark.android.passport.biz.feature.input_pwd.mvp.C64793c.C64794a.C647951 */

                @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
                /* renamed from: a */
                public void mo145178a(NetworkErrorResult networkErrorResult) {
                    C64793c.this.f123081c.mo171471d("n_action_verify_pwd_reset", "resetPwd onError");
                    ((C64787a.AbstractC64789b) C64793c.this.mo171181d()).mo223663e();
                }

                /* renamed from: a */
                public void mo145179a(BaseStepData baseStepData) {
                    ((C64787a.AbstractC64789b) C64793c.this.mo171181d()).mo223663e();
                    if (baseStepData != null) {
                        C64793c.this.f123081c.mo171465b("n_action_verify_pwd_reset", "resetPwd onSuccess");
                        C49092f.m193532a(C64793c.this.f163378d, baseStepData.nextStep, baseStepData.stepInfo, RouterScene.ALL.value, C64793c.this.f123080b, C64793c.this.f123081c, (AbstractC49336a) null);
                        return;
                    }
                    C64793c.this.f123081c.mo171471d("n_action_verify_pwd_reset", "parse reset json error");
                }
            });
        }

        @Override // com.ss.lark.android.passport.biz.feature.input_pwd.mvp.C64787a.AbstractC64789b.AbstractC64790a
        /* renamed from: a */
        public String mo223673a(Context context) {
            if (((C64787a.AbstractC64788a) C64793c.this.mo171182e()).cm_() == null || ((C64787a.AbstractC64788a) C64793c.this.mo171182e()).cm_().verifyPwd == null || ((C64787a.AbstractC64788a) C64793c.this.mo171182e()).cm_().verifyPwd.input_box == null) {
                return C64793c.this.f163378d.getResources().getString(R.string.Lark_Login_V3_InputPasswordPlaceholder);
            }
            return ((C64787a.AbstractC64788a) C64793c.this.mo171182e()).cm_().verifyPwd.input_box.placeholder;
        }

        @Override // com.ss.lark.android.passport.biz.feature.input_pwd.mvp.C64787a.AbstractC64789b.AbstractC64790a
        /* renamed from: a */
        public void mo223675a(String str) {
            if (((C64787a.AbstractC64788a) C64793c.this.mo171182e()).cm_() == null || ((C64787a.AbstractC64788a) C64793c.this.mo171182e()).cm_().verifyPwd == null) {
                C64793c.this.f123081c.mo171471d("n_action_verify_pwd_next", "VerifyIdentityStepInfo is null");
                return;
            }
            ((C64787a.AbstractC64789b) C64793c.this.mo171181d()).mo223662d();
            ((C64787a.AbstractC64788a) C64793c.this.mo171182e()).mo223671a(str, new ICallback<VerifyPwdData>() {
                /* class com.ss.lark.android.passport.biz.feature.input_pwd.mvp.C64793c.C64794a.C647962 */

                @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
                /* renamed from: a */
                public Type mo101474a() {
                    return VerifyPwdData.class;
                }

                @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
                /* renamed from: a */
                public void mo101475a(NetworkErrorResult networkErrorResult) {
                    PwdVerifyStatisticsHelper.m254423a(((C64787a.AbstractC64788a) C64793c.this.mo171182e()).cm_().verifyPwd.flowType, false);
                    PassportLog passportLog = C64793c.this.f123081c;
                    passportLog.mo171471d("n_action_verify_pwd_next", "VerifyPwd error " + networkErrorResult.toString());
                    ((C64787a.AbstractC64789b) C64793c.this.mo171181d()).mo223663e();
                    if (networkErrorResult.getErrorCode() == 4203) {
                        LKUIToast.show(C64793c.this.f163378d, networkErrorResult.getErrorMessage());
                        ((C64787a.AbstractC64789b) C64793c.this.mo171181d()).mo223664f();
                        return;
                    }
                    UnknownCodeHandler.f123256a.mo171329a(C64793c.this.f163378d, networkErrorResult);
                }

                @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
                /* renamed from: a */
                public void mo101476a(ResponseModel<VerifyPwdData> responseModel) {
                    PwdVerifyStatisticsHelper.m254423a(((C64787a.AbstractC64788a) C64793c.this.mo171182e()).cm_().verifyPwd.flowType, true);
                    PassportLog passportLog = C64793c.this.f123081c;
                    passportLog.mo171465b("n_action_verify_pwd_next", "VerifyPwd suc, code: " + responseModel.getCode());
                    if (responseModel.getCode() == 0) {
                        VerifyPwdData data = responseModel.getData();
                        if (data == null) {
                            C64793c.this.f123081c.mo171471d("n_action_verify_pwd_next", "verifyPwd rsp data = null");
                            mo101475a(new NetworkErrorResult());
                            ((C64787a.AbstractC64789b) C64793c.this.mo171181d()).mo223663e();
                            return;
                        }
                        PassportLog passportLog2 = C64793c.this.f123081c;
                        passportLog2.mo171465b("n_action_verify_pwd_next", "verifyPwd nextStep " + data.nextStep);
                        HashMap hashMap = new HashMap();
                        hashMap.put("next_step", data.nextStep);
                        WatcherHelper.m193665a(C64793c.this.f123080b, C40654u.f103182e, hashMap);
                        C49092f.m193529a(C64793c.this.f163378d, data, RouterScene.ALL.value, C64793c.this.f123080b, C64793c.this.f123081c, new AbstractC49336a() {
                            /* class com.ss.lark.android.passport.biz.feature.input_pwd.mvp.C64793c.C64794a.C647962.C647971 */

                            @Override // com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a
                            public void onRouterResult(int i, Object obj) {
                                ((C64787a.AbstractC64789b) C64793c.this.mo171181d()).mo223663e();
                                ((C64787a.AbstractC64789b) C64793c.this.mo171181d()).mo223665g();
                            }
                        });
                    }
                }
            });
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a
        public void onRouterResult(int i, Object obj) {
            ((C64787a.AbstractC64789b) C64793c.this.mo171181d()).mo223663e();
        }
    }

    public C64793c(Activity activity, C64787a.AbstractC64788a aVar, C64787a.AbstractC64789b bVar, UniContext uniContext, PassportLog passportLog) {
        super(aVar, bVar, uniContext, passportLog);
        this.f163378d = activity;
    }
}
