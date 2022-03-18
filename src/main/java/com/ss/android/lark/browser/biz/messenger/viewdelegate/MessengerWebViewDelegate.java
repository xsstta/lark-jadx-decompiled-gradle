package com.ss.android.lark.browser.biz.messenger.viewdelegate;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;
import android.webkit.ClientCertRequest;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.larksuite.component.webview.container.dto.AbstractInjectWebViewDelegate;
import com.larksuite.component.webview.container.dto.C25838g;
import com.larksuite.component.webview.container.impl.p1170a.C25840a;
import com.ss.android.lark.biz.core.api.UrlParams;
import com.ss.android.lark.browser.C29638a;
import com.ss.android.lark.browser.biz.messenger.C29773b;
import com.ss.android.lark.browser.biz.messenger.ShareItemHelper;
import com.ss.android.lark.browser.biz.p1413a.C29642a;
import com.ss.android.lark.browser.dependency.IBrowserModuleDependency;
import com.ss.android.lark.browser.impl.C29927b;
import com.ss.android.lark.browser.impl.C29939f;
import com.ss.android.lark.browser.impl.translate.AbstractC29952b;
import com.ss.android.lark.browser.impl.translate.WebTranslateHelper;
import com.ss.android.lark.browser.p1411a.C29639e;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.openapi.jsapi.AbstractC48762d;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;

public class MessengerWebViewDelegate extends AbstractInjectWebViewDelegate {
    public static final Parcelable.Creator<MessengerWebViewDelegate> CREATOR = new Parcelable.Creator<MessengerWebViewDelegate>() {
        /* class com.ss.android.lark.browser.biz.messenger.viewdelegate.MessengerWebViewDelegate.C298762 */

        /* renamed from: a */
        public MessengerWebViewDelegate[] newArray(int i) {
            return new MessengerWebViewDelegate[i];
        }

        /* renamed from: a */
        public MessengerWebViewDelegate createFromParcel(Parcel parcel) {
            return new MessengerWebViewDelegate(parcel);
        }
    };

    /* renamed from: a */
    private boolean f74608a;

    /* renamed from: b */
    private WebTranslateHelper f74609b;

    /* renamed from: c */
    private PrivateKey f74610c;

    /* renamed from: d */
    private X509Certificate[] f74611d;

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectWebViewDelegate
    public int describeContents() {
        return 0;
    }

