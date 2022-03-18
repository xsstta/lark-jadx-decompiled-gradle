package com.bytedance.sdk.bridge.js;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.Lifecycle;
import com.bytedance.sdk.bridge.AbsBridgeLifeCycleModule;
import com.bytedance.sdk.bridge.AbstractC20674k;
import com.bytedance.sdk.bridge.BridgeManager;
import com.bytedance.sdk.bridge.BridgeRegistry;
import com.bytedance.sdk.bridge.BridgeSDKInitHelper;
import com.bytedance.sdk.bridge.C20661b;
import com.bytedance.sdk.bridge.C20666f;
import com.bytedance.sdk.bridge.C20667g;
import com.bytedance.sdk.bridge.C20678m;
import com.bytedance.sdk.bridge.IBridgeAuthenticator;
import com.bytedance.sdk.bridge.Logger;
import com.bytedance.sdk.bridge.annotation.C20658a;
import com.bytedance.sdk.bridge.api.AbstractC20660a;
import com.bytedance.sdk.bridge.js.delegate.JsBridgeDelegate;
import com.bytedance.sdk.bridge.js.spec.IJsBridgeMessageHandler;
import com.bytedance.sdk.bridge.js.spec.JsBridgeContext;
import com.bytedance.sdk.bridge.js.webview.ISafeWebView;
import com.bytedance.sdk.bridge.model.BridgeInfo;
import com.bytedance.sdk.bridge.model.BridgeResult;
import com.bytedance.sdk.bridge.model.BridgeTmpInfo;
import com.bytedance.sdk.bridge.monitor.BridgeMonitor;
import com.bytedance.sdk.bytebridge.web.adapter.BridgeSDK;
import com.bytedance.sdk.bytebridge.web.widget.JsCallOriginInfo;
import com.tt.frontendapiinterface.ApiHandler;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010!\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000fH\u0002J'\u0010\u0017\u001a\u00020\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0001H\u0000¢\u0006\u0002\b\u001fJ(\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001a2\b\u0010&\u001a\u0004\u0018\u00010'J(\u0010(\u001a\u00020)2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001a2\b\u0010&\u001a\u0004\u0018\u00010'J\u0018\u0010*\u001a\u00020!2\u0006\u0010+\u001a\u00020\u00012\b\u0010&\u001a\u0004\u0018\u00010'J\u0018\u0010,\u001a\u00020!2\u0006\u0010+\u001a\u00020\u00012\b\u0010&\u001a\u0004\u0018\u00010'J&\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0011\u0018\u00010\f2\u0006\u0010\u001e\u001a\u00020\u00012\u0006\u0010.\u001a\u00020\u0018H\u0002J(\u0010/\u001a\u0004\u0018\u00010\u00112\u0006\u00100\u001a\u00020\u00042\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'J6\u00101\u001a\u0004\u0018\u00010\u00112\u0006\u0010\"\u001a\u00020\u00042\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00060\f2\b\u0010&\u001a\u0004\u0018\u00010'H\u0002J(\u00102\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u001e\u001a\u00020\u00012\b\u00103\u001a\u0004\u0018\u00010\u00012\u0006\u0010.\u001a\u00020\u0018H\u0002J\u0012\u00104\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001d\u001a\u00020\u0004H\u0002J0\u00105\u001a\u0004\u0018\u00010\u00112\b\u0010\u001e\u001a\u0004\u0018\u00010\u00012\u0006\u0010\"\u001a\u00020\u00042\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\fH\u0002J \u00106\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aH\u0002J\"\u00107\u001a\u0004\u0018\u00010)2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aH\u0002J\b\u00108\u001a\u00020!H\u0002J\u0018\u00109\u001a\u00020!2\u0006\u0010:\u001a\u00020\u00042\b\b\u0001\u0010;\u001a\u00020\u0004J\u001a\u0010<\u001a\u00020!2\u0006\u00103\u001a\u00020\u00012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'J&\u0010=\u001a\u00020!2\u0006\u00103\u001a\u00020\u00012\u0006\u0010&\u001a\u00020'2\u000e\u0010>\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010?J\u0016\u0010@\u001a\u00020!2\u0006\u00103\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u0001J\u0018\u0010A\u001a\u00020!2\u0006\u0010+\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u0001H\u0002J\u0010\u0010B\u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u0001H\u0002J\u000e\u0010C\u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u0001J\u0016\u0010C\u001a\u00020!2\u0006\u0010+\u001a\u00020\u00012\u0006\u0010&\u001a\u00020'J\u0016\u0010C\u001a\u00020!2\u0006\u0010+\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u0001J\u0016\u0010D\u001a\u00020!2\u0006\u0010+\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u0001R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006X\u0004¢\u0006\u0002\n\u0000R&\u0010\u000b\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\fX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f0\fX\u0004¢\u0006\u0002\n\u0000R \u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00060\fX\u0004¢\u0006\u0002\n\u0000R,\u0010\u0012\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\f0\fX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006E"}, d2 = {"Lcom/bytedance/sdk/bridge/js/JsBridgeRegistry;", "", "()V", "TAG", "", "commonJsBridgeModuleContainer", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/bytedance/sdk/bridge/model/BridgeTmpInfo;", "getCommonJsBridgeModuleContainer$js_bridge_release", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "conflictBridgeNames", "jsBridgeModuleInfoWebViewContainer", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/lang/ref/WeakReference;", "jsEventInfoContainer", "Lcom/bytedance/sdk/bridge/BridgeMethodInfo;", "jsMethodInfoContainer", "Lcom/bytedance/sdk/bridge/model/BridgeInfo;", "jsMethodInfoWebViewContainer", "mainHander", "Landroid/os/Handler;", "getMainHander", "()Landroid/os/Handler;", "auth", "", "jsBridgeContext", "Lcom/bytedance/sdk/bridge/js/spec/JsBridgeContext;", "methodInfo", "url", "eventNameWithNameSpace", "webView", "auth$js_bridge_release", "call", "", "bridgeName", "originInfo", "Lcom/bytedance/sdk/bytebridge/web/widget/JsCallOriginInfo;", "bridgeContext", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "callSync", "Lcom/bytedance/sdk/bridge/model/BridgeResult;", "disableBridgeMethods", "module", "enableBridgeMethods", "getBridgeInfosOrAddByWebView", "add", "getBridgeMethodInfo", "bridgeNameWithNameSpace", "getBridgeMethodInfoByName", "getBridgeModuleInfosOrAddByWebView", "bridgeModule", "getEventMethodInfo", "getWebViewBridgeMethodInfoByName", "holdByByteBridge", "holdByByteBridgeSync", "printCurrentMethod", "registerEvent", "event", "privilege", "registerJsBridge", "registerJsBridgeWithLifeCycle", "conflictBridgeNameList", "", "registerJsBridgeWithWebView", "removeBridgeModuleByWebView", "removeBridgeModuleInfosByWebView", "unregister", "unregisterBridgeModule", "js-bridge_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.sdk.bridge.js.d */
public final class JsBridgeRegistry {

    /* renamed from: a */
    public static final JsBridgeRegistry f50491a = new JsBridgeRegistry();

    /* renamed from: b */
    private static final String f50492b = f50492b;

    /* renamed from: c */
    private static final ConcurrentHashMap<String, CopyOnWriteArrayList<BridgeInfo>> f50493c = new ConcurrentHashMap<>();

    /* renamed from: d */
    private static final ConcurrentHashMap<WeakReference<Object>, ConcurrentHashMap<String, BridgeInfo>> f50494d = new ConcurrentHashMap<>();

    /* renamed from: e */
    private static final ConcurrentHashMap<String, C20666f> f50495e = new ConcurrentHashMap<>();

    /* renamed from: f */
    private static final CopyOnWriteArrayList<BridgeTmpInfo> f50496f = new CopyOnWriteArrayList<>();

    /* renamed from: g */
    private static final ConcurrentHashMap<WeakReference<Object>, CopyOnWriteArrayList<BridgeTmpInfo>> f50497g = new ConcurrentHashMap<>();

    /* renamed from: h */
    private static final CopyOnWriteArrayList<String> f50498h = new CopyOnWriteArrayList<>();

    /* renamed from: i */
    private static final Handler f50499i = new Handler(Looper.getMainLooper());

    private JsBridgeRegistry() {
    }

    /* renamed from: a */
    public final void mo69641a(Object obj, Lifecycle lifecycle) {
        Intrinsics.checkParameterIsNotNull(obj, "module");
        Intrinsics.checkParameterIsNotNull(lifecycle, "lifecycle");
        Logger lVar = Logger.f50514b;
        String str = f50492b;
        lVar.mo69733a(str, " unregister " + obj.getClass().getSimpleName());
        C20678m a = C20658a.m75123a(obj.getClass());
        if (a != null) {
            try {
                for (C20666f fVar : a.mo69750a()) {
                    Intrinsics.checkExpressionValueIsNotNull(fVar, "methodInfo");
                    String b = fVar.mo69563b();
                    CopyOnWriteArrayList<BridgeInfo> copyOnWriteArrayList = f50493c.get(b);
                    if (copyOnWriteArrayList != null) {
                        CopyOnWriteArrayList<String> copyOnWriteArrayList2 = f50498h;
                        if (copyOnWriteArrayList2.contains(b)) {
                            copyOnWriteArrayList2.remove(b);
                        }
                    }
                    BridgeInfo a2 = BridgeRegistry.f50436a.mo69574a((List<BridgeInfo>) copyOnWriteArrayList, lifecycle);
                    if (!(copyOnWriteArrayList == null || a2 == null)) {
                        copyOnWriteArrayList.remove(a2);
                        Logger lVar2 = Logger.f50514b;
                        String str2 = f50492b;
                        lVar2.mo69733a(str2, "unregister  " + lifecycle + " -- " + b);
                    }
                }
            } catch (ClassCastException e) {
                e.printStackTrace();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("error_msg", Log.getStackTraceString(e));
                jSONObject.put("error_code", 1);
                jSONObject.put("event_type", ApiHandler.API_CALLBACK_EXCEPTION);
                BridgeMonitor.m75144a(BridgeMonitor.f50418a, 1, ApiHandler.API_CALLBACK_EXCEPTION, new JSONObject(), jSONObject, null, 16, null);
            }
        }
        CopyOnWriteArrayList<BridgeTmpInfo> copyOnWriteArrayList3 = f50496f;
        synchronized (copyOnWriteArrayList3) {
            Iterator<BridgeTmpInfo> it = copyOnWriteArrayList3.iterator();
            Intrinsics.checkExpressionValueIsNotNull(it, "commonJsBridgeModuleContainer.iterator()");
            while (it.hasNext()) {
                BridgeTmpInfo next = it.next();
                if (Intrinsics.areEqual(obj, next.mo69772a())) {
                    f50496f.remove(next);
                }
            }
            Unit unit = Unit.INSTANCE;
        }
        m75247b();
        if (obj instanceof AbsBridgeLifeCycleModule) {
            ((AbsBridgeLifeCycleModule) obj).mo69518i();
        }
    }

    /* renamed from: a */
    public final boolean mo69645a(String str, JsCallOriginInfo aVar, JsBridgeContext dVar) {
        if (!JsBridgeManager.f50485a.mo69637b(str) || dVar.mo69667b() == null) {
            return false;
        }
        BridgeSDK.f50630a.mo69860a(new ByteBridgeJsCallContext(aVar, dVar));
        return true;
    }

    /* renamed from: a */
    public final void mo69643a(String str, JsCallOriginInfo aVar, JsBridgeContext dVar, Lifecycle lifecycle) {
        Intrinsics.checkParameterIsNotNull(str, "bridgeName");
        Intrinsics.checkParameterIsNotNull(aVar, "originInfo");
        Intrinsics.checkParameterIsNotNull(dVar, "bridgeContext");
        f50499i.post(new RunnableC20672a(aVar, str, dVar, lifecycle));
    }

    /* renamed from: a */
    public final boolean mo69644a(JsBridgeContext dVar, C20666f fVar) {
        if (JsBridgeManager.f50485a.mo69628a() == null || dVar.mo69668c() == null) {
            return true;
        }
        IBridgeAuthenticator<String> a = JsBridgeManager.f50485a.mo69628a();
        if (a == null) {
            Intrinsics.throwNpe();
        }
        return a.mo69584a(dVar.mo69670e(), fVar);
    }

    /* renamed from: a */
    public final boolean mo69646a(String str, String str2, Object obj) {
        String a;
        Intrinsics.checkParameterIsNotNull(str2, "eventNameWithNameSpace");
        Intrinsics.checkParameterIsNotNull(obj, "webView");
        if (JsBridgeManager.f50485a.mo69628a() == null || str == null) {
            return true;
        }
        if (BridgeManager.f50421a.mo69560a().mo69548e() && (obj instanceof ISafeWebView) && (a = ((ISafeWebView) obj).mo69700a()) != null) {
            str = a;
        }
        C20666f a2 = m75238a(str2);
        if (a2 == null) {
            BridgeInfo a3 = m75239a(this, str2, obj, null, 4, null);
            a2 = a3 != null ? a3.mo69769b() : null;
        }
        if (a2 == null) {
            return false;
        }
        IBridgeAuthenticator<String> a4 = JsBridgeManager.f50485a.mo69628a();
        if (a4 == null) {
            Intrinsics.throwNpe();
        }
        return a4.mo69584a(str, a2);
    }

    /* renamed from: a */
    public final BridgeInfo mo69640a(String str, Object obj, Lifecycle lifecycle) {
        List split$default;
        Intrinsics.checkParameterIsNotNull(str, "bridgeNameWithNameSpace");
        ConcurrentHashMap<String, BridgeInfo> concurrentHashMap = null;
        if (obj != null) {
            concurrentHashMap = f50491a.m75243a(obj, false);
        }
        if (concurrentHashMap != null) {
            BridgeInfo a = f50491a.m75240a(obj, str, concurrentHashMap);
            if (a != null) {
                return a;
            }
        }
        ConcurrentHashMap<String, CopyOnWriteArrayList<BridgeInfo>> concurrentHashMap2 = f50493c;
        BridgeInfo a2 = m75241a(str, concurrentHashMap2, lifecycle);
        if (a2 == null) {
            a2 = BridgeRegistry.f50436a.mo69573a(str, lifecycle);
        }
        if (a2 != null) {
            return a2;
        }
        C20661b a3 = BridgeManager.f50421a.mo69560a();
        if (!(!Intrinsics.areEqual((Object) (a3 != null ? a3.mo69546c() : null), (Object) false)) || (split$default = StringsKt.split$default((CharSequence) str, new String[]{"."}, false, 0, 6, (Object) null)) == null || split$default.size() <= 1) {
            return null;
        }
        String str2 = (String) split$default.get(CollectionsKt.getLastIndex(split$default));
        if (concurrentHashMap != null) {
            BridgeInfo a4 = f50491a.m75240a(obj, str2, concurrentHashMap);
            if (a4 != null) {
                return a4;
            }
        }
        BridgeInfo a5 = m75241a(str2, concurrentHashMap2, lifecycle);
        return a5 != null ? a5 : BridgeRegistry.f50436a.mo69573a(str2, lifecycle);
    }

    /* renamed from: a */
    public final Handler mo69639a() {
        return f50499i;
    }

    /* renamed from: b */
    private final void m75247b() {
        Boolean bool;
        C20661b a = BridgeManager.f50421a.mo69560a();
        if (a != null) {
            bool = a.mo69544a();
        } else {
            bool = null;
        }
        if (!(!Intrinsics.areEqual((Object) bool, (Object) true))) {
            StringBuilder sb = new StringBuilder("--------- Current JsBridgeMethod --------\n");
            for (Map.Entry<String, CopyOnWriteArrayList<BridgeInfo>> entry : f50493c.entrySet()) {
                for (T t : entry.getValue()) {
                    sb.append(t.mo69767a());
                    sb.append(":");
                    sb.append(t.mo69769b().mo69563b());
                    sb.append("\n");
                }
            }
            Logger lVar = Logger.f50514b;
            String str = f50492b;
            String sb2 = sb.toString();
            Intrinsics.checkExpressionValueIsNotNull(sb2, "sb.toString()");
            lVar.mo69733a(str, sb2);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.sdk.bridge.js.d$a */
    public static final class RunnableC20672a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ JsCallOriginInfo f50500a;

        /* renamed from: b */
        final /* synthetic */ String f50501b;

        /* renamed from: c */
        final /* synthetic */ JsBridgeContext f50502c;

        /* renamed from: d */
        final /* synthetic */ Lifecycle f50503d;

        RunnableC20672a(JsCallOriginInfo aVar, String str, JsBridgeContext dVar, Lifecycle lifecycle) {
            this.f50500a = aVar;
            this.f50501b = str;
            this.f50502c = dVar;
            this.f50503d = lifecycle;
        }

        /* JADX WARNING: Removed duplicated region for block: B:75:0x03d3  */
        /* JADX WARNING: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            // Method dump skipped, instructions count: 1036
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.bridge.js.JsBridgeRegistry.RunnableC20672a.run():void");
        }
    }

    /* renamed from: a */
    private final C20666f m75238a(String str) {
        Boolean bool;
        List split$default;
        ConcurrentHashMap<String, C20666f> concurrentHashMap = f50495e;
        C20666f fVar = concurrentHashMap.get(str);
        if (fVar == null) {
            fVar = BridgeRegistry.f50436a.mo69571a(str);
        }
        if (fVar != null) {
            return fVar;
        }
        C20661b a = BridgeManager.f50421a.mo69560a();
        if (a != null) {
            bool = a.mo69546c();
        } else {
            bool = null;
        }
        if (!(!Intrinsics.areEqual((Object) bool, (Object) false)) || (split$default = StringsKt.split$default((CharSequence) str, new String[]{"."}, false, 0, 6, (Object) null)) == null || split$default.size() <= 1) {
            return null;
        }
        String str2 = (String) split$default.get(CollectionsKt.getLastIndex(split$default));
        C20666f fVar2 = concurrentHashMap.get(str2);
        if (fVar2 != null) {
            return fVar2;
        }
        return BridgeRegistry.f50436a.mo69571a(str2);
    }

    /* renamed from: a */
    private final void m75245a(Object obj) {
        Iterator<Map.Entry<WeakReference<Object>, CopyOnWriteArrayList<BridgeTmpInfo>>> it = f50497g.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<WeakReference<Object>, CopyOnWriteArrayList<BridgeTmpInfo>> next = it.next();
            Object obj2 = next.getKey().get();
            if (obj2 == null || Intrinsics.areEqual(obj2, obj)) {
                Iterator<T> it2 = next.getValue().iterator();
                while (it2.hasNext()) {
                    Object a = it2.next().mo69772a();
                    if (!(a instanceof AbsBridgeLifeCycleModule)) {
                        a = null;
                    }
                    AbsBridgeLifeCycleModule aVar = (AbsBridgeLifeCycleModule) a;
                    if (aVar != null) {
                        aVar.mo69518i();
                    }
                }
                it.remove();
            }
        }
    }

    /* renamed from: a */
    public final void mo69642a(Object obj, Object obj2) {
        Intrinsics.checkParameterIsNotNull(obj, "bridgeModule");
        Intrinsics.checkParameterIsNotNull(obj2, "webView");
        m75243a(obj2, true);
        m75244a(obj2, obj, true);
        JsBridgeDelegate.f50450a.mo69595a().size();
    }

    /* renamed from: a */
    private final ConcurrentHashMap<String, BridgeInfo> m75243a(Object obj, boolean z) {
        ConcurrentHashMap<String, BridgeInfo> concurrentHashMap = null;
        Iterator<Map.Entry<WeakReference<Object>, ConcurrentHashMap<String, BridgeInfo>>> it = f50494d.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<WeakReference<Object>, ConcurrentHashMap<String, BridgeInfo>> next = it.next();
            Object obj2 = next.getKey().get();
            if (obj2 == null) {
                it.remove();
            } else if (Intrinsics.areEqual(obj2, obj)) {
                concurrentHashMap = next.getValue();
            }
        }
        if (!z || concurrentHashMap != null) {
            return concurrentHashMap;
        }
        ConcurrentHashMap<String, BridgeInfo> concurrentHashMap2 = new ConcurrentHashMap<>();
        f50494d.put(new WeakReference<>(obj), concurrentHashMap2);
        return concurrentHashMap2;
    }

    /* renamed from: b */
    public final void mo69648b(Object obj, Lifecycle lifecycle) {
        Intrinsics.checkParameterIsNotNull(obj, "module");
        Logger lVar = Logger.f50514b;
        String str = f50492b;
        lVar.mo69733a(str, " disableJsBridgeMethods " + obj.getClass().getSimpleName());
        C20678m a = C20658a.m75123a(obj.getClass());
        if (a != null) {
            for (C20666f fVar : a.mo69750a()) {
                Intrinsics.checkExpressionValueIsNotNull(fVar, "methodInfo");
                String b = fVar.mo69563b();
                BridgeInfo a2 = BridgeRegistry.f50436a.mo69574a((List<BridgeInfo>) f50493c.get(b), lifecycle);
                if (a2 != null) {
                    a2.mo69768a(false);
                }
                Logger lVar2 = Logger.f50514b;
                String str2 = f50492b;
                lVar2.mo69733a(str2, " disable  " + b + '\n');
            }
        }
        if (obj instanceof AbsBridgeLifeCycleModule) {
            ((AbsBridgeLifeCycleModule) obj).mo69517h();
        }
    }

    /* renamed from: c */
    public final void mo69650c(Object obj, Lifecycle lifecycle) {
        Intrinsics.checkParameterIsNotNull(obj, "module");
        Logger lVar = Logger.f50514b;
        String str = f50492b;
        lVar.mo69733a(str, " enableJsBridgeMethods " + obj.getClass().getSimpleName());
        C20678m a = C20658a.m75123a(obj.getClass());
        if (a != null) {
            for (C20666f fVar : a.mo69750a()) {
                Intrinsics.checkExpressionValueIsNotNull(fVar, "methodInfo");
                String b = fVar.mo69563b();
                BridgeInfo a2 = BridgeRegistry.f50436a.mo69574a((List<BridgeInfo>) f50493c.get(b), lifecycle);
                if (a2 != null) {
                    a2.mo69768a(true);
                }
                Logger lVar2 = Logger.f50514b;
                String str2 = f50492b;
                lVar2.mo69733a(str2, " enable  " + b + '\n');
            }
        }
        if (obj instanceof AbsBridgeLifeCycleModule) {
            ((AbsBridgeLifeCycleModule) obj).mo69516g();
        }
        JsBridgeDelegate.f50450a.mo69595a().size();
    }

    /* renamed from: b */
    public final void mo69649b(Object obj, Object obj2) {
        Intrinsics.checkParameterIsNotNull(obj, "module");
        Intrinsics.checkParameterIsNotNull(obj2, "webView");
        Logger lVar = Logger.f50514b;
        String str = f50492b;
        lVar.mo69733a(str, " unregister " + obj.getClass().getSimpleName());
        ConcurrentHashMap<String, BridgeInfo> a = m75243a(obj2, false);
        if (a != null) {
            C20678m a2 = C20658a.m75123a(obj.getClass());
            if (a2 != null) {
                try {
                    for (C20666f fVar : a2.mo69750a()) {
                        Intrinsics.checkExpressionValueIsNotNull(fVar, "methodInfo");
                        String b = fVar.mo69563b();
                        a.remove(b);
                        Logger lVar2 = Logger.f50514b;
                        String str2 = f50492b;
                        lVar2.mo69733a(str2, "unregister  " + obj2 + " -- " + b);
                    }
                } catch (ClassCastException e) {
                    e.printStackTrace();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("error_msg", Log.getStackTraceString(e));
                    jSONObject.put("error_code", 2);
                    jSONObject.put("event_type", ApiHandler.API_CALLBACK_EXCEPTION);
                    BridgeMonitor.m75144a(BridgeMonitor.f50418a, 2, ApiHandler.API_CALLBACK_EXCEPTION, new JSONObject(), jSONObject, null, 16, null);
                }
            }
            m75245a(obj2);
            m75247b();
        }
    }

    /* renamed from: b */
    private final BridgeResult m75246b(String str, JsCallOriginInfo aVar, JsBridgeContext dVar) {
        if (!JsBridgeManager.f50485a.mo69637b(str) || dVar.mo69667b() == null) {
            return null;
        }
        return C20673e.m75260a(BridgeResult.f50535a, BridgeSDK.f50630a.mo69861b(new ByteBridgeJsCallContext(aVar, dVar)));
    }

    /* renamed from: a */
    private final BridgeInfo m75240a(Object obj, String str, ConcurrentHashMap<String, BridgeInfo> concurrentHashMap) {
        C20666f fVar;
        C20678m a;
        if (obj == null) {
            return null;
        }
        if (concurrentHashMap.containsKey(str)) {
            BridgeInfo aVar = concurrentHashMap.get(str);
            C20666f b = aVar != null ? aVar.mo69769b() : null;
            if (!(aVar == null || b == null || !aVar.mo69770c())) {
                return aVar;
            }
        }
        CopyOnWriteArrayList<BridgeTmpInfo> a2 = m75244a(obj, (Object) null, false);
        if (a2.isEmpty()) {
            return null;
        }
        BridgeSDKInitHelper.f50444a.mo69583a(str);
        if (BridgeRegistry.f50436a.mo69575a().isEmpty()) {
            for (AbstractC20674k kVar : BridgeSDKInitHelper.f50444a.mo69582a()) {
                if (kVar != null) {
                    kVar.mo69731a(BridgeRegistry.f50436a.mo69575a());
                }
            }
        }
        Class<?> cls = BridgeRegistry.f50436a.mo69575a().get(str);
        BridgeTmpInfo cVar = null;
        if (cls != null) {
            for (int size = a2.size() - 1; size >= 0; size--) {
                if (!(!cls.isAssignableFrom(a2.get(size).mo69772a().getClass()) || (cVar = a2.get(size)) == null || (a = C20658a.m75123a(cls)) == null)) {
                    for (C20666f fVar2 : a.mo69750a()) {
                        Intrinsics.checkExpressionValueIsNotNull(fVar2, "methodInfo");
                        String b2 = fVar2.mo69563b();
                        if (!TextUtils.isEmpty(b2)) {
                            if (concurrentHashMap.containsKey(b2)) {
                                Logger.f50514b.mo69734b(f50492b, "NOTE！NOTE！NOTE！ There is already a bridge method named [" + b2 + "], and the old one will be overwritten.");
                            }
                            BridgeInfo aVar2 = new BridgeInfo(cVar.mo69772a(), fVar2, false, cVar.mo69773b(), 4, null);
                            Intrinsics.checkExpressionValueIsNotNull(b2, "bridgeMethodName");
                            concurrentHashMap.put(b2, aVar2);
                        } else {
                            throw new IllegalArgumentException("Bridge method name cannot be empty！");
                        }
                    }
                    continue;
                }
            }
        }
        if (cVar == null) {
            for (int size2 = a2.size() - 1; size2 >= 0; size2--) {
                C20678m a3 = C20658a.m75123a(a2.get(size2).mo69772a().getClass());
                if (a3 != null) {
                    Iterator<C20666f> it = a3.mo69750a().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C20666f next = it.next();
                        Intrinsics.checkExpressionValueIsNotNull(next, "methodInfo");
                        String b3 = next.mo69563b();
                        if (TextUtils.equals(b3, str)) {
                            BridgeInfo aVar3 = new BridgeInfo(a2.get(size2).mo69772a(), next, false, a2.get(size2).mo69773b(), 4, null);
                            Intrinsics.checkExpressionValueIsNotNull(b3, "bridgeMethodName");
                            concurrentHashMap.put(b3, aVar3);
                            break;
                        }
                    }
                }
                if (concurrentHashMap.containsKey(str)) {
                    break;
                }
            }
        }
        if (concurrentHashMap.containsKey(str)) {
            BridgeInfo aVar4 = concurrentHashMap.get(str);
            if (aVar4 != null) {
                fVar = aVar4.mo69769b();
            } else {
                fVar = null;
            }
            if (!(aVar4 == null || fVar == null || !aVar4.mo69770c())) {
                return aVar4;
            }
        }
        m75247b();
        return null;
    }

    /* renamed from: a */
    private final BridgeInfo m75241a(String str, ConcurrentHashMap<String, CopyOnWriteArrayList<BridgeInfo>> concurrentHashMap, Lifecycle lifecycle) {
        C20666f fVar;
        C20678m a;
        BridgeInfo a2;
        if (concurrentHashMap.containsKey(str) && (a2 = BridgeRegistry.f50436a.mo69574a((List<BridgeInfo>) concurrentHashMap.get(str), lifecycle)) != null) {
            if (a2.mo69771d() == null && lifecycle != null && f50498h.contains(str)) {
                concurrentHashMap.remove(str);
                Logger.f50514b.mo69734b(f50492b, "global is replace page");
            } else if (a2.mo69770c()) {
                return a2;
            }
        }
        BridgeSDKInitHelper.f50444a.mo69583a(str);
        if (BridgeRegistry.f50436a.mo69575a().isEmpty()) {
            for (AbstractC20674k kVar : BridgeSDKInitHelper.f50444a.mo69582a()) {
                if (kVar != null) {
                    kVar.mo69731a(BridgeRegistry.f50436a.mo69575a());
                }
            }
        }
        Class<?> cls = BridgeRegistry.f50436a.mo69575a().get(str);
        BridgeTmpInfo cVar = null;
        BridgeTmpInfo cVar2 = null;
        if (cls != null) {
            CopyOnWriteArrayList<BridgeTmpInfo> copyOnWriteArrayList = f50496f;
            synchronized (copyOnWriteArrayList) {
                int size = copyOnWriteArrayList.size() - 1;
                while (size >= 0) {
                    CopyOnWriteArrayList<BridgeTmpInfo> copyOnWriteArrayList2 = f50496f;
                    if (!(!cls.isAssignableFrom(copyOnWriteArrayList2.get(size).mo69772a().getClass()) || (cVar2 = copyOnWriteArrayList2.get(size)) == null || (a = C20658a.m75123a(cls)) == null)) {
                        BridgeTmpInfo cVar3 = cVar2;
                        for (C20666f fVar2 : a.mo69750a()) {
                            Intrinsics.checkExpressionValueIsNotNull(fVar2, "methodInfo");
                            String b = fVar2.mo69563b();
                            if (!TextUtils.isEmpty(b)) {
                                ConcurrentHashMap<String, CopyOnWriteArrayList<BridgeInfo>> concurrentHashMap2 = f50493c;
                                CopyOnWriteArrayList<BridgeInfo> copyOnWriteArrayList3 = concurrentHashMap2.get(b);
                                if (copyOnWriteArrayList3 == null) {
                                    copyOnWriteArrayList3 = new CopyOnWriteArrayList<>();
                                    Intrinsics.checkExpressionValueIsNotNull(b, "bridgeMethodName");
                                    concurrentHashMap2.put(b, copyOnWriteArrayList3);
                                }
                                BridgeInfo a3 = BridgeRegistry.f50436a.mo69574a((List<BridgeInfo>) copyOnWriteArrayList3, lifecycle);
                                if (a3 != null) {
                                    Boolean f = BridgeManager.f50421a.mo69560a().mo69549f();
                                    Intrinsics.checkExpressionValueIsNotNull(f, "BridgeManager.bridgeConf…sCompatiblePreLoadWebview");
                                    if (f.booleanValue() && !a3.mo69770c()) {
                                        copyOnWriteArrayList3.add(new BridgeInfo(cVar2.mo69772a(), fVar2, false, cVar2.mo69773b(), 4, null));
                                    }
                                } else if (!f50498h.contains(b) || cVar2.mo69773b() != null) {
                                    copyOnWriteArrayList3.add(new BridgeInfo(cVar2.mo69772a(), fVar2, false, cVar2.mo69773b(), 4, null));
                                } else {
                                    cVar3 = cVar;
                                    concurrentHashMap2.remove(b);
                                }
                                cVar = null;
                            } else {
                                throw new IllegalArgumentException("Bridge method name cannot be empty！");
                            }
                        }
                        cVar2 = cVar3;
                    }
                    size--;
                    cVar = null;
                }
                Unit unit = Unit.INSTANCE;
            }
        }
        if (cVar2 == null) {
            CopyOnWriteArrayList<BridgeTmpInfo> copyOnWriteArrayList4 = f50496f;
            synchronized (copyOnWriteArrayList4) {
                int size2 = copyOnWriteArrayList4.size() - 1;
                while (true) {
                    if (size2 < 0) {
                        break;
                    }
                    C20678m a4 = C20658a.m75123a(f50496f.get(size2).mo69772a().getClass());
                    if (a4 != null) {
                        for (C20666f fVar3 : a4.mo69750a()) {
                            Intrinsics.checkExpressionValueIsNotNull(fVar3, "methodInfo");
                            String b2 = fVar3.mo69563b();
                            if (TextUtils.equals(b2, str)) {
                                ConcurrentHashMap<String, CopyOnWriteArrayList<BridgeInfo>> concurrentHashMap3 = f50493c;
                                CopyOnWriteArrayList<BridgeInfo> copyOnWriteArrayList5 = concurrentHashMap3.get(b2);
                                if (copyOnWriteArrayList5 == null) {
                                    copyOnWriteArrayList5 = new CopyOnWriteArrayList<>();
                                    Intrinsics.checkExpressionValueIsNotNull(b2, "bridgeMethodName");
                                    concurrentHashMap3.put(b2, copyOnWriteArrayList5);
                                }
                                BridgeInfo a5 = BridgeRegistry.f50436a.mo69574a((List<BridgeInfo>) copyOnWriteArrayList5, lifecycle);
                                if (a5 != null) {
                                    Boolean f2 = BridgeManager.f50421a.mo69560a().mo69549f();
                                    Intrinsics.checkExpressionValueIsNotNull(f2, "BridgeManager.bridgeConf…sCompatiblePreLoadWebview");
                                    if (f2.booleanValue() && !a5.mo69770c()) {
                                        CopyOnWriteArrayList<BridgeTmpInfo> copyOnWriteArrayList6 = f50496f;
                                        copyOnWriteArrayList5.add(new BridgeInfo(copyOnWriteArrayList6.get(size2).mo69772a(), fVar3, false, copyOnWriteArrayList6.get(size2).mo69773b(), 4, null));
                                    }
                                } else if (!f50498h.contains(b2) || f50496f.get(size2).mo69773b() != null) {
                                    CopyOnWriteArrayList<BridgeTmpInfo> copyOnWriteArrayList7 = f50496f;
                                    copyOnWriteArrayList5.add(new BridgeInfo(copyOnWriteArrayList7.get(size2).mo69772a(), fVar3, false, copyOnWriteArrayList7.get(size2).mo69773b(), 4, null));
                                } else {
                                    concurrentHashMap3.remove(b2);
                                }
                            }
                        }
                    }
                    if (concurrentHashMap.containsKey(str) && BridgeRegistry.f50436a.mo69574a((List<BridgeInfo>) concurrentHashMap.get(str), lifecycle) != null) {
                        break;
                    }
                    size2--;
                }
                Unit unit2 = Unit.INSTANCE;
            }
        }
        if (concurrentHashMap.containsKey(str)) {
            BridgeInfo a6 = BridgeRegistry.f50436a.mo69574a((List<BridgeInfo>) concurrentHashMap.get(str), lifecycle);
            if (a6 != null) {
                fVar = a6.mo69769b();
            } else {
                fVar = null;
            }
            if (!(a6 == null || fVar == null || !a6.mo69770c())) {
                return a6;
            }
        }
        m75247b();
        return null;
    }

    /* renamed from: a */
    private final CopyOnWriteArrayList<BridgeTmpInfo> m75244a(Object obj, Object obj2, boolean z) {
        CopyOnWriteArrayList<BridgeTmpInfo> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        Iterator<Map.Entry<WeakReference<Object>, CopyOnWriteArrayList<BridgeTmpInfo>>> it = f50497g.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<WeakReference<Object>, CopyOnWriteArrayList<BridgeTmpInfo>> next = it.next();
            Object obj3 = next.getKey().get();
            if (obj3 == null) {
                it.remove();
            } else if (Intrinsics.areEqual(obj3, obj)) {
                copyOnWriteArrayList = next.getValue();
            }
        }
        if (z && obj2 != null) {
            copyOnWriteArrayList.add(new BridgeTmpInfo(obj2, false, null, 6, null));
            f50497g.put(new WeakReference<>(obj), copyOnWriteArrayList);
        }
        return copyOnWriteArrayList;
    }

    /* renamed from: b */
    public final BridgeResult mo69647b(String str, JsCallOriginInfo aVar, JsBridgeContext dVar, Lifecycle lifecycle) {
        long j;
        String str2;
        String str3;
        String str4;
        int i;
        BridgeResult bridgeResult;
        Intrinsics.checkParameterIsNotNull(str, "bridgeName");
        Intrinsics.checkParameterIsNotNull(aVar, "originInfo");
        Intrinsics.checkParameterIsNotNull(dVar, "bridgeContext");
        JSONObject b = aVar.mo69885d().mo69887b();
        long currentTimeMillis = System.currentTimeMillis();
        Object a = dVar.mo69665a();
        if (a == null) {
            a = dVar.mo69667b();
        }
        BridgeInfo a2 = mo69640a(str, a, lifecycle);
        String c = dVar.mo69668c();
        AbstractC20660a g = BridgeManager.f50421a.mo69560a().mo69550g();
        if (g != null) {
            g.mo69543a(dVar, str, c);
        }
        Activity d = dVar.mo69669d();
        if (a2 == null) {
            IJsBridgeMessageHandler b2 = JsBridgeManager.f50485a.mo69635b();
            if (b2 != null) {
                b2.mo69663a(str, b, dVar.mo69671f());
            }
            BridgeResult b3 = m75246b(str, aVar, dVar);
            if (b3 != null) {
                Boolean d2 = BridgeManager.f50421a.mo69560a().mo69547d();
                Intrinsics.checkExpressionValueIsNotNull(d2, "BridgeManager.bridgeConf…jsCallSuccessCostEnable()");
                if (d2.booleanValue()) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(str + "_js_callSync_success_time_cost", System.currentTimeMillis() - currentTimeMillis);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("jsCallSync", 0);
                    jSONObject2.put("bridge_name", str);
                    BridgeMonitor.f50418a.mo69559a(jSONObject2, jSONObject, new JSONObject());
                }
                return b3;
            }
            JSONObject jSONObject3 = new JSONObject();
            if (c != null) {
                jSONObject3.put("error_url", "webPageUrl =  " + c);
            }
            jSONObject3.put("error_msg", "js call error with method not found, bridgeName =  " + str);
            jSONObject3.put("bridge_name", str);
            jSONObject3.put("is_sync", 1);
            jSONObject3.put("error_code", 5);
            jSONObject3.put("event_type", "jsCallSync");
            jSONObject3.put("extra_params", BridgeMonitor.f50418a.mo69557a(str, b));
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("js_callSync_not_found_time_cost", System.currentTimeMillis() - currentTimeMillis);
            BridgeMonitor.f50418a.mo69558a(5, "jsCallSync", jSONObject4, jSONObject3, dVar);
            bridgeResult = BridgeResult.Companion.m75334b(BridgeResult.f50535a, null, null, 3, null);
            j = currentTimeMillis;
            str3 = "_js_callSync_success_time_cost";
            str2 = "BridgeManager.bridgeConf…jsCallSuccessCostEnable()";
            i = 5;
            str4 = "bridge_name";
        } else {
            str3 = "_js_callSync_success_time_cost";
            str2 = "BridgeManager.bridgeConf…jsCallSuccessCostEnable()";
            str4 = "bridge_name";
            BridgeRegistry hVar = BridgeRegistry.f50436a;
            C20667g[] d3 = a2.mo69769b().mo69565d();
            j = currentTimeMillis;
            Intrinsics.checkExpressionValueIsNotNull(d3, "bridgeInfo.birdgeMethodinfo.paramInfos");
            BridgeResult b4 = hVar.mo69578b(b, d3);
            if (b4 != null) {
                JSONObject jSONObject5 = new JSONObject();
                if (c != null) {
                    jSONObject5.put("error_url", "webPageUrl =  " + c);
                }
                if (d != null) {
                    jSONObject5.put("error_activity", "activity = " + d.getPackageName());
                }
                jSONObject5.put("error_msg", "js call error with no params, bridgeName =  " + str);
                jSONObject5.put(str4, str);
                jSONObject5.put("is_sync", 1);
                jSONObject5.put("error_code", 6);
                jSONObject5.put("event_type", "jsCallSync");
                jSONObject5.put("extra_params", BridgeMonitor.f50418a.mo69557a(str, b));
                JSONObject jSONObject6 = new JSONObject();
                jSONObject6.put("js_callSync_no_params_time_cost", System.currentTimeMillis() - j);
                BridgeMonitor.f50418a.mo69558a(6, "jsCallSync", jSONObject6, jSONObject5, dVar);
                bridgeResult = b4;
                i = 6;
            } else if (!"SYNC".equals(a2.mo69769b().mo69564c())) {
                JSONObject jSONObject7 = new JSONObject();
                if (c != null) {
                    jSONObject7.put("error_url", "webPageUrl =  " + c);
                }
                if (d != null) {
                    jSONObject7.put("error_activity", "activity = " + d.getPackageName());
                }
                jSONObject7.put("error_msg", "js callSync the method does not support synchronous calls, bridgeName =  " + str);
                jSONObject7.put(str4, str);
                jSONObject7.put("is_sync", 1);
                jSONObject7.put("error_code", 2);
                jSONObject7.put("event_type", "jsCallSync");
                jSONObject7.put("extra_params", BridgeMonitor.f50418a.mo69557a(str, b));
                JSONObject jSONObject8 = new JSONObject();
                jSONObject8.put("js_callSync_not_support_sync_time_cost", System.currentTimeMillis() - j);
                BridgeMonitor.f50418a.mo69558a(2, "jsCallSync", jSONObject8, jSONObject7, dVar);
                bridgeResult = BridgeResult.Companion.m75334b(BridgeResult.f50535a, "The method does not support synchronous calls", null, 2, null);
                i = 2;
            } else if (!mo69644a(dVar, a2.mo69769b())) {
                JSONObject jSONObject9 = new JSONObject();
                if (c != null) {
                    jSONObject9.put("error_url", "webPageUrl =  " + c);
                }
                if (d != null) {
                    jSONObject9.put("error_activity", "activity = " + d.getPackageName());
                }
                jSONObject9.put("error_msg", "js callSync error with no privilege, bridgeName =  " + str);
                jSONObject9.put(str4, str);
                jSONObject9.put("is_sync", 1);
                jSONObject9.put("error_code", 3);
                jSONObject9.put("event_type", "jsCallSync");
                jSONObject9.put("extra_params", BridgeMonitor.f50418a.mo69557a(str, b));
                JSONObject jSONObject10 = new JSONObject();
                jSONObject10.put("js_callSync_no_privilege_time_cost", System.currentTimeMillis() - j);
                BridgeMonitor.f50418a.mo69558a(3, "jsCallSync", jSONObject10, jSONObject9, dVar);
                bridgeResult = BridgeResult.Companion.m75335c(BridgeResult.f50535a, null, null, 3, null);
                i = 3;
            } else {
                bridgeResult = BridgeRegistry.f50436a.mo69572a(a2, b, dVar);
                if (bridgeResult == null) {
                    JSONObject jSONObject11 = new JSONObject();
                    if (c != null) {
                        jSONObject11.put("error_url", "webPageUrl =  " + c);
                    }
                    if (d != null) {
                        jSONObject11.put("error_activity", "activity = " + d.getPackageName());
                    }
                    jSONObject11.put("error_msg", "js callSync error with null, bridgeName =  " + str);
                    jSONObject11.put(str4, str);
                    jSONObject11.put("is_sync", 1);
                    jSONObject11.put("error_code", 4);
                    jSONObject11.put("event_type", "jsCallSync");
                    jSONObject11.put("extra_params", BridgeMonitor.f50418a.mo69557a(str, b));
                    JSONObject jSONObject12 = new JSONObject();
                    jSONObject12.put("js_callSync_null_time_cost", System.currentTimeMillis() - j);
                    BridgeMonitor.f50418a.mo69558a(4, "jsCallSync", jSONObject12, jSONObject11, dVar);
                    bridgeResult = BridgeResult.Companion.m75332a(BridgeResult.f50535a, "js callSync error with result null", (JSONObject) null, 2, (Object) null);
                    i = 4;
                } else {
                    i = 0;
                }
            }
        }
        Boolean d4 = BridgeManager.f50421a.mo69560a().mo69547d();
        Intrinsics.checkExpressionValueIsNotNull(d4, str2);
        if (d4.booleanValue()) {
            JSONObject jSONObject13 = new JSONObject();
            jSONObject13.put(str + str3, System.currentTimeMillis() - j);
            JSONObject jSONObject14 = new JSONObject();
            jSONObject14.put("jsCallSync", i);
            jSONObject14.put(str4, str);
            BridgeMonitor.f50418a.mo69559a(jSONObject14, jSONObject13, new JSONObject());
        }
        return bridgeResult;
    }

    /* renamed from: a */
    public static /* synthetic */ BridgeInfo m75239a(JsBridgeRegistry dVar, String str, Object obj, Lifecycle lifecycle, int i, Object obj2) {
        if ((i & 2) != 0) {
            obj = null;
        }
        if ((i & 4) != 0) {
            lifecycle = null;
        }
        return dVar.mo69640a(str, obj, lifecycle);
    }
}
