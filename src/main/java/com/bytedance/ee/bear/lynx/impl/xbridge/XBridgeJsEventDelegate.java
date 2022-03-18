package com.bytedance.ee.bear.lynx.impl.xbridge;

import android.view.View;
import android.webkit.WebView;
import com.bytedance.ies.xbridge.XBridgeMethod;
import com.bytedance.ies.xbridge.XReadableMap;
import com.bytedance.sdk.bridge.js.spec.JsbridgeEventHelper;
import com.google.firebase.messaging.Constants;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.tasm.LynxView;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J\u0012\u0010\f\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J\u001a\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u000bH\u0016R\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00030\u00030\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/bytedance/ee/bear/lynx/impl/xbridge/XBridgeJsEventDelegate;", "Lcom/bytedance/ies/xbridge/XBridgeMethod$JsEventDelegate;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "viewRef", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "convert2Json", "Lorg/json/JSONObject;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/bytedance/ies/xbridge/XReadableMap;", "convert2LynxMap", "Lcom/lynx/react/bridge/JavaOnlyArray;", "sendJsEvent", "", "eventName", "", "params", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.lynx.impl.xbridge.c */
public final class XBridgeJsEventDelegate implements XBridgeMethod.JsEventDelegate {

    /* renamed from: a */
    private final WeakReference<View> f23805a;

    public XBridgeJsEventDelegate(View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f23805a = new WeakReference<>(view);
    }

    /* renamed from: b */
    private final JavaOnlyArray m37091b(XReadableMap hVar) {
        if (hVar == null) {
            return new JavaOnlyArray();
        }
        JavaOnlyArray from = JavaOnlyArray.from(CollectionsKt.toList(hVar.mo53102b().values()));
        Intrinsics.checkExpressionValueIsNotNull(from, "res");
        return from;
    }

    /* renamed from: a */
    private final JSONObject m37090a(XReadableMap hVar) {
        if (hVar == null) {
            return new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, Object> entry : hVar.mo53102b().entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
        return jSONObject;
    }

    @Override // com.bytedance.ies.xbridge.XBridgeMethod.JsEventDelegate
    /* renamed from: a */
    public void mo33965a(String str, XReadableMap hVar) {
        Intrinsics.checkParameterIsNotNull(str, "eventName");
        if (this.f23805a.get() != null) {
            View view = this.f23805a.get();
            if (view instanceof WebView) {
                JsbridgeEventHelper.f50506a.mo69658a(str, m37090a(hVar), (WebView) view);
            } else if (view instanceof LynxView) {
                ((LynxView) view).sendGlobalEvent(str, m37091b(hVar));
            }
        }
    }
}
