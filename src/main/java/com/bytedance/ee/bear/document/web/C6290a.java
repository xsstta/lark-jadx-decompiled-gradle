package com.bytedance.ee.bear.document.web;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.ee.bear.contract.al;
import com.bytedance.ee.log.C13479a;
import java.lang.reflect.Method;

/* renamed from: com.bytedance.ee.bear.document.web.a */
public class C6290a {

    /* renamed from: a */
    private WebSettings f17426a;

    /* renamed from: b */
    private al f17427b;

    /* renamed from: c */
    private String f17428c = "Default";

    /* renamed from: a */
    private void m25234a(int i) {
        if (i >= 0 && i <= 2) {
            WebSettings webSettings = this.f17426a;
            if (Build.VERSION.SDK_INT >= 21) {
                webSettings.setMixedContentMode(i);
                return;
            }
            try {
                Method method = WebSettings.class.getMethod("setMixedContentMode", Integer.TYPE);
                if (method != null) {
                    method.setAccessible(true);
                    method.invoke(webSettings, Integer.valueOf(i));
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static String m25233a(Context context) {
        String str;
        if (Build.VERSION.SDK_INT >= 17) {
            try {
                str = WebSettings.getDefaultUserAgent(context.getApplicationContext());
            } catch (Exception unused) {
                str = System.getProperty("http.agent");
            }
        } else {
            str = System.getProperty("http.agent");
        }
        StringBuffer stringBuffer = new StringBuffer();
        if (!TextUtils.isEmpty(str)) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt <= 31 || charAt >= 127) {
                    stringBuffer.append(String.format("\\u%04x", Integer.valueOf(charAt)));
                } else {
                    stringBuffer.append(charAt);
                }
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: b */
    public void mo25301b(WebView webView) {
        String a = m25233a(webView.getContext());
        if (TextUtils.isEmpty(a)) {
            a = "Mozilla/5.0 (Linux; Android 7.0; FRD-AL00 Build/HUAWEIFRD-AL00; wv) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/55.0.2883.91 Mobile Safari/537.36";
        }
        WebSettings webSettings = this.f17426a;
        webSettings.setUserAgentString(a + " " + this.f17427b.mo17352M() + " Bytedance Docs/" + this.f17427b.mo17364n() + " Type/" + this.f17428c + " " + this.f17427b.mo17360i());
        StringBuilder sb = new StringBuilder();
        sb.append("initSettings: ua=");
        sb.append(this.f17426a.getUserAgentString());
        C13479a.m54764b("DocWebSettings", sb.toString());
    }

    /* renamed from: a */
    public void mo25299a(WebView webView) {
        this.f17426a.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        this.f17426a.setLoadWithOverviewMode(true);
        this.f17426a.setUseWideViewPort(true);
        this.f17426a.setSupportZoom(true);
        this.f17426a.setJavaScriptEnabled(true);
        this.f17426a.setDomStorageEnabled(true);
        this.f17426a.setSupportMultipleWindows(true);
        this.f17426a.setJavaScriptCanOpenWindowsAutomatically(true);
        this.f17426a.setCacheMode(-1);
        this.f17426a.setAllowFileAccess(true);
        if (Build.VERSION.SDK_INT < 18) {
            this.f17426a.setRenderPriority(WebSettings.RenderPriority.HIGH);
        }
        this.f17426a.setDatabaseEnabled(true);
        mo25301b(webView);
        mo25300a(webView, true);
        if (Build.VERSION.SDK_INT >= 21) {
            m25234a(2);
        }
    }

    public C6290a(WebSettings webSettings, al alVar) {
        this.f17426a = webSettings;
        this.f17427b = alVar;
    }

    /* renamed from: a */
    public void mo25300a(WebView webView, boolean z) {
        if (Build.VERSION.SDK_INT >= 21) {
            CookieManager.getInstance().setAcceptThirdPartyCookies(webView, z);
        }
    }
}
