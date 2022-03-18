package com.bytedance.ee.larkwebview.service.impl;

import android.webkit.WebView;
import com.bytedance.ee.larkwebview.base.LarkWebView;
import com.bytedance.ee.larkwebview.p677e.C13437a;
import com.bytedance.ee.larkwebview.quality.stable.BlankChecker;
import com.bytedance.ee.larkwebview.quality.stable.IStableListener;
import com.bytedance.ee.larkwebview.quality.stable.IStableService;
import com.bytedance.lynx.webview.extension.TTWebViewExtension;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u000f\u001a\u00020\fH\u0016J\n\u0010\u0010\u001a\u0004\u0018\u00010\bH\u0016J\u001c\u0010\u0011\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u001c\u0010\u0016\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006H\u0016J\u001c\u0010\u0019\u001a\u00020\u001a2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0012\u0010\u001d\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\bH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/bytedance/ee/larkwebview/service/impl/WebViewStableService;", "Lcom/bytedance/ee/larkwebview/quality/stable/IStableService;", "()V", "mBlankChecker", "Lcom/bytedance/ee/larkwebview/quality/stable/BlankChecker;", "mLarkWebView", "Lcom/bytedance/ee/larkwebview/base/LarkWebView;", "mStableListener", "Lcom/bytedance/ee/larkwebview/quality/stable/IStableListener;", "mTTWebViewExtension", "Lcom/bytedance/lynx/webview/extension/TTWebViewExtension;", "checkBlank", "", "result", "Lcom/bytedance/ee/larkwebview/quality/stable/IBlankCheckResult;", "detach", "getStableListener", "glOom", "view", "Landroid/webkit/WebView;", "info", "", "init", "extension", "larkWebView", "renderProcessGone", "", "detail", "Lcom/bytedance/ee/larkwebview/util/LarkRenderProcessGoneDetail;", "setStableListener", "listener", "Companion", "base_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.larkwebview.service.a.g */
public final class WebViewStableService implements IStableService {

    /* renamed from: a */
    public static final Companion f35517a = new Companion(null);

    /* renamed from: b */
    private LarkWebView f35518b;

    /* renamed from: c */
    private TTWebViewExtension f35519c;

    /* renamed from: d */
    private BlankChecker f35520d;

    /* renamed from: e */
    private final IStableListener f35521e;

    @Override // com.bytedance.ee.larkwebview.quality.stable.IStableService
    /* renamed from: a */
    public void mo49842a(IStableListener bVar) {
    }

    @Override // com.bytedance.ee.larkwebview.service.AbstractC13476k
    /* renamed from: a */
    public boolean mo49919a(WebView webView, C13437a aVar) {
        return false;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/larkwebview/service/impl/WebViewStableService$Companion;", "", "()V", "TAG", "", "base_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.larkwebview.service.a.g$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bytedance.ee.larkwebview.quality.stable.IStableService
    /* renamed from: a */
    public IStableListener mo49841a() {
        return this.f35521e;
    }

    @Override // com.bytedance.ee.larkwebview.quality.stable.IStableService
    /* renamed from: a */
    public void mo49843a(TTWebViewExtension tTWebViewExtension, LarkWebView larkWebView) {
        this.f35519c = tTWebViewExtension;
        this.f35518b = larkWebView;
        this.f35520d = new BlankChecker(tTWebViewExtension, larkWebView);
    }
}
