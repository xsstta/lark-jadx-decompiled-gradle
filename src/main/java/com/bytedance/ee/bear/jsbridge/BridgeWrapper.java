package com.bytedance.ee.bear.jsbridge;

import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.util.io.NonProguard;
import com.bytedance.ee.util.p704g.C13665a;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u000fH\u0016J$\u0010\u0010\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u0016\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0018"}, d2 = {"Lcom/bytedance/ee/bear/jsbridge/BridgeWrapper;", "Lcom/bytedance/ee/bear/jsbridge/IBridge;", "bridge", "Lcom/bytedance/ee/bear/jsbridge/Bridge;", "(Lcom/bytedance/ee/bear/jsbridge/Bridge;)V", "getBridge", "()Lcom/bytedance/ee/bear/jsbridge/Bridge;", "addBridgeMsgInterceptor", "", "interceptor", "Lcom/bytedance/ee/bear/jsbridge/BridgeMsgInterceptor;", "bindBridgeHandler", "handlerName", "", "handler", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "dispatchBridgeMsg", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "callBack", "Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", "removeBridgeMsgInterceptor", "unbindBridgeHandler", "Companion", "js-bridge_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.jsbridge.g */
public final class BridgeWrapper implements IBridge {

    /* renamed from: a */
    public static final Companion f21369a = new Companion(null);

    /* renamed from: b */
    private final C7939a f21370b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/jsbridge/BridgeWrapper$Companion;", "", "()V", "EXCE_JS_PREFIX", "", "js-bridge_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.jsbridge.g$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final C7939a mo30844a() {
        return this.f21370b;
    }

    public BridgeWrapper(C7939a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "bridge");
        this.f21370b = aVar;
    }

    @Override // com.bytedance.ee.bear.jsbridge.IBridge
    /* renamed from: a */
    public void mo19348a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "handlerName");
        this.f21370b.mo30831a(str);
    }

    @Override // com.bytedance.ee.bear.jsbridge.IBridge
    /* renamed from: a */
    public void mo19349a(String str, AbstractC7945d<?> dVar) {
        Intrinsics.checkParameterIsNotNull(str, "handlerName");
        Intrinsics.checkParameterIsNotNull(dVar, "handler");
        this.f21370b.mo30833a(str, (AbstractC7945d) dVar);
    }

    @Override // com.bytedance.ee.bear.jsbridge.IBridge
    /* renamed from: a */
    public void mo19350a(String str, Object obj, AbstractC7947h hVar) {
        Intrinsics.checkParameterIsNotNull(str, "handlerName");
        String str2 = "javascript:" + str;
        if (obj instanceof JSONObject) {
            this.f21370b.mo30835a(str2, obj.toString());
        } else if (obj instanceof String) {
            this.f21370b.mo30835a(str2, (String) obj);
        } else if (obj instanceof NonProguard) {
            this.f21370b.mo30835a(str2, C13665a.m55439a(obj));
        } else {
            this.f21370b.mo30835a(str2, "");
        }
    }
}
