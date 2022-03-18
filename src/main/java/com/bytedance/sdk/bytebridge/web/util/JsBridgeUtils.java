package com.bytedance.sdk.bytebridge.web.util;

import android.webkit.WebView;
import com.bytedance.sdk.bytebridge.base.utils.BridgeUtils;
import com.bytedance.sdk.bytebridge.web.context.IWebView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b¨\u0006\t"}, d2 = {"Lcom/bytedance/sdk/bytebridge/web/util/JsBridgeUtils;", "", "()V", "getUrlFromWebViewOrIWebView", "", "webView", "Landroid/webkit/WebView;", "iWebView", "Lcom/bytedance/sdk/bytebridge/web/context/IWebView;", "web_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.sdk.bytebridge.web.d.a */
public final class JsBridgeUtils {

    /* renamed from: a */
    public static final JsBridgeUtils f50645a = new JsBridgeUtils();

    private JsBridgeUtils() {
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.sdk.bytebridge.web.d.a$a */
    public static final class RunnableC20692a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Ref.ObjectRef f50646a;

        /* renamed from: b */
        final /* synthetic */ WebView f50647b;

        /* renamed from: c */
        final /* synthetic */ IWebView f50648c;

        /* renamed from: d */
        final /* synthetic */ Object f50649d;

        RunnableC20692a(Ref.ObjectRef objectRef, WebView webView, IWebView aVar, Object obj) {
            this.f50646a = objectRef;
            this.f50647b = webView;
            this.f50648c = aVar;
            this.f50649d = obj;
        }

        public final void run() {
            T t;
            Ref.ObjectRef objectRef = this.f50646a;
            WebView webView = this.f50647b;
            if (webView == null || (t = (T) webView.getUrl()) == null) {
                IWebView aVar = this.f50648c;
                t = aVar != null ? (T) aVar.mo69588b() : null;
            }
            objectRef.element = t;
            synchronized (this.f50649d) {
                this.f50649d.notify();
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    /* renamed from: a */
    public final String mo69878a(WebView webView, IWebView aVar) {
        String url;
        if (!BridgeUtils.f50598a.mo69820c()) {
            Object obj = new Object();
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = (T) null;
            BridgeUtils.f50598a.mo69819b().postAtFrontOfQueue(new RunnableC20692a(objectRef, webView, aVar, obj));
            synchronized (obj) {
                obj.wait(3000);
                Unit unit = Unit.INSTANCE;
            }
            return objectRef.element;
        } else if (webView != null && (url = webView.getUrl()) != null) {
            return url;
        } else {
            if (aVar != null) {
                return aVar.mo69588b();
            }
            return null;
        }
    }
}
