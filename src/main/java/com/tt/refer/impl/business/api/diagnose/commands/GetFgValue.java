package com.tt.refer.impl.business.api.diagnose.commands;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.refer.impl.business.api.diagnose.AbstractC67885a;
import com.tt.refer.p3400a.p3408f.AbstractC67724a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0016R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/tt/refer/impl/business/api/diagnose/commands/GetFgValue;", "Lcom/tt/refer/impl/business/api/diagnose/AbsDebugCommand;", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "execute", "Lorg/json/JSONObject;", "appContext", "Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;", "params", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.tt.refer.impl.business.api.diagnose.a.j */
public final class GetFgValue extends AbstractC67885a {

    /* renamed from: a */
    private final String f170977a = "GetFgValue";

    @Override // com.tt.refer.impl.business.api.diagnose.AbstractC67885a
    /* renamed from: a */
    public JSONObject mo235512a(IAppContext iAppContext, JSONObject jSONObject) {
        String optString;
        Intrinsics.checkParameterIsNotNull(iAppContext, "appContext");
        if (jSONObject == null || (optString = jSONObject.optString("fg_key")) == null) {
            AppBrandLogger.m52829e(this.f170977a, "GetFgValue, no fg_key: ", jSONObject);
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("fg_value", ((AbstractC67724a) iAppContext.findServiceByInterface(AbstractC67724a.class)).mo50456b(optString));
        return jSONObject2;
    }
}
