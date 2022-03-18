package com.ss.android.lark.integrator.p2020g;

import android.content.Context;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.bytedance.ee.webapp.AbstractC13794f;
import com.larksuite.component.webview.container.dto.C25838g;
import com.larksuite.component.webview.container.dto.IWebContainerContract;
import com.ss.android.lark.browser.impl.translate.AbstractC29952b;
import com.ss.android.lark.browser.impl.translate.WebTranslateHelper;
import com.ss.android.lark.integrator.p2020g.C39419b;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.integrator.g.b */
public class C39419b implements AbstractC13794f.AbstractC13801g {

    /* renamed from: a */
    private WebTranslateHelper f100770a;

    @Override // com.bytedance.ee.webapp.AbstractC13794f.AbstractC13801g
    /* renamed from: a */
    public void mo50862a(WebView webView, String str) {
        Log.m165389i("WebTranslateDependencyImpl", "page finish");
        WebTranslateHelper webTranslateHelper = this.f100770a;
        if (webTranslateHelper != null) {
            webTranslateHelper.mo107833a(webView, str);
        }
    }

    @Override // com.bytedance.ee.webapp.AbstractC13794f.AbstractC13801g
    /* renamed from: a */
    public void mo50863a(IWebContainerContract.IWebContainerView iWebContainerView, Context context) {
        C25838g a;
        WebTranslateHelper webTranslateHelper = this.f100770a;
        if (webTranslateHelper != null && (a = webTranslateHelper.mo107832a(context)) != null) {
            iWebContainerView.mo67308b().mo67317a(a);
        }
    }

    @Override // com.bytedance.ee.webapp.AbstractC13794f.AbstractC13801g
    /* renamed from: a */
    public void mo50864a(IWebContainerContract.IWebContainerView iWebContainerView, final WebView webView, Context context) {
        if (WebTranslateHelper.f74708c.mo107838a()) {
            ViewGroup f = iWebContainerView.mo67313f();
            if (f instanceof FrameLayout) {
                WebTranslateHelper webTranslateHelper = new WebTranslateHelper(new AbstractC29952b() {
                    /* class com.ss.android.lark.integrator.p2020g.C39419b.C394201 */

                    @Override // com.ss.android.lark.browser.impl.translate.AbstractC29952b
                    /* renamed from: a */
                    public /* synthetic */ void mo107580a(String str, String str2) {
                        AbstractC29952b.CC.$default$a(this, str, str2);
                    }

                    @Override // com.ss.android.lark.browser.impl.translate.AbstractC29952b
                    /* renamed from: a */
                    public String mo107578a() {
                        WebView webView = webView;
                        if (webView != null) {
                            return webView.getUrl();
                        }
                        return null;
                    }

                    @Override // com.ss.android.lark.browser.impl.translate.AbstractC29952b
                    /* renamed from: b */
                    public Context mo107581b() {
                        WebView webView = webView;
                        if (webView != null) {
                            return webView.getContext();
                        }
                        return null;
                    }

                    @Override // com.ss.android.lark.browser.impl.translate.AbstractC29952b
                    /* renamed from: a */
                    public void mo107579a(String str) {
                        WebView webView = webView;
                        if (webView != null) {
                            webView.post(new Runnable(webView, str) {
                                /* class com.ss.android.lark.integrator.p2020g.$$Lambda$b$1$LsukiC1WQrFXD4CLxPmKuZMaOls */
                                public final /* synthetic */ WebView f$0;
                                public final /* synthetic */ String f$1;

                                {
                                    this.f$0 = r1;
                                    this.f$1 = r2;
                                }

                                public final void run() {
                                    C39419b.C394201.lambda$LsukiC1WQrFXD4CLxPmKuZMaOls(this.f$0, this.f$1);
                                }
                            });
                        }
                    }
                });
                this.f100770a = webTranslateHelper;
                webTranslateHelper.mo107834a((FrameLayout) f);
                mo50863a(iWebContainerView, context);
            }
        }
    }
}
