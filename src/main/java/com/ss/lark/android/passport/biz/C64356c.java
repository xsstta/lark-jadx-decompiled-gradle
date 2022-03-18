package com.ss.lark.android.passport.biz;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.applink.AbstractC29186b;
import com.ss.android.lark.passport.infra.base.network.handler.UnknownCodeHandler;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.base.router.RouterScene;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.base.network.ICallback;
import com.ss.android.lark.passport.signinsdk_api.base.network.ResponseModel;
import com.ss.android.lark.passport.signinsdk_api.base.p2456b.C49345a;
import com.ss.android.lark.setting.export.AbstractC54125a;
import com.ss.android.lark.utils.ViewUtils;
import com.ss.lark.android.passport.biz.feature.FeatureCApi;
import com.ss.lark.android.passport.biz.feature.accountandsecurity.C64597a;
import com.ss.lark.android.passport.biz.feature.accountandsecurity.C64606c;
import com.ss.lark.android.passport.biz.feature.accountandsecurity.p3218a.C64599a;
import com.ss.lark.android.passport.biz.feature.accountandsecurity.p3218a.C64600b;
import com.ss.lark.android.passport.biz.feature.accountandsecurity.service.C64609b;
import com.ss.lark.android.passport.biz.feature.accountandsecurity.service.entity.ContactPointBean;
import com.ss.lark.android.passport.biz.feature.accountandsecurity.service.response.QueryContactPointsResponse;
import com.ss.lark.android.passport.biz.feature.auth_type.ContactPointTypeEnum;
import com.ss.lark.android.passport.biz.link_handler.C65158a;
import com.ss.lark.android.passport.biz.link_handler.C65159c;
import com.ss.lark.android.passport.biz.link_handler.C65162e;
import com.ss.lark.android.passport.biz.link_handler.C65164f;
import com.ss.lark.android.passport.biz.link_handler.C65166g;
import com.ss.lark.android.passport.biz.link_handler.C65168h;
import com.ss.lark.android.passport.biz.link_handler.C65173j;
import com.ss.lark.android.passport.biz.link_handler.JoinTeamHandler;
import com.ss.lark.android.passport.biz.link_handler.SwitchUserAppLinkHandler;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.lark.android.passport.biz.c */
public class C64356c {

    /* renamed from: a */
    public static C64356c f162622a;

    /* renamed from: a */
    public void mo222896a() {
    }

    /* renamed from: b */
    public void mo222902b() {
    }

    /* renamed from: c */
    public Map<String, AbstractC29186b> mo222903c() {
        HashMap hashMap = new HashMap();
        hashMap.put("/client/passport/join_team", new JoinTeamHandler());
        hashMap.put("/client/passport/switch_user", new SwitchUserAppLinkHandler());
        hashMap.put("/client/passport/recover_account", new C65164f());
        hashMap.put("/client/passport/password", new C64600b());
        hashMap.put("/client/passport/account_management", new C64599a());
        hashMap.put("/client/passport/sso_login", new C65166g());
        hashMap.put("/client/tenant/upgrade_or_create_team", new C65173j());
        hashMap.put("/client/tenant/join_team", new C65159c());
        hashMap.put("/client/tenant/team_conversion_selection", new C65158a());
        hashMap.put("/client/tenant/personal_use", new C65162e());
        hashMap.put("/client/tenant/switch", new C65168h());
        return hashMap;
    }

    /* renamed from: a */
    public void mo222897a(Context context) {
        C64606c.m253859a(context);
    }

    /* renamed from: b */
    public List<AbstractC54125a> mo222901b(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C64597a(context));
        return arrayList;
    }

    /* renamed from: a */
    public void mo222900a(final IGetDataCallback<Boolean> iGetDataCallback) {
        if (iGetDataCallback != null) {
            C64609b.m253863a().mo223369a(new AbstractC49352d<QueryContactPointsResponse>() {
                /* class com.ss.lark.android.passport.biz.C64356c.C643582 */

                @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
                /* renamed from: a */
                public void mo145178a(NetworkErrorResult networkErrorResult) {
                    iGetDataCallback.onError(C49345a.m194380a(networkErrorResult));
                }

                /* renamed from: a */
                public void mo145179a(QueryContactPointsResponse queryContactPointsResponse) {
                    List<ContactPointBean> list;
                    if (!(queryContactPointsResponse == null || (list = queryContactPointsResponse.cps) == null)) {
                        for (ContactPointBean contactPointBean : list) {
                            if (contactPointBean.getType() == ContactPointTypeEnum.PHONE.value() && TextUtils.equals(contactPointBean.getCountryCode(), "86") && !TextUtils.isEmpty(contactPointBean.getMobile())) {
                                iGetDataCallback.onSuccess(true);
                                return;
                            }
                        }
                    }
                    iGetDataCallback.onSuccess(false);
                }
            });
        }
    }

    /* renamed from: a */
    public void mo222899a(Context context, String str) {
        C64606c.m253860a(context, str);
    }

    /* renamed from: a */
    public void mo222898a(final Context context, JSONObject jSONObject) {
        String str = "";
        final ViewUtils.C57751a a = ViewUtils.m224143a(context, str);
        a.mo196039b();
        final UniContext uniContext = UniContext.CONTEXT_GLOBAL;
        String string = jSONObject.getString("credential");
        int intValue = jSONObject.getIntValue("credential_type");
        final String string2 = jSONObject.getString("scope");
        final PassportLog a2 = PassportLog.f123351c.mo171474a();
        if (ServiceFinder.m193744a().getForegroundUser() != null) {
            str = ServiceFinder.m193744a().getForegroundUser().getLoginCredentialId();
        } else {
            a2.mo171471d("SigninModuleExport", "foregroundUser is empty");
        }
        FeatureCApi.m253697a(string, Integer.valueOf(intValue), string2, str, uniContext, new ICallback<BaseStepData>() {
            /* class com.ss.lark.android.passport.biz.C64356c.C643571 */

            @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
            /* renamed from: a */
            public Type mo101474a() {
                return BaseStepData.class;
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
            /* renamed from: a */
            public void mo101475a(NetworkErrorResult networkErrorResult) {
                a.mo196042e();
                PassportLog passportLog = a2;
                passportLog.mo171471d("SigninModuleExport", "applyVerifyToken error " + networkErrorResult.getErrorMessage());
                UnknownCodeHandler.f123256a.mo171331c(context, networkErrorResult);
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
            /* renamed from: a */
            public void mo101476a(ResponseModel<BaseStepData> responseModel) {
                a.mo196042e();
                BaseStepData data = responseModel.getData();
                if (data == null || data.stepInfo == null) {
                    a2.mo171471d("SigninModuleExport", "parse stepInfo error");
                    return;
                }
                data.stepInfo.put("scope", (Object) string2);
                C49092f.m193523a((Activity) context, 1, "page_verify_identity_new", data.stepInfo, RouterScene.ALL.value, uniContext, a2);
            }
        });
    }
}
