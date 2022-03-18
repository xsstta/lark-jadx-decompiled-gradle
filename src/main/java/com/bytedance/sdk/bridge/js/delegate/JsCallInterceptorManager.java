package com.bytedance.sdk.bridge.js.delegate;

import com.bytedance.sdk.bridge.js.spec.JsBridgeContext;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0005J \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u0011\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0005R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/bytedance/sdk/bridge/js/delegate/JsCallInterceptorManager;", "", "()V", "interceptors", "Ljava/util/concurrent/LinkedBlockingDeque;", "Lcom/bytedance/sdk/bridge/js/delegate/JsCallInterceptor;", "addInterceptor", "", "interceptor", "interceptJsRequest", "", "name", "", "params", "Lorg/json/JSONObject;", "context", "Lcom/bytedance/sdk/bridge/js/spec/JsBridgeContext;", "removeInterceptor", "js-bridge_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.sdk.bridge.js.a.f */
public final class JsCallInterceptorManager {

    /* renamed from: a */
    public static final JsCallInterceptorManager f50478a = new JsCallInterceptorManager();

    /* renamed from: b */
    private static final LinkedBlockingDeque<JsCallInterceptor> f50479b = new LinkedBlockingDeque<>();

    private JsCallInterceptorManager() {
    }

    /* renamed from: a */
    public final void mo69617a(JsCallInterceptor eVar) {
        if (eVar != null) {
            LinkedBlockingDeque<JsCallInterceptor> linkedBlockingDeque = f50479b;
            if (linkedBlockingDeque.contains(eVar)) {
                linkedBlockingDeque.remove(eVar);
            }
            linkedBlockingDeque.addFirst(eVar);
        }
    }

    /* renamed from: b */
    public final void mo69619b(JsCallInterceptor eVar) {
        if (eVar != null) {
            LinkedBlockingDeque<JsCallInterceptor> linkedBlockingDeque = f50479b;
            if (linkedBlockingDeque.contains(eVar)) {
                linkedBlockingDeque.remove(eVar);
            }
            eVar.mo69615c();
        }
    }

    /* renamed from: a */
    public final boolean mo69618a(String str, JSONObject jSONObject, JsBridgeContext dVar) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        Intrinsics.checkParameterIsNotNull(dVar, "context");
        Iterator<JsCallInterceptor> it = f50479b.iterator();
        while (it.hasNext()) {
            if (it.next().mo33968a(str, jSONObject, dVar)) {
                return true;
            }
        }
        return false;
    }
}
