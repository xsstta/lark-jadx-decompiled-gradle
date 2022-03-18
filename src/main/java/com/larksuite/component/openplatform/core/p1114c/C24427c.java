package com.larksuite.component.openplatform.core.p1114c;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.framework.apiplugin.entity.LKBasePluginResult;
import com.tt.frontendapiinterface.ApiCallResult;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65802d;
import com.tt.refer.common.annotation.ApiSupportType;
import com.tt.refer.common.base.AppType;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

@ApiSupportType(apiName = {"invokeCustomApiSync"}, support = {AppType.CardAPP}, testSupport = {AppType.GadgetAPP, AppType.WebGadgetAPP, AppType.WebAPP})
/* renamed from: com.larksuite.component.openplatform.core.c.c */
public class C24427c extends AbstractC65802d {
    public C24427c() {
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a
    /* renamed from: a */
    public List<String> mo87215a() {
        return Collections.singletonList("invokeCustomApiSync");
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65802d
    /* renamed from: a */
    public ApiCallResult mo87217a(C67701b bVar) {
        AppBrandLogger.m52828d("ApiHandler", "openSchema mArgs:", bVar.mo234988d());
        String str = (String) bVar.mo234984a("api");
        if (TextUtils.isEmpty(str)) {
            AppBrandLogger.m52829e("ApiHandler", "api is empty");
            return mo230497a(ApiCode.GENERAL_PARAM);
        }
        LKBasePluginResult sendEvent = mo230473f().sendEvent(str, (JSONObject) bVar.mo234985a("params", new JSONObject()), null);
        int c = sendEvent.mo92267c();
        if (c == Integer.MIN_VALUE) {
            return mo230501a(sendEvent.mo92270e());
        }
        AppBrandLogger.m52830i("ApiHandler", "errorCode:" + c);
        return mo230499a(null, sendEvent.mo92267c(), sendEvent.mo92270e());
    }

    public C24427c(String str, IAppContext iAppContext) {
        super(str, iAppContext);
    }
}
