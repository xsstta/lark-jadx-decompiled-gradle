package com.bytedance.lynx.webview.p843b;

import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebViewFactoryProvider;
import com.bytedance.lynx.webview.glue.ISdkToGlue;
import com.bytedance.lynx.webview.util.AbstractC20047f;
import com.bytedance.lynx.webview.util.C20048g;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.lynx.webview.b.a */
public class C19925a implements ISdkToGlue {

    /* renamed from: a */
    private static Map<String, Method> f48683a = AbstractC20047f.m73157a(ISdkToGlue.class, "com.bytedance.webview.chromium.SdkToGlueImpl");

    /* renamed from: b */
    private Object f48684b;

    @Override // com.bytedance.lynx.webview.glue.sdk113.ISdkToGlueSdk113
    public void cancelAllPreload() {
        Method method = f48683a.get("cancelAllPreload");
        Object obj = this.f48684b;
        if (obj != null && method != null) {
            try {
                method.invoke(obj, new Object[0]);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.bytedance.lynx.webview.glue.sdk113.ISdkToGlueSdk113
    public void clearAllPreloadCache() {
        Method method = f48683a.get("clearAllPreloadCache");
        Object obj = this.f48684b;
        if (obj != null && method != null) {
            try {
                method.invoke(obj, new Object[0]);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.bytedance.lynx.webview.glue.sdk113.ISdkToGlueSdk113
    public void clearPrerenderQueue() {
        Method method = f48683a.get("clearPrerenderQueue");
        Object obj = this.f48684b;
        if (obj != null && method != null) {
            try {
                method.invoke(obj, new Object[0]);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.bytedance.lynx.webview.glue.sdk111.ISdkToGlueSdk111
    public Map<String, String> getCrashInfo() {
        Method method = f48683a.get("getCrashInfo");
        Object obj = this.f48684b;
        if (!(obj == null || method == null)) {
            try {
                return (Map) method.invoke(obj, new Object[0]);
            } catch (Exception unused) {
            }
        }
        return new HashMap();
    }

    @Override // com.bytedance.lynx.webview.glue.sdk111.ISdkToGlueSdk111
    public String getLatestUrl() {
        Method method = f48683a.get("getLatestUrl");
        Object obj = this.f48684b;
        if (obj == null || method == null) {
            return null;
        }
        try {
            return (String) method.invoke(obj, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.lynx.webview.glue.sdk113.ISdkToGlueSdk113
    public String getUserAgentString() {
        Method method = f48683a.get("getUserAgentString");
        Object obj = this.f48684b;
        if (obj == null || method == null) {
            return "";
        }
        try {
            return (String) method.invoke(obj, new Object[0]);
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.bytedance.lynx.webview.glue.sdk113.ISdkToGlueSdk113
    public long[] getV8PipeInterfaces() {
        Method method = f48683a.get("getV8PipeInterfaces");
        Object obj = this.f48684b;
        if (obj == null || method == null) {
            return null;
        }
        try {
            return (long[]) method.invoke(obj, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.lynx.webview.glue.sdk111.ISdkToGlueSdk111
    public int getWebViewCount() {
        Method method = f48683a.get("getWebViewCount");
        Object obj = this.f48684b;
        if (!(obj == null || method == null)) {
            try {
                return ((Integer) method.invoke(obj, new Object[0])).intValue();
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    @Override // com.bytedance.lynx.webview.glue.sdk111.ISdkToGlueSdk111
    public boolean isAdblockEnable() {
        Method method = f48683a.get("isAdblockEnable");
        Object obj = this.f48684b;
        if (!(obj == null || method == null)) {
            try {
                return ((Boolean) method.invoke(obj, new Object[0])).booleanValue();
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // com.bytedance.lynx.webview.glue.sdk113.ISdkToGlueSdk113
    public boolean isDarkModeSupported() {
        Method method = f48683a.get("isDarkModeSupported");
        Object obj = this.f48684b;
        if (!(obj == null || method == null)) {
            try {
                return ((Boolean) method.invoke(obj, new Object[0])).booleanValue();
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // com.bytedance.lynx.webview.glue.sdk113.ISdkToGlueSdk113
    public boolean isDarkStrategySupported() {
        Method method = f48683a.get("isDarkStrategySupported");
        Object obj = this.f48684b;
        if (!(obj == null || method == null)) {
            try {
                return ((Boolean) method.invoke(obj, new Object[0])).booleanValue();
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // com.bytedance.lynx.webview.glue.sdk113.ISdkToGlueSdk113
    public boolean isSupportAndroidX() {
        Method method = f48683a.get("isSupportAndroidX");
        Object obj = this.f48684b;
        if (!(obj == null || method == null)) {
            try {
                return ((Boolean) method.invoke(obj, new Object[0])).booleanValue();
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // com.bytedance.lynx.webview.glue.sdk111.ISdkToGlueSdk111
    public void notifyAppInfoGetterAvailable() {
        Method method = f48683a.get("notifyAppInfoGetterAvailable");
        Object obj = this.f48684b;
        if (obj != null && method != null) {
            try {
                method.invoke(obj, new Object[0]);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.bytedance.lynx.webview.glue.sdk113.ISdkToGlueSdk113
    public void pausePreload() {
        Method method = f48683a.get("pausePreload");
        Object obj = this.f48684b;
        if (obj != null && method != null) {
            try {
                method.invoke(obj, new Object[0]);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.bytedance.lynx.webview.glue.sdk113.ISdkToGlueSdk113
    public boolean preloadClasses() {
        Method method = f48683a.get("preloadClasses");
        Object obj = this.f48684b;
        if (!(obj == null || method == null)) {
            try {
                return ((Boolean) method.invoke(obj, new Object[0])).booleanValue();
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // com.bytedance.lynx.webview.glue.sdk113.ISdkToGlueSdk113
    public void resumePreload() {
        Method method = f48683a.get("resumePreload");
        Object obj = this.f48684b;
        if (obj != null && method != null) {
            try {
                method.invoke(obj, new Object[0]);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.bytedance.lynx.webview.glue.sdk113.ISdkToGlueSdk113
    public void cancelPreload(String str) {
        Method method = f48683a.get("cancelPreload");
        Object obj = this.f48684b;
        if (obj != null && method != null) {
            try {
                method.invoke(obj, str);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.bytedance.lynx.webview.glue.sdk113.ISdkToGlueSdk113
    public void clearPreloadCache(String str) {
        Method method = f48683a.get("clearPreloadCache");
        Object obj = this.f48684b;
        if (obj != null && method != null) {
            try {
                method.invoke(obj, str);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.bytedance.lynx.webview.glue.sdk113.ISdkToGlueSdk113
    public WebSettings getPrerenderSettings(Context context) {
        Method method = f48683a.get("getPrerenderSettings");
        Object obj = this.f48684b;
        if (obj == null || method == null) {
            return null;
        }
        try {
            return (WebSettings) method.invoke(obj, context);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.lynx.webview.glue.sdk111.ISdkToGlueSdk111
    public void loadLibrary(String str) {
        Method method = f48683a.get("loadLibrary");
        Object obj = this.f48684b;
        if (obj != null && method != null) {
            try {
                method.invoke(obj, str);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.bytedance.lynx.webview.glue.sdk112.ISdkToGlueSdk112
    public void onCallMS(String str) {
        Method method = f48683a.get("onCallMS");
        Object obj = this.f48684b;
        if (obj != null && method != null) {
            try {
                method.invoke(obj, str);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.bytedance.lynx.webview.glue.sdk113.ISdkToGlueSdk113
    public void preresolveHosts(String[] strArr) {
        Method method = f48683a.get("preresolveHosts");
        Object obj = this.f48684b;
        if (obj != null && method != null) {
            try {
                method.invoke(obj, strArr);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.bytedance.lynx.webview.glue.sdk113.ISdkToGlueSdk113
    public void removePrerender(String str) {
        Method method = f48683a.get("removePrerender");
        Object obj = this.f48684b;
        if (obj != null && method != null) {
            try {
                method.invoke(obj, str);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.bytedance.lynx.webview.glue.sdk111.ISdkToGlueSdk111
    public void setJsonObject(JSONObject jSONObject) {
        Method method = f48683a.get("setJsonObject");
        Object obj = this.f48684b;
        if (obj != null && method != null) {
            try {
                method.invoke(obj, jSONObject);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.bytedance.lynx.webview.glue.sdk113.ISdkToGlueSdk113
    public void setV8InitCallback(long j) {
        Method method = f48683a.get("setV8InitCallback");
        Object obj = this.f48684b;
        if (obj != null && method != null) {
            try {
                method.invoke(obj, Long.valueOf(j));
            } catch (Exception unused) {
            }
        }
    }

    public C19925a(Context context) {
        try {
            this.f48684b = Class.forName("com.bytedance.webview.chromium.SdkToGlueImpl", false, context.getClassLoader()).newInstance();
        } catch (Exception unused) {
            C20048g.m73164d("TT_WEBVIEW", "get SdkToGlue failure");
        }
    }

    @Override // com.bytedance.lynx.webview.glue.sdk112.ISdkToGlueSdk112
    public boolean CheckGlueVersion(String str) {
        Method method = f48683a.get("CheckGlueVersion");
        Object obj = this.f48684b;
        if (!(obj == null || method == null)) {
            try {
                return ((Boolean) method.invoke(obj, str)).booleanValue();
            } catch (Exception unused) {
                C20048g.m73164d("TT_WEBVIEW", "CheckGlueVersion error");
            }
        }
        return false;
    }

    @Override // com.bytedance.lynx.webview.glue.sdk112.ISdkToGlueSdk112
    public boolean CheckSdkVersion(String str) {
        Method method = f48683a.get("CheckSdkVersion");
        Object obj = this.f48684b;
        if (!(obj == null || method == null)) {
            try {
                return ((Boolean) method.invoke(obj, str)).booleanValue();
            } catch (Exception unused) {
                C20048g.m73164d("TT_WEBVIEW", "CheckSdkVersion error");
            }
        }
        return false;
    }

    @Override // com.bytedance.lynx.webview.glue.sdk113.ISdkToGlueSdk113
    public boolean checkSoRuntimeEnvironment(Context context) {
        Method method = f48683a.get("checkSoRuntimeEnvironment");
        Object obj = this.f48684b;
        if (!(obj == null || method == null)) {
            try {
                return ((Boolean) method.invoke(obj, context)).booleanValue();
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // com.bytedance.lynx.webview.glue.sdk111.ISdkToGlueSdk111
    public WebViewFactoryProvider getProviderInstance(String str) {
        Method method = f48683a.get("getProviderInstance");
        Object obj = this.f48684b;
        if (obj == null || method == null) {
            return null;
        }
        try {
            return (WebViewFactoryProvider) method.invoke(obj, str);
        } catch (Exception unused) {
            C20048g.m73164d("TT_WEBVIEW", "getProviderInstance error");
            return null;
        }
    }

    @Override // com.bytedance.lynx.webview.glue.sdk113.ISdkToGlueSdk113
    public boolean isPrerenderExist(String str) {
        Method method = f48683a.get("isPrerenderExist");
        Object obj = this.f48684b;
        if (!(obj == null || method == null)) {
            try {
                return ((Boolean) method.invoke(obj, str)).booleanValue();
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // com.bytedance.lynx.webview.glue.sdk111.ISdkToGlueSdk111
    public boolean setAdblockEnable(boolean z) {
        Method method = f48683a.get("setAdblockEnable");
        Object obj = this.f48684b;
        if (!(obj == null || method == null)) {
            try {
                return ((Boolean) method.invoke(obj, Boolean.valueOf(z))).booleanValue();
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // com.bytedance.lynx.webview.glue.sdk112.ISdkToGlueSdk112
    public boolean setCustomedHeaders(Map<String, String> map) {
        Method method = f48683a.get("setCustomedHeaders");
        Object obj = this.f48684b;
        if (!(obj == null || method == null)) {
            try {
                return ((Boolean) method.invoke(obj, map)).booleanValue();
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // com.bytedance.lynx.webview.glue.sdk113.ISdkToGlueSdk113
    public boolean isFeatureSupport(String str, int i) {
        Method method = f48683a.get("isFeatureSupport");
        Object obj = this.f48684b;
        if (!(obj == null || method == null)) {
            try {
                return ((Boolean) method.invoke(obj, str, Integer.valueOf(i))).booleanValue();
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // com.bytedance.lynx.webview.glue.sdk112.ISdkToGlueSdk112
    public void preconnectUrl(String str, int i) {
        Method method = f48683a.get("preconnectUrl");
        Object obj = this.f48684b;
        if (obj != null && method != null) {
            try {
                method.invoke(obj, str, Integer.valueOf(i));
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.bytedance.lynx.webview.glue.sdk111.ISdkToGlueSdk111
    public boolean setAdblockDeserializeFile(String str, String str2) {
        Method method = f48683a.get("setAdblockDeserializeFile");
        Object obj = this.f48684b;
        if (!(obj == null || method == null)) {
            try {
                return ((Boolean) method.invoke(obj, str, str2)).booleanValue();
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // com.bytedance.lynx.webview.glue.sdk111.ISdkToGlueSdk111
    public boolean setAdblockRulesPath(String[] strArr, String[] strArr2) {
        Method method = f48683a.get("setAdblockRulesPath");
        Object obj = this.f48684b;
        if (!(obj == null || method == null)) {
            try {
                return ((Boolean) method.invoke(obj, strArr, strArr2)).booleanValue();
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // com.bytedance.lynx.webview.glue.sdk113.ISdkToGlueSdk113
    public void setForceDark(WebSettings webSettings, int i) {
        Method method = f48683a.get("setForceDark");
        Object obj = this.f48684b;
        if (obj != null && method != null) {
            try {
                method.invoke(obj, webSettings, Integer.valueOf(i));
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.bytedance.lynx.webview.glue.sdk113.ISdkToGlueSdk113
    public void setForceDarkStrategy(WebSettings webSettings, int i) {
        Method method = f48683a.get("setForceDarkStrategy");
        Object obj = this.f48684b;
        if (obj != null && method != null) {
            try {
                method.invoke(obj, webSettings, Integer.valueOf(i));
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.bytedance.lynx.webview.glue.sdk111.ISdkToGlueSdk111
    public void setPreconnectUrl(String str, int i) {
        Method method = f48683a.get("setPreconnectUrl");
        Object obj = this.f48684b;
        if (obj != null && method != null) {
            try {
                method.invoke(obj, str, Integer.valueOf(i));
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.bytedance.lynx.webview.glue.sdk113.ISdkToGlueSdk113
    public boolean setRustRulesPath(String[] strArr, String[] strArr2) {
        Method method = f48683a.get("setRustRulesPath");
        Object obj = this.f48684b;
        if (!(obj == null || method == null)) {
            try {
                return ((Boolean) method.invoke(obj, strArr, strArr2)).booleanValue();
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // com.bytedance.lynx.webview.glue.sdk113.ISdkToGlueSdk113
    public boolean prerenderUrl(String str, int i, int i2, WebSettings webSettings) {
        Method method = f48683a.get("prerenderUrl");
        Object obj = this.f48684b;
        if (!(obj == null || method == null)) {
            try {
                method.invoke(obj, str, Integer.valueOf(i), Integer.valueOf(i2), webSettings);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // com.bytedance.lynx.webview.glue.sdk113.ISdkToGlueSdk113
    public void preloadUrl(String str, long j, String str2, String str3, boolean z) {
        Method method = f48683a.get("preloadUrl");
        Object obj = this.f48684b;
        if (obj != null && method != null) {
            try {
                method.invoke(obj, str, Long.valueOf(j), str2, str3, Boolean.valueOf(z));
            } catch (Exception unused) {
            }
        }
    }
}
