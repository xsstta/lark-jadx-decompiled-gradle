package com.bytedance.ee.larkbrand.hostbridge.inner;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.larkbrand.utils.sharedpreference.Sp;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.p3378d.AbstractC67571b;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/larkbrand/hostbridge/inner/SharePreferenceHandlerV2;", "Lcom/tt/miniapphost/process/handler/ISyncHostDataHandler;", "()V", "action", "Lcom/tt/miniapphost/process/data/CrossProcessDataEntity;", "callData", "getType", "", "Companion", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.larkbrand.hostbridge.b.e */
public final class SharePreferenceHandlerV2 implements AbstractC67571b {

    /* renamed from: a */
    public static final Companion f34788a = new Companion(null);

    @Override // com.tt.miniapphost.process.p3378d.AbstractC67571b
    /* renamed from: a */
    public String mo49139a() {
        return "lark_sp_op_v2";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/bytedance/ee/larkbrand/hostbridge/inner/SharePreferenceHandlerV2$Companion;", "", "()V", "ACTION", "", "ACTION_PUT", "", "ACTION_REMOVE", "CMD", "CMD_EDIT", "CMD_GET", "ITEMS", "KEY", "SP_NAME", "TAG", "TYPE", "TYPE_BOOLEAN", "TYPE_INT", "TYPE_LONG", "TYPE_STRING", "VALUE", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.larkbrand.hostbridge.b.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.tt.miniapphost.process.p3378d.AbstractC67571b
    /* renamed from: a */
    public CrossProcessDataEntity mo49138a(CrossProcessDataEntity crossProcessDataEntity) {
        if (crossProcessDataEntity != null) {
            AppBrandLogger.m52830i("SharePreferenceHandlerV2", "call data: " + crossProcessDataEntity);
            CrossProcessDataEntity.C67574a a = CrossProcessDataEntity.C67574a.m263013a();
            JSONObject f = crossProcessDataEntity.mo234749f("sp_data");
            int i = f.getInt("command");
            String string = f.getString("spName");
            JSONArray jSONArray = f.getJSONArray("items");
            AppbrandContext inst = AppbrandContext.getInst();
            Intrinsics.checkExpressionValueIsNotNull(inst, "AppbrandContext.getInst()");
            if (inst.getApplicationContext() != null) {
                Sp.Companion aVar = Sp.f35236a;
                Intrinsics.checkExpressionValueIsNotNull(string, "spName");
                Sp a2 = Sp.Companion.m54292a(aVar, string, false, 2, null);
                if (i == 0) {
                    boolean d = crossProcessDataEntity.mo234746d("sp_save_type");
                    Intrinsics.checkExpressionValueIsNotNull(jSONArray, "items");
                    Iterator<JSONObject> a3 = C13104f.m53668a(jSONArray);
                    while (a3.hasNext()) {
                        JSONObject next = a3.next();
                        String string2 = next.getString("key");
                        if (next.getInt("put") == 1) {
                            Intrinsics.checkExpressionValueIsNotNull(string2, "key");
                            a2.mo49644b(string2, next.get("value"));
                        } else {
                            Intrinsics.checkExpressionValueIsNotNull(string2, "key");
                            a2.mo49641a(string2);
                        }
                    }
                    a.mo234760a("sp_result", (Object) Boolean.valueOf(a2.mo49643a(d)));
                } else if (i == 1) {
                    if (jSONArray.length() > 0) {
                        Object obj = jSONArray.get(0);
                        if (obj != null) {
                            JSONObject jSONObject = (JSONObject) obj;
                            String string3 = jSONObject.getString("key");
                            String string4 = jSONObject.getString("value");
                            Intrinsics.checkExpressionValueIsNotNull(string3, "key");
                            a.mo234760a("sp_result", a2.mo49642a(string3, string4));
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type org.json.JSONObject");
                        }
                    } else {
                        a.mo234760a("sp_result", (Object) "");
                    }
                }
                CrossProcessDataEntity b = a.mo234763b();
                Intrinsics.checkExpressionValueIsNotNull(b, "ret.build()");
                return b;
            }
            CrossProcessDataEntity b2 = a.mo234763b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "ret.build()");
            return b2;
        }
        CrossProcessDataEntity b3 = CrossProcessDataEntity.C67574a.m263013a().mo234763b();
        Intrinsics.checkExpressionValueIsNotNull(b3, "CrossProcessDataEntity.Builder.create().build()");
        return b3;
    }
}
