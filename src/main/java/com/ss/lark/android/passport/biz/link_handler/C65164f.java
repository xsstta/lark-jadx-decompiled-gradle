package com.ss.lark.android.passport.biz.link_handler;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.ss.android.lark.applink.AppLink;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.passport.infra.base.network.handler.UnknownCodeHandler;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.base.router.RouterScene;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.network.ICallback;
import com.ss.android.lark.passport.signinsdk_api.base.network.ResponseModel;
import com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a;
import com.ss.lark.android.passport.biz.C64340b;
import com.ss.lark.android.passport.biz.feature.FeatureCApi;
import com.ss.lark.android.passport.biz.link_handler.C65164f;
import java.lang.reflect.Type;
import java.util.HashMap;

/* renamed from: com.ss.lark.android.passport.biz.link_handler.f */
public class C65164f extends PassportAppLinkHandler {

    /* renamed from: a */
    public final Handler f164093a = new Handler(Looper.getMainLooper());

    @Override // com.ss.lark.android.passport.biz.link_handler.PassportAppLinkHandler, com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: a */
    public boolean mo103482a() {
        return true;
    }

    @Override // com.ss.android.lark.applink.AbstractC29186b
    /* renamed from: a */
    public boolean mo103460a(Context context, AppLink appLink) {
        return false;
    }

    @Override // com.ss.lark.android.passport.biz.link_handler.PassportAppLinkHandler, com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: d */
    public boolean mo103484d(Context context, AppLink appLink) {
        mo224384b().mo171465b("RecoverAccountHandler", "canOpen");
        if (context != null && appLink != null && !TextUtils.isEmpty(appLink.mo103435a())) {
            return true;
        }
        mo224384b().mo171471d("RecoverAccountHandler", "canOpen invalid parameter");
        return false;
    }

    @Override // com.ss.lark.android.passport.biz.link_handler.PassportAppLinkHandler, com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: c */
    public boolean mo103483c(final Context context, AppLink appLink) {
        mo224384b().mo171460a("n_action_handle_recover_account_applink_start");
        Uri parse = Uri.parse(appLink.mo103435a());
        mo224384b().mo171465b("n_action_action_handle_recover_account_applink_params_validation", "validating params");
        if (parse == null) {
            HashMap hashMap = new HashMap();
            hashMap.put("reason", "uri is null");
            mo224384b().mo171472d("n_action_handle_recover_account_applink_params_validation_fail", "handle uri is null", hashMap);
            return true;
        }
        String queryParameter = parse.getQueryParameter("appeal_token");
        if (TextUtils.isEmpty(queryParameter)) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("reason", "token is null");
            mo224384b().mo171472d("n_action_handle_recover_account_applink_params_validation_fail", "handle uri is null", hashMap2);
            return true;
        }
        String queryParameter2 = parse.getQueryParameter(ShareHitPoint.f121869d);
        mo224384b().mo171465b("n_action_retrieve_applink_req", "retrieve applink req start");
        if (TextUtils.isEmpty(queryParameter)) {
            queryParameter = "";
        }
        if (TextUtils.isEmpty(queryParameter2)) {
            queryParameter2 = "";
        }
        FeatureCApi.Retrieve.m253719a(queryParameter, queryParameter2, null, new ICallback<BaseStepData>() {
            /* class com.ss.lark.android.passport.biz.link_handler.C65164f.C651651 */

            @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
            /* renamed from: a */
            public Type mo101474a() {
                return BaseStepData.class;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ void m255957a(Context context) {
                ServiceFinder.m193748c().openLogin(context, null);
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public /* synthetic */ void m255958b(NetworkErrorResult networkErrorResult) {
                Activity c = C64340b.m252955a().mo222861c();
                if (c == null || c.isDestroyed()) {
                    C65164f.this.mo224384b().mo171471d("n_action_retrieve_applink_req_fail", "top activity is null or destroyed");
                } else {
                    UnknownCodeHandler.f123256a.mo171330b(c, networkErrorResult);
                }
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
            /* renamed from: a */
            public void mo101475a(NetworkErrorResult networkErrorResult) {
                String str;
                PassportLog b = C65164f.this.mo224384b();
                if (("recover request error = " + networkErrorResult) == null) {
                    str = "null";
                } else {
                    str = networkErrorResult.toString();
                }
                b.mo171471d("n_action_retrieve_applink_req_fail", str);
                Activity c = C64340b.m252955a().mo222861c();
                if (c != null) {
                    UnknownCodeHandler.f123256a.mo171330b(c, networkErrorResult);
                } else if (!ServiceFinder.m193748c().isLogin()) {
                    C65164f.this.f164093a.post(new Runnable(context) {
                        /* class com.ss.lark.android.passport.biz.link_handler.$$Lambda$f$1$Qo9GKmSZo9LB_jYrjeDZQloJbBY */
                        public final /* synthetic */ Context f$0;

                        {
                            this.f$0 = r1;
                        }

                        public final void run() {
                            C65164f.C651651.m255957a(this.f$0);
                        }
                    });
                    C65164f.this.f164093a.postDelayed(new Runnable(networkErrorResult) {
                        /* class com.ss.lark.android.passport.biz.link_handler.$$Lambda$f$1$__Obvt7rJYIfU2WvSRRf4m3gsek */
                        public final /* synthetic */ NetworkErrorResult f$1;

                        {
                            this.f$1 = r2;
                        }

                        public final void run() {
                            C65164f.C651651.this.m255958b(this.f$1);
                        }
                    }, 1000);
                }
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
            /* renamed from: a */
            public void mo101476a(ResponseModel<BaseStepData> responseModel) {
                if (responseModel == null || !(responseModel.getData() instanceof BaseStepData)) {
                    C65164f.this.mo224384b().mo171471d("n_action_retrieve_applink_req_fail", "onSuccess but data invalid");
                    return;
                }
                JSONObject jSONObject = responseModel.getData().stepInfo;
                if (jSONObject == null) {
                    C65164f.this.mo224384b().mo171471d("n_action_retrieve_applink_req_fail", "onSuccess but stepInfo is null");
                    return;
                }
                PassportLog b = C65164f.this.mo224384b();
                b.mo171465b("n_action_retrieve_applink_req_succ", "retrieve applink req success, next: " + responseModel.getData().nextStep);
                C49092f.m193531a(context, responseModel.getData().nextStep, jSONObject, RouterScene.ALL.value, C65164f.this.mo224384b(), (AbstractC49336a) null);
            }
        });
        return true;
    }
}
