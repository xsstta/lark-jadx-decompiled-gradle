package com.tt.miniapp.webbridge;

import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.CharacterUtils;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkwebview.base.LarkWebView;
import com.bytedance.ee.larkwebview.bridge.Bridge;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.p3258a.AbstractC65718b;
import com.tt.miniapp.p3258a.C65720d;
import com.tt.miniapp.webbridge.aysnc.C67305b;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.util.DebugUtil;
import com.tt.option.ext.AbstractC67619e;
import com.tt.option.ext.AbstractC67626k;
import com.tt.option.ext.AbstractC67628l;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\nH\u0002J8\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\n2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00140\u001cH\u0002J\u001a\u0010\u001d\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\nH\u0002J.\u0010\u001e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0018\u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00122\b\u0010\u0019\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0015\u001a\u00020\u0007H\u0002J$\u0010 \u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\n2\u0006\u0010!\u001a\u00020\u0007H\u0014J\u0012\u0010\"\u001a\u00020#2\b\u0010\u0018\u001a\u0004\u0018\u00010\nH\u0014J\u0010\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020\nH\u0007J\u0014\u0010&\u001a\u0004\u0018\u00010\n2\b\u0010'\u001a\u0004\u0018\u00010\nH\u0007J\u000e\u0010(\u001a\u00020\u00142\u0006\u0010)\u001a\u00020\u0012R\u000e\u0010\t\u001a\u00020\nXD¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/tt/miniapp/webbridge/NewBrandRenderBridge;", "", "appContext", "Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;", "webView", "Lcom/bytedance/ee/larkwebview/base/LarkWebView;", "renderViewId", "", "(Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;Lcom/bytedance/ee/larkwebview/base/LarkWebView;I)V", "TAG", "", "interceptInvokeList", "", "strategy", "Lcom/tt/miniapp/bridge/IBridgeStrategy;", "Lcom/tt/option/ext/WebBaseEventHandler;", "weakRender", "Ljava/lang/ref/WeakReference;", "Lcom/tt/miniapp/RenderViewManager$IRender;", "callbackWebView", "", "callbackId", "msg", "executeInvoke", "event", "param", "extra", "noHandledCallBack", "Lkotlin/Function0;", "executePublish", "getEventHandler", "iRender", "handleInterceptedInvoke", "callBackId", "interceptInvoke", "", "invokeNative", "jsMessage", "publish2", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "setRender", "render", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.tt.miniapp.webbridge.c */
public class NewBrandRenderBridge {

    /* renamed from: a */
    public final String f169855a;

    /* renamed from: b */
    public final LarkWebView f169856b;

    /* renamed from: c */
    private final AbstractC65718b<AbstractC67628l> f169857c;

    /* renamed from: d */
    private final List<String> f169858d;

    /* renamed from: e */
    private WeakReference<RenderViewManager.IRender> f169859e;

    /* renamed from: f */
    private final IAppContext f169860f;

    /* renamed from: g */
    private final int f169861g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.tt.miniapp.webbridge.c$b */
    static final class C67312b extends Lambda implements Function0<Unit> {
        final /* synthetic */ String $jsMessage;
        final /* synthetic */ NewBrandRenderBridge this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C67312b(NewBrandRenderBridge cVar, String str) {
            super(0);
            this.this$0 = cVar;
            this.$jsMessage = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            Bridge bridge;
            AppBrandLogger.m52828d(this.this$0.f169855a, "try run LarkWebView bridge");
            LarkWebView larkWebView = this.this$0.f169856b;
            if (larkWebView != null && (bridge = larkWebView.getBridge()) != null) {
                bridge.invokeNative(this.$jsMessage);
            }
        }
    }

