package com.bytedance.ee.bear.slide.common.p550a;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bytedance.ee.bear.document.offline.p318e.C5919a;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.C13674e;
import com.bytedance.ee.util.p703f.C13664a;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.slide.common.a.b */
public class C11386b {
    /* renamed from: a */
    private static String m47268a(String str) {
        String str2;
        int indexOf = str.indexOf("type=slideNormalImage");
        if (indexOf == -1) {
            return null;
        }
        int i = indexOf - 1;
        if (i > 0) {
            try {
                if (str.charAt(i) == '?' && indexOf + 21 == str.length()) {
                    str2 = str.substring(0, i);
                    return str2;
                }
            } catch (Exception e) {
                C13479a.m54759a("SlideImageInterceptUtil", "  getCorrectUrl(): failed", e);
                return null;
            }
        }
        int i2 = indexOf + 21;
        if (i2 >= str.length() || str.charAt(i2) != '&') {
            return null;
        }
        str2 = str.substring(0, indexOf) + str.substring(i2);
        return str2;
    }

    /* renamed from: a */
    private void m47269a(Map<String, String> map) {
        if (map != null && map.containsKey("Origin")) {
            map.put("access-control-allow-credentials", "true");
            map.put("access-control-allow-methods", "POST, GET, OPTIONS, PUT, DELETE");
            map.put("access-control-allow-origin", map.get("Origin"));
        }
    }

    /* renamed from: a */
    public WebResourceResponse mo43572a(WebView webView, String str) {
        if (str == null) {
            return null;
        }
        return m47265a(webView, Uri.parse(str), (Map<String, String>) null);
    }

    /* renamed from: a */
    private InputStream m47267a(String str, Context context) {
        try {
            File file = (File) ComponentCallbacks2C2115c.m9151c(context).mo10414a(new C13664a(str)).mo10405b(Integer.MIN_VALUE, Integer.MIN_VALUE).get();
            if (C13674e.m55485b(file)) {
                return new FileInputStream(file);
            }
            C13479a.m54775e("SlideImageInterceptUtil", "internalGetNetImageStream isImage not: ");
            return null;
        } catch (Exception e) {
            C13479a.m54758a("SlideImageInterceptUtil", "internalGetNetImageStream: " + e);
            return null;
        }
    }

    /* renamed from: a */
    public WebResourceResponse mo43571a(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null) {
            return null;
        }
        return m47265a(webView, webResourceRequest.getUrl(), webResourceRequest.getRequestHeaders());
    }

    /* renamed from: a */
    private WebResourceResponse m47266a(String str, InputStream inputStream, Map<String, String> map) {
        if (inputStream == null) {
            return null;
        }
        try {
            if (inputStream.available() <= 0) {
                return null;
            }
            WebResourceResponse webResourceResponse = new WebResourceResponse(str, C5919a.f16571a, inputStream);
            m47269a(map);
            webResourceResponse.setResponseHeaders(map);
            return webResourceResponse;
        } catch (Exception unused) {
            C13479a.m54758a("SlideImageInterceptUtil", "  internalGetImageResponse(): ");
            return null;
        }
    }

    /* renamed from: a */
    private WebResourceResponse m47265a(WebView webView, Uri uri, Map<String, String> map) {
        if (uri == null) {
            return null;
        }
        String uri2 = uri.toString();
        if (TextUtils.isEmpty(uri2)) {
            return null;
        }
        String a = m47268a(uri2);
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        return m47266a("image/*", m47267a(a, webView.getContext()), map);
    }
}
