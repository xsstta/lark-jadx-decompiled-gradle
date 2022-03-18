package com.bytedance.sdk.bridge.lynx;

import com.bytedance.sdk.bridge.Logger;
import com.bytedance.sdk.bridge.js.spec.JsBridgeContext;
import com.bytedance.sdk.bridge.model.BridgeResult;
import com.google.firebase.messaging.Constants;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00182\u00020\u00012\u00020\u0002:\u0001\u0018B\u001f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bB1\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rJ\u0010\u0010\u000b\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\n\u0010\u0017\u001a\u0004\u0018\u00010\nH\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/bytedance/sdk/bridge/lynx/LynxBridgeContext;", "Lcom/bytedance/sdk/bridge/js/spec/JsBridgeContext;", "Lcom/bytedance/sdk/bridge/lynx/ILynxProviderBridgeContext;", "webview", "Lcom/bytedance/sdk/bridge/lynx/ILynxCellWebView;", "callbackId", "", "func", "(Lcom/bytedance/sdk/bridge/lynx/ILynxCellWebView;Ljava/lang/String;Ljava/lang/String;)V", "provider", "Lcom/bytedance/sdk/bridge/lynx/ILynxViewProvider;", "callback", "Lcom/lynx/react/bridge/Callback;", "(Lcom/bytedance/sdk/bridge/lynx/ILynxCellWebView;Ljava/lang/String;Ljava/lang/String;Lcom/bytedance/sdk/bridge/lynx/ILynxViewProvider;Lcom/lynx/react/bridge/Callback;)V", "getCallback", "()Lcom/lynx/react/bridge/Callback;", "setCallback", "(Lcom/lynx/react/bridge/Callback;)V", "getFunc", "()Ljava/lang/String;", "", "bridgeResult", "Lcom/bytedance/sdk/bridge/model/BridgeResult;", "getLynxViewProvider", "Companion", "lynx-bridge_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.sdk.bridge.lynx.f */
public final class LynxBridgeContext extends JsBridgeContext {

    /* renamed from: a */
    public static final Companion f50521a = new Companion(null);

    /* renamed from: b */
    private final ILynxCellWebView f50522b;

    /* renamed from: c */
    private final String f50523c;

    /* renamed from: d */
    private final ILynxViewProvider f50524d;

    /* renamed from: e */
    private Callback f50525e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/sdk/bridge/lynx/LynxBridgeContext$Companion;", "", "()V", "TAG", "", "lynx-bridge_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.sdk.bridge.lynx.f$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: g */
    public ILynxViewProvider mo69748g() {
        return this.f50524d;
    }

    @Override // com.bytedance.sdk.bridge.model.IBridgeContext, com.bytedance.sdk.bridge.js.spec.JsBridgeContext
    /* renamed from: a */
    public void mo69666a(BridgeResult bridgeResult) {
        Intrinsics.checkParameterIsNotNull(bridgeResult, "bridgeResult");
        Callback callback = this.f50525e;
        if (callback == null) {
            callback = this.f50522b.mo69742a();
        }
        if (callback != null) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            JSONObject c = bridgeResult.mo69758c();
            if (c != null) {
                javaOnlyMap.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, LynxBridgeConverter.m75312a(c));
            }
            JavaOnlyMap javaOnlyMap2 = javaOnlyMap;
            javaOnlyMap2.put("code", Integer.valueOf(bridgeResult.mo69753a()));
            javaOnlyMap2.put("message", bridgeResult.mo69757b());
            javaOnlyMap2.put("func", this.f50523c);
            javaOnlyMap2.put("callbackId", mo69671f());
            Logger.f50514b.mo69733a("LynxBridgeContext", "data = " + javaOnlyMap.get(Constants.ScionAnalytics.MessageType.DATA_MESSAGE));
            callback.invoke(javaOnlyMap);
        }
        Callback callback2 = null;
        this.f50525e = callback2;
        this.f50522b.mo69744a(callback2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LynxBridgeContext(ILynxCellWebView bVar, String str, String str2, ILynxViewProvider cVar, Callback callback) {
        super(bVar, str, null, 4, null);
        Intrinsics.checkParameterIsNotNull(bVar, "webview");
        Intrinsics.checkParameterIsNotNull(str, "callbackId");
        Intrinsics.checkParameterIsNotNull(str2, "func");
        this.f50522b = bVar;
        this.f50523c = str2;
        this.f50524d = cVar;
        this.f50525e = callback;
    }
}
