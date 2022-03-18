package com.tt.refer.impl.business.api.diagnose.commands;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.p3375a.C67560a;
import com.tt.refer.impl.business.api.diagnose.AbstractC67885a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\t"}, d2 = {"Lcom/tt/refer/impl/business/api/diagnose/commands/KillGadget;", "Lcom/tt/refer/impl/business/api/diagnose/AbsDebugCommand;", "()V", "execute", "Lorg/json/JSONObject;", "appContext", "Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;", "params", "Companion", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.tt.refer.impl.business.api.diagnose.a.s */
public final class KillGadget extends AbstractC67885a {

    /* renamed from: a */
    public static final Companion f170983a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tt/refer/impl/business/api/diagnose/commands/KillGadget$Companion;", "", "()V", "TAG", "", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.tt.refer.impl.business.api.diagnose.a.s$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.tt.refer.impl.business.api.diagnose.AbstractC67885a
    /* renamed from: a */
    public JSONObject mo235512a(IAppContext iAppContext, JSONObject jSONObject) {
        String optString;
        Intrinsics.checkParameterIsNotNull(iAppContext, "appContext");
        if (jSONObject == null || (optString = jSONObject.optString("app_id")) == null) {
            AppBrandLogger.m52829e("KillGadget", "appId is empty");
            return mo235513a("appId is empty.");
        }
        CrossProcessDataEntity a = C67560a.m262955a("killGadget", CrossProcessDataEntity.C67574a.m263013a().mo234760a("miniAppId", (Object) optString).mo234763b());
        if (a == null) {
            return mo235513a("IPC result is null");
        }
        boolean d = a.mo234746d("gadgetIsRunning");
        AppBrandLogger.m52830i("KillGadget", "appId: " + optString + ", isRunning: " + d);
        return mo235511a();
    }
}
