package com.tt.miniapp.falcon.p3287c;

import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkoryx.OryxManagerProxy;
import com.google.firebase.messaging.Constants;
import com.lark.falcon.engine.bridge.JavaOnlyArray;
import com.lark.falcon.engine.bridge.JavaOnlyMap;
import com.lark.falcon.engine.bridge.ReadableMap;
import com.larksuite.component.openplatform.core.loader.jsbundle.C24512a;
import com.larksuite.component.openplatform.infra.p1140c.p1141a.C25538c;
import com.ss.android.lark.opmonitor.trace.OPTrace;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.BridgeUniteHelper;
import com.tt.miniapp.debug.VConsoleManager;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67433a;
import com.tt.miniapphost.util.MiniAppProcessUtils;
import com.tt.miniapphost.util.ProcessUtil;
import com.tt.refer.p3400a.p3401a.AbstractC67699a;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.falcon.c.a */
public class C66062a {

    /* renamed from: a */
    private IAppContext f166756a;

    /* renamed from: c */
    private ReadableMap m258691c() {
        boolean z;
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        IAppContext iAppContext = this.f166756a;
        if (!(iAppContext instanceof AbstractC67433a) || !((AbstractC67433a) iAppContext).mo234169i()) {
            z = false;
        } else {
            z = true;
        }
        javaOnlyMap.putBoolean("isSSBModel", z);
        return javaOnlyMap;
    }

    /* renamed from: b */
    public JavaOnlyMap mo231165b() {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.merge(m258696h());
        javaOnlyMap.merge(m258697i());
        javaOnlyMap.merge(m258691c());
        return javaOnlyMap;
    }

    /* renamed from: d */
    private JavaOnlyMap m258692d() {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.putString("platform", "android");
        javaOnlyMap.putBoolean("pageCreateInAdvance", C24512a.m89385a(this.f166756a.getAppId()));
        JavaOnlyMap javaOnlyMap2 = new JavaOnlyMap();
        javaOnlyMap2.putMap("TMAConfig", javaOnlyMap);
        return javaOnlyMap2;
    }

    /* renamed from: e */
    private JavaOnlyMap m258693e() {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        String process = ProcessUtil.getProcess();
        if (!OryxManagerProxy.f35291a.mo49688c() || !MiniAppProcessUtils.isOryxProcess(process)) {
            return javaOnlyMap;
        }
        JavaOnlyMap javaOnlyMap2 = new JavaOnlyMap();
        javaOnlyMap2.putInt("oryx_started", 1);
        return javaOnlyMap2;
    }

    /* renamed from: f */
    private JavaOnlyMap m258694f() {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.putString("platform", "android");
        javaOnlyMap.putBoolean("debug", ((VConsoleManager) AppbrandApplicationImpl.getInst(this.f166756a).getService(VConsoleManager.class)).isVConsoleSwitchOn());
        JavaOnlyMap javaOnlyMap2 = new JavaOnlyMap();
        javaOnlyMap2.putMap("nativeTMAConfig", javaOnlyMap);
        return javaOnlyMap2;
    }

    /* renamed from: g */
    private JavaOnlyMap m258695g() {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.putBoolean("shouldUseNewBridge", BridgeUniteHelper.f166701a.mo231125a());
        javaOnlyMap.putBoolean("apiUseJSSDKMonitor", C24512a.m89386b());
        javaOnlyMap.putBoolean("workerApiUseJSSDKMonitor", C24512a.m89388c());
        JavaOnlyMap javaOnlyMap2 = new JavaOnlyMap();
        javaOnlyMap2.putMap("JSCoreFG", javaOnlyMap);
        return javaOnlyMap2;
    }

    /* renamed from: a */
    public JavaOnlyMap mo231164a() {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.merge(m258692d());
        javaOnlyMap.merge(m258693e());
        javaOnlyMap.merge(m258694f());
        javaOnlyMap.merge(m258695g());
        return javaOnlyMap;
    }

    /* renamed from: h */
    private JavaOnlyMap m258696h() {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        OPTrace tracing = AppbrandContext.getInst().getTracing();
        if (tracing != null) {
            JavaOnlyMap javaOnlyMap2 = new JavaOnlyMap();
            javaOnlyMap2.putString("traceId", tracing.getTracingID());
            javaOnlyMap2.putLong("createTime", tracing.createTime());
            javaOnlyMap2.putArray("extensions", new JavaOnlyArray());
            JavaOnlyMap javaOnlyMap3 = new JavaOnlyMap();
            javaOnlyMap3.putString("optrace_batch_config", C25538c.m91188a().mo88680b());
            javaOnlyMap2.putMap("config", javaOnlyMap3);
            javaOnlyMap.putMap("TMATrace", javaOnlyMap2);
        }
        return javaOnlyMap;
    }

    /* renamed from: i */
    private JavaOnlyMap m258697i() {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        AbstractC67699a aVar = (AbstractC67699a) this.f166756a.findServiceByInterface(AbstractC67699a.class);
        if (aVar != null) {
            JSONObject b = aVar.mo234977b();
            if (b != null) {
                JavaOnlyMap javaOnlyMap2 = new JavaOnlyMap();
                javaOnlyMap2.putString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, b.toString());
                javaOnlyMap.putMap("nativeStorageInfo", javaOnlyMap2);
            }
            JSONObject c = aVar.mo234979c();
            if (c != null) {
                JavaOnlyMap javaOnlyMap3 = new JavaOnlyMap();
                javaOnlyMap3.putString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, c.toString());
                javaOnlyMap.putMap("nativeStorage", javaOnlyMap3);
            }
        }
        return javaOnlyMap;
    }

    public C66062a(IAppContext iAppContext) {
        this.f166756a = iAppContext;
    }
}
