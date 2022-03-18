package com.ss.android.lark.live.webview;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import com.bytedance.ee.larkwebview.base.LarkWebView;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.live.C41506c;
import com.ss.android.lark.live.LiveStateHolder;
import com.ss.android.lark.live.model.VCLiveData;
import com.ss.android.lark.live.p2133a.C41488a;
import com.ss.android.lark.live.p2140c.C41510b;
import com.ss.android.lark.live.webview.bridgev2.C41535c;
import com.ss.android.lark.live.webview.bridgev2.NativeCallWebHelper;
import com.ss.android.lark.live.webview.bridgev2.VcLiveBridgeHandlerV2;
import com.ss.android.lark.live.webview.bridgev2.entity.CallNativeData;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.module.minifloatwindow.C46509b;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.utils.C57824f;

public class VcWebViewAdapter {

    /* renamed from: a */
    public final C41535c f105568a;

    /* renamed from: b */
    public boolean f105569b;

    /* renamed from: c */
    public Runnable f105570c;

    /* renamed from: d */
    public Runnable f105571d;

    /* renamed from: e */
    private final LarkWebView f105572e;

    /* renamed from: f */
    private final NativeCallWebHelper f105573f;

    /* renamed from: g */
    private final C41506c f105574g;

    public enum DisplayMode {
        MINI,
        NORMAL
    }

    /* renamed from: b */
    public WebView mo149433b() {
        return this.f105572e;
    }

    /* renamed from: c */
    public C41535c mo149435c() {
        return this.f105568a;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m164805g() {
        Runnable runnable = this.f105571d;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: a */
    public boolean mo149432a() {
        return this.f105574g.mo149377a();
    }

    /* renamed from: e */
    public void mo149437e() {
        this.f105574g.mo149378b();
    }

    /* renamed from: d */
    public boolean mo149436d() {
        if (this.f105572e.isAttachedToWindow()) {
            return this.f105568a.f105597c;
        }
        return this.f105569b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.live.webview.VcWebViewAdapter$4 */
    public static /* synthetic */ class C415304 {

        /* renamed from: a */
        static final /* synthetic */ int[] f105579a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.ss.android.lark.live.webview.VcWebViewAdapter$DisplayMode[] r0 = com.ss.android.lark.live.webview.VcWebViewAdapter.DisplayMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.live.webview.VcWebViewAdapter.C415304.f105579a = r0
                com.ss.android.lark.live.webview.VcWebViewAdapter$DisplayMode r1 = com.ss.android.lark.live.webview.VcWebViewAdapter.DisplayMode.MINI     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.live.webview.VcWebViewAdapter.C415304.f105579a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.live.webview.VcWebViewAdapter$DisplayMode r1 = com.ss.android.lark.live.webview.VcWebViewAdapter.DisplayMode.NORMAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.live.webview.VcWebViewAdapter.C415304.<clinit>():void");
        }
    }

    /* renamed from: f */
    public void mo149438f() {
        C41506c cVar = this.f105574g;
        if (cVar != null) {
            cVar.mo149378b();
        }
        this.f105570c = null;
        this.f105571d = null;
        LarkWebView larkWebView = this.f105572e;
        if (larkWebView != null) {
            ViewParent parent = larkWebView.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f105572e);
            }
            this.f105572e.stopLoading();
            this.f105572e.getSettings().setJavaScriptEnabled(false);
            this.f105572e.clearHistory();
            this.f105572e.clearView();
            this.f105572e.removeAllViews();
            this.f105572e.destroy();
        }
        C45855f.m181663b("WebViewAdapter", "[onDestroy]");
    }

    /* renamed from: a */
    public void mo149431a(Runnable runnable) {
        this.f105570c = runnable;
    }

