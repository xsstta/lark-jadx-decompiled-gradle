package com.bytedance.ee.bear.browser.bridge;

import android.webkit.ValueCallback;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.browser.AbstractC4931i;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.jsbridge.IBridge;
import com.bytedance.ee.util.io.NonProguard;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u001c\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00072\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0015H\u0016J$\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0007H\u0016R4\u0010\u0005\u001a\u001c\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/bytedance/ee/bear/browser/bridge/JSBridge;", "Lcom/bytedance/ee/bear/jsbridge/IBridge;", "web", "Lcom/bytedance/ee/bear/browser/Web;", "(Lcom/bytedance/ee/bear/browser/Web;)V", "safeJSExecutor", "Lkotlin/Function3;", "", "", "Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", "", "getSafeJSExecutor", "()Lkotlin/jvm/functions/Function3;", "setSafeJSExecutor", "(Lkotlin/jvm/functions/Function3;)V", "addBridgeMsgInterceptor", "interceptor", "Lcom/bytedance/ee/bear/jsbridge/BridgeMsgInterceptor;", "bindBridgeHandler", "handlerName", "handler", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "dispatchBridgeMsg", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "callBack", "removeBridgeMsgInterceptor", "unbindBridgeHandler", "Companion", "browser-core_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.browser.a.a */
public final class JSBridge implements IBridge {

    /* renamed from: a */
    public static final Companion f14470a = new Companion(null);

    /* renamed from: b */
    private Function3<? super String, Object, ? super AbstractC7947h, Unit> f14471b;

    /* renamed from: c */
    private final AbstractC4931i f14472c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/browser/bridge/JSBridge$Companion;", "", "()V", "EXCE_JS_PREFIX", "", "browser-core_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.browser.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo19351a(Function3<? super String, Object, ? super AbstractC7947h, Unit> oVar) {
        this.f14471b = oVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onReceiveValue"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.browser.a.a$b */
    static final class C4919b<T> implements ValueCallback<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC7947h f14473a;

        C4919b(AbstractC7947h hVar) {
            this.f14473a = hVar;
        }

        /* renamed from: a */
        public final void onReceiveValue(String str) {
            AbstractC7947h hVar = this.f14473a;
            if (hVar != null) {
                hVar.mo17190a(str);
            }
        }
    }

    public JSBridge(AbstractC4931i iVar) {
        Intrinsics.checkParameterIsNotNull(iVar, "web");
        this.f14472c = iVar;
    }

    @Override // com.bytedance.ee.bear.jsbridge.IBridge
    /* renamed from: a */
    public void mo19348a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "handlerName");
        this.f14472c.mo19441c(str);
    }

    @Override // com.bytedance.ee.bear.jsbridge.IBridge
    /* renamed from: a */
    public void mo19349a(String str, AbstractC7945d<?> dVar) {
        Intrinsics.checkParameterIsNotNull(str, "handlerName");
        Intrinsics.checkParameterIsNotNull(dVar, "handler");
        this.f14472c.mo19431a(str, (AbstractC7945d) dVar);
    }

    @Override // com.bytedance.ee.bear.jsbridge.IBridge
    /* renamed from: a */
    public void mo19350a(String str, Object obj, AbstractC7947h hVar) {
        Function3<? super String, Object, ? super AbstractC7947h, Unit> oVar;
        Intrinsics.checkParameterIsNotNull(str, "handlerName");
        String str2 = "javascript:" + str;
        if ((obj instanceof JSONObject) || obj == null) {
            AbstractC4931i iVar = this.f14472c;
            if (obj != null) {
                iVar.mo19429a(str2, (JSONObject) obj, new C4919b(hVar));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
        }
        boolean z = obj instanceof NonProguard;
        if (z && hVar == null) {
            this.f14472c.mo19434a(str2, (NonProguard) obj, (ValueCallback<String>) null);
        } else if (z && hVar != null && (oVar = this.f14471b) != null) {
            oVar.invoke(str2, obj, hVar);
        }
    }
}
