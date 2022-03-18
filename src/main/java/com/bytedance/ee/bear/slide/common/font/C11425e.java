package com.bytedance.ee.bear.slide.common.font;

import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import com.bytedance.ee.log.C13479a;
import com.huawei.hms.framework.common.ContainerUtils;
import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ee.bear.slide.common.font.e */
public class C11425e {

    /* renamed from: a */
    private final WebResourceResponse f30714a;

    /* renamed from: b */
    private final String f30715b;

    /* renamed from: c */
    private C11426f f30716c;

    /* renamed from: b */
    private static boolean m47490b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains("#fontKey=");
    }

    /* renamed from: a */
    private Map<String, String> m47487a(String str) {
        int lastIndexOf;
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str) && (lastIndexOf = str.lastIndexOf("#fontKey=")) > 0) {
            for (String str2 : str.substring(lastIndexOf + 1).split(ContainerUtils.FIELD_DELIMITER)) {
                String[] split = str2.split(ContainerUtils.KEY_VALUE_DELIMITER);
                if (split.length == 2) {
                    hashMap.put(split[0], split[1]);
                }
            }
        }
        return hashMap;
    }

    C11425e(String str, C11426f fVar) {
        WebResourceResponse webResourceResponse = new WebResourceResponse("", "", null);
        this.f30714a = webResourceResponse;
        HashMap hashMap = new HashMap();
        hashMap.put("access-control-allow-origin", "*");
        webResourceResponse.setResponseHeaders(hashMap);
        webResourceResponse.setStatusCodeAndReasonPhrase(502, "Bad Gateway");
        this.f30715b = str;
        this.f30716c = fVar;
    }

    /* renamed from: a */
    private void m47488a(Map<String, String> map, Map<String, String> map2) {
        if (map != null && map.containsKey("Origin")) {
            map2.put("access-control-allow-credentials", "true");
            map2.put("access-control-allow-methods", "POST, GET, OPTIONS, PUT, DELETE");
            map2.put("access-control-allow-origin", map.get("Origin"));
        }
    }

    /* renamed from: b */
    private WebResourceResponse m47489b(String str, Map<String, String> map) {
        try {
            File file = new File(this.f30715b, str);
            if (!file.getCanonicalPath().startsWith(this.f30715b)) {
                C13479a.m54775e("FontFinder", "This font file path is illegal");
                return this.f30714a;
            } else if (!file.exists()) {
                C13479a.m54775e("FontFinder", " getCacheFromFile font not support " + str);
                this.f30716c.mo43780a(str);
                return this.f30714a;
            } else {
                WebResourceResponse webResourceResponse = new WebResourceResponse("", "", new FileInputStream(file));
                HashMap hashMap = new HashMap();
                m47488a(map, hashMap);
                webResourceResponse.setResponseHeaders(hashMap);
                return webResourceResponse;
            }
        } catch (Exception e) {
            C13479a.m54759a("FontFinder", " getCacheFromFile err ", e);
            e.printStackTrace();
            return this.f30714a;
        }
    }

    /* renamed from: a */
    public WebResourceResponse mo43775a(String str, Map<String, String> map) {
        if (!m47490b(str)) {
            return null;
        }
        String str2 = m47487a(str).get("fontKey");
        if (TextUtils.isEmpty(str2)) {
            C13479a.m54775e("FontFinder", "url illegal");
            return this.f30714a;
        }
        C13479a.m54764b("FontFinder", "getFontFileResponse " + str2);
        return m47489b(str2, map);
    }
}
