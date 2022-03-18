package com.tt.miniapp.webbridge;

import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.core.loader.jsbundle.C24512a;
import com.larksuite.component.openplatform.core.loader.jsbundle.bean.ReadyJSComponent;
import com.ss.android.lark.opmonitor.trace.OPTrace;
import com.tt.miniapp.BridgeUniteHelper;
import com.tt.miniapp.C66546p;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.manager.p3302a.C66399c;
import com.tt.miniapp.settings.v2.handler.C66769e;
import com.tt.miniapp.util.C67043j;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67433a;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67434b;
import java.lang.ref.SoftReference;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.webbridge.b */
public class C67310b {

    /* renamed from: a */
    private SoftReference<RenderViewManager.IRender> f169852a;

    /* renamed from: b */
    private IAppContext f169853b;

    /* renamed from: c */
    private boolean f169854c;

    @JavascriptInterface
    public boolean apiUseJSSDKMonitor() {
        return C24512a.m89386b();
    }

    @JavascriptInterface
    public boolean shouldUseNewBridge() {
        return BridgeUniteHelper.f166701a.mo231125a();
    }

    @JavascriptInterface
    public boolean useEditorNewBridge() {
        return HostDependManager.getInst().getFeatureGating("editor.use.larkwebview.bridge", false);
    }

    @JavascriptInterface
    public boolean isSupportTTWebViewRender() {
        SoftReference<RenderViewManager.IRender> softReference = this.f169852a;
        if (softReference == null || softReference.get() == null) {
            return false;
        }
        return this.f169852a.get().isRenderInBrowserEnabled();
    }

    @JavascriptInterface
    public String TMATrace() {
        OPTrace tracing = AppbrandContext.getInst().getTracing();
        JSONObject jSONObject = new JSONObject();
        if (tracing != null) {
            try {
                jSONObject.put("traceId", tracing.getTracingID());
                jSONObject.put("createTime", tracing.createTime());
                jSONObject.put("extensions", new JSONArray());
            } catch (JSONException e) {
                AppBrandLogger.m52829e("EMANativeConfig", "TMATrace Exception", e);
            }
        }
        return jSONObject.toString();
    }

    @JavascriptInterface
    public String getJsComponents() {
        Map<String, ReadyJSComponent> a;
        AppBrandLogger.m52830i("EMANativeConfig", "start getJsComponent ");
        JSONObject jSONObject = new JSONObject();
        SoftReference<RenderViewManager.IRender> softReference = this.f169852a;
        if (softReference == null) {
            AppBrandLogger.m52829e("EMANativeConfig", "getJsComponent:mRender is null!");
            return jSONObject.toString();
        }
        RenderViewManager.IRender iRender = softReference.get();
        if (iRender == null) {
            AppBrandLogger.m52829e("EMANativeConfig", "getJsComponent:render is null!");
            return jSONObject.toString();
        }
        List<String> dependencyJsComponents = iRender.getDependencyJsComponents();
        AppBrandLogger.m52830i("EMANativeConfig", "componentNameList->", Arrays.toString(dependencyJsComponents.toArray()));
        if (dependencyJsComponents != null && !dependencyJsComponents.isEmpty() && (a = C66399c.m259608a().mo231914a(dependencyJsComponents, this.f169853b)) != null && !a.isEmpty()) {
            for (Map.Entry<String, ReadyJSComponent> entry : a.entrySet()) {
                if (entry != null) {
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("path", entry.getValue().mo87445a());
                        jSONObject.put(entry.getKey(), jSONObject2);
                    } catch (Exception e) {
                        e.printStackTrace();
                        AppBrandLogger.m52829e("EMANativeConfig", "getJsComponents Exception", e);
                    }
                }
            }
        }
        String jSONObject3 = jSONObject.toString();
        AppBrandLogger.m52830i("EMANativeConfig", "getJsComponent->", jSONObject3);
        return jSONObject3;
    }

    @JavascriptInterface
    public String getRealWindowWidth() {
        int i;
        IAppContext iAppContext;
        JSONObject jSONObject = new JSONObject();
        AbstractC67434b a = ((AbstractC67433a) this.f169853b).mo234156a();
        boolean isInParallelWindow = this.f169853b.isInParallelWindow();
        if (!(!(a instanceof C66546p) || (iAppContext = this.f169853b) == null || iAppContext.getApplicationContext() == null)) {
            C66546p pVar = (C66546p) a;
            if (pVar.mo232134w() != null) {
                i = (int) (((float) pVar.mo232134w().getMeasuredWidth()) / C67043j.m261281e(this.f169853b.getApplicationContext()));
                jSONObject.put("is_in_parallel_window", isInParallelWindow);
                jSONObject.put("real_window_width", i);
                AppBrandLogger.m52830i("EMANativeConfig", "getRealWindowWidth : " + i + " is in parallel window : " + isInParallelWindow);
                return jSONObject.toString();
            }
        }
        i = -1;
        try {
            jSONObject.put("is_in_parallel_window", isInParallelWindow);
            jSONObject.put("real_window_width", i);
            AppBrandLogger.m52830i("EMANativeConfig", "getRealWindowWidth : " + i + " is in parallel window : " + isInParallelWindow);
        } catch (JSONException e) {
            AppBrandLogger.m52829e("EMANativeConfig", "getRealWindowWidth put json error: " + e.getMessage());
        }
        return jSONObject.toString();
    }

    @JavascriptInterface
    public boolean textareaSwitchable() {
        if (HostDependManager.getInst().getFeatureGating("gadget.component.switchabletextarea")) {
            AppBrandLogger.m52830i("EMANativeConfig", "switchTextArea fg on");
            return true;
        }
        String b = C66769e.m260610a().mo232675b();
        if (!TextUtils.isEmpty(b)) {
            try {
                JSONArray jSONArray = new JSONArray(b);
                AppInfoEntity appInfo = C67432a.m262319a(this.f169853b).getAppInfo();
                if (appInfo == null) {
                    AppBrandLogger.m52830i("EMANativeConfig", "appInfo null, switchTextArea return false");
                    return false;
                }
                String str = appInfo.appId;
                for (int i = 0; i < jSONArray.length(); i++) {
                    if (TextUtils.equals(jSONArray.getString(i), str)) {
                        AppBrandLogger.m52830i("EMANativeConfig", "switchTextArea config enable for: " + str);
                        return true;
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
                AppBrandLogger.eWithThrowable("EMANativeConfig", "switchTextArea ", e);
            }
        }
        AppBrandLogger.m52830i("EMANativeConfig", "switchTextArea return false");
        return false;
    }

    /* renamed from: a */
    public void mo233977a(RenderViewManager.IRender iRender) {
        AppBrandLogger.m52830i("EMANativeConfig", "EMANativeConfig->setRender");
        this.f169852a = new SoftReference<>(iRender);
    }

    public C67310b(IAppContext iAppContext, boolean z) {
        this.f169853b = iAppContext;
        this.f169854c = z;
    }
}
