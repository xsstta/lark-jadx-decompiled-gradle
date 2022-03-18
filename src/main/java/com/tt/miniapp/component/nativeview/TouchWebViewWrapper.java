package com.tt.miniapp.component.nativeview;

import android.content.Context;
import android.webkit.WebView;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.tt.miniapphost.p3371e.p3372a.C67500a;
import com.tt.miniapphost.p3371e.p3372a.C67501b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\t\u001a\u00020\nJ\b\u0010\u000b\u001a\u0004\u0018\u00010\bJ\b\u0010\f\u001a\u00020\rH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/tt/miniapp/component/nativeview/TouchWebViewWrapper;", "", "mContext", "Landroid/content/Context;", "mAppContext", "Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;", "(Landroid/content/Context;Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;)V", "webView", "Landroid/webkit/WebView;", "getScreenTouchY", "", "getWrappedWebView", "initWebView", "", "Companion", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.tt.miniapp.component.nativeview.i */
public final class TouchWebViewWrapper {

    /* renamed from: a */
    public static final Companion f166260a = new Companion(null);

    /* renamed from: b */
    private WebView f166261b;

    /* renamed from: c */
    private final Context f166262c;

    /* renamed from: d */
    private final IAppContext f166263d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tt/miniapp/component/nativeview/TouchWebViewWrapper$Companion;", "", "()V", "TAG", "", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.tt.miniapp.component.nativeview.i$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final WebView mo230762a() {
        WebView webView = this.f166261b;
        if (webView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
        }
        return webView;
    }

    /* renamed from: b */
    public final float mo230763b() {
        WebView webView = this.f166261b;
        if (webView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
        }
        LarkTouchWebView larkTouchWebView = (LarkTouchWebView) webView;
        if (larkTouchWebView != null) {
            return larkTouchWebView.getScreenTouchY();
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    /* renamed from: c */
    private final void m258155c() {
        AppBrandLogger.m52830i("WebViewWrapper", "touchwrapper init larktouchWebView");
        new C67500a(C67501b.bu, this.f166263d).flush();
        this.f166261b = new LarkTouchWebView(this.f166262c, this.f166263d);
    }

    public TouchWebViewWrapper(Context context, IAppContext iAppContext) {
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        this.f166262c = context;
        this.f166263d = iAppContext;
        m258155c();
    }
}
