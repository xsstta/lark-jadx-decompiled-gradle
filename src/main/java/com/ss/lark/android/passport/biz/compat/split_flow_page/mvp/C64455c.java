package com.ss.lark.android.passport.biz.compat.split_flow_page.mvp;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.larksuite.component.ui.toast.LKUIToast;
import com.ss.android.bytedcert.callback.SDKCallBack;
import com.ss.android.bytedcert.net.BDResponse;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49021b;
import com.ss.android.lark.passport.infra.base.network.handler.UnknownCodeHandler;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.base.router.RouterScene;
import com.ss.android.lark.passport.infra.base.statistics.C49096b;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a;
import com.ss.lark.android.passport.biz.C64282a;
import com.ss.lark.android.passport.biz.compat.split_flow_page.mvp.C64450a;
import com.ss.lark.android.passport.biz.compat.v2.featurec.model.SpliteStepInfo;
import com.ss.lark.android.passport.biz.compat.v2.featurec.network.responese.RefreshTicketData;

/* renamed from: com.ss.lark.android.passport.biz.compat.split_flow_page.mvp.c */
public class C64455c extends AbstractC49021b<C64450a.AbstractC64451a, C64450a.AbstractC64452b, C64450a.AbstractC64452b.AbstractC64453a> {

    /* renamed from: d */
    public Context f162773d;

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C64450a.AbstractC64452b.AbstractC64453a mo171180c() {
        return new C64450a.AbstractC64452b.AbstractC64453a() {
            /* class com.ss.lark.android.passport.biz.compat.split_flow_page.mvp.C64455c.C644582 */

            @Override // com.ss.lark.android.passport.biz.compat.split_flow_page.mvp.C64450a.AbstractC64452b.AbstractC64453a
            /* renamed from: a */
            public void mo223042a() {
                if (((C64450a.AbstractC64451a) C64455c.this.mo171182e()).ch_()) {
                    ((C64450a.AbstractC64452b) C64455c.this.mo171181d()).mo223027d();
                    ((C64450a.AbstractC64451a) C64455c.this.mo171182e()).mo223035b(new AbstractC49352d<RefreshTicketData>() {
                        /* class com.ss.lark.android.passport.biz.compat.split_flow_page.mvp.C64455c.C644582.C644602 */

                        @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
                        /* renamed from: a */
                        public void mo145178a(NetworkErrorResult networkErrorResult) {
                            ((C64450a.AbstractC64452b) C64455c.this.mo171181d()).mo223028e();
                            PassportLog passportLog = C64455c.this.f123081c;
                            PassportLog passportLog2 = C64455c.this.f123081c;
                            passportLog.mo171471d("SplitFlowPagePresenter", PassportLog.m193687a("refreshTicket failed", networkErrorResult));
                            UnknownCodeHandler.f123256a.mo171329a(C64455c.this.f162773d, networkErrorResult);
                        }

                        /* renamed from: a */
                        public void mo145179a(RefreshTicketData refreshTicketData) {
                            ((C64450a.AbstractC64452b) C64455c.this.mo171181d()).mo223028e();
                            C64455c.this.f123081c.mo171465b("SplitFlowPagePresenter", "refreshTicket success");
                            if (refreshTicketData == null || TextUtils.isEmpty(refreshTicketData.getTicket())) {
                                C64455c.this.f123081c.mo171471d("SplitFlowPagePresenter", "the ticket is null");
                                return;
                            }
                            C644582 r0 = C644582.this;
                            r0.mo223048a(((C64450a.AbstractC64451a) C64455c.this.mo171182e()).mo223040g(), ((C64450a.AbstractC64451a) C64455c.this.mo171182e()).mo223041h(), refreshTicketData.getTicket());
                        }
                    });
                }
            }

            @Override // com.ss.lark.android.passport.biz.compat.split_flow_page.mvp.C64450a.AbstractC64452b.AbstractC64453a
            /* renamed from: b */
            public void mo223043b() {
                JSONObject jSONObject;
                SpliteStepInfo cf_ = ((C64450a.AbstractC64451a) C64455c.this.mo171182e()).cf_();
                if (cf_ == null || cf_.next == null) {
                    jSONObject = null;
                } else {
                    jSONObject = new JSONObject(cf_.next.verifyIdentity);
                }
                try {
                    C49092f.m193532a(C64455c.this.f162773d, "new_verify_identity", jSONObject, RouterScene.ALL.value, C64455c.this.f123080b, C64455c.this.f123081c, (AbstractC49336a) null);
                } catch (Exception e) {
                    C64455c.this.f123081c.mo171471d("SplitFlowPagePresenter", "jump to verify identity failed");
                    e.printStackTrace();
                }
            }

            /* renamed from: a */
            public void mo223048a(String str, String str2, String str3) {
                final SpliteStepInfo cf_ = ((C64450a.AbstractC64451a) C64455c.this.mo171182e()).cf_();
                if (((C64450a.AbstractC64451a) C64455c.this.mo171182e()).ch_()) {
                    C64455c.this.f123081c.mo171465b("SplitFlowPagePresenter", "start byteCert");
                    C64282a.m252790a().mo222762a((Activity) C64455c.this.f162773d, str3, str, str2, ((C64450a.AbstractC64451a) C64455c.this.mo171182e()).mo223039e(), ((C64450a.AbstractC64451a) C64455c.this.mo171182e()).cg_(), C64455c.this.f123081c, new SDKCallBack.FaceLiveCallback() {
                        /* class com.ss.lark.android.passport.biz.compat.split_flow_page.mvp.C64455c.C644582.C644591 */

                        @Override // com.ss.android.bytedcert.callback.SDKCallBack.FaceLiveCallback
                        public void onFaceLiveFinish(BDResponse bDResponse) {
                            if (bDResponse == null) {
                                C64455c.this.f123081c.mo171471d("SplitFlowPagePresenter", "BDResponse is null");
                                return;
                            }
                            ((C64450a.AbstractC64452b) C64455c.this.mo171181d()).mo223024a(cf_, "FaceVerification_Result", bDResponse.success);
                            if (bDResponse.success) {
                                C64455c.this.f123081c.mo171465b("SplitFlowPagePresenter", "BDResponse success");
                                if (((C64450a.AbstractC64451a) C64455c.this.mo171182e()).cg_() == 0) {
                                    C64455c.this.mo223044g();
                                } else {
                                    C64455c.this.mo223046i();
                                }
                            } else {
                                PassportLog passportLog = C64455c.this.f123081c;
                                passportLog.mo171471d("SplitFlowPagePresenter", "BDResponse is error " + bDResponse.errorMsg + " " + bDResponse.errorCode);
                                if (!TextUtils.isEmpty(bDResponse.errorMsg)) {
                                    LKUIToast.show(C64455c.this.f162773d, bDResponse.errorMsg);
                                }
                            }
                        }
                    });
                    return;
                }
                C64455c.this.f123081c.mo171471d("SplitFlowPagePresenter", "checkFaceVerifyInfo failed");
            }
        };
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d, com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49021b
    /* renamed from: a */
    public void mo171169a() {
        super.mo171169a();
        ((C64450a.AbstractC64452b) mo171181d()).mo223023a(((C64450a.AbstractC64451a) mo171182e()).cf_());
    }

    /* renamed from: g */
    public void mo223044g() {
        ((C64450a.AbstractC64452b) mo171181d()).mo223027d();
        this.f123081c.mo171465b("SplitFlowPagePresenter", "BDResponse sendRecoverFaceTicket");
        ((C64450a.AbstractC64451a) mo171182e()).mo223034a(new AbstractC49352d<BaseStepData>() {
            /* class com.ss.lark.android.passport.biz.compat.split_flow_page.mvp.C64455c.C644561 */

            @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
            /* renamed from: a */
            public void mo145178a(NetworkErrorResult networkErrorResult) {
                ((C64450a.AbstractC64452b) C64455c.this.mo171181d()).mo223028e();
                PassportLog passportLog = C64455c.this.f123081c;
                PassportLog passportLog2 = C64455c.this.f123081c;
                passportLog.mo171471d("SplitFlowPagePresenter", PassportLog.m193687a("sendRecoverFaceTicket failed", networkErrorResult));
                C49096b.m193583b(((C64450a.AbstractC64451a) C64455c.this.mo171182e()).cf_().from, false);
                UnknownCodeHandler.f123256a.mo171329a(C64455c.this.f162773d, networkErrorResult);
            }

            /* renamed from: a */
            public void mo145179a(BaseStepData baseStepData) {
                ((C64450a.AbstractC64452b) C64455c.this.mo171181d()).mo223028e();
                C64455c.this.f123081c.mo171465b("SplitFlowPagePresenter", "sendRecoverFaceTicket success");
                C49096b.m193583b(((C64450a.AbstractC64451a) C64455c.this.mo171182e()).cf_().from, true);
                C49092f.m193532a(C64455c.this.f162773d, baseStepData.nextStep, baseStepData.stepInfo, RouterScene.ALL.value, C64455c.this.f123080b, C64455c.this.f123081c, new AbstractC49336a() {
                    /* class com.ss.lark.android.passport.biz.compat.split_flow_page.mvp.C64455c.C644561.C644571 */

                    @Override // com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a
                    public void onRouterResult(int i, Object obj) {
                        ((C64450a.AbstractC64452b) C64455c.this.mo171181d()).mo223029f();
                    }
                });
            }
        });
    }

    /* renamed from: i */
    public void mo223046i() {
        this.f123081c.mo171465b("SplitFlowPagePresenter", "BDResponse sendBioAuthVerify");
        ((C64450a.AbstractC64452b) mo171181d()).mo223027d();
        ((C64450a.AbstractC64451a) mo171182e()).mo223033a(((C64450a.AbstractC64451a) mo171182e()).cg_(), new AbstractC49352d<BaseStepData>() {
            /* class com.ss.lark.android.passport.biz.compat.split_flow_page.mvp.C64455c.C644613 */

            @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
            /* renamed from: a */
            public void mo145178a(NetworkErrorResult networkErrorResult) {
                PassportLog passportLog = C64455c.this.f123081c;
                PassportLog passportLog2 = C64455c.this.f123081c;
                passportLog.mo171471d("SplitFlowPagePresenter", PassportLog.m193687a("sendBioAuthVerify failed:", networkErrorResult));
                ((C64450a.AbstractC64452b) C64455c.this.mo171181d()).mo223028e();
                UnknownCodeHandler.f123256a.mo171329a(C64455c.this.f162773d, networkErrorResult);
            }

            /* renamed from: a */
            public void mo145179a(BaseStepData baseStepData) {
                C64455c.this.f123081c.mo171465b("SplitFlowPagePresenter", "sendBioAuthVerify success");
                if ("close_all".equals(baseStepData.nextStep)) {
                    C64455c.this.f123081c.mo171465b("SplitFlowPagePresenter", "jump to Setting Page");
                    ((C64450a.AbstractC64452b) C64455c.this.mo171181d()).mo223021a(baseStepData, true);
                    ((C64450a.AbstractC64452b) C64455c.this.mo171181d()).mo223028e();
                    return;
                }
                C49092f.m193532a(C64455c.this.f162773d, baseStepData.nextStep, baseStepData.stepInfo, RouterScene.ALL.value, C64455c.this.f123080b, C64455c.this.f123081c, new AbstractC49336a() {
                    /* class com.ss.lark.android.passport.biz.compat.split_flow_page.mvp.C64455c.C644613.C644621 */

                    @Override // com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a
                    public void onRouterResult(int i, Object obj) {
                        C64455c.this.f123081c.mo171465b("SplitFlowPagePresenter", "sendBioAuthVerify onRouterResult success");
                        ((C64450a.AbstractC64452b) C64455c.this.mo171181d()).mo223028e();
                        ((C64450a.AbstractC64452b) C64455c.this.mo171181d()).mo223029f();
                    }
                });
            }
        });
    }

    public C64455c(Context context, C64450a.AbstractC64451a aVar, C64450a.AbstractC64452b bVar, UniContext uniContext, PassportLog passportLog) {
        super(aVar, bVar, uniContext, passportLog);
        this.f162773d = context;
    }
}
