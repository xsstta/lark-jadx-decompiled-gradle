package com.tt.miniapp.ab;

import android.os.Build;
import android.webkit.WebSettings;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.util.C67070z;

/* renamed from: com.tt.miniapp.ab.a */
public class C65726a {

    /* renamed from: a */
    private WebSettings f165608a;

    /* renamed from: b */
    private IAppContext f165609b;

    /* renamed from: c */
    public void mo230329c() {
        this.f165608a.setDomStorageEnabled(true);
    }

    /* renamed from: b */
    public void mo230328b() {
        this.f165608a.setSupportZoom(true);
        this.f165608a.setLoadWithOverviewMode(true);
        this.f165608a.setBuiltInZoomControls(true);
        this.f165608a.setUseWideViewPort(true);
    }

    /* renamed from: a */
    public void mo230326a() {
        this.f165608a.setJavaScriptEnabled(true);
        if (Build.VERSION.SDK_INT >= 11) {
            this.f165608a.setDisplayZoomControls(false);
            this.f165608a.setAllowContentAccess(true);
        }
        this.f165608a.setSupportZoom(false);
        this.f165608a.setBuiltInZoomControls(false);
        this.f165608a.setUserAgentString(C67070z.m261387a(this.f165609b));
        this.f165608a.setSavePassword(false);
        this.f165608a.setPluginState(WebSettings.PluginState.ON);
        this.f165608a.setAppCacheEnabled(false);
        this.f165608a.setCacheMode(-1);
        this.f165608a.setGeolocationEnabled(true);
        this.f165608a.setAllowFileAccess(false);
        this.f165608a.setDatabaseEnabled(true);
        this.f165608a.setAllowFileAccessFromFileURLs(false);
        this.f165608a.setAllowUniversalAccessFromFileURLs(false);
        this.f165608a.setDefaultTextEncodingName("utf-8");
        this.f165608a.setTextZoom(100);
        if (Build.VERSION.SDK_INT >= 21) {
            this.f165608a.setMixedContentMode(0);
        }
    }

    /* renamed from: a */
    public void mo230327a(boolean z) {
        this.f165608a.setMediaPlaybackRequiresUserGesture(!z);
    }

    public C65726a(WebSettings webSettings, IAppContext iAppContext) {
        this.f165608a = webSettings;
        this.f165609b = iAppContext;
    }
}
