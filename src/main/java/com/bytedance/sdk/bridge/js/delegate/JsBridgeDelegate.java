package com.bytedance.sdk.bridge.js.delegate;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import androidx.lifecycle.Lifecycle;
import com.bytedance.sdk.bridge.BridgeManager;
import com.bytedance.sdk.bridge.BridgeRegistry;
import com.bytedance.sdk.bridge.C20661b;
import com.bytedance.sdk.bridge.Logger;
import com.bytedance.sdk.bridge.js.JsBridgeManager;
import com.bytedance.sdk.bridge.js.JsBridgeRegistry;
import com.bytedance.sdk.bridge.js.spec.IJsLoadUrlResult;
import com.bytedance.sdk.bridge.js.spec.JsBridgeContext;
import com.bytedance.sdk.bridge.js.webview.IWebView;
import com.bytedance.sdk.bridge.js.webview.WebViewWrapper;
import com.bytedance.sdk.bridge.model.BridgeResult;
import com.bytedance.sdk.bridge.monitor.BridgeMonitor;
import com.bytedance.sdk.bytebridge.web.widget.JsCallOriginInfo;
import com.bytedance.sdk.bytebridge.web.widget.JsCallType;
import com.bytedance.sdk.bytebridge.web.widget.JsRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.bridge.js.a.b */
public final class JsBridgeDelegate {

    /* renamed from: a */
    public static final JsBridgeDelegate f50450a = new JsBridgeDelegate();

    /* renamed from: b */
    private static final String f50451b = f50451b;

    /* renamed from: c */
    private static final long f50452c = f50452c;

    /* renamed from: d */
    private static final String f50453d;

    /* renamed from: e */
    private static final String f50454e;

    /* renamed from: f */
    private static final String f50455f;

    /* renamed from: g */
    private static final Handler f50456g = new Handler(Looper.getMainLooper());

    /* renamed from: h */
    private static final String f50457h = f50457h;

    /* renamed from: i */
    private static final WeakHashMap<WebView, WebViewWrapper> f50458i = new WeakHashMap<>();

    private JsBridgeDelegate() {
    }

    /* renamed from: a */
    public final WeakHashMap<WebView, WebViewWrapper> mo69595a() {
        return f50458i;
    }

