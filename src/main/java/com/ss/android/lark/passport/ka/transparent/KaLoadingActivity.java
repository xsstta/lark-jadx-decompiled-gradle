package com.ss.android.lark.passport.ka.transparent;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.larksuite.suite.R;
import com.ss.android.lark.p2069j.p2070a.C40654u;
import com.ss.android.lark.passport.infra.base.architecture.BaseActivity;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.base.router.RouterScene;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.util.C49154ag;
import com.ss.android.lark.passport.infra.watcher.WatcherHelper;
import com.ss.android.lark.passport.ka.C49298b;
import com.ss.android.lark.passport.ka.model.DecodedIdPLoginModel;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.network.ICallback;
import com.ss.android.lark.passport.signinsdk_api.base.network.ResponseModel;
import com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a;
import com.ss.lark.android.passport.biz.feature.FeatureCApi;
import com.ss.lark.android.passport.biz.feature.company_login.C64680a;
import java.lang.reflect.Type;
import java.util.HashMap;

public class KaLoadingActivity extends BaseActivity {
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity
    /* renamed from: i */
    public boolean mo171137i() {
        return false;
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity
    /* renamed from: o */
    public void mo171143o() {
        if (C49154ag.m193835a((Activity) this)) {
            super.mo171143o();
        }
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity
    public void finish() {
        super.finish();
        mo171143o();
        C49298b.m194253a().mo171923b();
        overridePendingTransition(0, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo170967a() {
        DecodedIdPLoginModel decodedIdPLoginModel = (DecodedIdPLoginModel) getIntent().getParcelableExtra("IDP_LOGIN_MODEL");
        if (decodedIdPLoginModel == null) {
            this.f123052c.mo171471d("n_action_idp_auth_web_auth_fail", "decoded model is null");
            mo171938a(getString(R.string.Lark_Login_ErrorMessageOfOtherStatus));
        } else if (decodedIdPLoginModel.getCode() != 0) {
            PassportLog passportLog = this.f123052c;
            passportLog.mo171471d("n_action_idp_auth_web_auth_fail", "decoded model code != 0, code: " + decodedIdPLoginModel.getCode() + ", message: " + decodedIdPLoginModel.getMessage());
            mo171938a(decodedIdPLoginModel.getMessage());
        } else {
            this.f123052c.mo171465b("n_action_idp_auth_web_auth_suc", "web auth success");
            this.f123052c.mo171465b("n_action_idp_auth_dispatch_req", "idp dispatch request start");
            FeatureCApi.IdP.m253716a(decodedIdPLoginModel.getState(), false, this.f123055f, (ICallback<BaseStepData>) new ICallback<BaseStepData>() {
                /* class com.ss.android.lark.passport.ka.transparent.KaLoadingActivity.C493012 */

                @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
                /* renamed from: a */
                public Type mo101474a() {
                    return BaseStepData.class;
                }

                @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
                /* renamed from: a */
                public void mo101475a(final NetworkErrorResult networkErrorResult) {
                    PassportLog passportLog = KaLoadingActivity.this.f123052c;
                    passportLog.mo171471d("n_action_idp_auth_dispatch_req_fail", "idp dispatch failed, error: " + networkErrorResult);
                    KaLoadingActivity.this.runOnUiThread(new Runnable() {
                        /* class com.ss.android.lark.passport.ka.transparent.KaLoadingActivity.C493012.RunnableC493042 */

                        public void run() {
                            KaLoadingActivity.this.mo171938a(networkErrorResult.getErrorMessage());
                        }
                    });
                }

                @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
                /* renamed from: a */
                public void mo101476a(ResponseModel<BaseStepData> responseModel) {
                    final BaseStepData data = responseModel.getData();
                    if (data != null) {
                        PassportLog passportLog = KaLoadingActivity.this.f123052c;
                        passportLog.mo171465b("n_action_idp_auth_dispatch_req_suc", "idp dispatch success, next: " + data.getNextStep());
                        HashMap hashMap = new HashMap();
                        hashMap.put("next_step", data.nextStep);
                        WatcherHelper.m193665a(KaLoadingActivity.this.f123055f, C40654u.f103200w, hashMap);
                        KaLoadingActivity.this.runOnUiThread(new Runnable() {
                            /* class com.ss.android.lark.passport.ka.transparent.KaLoadingActivity.C493012.RunnableC493021 */

                            public void run() {
                                C49092f.m193529a(KaLoadingActivity.this, data, RouterScene.ALL.value, KaLoadingActivity.this.f123055f, KaLoadingActivity.this.f123052c, new AbstractC49336a() {
                                    /* class com.ss.android.lark.passport.ka.transparent.KaLoadingActivity.C493012.RunnableC493021.C493031 */

                                    @Override // com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a
                                    public void onRouterResult(int i, Object obj) {
                                        if (KaLoadingActivity.this.f123051b != null && C49154ag.m193835a((Activity) KaLoadingActivity.this)) {
                                            KaLoadingActivity.this.f123051b.cancel();
                                        }
                                        WatcherHelper.m193664a(KaLoadingActivity.this.f123055f, C40654u.f103201x);
                                    }
                                });
                            }
                        });
                        return;
                    }
                    KaLoadingActivity.this.f123052c.mo171471d("n_action_idp_auth_dispatch_req_fail", "idp dispatch failed, next is null");
                    KaLoadingActivity kaLoadingActivity = KaLoadingActivity.this;
                    kaLoadingActivity.mo171938a(kaLoadingActivity.getString(R.string.Lark_Login_ErrorMessageOfOtherStatus));
                }
            });
        }
    }

    /* renamed from: a */
    public void mo171938a(String str) {
        if (C49154ag.m193835a((Activity) this)) {
            C64680a.m254114a(this, str);
        }
    }

    /* renamed from: a */
    public static Intent m194258a(Context context) {
        Intent intent = new Intent(context, KaLoadingActivity.class);
        intent.addFlags(65536);
        if (!(context instanceof Activity)) {
            intent.setFlags(268435456);
        }
        return intent;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.idp_ka_activity_loading);
        mo171141m();
        if (this.f123051b != null) {
            this.f123051b.setOnCancelListener(new DialogInterface.OnCancelListener() {
                /* class com.ss.android.lark.passport.ka.transparent.KaLoadingActivity.DialogInterface$OnCancelListenerC493001 */

                public void onCancel(DialogInterface dialogInterface) {
                    KaLoadingActivity.this.finish();
                }
            });
        }
        WatcherHelper.m193664a(this.f123055f, C40654u.f103199v);
        mo170967a();
    }

    /* renamed from: a */
    public static void m194259a(Context context, DecodedIdPLoginModel decodedIdPLoginModel) {
        Intent a = m194258a(context);
        Bundle bundle = new Bundle();
        bundle.putParcelable("IDP_LOGIN_MODEL", decodedIdPLoginModel);
        a.putExtras(bundle);
        context.startActivity(a);
    }
}
