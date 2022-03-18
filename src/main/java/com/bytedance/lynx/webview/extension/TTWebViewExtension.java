package com.bytedance.lynx.webview.extension;

import android.graphics.Canvas;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.bytedance.lynx.webview.TTWebSdk;
import com.bytedance.lynx.webview.glue.IWebViewExtension;
import com.bytedance.lynx.webview.glue.TTRenderProcessGoneDetail;
import com.bytedance.lynx.webview.glue.TTWebViewSettings;
import com.bytedance.lynx.webview.glue.TextSelectedEventListener;
import com.bytedance.lynx.webview.glue.sdk113.IWebViewExtensionsdk113;
import com.bytedance.lynx.webview.internal.C19943g;
import com.bytedance.lynx.webview.internal.C19986s;
import com.bytedance.lynx.webview.internal.C20011y;
import com.bytedance.lynx.webview.internal.C20021z;
import com.bytedance.lynx.webview.internal.EventType;
import com.bytedance.lynx.webview.p843b.C19927c;
import com.bytedance.lynx.webview.proxy.WebViewProviderProxy;
import com.bytedance.lynx.webview.util.AbstractC20047f;
import com.bytedance.lynx.webview.util.C20048g;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class TTWebViewExtension implements IWebViewExtension {
    private static final String TAG = "TTWebViewExtension";
    private static Map<String, Method> mNameToMethod = AbstractC20047f.m73157a(IWebViewExtension.class, "com.bytedance.webview.chromium.glue.IWebViewExtension");
    private Object mImpl;
    private IWebViewExtension.PerformanceTimingListener mPerformanceTimingListener;
    private Field mProviderLocalField;
    private WeakReference<WebView> mWebview;

    /* renamed from: com.bytedance.lynx.webview.extension.TTWebViewExtension$a */
    public interface AbstractC19930a {

        /* renamed from: com.bytedance.lynx.webview.extension.TTWebViewExtension$a$a */
        public static class C19931a {

            /* renamed from: a */
            public boolean f48694a;

            /* renamed from: b */
            public boolean f48695b;

            /* renamed from: c */
            public boolean f48696c;

            /* renamed from: d */
            public int f48697d;

            /* renamed from: e */
            public int f48698e = -1;

            /* renamed from: f */
            public String f48699f;
        }

        /* renamed from: a */
        void mo67586a(C19931a aVar);
    }

    public boolean isTTWebView() {
        if (this.mImpl != null) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.lynx.webview.glue.sdk111.IWebViewExtensionNetsdk111
    public Map<String, Object> getTTWebViewProxyMap() {
        Method method = mNameToMethod.get("getTTWebViewProxyMap");
        Object obj = this.mImpl;
        if (obj == null || method == null) {
            return null;
        }
        try {
            method.invoke(obj, new Object[0]);
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.lynx.webview.glue.sdk113.IWebViewExtensionNetsdk113
    public int getAllRequestCount() {
        Method method = mNameToMethod.get("getAllRequestCount");
        Object obj = this.mImpl;
        if (!(obj == null || method == null)) {
            try {
                return ((Integer) method.invoke(obj, new Object[0])).intValue();
            } catch (Exception e) {
                C20048g.m73164d(TAG + e.toString());
            }
        }
        return 0;
    }

    @Override // com.bytedance.lynx.webview.glue.sdk113.IWebViewExtensionNetsdk113
    public int getCacheHitRequestCount() {
        Method method = mNameToMethod.get("getCacheHitRequestCount");
        Object obj = this.mImpl;
        if (!(obj == null || method == null)) {
            try {
                return ((Integer) method.invoke(obj, new Object[0])).intValue();
            } catch (Exception e) {
                C20048g.m73164d(TAG + e.toString());
            }
        }
        return 0;
    }

    @Override // com.bytedance.lynx.webview.glue.sdk111.IWebViewExtensionPerfermancesdk111
    public long getLoadingStatusCode() {
        Method method = mNameToMethod.get("getLoadingStatusCode");
        Object obj = this.mImpl;
        if (obj == null || method == null) {
            return -1;
        }
        try {
            return ((Long) method.invoke(obj, new Object[0])).longValue();
        } catch (Exception e) {
            C20048g.m73164d(TAG + e.toString());
            return -1;
        }
    }

    @Override // com.bytedance.lynx.webview.glue.sdk111.IWebViewExtensionPerfermancesdk111
    public String getPerformanceTiming() {
        Method method = mNameToMethod.get("getPerformanceTiming");
        Object obj = this.mImpl;
        if (obj == null || method == null) {
            return "{}";
        }
        try {
            return (String) method.invoke(obj, new Object[0]);
        } catch (Exception e) {
            C20048g.m73164d(TAG + e.toString());
            return "{}";
        }
    }

    @Override // com.bytedance.lynx.webview.glue.sdk112.IWebViewExtensionPerfermancesdk112
    public String getRenderProfile() {
        Method method = mNameToMethod.get("getRenderProfile");
        Object obj = this.mImpl;
        if (obj == null || method == null) {
            return "[]";
        }
        try {
            return (String) method.invoke(obj, new Object[0]);
        } catch (Exception e) {
            C20048g.m73164d(TAG + e.toString());
            return "[]";
        }
    }

    @Override // com.bytedance.lynx.webview.glue.sdk111.IWebViewExtensionsdk111
    public TTWebViewSettings getTTWebViewSettings() {
        Method method = mNameToMethod.get("getTTWebViewSettings");
        Object obj = this.mImpl;
        if (obj == null || method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke(obj, new Object[0]);
            if (invoke != null) {
                return new C19927c(invoke);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.lynx.webview.glue.sdk113.IWebViewExtensionPredictorsdk113
    public boolean hitPrerender() {
        Method method = mNameToMethod.get("hitPrerender");
        Object obj = this.mImpl;
        if (!(obj == null || method == null)) {
            try {
                return ((Boolean) method.invoke(obj, new Object[0])).booleanValue();
            } catch (Exception e) {
                C20048g.m73164d(TAG + e.toString());
            }
        }
        return false;
    }

    @Override // com.bytedance.lynx.webview.glue.sdk111.IWebViewExtensionTTRendersdk111
    public boolean isTTRenderInBrowserEnabled() {
        Method method = mNameToMethod.get("isTTRenderInBrowserEnabled");
        Object obj = this.mImpl;
        if (!(obj == null || method == null)) {
            try {
                return ((Boolean) method.invoke(obj, new Object[0])).booleanValue();
            } catch (Exception e) {
                C20048g.m73164d(TAG + e.toString());
            }
        }
        return false;
    }

    @Override // com.bytedance.lynx.webview.glue.sdk113.IWebViewExtensionsdk113
    public void notifyV8ToGC() {
        Method method = mNameToMethod.get("notifyV8ToGC");
        Object obj = this.mImpl;
        if (obj != null && method != null) {
            try {
                method.invoke(obj, new Object[0]);
            } catch (Exception e) {
                C20048g.m73164d(TAG + e.toString());
            }
        }
    }

    @Override // com.bytedance.lynx.webview.glue.sdk113.IWebViewExtensionsdk113
    public void resetWebView() {
        try {
            Method method = mNameToMethod.get("resetWebView");
            Object obj = this.mImpl;
            if (obj != null && method != null) {
                method.invoke(obj, new Object[0]);
            }
        } catch (Throwable th) {
            C20048g.m73164d(TAG + th.toString());
        }
    }

    @Override // com.bytedance.lynx.webview.glue.IWebViewExtension
    public void setMemoryEventListener(IWebViewExtension.MemoryEventListener memoryEventListener) {
        setMemoryEventListener((Object) memoryEventListener);
    }

    @Override // com.bytedance.lynx.webview.glue.IWebViewExtension
    public void setPerformanceTimingListener(IWebViewExtension.PerformanceTimingListener performanceTimingListener) {
        setPerformanceTimingListener((Object) performanceTimingListener);
    }

    @Override // com.bytedance.lynx.webview.glue.IWebViewExtension
    public void setPlatformViewLayersScrollListener(IWebViewExtension.PlatformViewLayersScrollListener platformViewLayersScrollListener) {
        setPlatformViewLayersScrollListener((Object) platformViewLayersScrollListener);
    }

    @Override // com.bytedance.lynx.webview.glue.sdk111.IWebViewExtensionsdk111
    public void setTextSelectedEventListener(TextSelectedEventListener textSelectedEventListener) {
        setTextSelectedEventListener((Object) textSelectedEventListener);
    }

    @Override // com.bytedance.lynx.webview.glue.sdk113.IWebViewExtensionsdk113
    public boolean isFeatureSupport(String str) {
        return isFeatureSupport(str, 1);
    }

    public TTWebViewExtension(WebView webView) {
        this.mImpl = getWebviewExtensionImpl(webView);
        this.mWebview = new WeakReference<>(webView);
    }

    @Override // com.bytedance.lynx.webview.glue.sdk111.IWebViewExtensionPerfermancesdk111
    public void setPerformanceTimingListener(Object obj) {
        Method method = mNameToMethod.get("setPerformanceTimingListener");
        Object obj2 = this.mImpl;
        if (obj2 != null && method != null) {
            try {
                method.invoke(obj2, obj);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.bytedance.lynx.webview.glue.sdk111.IWebViewExtensionNetsdk111
    public void setTTWebViewProxyMap(Map<String, Object> map) {
        Method method = mNameToMethod.get("setTTWebViewProxyMap");
        Object obj = this.mImpl;
        if (obj != null && method != null) {
            try {
                method.invoke(obj, map);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.bytedance.lynx.webview.glue.sdk111.IWebViewExtensionsdk111
    public void setTextSelectedEventListener(Object obj) {
        Method method = mNameToMethod.get("setTextSelectedEventListener");
        Object obj2 = this.mImpl;
        if (obj2 != null && method != null) {
            try {
                method.invoke(obj2, obj);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.bytedance.lynx.webview.glue.sdk112.IWebViewExtensionsdk112
    public void addPluginFactory(Object obj) {
        Method method = mNameToMethod.get("addPluginFactory");
        Object obj2 = this.mImpl;
        if (obj2 != null && method != null) {
            try {
                method.invoke(obj2, obj);
            } catch (Exception e) {
                C20048g.m73164d(TAG + e.toString());
            }
        }
    }

    @Override // com.bytedance.lynx.webview.glue.sdk112.IWebViewExtensionTTRendersdk112
    public boolean isTTRenderEnabled(String str) {
        Method method = mNameToMethod.get("isTTRenderEnabled");
        Object obj = this.mImpl;
        if (!(obj == null || method == null)) {
            try {
                return ((Boolean) method.invoke(obj, str)).booleanValue();
            } catch (Exception e) {
                C20048g.m73164d(TAG + e.toString());
            }
        }
        return false;
    }

    @Override // com.bytedance.lynx.webview.glue.sdk111.IWebViewExtensionTTRendersdk111
    public void platformViewParpareDraw(int i) {
        Method method = mNameToMethod.get("platformViewParpareDraw");
        Object obj = this.mImpl;
        if (obj != null && method != null) {
            try {
                method.invoke(obj, Integer.valueOf(i));
            } catch (Exception e) {
                C20048g.m73164d(TAG + e.toString());
            }
        }
    }

    @Override // com.bytedance.lynx.webview.glue.sdk113.IWebViewExtensionPredictorsdk113
    public boolean prerenderUrl(String str) {
        Method method = mNameToMethod.get("prerenderUrl");
        Object obj = this.mImpl;
        if (!(obj == null || method == null)) {
            try {
                method.invoke(obj, str);
                return true;
            } catch (Exception e) {
                C20048g.m73164d(TAG + e.toString());
            }
        }
        return false;
    }

    @Override // com.bytedance.lynx.webview.glue.sdk113.IWebViewExtensionNetsdk113
    public void preresolveHosts(String[] strArr) {
        Method method = mNameToMethod.get("preresolveHosts");
        Object obj = this.mImpl;
        if (obj != null && method != null) {
            try {
                method.invoke(obj, strArr);
            } catch (Exception e) {
                C20048g.m73164d(TAG + e.toString());
            }
        }
    }

    @Override // com.bytedance.lynx.webview.glue.sdk112.IWebViewExtensionsdk112
    public void removePluginFactory(String str) {
        Method method = mNameToMethod.get("removePluginFactory");
        Object obj = this.mImpl;
        if (obj != null && method != null) {
            try {
                method.invoke(obj, str);
            } catch (Exception e) {
                C20048g.m73164d(TAG + e.toString());
            }
        }
    }

    @Override // com.bytedance.lynx.webview.glue.sdk111.IWebViewExtensionsdk111
    public void setIsNeedTTwebviewUserAgent(boolean z) {
        Method method = mNameToMethod.get("setIsNeedTTwebviewUserAgent");
        Object obj = this.mImpl;
        if (obj != null && method != null) {
            try {
                method.invoke(obj, Boolean.valueOf(z));
            } catch (Exception e) {
                C20048g.m73164d(TAG + e.toString());
            }
        }
    }

    @Override // com.bytedance.lynx.webview.glue.sdk113.IWebViewExtensionsdk113
    public void setMemoryEventListener(Object obj) {
        try {
            Method method = mNameToMethod.get("setMemoryEventListener");
            Object obj2 = this.mImpl;
            if (obj2 != null && method != null) {
                method.invoke(obj2, obj);
            }
        } catch (Throwable th) {
            C20048g.m73164d(TAG + th.toString());
        }
    }

    @Override // com.bytedance.lynx.webview.glue.sdk111.IWebViewExtensionTTRendersdk111
    public void setPlatformViewLayersScrollListener(Object obj) {
        Method method = mNameToMethod.get("setPlatformViewLayersScrollListener");
        Object obj2 = this.mImpl;
        if (obj2 != null && method != null) {
            try {
                method.invoke(obj2, obj);
            } catch (Exception unused) {
                C20048g.m73164d(TAG + "IWebViewExtension is null");
            }
        }
    }

    @Override // com.bytedance.lynx.webview.glue.sdk112.IWebViewExtensionsdk112
    public void setRenderProcessGoneListener(Object obj) {
        try {
            Method method = mNameToMethod.get("setRenderProcessGoneListener");
            Object obj2 = this.mImpl;
            if (obj2 != null && method != null) {
                method.invoke(obj2, obj);
            }
        } catch (Throwable th) {
            C20048g.m73164d(TAG + th.toString());
        }
    }

    @Override // com.bytedance.lynx.webview.glue.sdk111.IWebViewExtensionNetsdk111
    public void setTag(String str) {
        Method method = mNameToMethod.get("setTag");
        if (this.mImpl != null && method != null) {
            C19935c.m72698a(this.mWebview, str);
            try {
                method.invoke(this.mImpl, str);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.bytedance.lynx.webview.glue.sdk113.IWebViewExtensionsdk113
    public void setWebContentsDebuggingEnabled(boolean z) {
        Method method = mNameToMethod.get("setWebContentsDebuggingEnabled");
        Object obj = this.mImpl;
        if (obj != null && method != null) {
            try {
                method.invoke(obj, Boolean.valueOf(z));
            } catch (Exception e) {
                C20048g.m73164d(TAG + e.toString());
            }
        }
    }

    public AbstractC19930a.C19931a ParseBlankDetectResultJson(String str) {
        AbstractC19930a.C19931a aVar = new AbstractC19930a.C19931a();
        if (str != null && !str.isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                aVar.f48694a = jSONObject.getBoolean("is_success");
                if (!aVar.f48694a) {
                    return aVar;
                }
                aVar.f48695b = jSONObject.getBoolean("is_blank");
                aVar.f48696c = jSONObject.getBoolean("is_pure_color");
                if (aVar.f48696c) {
                    aVar.f48697d = Color.parseColor(jSONObject.getString("pure_color_argb"));
                    aVar.f48698e = jSONObject.getInt("advice_color_diff_esp");
                }
                aVar.f48699f = jSONObject.getString("color_counts");
                return aVar;
            } catch (JSONException e) {
                C20048g.m73164d(TAG + "  blankDetectAsync parse result [" + str + "] failed. " + e);
                aVar.f48694a = false;
            } catch (Throwable unused) {
            }
        }
        return aVar;
    }

    @Override // com.bytedance.lynx.webview.glue.sdk113.IWebViewExtensionsdk113
    public void setIsolateCookieInfo(C19932a aVar) {
        if (aVar != null && !TextUtils.isEmpty(aVar.mo67587a())) {
            try {
                Method method = mNameToMethod.get("setIsolateCookieInfo");
                if (this.mImpl != null && method != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("groupName", aVar.mo67587a());
                    method.invoke(this.mImpl, bundle);
                }
            } catch (Throwable th) {
                C20048g.m73164d(TAG + th.toString());
            }
        }
    }

    @Override // com.bytedance.lynx.webview.glue.IWebViewExtension
    public void setRenderProcessGoneListener(final IWebViewExtension.RenderProcessGoneListener renderProcessGoneListener) {
        WebView webView;
        if (this.mImpl != null) {
            setRenderProcessGoneListener(new IWebViewExtension.RenderProcessGoneListenerWrapper() {
                /* class com.bytedance.lynx.webview.extension.TTWebViewExtension.C199281 */

                @Override // com.bytedance.lynx.webview.glue.sdk112.IRenderProcessGoneListenerWrappersdk112
                public boolean onRenderProcessGone(WebView webView, boolean z, int i) {
                    return renderProcessGoneListener.onRenderProcessGone(webView, new TTRenderProcessGoneDetail(z, i));
                }
            });
        } else if (Build.VERSION.SDK_INT >= 26 && (webView = this.mWebview.get()) != null && webView.getWebViewClient() != null) {
            if (!TTWebSdk.isWebSdkInit() || !C19986s.m72924a().mo67858a("sdk_enable_web_provider_proxy", false) || !(webView.getWebViewClient() instanceof C20021z)) {
                C20021z zVar = new C20021z(webView.getWebViewClient());
                zVar.mo67952a(renderProcessGoneListener);
                webView.setWebViewClient(zVar);
                return;
            }
            ((C20021z) webView.getWebViewClient()).mo67952a(renderProcessGoneListener);
        }
    }

    private Object getWebviewExtensionImpl(WebView webView) {
        if (webView != null && C20011y.m73013k()) {
            try {
                if (this.mProviderLocalField == null) {
                    Field declaredField = Class.forName("android.webkit.WebView").getDeclaredField("mProvider");
                    this.mProviderLocalField = declaredField;
                    declaredField.setAccessible(true);
                }
                Object obj = this.mProviderLocalField.get(webView);
                if (TTWebSdk.isWebSdkInit() && C19986s.m72924a().mo67858a("sdk_enable_web_provider_proxy", false) && (obj instanceof WebViewProviderProxy.RealGetter)) {
                    obj = ((WebViewProviderProxy.RealGetter) obj).getRealWebViewProvider();
                }
                Method method = Class.forName("com.bytedance.webview.chromium.WebViewChromium").getMethod("getWebviewExtension", new Class[0]);
                if (obj != null && method != null) {
                    return method.invoke(obj, new Object[0]);
                }
                C20048g.m73164d("TT_WEBVIEW", "getWebviewExtensionImpl error.");
                C19943g.m72724a(EventType.EXTENSION_ERROR, (Object) null);
                return null;
            } catch (Exception e) {
                C20048g.m73164d("getWebviewExtension e:" + e.toString());
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override // com.bytedance.lynx.webview.glue.sdk113.IWebViewExtensionsdk113
    public boolean blankDetectAsyncImpl(Object obj, int i) throws Exception {
        throw new Exception("use blankDetectAsync");
    }

    @Override // com.bytedance.lynx.webview.glue.sdk113.IWebViewExtensionsdk113
    public void downloadFileImpl(String str, Object obj) throws Exception {
        throw new Exception("use downloadFile");
    }

    @Override // com.bytedance.lynx.webview.glue.sdk113.IWebViewExtensionsdk113
    public boolean grabSnapshotAsyncImpl(Canvas canvas, Object obj) throws Exception {
        throw new Exception("use grabSnapshotAsync");
    }

    public void downloadFile(String str, IWebViewExtensionsdk113.DownloadFileCallback downloadFileCallback) {
        try {
            Method method = mNameToMethod.get("downloadFileImpl");
            Object obj = this.mImpl;
            if (obj != null && method != null) {
                method.invoke(obj, str, downloadFileCallback);
            }
        } catch (Throwable th) {
            C20048g.m73164d(TAG + th.toString());
        }
    }

    @Override // com.bytedance.lynx.webview.glue.sdk112.IWebViewExtensionNetsdk112
    public void preconnectUrl(String str, int i) {
        Method method = mNameToMethod.get("preconnectUrl");
        Object obj = this.mImpl;
        if (obj != null && method != null) {
            try {
                method.invoke(obj, str, Integer.valueOf(i));
            } catch (Exception e) {
                C20048g.m73164d(TAG + e.toString());
            }
        }
    }

    @Override // com.bytedance.lynx.webview.glue.sdk112.IWebViewExtensionTTRendersdk112
    public boolean renderEvaluateJavaScript(String str, ValueCallback<String> valueCallback) {
        Method method = mNameToMethod.get("renderEvaluateJavaScript");
        if (method == null) {
            return false;
        }
        Object obj = this.mImpl;
        if (!(obj == null || method == null)) {
            try {
                method.invoke(obj, str, valueCallback);
            } catch (Exception e) {
                C20048g.m73164d(TAG + e.toString());
                return false;
            }
        }
        return true;
    }

    @Override // com.bytedance.lynx.webview.glue.sdk111.IWebViewExtensionsdk111
    public void setHeadXRequestWith(boolean z, String str) {
        Method method = mNameToMethod.get("setHeadXRequestWith");
        Object obj = this.mImpl;
        if (obj != null && method != null) {
            try {
                method.invoke(obj, Boolean.valueOf(z), str);
            } catch (Exception e) {
                C20048g.m73164d(TAG + e.toString());
            }
        }
    }

    @Override // com.bytedance.lynx.webview.glue.sdk111.IWebViewExtensionNetsdk111
    public void setUrlPreconnect(String str, int i) {
        Method method = mNameToMethod.get("setUrlPreconnect");
        Object obj = this.mImpl;
        if (obj != null && method != null) {
            try {
                method.invoke(obj, str, Integer.valueOf(i));
            } catch (Exception e) {
                C20048g.m73164d(TAG + e.toString());
            }
        }
    }

    @Override // com.bytedance.lynx.webview.glue.sdk111.IWebViewExtensionTTRendersdk111
    public void unregisterPlatformView(View view, int i) {
        Method method = mNameToMethod.get("unregisterPlatformView");
        Object obj = this.mImpl;
        if (obj != null && method != null) {
            try {
                method.invoke(obj, view, Integer.valueOf(i));
            } catch (Exception e) {
                C20048g.m73164d(TAG + e.toString());
            }
        }
    }

    public void blankDetectAsync(final AbstractC19930a aVar, Integer num) {
        Method method = mNameToMethod.get("blankDetectAsyncImpl");
        if (method == null || this.mImpl == null) {
            C20048g.m73164d(TAG + " not found blankDetectAsyncImpl");
            aVar.mo67586a(null);
            return;
        }
        if (num == null) {
            num = -1;
        }
        try {
            if (!((Boolean) method.invoke(this.mImpl, new IWebViewExtensionsdk113.BlankDetectAsyncCallbackImpl() {
                /* class com.bytedance.lynx.webview.extension.TTWebViewExtension.C199292 */

                @Override // com.bytedance.lynx.webview.glue.sdk113.IWebViewExtensionsdk113.BlankDetectAsyncCallbackImpl
                public void onResult(String str) {
                    aVar.mo67586a(TTWebViewExtension.this.ParseBlankDetectResultJson(str));
                }
            }, num)).booleanValue()) {
                aVar.mo67586a(null);
            }
        } catch (Exception e) {
            C20048g.m73164d(TAG + " " + e.toString());
            aVar.mo67586a(null);
        }
    }

    @Override // com.bytedance.lynx.webview.glue.sdk112.IWebViewExtensionsdk112
    public boolean enableFeature(String str, boolean z) {
        Method method = mNameToMethod.get("enableFeature");
        Object obj = this.mImpl;
        if (!(obj == null || method == null)) {
            try {
                return ((Boolean) method.invoke(obj, str, Boolean.valueOf(z))).booleanValue();
            } catch (Exception e) {
                C20048g.m73164d(TAG + e.toString());
            }
        }
        return false;
    }

    public void grabSnapshotAsync(Canvas canvas, IWebViewExtensionsdk113.GrabSnapshotAsyncCallback grabSnapshotAsyncCallback) {
        Object obj;
        Method method = mNameToMethod.get("grabSnapshotAsyncImpl");
        if (method == null || (obj = this.mImpl) == null) {
            C20048g.m73164d(TAG + " not found grabSnapshotAsyncImpl");
            grabSnapshotAsyncCallback.onResult(canvas, false);
            return;
        }
        try {
            if (!((Boolean) method.invoke(obj, canvas, grabSnapshotAsyncCallback)).booleanValue()) {
                grabSnapshotAsyncCallback.onResult(canvas, false);
            }
        } catch (Exception e) {
            C20048g.m73164d(TAG + " " + e.toString());
            grabSnapshotAsyncCallback.onResult(canvas, false);
        }
    }

    @Override // com.bytedance.lynx.webview.glue.sdk113.IWebViewExtensionsdk113
    public boolean isFeatureSupport(String str, int i) {
        Method method = mNameToMethod.get("isFeatureSupport");
        Object obj = this.mImpl;
        if (!(obj == null || method == null)) {
            try {
                return ((Boolean) method.invoke(obj, str, Integer.valueOf(i))).booleanValue();
            } catch (Exception e) {
                C20048g.m73164d(TAG + e.toString());
            }
        }
        return false;
    }

    @Override // com.bytedance.lynx.webview.glue.sdk111.IWebViewExtensionTTRendersdk111
    public void registerPlatformView(View view, int i) {
        C20048g.m73161a("TT_WEBVIEW", "TTWebViewExtension::registerPlatformView viewID: " + i);
        Method method = mNameToMethod.get("registerPlatformView");
        Object obj = this.mImpl;
        if (obj != null && method != null) {
            try {
                method.invoke(obj, view, Integer.valueOf(i));
            } catch (Exception e) {
                C20048g.m73164d(TAG + e.toString());
            }
        }
    }

    @Override // com.bytedance.lynx.webview.glue.sdk111.IWebViewExtensionTTRendersdk111
    public void platformViewOnComputeScroll(int i, int i2, int i3) {
        Method method = mNameToMethod.get("platformViewOnComputeScroll");
        Object obj = this.mImpl;
        if (obj != null && method != null) {
            try {
                method.invoke(obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
            } catch (Exception e) {
                C20048g.m73164d(TAG + e.toString());
            }
        }
    }
}
