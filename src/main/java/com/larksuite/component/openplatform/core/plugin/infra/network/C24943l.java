package com.larksuite.component.openplatform.core.plugin.infra.network;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.frontendapiinterface.ApiCallResult;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65802d;
import com.tt.refer.common.annotation.ApiSupportType;
import com.tt.refer.common.base.AppType;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@ApiSupportType(apiName = {"createDownloadTask"}, support = {AppType.GadgetAPP})
/* renamed from: com.larksuite.component.openplatform.core.plugin.infra.network.l */
public class C24943l extends AbstractC65802d {

    /* renamed from: a */
    private C24941k f61078a;

    public C24943l() {
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a
    /* renamed from: a */
    public List<String> mo87215a() {
        return Collections.singletonList("createDownloadTask");
    }

    /* renamed from: a */
    private JSONObject m90187a(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("downloadTaskId", i);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65802d
    /* renamed from: a */
    public ApiCallResult mo87217a(C67701b bVar) {
        AppBrandLogger.m52830i("CreateDownloadFileTaskNew", "create download task.....");
        if (this.f61078a == null) {
            this.f61078a = new C24941k(mo230473f(), mo230475h());
        }
        return mo230501a(m90187a(this.f61078a.mo88028a(bVar)));
    }

    public C24943l(String str, IAppContext iAppContext) {
        super(str, iAppContext);
    }
}
