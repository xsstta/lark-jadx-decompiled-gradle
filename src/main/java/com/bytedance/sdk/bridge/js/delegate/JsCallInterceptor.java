package com.bytedance.sdk.bridge.js.delegate;

import android.text.TextUtils;
import com.bytedance.sdk.bridge.js.JsBridgeRegistry;
import com.bytedance.sdk.bridge.js.spec.JsBridgeContext;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0006H\u0016J\b\u0010\u0011\u001a\u00020\u000fH\u0016R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/bytedance/sdk/bridge/js/delegate/JsCallInterceptor;", "", "()V", "jsInfo", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/bytedance/sdk/bridge/js/delegate/JsCallHandler;", "intercept", "", "name", "params", "Lorg/json/JSONObject;", "context", "Lcom/bytedance/sdk/bridge/js/spec/JsBridgeContext;", "registerJsHandler", "", "handler", "release", "js-bridge_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.sdk.bridge.js.a.e */
public class JsCallInterceptor {

    /* renamed from: b */
    public final ConcurrentHashMap<String, JsCallHandler> f50473b = new ConcurrentHashMap<>();

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.sdk.bridge.js.a.e$a */
    public static final class RunnableC20671a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ JsCallInterceptor f50474a;

        /* renamed from: b */
        final /* synthetic */ String f50475b;

        /* renamed from: c */
        final /* synthetic */ JSONObject f50476c;

        /* renamed from: d */
        final /* synthetic */ JsBridgeContext f50477d;

        RunnableC20671a(JsCallInterceptor eVar, String str, JSONObject jSONObject, JsBridgeContext dVar) {
            this.f50474a = eVar;
            this.f50475b = str;
            this.f50476c = jSONObject;
            this.f50477d = dVar;
        }

        public final void run() {
            JsCallHandler dVar = this.f50474a.f50473b.get(this.f50475b);
            if (dVar != null) {
                dVar.mo33971a(this.f50476c, this.f50477d);
            }
        }
    }

    /* renamed from: c */
    public void mo69615c() {
        Enumeration<JsCallHandler> elements = this.f50473b.elements();
        Intrinsics.checkExpressionValueIsNotNull(elements, "jsInfo.elements()");
        Iterator it = CollectionsKt.iterator(elements);
        while (it.hasNext()) {
            ((JsCallHandler) it.next()).mo33970a();
        }
        this.f50473b.clear();
    }

    /* renamed from: a */
    public void mo69614a(String str, JsCallHandler dVar) {
        JsCallHandler dVar2;
        Intrinsics.checkParameterIsNotNull(str, "name");
        Intrinsics.checkParameterIsNotNull(dVar, "handler");
        if (!TextUtils.isEmpty(str)) {
            if (!(this.f50473b.get(str) == null || (dVar2 = this.f50473b.get(str)) == null)) {
                dVar2.mo33970a();
            }
            this.f50473b.put(str, dVar);
        }
    }

    /* renamed from: a */
    public boolean mo33968a(String str, JSONObject jSONObject, JsBridgeContext dVar) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        Intrinsics.checkParameterIsNotNull(dVar, "context");
        if (TextUtils.isEmpty(str) || this.f50473b.get(str) == null) {
            return false;
        }
        JsBridgeRegistry.f50491a.mo69639a().post(new RunnableC20671a(this, str, jSONObject, dVar));
        return true;
    }
}
