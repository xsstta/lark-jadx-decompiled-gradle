package com.tt.miniapp.view.webcore;

import android.content.Context;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkwebview.service.AbstractC13470e;
import com.bytedance.ee.larkwebview.service.C13477l;
import com.tt.miniapp.util.VideoFullScreenHelper;
import com.tt.miniapp.view.webcore.AbstractC67282j;
import com.tt.miniapphost.p3371e.p3372a.C67500a;
import com.tt.miniapphost.p3371e.p3372a.C67501b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 (2\u00020\u0001:\u0001(B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J,\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0010\u0010\u0016\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0015J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\bJ\b\u0010\u001c\u001a\u00020\u0013H\u0002J\u0010\u0010\u001d\u001a\u00020\u00132\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fJ\u000e\u0010 \u001a\u00020\u00132\u0006\u0010!\u001a\u00020\bJ\u000e\u0010\"\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\bJ\u0006\u0010$\u001a\u00020\u0013J\u0010\u0010%\u001a\u00020\u00132\b\u0010&\u001a\u0004\u0018\u00010'R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R(\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b8F@FX\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/tt/miniapp/view/webcore/WebViewWrapper;", "", "mContext", "Landroid/content/Context;", "mIAppContext", "Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;", "(Landroid/content/Context;Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;)V", "isRenderInBrowserEnabled", "", "()Z", "videoFullScreenHelper", "Lcom/tt/miniapp/util/VideoFullScreenHelper;", "getVideoFullScreenHelper", "()Lcom/tt/miniapp/util/VideoFullScreenHelper;", "setVideoFullScreenHelper", "(Lcom/tt/miniapp/util/VideoFullScreenHelper;)V", "webView", "Lcom/tt/miniapp/view/webcore/NestLarkWebView;", "evaluateJavascript", "", "script", "", "resultCallback", "Landroid/webkit/ValueCallback;", "tag", "getWrappedWebView", "Landroid/webkit/WebView;", "hasDispatchDownEvent", "initWebView", "registerPlatformView", "view", "Landroid/view/View;", "setDisableDefaultPopMenu", "disableDefaultPopMenu", "setDisableScroll", "disableScroll", "setLayerType", "setScrollListener", "listener", "Lcom/tt/miniapp/view/webcore/WebListener$OnScrollListener;", "Companion", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.tt.miniapp.view.webcore.k */
public final class WebViewWrapper {

    /* renamed from: a */
    public static final Companion f169829a = new Companion(null);

    /* renamed from: b */
    private C67268f f169830b;

    /* renamed from: c */
    private final Context f169831c;

    /* renamed from: d */
    private final IAppContext f169832d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tt/miniapp/view/webcore/WebViewWrapper$Companion;", "", "()V", "TAG", "", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.tt.miniapp.view.webcore.k$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final WebView mo233948a() {
        C67268f fVar = this.f169830b;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
        }
        return fVar;
    }

    /* renamed from: b */
    public final void mo233953b() {
        C67268f fVar = this.f169830b;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
        }
        fVar.mo19616a();
    }

    /* renamed from: c */
    public final boolean mo233955c() {
        C67268f fVar = this.f169830b;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
        }
        return fVar.mo22336b();
    }

    /* renamed from: d */
    public final VideoFullScreenHelper mo233956d() {
        C67268f fVar = this.f169830b;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
        }
        return fVar.getVideoFullScreenHelper();
    }

    /* renamed from: e */
    public final boolean mo233957e() {
        C67268f fVar = this.f169830b;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
        }
        return fVar.f169796b;
    }

    /* renamed from: f */
    private final void m262141f() {
        AbstractC13470e eVar;
        AppBrandLogger.m52830i("WebViewWrapper", "init nestlarkwebview");
        new C67500a(C67501b.bs, this.f169832d).flush();
        C67268f fVar = new C67268f(this.f169831c, this.f169832d);
        this.f169830b = fVar;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
        }
        C13477l serviceManager = fVar.getServiceManager();
        if (serviceManager != null && (eVar = (AbstractC13470e) serviceManager.mo49931b(AbstractC13470e.class)) != null) {
            eVar.mo49909a();
        }
    }

    /* renamed from: a */
    public final void mo233949a(VideoFullScreenHelper videoFullScreenHelper) {
        C67268f fVar = this.f169830b;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
        }
        fVar.setVideoFullScreenHelper(videoFullScreenHelper);
    }

    /* renamed from: b */
    public final void mo233954b(boolean z) {
        C67268f fVar = this.f169830b;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
        }
        fVar.setDisableDefaultPopMenu(z);
    }

    /* renamed from: a */
    public final void mo233950a(AbstractC67282j.AbstractC67284b bVar) {
        C67268f fVar = this.f169830b;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
        }
        fVar.setScrollListener(bVar);
    }

    /* renamed from: a */
    public final void mo233952a(boolean z) {
        C67268f fVar = this.f169830b;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
        }
        fVar.setDisableScroll(z);
    }

    public WebViewWrapper(Context context, IAppContext iAppContext) {
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        Intrinsics.checkParameterIsNotNull(iAppContext, "mIAppContext");
        this.f169831c = context;
        this.f169832d = iAppContext;
        m262141f();
    }

    /* renamed from: a */
    public final void mo233951a(String str, ValueCallback<String> valueCallback, String str2) {
        C67268f fVar = this.f169830b;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
        }
        fVar.mo233903a(str, valueCallback, str2);
    }
}
