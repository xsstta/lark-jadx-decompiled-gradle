package com.ss.lark.android.passport.biz.compat.web.p3214a;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.ServiceFinder;

/* renamed from: com.ss.lark.android.passport.biz.compat.web.a.a */
public class C64548a {
    /* renamed from: a */
    public static void m253628a(View view) {
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
        }
    }

    /* renamed from: a */
    public static void m253629a(WebView webView) {
        if (webView != null) {
            try {
                m253628a((View) webView);
                webView.destroy();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static String m253627a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        return Uri.parse(str).buildUpon().appendQueryParameter("host", ServiceFinder.m193751f().getApiHost()).toString();
    }

    /* renamed from: b */
    public static String m253630b(String str) {
        try {
            return Uri.parse(str).buildUpon().clearQuery().build().toString();
        } catch (Exception e) {
            PassportLog a = PassportLog.f123351c.mo171474a();
            a.mo171462a("WebViewUtil", "getLogUrl error: " + e.toString(), e);
            return str;
        }
    }
}