    /* renamed from: b */
    public void mo149434b(Runnable runnable) {
        this.f105571d = runnable;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m164802a(View view) {
        C41510b.m164739a("back_to_live_page");
        C41488a.m164623a().mo149316a(view.getContext(), this.f105572e.getUrl(), 1);
    }

    /* renamed from: a */
    private void m164803a(WebView webView) {
        String str;
        if (DesktopUtil.m144301a(C45899c.m181859a().getContextDepend().mo144557a())) {
            str = DesktopUtil.m144296a();
        } else {
            str = m164804b(webView);
        }
        webView.getSettings().setUserAgentString(str);
    }

    /* renamed from: b */
    private String m164804b(WebView webView) {
        String a = C57824f.m224460a(C45899c.m181859a().getContextDepend().mo144557a(), webView.getSettings().getUserAgentString(), C45899c.m181859a().getLanguageDependency().mo144666b());
        return a + " ChannelName/" + "Feishu";
    }

    /* renamed from: a */
    public void mo149429a(DisplayMode displayMode) {
        int i = C415304.f105579a[displayMode.ordinal()];
        if (i == 1) {
            this.f105573f.mo149444a(NativeCallWebHelper.ContainerMode.Mini);
            C41488a.m164623a().mo149317a(LiveStateHolder.DisplayMode.FLOATVIEW);
        } else if (i == 2) {
            this.f105573f.mo149444a(NativeCallWebHelper.ContainerMode.Normal);
            C41488a.m164623a().mo149317a(LiveStateHolder.DisplayMode.ACTIVITY);
        }
    }

    /* renamed from: a */
    public void mo149430a(final C46509b.AbstractC46515a aVar) {
        C45855f.m181664c("WebViewAdapter", "[showFloatView] enter");
        this.f105574g.mo149375a(new C46509b.AbstractC46515a() {
            /* class com.ss.android.lark.live.webview.VcWebViewAdapter.C415293 */

            @Override // com.ss.android.lark.mm.module.minifloatwindow.C46509b.AbstractC46515a
            /* renamed from: a */
            public /* synthetic */ void mo149313a(boolean z) {
                C46509b.AbstractC46515a.CC.$default$a(this, z);
            }

            @Override // com.ss.android.lark.mm.module.minifloatwindow.C46509b.AbstractC46515a
            /* renamed from: a */
            public void mo149312a() {
                C45855f.m181664c("WebViewAdapter", "[onForcedToDismiss] live float window is forced to dismiss");
                if (VcWebViewAdapter.this.f105571d != null) {
                    VcWebViewAdapter.this.f105571d.run();
                }
            }

            @Override // com.ss.android.lark.mm.module.minifloatwindow.C46509b.AbstractC46515a
            public void onCreatedResultCallBack(boolean z) {
                if (z) {
                    VcWebViewAdapter.this.mo149429a(DisplayMode.MINI);
                }
                aVar.onCreatedResultCallBack(z);
            }
        });
    }

    public VcWebViewAdapter(Activity activity, LarkWebView larkWebView) {
        this.f105572e = larkWebView;
        larkWebView.getSettings().setMediaPlaybackRequiresUserGesture(false);
        larkWebView.getSettings().setMixedContentMode(0);
        this.f105573f = new NativeCallWebHelper(larkWebView);
        C415271 r3 = new C41535c(new VCLiveData()) {
            /* class com.ss.android.lark.live.webview.VcWebViewAdapter.C415271 */

            @Override // com.ss.android.lark.live.webview.bridgev2.C41535c, com.ss.android.lark.live.webview.bridgev2.VcLiveBridgeHandlerV2.IStateTracker
            /* renamed from: a */
            public void mo149439a(CallNativeData callNativeData) {
                super.mo149439a(callNativeData);
                if (this.f105596b.f105551g == VCLiveData.LivePlayerState.END && VcWebViewAdapter.this.f105570c != null) {
                    VcWebViewAdapter.this.f105570c.run();
                }
            }
        };
        this.f105568a = r3;
        larkWebView.getBridge().mo49770a("lark_vc_live_bridge", new VcLiveBridgeHandlerV2(r3));
        m164803a((WebView) larkWebView);
        C41506c cVar = new C41506c(larkWebView);
        this.f105574g = cVar;
        larkWebView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            /* class com.ss.android.lark.live.webview.VcWebViewAdapter.View$OnAttachStateChangeListenerC415282 */

            public void onViewAttachedToWindow(View view) {
                VcWebViewAdapter.this.f105569b = false;
            }

            public void onViewDetachedFromWindow(View view) {
                VcWebViewAdapter vcWebViewAdapter = VcWebViewAdapter.this;
                vcWebViewAdapter.f105569b = vcWebViewAdapter.f105568a.f105597c;
            }
        });
        cVar.mo149374a(new View.OnClickListener() {
            /* class com.ss.android.lark.live.webview.$$Lambda$VcWebViewAdapter$vRoRG0IWLDALkLzvBQre6_Evto */

            public final void onClick(View view) {
                VcWebViewAdapter.this.m164802a((VcWebViewAdapter) view);
            }
        });
        cVar.mo149376a(new Runnable() {
            /* class com.ss.android.lark.live.webview.$$Lambda$VcWebViewAdapter$L4b1U3o3InusohoZWGOs2zdoRNo */

            public final void run() {
                VcWebViewAdapter.this.m164805g();
            }
        });
    }
}
