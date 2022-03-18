package com.tt.miniapp.util;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.utils.CharacterUtils;
import java.util.Set;

/* renamed from: com.tt.miniapp.util.aa */
public class C67019aa {
    /* renamed from: a */
    public static String m261223a(String str) {
        String str2 = "";
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        String authority = parse.getAuthority();
        String path = parse.getPath();
        String query = parse.getQuery();
        if (!TextUtils.isEmpty(path)) {
            path = CharacterUtils.md5Hex(path);
        }
        if (!TextUtils.isEmpty(query)) {
            query = CharacterUtils.md5Hex(query);
        }
        if (scheme == null) {
            scheme = str2;
        }
        StringBuffer stringBuffer = new StringBuffer(scheme);
        stringBuffer.append(authority);
        if (TextUtils.isEmpty(path)) {
            path = str2;
        }
        stringBuffer.append(path);
        stringBuffer.append("?");
        if (!TextUtils.isEmpty(query)) {
            str2 = query;
        }
        stringBuffer.append(str2);
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static Uri m261222a(Uri uri, String str, String str2) {
        String str3;
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        Uri.Builder clearQuery = uri.buildUpon().clearQuery();
        for (String str4 : queryParameterNames) {
            if (str4.equals(str)) {
                str3 = str2;
            } else {
                str3 = uri.getQueryParameter(str4);
            }
            clearQuery.appendQueryParameter(str4, str3);
        }
        return clearQuery.build();
    }
}
