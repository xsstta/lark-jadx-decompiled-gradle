package com.bytedance.lynx.webview.util;

import java.io.IOException;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.CookieStore;
import java.net.URI;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.lynx.webview.util.k */
public class C20052k extends CookieManager {

    /* renamed from: a */
    private android.webkit.CookieManager f48991a;

    public C20052k() {
        this(null, null);
    }

    public CookieStore getCookieStore() {
        throw new UnsupportedOperationException();
    }

    public C20052k(CookieStore cookieStore, CookiePolicy cookiePolicy) {
        super(null, cookiePolicy);
        this.f48991a = android.webkit.CookieManager.getInstance();
    }

    @Override // java.net.CookieHandler, java.net.CookieManager
    public Map<String, List<String>> get(URI uri, Map<String, List<String>> map) throws IOException {
        if (uri == null || map == null) {
            return null;
        }
        String uri2 = uri.toString();
        HashMap hashMap = new HashMap();
        String cookie = this.f48991a.getCookie(uri2);
        if (cookie != null) {
            hashMap.put("Cookie", Arrays.asList(cookie));
        }
        return hashMap;
    }

    @Override // java.net.CookieHandler, java.net.CookieManager
    public void put(URI uri, Map<String, List<String>> map) throws IOException {
        if (!(uri == null || map == null)) {
            String uri2 = uri.toString();
            for (String str : map.keySet()) {
                if (str != null && (str.equalsIgnoreCase("Set-Cookie2") || str.equalsIgnoreCase("Set-Cookie"))) {
                    for (String str2 : map.get(str)) {
                        this.f48991a.setCookie(uri2, str2);
                    }
                }
            }
        }
    }
}
