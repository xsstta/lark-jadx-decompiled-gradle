package com.larksuite.component.webview.container.dto;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ClientCertRequest;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import com.larksuite.component.webview.container.dto.AbstractInjectWebViewDelegate;
import com.larksuite.component.webview.container.dto.IWebContainerContract;
import com.larksuite.component.webview.container.impl.inject.C25862a;
import com.larksuite.component.webview.container.impl.p1170a.C25840a;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.suite.R;
import com.ss.android.lark.openapi.jsapi.AbstractC48762d;

public abstract class AbstractInjectWebViewDelegate extends C25862a implements Parcelable, IWebContainerContract.IWebContainerView.AbstractC25824a {

    /* renamed from: com.larksuite.component.webview.container.dto.AbstractInjectWebViewDelegate$a */
    public interface AbstractC25823a {
        void proceed();
    }

    @Override // com.larksuite.component.webview.container.dto.IWebContainerContract.IWebContainerView.AbstractC25824a
    /* renamed from: a */
    public WebResourceResponse mo91871a(WebView webView, WebResourceRequest webResourceRequest) {
        return null;
    }

    /* renamed from: a */
    public void mo91872a(int i, int i2, int i3, int i4) {
    }

    /* renamed from: a */
    public void mo50974a(int i, int i2, Intent intent) {
    }

    @Override // com.larksuite.component.webview.container.dto.IWebContainerContract.IWebContainerView.AbstractC25824a
    /* renamed from: a */
    public /* synthetic */ void mo91873a(Configuration configuration) {
        IWebContainerContract.IWebContainerView.AbstractC25824a.CC.$default$a(this, configuration);
    }

    @Override // com.larksuite.component.webview.container.dto.IWebContainerContract.IWebContainerView.AbstractC25824a
    /* renamed from: a */
    public /* synthetic */ void mo50975a(WebView webView, int i) {
        IWebContainerContract.IWebContainerView.AbstractC25824a.CC.$default$a(this, webView, i);
    }

    @Override // com.larksuite.component.webview.container.dto.IWebContainerContract.IWebContainerView.AbstractC25824a
    /* renamed from: a */
    public void mo50976a(WebView webView, int i, String str, String str2) {
    }

    @Override // com.larksuite.component.webview.container.dto.IWebContainerContract.IWebContainerView.AbstractC25824a
    /* renamed from: a */
    public void mo50978a(WebView webView, String str) {
    }

    /* renamed from: a */
    public void mo50979a(Fragment fragment) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void m93360b(AbstractC25823a aVar);

    @Override // com.larksuite.component.webview.container.dto.IWebContainerContract.IWebContainerView.AbstractC25824a
    /* renamed from: a */
    public /* synthetic */ boolean mo91875a(View view) {
        return IWebContainerContract.IWebContainerView.AbstractC25824a.CC.$default$a(this, view);
    }

    /* renamed from: a */
    public boolean mo50992a(Fragment fragment, WebView webView) {
        return false;
    }

    @Override // com.larksuite.component.webview.container.dto.IWebContainerContract.IWebContainerView.AbstractC25824a
    /* renamed from: b */
    public void mo50995b(WebView webView, String str) {
    }

    /* renamed from: b */
    public void mo50996b(Fragment fragment, WebView webView) {
    }

    @Override // com.larksuite.component.webview.container.dto.IWebContainerContract.IWebContainerView.AbstractC25824a
    /* renamed from: b */
    public boolean mo50998b(String str) {
        return false;
    }

    /* renamed from: c */
    public void mo51000c(Fragment fragment, WebView webView) {
    }

    @Override // com.larksuite.component.webview.container.dto.IWebContainerContract.IWebContainerView.AbstractC25824a
    /* renamed from: c */
    public boolean mo51002c(WebView webView, String str) {
        return false;
    }

    @Override // com.larksuite.component.webview.container.dto.IWebContainerContract.IWebContainerView.AbstractC25824a
    /* renamed from: d */
    public void mo51004d(WebView webView, String str) {
    }

    /* renamed from: d */
    public void mo51005d(Fragment fragment, WebView webView) {
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public void mo91876e(Fragment fragment, WebView webView) {
    }

    /* renamed from: k */
    public boolean mo51013k() {
        return false;
    }

    public void writeToParcel(Parcel parcel, int i) {
    }

    protected AbstractInjectWebViewDelegate() {
    }

    /* renamed from: a */
    public void mo91874a(Runnable runnable) {
        if (!mo51013k()) {
            runnable.run();
            return;
        }
        CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable(new AbstractC25823a(new Handler(), runnable) {
            /* class com.larksuite.component.webview.container.dto.$$Lambda$AbstractInjectWebViewDelegate$0ctaY9XB4Tb2qxycsH7CrikJJYs */
            public final /* synthetic */ Handler f$0;
            public final /* synthetic */ Runnable f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            @Override // com.larksuite.component.webview.container.dto.AbstractInjectWebViewDelegate.AbstractC25823a
            public final void proceed() {
                this.f$0.post(this.f$1);
            }
        }) {
            /* class com.larksuite.component.webview.container.dto.$$Lambda$AbstractInjectWebViewDelegate$7nxep7vshsxWDbXT_NGAlJBHbT4 */
            public final /* synthetic */ AbstractInjectWebViewDelegate.AbstractC25823a f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                AbstractInjectWebViewDelegate.this.m93360b((AbstractInjectWebViewDelegate) this.f$1);
            }
        });
    }

    /* renamed from: m */
    public AbstractC48762d mo51015m() {
        return new C25840a();
    }

    protected AbstractInjectWebViewDelegate(Parcel parcel) {
    }

    /* renamed from: a */
    public View mo91870a(Context context) {
        return LayoutInflater.from(context).inflate(R.layout.web_error_page, (ViewGroup) null);
    }

    @Override // com.larksuite.component.webview.container.dto.IWebContainerContract.IWebContainerView.AbstractC25824a
    /* renamed from: a */
    public void mo50977a(WebView webView, ClientCertRequest clientCertRequest) {
        clientCertRequest.cancel();
    }
}
