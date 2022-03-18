package com.tt.refer.impl.business.api.diagnose.commands;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.ref.impl.host.HostExtensionManager;
import com.tt.refer.impl.business.api.diagnose.AbstractC67885a;
import com.tt.refer.impl.business.api.diagnose.entity.DumpConfig;
import com.tt.refer.impl.business.api.diagnose.entity.DumpService;
import com.tt.refer.impl.business.api.diagnose.entity.DumpServiceType;
import com.tt.refer.impl.business.api.diagnose.entity.LogDumpService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0016R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/tt/refer/impl/business/api/diagnose/commands/SetDumpEnable;", "Lcom/tt/refer/impl/business/api/diagnose/AbsDebugCommand;", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "execute", "Lorg/json/JSONObject;", "appContext", "Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;", "params", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.tt.refer.impl.business.api.diagnose.a.t */
public final class SetDumpEnable extends AbstractC67885a {

    /* renamed from: a */
    private final String f170984a = "SetDumpEnable";

    @Override // com.tt.refer.impl.business.api.diagnose.AbstractC67885a
    /* renamed from: a */
    public JSONObject mo235512a(IAppContext iAppContext, JSONObject jSONObject) {
        String str;
        boolean z;
        Exception e;
        Intrinsics.checkParameterIsNotNull(iAppContext, "appContext");
        if (jSONObject != null) {
            str = jSONObject.optString("app_id");
        } else {
            str = null;
        }
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            AppBrandLogger.m52829e(this.f170984a, " set dump enable fail, appid is null ");
            JSONObject a = mo235513a("appid is null");
            Intrinsics.checkExpressionValueIsNotNull(a, "fail(\"appid is null\")");
            return a;
        }
        String str3 = "";
        DumpConfig dumpConfig = new DumpConfig(str);
        if (jSONObject.has("domain")) {
            dumpConfig.mo235518a(jSONObject.optString("domain"));
        }
        if (jSONObject.has("duration")) {
            dumpConfig.mo235517a(jSONObject.optInt("duration", 0));
        }
        if (jSONObject.has("user_id")) {
            dumpConfig.mo235519b(jSONObject.optString("user_id"));
        }
        try {
            HostExtensionManager instance = HostExtensionManager.getInstance();
            Intrinsics.checkExpressionValueIsNotNull(instance, "HostExtensionManager.getInstance()");
            DumpService applyDumpInfo = instance.getHostInterface().applyDumpInfo(DumpServiceType.LOG, dumpConfig);
            if (applyDumpInfo instanceof LogDumpService) {
                String b = ((LogDumpService) applyDumpInfo).mo235540b();
                Intrinsics.checkExpressionValueIsNotNull(b, "dumpService.key");
                try {
                    String str4 = this.f170984a;
                    AppBrandLogger.m52830i(str4, "generate random key " + b);
                    str3 = b;
                } catch (Exception e2) {
                    e = e2;
                    str3 = b;
                    AppBrandLogger.m52829e(this.f170984a, "set dump info err,", e);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("secret_key", str3);
                    return jSONObject2;
                }
            }
        } catch (Exception e3) {
            e = e3;
            AppBrandLogger.m52829e(this.f170984a, "set dump info err,", e);
            JSONObject jSONObject22 = new JSONObject();
            jSONObject22.put("secret_key", str3);
            return jSONObject22;
        }
        JSONObject jSONObject222 = new JSONObject();
        jSONObject222.put("secret_key", str3);
        return jSONObject222;
    }
}
