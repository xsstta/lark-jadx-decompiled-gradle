package com.bytedance.sdk.bytebridge.web.context;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewParent;
import android.webkit.WebView;
import com.bytedance.sdk.bytebridge.base.context.AbsBridgeContext;
import com.bytedance.sdk.bytebridge.base.context.IBridgeView;
import com.bytedance.sdk.bytebridge.base.monitor.OriginInfo;
import com.bytedance.sdk.bytebridge.base.result.BridgeSyncResult;
import com.bytedance.sdk.bytebridge.base.utils.BridgeUtils;
import com.bytedance.sdk.bytebridge.web.auth.JsBridgeAuthenticator;
import com.bytedance.sdk.bytebridge.web.conduct.IJsLoadUrlResult;
import com.bytedance.sdk.bytebridge.web.conduct.JsBridge;
import com.bytedance.sdk.bytebridge.web.context.webview.NativeWebView;
import com.bytedance.sdk.bytebridge.web.util.JsBridgeUtils;
import com.bytedance.sdk.bytebridge.web.widget.JsCallOriginInfo;
import com.bytedance.sdk.bytebridge.web.widget.JsRequest;
import com.bytedance.sdk.bytebridge.web.widget.LoadUrlStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\tH\u0002J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\tH&J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\tH\u0016J\u0006\u0010\u0018\u001a\u00020\tJ\n\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001b\u001a\u00020\tH\u0016J\u0010\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\tH\u0002J\u0018\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\tJ\u0012\u0010\"\u001a\u00020\u000e2\b\u0010#\u001a\u0004\u0018\u00010$H\u0002J\u0012\u0010%\u001a\u00020\u000e2\b\u0010&\u001a\u0004\u0018\u00010$H\u0002J\u000e\u0010'\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\tR\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006)"}, d2 = {"Lcom/bytedance/sdk/bytebridge/web/context/JsContext;", "Lcom/bytedance/sdk/bytebridge/base/context/AbsBridgeContext;", "originInfo", "Lcom/bytedance/sdk/bytebridge/base/monitor/OriginInfo;", "iWebView", "Lcom/bytedance/sdk/bytebridge/web/context/IWebView;", "iJsLoadUrlResult", "Lcom/bytedance/sdk/bytebridge/web/conduct/IJsLoadUrlResult;", "currentUrl", "", "(Lcom/bytedance/sdk/bytebridge/base/monitor/OriginInfo;Lcom/bytedance/sdk/bytebridge/web/context/IWebView;Lcom/bytedance/sdk/bytebridge/web/conduct/IJsLoadUrlResult;Ljava/lang/String;)V", "getIWebView", "()Lcom/bytedance/sdk/bytebridge/web/context/IWebView;", "callback", "", "result", "Lcom/bytedance/sdk/bytebridge/base/result/BridgeSyncResult;", "complexGetUrl", "getActivity", "Landroid/app/Activity;", "getCallbackHandler", "getIBridgeView", "Lcom/bytedance/sdk/bytebridge/base/context/IBridgeView;", "getUrl", "getUrlForAuth", "getWebView", "Landroid/webkit/WebView;", "getWebViewName", "loadUrl", "resultUrl", "monitorSendToJs", "error", "Lcom/bytedance/sdk/bytebridge/web/widget/LoadUrlStatus;", "value", "sendCallbackMsg", "res", "Lorg/json/JSONObject;", "sendJsMessage", "resultJSON", "setUrl", "url", "web_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.sdk.bytebridge.web.c.c */
public abstract class JsContext extends AbsBridgeContext {

    /* renamed from: b */
    private final IWebView f50639b;

    /* renamed from: c */
    private final IJsLoadUrlResult f50640c;

    /* renamed from: d */
    private String f50641d;

    /* renamed from: k */
    public abstract String mo69874k();

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.sdk.bytebridge.web.c.c$a */
    public static final class RunnableC20691a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ JsContext f50642a;

        /* renamed from: b */
        final /* synthetic */ String f50643b;

        RunnableC20691a(JsContext cVar, String str) {
            this.f50642a = cVar;
            this.f50643b = str;
        }

        public final void run() {
            this.f50642a.mo69876a(this.f50643b);
        }
    }

    @Override // com.bytedance.sdk.bytebridge.base.context.AbsBridgeContext
    /* renamed from: f */
    public IBridgeView mo69793f() {
        return this.f50639b;
    }

    /* renamed from: a */
    public WebView mo69620a() {
        IWebView aVar = this.f50639b;
        if (aVar instanceof NativeWebView) {
            return ((NativeWebView) aVar).mo69871c();
        }
        return null;
    }

    @Override // com.bytedance.sdk.bytebridge.base.context.AbsBridgeContext
    /* renamed from: g */
    public String mo69794g() {
        boolean z;
        String str = this.f50641d;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f50641d = m75461l();
        }
        String str2 = this.f50641d;
        if (str2 == null) {
            Intrinsics.throwNpe();
        }
        return str2;
    }

    @Override // com.bytedance.sdk.bytebridge.base.context.AbsBridgeContext
    /* renamed from: i */
    public String mo69796i() {
        Class<?> cls;
        String name;
        WebView a = mo69620a();
        if (a != null && (cls = a.getClass()) != null && (name = cls.getName()) != null) {
            return name;
        }
        String name2 = this.f50639b.getClass().getName();
        Intrinsics.checkExpressionValueIsNotNull(name2, "iWebView.javaClass.name");
        return name2;
    }

    /* renamed from: l */
    private final String m75461l() {
        boolean z;
        String str;
        JsRequest d;
        String a = JsBridgeUtils.f50645a.mo69878a(mo69620a(), this.f50639b);
        String str2 = a;
        boolean z2 = false;
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return a;
        }
        OriginInfo j = mo69797j();
        if (!(j instanceof JsCallOriginInfo)) {
            j = null;
        }
        JsCallOriginInfo aVar = (JsCallOriginInfo) j;
        if (aVar == null || (d = aVar.mo69885d()) == null) {
            str = null;
        } else {
            str = d.mo69888c();
        }
        String str3 = str;
        if (str3 == null || str3.length() == 0) {
            z2 = true;
        }
        if (!z2) {
            return str;
        }
        return "";
    }

    @Override // com.bytedance.sdk.bytebridge.base.context.AbsBridgeContext
    /* renamed from: h */
    public Activity mo69795h() {
        Context context;
        ViewParent viewParent;
        Context context2;
        ViewParent viewParent2;
        Context context3;
        Activity a = this.f50639b.mo69585a();
        if (a != null) {
            return a;
        }
        WebView a2 = mo69620a();
        if (a2 != null) {
            context = a2.getContext();
        } else {
            context = null;
        }
        while (context != null && (context instanceof ContextWrapper)) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        WebView a3 = mo69620a();
        if (a3 != null) {
            viewParent = a3.getParent();
        } else {
            viewParent = null;
        }
        while (viewParent != null) {
            if (!(viewParent instanceof View)) {
                viewParent2 = null;
            } else {
                viewParent2 = viewParent;
            }
            View view = (View) viewParent2;
            if (view != null) {
                context3 = view.getContext();
            } else {
                context3 = null;
            }
            if (context3 instanceof Activity) {
                break;
            }
            viewParent = viewParent.getParent();
        }
        if (!(viewParent instanceof View)) {
            viewParent = null;
        }
        View view2 = (View) viewParent;
        if (view2 != null) {
            context2 = view2.getContext();
        } else {
            context2 = null;
        }
        while (context2 != null && (context2 instanceof ContextWrapper)) {
            if (context2 instanceof Activity) {
                return (Activity) context2;
            }
            context2 = ((ContextWrapper) context2).getBaseContext();
        }
        return null;
    }

    /* renamed from: a */
    public final void mo69876a(String str) {
        JsBridge.f50632a.mo69868a(this.f50639b, str, this);
    }

    @Override // com.bytedance.sdk.bytebridge.base.context.AbsBridgeContext
    /* renamed from: a */
    public void mo69621a(BridgeSyncResult fVar) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(fVar, "result");
        if (mo69874k().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m75459a(fVar.mo69852a());
        }
    }

    /* renamed from: a */
    private final void m75459a(JSONObject jSONObject) {
        String k = mo69874k();
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (this instanceof JsEventContext) {
                jSONObject2.put("__msg_type", "event");
                jSONObject2.put("__event_id", k);
            } else {
                jSONObject2.put("__msg_type", "callback");
            }
            jSONObject2.put("__callback_id", k);
            if (jSONObject != null) {
                jSONObject2.put("__params", jSONObject);
            }
            jSONObject2.put("__extra_info", new JSONObject());
            m75460b(jSONObject2);
        } catch (Exception e) {
            e.printStackTrace();
            LoadUrlStatus loadUrlStatus = LoadUrlStatus.SEND_CALLBACK_MSG_ERROR;
            mo69875a(loadUrlStatus, "sendCallbackMsg errMsg " + e);
        }
    }

    /* renamed from: b */
    private final void m75460b(JSONObject jSONObject) {
        if (jSONObject == null) {
            m75458a(this, LoadUrlStatus.RESULT_NULL, null, 2, null);
            return;
        }
        String str = "javascript:if(window.JSBridge && window.JSBridge._handleMessageFromApp){ " + "window.JSBridge && window.JSBridge._handleMessageFromApp(" + jSONObject + ')' + "} else if(window.Native2JSBridge && window.Native2JSBridge._handleMessageFromApp){ " + "window.Native2JSBridge && window.Native2JSBridge._handleMessageFromApp(" + jSONObject + ')' + "}";
        if (BridgeUtils.f50598a.mo69820c()) {
            mo69876a(str);
        } else {
            BridgeUtils.f50598a.mo69819b().post(new RunnableC20691a(this, str));
        }
    }

    /* renamed from: a */
    public final void mo69875a(LoadUrlStatus loadUrlStatus, String str) {
        Intrinsics.checkParameterIsNotNull(loadUrlStatus, "error");
        Intrinsics.checkParameterIsNotNull(str, "value");
        mo69786a(loadUrlStatus);
        IJsLoadUrlResult aVar = this.f50640c;
        if (aVar != null) {
            aVar.mo69867a(loadUrlStatus.getCode(), str);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JsContext(OriginInfo dVar, IWebView aVar, IJsLoadUrlResult aVar2, String str) {
        super(dVar, JsBridgeAuthenticator.f50631a);
        Intrinsics.checkParameterIsNotNull(dVar, "originInfo");
        Intrinsics.checkParameterIsNotNull(aVar, "iWebView");
        this.f50639b = aVar;
        this.f50640c = aVar2;
        this.f50641d = str;
    }

    /* renamed from: a */
    public static /* synthetic */ void m75458a(JsContext cVar, LoadUrlStatus loadUrlStatus, String str, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                str = loadUrlStatus.getMessage();
            }
            cVar.mo69875a(loadUrlStatus, str);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: monitorSendToJs");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ JsContext(OriginInfo dVar, IWebView aVar, IJsLoadUrlResult aVar2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, aVar, (i & 4) != 0 ? null : aVar2, (i & 8) != 0 ? null : str);
    }
}