    /* renamed from: a */
    public final void mo233986a(RenderViewManager.IRender iRender) {
        Intrinsics.checkParameterIsNotNull(iRender, "render");
        this.f169859e = new WeakReference<>(iRender);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo233987a(String str) {
        return CollectionsKt.contains(this.f169858d, str);
    }

    @JavascriptInterface
    public final String invokeNative(String str) {
        String str2;
        Intrinsics.checkParameterIsNotNull(str, "jsMessage");
        if (TextUtils.isEmpty(str)) {
            AppBrandLogger.m52829e(this.f169855a, "invokeNative received jsMessage is empty !!");
            String empty = CharacterUtils.empty();
            Intrinsics.checkExpressionValueIsNotNull(empty, "CharacterUtils.empty()");
            return empty;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject optJSONObject = jSONObject.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            JSONObject optJSONObject2 = jSONObject.optJSONObject("extra");
            String optString = jSONObject.optString(HiAnalyticsConstant.HaKey.BI_KEY_APINAME);
            Intrinsics.checkExpressionValueIsNotNull(optString, "jsonObject.optString(\"apiName\")");
            str2 = m262195a(optString, String.valueOf(optJSONObject), jSONObject.optInt("callbackID"), String.valueOf(optJSONObject2), new C67312b(this, str));
        } catch (JSONException e) {
            AppBrandLogger.m52829e(this.f169855a, e);
            str2 = CharacterUtils.empty();
        }
        Intrinsics.checkExpressionValueIsNotNull(str2, "try {\n            val js…erUtils.empty()\n        }");
        return str2;
    }

    @JavascriptInterface
    public final String publish2(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            AppBrandLogger.m52829e(this.f169855a, "publish2 received data is empty !!");
            return null;
        }
        try {
            if (str == null) {
                Intrinsics.throwNpe();
            }
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString(HiAnalyticsConstant.HaKey.BI_KEY_APINAME);
            JSONObject optJSONObject = jSONObject.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if (optJSONObject == null || (str2 = optJSONObject.toString()) == null) {
                str2 = "";
            }
            Intrinsics.checkExpressionValueIsNotNull(str2, "dataObj?.toString() ?: \"\"");
            Intrinsics.checkExpressionValueIsNotNull(optString, HiAnalyticsConstant.HaKey.BI_KEY_APINAME);
            return m262194a(optString, str2);
        } catch (JSONException e) {
            AppBrandLogger.m52829e(this.f169855a, e);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "callbackId", "", "msg", "", "kotlin.jvm.PlatformType", "callback"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.tt.miniapp.webbridge.c$a */
    public static final class C67311a implements AbstractC67619e {

        /* renamed from: a */
        final /* synthetic */ NewBrandRenderBridge f169862a;

        C67311a(NewBrandRenderBridge cVar) {
            this.f169862a = cVar;
        }

        @Override // com.tt.option.ext.AbstractC67619e
        public final void callback(int i, String str) {
            NewBrandRenderBridge cVar = this.f169862a;
            Intrinsics.checkExpressionValueIsNotNull(str, "msg");
            cVar.mo233990a((NewBrandRenderBridge) i, (int) str);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private final void mo233990a(int i, String str) {
        AppbrandApplicationImpl inst = AppbrandApplicationImpl.getInst(this.f169860f);
        Intrinsics.checkExpressionValueIsNotNull(inst, "AppbrandApplicationImpl.getInst(appContext)");
        RenderViewManager renderViewManager = inst.getRenderViewManager();
        if (renderViewManager != null) {
            renderViewManager.invokeHandler(this.f169861g, i, str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x004e, code lost:
        if (r7 != null) goto L_0x0061;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String m262194a(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            java.lang.String r0 = r6.f169855a
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = " publish event "
            r3 = 0
            r1[r3] = r2
            r2 = 1
            r1[r2] = r7
            r4 = 2
            java.lang.String r5 = " param "
            r1[r4] = r5
            int r4 = r8.length()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 3
            r1[r5] = r4
            com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger.m52830i(r0, r1)
            java.lang.ref.WeakReference<com.tt.miniapp.RenderViewManager$IRender> r0 = r6.f169859e
            r1 = 0
            if (r0 == 0) goto L_0x0051
            java.lang.Object r0 = r0.get()
            com.tt.miniapp.RenderViewManager$IRender r0 = (com.tt.miniapp.RenderViewManager.IRender) r0
            if (r0 == 0) goto L_0x0051
            com.bytedance.ee.lark.infra.sandbox.context.IAppContext r4 = r6.f169860f
            com.tt.miniapphost.f r4 = com.tt.miniapphost.C67432a.m262319a(r4)
            java.lang.String r5 = "AppbrandApplication.getInst(appContext)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r5)
            com.tt.frontendapiinterface.IJsBridge r4 = r4.getJsBridge()
            if (r4 == 0) goto L_0x004d
            java.lang.String r5 = "it"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r5)
            int r0 = r0.getRenderViewId()
            r4.sendMsgToJsCore(r7, r8, r0)
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            goto L_0x004e
        L_0x004d:
            r7 = r1
        L_0x004e:
            if (r7 == 0) goto L_0x0051
            goto L_0x0061
        L_0x0051:
            r7 = r6
            com.tt.miniapp.webbridge.c r7 = (com.tt.miniapp.webbridge.NewBrandRenderBridge) r7
            java.lang.String r7 = r7.f169855a
            java.lang.Object[] r8 = new java.lang.Object[r2]
            java.lang.String r0 = "weakRender.get value is null !!"
            r8[r3] = r0
            com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger.m52829e(r7, r8)
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
        L_0x0061:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapp.webbridge.NewBrandRenderBridge.m262194a(java.lang.String, java.lang.String):java.lang.String");
    }

    public NewBrandRenderBridge(IAppContext iAppContext, LarkWebView larkWebView, int i) {
        Intrinsics.checkParameterIsNotNull(iAppContext, "appContext");
        this.f169860f = iAppContext;
        this.f169856b = larkWebView;
        this.f169861g = i;
        this.f169855a = "BrandRenderBridge";
        this.f169857c = new C65720d();
        this.f169858d = CollectionsKt.listOf("openCustomerService");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo233985a(String str, String str2, int i) {
        int i2;
        String str3 = this.f169855a;
        Object[] objArr = new Object[6];
        objArr[0] = "handleInterceptedInvoke event ";
        objArr[1] = str;
        objArr[2] = " param ";
        if (str2 != null) {
            i2 = Integer.valueOf(str2.length());
        } else {
            i2 = 0;
        }
        objArr[3] = i2;
        objArr[4] = " callbackId ";
        objArr[5] = Integer.valueOf(i);
        AppBrandLogger.m52830i(str3, objArr);
        if (TextUtils.equals(str, "openCustomerService")) {
            C67305b bVar = new C67305b(str2, i, new C67311a(this));
            bVar.setAppContext(this.f169860f);
            bVar.doAct();
        }
        String empty = CharacterUtils.empty();
        Intrinsics.checkExpressionValueIsNotNull(empty, "CharacterUtils.empty()");
        return empty;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004b, code lost:
        if (r5 == null) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004d, code lost:
        r5.setLoadAsWebView();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0050, code lost:
        r4 = com.tt.miniapp.AppbrandApplicationImpl.getInst(r3.f169860f);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, "AppbrandApplicationImpl.getInst(appContext)");
        r4.setCurrentPageType("webview");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002e, code lost:
        if (r4.equals("updateHTMLWebView") != false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0037, code lost:
        if (r4.equals("insertHTMLWebView") != false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0040, code lost:
        if (r4.equals("insertAdHTMLWebView") != false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0049, code lost:
        if (r4.equals("updateAdHTMLWebView") != false) goto L_0x004b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.tt.option.ext.AbstractC67628l m262193a(java.lang.String r4, com.tt.miniapp.RenderViewManager.IRender r5, java.lang.String r6, int r7) {
        /*
        // Method dump skipped, instructions count: 116
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapp.webbridge.NewBrandRenderBridge.m262193a(java.lang.String, com.tt.miniapp.RenderViewManager$IRender, java.lang.String, int):com.tt.option.ext.l");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NewBrandRenderBridge(IAppContext iAppContext, LarkWebView larkWebView, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(iAppContext, (i2 & 2) != 0 ? null : larkWebView, (i2 & 4) != 0 ? 0 : i);
    }

    /* renamed from: a */
    private final String m262195a(String str, String str2, int i, String str3, Function0<Unit> function0) {
        int i2 = 0;
        if (mo233987a(str)) {
            AppBrandLogger.m52830i(this.f169855a, "is intercepted");
            return mo233985a(str, str2, i);
        }
        if (DebugUtil.debug()) {
            String str4 = this.f169855a;
            Object[] objArr = new Object[8];
            objArr[0] = "invoke event ";
            objArr[1] = str;
            objArr[2] = " param ";
            if (str2 != null) {
                i2 = str2;
            }
            objArr[3] = i2;
            objArr[4] = " callbackId ";
            objArr[5] = Integer.valueOf(i);
            objArr[6] = " extra ";
            objArr[7] = str3;
            AppBrandLogger.m52830i(str4, objArr);
        } else {
            String str5 = this.f169855a;
            Object[] objArr2 = new Object[8];
            objArr2[0] = "invoke event ";
            objArr2[1] = str;
            objArr2[2] = " param ";
            if (str2 != null) {
                i2 = Integer.valueOf(str2.length());
            }
            objArr2[3] = i2;
            objArr2[4] = " callbackId ";
            objArr2[5] = Integer.valueOf(i);
            objArr2[6] = " extra ";
            objArr2[7] = str3;
            AppBrandLogger.m52830i(str5, objArr2);
        }
        WeakReference<RenderViewManager.IRender> weakReference = this.f169859e;
        if (weakReference == null) {
            AppBrandLogger.m52829e(this.f169855a, "weakRender is null");
            String empty = CharacterUtils.empty();
            Intrinsics.checkExpressionValueIsNotNull(empty, "CharacterUtils.empty()");
            return empty;
        }
        if (weakReference == null) {
            Intrinsics.throwNpe();
        }
        AbstractC67628l a = m262193a(str, weakReference.get(), str2, i);
        if (a == null || a.canOverride()) {
            AppbrandContext inst = AppbrandContext.getInst();
            Intrinsics.checkExpressionValueIsNotNull(inst, "AppbrandContext.getInst()");
            AbstractC67626k.AbstractC67627a nativeViewCreator = inst.getNativeViewCreator();
            if (nativeViewCreator != null) {
                WeakReference<RenderViewManager.IRender> weakReference2 = this.f169859e;
                if (weakReference2 == null) {
                    Intrinsics.throwNpe();
                }
                AbstractC67628l a2 = nativeViewCreator.mo49015a(str, weakReference2.get(), str2, i);
                if (a2 != null) {
                    a = a2;
                }
            }
        }
        if (a != null) {
            a.setAppContext(this.f169860f);
            this.f169857c.mo230307a(a, str, this.f169860f);
            String act = a.act();
            AppBrandLogger.m52830i(this.f169855a, "invoke return ", act);
            Intrinsics.checkExpressionValueIsNotNull(act, "action");
            return act;
        }
        function0.invoke();
        String empty2 = CharacterUtils.empty();
        Intrinsics.checkExpressionValueIsNotNull(empty2, "CharacterUtils.empty()");
        return empty2;
    }
}
