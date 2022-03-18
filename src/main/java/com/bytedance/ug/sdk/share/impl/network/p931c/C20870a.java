package com.bytedance.ug.sdk.share.impl.network.p931c;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.ug.sdk.share.impl.p919c.C20826a;
import com.huawei.hms.framework.common.ContainerUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.ug.sdk.share.impl.network.c.a */
public class C20870a {
    /* renamed from: a */
    public static String m75931a(String str) {
        String str2 = C20826a.m75837a().mo70297b() + str;
        if (C20826a.m75837a().mo70299c()) {
            return m75936b(str2);
        }
        return str2;
    }

    /* renamed from: b */
    public static String m75936b(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            Uri parse = Uri.parse(str.trim());
            Uri.Builder builder = new Uri.Builder();
            builder.scheme("http");
            builder.encodedAuthority(parse.getEncodedAuthority() + ".boe-gateway.byted.org");
            builder.encodedPath(parse.getPath());
            builder.encodedQuery(parse.getEncodedQuery());
            return builder.build().toString();
        } catch (Throwable unused) {
            return str;
        }
    }

    /* renamed from: a */
    public static void m75934a(StringBuilder sb) {
        if (sb != null) {
            if (sb.toString().indexOf(63) < 0) {
                sb.append("?");
            } else {
                sb.append(ContainerUtils.FIELD_DELIMITER);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            m75935a(linkedHashMap);
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                arrayList.add(new Pair(entry.getKey(), entry.getValue()));
            }
            sb.append(m75933a(arrayList, "UTF-8"));
        }
    }

    /* renamed from: a */
    public static void m75935a(Map<String, String> map) {
        if (map != null) {
            String e = C20826a.m75837a().mo70301e();
            if (!TextUtils.isEmpty(e)) {
                map.put("ug_share_did", e);
            }
            String d = C20826a.m75837a().mo70300d();
            if (!TextUtils.isEmpty(d)) {
                map.put("ug_share_aid", d);
                map.put("aid", d);
            }
            String f = C20826a.m75837a().mo70302f();
            if (!TextUtils.isEmpty(f)) {
                map.put("ug_share_package_name", f);
            }
            map.put("ug_share_v_code", String.valueOf(220008));
            map.put("ug_share_v_name", "2.2.0-rc.8");
            map.put("ug_share_os_api", String.valueOf(Build.VERSION.SDK_INT));
            map.put("device_platform", "android");
            map.put("ug_share_platform", "android");
        }
    }

    /* renamed from: a */
    private static String m75932a(String str, String str2) {
        if (str2 == null) {
            str2 = "ISO-8859-1";
        }
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public static String m75933a(List<Pair<String, String>> list, String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        for (Pair<String, String> pair : list) {
            String a = m75932a((String) pair.first, str);
            String str3 = (String) pair.second;
            if (str3 != null) {
                str2 = m75932a(str3, str);
            } else {
                str2 = "";
            }
            if (sb.length() > 0) {
                sb.append(ContainerUtils.FIELD_DELIMITER);
            }
            sb.append(a);
            sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
            sb.append(str2);
        }
        return sb.toString();
    }
}
