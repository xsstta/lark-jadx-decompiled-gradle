package com.bytedance.ee.util.io;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.content.FileProvider;
import com.bytedance.ee.log.C13479a;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: com.bytedance.ee.util.io.h */
public class C13681h {

    /* renamed from: a */
    private static Pattern f35884a = Pattern.compile("^([hH][tT]{2}[pP]:/*|[hH][tT]{2}[pP][sS]:/*|[fF][iI][lL][eE]:/*)([\\w.]+\\/?)\\S*");

    /* renamed from: com.bytedance.ee.util.io.h$a */
    public static class C13682a {

        /* renamed from: a */
        private String f35885a;

        /* renamed from: a */
        public String mo50648a() {
            return this.f35885a;
        }

        public C13682a(String str) {
            this.f35885a = str;
        }

        /* renamed from: a */
        public C13682a mo50647a(String str, String str2) {
            this.f35885a = C13681h.m55563b(this.f35885a, str, str2);
            return this;
        }
    }

    /* renamed from: a */
    public static boolean m55561a(String str) {
        if (TextUtils.isEmpty(str) || !f35884a.matcher(str).matches()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static Uri m55559a(Context context, File file) {
        if (Build.VERSION.SDK_INT < 24) {
            return Uri.fromFile(file);
        }
        try {
            return m55562b(context, file);
        } catch (Exception e) {
            C13479a.m54761a("UriUtils", e);
            return null;
        }
    }

    /* renamed from: b */
    private static Uri m55562b(Context context, File file) {
        return FileProvider.getUriForFile(context, context.getPackageName() + ".provider", file);
    }

    /* renamed from: a */
    public static String m55560a(String str, String str2, String str3) {
        try {
            return Uri.parse(str).buildUpon().clearQuery().appendQueryParameter(str2, str3).toString();
        } catch (Throwable th) {
            C13479a.m54759a("UriUtils", "clearAndAppendQuery error, return origin url:", th);
            return str;
        }
    }

    /* renamed from: b */
    public static String m55563b(String str, String str2, String str3) {
        try {
            Uri parse = Uri.parse(str);
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            if (!queryParameterNames.contains(str2)) {
                C13479a.m54764b("UriUtils", "append query directly");
                return parse.buildUpon().appendQueryParameter(str2, str3).toString();
            } else if (TextUtils.equals(parse.getQueryParameter(str2), str3)) {
                C13479a.m54764b("UriUtils", "query equals, return origin url");
                return str;
            } else {
                C13479a.m54764b("UriUtils", "query:" + parse.getQuery());
                HashMap hashMap = new HashMap();
                for (String str4 : queryParameterNames) {
                    if (!TextUtils.equals(str4, str2)) {
                        String queryParameter = parse.getQueryParameter(str4);
                        if (queryParameter == null) {
                            queryParameter = "";
                        }
                        hashMap.put(str4, queryParameter);
                    }
                }
                Uri.Builder buildUpon = Uri.parse(parse.buildUpon().clearQuery().toString()).buildUpon();
                for (Map.Entry entry : hashMap.entrySet()) {
                    buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                }
                buildUpon.appendQueryParameter(str2, str3);
                return buildUpon.build().toString();
            }
        } catch (Throwable th) {
            C13479a.m54759a("UriUtils", "append or replace query error, return origin url:", th);
            return str;
        }
    }
}
