package com.tt.refer.impl.business.api.diagnose.commands;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.lark.infra.sandbox.context.IBaseService;
import com.tt.miniapp.permission.C66578b;
import com.tt.refer.impl.business.api.diagnose.AbstractC67885a;
import com.tt.refer.p3400a.p3401a.AbstractC67709b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0016R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/tt/refer/impl/business/api/diagnose/commands/GetGrantedPermissions;", "Lcom/tt/refer/impl/business/api/diagnose/AbsDebugCommand;", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "execute", "Lorg/json/JSONObject;", "appContext", "Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;", "params", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.tt.refer.impl.business.api.diagnose.a.k */
public final class GetGrantedPermissions extends AbstractC67885a {

    /* renamed from: a */
    private final String f170978a = "GetGrantedPermissions";

    @Override // com.tt.refer.impl.business.api.diagnose.AbstractC67885a
    /* renamed from: a */
    public JSONObject mo235512a(IAppContext iAppContext, JSONObject jSONObject) {
        String optString;
        Intrinsics.checkParameterIsNotNull(iAppContext, "appContext");
        if (jSONObject == null || (optString = jSONObject.optString("app_id")) == null) {
            AppBrandLogger.m52829e(this.f170978a, "appId is null");
            return null;
        }
        IBaseService findServiceByInterface = iAppContext.findServiceByInterface(AbstractC67709b.class);
        Intrinsics.checkExpressionValueIsNotNull(findServiceByInterface, "appContext.findServiceBy…(IAPIService::class.java)");
        AbstractC67709b.AbstractC67710a aVar = (AbstractC67709b.AbstractC67710a) ((AbstractC67709b) findServiceByInterface).mo235130i();
        JSONObject jSONObject2 = new JSONObject();
        List<C66578b.C66579a> i = aVar.mo235057i(optString);
        if (i != null) {
            for (T t : i) {
                if (aVar.mo235036a(optString, t.f168120b)) {
                    int i2 = t.f168120b;
                    if (i2 == 12) {
                        jSONObject2.put("scope.userLocation", aVar.mo235043b(optString, t.f168120b));
                    } else if (i2 == 13) {
                        jSONObject2.put("scope.record", aVar.mo235043b(optString, t.f168120b));
                    } else if (i2 != 16) {
                        switch (i2) {
                            case 19:
                                jSONObject2.put("scope.clipboard", aVar.mo235043b(optString, t.f168120b));
                                continue;
                            case 20:
                                jSONObject2.put("scope.appBadge", aVar.mo235043b(optString, t.f168120b));
                                continue;
                            case 21:
                                jSONObject2.put("scope.runData", aVar.mo235043b(optString, t.f168120b));
                                continue;
                        }
                    } else {
                        jSONObject2.put("scope.writePhotosAlbum", aVar.mo235043b(optString, t.f168120b));
                    }
                }
            }
        }
        if (jSONObject2.length() > 0) {
            return new JSONObject().put("authSetting", jSONObject2);
        }
        String str = this.f170978a;
        AppBrandLogger.m52830i(str, "no permission found for " + optString);
        return null;
    }
}
