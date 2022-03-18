package com.tt.refer.impl.business.api.diagnose.commands;

import android.content.Context;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.refer.common.util.NetworkUtil;
import com.tt.refer.impl.business.api.diagnose.AbstractC67885a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\b"}, d2 = {"Lcom/tt/refer/impl/business/api/diagnose/commands/GetNetWorkType;", "Lcom/tt/refer/impl/business/api/diagnose/AbsDebugCommand;", "()V", "execute", "Lorg/json/JSONObject;", "appContext", "Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;", "params", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.tt.refer.impl.business.api.diagnose.a.n */
public final class GetNetWorkType extends AbstractC67885a {
    @Override // com.tt.refer.impl.business.api.diagnose.AbstractC67885a
    /* renamed from: a */
    public JSONObject mo235512a(IAppContext iAppContext, JSONObject jSONObject) {
        Intrinsics.checkParameterIsNotNull(iAppContext, "appContext");
        JSONObject jSONObject2 = new JSONObject();
        NetworkUtil.Companion aVar = NetworkUtil.f170931k;
        Context applicationContext = iAppContext.getApplicationContext();
        Intrinsics.checkExpressionValueIsNotNull(applicationContext, "appContext.applicationContext");
        jSONObject2.put("network_type", aVar.mo235497a(applicationContext));
        return jSONObject2;
    }
}
