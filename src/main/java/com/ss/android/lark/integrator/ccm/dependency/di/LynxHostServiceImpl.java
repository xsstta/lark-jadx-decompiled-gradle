package com.ss.android.lark.integrator.ccm.dependency.di;

import com.bytedance.apm.ApmAgent;
import com.bytedance.ee.bear.lynx.impl.LynxHostService;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.lark.openplatform_api.IOpenPlatformApi;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.LarkContext;
import kotlin.Metadata;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J.\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/integrator/ccm/dependency/di/LynxHostServiceImpl;", "Lcom/bytedance/ee/bear/lynx/impl/LynxHostService;", "()V", "checkOrInitLynxEnv", "", "monitorStatusAndDuration", "serviceName", "", UpdateKey.STATUS, "", "duration", "Lorg/json/JSONObject;", "logExtra", "ccm_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.ccm.dependency.a.w */
public final class LynxHostServiceImpl implements LynxHostService {
    @Override // com.bytedance.ee.bear.lynx.impl.LynxHostService
    /* renamed from: a */
    public void mo33930a() {
        ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).initCardEnv(LarkContext.getApplication());
    }

    @Override // com.bytedance.ee.bear.lynx.impl.LynxHostService
    /* renamed from: a */
    public void mo33931a(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
        ApmAgent.monitorStatusAndDuration(str, i, jSONObject, jSONObject2);
    }
}