    public MessengerWebViewDelegate() {
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectWebViewDelegate
    /* renamed from: k */
    public boolean mo51013k() {
        return C29939f.m110697a().mo107815b();
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectWebViewDelegate
    /* renamed from: m */
    public AbstractC48762d mo51015m() {
        if (C29638a.m109622a().isFeatureGatingEnable("lark.h5.jsapi.permission.check")) {
            return new C29642a();
        }
        return new C25840a();
    }

    protected MessengerWebViewDelegate(Parcel parcel) {
        super(parcel);
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectWebViewDelegate, com.larksuite.component.webview.container.dto.IWebContainerContract.IWebContainerView.AbstractC25824a
    /* renamed from: b */
    public boolean mo50998b(String str) {
        return C29639e.m109680a(str);
    }

    /* access modifiers changed from: private */
    @Override // com.larksuite.component.webview.container.dto.AbstractInjectWebViewDelegate
    /* renamed from: b */
    public /* synthetic */ void m110453b(AbstractInjectWebViewDelegate.AbstractC25823a aVar) {
        C29939f.m110697a().mo107812a(mo91997u());
        C29939f.m110697a().mo107813a(new Runnable() {
            /* class com.ss.android.lark.browser.biz.messenger.viewdelegate.$$Lambda$MessengerWebViewDelegate$xHYnWb13fz7epdStFlqDXk6gU6k */

            public final void run() {
                AbstractInjectWebViewDelegate.AbstractC25823a.this.proceed();
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo107184c(Fragment fragment) {
        mo91999w().mo67308b().mo67318a(ShareItemHelper.f74495a.mo107263a(fragment, new IBrowserModuleDependency.AbstractC29897m(fragment, mo91999w().mo67314g(), mo91999w().mo67313f()) {
            /* class com.ss.android.lark.browser.biz.messenger.viewdelegate.$$Lambda$MessengerWebViewDelegate$Fz6C3rLbmtgLJU4LZ1XC5KK_c */
            public final /* synthetic */ Fragment f$1;
            public final /* synthetic */ WebView f$2;
            public final /* synthetic */ ViewGroup f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.AbstractC29897m
            public final void itemClicked(int i) {
                MessengerWebViewDelegate.this.m110452a((MessengerWebViewDelegate) this.f$1, (Fragment) this.f$2, (WebView) this.f$3, (ViewGroup) i);
            }
        }), 0);
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectWebViewDelegate
    /* renamed from: a */
    public void mo50979a(Fragment fragment) {
        C29939f.m110697a().mo107814b(mo91997u());
        Bundle arguments = fragment.getArguments();
        if (arguments != null && UrlParams.Source.getSource(arguments.getInt(ShareHitPoint.f121868c, UrlParams.Source.APP.getValue())) == UrlParams.Source.SPLASH) {
            C29638a.m109622a().getMainDependency().mo107689a(mo91997u());
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.webview.container.dto.AbstractInjectWebViewDelegate
    /* renamed from: a */
    public void mo50984a(AbstractInjectWebViewDelegate.AbstractC25823a aVar) {
        new Handler(Looper.getMainLooper()).post(new Runnable(aVar) {
            /* class com.ss.android.lark.browser.biz.messenger.viewdelegate.$$Lambda$MessengerWebViewDelegate$8L_p6snWQ6Ar8QL7eDYoJm7tr58 */
            public final /* synthetic */ AbstractInjectWebViewDelegate.AbstractC25823a f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                MessengerWebViewDelegate.this.m110453b((MessengerWebViewDelegate) this.f$1);
            }
        });
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectWebViewDelegate
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectWebViewDelegate, com.larksuite.component.webview.container.dto.IWebContainerContract.IWebContainerView.AbstractC25824a
    /* renamed from: c */
    public boolean mo51002c(WebView webView, String str) {
        if (C29639e.m109680a(str)) {
            return C29639e.m109678a(mo91997u(), str);
        }
        return false;
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectWebViewDelegate, com.larksuite.component.webview.container.dto.IWebContainerContract.IWebContainerView.AbstractC25824a
    /* renamed from: a */
    public void mo50978a(WebView webView, String str) {
        super.mo50978a(webView, str);
        C29927b.m110647a(C29638a.m109622a().getLoginDependency(), str);
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectWebViewDelegate, com.larksuite.component.webview.container.dto.IWebContainerContract.IWebContainerView.AbstractC25824a
    /* renamed from: b */
    public void mo50995b(WebView webView, String str) {
        super.mo50995b(webView, str);
        Log.m165389i("MessengerWebView", "page finish, mWebTranslateHelper = " + this.f74609b);
        WebTranslateHelper webTranslateHelper = this.f74609b;
        if (webTranslateHelper != null) {
            webTranslateHelper.mo107833a(webView, str);
        }
    }

    /* renamed from: f */
    private void m110455f(Fragment fragment, final WebView webView) {
        C25838g a;
        if (WebTranslateHelper.f74708c.mo107838a()) {
            ViewGroup f = mo91999w().mo67313f();
            if (f instanceof FrameLayout) {
                WebTranslateHelper webTranslateHelper = new WebTranslateHelper(new AbstractC29952b() {
                    /* class com.ss.android.lark.browser.biz.messenger.viewdelegate.MessengerWebViewDelegate.C298751 */

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
                                /* class com.ss.android.lark.browser.biz.messenger.viewdelegate.$$Lambda$MessengerWebViewDelegate$1$sVRB3Flis4qqiz0SBbTBbrbU8o8 */
                                public final /* synthetic */ WebView f$0;
                                public final /* synthetic */ String f$1;

                                {
                                    this.f$0 = r1;
                                    this.f$1 = r2;
                                }

                                public final void run() {
                                    this.f$0.evaluateJavascript(this.f$1, null);
                                }
                            });
                        }
                    }
                });
                this.f74609b = webTranslateHelper;
                webTranslateHelper.mo107834a((FrameLayout) f);
                Context context = fragment.getContext();
                if (context != null && (a = this.f74609b.mo107832a(context)) != null) {
                    mo91999w().mo67308b().mo67317a(a);
                }
            }
        }
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectWebViewDelegate, com.larksuite.component.webview.container.dto.IWebContainerContract.IWebContainerView.AbstractC25824a
    /* renamed from: a */
    public void mo50977a(WebView webView, ClientCertRequest clientCertRequest) {
        X509Certificate[] x509CertificateArr;
        if (!C29638a.m109622a().isFeatureGatingEnable("lark.browser.security.sealcert")) {
            Log.m165389i("MessengerWebView", "onReceivedClientCertRequest fg is off");
            super.mo50977a(webView, clientCertRequest);
            return;
        }
        if (this.f74610c == null && this.f74611d == null) {
            this.f74610c = C29638a.m109622a().getTenantCertPrivateKey();
            this.f74611d = C29638a.m109622a().getTenantCertCertificate();
        }
        PrivateKey privateKey = this.f74610c;
        if (privateKey == null || (x509CertificateArr = this.f74611d) == null) {
            super.mo50977a(webView, clientCertRequest);
            return;
        }
        try {
            clientCertRequest.proceed(privateKey, x509CertificateArr);
        } catch (Exception e) {
            Log.m165398w("MessengerWebView", "onReceivedClientCertRequest failed", e);
        }
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectWebViewDelegate
    /* renamed from: b */
    public void mo50996b(Fragment fragment, WebView webView) {
        if (!this.f74608a) {
            m110455f(fragment, webView);
            mo107184c(fragment);
            this.f74608a = true;
        }
        C29927b.m110656c();
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectWebViewDelegate
    /* renamed from: a */
    public boolean mo50992a(Fragment fragment, WebView webView) {
        try {
            boolean booleanValue = ((Boolean) mo91995c("KEY_INTERCEPT_BACK")).booleanValue();
            Log.m165389i("MessengerWebView", "onInterceptBack value is " + booleanValue);
            return booleanValue;
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m110452a(Fragment fragment, WebView webView, ViewGroup viewGroup, int i) {
        C29773b.m110107a(mo91997u(), fragment, webView, viewGroup, new C29773b.AbstractC29781a(viewGroup) {
            /* class com.ss.android.lark.browser.biz.messenger.viewdelegate.$$Lambda$MessengerWebViewDelegate$8bJWRJfukT6J18CArfOp1Aotp2o */
            public final /* synthetic */ ViewGroup f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.lark.browser.biz.messenger.C29773b.AbstractC29781a
            public final void shareValueReceived(String str, String str2, String str3, String str4) {
                C29773b.m110111a(Fragment.this, this.f$1, str2, str, str3, str4);
            }
        });
    }
}
