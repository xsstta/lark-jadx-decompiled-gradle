package com.ss.android.lark.openapi.webcore;

import android.os.Build;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.openapi.p2397a.C48757a;
import java.lang.reflect.Method;

/* renamed from: com.ss.android.lark.openapi.webcore.a */
public class C48776a {

    /* renamed from: a */
    private WebSettings f122567a;

    public C48776a(WebSettings webSettings) {
        this.f122567a = webSettings;
        C48757a.m192082a(webSettings, "use_minimal_memory", "false");
        webSettings.setDisplayZoomControls(false);
    }

    /* renamed from: a */
    public void mo170381a(int i) {
        if (i >= 0 && i <= 2) {
            WebSettings webSettings = this.f122567a;
            if (Build.VERSION.SDK_INT >= 21) {
                webSettings.setMixedContentMode(i);
                return;
            }
            try {
                Method method = WebSettings.class.getMethod("setMixedContentMode", Integer.TYPE);
                if (method == null) {
                    Log.m165383e("WebSettings", "Error getting setMixedContentMode method");
                    return;
                }
                method.setAccessible(true);
                method.invoke(webSettings, Integer.valueOf(i));
                Log.m165389i("WebSettings", "Successfully set MIXED_CONTENT_COMPATIBILITY_MODE");
            } catch (Exception e) {
                Log.m165384e("WebSettings", "Error call setMixedContentMode method" + e.getMessage(), e);
            }
        }
    }

    /* renamed from: a */
    public void mo170382a(WebView webView) {
        this.f122567a.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        this.f122567a.setLoadWithOverviewMode(true);
        this.f122567a.setUseWideViewPort(true);
        this.f122567a.setSupportZoom(true);
        this.f122567a.setJavaScriptEnabled(true);
        this.f122567a.setDomStorageEnabled(true);
        this.f122567a.setSupportMultipleWindows(true);
        this.f122567a.setJavaScriptCanOpenWindowsAutomatically(true);
        this.f122567a.setAllowFileAccess(false);
        this.f122567a.setBuiltInZoomControls(true);
        this.f122567a.setDisplayZoomControls(false);
        if (Build.VERSION.SDK_INT < 18) {
            this.f122567a.setRenderPriority(WebSettings.RenderPriority.HIGH);
        }
        this.f122567a.setDatabaseEnabled(true);
        mo170383a(webView, true);
    }

    /* renamed from: a */
    public void mo170383a(WebView webView, boolean z) {
        if (Build.VERSION.SDK_INT >= 21) {
            CookieManager.getInstance().setAcceptThirdPartyCookies(webView, z);
        }
    }
}