    /* renamed from: a */
    public final boolean mo69602a(IWebView bVar, String str, Lifecycle lifecycle) {
        Intrinsics.checkParameterIsNotNull(bVar, "webView");
        Intrinsics.checkParameterIsNotNull(str, "url");
        BridgeRegistry.f50436a.mo69579b();
        return mo69605b(bVar, str, lifecycle);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0042 A[SYNTHETIC, Splitter:B:15:0x0042] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b8  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo69598a(com.bytedance.sdk.bridge.js.webview.IWebView r17, java.lang.String r18, com.bytedance.sdk.bridge.js.spec.IJsLoadUrlResult r19) {
        /*
        // Method dump skipped, instructions count: 192
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.bridge.js.delegate.JsBridgeDelegate.mo69598a(com.bytedance.sdk.bridge.js.webview.b, java.lang.String, com.bytedance.sdk.bridge.js.spec.c):void");
    }

    /* renamed from: a */
    public final void mo69599a(IWebView bVar, List<JsCallOriginInfo> list, Lifecycle lifecycle) {
        Intrinsics.checkParameterIsNotNull(bVar, "view");
        Intrinsics.checkParameterIsNotNull(list, "requests");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            f50450a.mo69597a(bVar, (JsCallOriginInfo) it.next(), lifecycle);
        }
    }

    /* renamed from: a */
    public final boolean mo69601a(JsBridgeRequest cVar, JsBridgeContext dVar, Lifecycle lifecycle) {
        Intrinsics.checkParameterIsNotNull(cVar, "request");
        Intrinsics.checkParameterIsNotNull(dVar, "bridgeContext");
        BridgeRegistry.f50436a.mo69579b();
        Logger lVar = Logger.f50514b;
        String str = f50451b;
        lVar.mo69733a(str, "onJsbridgeRequest - " + cVar.mo69611b());
        if (JsCallInterceptorManager.f50478a.mo69618a(cVar.mo69611b(), cVar.mo69612c(), dVar)) {
            return true;
        }
        JsBridgeRegistry dVar2 = JsBridgeRegistry.f50491a;
        String b = cVar.mo69611b();
        Object a = dVar.mo69665a();
        if (a == null) {
            a = dVar.mo69667b();
        }
        if (dVar2.mo69640a(b, a, lifecycle) != null || JsBridgeManager.f50485a.mo69637b(cVar.mo69611b())) {
            JsBridgeRegistry.f50491a.mo69643a(cVar.mo69611b(), new JsCallOriginInfo(cVar.mo69613d(), JsCallType.JS_CALL), dVar, lifecycle);
            return true;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("error_msg", "old js call bridgeInfo == null is true");
        jSONObject.put("error_code", 1);
        jSONObject.put("event_type", "oldJsCall");
        jSONObject.put("extra_params", BridgeMonitor.f50418a.mo69557a(cVar.mo69611b(), cVar.mo69612c()));
        BridgeMonitor.f50418a.mo69558a(1, "oldJsCall", new JSONObject(), jSONObject, dVar);
        dVar.mo69666a(BridgeResult.Companion.m75334b(BridgeResult.f50535a, null, null, 3, null));
        return false;
    }

    /* renamed from: a */
    public final void mo69600a(String str, JSONObject jSONObject, IWebView bVar, boolean z, IJsLoadUrlResult cVar) {
        Intrinsics.checkParameterIsNotNull(str, "callback_id");
        Intrinsics.checkParameterIsNotNull(bVar, "webView");
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (z) {
                jSONObject2.put("__msg_type", f50457h);
                jSONObject2.put("__event_id", str);
            } else {
                jSONObject2.put("__msg_type", "callback");
            }
            jSONObject2.put("__callback_id", str);
            if (jSONObject != null) {
                jSONObject2.put("__params", jSONObject);
            }
            m75188a(bVar, jSONObject2, cVar);
        } catch (Exception e) {
            e.printStackTrace();
            if (cVar != null) {
                cVar.mo69664a(-1, "sendCallbackMsg errMsg " + e);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo69603a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "url");
        return StringsKt.startsWith$default(str, f50454e, false, 2, null) || StringsKt.startsWith$default(str, f50455f, false, 2, null);
    }

    /* renamed from: com.bytedance.sdk.bridge.js.a.b$c */
    public static final class RunnableC20670c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ IWebView f50464a;

        /* renamed from: b */
        final /* synthetic */ String f50465b;

        /* renamed from: c */
        final /* synthetic */ IJsLoadUrlResult f50466c;

        RunnableC20670c(IWebView bVar, String str, IJsLoadUrlResult cVar) {
            this.f50464a = bVar;
            this.f50465b = str;
            this.f50466c = cVar;
        }

        public final void run() {
            JsBridgeDelegate.f50450a.mo69598a(this.f50464a, this.f50465b, this.f50466c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.sdk.bridge.js.a.b$b */
    public static final class RunnableC20669b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Ref.ObjectRef f50461a;

        /* renamed from: b */
        final /* synthetic */ IWebView f50462b;

        /* renamed from: c */
        final /* synthetic */ Object f50463c;

        RunnableC20669b(Ref.ObjectRef objectRef, IWebView bVar, Object obj) {
            this.f50461a = objectRef;
            this.f50462b = bVar;
            this.f50463c = obj;
        }

        public final void run() {
            this.f50461a.element = (T) this.f50462b.mo69706c();
            synchronized (this.f50463c) {
                this.f50463c.notify();
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    /* renamed from: b */
    private final boolean m75191b() {
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            Looper mainLooper = Looper.getMainLooper();
            Intrinsics.checkExpressionValueIsNotNull(mainLooper, "Looper.getMainLooper()");
            if (Intrinsics.areEqual(mainLooper.getThread(), Thread.currentThread())) {
                return true;
            }
        }
        return false;
    }

    static {
        String str;
        StringBuilder sb = new StringBuilder();
        C20661b a = BridgeManager.f50421a.mo69560a();
        if (a == null || (str = a.mo69545b()) == null) {
            str = "nativeapp";
        }
        sb.append(str);
        sb.append("://");
        String sb2 = sb.toString();
        f50453d = sb2;
        f50454e = sb2 + "dispatch_message/";
        f50455f = sb2 + "private/setresult/";
    }

    /* renamed from: com.bytedance.sdk.bridge.js.a.b$a */
    public static final class C20668a<T> implements ValueCallback<String> {

        /* renamed from: a */
        final /* synthetic */ IJsLoadUrlResult f50459a;

        /* renamed from: b */
        final /* synthetic */ String f50460b;

        C20668a(IJsLoadUrlResult cVar, String str) {
            this.f50459a = cVar;
            this.f50460b = str;
        }

        /* renamed from: a */
        public final void onReceiveValue(String str) {
            Logger lVar = Logger.f50514b;
            lVar.mo69733a(JsBridgeDelegate.f50451b, "loadUrl = " + str);
            IJsLoadUrlResult cVar = this.f50459a;
            if (cVar != null) {
                cVar.mo69664a(-6, str);
            }
            String str2 = str;
            if (!TextUtils.isEmpty(str2) && !TextUtils.equals("null", str2)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("error_msg", str);
                jSONObject.put("error_url", this.f50460b);
                jSONObject.put("error_code", 2);
                jSONObject.put("event_type", "loadUrl");
                BridgeMonitor.m75144a(BridgeMonitor.f50418a, 2, "loadUrl", new JSONObject(), jSONObject, null, 16, null);
            }
        }
    }

    /* renamed from: a */
    private final void m75187a(IWebView bVar) {
        m75185a(this, bVar, "javascript:if(window.JSBridge && window.JSBridge._fetchQueue){ JSBridge._fetchQueue()} else if (window.Native2JSBridge && window.Native2JSBridge._fetchQueue){Native2JSBridge._fetchQueue()}", (IJsLoadUrlResult) null, 4, (Object) null);
    }

    /* renamed from: b */
    private final List<JsCallOriginInfo> m75190b(String str) {
        ArrayList arrayList = new ArrayList();
        int length = f50455f.length();
        int indexOf$default = StringsKt.indexOf$default((CharSequence) str, '&', length, false, 4, (Object) null);
        if (indexOf$default <= 0) {
            return arrayList;
        }
        if (str != null) {
            String substring = str.substring(length, indexOf$default);
            Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            int i = indexOf$default + 1;
            if (str != null) {
                String substring2 = str.substring(i);
                Intrinsics.checkExpressionValueIsNotNull(substring2, "(this as java.lang.String).substring(startIndex)");
                if (Intrinsics.areEqual(substring, "SCENE_FETCHQUEUE") && substring2.length() > 0) {
                    try {
                        byte[] decode = Base64.decode(substring2, 2);
                        Intrinsics.checkExpressionValueIsNotNull(decode, "Base64.decode(msg, Base64.NO_WRAP)");
                        JSONArray jSONArray = new JSONArray(new String(decode, Charsets.f173341a));
                        int length2 = jSONArray.length();
                        for (int i2 = 0; i2 < length2; i2++) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i2);
                            String optString = jSONObject.optString("func");
                            String optString2 = jSONObject.optString("__msg_type");
                            if (!TextUtils.isEmpty(optString2) && !Intrinsics.areEqual(f50457h, optString2)) {
                                if (!TextUtils.isEmpty(optString)) {
                                    Intrinsics.checkExpressionValueIsNotNull(jSONObject, "requestInfo");
                                    Intrinsics.checkExpressionValueIsNotNull(optString, "func");
                                    arrayList.add(new JsCallOriginInfo(jSONObject, optString, JsCallType.JS_SCHEME));
                                }
                            }
                        }
                        return arrayList;
                    } catch (Exception unused) {
                        String str2 = f50451b;
                        Log.w(str2, "failed to parse jsbridge msg queue " + substring2);
                    }
                }
                return arrayList;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: a */
    public final WebViewWrapper mo69594a(WebView webView) {
        WebViewWrapper dVar;
        Intrinsics.checkParameterIsNotNull(webView, "webView");
        try {
            dVar = f50458i.get(webView);
        } catch (Exception e) {
            e.printStackTrace();
            WebViewWrapper dVar2 = null;
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("error_msg", "getWebViewWrapper exception " + Log.getStackTraceString(e));
                jSONObject2.put("error_code", 1);
                jSONObject2.put("event_type", "getWebViewWrapper");
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            BridgeMonitor.m75144a(BridgeMonitor.f50418a, 1, "getWebViewWrapper", jSONObject, jSONObject2, null, 16, null);
            dVar = dVar2;
        }
        if (dVar instanceof WebViewWrapper) {
            Logger.f50514b.mo69733a(f50451b, "getWebViewWrapper webViewWrapperContainer contains.");
            return dVar;
        }
        Logger.f50514b.mo69733a(f50451b, "getWebViewWrapper webViewWrapperContainer not contains.");
        WebViewWrapper dVar3 = new WebViewWrapper(webView);
        f50458i.put(webView, dVar3);
        return dVar3;
    }

    /* renamed from: a */
    private final List<JsCallOriginInfo> m75184a(IWebView bVar, String str) {
        ArrayList arrayList = new ArrayList();
        if (StringsKt.startsWith$default(str, f50454e, false, 2, (Object) null)) {
            m75187a(bVar);
            return arrayList;
        } else if (StringsKt.startsWith$default(str, f50455f, false, 2, (Object) null)) {
            return m75190b(str);
        } else {
            return arrayList;
        }
    }

    /* renamed from: a */
    public final void mo69596a(IWebView bVar, Lifecycle lifecycle) {
        Intrinsics.checkParameterIsNotNull(bVar, "webView");
        BridgeRegistry.f50436a.mo69579b();
        if (Build.VERSION.SDK_INT >= 17) {
            bVar.mo69702a(new JavaScriptInterfaceModule(bVar, lifecycle), "JS2NativeBridge");
        }
    }

    /* renamed from: b */
    public final BridgeResult mo69604b(IWebView bVar, JsCallOriginInfo aVar, Lifecycle lifecycle) {
        Intrinsics.checkParameterIsNotNull(bVar, "view");
        Intrinsics.checkParameterIsNotNull(aVar, "originInfo");
        Object obj = new Object();
        JsRequest d = aVar.mo69885d();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = (T) d.mo69888c();
        JsBridgeRegistry.f50491a.mo69639a().postAtFrontOfQueue(new RunnableC20669b(objectRef, bVar, obj));
        synchronized (obj) {
            obj.wait(f50452c);
            Unit unit = Unit.INSTANCE;
        }
        if (TextUtils.isEmpty(objectRef.element)) {
            return BridgeResult.Companion.m75332a(BridgeResult.f50535a, "param currentUrl must not be null in sync-call.", (JSONObject) null, 2, (Object) null);
        }
        JsBridgeRegistry dVar = JsBridgeRegistry.f50491a;
        String d2 = d.mo69889d();
        String a = d.mo69886a();
        T t = objectRef.element;
        if (t == null) {
            Intrinsics.throwNpe();
        }
        return dVar.mo69647b(d2, aVar, new JsBridgeContext(bVar, a, t), lifecycle);
    }

    /* renamed from: a */
    private final void m75188a(IWebView bVar, JSONObject jSONObject, IJsLoadUrlResult cVar) {
        if (jSONObject != null) {
            String str = "javascript:if(window.JSBridge && window.JSBridge._handleMessageFromApp){ " + "window.JSBridge && window.JSBridge._handleMessageFromApp(" + jSONObject + ')' + "} else if(window.Native2JSBridge && window.Native2JSBridge._handleMessageFromApp){ " + "window.Native2JSBridge && window.Native2JSBridge._handleMessageFromApp(" + jSONObject + ')' + "}";
            if (m75191b()) {
                mo69598a(bVar, str, cVar);
            } else {
                f50456g.post(new RunnableC20670c(bVar, str, cVar));
            }
        } else if (cVar != null) {
            cVar.mo69664a(-2, "sendJsMessage  o == null");
        }
    }

    /* renamed from: b */
    public final boolean mo69605b(IWebView bVar, String str, Lifecycle lifecycle) {
        Intrinsics.checkParameterIsNotNull(bVar, "webView");
        Intrinsics.checkParameterIsNotNull(str, "url");
        Logger lVar = Logger.f50514b;
        String str2 = f50451b;
        lVar.mo69733a(str2, " handleSchema url = " + str);
        try {
            if (!mo69603a(str)) {
                return false;
            }
            f50450a.mo69599a(bVar, m75184a(bVar, str), lifecycle);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public final void mo69597a(IWebView bVar, JsCallOriginInfo aVar, Lifecycle lifecycle) {
        Intrinsics.checkParameterIsNotNull(bVar, "view");
        Intrinsics.checkParameterIsNotNull(aVar, "originInfo");
        JsRequest d = aVar.mo69885d();
        Logger lVar = Logger.f50514b;
        String str = f50451b;
        lVar.mo69733a(str, "onJsbridgeRequest - " + d.mo69889d());
        if (!JsCallInterceptorManager.f50478a.mo69618a(d.mo69889d(), d.mo69887b(), new JsBridgeContext(bVar, d.mo69886a(), null, 4, null))) {
            JsBridgeRegistry.f50491a.mo69643a(d.mo69889d(), aVar, new JsBridgeContext(bVar, d.mo69886a(), null, 4, null), lifecycle);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m75185a(JsBridgeDelegate bVar, IWebView bVar2, String str, IJsLoadUrlResult cVar, int i, Object obj) {
        if ((i & 4) != 0) {
            cVar = null;
        }
        bVar.mo69598a(bVar2, str, cVar);
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m75189a(JsBridgeDelegate bVar, IWebView bVar2, String str, Lifecycle lifecycle, int i, Object obj) {
        if ((i & 4) != 0) {
            lifecycle = null;
        }
        return bVar.mo69605b(bVar2, str, lifecycle);
    }

    /* renamed from: a */
    public static /* synthetic */ void m75186a(JsBridgeDelegate bVar, String str, JSONObject jSONObject, IWebView bVar2, boolean z, IJsLoadUrlResult cVar, int i, Object obj) {
        if ((i & 16) != 0) {
            cVar = null;
        }
        bVar.mo69600a(str, jSONObject, bVar2, z, cVar);
    }
}
