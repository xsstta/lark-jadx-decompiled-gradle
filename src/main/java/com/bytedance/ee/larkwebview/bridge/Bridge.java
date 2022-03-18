package com.bytedance.ee.larkwebview.bridge;

import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import com.bytedance.android.monitor.p106c.C2644b;
import com.bytedance.android.monitor.webview.C2711i;
import com.bytedance.ee.larkwebview.base.LarkWebView;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25894e;
import com.larksuite.framework.utils.C26284k;
import com.ss.android.lark.log.Log;
import com.tt.frontendapiinterface.ApiHandler;
import io.reactivex.AbstractC68307f;
import io.reactivex.Scheduler;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.p3456d.C68279a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000w\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001)\u0018\u0000 :2\u00020\u0001:\u0001:B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0010J\u0010\u0010\u0016\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u0018J\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001c\u001a\u00020\u0018H\u0002J*\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u00182\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\"J\u0006\u0010#\u001a\u00020\u0014J\u0006\u0010$\u001a\u00020\u0014J\u0010\u0010%\u001a\u00020\u00142\u0006\u0010&\u001a\u00020'H\u0002J'\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00182\b\u0010+\u001a\u0004\u0018\u00010\u00182\u0006\u0010,\u001a\u00020\u0018H\u0002¢\u0006\u0002\u0010-J\u0010\u0010.\u001a\u00020\u00142\u0006\u0010/\u001a\u00020\u0018H\u0017J\u0018\u00100\u001a\u0002012\u0006\u0010&\u001a\u00020'2\u0006\u00102\u001a\u000203H\u0002J \u00104\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u00182\u0010\u00105\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u000306J\u000e\u00107\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0010J\u0010\u00108\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u0018J\u000e\u00109\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u0018R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006;"}, d2 = {"Lcom/bytedance/ee/larkwebview/bridge/Bridge;", "", "webView", "Lcom/bytedance/ee/larkwebview/base/LarkWebView;", "(Lcom/bytedance/ee/larkwebview/base/LarkWebView;)V", "value", "Lcom/bytedance/ee/larkwebview/bridge/BridgeExetension;", "bridgeExtension", "getBridgeExtension", "()Lcom/bytedance/ee/larkwebview/bridge/BridgeExetension;", "setBridgeExtension", "(Lcom/bytedance/ee/larkwebview/bridge/BridgeExetension;)V", "handlerRepository", "Lcom/bytedance/ee/larkwebview/bridge/HandlerRepository;", "jsMsgInterceptors", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/larkwebview/bridge/JsMsgInterceptor;", "scheduler", "Lio/reactivex/Scheduler;", "addJSMsgInterceptor", "", "interceptor", "addJavascriptInterface", "bridgeName", "", "buildExtraObject", "Lorg/json/JSONObject;", "extensionExtra", "defaultExtraStr", "callJSFun", HiAnalyticsConstant.HaKey.BI_KEY_APINAME, "param", "Ljava/io/Serializable;", "callback", "Landroid/webkit/ValueCallback;", "clearAllHandler", "destroy", "dispatchMsgFromJS", "msg", "Lcom/bytedance/ee/larkwebview/bridge/Message;", "getCallback", "com/bytedance/ee/larkwebview/bridge/Bridge$getCallback$1", "handlerName", "callbackId", "extraStr", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bytedance/ee/larkwebview/bridge/Bridge$getCallback$1;", "invokeNative", "jsMessage", "onInterceptJSMsg", "", "callBack", "Lcom/bytedance/ee/larkwebview/bridge/JsCallBack;", "registerHandler", "handler", "Lcom/bytedance/ee/larkwebview/bridge/BridgeHandler;", "removeJSMsgInterceptor", "removeJavascriptInterface", "unRegisterHandler", "Companion", "base_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.larkwebview.bridge.a */
public final class Bridge {

    /* renamed from: b */
    public static final Companion f35342b = new Companion(null);

    /* renamed from: a */
    public final LarkWebView f35343a;

    /* renamed from: c */
    private final C13418f f35344c = new C13418f();

    /* renamed from: d */
    private final Scheduler f35345d;

    /* renamed from: e */
    private final ArrayList<JsMsgInterceptor> f35346e;

    /* renamed from: f */
    private volatile BridgeExetension f35347f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "accept", "(Lkotlin/Unit;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.larkwebview.bridge.a$f */
    static final class C13412f<T> implements Consumer<Unit> {

        /* renamed from: a */
        public static final C13412f f35362a = new C13412f();

        C13412f() {
        }

        /* renamed from: a */
        public final void accept(Unit unit) {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/larkwebview/bridge/Bridge$Companion;", "", "()V", "API_HAS_NO_AUTH", "", "BRIDGE_NAME", "CALLBACK_FUN", "ERRMSG", "FIND_NO_HANDLER", "TAG", "TRANSFER_MAX_SIZE", "", "base_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.larkwebview.bridge.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final BridgeExetension mo49764a() {
        return this.f35347f;
    }

    /* renamed from: a */
    public final void mo49771a(String str, Serializable serializable, ValueCallback<String> valueCallback) {
        Intrinsics.checkParameterIsNotNull(str, HiAnalyticsConstant.HaKey.BI_KEY_APINAME);
        this.f35343a.evaluateJavascript(Utils.f35372a.mo49802a(str, serializable), valueCallback);
    }

    /* renamed from: b */
    public final void mo49772b() {
        this.f35344c.f35367a.clear();
    }

    /* renamed from: c */
    public final void mo49775c() {
        Log.m165389i("JSBridge", "destroy");
        mo49772b();
        this.f35345d.shutdown();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.larkwebview.bridge.a$b */
    public static final class RunnableC13408b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Bridge f35348a;

        /* renamed from: b */
        final /* synthetic */ BridgeHandler f35349b;

        /* renamed from: c */
        final /* synthetic */ Object f35350c;

        /* renamed from: d */
        final /* synthetic */ C13410d f35351d;

        /* renamed from: e */
        final /* synthetic */ Message f35352e;

        RunnableC13408b(Bridge aVar, BridgeHandler cVar, Object obj, C13410d dVar, Message message) {
            this.f35348a = aVar;
            this.f35349b = cVar;
            this.f35350c = obj;
            this.f35351d = dVar;
            this.f35352e = message;
        }

        public final void run() {
            this.f35349b.mo30815a(this.f35350c, this.f35351d, this.f35352e.getExtra(), this.f35348a.f35343a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "apply"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.larkwebview.bridge.a$e */
    static final class C13411e<T, R> implements Function<T, R> {

        /* renamed from: a */
        final /* synthetic */ Bridge f35360a;

        /* renamed from: b */
        final /* synthetic */ String f35361b;

        C13411e(Bridge aVar, String str) {
            this.f35360a = aVar;
            this.f35361b = str;
        }

        @Override // io.reactivex.functions.Function
        public /* synthetic */ Object apply(Object obj) {
            mo49779a((String) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo49779a(String str) {
            boolean z;
            String str2;
            Intrinsics.checkParameterIsNotNull(str, "it");
            Log.m165379d("JSBridge", "jsapi invokeNative start, jsMessage length: " + this.f35361b.length());
            if (str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                BridgeReport.f35365a.mo49787a(this.f35360a.f35343a, "wb_lark_webview_bridge_error", UpdateDialogStatusCode.SHOW, "message isEmpty");
                C2644b bVar = new C2644b();
                bVar.f8400b = "message isEmpty";
                C2711i.m11480a().mo11578a(this.f35360a.f35343a, bVar);
                return;
            }
            Message a = this.f35360a.mo49764a().mo23541a(this.f35361b);
            if (str.length() > 2097152) {
                BridgeReport dVar = BridgeReport.f35365a;
                LarkWebView larkWebView = this.f35360a.f35343a;
                String str3 = "apiName = " + a.getApiName() + " and message.length = " + str.length() + ", is larger than TRANSFER_MAX_SIZE";
                if (a != null) {
                    str2 = a.getApiName();
                } else {
                    str2 = null;
                }
                dVar.mo49788a(larkWebView, "wb_lark_webview_bridge_error", 10007, str3, str2);
                C2644b bVar2 = new C2644b();
                bVar2.f8400b = "message.length = " + str.length() + ", is larger than TRANSFER_MAX_SIZE";
                bVar2.f8401c = a.getApiName();
                C2711i.m11480a().mo11578a(this.f35360a.f35343a, bVar2);
            }
            Intrinsics.checkExpressionValueIsNotNull(a, "message");
            if (!this.f35360a.mo49764a().mo49786a(this.f35360a.f35343a, a)) {
                Bridge aVar = this.f35360a;
                String apiName = a.getApiName();
                if (apiName == null) {
                    apiName = "null";
                }
                String callbackID = a.getCallbackID();
                String extra = a.getExtra();
                if (extra == null) {
                    extra = "";
                }
                aVar.mo49763a(apiName, callbackID, extra).mo49778a(Status.FAILURE, MapsKt.mapOf(new Pair(ApiHandler.API_CALLBACK_ERRMSG, "api has no auth")));
                BridgeReport.f35365a.mo49788a(this.f35360a.f35343a, "wb_lark_webview_bridge_error", 10003, "reqAuthWith fail! apiName = " + a.getApiName(), a.getApiName());
                return;
            }
            this.f35360a.mo49766a(a);
        }
    }

    /* renamed from: b */
    public final void mo49773b(JsMsgInterceptor hVar) {
        Intrinsics.checkParameterIsNotNull(hVar, "interceptor");
        this.f35346e.remove(hVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.larkwebview.bridge.a$g */
    static final class C13413g<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ Bridge f35363a;

        C13413g(Bridge aVar) {
            this.f35363a = aVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            Log.m165387e("JSBridge", th, true);
            if (C26284k.m95185a(this.f35363a.f35343a.getContext())) {
                Intrinsics.checkExpressionValueIsNotNull(th, "it");
                throw th;
            }
        }
    }

    /* renamed from: a */
    public final void mo49767a(BridgeExetension bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "value");
        this.f35347f = bVar;
    }

    public Bridge(LarkWebView larkWebView) {
        Intrinsics.checkParameterIsNotNull(larkWebView, "webView");
        this.f35343a = larkWebView;
        Scheduler a = C68279a.m265022a(Executors.newSingleThreadExecutor());
        Intrinsics.checkExpressionValueIsNotNull(a, "Schedulers.from(Executor…ewSingleThreadExecutor())");
        this.f35345d = a;
        this.f35346e = new ArrayList<>();
        this.f35347f = new BridgeExetension();
        m54497a(this, null, 1, null);
    }

    /* renamed from: b */
    public final void mo49774b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "handlerName");
        Log.m165389i("JSBridge", "unRegisterHandler handlerName = " + str);
        this.f35344c.f35367a.remove(str);
    }

    @JavascriptInterface
    public void invokeNative(String str) {
        Intrinsics.checkParameterIsNotNull(str, "jsMessage");
        AbstractC68307f.m265083a(str).mo238004b(this.f35345d).mo238020d(new C13411e(this, str)).mo238001b(C13412f.f35362a, new C13413g(this));
    }

    /* renamed from: a */
    public final void mo49768a(JsMsgInterceptor hVar) {
        Intrinsics.checkParameterIsNotNull(hVar, "interceptor");
        if (!this.f35346e.contains(hVar)) {
            this.f35346e.add(hVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x013a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49766a(com.bytedance.ee.larkwebview.bridge.Message r13) {
        /*
        // Method dump skipped, instructions count: 344
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.larkwebview.bridge.Bridge.mo49766a(com.bytedance.ee.larkwebview.bridge.Message):void");
    }

    /* renamed from: a */
    public final void mo49769a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "bridgeName");
        this.f35343a.addJavascriptInterface(this, str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\bH\u0016¨\u0006\u000b"}, d2 = {"com/bytedance/ee/larkwebview/bridge/Bridge$dispatchMsgFromJS$pluginResult$1", "Lcom/larksuite/framework/apiplugin/api/LKEventCallback;", "onFail", "", "eventId", "", "errorCode", "failParams", "Lorg/json/JSONObject;", "onSuccess", "successParams", "base_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.larkwebview.bridge.a$c */
    public static final class C13409c implements AbstractC25894e {

        /* renamed from: a */
        final /* synthetic */ String f35353a;

        /* renamed from: b */
        final /* synthetic */ C13410d f35354b;

        C13409c(String str, C13410d dVar) {
            this.f35353a = str;
            this.f35354b = dVar;
        }

        @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25894e
        /* renamed from: a */
        public void mo48104a(int i, JSONObject jSONObject) {
            Intrinsics.checkParameterIsNotNull(jSONObject, "successParams");
            Log.m165379d("JSBridge", this.f35353a + " handled by plugin success");
            this.f35354b.mo49778a(Status.SUCCESS, jSONObject);
        }

        @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25894e
        /* renamed from: a */
        public void mo48103a(int i, int i2, JSONObject jSONObject) {
            Intrinsics.checkParameterIsNotNull(jSONObject, "failParams");
            Log.m165383e("JSBridge", this.f35353a + " handled by plugin failed");
            this.f35354b.mo49778a(Status.FAILURE, jSONObject);
        }
    }

    /* renamed from: a */
    private final boolean m54498a(Message message, JsCallBack gVar) {
        T t;
        Iterator<T> it = this.f35346e.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (t.mo22534a(message, gVar)) {
                break;
            }
        }
        if (t != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final JSONObject mo49765a(Object obj, String str) {
        try {
            if (obj instanceof JSONObject) {
                Log.m165379d("JSBridge", "extensionExtra is JSONObject");
                return (JSONObject) obj;
            } else if (obj instanceof com.alibaba.fastjson.JSONObject) {
                Log.m165379d("JSBridge", "extensionExtra is com.alibaba.fastjson.JSONObject");
                return new JSONObject(((com.alibaba.fastjson.JSONObject) obj).toJSONString());
            } else if (!(obj instanceof String)) {
                return new JSONObject();
            } else {
                if (!TextUtils.isEmpty((CharSequence) obj)) {
                    return new JSONObject((String) obj);
                }
                Log.m165379d("JSBridge", "extensionExtra is empty , will return defaultExtraStr");
                return new JSONObject(str);
            }
        } catch (JSONException e) {
            Log.m165386e("JSBridge", e);
            return new JSONObject();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"com/bytedance/ee/larkwebview/bridge/Bridge$getCallback$1", "Lcom/bytedance/ee/larkwebview/bridge/JsCallBack;", "handleTimeStart", "", "getHandleTimeStart", "()J", "setHandleTimeStart", "(J)V", "onCallBack", "", UpdateKey.STATUS, "Lcom/bytedance/ee/larkwebview/bridge/Status;", "param", "", "base_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.larkwebview.bridge.a$d */
    public static final class C13410d implements JsCallBack {

        /* renamed from: a */
        final /* synthetic */ Bridge f35355a;

        /* renamed from: b */
        final /* synthetic */ String f35356b;

        /* renamed from: c */
        final /* synthetic */ String f35357c;

        /* renamed from: d */
        final /* synthetic */ String f35358d;

        /* renamed from: e */
        private long f35359e = System.currentTimeMillis();

        @Override // com.bytedance.ee.larkwebview.bridge.JsCallBack
        /* renamed from: a */
        public void mo49778a(Status status, Object obj) {
            boolean z;
            String str;
            String str2;
            Object obj2;
            String str3;
            String str4;
            Status a;
            Object c;
            Intrinsics.checkParameterIsNotNull(status, UpdateKey.STATUS);
            String str5 = this.f35356b;
            if (str5 == null || str5.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                BridgeReport.f35365a.mo49788a(this.f35355a.f35343a, "wb_lark_webview_bridge_error", 10005, this.f35357c + " 's callbackId isNullOrEmpty!", this.f35357c);
                return;
            }
            if (this.f35355a.mo49764a().mo49785a()) {
                BridgeReport.f35365a.mo49789a(this.f35355a.f35343a, this.f35357c, status, System.currentTimeMillis() - this.f35359e);
            }
            ResponseJsData a2 = this.f35355a.mo49764a().mo35579a(status, this.f35356b, obj, this.f35358d);
            HashMap hashMap = new HashMap();
            if (a2 == null || (str = a2.mo49794b()) == null) {
                str = this.f35356b;
            }
            hashMap.put("callbackID", str);
            if (!(a2 == null || (c = a2.mo49796c()) == null)) {
                obj = c;
            }
            hashMap.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, obj);
            if (a2 == null || (a = a2.mo49790a()) == null || (str2 = a.getStatus()) == null) {
                str2 = status.getStatus();
            }
            hashMap.put("callbackType", str2);
            Bridge aVar = this.f35355a;
            if (a2 != null) {
                obj2 = a2.mo49797d();
            } else {
                obj2 = null;
            }
            JSONObject a3 = aVar.mo49765a(obj2, this.f35358d);
            if (obj instanceof JSONObject) {
                hashMap.put("extra", a3);
                StringCompanionObject mVar = StringCompanionObject.f173215a;
                str3 = String.format("LarkWebViewJavaScriptBridge.nativeCallBack(%s);", Arrays.copyOf(new Object[]{new JSONObject(hashMap).toString()}, 1));
                Intrinsics.checkExpressionValueIsNotNull(str3, "java.lang.String.format(format, *args)");
            } else {
                if (a3 == null || (str4 = a3.toString()) == null) {
                    str4 = "";
                }
                hashMap.put("extra", com.alibaba.fastjson.JSONObject.parseObject(str4));
                StringCompanionObject mVar2 = StringCompanionObject.f173215a;
                str3 = String.format("LarkWebViewJavaScriptBridge.nativeCallBack(%s);", Arrays.copyOf(new Object[]{new com.alibaba.fastjson.JSONObject(hashMap).toJSONString()}, 1));
                Intrinsics.checkExpressionValueIsNotNull(str3, "java.lang.String.format(format, *args)");
            }
            Log.m165379d("JSBridge", "evaluateJavascript for jsapi callback, script = " + str3);
            this.f35355a.f35343a.evaluateJavascript(str3, null);
        }

        C13410d(Bridge aVar, String str, String str2, String str3) {
            this.f35355a = aVar;
            this.f35356b = str;
            this.f35357c = str2;
            this.f35358d = str3;
        }
    }

    /* renamed from: a */
    public final void mo49770a(String str, BridgeHandler<?, LarkWebView> cVar) {
        Intrinsics.checkParameterIsNotNull(str, "handlerName");
        Intrinsics.checkParameterIsNotNull(cVar, "handler");
        if (!StringsKt.isBlank(str)) {
            Log.m165389i("JSBridge", "registerHandler handlerName = " + str);
            this.f35344c.f35367a.put(str, cVar);
            return;
        }
        throw new IllegalArgumentException("handlerName should not blank");
    }

    /* renamed from: a */
    public final C13410d mo49763a(String str, String str2, String str3) {
        return new C13410d(this, str2, str, str3);
    }

    /* renamed from: a */
    public static /* synthetic */ void m54497a(Bridge aVar, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "Lark_Bridge";
        }
        aVar.mo49769a(str);
    }
}
