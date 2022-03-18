package com.larksuite.component.openplatform.core.plugin.infra.storage.storage;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.lark.infra.storage.sp.biz.AbstractC12910a;
import com.tt.frontendapiinterface.ApiCallResult;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65802d;
import com.tt.miniapp.util.C67070z;
import com.tt.refer.common.annotation.ApiSupportType;
import com.tt.refer.common.base.AppType;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ApiSupportType(apiName = {"getStorageInfoSync"}, support = {AppType.GadgetAPP, AppType.WebGadgetAPP})
/* renamed from: com.larksuite.component.openplatform.core.plugin.infra.storage.storage.e */
public class C24979e extends AbstractC65802d {
    public C24979e() {
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a
    /* renamed from: a */
    public List<String> mo87215a() {
        return Collections.singletonList("getStorageInfoSync");
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65802d
    /* renamed from: a */
    public ApiCallResult mo87217a(C67701b bVar) {
        try {
            AbstractC12910a aVar = (AbstractC12910a) mo230473f().findServiceByInterface(AbstractC12910a.class);
            long a = C67070z.m261383a(aVar.mo48694b(), true);
            long a2 = C67070z.m261383a(aVar.mo48698c(), true);
            JSONArray d = aVar.mo48702d();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("currentSize", a);
            jSONObject.put("limitSize", a2);
            jSONObject.put("keys", d);
            return mo230501a(jSONObject);
        } catch (JSONException e) {
            AppBrandLogger.m52829e("ApiHandler", e);
            return mo230497a(ApiCode.GENERAL_JSON_ERROR);
        }
    }

    public C24979e(String str, IAppContext iAppContext) {
        super(str, iAppContext);
    }
}
