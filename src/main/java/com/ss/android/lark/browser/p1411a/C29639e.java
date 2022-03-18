package com.ss.android.lark.browser.p1411a;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.larksuite.component.webview.container.C25819a;
import com.larksuite.component.webview.container.dto.C25834e;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.aq;
import com.ss.android.lark.biz.core.api.UrlParams;
import com.ss.android.lark.browser.C29638a;
import com.ss.android.lark.browser.dependency.IBrowserModuleDependency;
import com.ss.android.lark.browser.impl.C29935c;
import com.ss.android.lark.browser.impl.statistics.BrowserHitPoint;
import com.ss.android.lark.log.Log;
import java.util.Map;

/* renamed from: com.ss.android.lark.browser.a.e */
public class C29639e {

    /* renamed from: a */
    private static final String[] f74308a = {"snssdk", "sslocal", "admanager", "seal", "tuchong"};

    /* renamed from: b */
    private static final String[] f74309b = {"alipay", "alipays", "weixin", "zoomus", "mioa"};

    /* renamed from: d */
    private static boolean m109684d(String str) {
        return m109681a(str, "sslocal", "microapp");
    }

    /* renamed from: b */
    public static boolean m109682b(String str) {
        if (m109685e(str) || m109686f(str) || m109687g(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m109683c(String str) {
        if (m109681a(str, "lark", "client") || m109681a(str, "lark", "inner")) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private static boolean m109685e(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        for (String str2 : f74308a) {
            if (lowerCase.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    private static boolean m109686f(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        for (String str2 : f74309b) {
            if (lowerCase.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static int m109677a(UrlParams.Source source) {
        if (source == UrlParams.Source.APP_CARD_GROUP || source == UrlParams.Source.APP_CARD_SINGLE || source == UrlParams.Source.APP_CARD_LINK_GROUP || source == UrlParams.Source.APP_CARD_LINK_SINGLE || source == UrlParams.Source.APP_CARD_FOOTER_LINK) {
            return 4;
        }
        if (source == UrlParams.Source.APP_P2P_CHAT) {
            return 5;
        }
        if (source == UrlParams.Source.APP_GROUP_CHAT) {
            return 6;
        }
        if (source == UrlParams.Source.DOC) {
            return 11;
        }
        if (source == UrlParams.Source.APP_THREAD_TOPIC) {
            return 12;
        }
        return 8;
    }

    /* renamed from: g */
    private static boolean m109687g(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Map<String, String> a = C29638a.m109622a().getManisDependency().mo107692a();
        if (CollectionUtils.isEmpty(a)) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        for (String str2 : a.keySet()) {
            if (lowerCase.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m109680a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        IBrowserModuleDependency.AbstractC29899o vCDependency = C29638a.m109622a().getVCDependency();
        IBrowserModuleDependency.AbstractC29884b docsDependency = C29638a.m109622a().getDocsDependency();
        IBrowserModuleDependency.AbstractC29890g littleAppDependency = C29638a.m109622a().getLittleAppDependency();
        if (m109683c(str) || vCDependency.mo107719a(str) || vCDependency.mo107721b(str) || vCDependency.mo107724d(str) || vCDependency.mo107723c(str) || m109684d(str) || ((docsDependency != null && docsDependency.mo107663a(str)) || ((littleAppDependency != null && littleAppDependency.mo107676a(str)) || ((str != null && C29638a.m109622a().isAppLink(Uri.parse(str))) || m109682b(str))))) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    private static String m109688h(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Map<String, String> a = C29638a.m109622a().getManisDependency().mo107692a();
        if (CollectionUtils.isEmpty(a)) {
            return null;
        }
        String lowerCase = str.toLowerCase();
        for (String str2 : a.keySet()) {
            if (lowerCase.startsWith(str2)) {
                return a.get(str2);
            }
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m109678a(Context context, String str) {
        return m109679a(context, str, null, null);
    }

    /* renamed from: a */
    private static boolean m109681a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str);
            String scheme = parse.getScheme();
            String host = parse.getHost();
            if ((TextUtils.isEmpty(scheme) || str2.equalsIgnoreCase(scheme)) && (TextUtils.isEmpty(str3) || str3.equalsIgnoreCase(host))) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            Log.m165399w("MessengerUrlInterceptor", th);
        }
    }

    /* renamed from: a */
    public static boolean m109679a(Context context, String str, Map<String, String> map, UrlParams.Source source) {
        String str2;
        String str3;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String a = aq.m95057a(str);
        if (TextUtils.isEmpty(a)) {
            return false;
        }
        IBrowserModuleDependency.AbstractC29899o vCDependency = C29638a.m109622a().getVCDependency();
        IBrowserModuleDependency.AbstractC29884b docsDependency = C29638a.m109622a().getDocsDependency();
        IBrowserModuleDependency.AbstractC29890g littleAppDependency = C29638a.m109622a().getLittleAppDependency();
        if (m109683c(str)) {
            Log.m165389i("MessengerUrlInterceptor", "intercept lark schema");
            C29638a.m109622a().getManisDependency().mo107706d(str);
            return true;
        } else if (m109684d(str)) {
            Log.m165389i("MessengerUrlInterceptor", "intercept old little app schema");
            littleAppDependency.mo107677b(context, str, source);
            return true;
        } else if (m109682b(a)) {
            Log.m165389i("MessengerUrlInterceptor", "intercept third party schema");
            C25834e c = C25819a.m93331c(context, str);
            boolean a2 = c.mo91905a();
            boolean b = c.mo91906b();
            if (b) {
                String h = m109688h(a);
                if (!TextUtils.isEmpty(h)) {
                    C29935c.m110676a().mo107801a(context, h, UrlParams.m108857a().mo105523a());
                }
            }
            if (a2) {
                try {
                    String scheme = Uri.parse(str).getScheme();
                    BrowserHitPoint.Companion aVar = BrowserHitPoint.f74663a;
                    if (source == UrlParams.Source.QR) {
                        str2 = "scan";
                    } else {
                        str2 = "link";
                    }
                    aVar.mo107799d(scheme, str2);
                    BrowserHitPoint.Companion aVar2 = BrowserHitPoint.f74663a;
                    if (b) {
                        str3 = "fail";
                    } else {
                        str3 = "success";
                    }
                    aVar2.mo107800e(scheme, str3);
                } catch (Exception e) {
                    Log.m165398w("MessengerUrlInterceptor", "parse third party schema error", e);
                }
            }
            return a2;
        } else if (docsDependency != null && docsDependency.mo107663a(str)) {
            Log.m165389i("MessengerUrlInterceptor", "intercept docs url");
            return docsDependency.mo107662a(context, str, map);
        } else if (littleAppDependency != null && littleAppDependency.mo107676a(str)) {
            Log.m165389i("MessengerUrlInterceptor", "intercept little app url");
            return littleAppDependency.mo107675a(context, str, source);
        } else if (C29638a.m109622a().canOpenInternal(context, str, m109677a(source))) {
            Log.m165389i("MessengerUrlInterceptor", "intercept applink url");
            C29638a.m109622a().openInternal(context, str, m109677a(source));
            return true;
        } else if (vCDependency.mo107719a(str)) {
            Log.m165389i("MessengerUrlInterceptor", "intercept vc url");
            vCDependency.mo107717a(context, str);
            return true;
        } else if (vCDependency.mo107721b(str)) {
            Log.m165389i("MessengerUrlInterceptor", "intercept mm url");
            vCDependency.mo107718a(context, str, m109677a(source));
            return true;
        } else if (vCDependency.mo107723c(str)) {
            Log.m165389i("MessengerUrlInterceptor", "intercept says url");
            return vCDependency.mo107720b(context, str, m109677a(source));
        } else if (!vCDependency.mo107724d(str)) {
            return false;
        } else {
            Log.m165389i("MessengerUrlInterceptor", "intercept vcLive url");
            return vCDependency.mo107722c(context, str, m109677a(source));
        }
    }
}
