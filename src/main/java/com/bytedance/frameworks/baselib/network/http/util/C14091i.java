package com.bytedance.frameworks.baselib.network.http.util;

import com.bytedance.common.utility.StringUtils;
import java.net.URI;
import java.net.URISyntaxException;

/* renamed from: com.bytedance.frameworks.baselib.network.http.util.i */
public class C14091i {
    /* renamed from: a */
    public static URI m57053a(String str) throws RuntimeException {
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new URI(str);
        } catch (URISyntaxException unused) {
            try {
                return URI.create(str.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused2) {
                return m57054b(str);
            }
        }
    }

    /* renamed from: b */
    public static URI m57054b(String str) throws RuntimeException {
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        try {
            int indexOf = str.indexOf("?");
            if (indexOf > 0) {
                str = str.substring(0, indexOf);
            }
            return URI.create(str);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
