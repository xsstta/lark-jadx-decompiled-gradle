package com.ss.lark.android.passport.biz.feature.bio_auth.mvp;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.larksuite.component.ui.toast.LKUIToast;
import com.ss.android.bytedcert.callback.SDKCallBack;
import com.ss.android.bytedcert.net.BDResponse;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49021b;
import com.ss.android.lark.passport.infra.base.network.handler.UnknownCodeHandler;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.base.router.RouterScene;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.util.C49202p;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.base.network.ICallback;
import com.ss.android.lark.passport.signinsdk_api.base.network.ResponseModel;
import com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a;
import com.ss.lark.android.passport.biz.C64282a;
import com.ss.lark.android.passport.biz.compat.v2.featurec.network.responese.AuthTicketData;
import com.ss.lark.android.passport.biz.feature.bio_auth.mvp.C64675c;
import java.lang.reflect.Type;

/* renamed from: com.ss.lark.android.passport.biz.feature.bio_auth.mvp.b */
public class C64669b extends AbstractC49021b<C64675c.AbstractC64676a, C64675c.AbstractC64677b, C64675c.AbstractC64677b.AbstractC64678a> {

    /* renamed from: d */
    public final Context f163166d;

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C64675c.AbstractC64677b.AbstractC64678a mo171180c() {
        return new C64675c.AbstractC64677b.AbstractC64678a() {
            /* class com.ss.lark.android.passport.biz.feature.bio_auth.mvp.C64669b.C646701 */

            @Override // com.ss.lark.android.passport.biz.feature.bio_auth.mvp.C64675c.AbstractC64677b.AbstractC64678a
            /* renamed from: a */
            public void mo223474a() {
                ((C64675c.AbstractC64677b) C64669b.this.mo171181d()).mo223459d();
                ((C64675c.AbstractC64676a) C64669b.this.mo171182e()).mo223467b(((C64675c.AbstractC64676a) C64669b.this.mo171182e()).mo223469h(), new ICallback<BaseStepData>() {
                    /* class com.ss.lark.android.passport.biz.feature.bio_auth.mvp.C64669b.C646701.C646722 */

                    @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
                    /* renamed from: a */
                    public Type mo101474a() {
                        return BaseStepData.class;
                    }

                    @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
                    /* renamed from: a */
                    public void mo101475a(NetworkErrorResult networkErrorResult) {
                        ((C64675c.AbstractC64677b) C64669b.this.mo171181d()).mo223460e();
                        PassportLog passportLog = C64669b.this.f123081c;
                        PassportLog passportLog2 = C64669b.this.f123081c;
                        passportLog.mo171471d("SplitFlowPagePresenter", PassportLog.m193687a("refreshTicket failed", networkErrorResult));
                        UnknownCodeHandler.f123256a.mo171329a(C64669b.this.f163166d, networkErrorResult);
                    }

                    @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
                    /* renamed from: a */
                    public void mo101476a(ResponseModel<BaseStepData> responseModel) {
                        ((C64675c.AbstractC64677b) C64669b.this.mo171181d()).mo223460e();
                        C64669b.this.f123081c.mo171465b("SplitFlowPagePresenter", "refreshTicket success");
                        if (responseModel == null || responseModel.getData() == null) {
                            C64669b.this.f123081c.mo171471d("SplitFlowPagePresenter", "the ticket is null");
                            return;
                        }
                        AuthTicketData authTicketData = (AuthTicketData) C49202p.m193967a(responseModel.getData().stepInfo, AuthTicketData.class);
                        if (authTicketData == null) {
                            C64669b.this.f123081c.mo171471d("SplitFlowPagePresenter", "authTicketData is null");
                            return;
                        }
                        C646701 r0 = C646701.this;
                        r0.mo223475a(((C64675c.AbstractC64676a) C64669b.this.mo171182e()).mo223471j(), ((C64675c.AbstractC64676a) C64669b.this.mo171182e()).mo223470i(), authTicketData);
                    }
                });
            }

            @Override // com.ss.lark.android.passport.biz.feature.bio_auth.mvp.C64675c.AbstractC64677b.AbstractC64678a
            /* renamed from: b */
            public void mo223476b() {
                if (((C64675c.AbstractC64676a) C64669b.this.mo171182e()).mo223468g().mSwitchButton.next != null) {
                    try {
                        C49092f.m193529a(C64669b.this.f163166d, ((C64675c.AbstractC64676a) C64669b.this.mo171182e()).mo223468g().mSwitchButton.next, RouterScene.ALL.value, C64669b.this.f123080b, C64669b.this.f123081c, (AbstractC49336a) null);
                    } catch (Exception e) {
                        C64669b.this.f123081c.mo171471d("SplitFlowPagePresenter", "jump to verify identity failed");
                        e.printStackTrace();
                    }
                }
            }

            /* renamed from: a */
            public void mo223475a(String str, String str2, AuthTicketData authTicketData) {
                if (authTicketData == null) {
                    C64669b.this.f123081c.mo171471d("SplitFlowPagePresenter", "authTicketData is null");
                    return;
                }
                C64669b.this.f123081c.mo171465b("SplitFlowPagePresenter", "start byteCert");
                C64282a.m252790a().mo222763a((Activity) C64669b.this.f163166d, authTicketData.ticket, str, str2, ((C64675c.AbstractC64676a) C64669b.this.mo171182e()).mo223466b(authTicketData.flowType), ((C64675c.AbstractC64676a) C64669b.this.mo171182e()).mo223465a(authTicketData.flowType), C64669b.this.f123081c, new SDKCallBack.FaceLiveCallback() {
                    /* class com.ss.lark.android.passport.biz.feature.bio_auth.mvp.C64669b.C646701.C646711 */

                    @Override // com.ss.android.bytedcert.callback.SDKCallBack.FaceLiveCallback
                    public void onFaceLiveFinish(BDResponse bDResponse) {
                        if (bDResponse == null) {
                            C64669b.this.f123081c.mo171471d("SplitFlowPagePresenter", "BDResponse is null");
                            return;
                        }
                        if (bDResponse.success) {
                            C64669b.this.f123081c.mo171465b("SplitFlowPagePresenter", "BDResponse success");
                        } else {
                            PassportLog passportLog = C64669b.this.f123081c;
                            passportLog.mo171471d("SplitFlowPagePresenter", "BDResponse is error " + bDResponse.errorMsg + " " + bDResponse.errorCode);
                        }
                        if (bDResponse.success || bDResponse.errorCode >= 0) {
                            C64669b.this.mo223473h();
                        } else if (!TextUtils.isEmpty(bDResponse.errorMsg)) {
                            LKUIToast.show(C64669b.this.f163166d, bDResponse.errorMsg);
                        }
                    }
                });
            }
        };
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d, com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49021b
    /* renamed from: a */
    public void mo171169a() {
        super.mo171169a();
        ((C64675c.AbstractC64677b) mo171181d()).mo223457a(((C64675c.AbstractC64676a) mo171182e()).mo223468g());
    }

    /* renamed from: h */
    public void mo223473h() {
        this.f123081c.mo171465b("SplitFlowPagePresenter", "BDResponse sendBioAuthVerify");
        ((C64675c.AbstractC64677b) mo171181d()).mo223459d();
        ((C64675c.AbstractC64676a) mo171182e()).mo223464a(((C64675c.AbstractC64676a) mo171182e()).mo223469h(), new ICallback<BaseStepData>() {
            /* class com.ss.lark.android.passport.biz.feature.bio_auth.mvp.C64669b.C646732 */

            @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
            /* renamed from: a */
            public Type mo101474a() {
                return BaseStepData.class;
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
            /* renamed from: a */
            public void mo101475a(NetworkErrorResult networkErrorResult) {
                PassportLog passportLog = C64669b.this.f123081c;
                PassportLog passportLog2 = C64669b.this.f123081c;
                passportLog.mo171471d("SplitFlowPagePresenter", PassportLog.m193687a("sendBioAuthVerify failed:", networkErrorResult));
                ((C64675c.AbstractC64677b) C64669b.this.mo171181d()).mo223460e();
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
            /* renamed from: a */
            public void mo101476a(ResponseModel<BaseStepData> responseModel) {
                C64669b.this.f123081c.mo171465b("SplitFlowPagePresenter", "sendBioAuthVerify success");
                if (responseModel == null || responseModel.getData() == null) {
                    C64669b.this.f123081c.mo171471d("SplitFlowPagePresenter", "data or basestepdata is null");
                    return;
                }
                BaseStepData data = responseModel.getData();
                if ("close_all".equals(data.nextStep)) {
                    C64669b.this.f123081c.mo171465b("SplitFlowPagePresenter", "jump to Setting Page");
                    ((C64675c.AbstractC64677b) C64669b.this.mo171181d()).mo223456a(data, true);
                    ((C64675c.AbstractC64677b) C64669b.this.mo171181d()).mo223460e();
                    return;
                }
                C49092f.m193532a(C64669b.this.f163166d, data.nextStep, data.stepInfo, RouterScene.ALL.value, C64669b.this.f123080b, C64669b.this.f123081c, new AbstractC49336a() {
                    /* class com.ss.lark.android.passport.biz.feature.bio_auth.mvp.C64669b.C646732.C646741 */

                    @Override // com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a
                    public void onRouterResult(int i, Object obj) {
                        C64669b.this.f123081c.mo171465b("SplitFlowPagePresenter", "sendBioAuthVerify onRouterResult success");
                        ((C64675c.AbstractC64677b) C64669b.this.mo171181d()).mo223460e();
                        ((C64675c.AbstractC64677b) C64669b.this.mo171181d()).mo223462g();
                    }
                });
            }
        });
    }

    public C64669b(Context context, C64675c.AbstractC64676a aVar, C64675c.AbstractC64677b bVar, UniContext uniContext, PassportLog passportLog) {
        super(aVar, bVar, uniContext, passportLog);
        this.f163166d = context;
    }
}
