package com.tt.miniapp.event.p3281b;

import android.app.Application;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapp.process.SandboxMonitor;
import com.tt.miniapp.process.info.api.ISandboxEnvInfo;
import com.tt.miniapp.process.manager.C66645a;
import com.tt.miniapp.process.manager.IAppSandboxEnvProcessor;
import com.tt.miniapphost.AppbrandContext;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.event.b.e */
public class C66033e {

    /* renamed from: a */
    private static final Map<String, C66031d> f166692a = new ConcurrentHashMap();

    static {
        for (IAppSandboxEnvProcessor iAppSandboxEnvProcessor : C66645a.m260337a().mo232359b()) {
            if (iAppSandboxEnvProcessor != null) {
                AppBrandLogger.m52830i("tma_InnerMiniProcessLogHelper", "processor:" + iAppSandboxEnvProcessor.getSandBoxType());
                iAppSandboxEnvProcessor.registerSandboxLifeListener(new SandboxMonitor.AbstractC66610a() {
                    /* class com.tt.miniapp.event.p3281b.C66033e.C660341 */

                    @Override // com.tt.miniapp.process.SandboxMonitor.AbstractC66610a
                    public void onAlive(ISandboxEnvInfo iSandboxEnvInfo) {
                        C66033e.m258573a(iSandboxEnvInfo);
                    }

                    @Override // com.tt.miniapp.process.SandboxMonitor.AbstractC66610a
                    public void onDied(ISandboxEnvInfo iSandboxEnvInfo) {
                        C66033e.m258575b(iSandboxEnvInfo);
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public static void m258573a(ISandboxEnvInfo iSandboxEnvInfo) {
        C66031d dVar;
        if (iSandboxEnvInfo != null) {
            String appId = iSandboxEnvInfo.getAppId();
            if (!TextUtils.isEmpty(appId) && (dVar = f166692a.get(appId)) != null) {
                dVar.mo231108a(iSandboxEnvInfo.getSandboxName());
            }
        }
    }

    /* renamed from: b */
    public static void m258575b(ISandboxEnvInfo iSandboxEnvInfo) {
        IAppSandboxEnvProcessor e;
        C66031d dVar;
        if (iSandboxEnvInfo != null) {
            String appId = iSandboxEnvInfo.getAppId();
            if (!TextUtils.isEmpty(appId) && (dVar = f166692a.get(appId)) != null) {
                dVar.mo231111c();
            }
        }
        Application applicationContext = AppbrandContext.getInst().getApplicationContext();
        Iterator<Map.Entry<String, C66031d>> it = f166692a.entrySet().iterator();
        while (it.hasNext()) {
            C66031d value = it.next().getValue();
            if (!(value == null || (e = C66645a.m260337a().mo232363e(value.f166690a)) == null || e.isAppSandBoxEnvExistByAppId(applicationContext, value.f166690a))) {
                value.mo231111c();
                it.remove();
            }
        }
        AppBrandLogger.m52828d("tma_InnerMiniProcessLogHelper", "onMiniAppProcessDied: {event:" + f166692a.size() + "}");
    }

    /* renamed from: a */
    public static boolean m258574a(String str, JSONObject jSONObject) {
        AppBrandLogger.m52828d("tma_InnerMiniProcessLogHelper", "innerHandleEventLog: " + str + ", " + jSONObject);
        if (jSONObject == null || TextUtils.isEmpty(str)) {
            AppBrandLogger.m52829e("tma_InnerMiniProcessLogHelper", "innerHandleEventLog: " + str + ", " + jSONObject);
            return false;
        }
        String optString = jSONObject.optString("app_id");
        if (TextUtils.isEmpty(optString)) {
            AppBrandLogger.m52830i("tma_InnerMiniProcessLogHelper", "49411_innerHandleEventLog: empty appId: " + optString);
            return jSONObject.optBoolean("__inner_handled", false);
        }
        Map<String, C66031d> map = f166692a;
        if (map.get(optString) == null) {
            synchronized (map) {
                if (map.get(optString) == null) {
                    C66031d dVar = new C66031d(optString);
                    map.put(optString, dVar);
                    ISandboxEnvInfo a = C66645a.m260337a().mo232354a(optString);
                    if (a != null) {
                        String sandboxName = a.getSandboxName();
                        if (a.getMiniProcessMontior().isAlive()) {
                            dVar.mo231108a(sandboxName);
                        }
                    }
                }
            }
            AppBrandLogger.m52828d("tma_InnerMiniProcessLogHelper", "49411_mem_event_handler_add: " + optString + " : " + map.size());
        }
        C66031d dVar2 = map.get(optString);
        boolean optBoolean = jSONObject.optBoolean("__inner_handled", false);
        if (dVar2 != null) {
            return dVar2.mo231112c(new C66029b(str, jSONObject, optBoolean));
        }
        return optBoolean;
    }
}
