package com.ttnet.org.chromium.net;

import com.ttnet.org.chromium.base.annotations.JNINamespace;
import java.net.CookieHandler;
import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JNINamespace("net")
public class TTAndroidGetCookieUtil {
    public static String getCookieHeader(String str) {
        Map<String, List<String>> map;
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder();
        try {
            CookieHandler cookieHandler = CookieHandler.getDefault();
            if (cookieHandler != null) {
                map = cookieHandler.get(new URI(str), hashMap);
            } else {
                map = null;
            }
            if (map != null && map.size() > 0) {
                for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                    if ("Cookie".equalsIgnoreCase(entry.getKey()) && !entry.getValue().isEmpty()) {
                        int i = 0;
                        for (String str2 : entry.getValue()) {
                            if (i > 0) {
                                sb.append("; ");
                            }
                            sb.append(str2);
                            i++;
                        }
                    }
                }
            }
            return sb.toString();
        } catch (Exception unused) {
            return sb.toString();
        }
    }
}
