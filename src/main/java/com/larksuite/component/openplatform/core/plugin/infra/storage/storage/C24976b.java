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
import com.tt.refer.p3400a.p3401a.AbstractC67699a;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@ApiSupportType(apiName = {"clearStorageSync"}, support = {AppType.GadgetAPP})
/* renamed from: com.larksuite.component.openplatform.core.plugin.infra.storage.storage.b */
public class C24976b extends AbstractC65802d {
    public C24976b() {
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a
    /* renamed from: a */
    public List<String> mo87215a() {
        return Collections.singletonList("clearStorageSync");
    }

    /* renamed from: b */
    private void m90234b() {
        AbstractC67699a aVar = (AbstractC67699a) mo230473f().findServiceByInterface(AbstractC67699a.class);
        if (aVar != null) {
            aVar.mo234975a();
        }
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65802d
    /* renamed from: a */
    public ApiCallResult mo87217a(C67701b bVar) {
        AbstractC12910a aVar = (AbstractC12910a) mo230473f().findServiceByInterface(AbstractC12910a.class);
        if (!aVar.mo48689a()) {
            return mo230497a(ApiCode.CLEARSTORAGE_CLEAR_FAIL);
        }
        m90234b();
        long a = C67070z.m261383a(aVar.mo48694b(), true);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("currentSize", a);
        } catch (JSONException e) {
            AppBrandLogger.m52829e("ApiHandler", e);
        }
        return mo230501a(jSONObject);
    }

    public C24976b(String str, IAppContext iAppContext) {
        super(str, iAppContext);
    }
}
