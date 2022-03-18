package com.tt.miniapp.webbridge.sync;

import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.frontendapiinterface.ApiCallResult;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65802d;
import com.tt.refer.common.annotation.ApiSupportType;
import com.tt.refer.common.base.AppType;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@ApiSupportType(apiName = {"isTemplateReady"}, support = {AppType.GadgetAPP})
/* renamed from: com.tt.miniapp.webbridge.sync.u */
public class C67392u extends AbstractC65802d {
    public C67392u() {
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a
    /* renamed from: a */
    public List<String> mo87215a() {
        return Collections.singletonList("isTemplateReady");
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65802d
    /* renamed from: a */
    public ApiCallResult mo87217a(C67701b bVar) {
        Integer num = (Integer) bVar.mo234984a("webViewId");
        RenderViewManager renderViewManager = AppbrandApplicationImpl.getInst(this.f165819i).getRenderViewManager();
        if (num == null || renderViewManager == null || renderViewManager.getRender(num.intValue()) == null) {
            return mo230497a(ApiCode.GENERAL_UNKONW_ERROR);
        }
        try {
            return mo230501a(new JSONObject().put("isReady", renderViewManager.getRender(num.intValue()).isTemplateReady()).put("id", num));
        } catch (JSONException unused) {
            return mo230497a(ApiCode.GENERAL_JSON_ERROR);
        }
    }

    public C67392u(String str, IAppContext iAppContext) {
        super(str, iAppContext);
    }
}
