package com.bytedance.lynx.webview.glue.sdk113;

import android.os.Build;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.bytedance.lynx.webview.glue.sdk112.IGlueToSdk112;
import com.bytedance.lynx.webview.internal.C20011y;
import com.bytedance.lynx.webview.proxy.WebViewProviderProxy;

public abstract class IGlueToSdk113 extends IGlueToSdk112 {
    public static boolean cm_allowFileSchemeCookies() {
        if (Build.VERSION.SDK_INT >= 12) {
            return CookieManager.allowFileSchemeCookies();
        }
        return false;
    }

    public static boolean resetToSystemWebView() {
        C20011y.m72976a().mo67902F().mo67787j();
        return true;
    }

    public static boolean cm_acceptCookie() {
        return C20011y.m72976a().mo67902F().mo67785h().getCookieManager().acceptCookie();
    }

    public static void cm_flush() {
        if (Build.VERSION.SDK_INT >= 21) {
            C20011y.m72976a().mo67902F().mo67785h().getCookieManager().flush();
        }
    }

    public static boolean cm_hasCookies() {
        return C20011y.m72976a().mo67902F().mo67785h().getCookieManager().hasCookies();
    }

    public static void cm_removeExpiredCookie() {
        CookieManager cookieManager = C20011y.m72976a().mo67902F().mo67785h().getCookieManager();
        if (Build.VERSION.SDK_INT < 21) {
            cookieManager.removeExpiredCookie();
        }
    }

    public static void cm_setAcceptFileSchemeCookies(boolean z) {
        if (Build.VERSION.SDK_INT >= 12 && Build.VERSION.SDK_INT < 30) {
            CookieManager.setAcceptFileSchemeCookies(z);
        }
    }

    public static Object getRealProvider(Object obj) {
        if (obj instanceof WebViewProviderProxy.RealGetter) {
            return ((WebViewProviderProxy.RealGetter) obj).getRealWebViewProvider();
        }
        return obj;
    }

    public static boolean cm_acceptThirdPartyCookies(WebView webView) {
        CookieManager cookieManager = C20011y.m72976a().mo67902F().mo67785h().getCookieManager();
        if (Build.VERSION.SDK_INT >= 21) {
            return cookieManager.acceptThirdPartyCookies(webView);
        }
        return false;
    }

    public static String cm_getCookie(String str) {
        return C20011y.m72976a().mo67902F().mo67785h().getCookieManager().getCookie(str);
    }

    public static void cm_removeAllCookies(ValueCallback<Boolean> valueCallback) {
        CookieManager cookieManager = C20011y.m72976a().mo67902F().mo67785h().getCookieManager();
        if (Build.VERSION.SDK_INT < 21) {
            cookieManager.removeAllCookie();
        } else {
            cookieManager.removeAllCookies(valueCallback);
        }
    }

    public static void cm_removeSessionCookies(ValueCallback<Boolean> valueCallback) {
        CookieManager cookieManager = C20011y.m72976a().mo67902F().mo67785h().getCookieManager();
        if (Build.VERSION.SDK_INT < 21) {
            cookieManager.removeSessionCookie();
        } else {
            cookieManager.removeSessionCookies(valueCallback);
        }
    }

    public static void cm_setAcceptCookie(boolean z) {
        C20011y.m72976a().mo67902F().mo67785h().getCookieManager().setAcceptCookie(z);
    }

    public static void cm_setAcceptThirdPartyCookie(WebView webView, boolean z) {
        CookieManager cookieManager = C20011y.m72976a().mo67902F().mo67785h().getCookieManager();
        if (Build.VERSION.SDK_INT >= 21) {
            cookieManager.setAcceptThirdPartyCookies(webView, z);
        }
    }

    public static void cm_setCookie(String str, String str2) {
        C20011y.m72976a().mo67902F().mo67785h().getCookieManager().setCookie(str, str2);
    }

    public static void cm_setCookies(String str, String str2, ValueCallback<Boolean> valueCallback) {
        CookieManager cookieManager = C20011y.m72976a().mo67902F().mo67785h().getCookieManager();
        if (Build.VERSION.SDK_INT >= 21) {
            cookieManager.setCookie(str, str2, valueCallback);
        }
    }
}
