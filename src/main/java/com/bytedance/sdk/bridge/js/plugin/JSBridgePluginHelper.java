package com.bytedance.sdk.bridge.js.plugin;

import android.graphics.Bitmap;
import android.webkit.WebView;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\r"}, d2 = {"Lcom/bytedance/sdk/bridge/js/plugin/JSBridgePluginHelper;", "", "()V", "iterateOnPageStarted", "", "view", "Landroid/webkit/WebView;", "url", "", "favicon", "Landroid/graphics/Bitmap;", "iterateshouldOverrideUrlLoading", "", "js-bridge_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.sdk.bridge.js.b.a */
public final class JSBridgePluginHelper {

    /* renamed from: a */
    public static final JSBridgePluginHelper f50481a = new JSBridgePluginHelper();

    private JSBridgePluginHelper() {
    }

    /* renamed from: a */
    public final boolean mo69623a(WebView webView, String str) {
        Intrinsics.checkParameterIsNotNull(webView, "view");
        Intrinsics.checkParameterIsNotNull(str, "url");
        if (!JSBridgePluginManager.f50482a.mo69624a()) {
            return false;
        }
        Iterator<T> it = JSBridgePluginManager.f50482a.mo69625b().iterator();
        while (true) {
            boolean z = false;
            while (true) {
                if (!it.hasNext()) {
                    return z;
                }
                T next = it.next();
                if (z || next.mo69627a(webView, str)) {
                    z = true;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo69622a(WebView webView, String str, Bitmap bitmap) {
        if (JSBridgePluginManager.f50482a.mo69624a()) {
            Iterator<T> it = JSBridgePluginManager.f50482a.mo69625b().iterator();
            while (it.hasNext()) {
                it.next().mo69626a(webView, str, bitmap);
            }
        }
    }
}
