package com.tt.refer.impl.business.api.diagnose.commands;

import android.app.ActivityManager;
import android.content.Context;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.refer.impl.business.api.diagnose.AbstractC67885a;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0016R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bXD¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/tt/refer/impl/business/api/diagnose/commands/GetMemoryInfo;", "Lcom/tt/refer/impl/business/api/diagnose/AbsDebugCommand;", "()V", "MB", "", "getMB", "()I", "TAG", "", "getTAG", "()Ljava/lang/String;", "execute", "Lorg/json/JSONObject;", "appContext", "Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;", "params", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.tt.refer.impl.business.api.diagnose.a.l */
public final class GetMemoryInfo extends AbstractC67885a {

    /* renamed from: a */
    private final String f170979a = "GetMemoryInfo";

    /* renamed from: b */
    private final int f170980b = 1048576;

    @Override // com.tt.refer.impl.business.api.diagnose.AbstractC67885a
    /* renamed from: a */
    public JSONObject mo235512a(IAppContext iAppContext, JSONObject jSONObject) {
        Intrinsics.checkParameterIsNotNull(iAppContext, "appContext");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        Context applicationContext = iAppContext.getApplicationContext();
        if (applicationContext != null) {
            Object systemService = applicationContext.getSystemService("activity");
            if (systemService != null) {
                ((ActivityManager) systemService).getMemoryInfo(memoryInfo);
                if (applicationContext != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("total_memory", memoryInfo.totalMem / ((long) this.f170980b));
                    jSONObject2.put("available_memory", memoryInfo.availMem / ((long) this.f170980b));
                    return jSONObject2;
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.app.ActivityManager");
            }
        }
        AppBrandLogger.m52829e(this.f170979a, "context null ");
        return null;
    }
}
