package com.bytedance.ee.larkbrand.hostbridge.inner;

import android.os.SystemClock;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.network.larkbrand.net.MiniEnvType;
import com.bytedance.ee.lark.infra.network.larkbrand.net.RustNetworkLevel;
import com.bytedance.ee.larkbrand.C12968b;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.bytedance.ee.larkbrand.LarkHostDependManager;
import com.bytedance.ee.larkbrand.service.ExtensionWrapper;
import com.ss.android.lark.littleapp.EnvInfo;
import com.ss.android.lark.log.Log;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.p3378d.AbstractC67571b;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Deprecated(message = "此类已经废弃，推荐使用EventReporter")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u001c\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u0004H\u0016J\u001c\u0010\u0010\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u000eH\u0002J\u001c\u0010\u0013\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0015"}, d2 = {"Lcom/bytedance/ee/larkbrand/hostbridge/inner/AppLogHandler;", "Lcom/tt/miniapphost/process/handler/ISyncHostDataHandler;", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "action", "Lcom/tt/miniapphost/process/data/CrossProcessDataEntity;", "callData", "checkReportData", "", "eventName", "reportData", "Lorg/json/JSONObject;", "getType", "sendEventToSlardar", "event", "raw", "sendEventToTEA", "value", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.larkbrand.hostbridge.b.a */
public final class AppLogHandler implements AbstractC67571b {

    /* renamed from: a */
    private final String f34787a = "AppLogHandler";

    @Override // com.tt.miniapphost.process.p3378d.AbstractC67571b
    /* renamed from: a */
    public String mo49139a() {
        return "actionLog";
    }

    @Override // com.tt.miniapphost.process.p3378d.AbstractC67571b
    /* renamed from: a */
    public CrossProcessDataEntity mo49138a(CrossProcessDataEntity crossProcessDataEntity) {
        if (crossProcessDataEntity == null) {
            return null;
        }
        String b = crossProcessDataEntity.mo234744b("logEventName");
        JSONObject f = crossProcessDataEntity.mo234749f("logEventData");
        int e = crossProcessDataEntity.mo234748e("logPlatform");
        if (e == 0) {
            e = 2;
        }
        m53656a(b, f);
        if ((e & 2) != 0) {
            m53657b(b, f);
        }
        if ((e & 4) != 0) {
            m53655a(b, f.toString());
        }
        C12968b.m53393a().mo48869a(b, f);
        return null;
    }

    /* renamed from: a */
    private final void m53655a(String str, String str2) {
        if (str != null && str2 != null) {
            LarkExtensionManager instance = LarkExtensionManager.getInstance();
            Intrinsics.checkExpressionValueIsNotNull(instance, "LarkExtensionManager.getInstance()");
            instance.getExtension().mo49574a(str, new JSONObject(str2));
        }
    }

    /* renamed from: a */
    private final void m53656a(String str, JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.optString("trace_id", null) == null) {
            String str2 = this.f34787a;
            AppBrandLogger.m52829e(str2, str + ", trace_id is null");
        }
    }

    /* renamed from: b */
    private final void m53657b(String str, JSONObject jSONObject) {
        int i;
        if (jSONObject != null && str != null) {
            JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
            if (jSONObject2.length() != 0) {
                LarkExtensionManager instance = LarkExtensionManager.getInstance();
                Intrinsics.checkExpressionValueIsNotNull(instance, "LarkExtensionManager.getInstance()");
                ExtensionWrapper extension = instance.getExtension();
                Intrinsics.checkExpressionValueIsNotNull(extension, "LarkExtensionManager.getInstance().extension");
                RustNetworkLevel forNumber = RustNetworkLevel.forNumber(extension.getCurNetworkLevel());
                Intrinsics.checkExpressionValueIsNotNull(forNumber, "RustNetworkLevel.forNumb…xtension.curNetworkLevel)");
                jSONObject2.put("rust_status", forNumber.getValue());
                EnvInfo a = LarkHostDependManager.f34682b.mo49086a().mo48917a();
                if (a != null) {
                    i = a.mo148731b();
                } else {
                    i = 0;
                }
                MiniEnvType forNumber2 = MiniEnvType.forNumber(i);
                Intrinsics.checkExpressionValueIsNotNull(forNumber2, "MiniEnvType.forNumber(envInfo?.envType ?: 0)");
                jSONObject2.put("evn_type", forNumber2.getValue());
                jSONObject2.put("cpu_time", SystemClock.elapsedRealtime());
                LarkExtensionManager instance2 = LarkExtensionManager.getInstance();
                Intrinsics.checkExpressionValueIsNotNull(instance2, "LarkExtensionManager.getInstance()");
                instance2.getExtension().monitorDuration(str, jSONObject2, null);
                String str2 = this.f34787a;
                Log.m165379d(str2, "sendEventToSlardar-> :" + str + " data:" + jSONObject2);
            }
        }
    }
}
