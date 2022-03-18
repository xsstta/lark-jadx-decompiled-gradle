package com.bytedance.sdk.bytebridge.web.context;

import android.webkit.WebView;
import com.bytedance.sdk.bytebridge.base.error.GeneralCallError;
import com.bytedance.sdk.bytebridge.base.monitor.OriginInfo;
import com.bytedance.sdk.bytebridge.base.result.BridgeSyncResult;
import com.bytedance.sdk.bytebridge.web.adapter.IFlutterWebViewInterceptorListener;
import com.bytedance.sdk.bytebridge.web.widget.JsCallOriginInfo;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016¨\u0006\f"}, d2 = {"Lcom/bytedance/sdk/bytebridge/web/context/JsCallContext;", "Lcom/bytedance/sdk/bytebridge/web/context/JsContext;", "originInfo", "Lcom/bytedance/sdk/bytebridge/web/widget/JsCallOriginInfo;", "iWebView", "Lcom/bytedance/sdk/bytebridge/web/context/IWebView;", "(Lcom/bytedance/sdk/bytebridge/web/widget/JsCallOriginInfo;Lcom/bytedance/sdk/bytebridge/web/context/IWebView;)V", "getCallbackHandler", "", "onMethodNotFound", "Lcom/bytedance/sdk/bytebridge/base/result/BridgeSyncResult;", "Companion", "web_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.sdk.bytebridge.web.c.b */
public class JsCallContext extends JsContext {

    /* renamed from: b */
    public static IFlutterWebViewInterceptorListener f50637b;

    /* renamed from: c */
    public static final Companion f50638c = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/bytedance/sdk/bytebridge/web/context/JsCallContext$Companion;", "", "()V", "flutterWebViewInterceptorListener", "Lcom/bytedance/sdk/bytebridge/web/adapter/IFlutterWebViewInterceptorListener;", "getFlutterWebViewInterceptorListener$web_release", "()Lcom/bytedance/sdk/bytebridge/web/adapter/IFlutterWebViewInterceptorListener;", "setFlutterWebViewInterceptorListener$web_release", "(Lcom/bytedance/sdk/bytebridge/web/adapter/IFlutterWebViewInterceptorListener;)V", "web_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.sdk.bytebridge.web.c.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bytedance.sdk.bytebridge.web.context.JsContext
    /* renamed from: k */
    public String mo69874k() {
        OriginInfo j = mo69797j();
        if (j != null) {
            return ((JsCallOriginInfo) j).mo69885d().mo69886a();
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.sdk.bytebridge.web.widget.JsCallOriginInfo");
    }

    @Override // com.bytedance.sdk.bytebridge.base.context.AbsBridgeContext
    /* renamed from: d */
    public BridgeSyncResult mo69791d() {
        BridgeSyncResult fVar;
        WebView a = mo69620a();
        if (a != null) {
            IFlutterWebViewInterceptorListener bVar = f50637b;
            if (bVar == null) {
                fVar = null;
            } else if (!bVar.mo69863a() || !bVar.mo69864a(a)) {
                fVar = BridgeSyncResult.Companion.m75435a(BridgeSyncResult.f50625b, GeneralCallError.BRIDGE_NOT_FOUND, null, null, 6, null);
            } else {
                bVar.mo69862a(this);
                fVar = BridgeSyncResult.f50625b.mo69857a();
            }
            if (fVar != null) {
                return fVar;
            }
        }
        return BridgeSyncResult.Companion.m75435a(BridgeSyncResult.f50625b, GeneralCallError.BRIDGE_NOT_FOUND, null, null, 6, null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JsCallContext(JsCallOriginInfo aVar, IWebView aVar2) {
        super(aVar, aVar2, null, null, 12, null);
        Intrinsics.checkParameterIsNotNull(aVar, "originInfo");
        Intrinsics.checkParameterIsNotNull(aVar2, "iWebView");
    }
}
