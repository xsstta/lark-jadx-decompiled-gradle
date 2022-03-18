package com.ss.android.lark.openapi.webcore;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import com.bytedance.lynx.webview.TTWebSdk;
import com.bytedance.lynx.webview.extension.TTWebViewExtension;
import com.bytedance.lynx.webview.glue.IWebViewExtension;
import com.bytedance.lynx.webview.glue.TTRenderProcessGoneDetail;
import com.ss.android.lark.jsbridge.BridgeWebView;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.openapi.webcore.p2398a.AbstractC48777a;
import com.ss.android.lark.openapi.webcore.p2398a.AbstractC48778b;
import com.ss.android.lark.openapi.webcore.p2398a.AbstractC48779c;

public class LarkWebView extends BridgeWebView {

    /* renamed from: f */
    private C48785c f122559f;

    /* renamed from: g */
    private C48786d f122560g;

    /* renamed from: h */
    private C48776a f122561h;

    /* renamed from: i */
    private OnViewScrollListener f122562i;

    /* renamed from: j */
    private AbstractC48777a f122563j;

    /* renamed from: k */
    private TTWebViewExtension f122564k;

    public interface OnViewScrollListener {

        public @interface ScrollDirection {
        }

        /* renamed from: a */
        void mo170379a(int i, int i2, int i3);

        /* renamed from: a */
        void mo170380a(int i, int i2, int i3, int i4);
    }

    public TTWebViewExtension getWebViewExtension() {
        return this.f122564k;
    }

    public String getUrl() {
        return super.getUrl();
    }

    /* renamed from: e */
    private void m192129e() {
        TTWebViewExtension tTWebViewExtension;
        if (TTWebSdk.isTTWebView() && (tTWebViewExtension = this.f122564k) != null) {
            tTWebViewExtension.setRenderProcessGoneListener((IWebViewExtension.RenderProcessGoneListener) new IWebViewExtension.RenderProcessGoneListener() {
                /* class com.ss.android.lark.openapi.webcore.$$Lambda$LarkWebView$mizg5Gml8PoWfIK9cftSfql8Zxw */

                @Override // com.bytedance.lynx.webview.glue.sdk112.IRenderProcessGoneListenersdk112
                public final boolean onRenderProcessGone(WebView webView, TTRenderProcessGoneDetail tTRenderProcessGoneDetail) {
                    return LarkWebView.lambda$mizg5Gml8PoWfIK9cftSfql8Zxw(LarkWebView.this, webView, tTRenderProcessGoneDetail);
                }
            });
        }
    }

    public boolean canGoBack() {
        AbstractC48777a aVar = this.f122563j;
        if (aVar == null) {
            return super.canGoBack();
        }
        if (!aVar.mo170384a(this) || !super.canGoBack()) {
            return false;
        }
        return true;
    }

    public boolean canGoForward() {
        AbstractC48777a aVar = this.f122563j;
        if (aVar == null) {
            return super.canGoForward();
        }
        if (!aVar.mo170386b(this) || !super.canGoForward()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:0|(1:2)|3|4|5|6|7|9) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0015 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void destroy() {
        /*
            r2 = this;
            r2.mo146771c()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L_0x000c
            r2.stopLoading()
        L_0x000c:
            android.view.ViewParent r0 = r2.getParent()     // Catch:{ Exception -> 0x0015 }
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0     // Catch:{ Exception -> 0x0015 }
            r0.removeView(r2)     // Catch:{ Exception -> 0x0015 }
        L_0x0015:
            r2.removeAllViews()     // Catch:{ Exception -> 0x0018 }
        L_0x0018:
            super.destroy()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.openapi.webcore.LarkWebView.destroy():void");
    }

    /* renamed from: d */
    private void m192128d() {
        C48776a aVar = new C48776a(getSettings());
        this.f122561h = aVar;
        aVar.mo170382a(this);
        C48786d dVar = new C48786d(this);
        this.f122560g = dVar;
        setWebViewClient(dVar);
        C48785c cVar = new C48785c(this);
        this.f122559f = cVar;
        setWebChromeClient(cVar);
        if (TTWebSdk.isTTWebView()) {
            this.f122564k = new TTWebViewExtension(this);
            m192129e();
        }
    }

    public String getUserBehaviorUrl() {
        String url = super.getUrl();
        C48786d dVar = this.f122560g;
        if (dVar != null) {
            String a = dVar.mo170466a();
            if (!TextUtils.isEmpty(a) && !TextUtils.equals(a, url)) {
                Log.m165397w("LarkWebView", "request url has been changed");
                return a;
            }
        }
        return super.getUrl();
    }

    public void setGoBackOrForwardInterceptor(AbstractC48777a aVar) {
        this.f122563j = aVar;
    }

    public void setOnViewScrollListener(OnViewScrollListener onViewScrollListener) {
        this.f122562i = onViewScrollListener;
    }

    public LarkWebView(Context context) {
        super(context);
        m192128d();
    }

    public void setLarkWebChromeClient(AbstractC48778b bVar) {
        this.f122559f.mo170440a(bVar);
    }

    public void setLarkWebViewClient(AbstractC48779c cVar) {
        this.f122560g.mo170467a(cVar);
    }

    public void setMixedContentMode(int i) {
        this.f122561h.mo170381a(i);
    }

    public boolean canGoBackOrForward(int i) {
        AbstractC48777a aVar = this.f122563j;
        if (aVar == null) {
            return super.canGoBackOrForward(i);
        }
        if (!aVar.mo170385a(this, i) || !super.canGoBackOrForward(i)) {
            return false;
        }
        return true;
    }

    public LarkWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m192128d();
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ boolean m192127a(WebView webView, final TTRenderProcessGoneDetail tTRenderProcessGoneDetail) {
        boolean a = this.f122560g.mo170468a(webView, tTRenderProcessGoneDetail);
        if (Build.VERSION.SDK_INT < 26) {
            return a;
        }
        if (this.f122560g.onRenderProcessGone(webView, new RenderProcessGoneDetail() {
            /* class com.ss.android.lark.openapi.webcore.LarkWebView.C487751 */

            public boolean didCrash() {
                TTRenderProcessGoneDetail tTRenderProcessGoneDetail = tTRenderProcessGoneDetail;
                if (tTRenderProcessGoneDetail == null) {
                    return false;
                }
                return tTRenderProcessGoneDetail.didCrash();
            }

            public int rendererPriorityAtExit() {
                TTRenderProcessGoneDetail tTRenderProcessGoneDetail = tTRenderProcessGoneDetail;
                if (tTRenderProcessGoneDetail == null) {
                    return 2;
                }
                return tTRenderProcessGoneDetail.rendererPriority();
            }
        }) || a) {
            return true;
        }
        return false;
    }

    public LarkWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m192128d();
    }

    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (this.f122562i != null) {
            if (i == i3) {
                int i5 = i2 - i4;
                if (Math.abs(i5) >= 3) {
                    if (i2 > i4) {
                        this.f122562i.mo170379a(Math.abs(i5), i2, 0);
                    } else if (i2 < i4) {
                        this.f122562i.mo170379a(Math.abs(i5), i2, 1);
                    }
                    this.f122562i.mo170380a(i, i2, i3, i4);
                }
            }
            if (i2 == i4 && Math.abs(i - i3) >= 3) {
                if (i > i3) {
                    this.f122562i.mo170379a(Math.abs(i2 - i4), i2, 2);
                } else if (i < i3) {
                    this.f122562i.mo170379a(Math.abs(i2 - i4), i2, 3);
                }
            }
            this.f122562i.mo170380a(i, i2, i3, i4);
        }
    }
}
