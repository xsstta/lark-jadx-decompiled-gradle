package com.ss.android.lark.applink;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.applink.e */
public final class C29193e {
    /* renamed from: a */
    public static boolean m107341a() {
        return C29187c.m107300a().mo103452a("applink.compatibility.version");
    }

    /* renamed from: a */
    public static boolean m107342a(Uri uri) {
        if (!"https".equals(uri.getScheme()) || uri.getQueryParameter("applink_ex") == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m107343a(Uri uri, String str) {
        String queryParameter = uri.getQueryParameter("min_lk_ver_android");
        if (TextUtils.isEmpty(queryParameter)) {
            queryParameter = uri.getQueryParameter("min_lk_ver");
        }
        C29187c a = C29187c.m107300a();
        a.mo103453b("AppLinkSupportService", "linkVersion=" + queryParameter + " appVersionName=" + str);
        if (!TextUtils.isEmpty(queryParameter) && str.compareTo(queryParameter) < 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    static void m107340a(Context context, Uri uri, String str) {
        if (C29187c.m107300a().mo103470a(uri)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("lk_ver", str);
                jSONObject.put("from_pf", "Android");
            } catch (JSONException e) {
                e.printStackTrace();
            }
            Uri.Builder buildUpon = uri.buildUpon();
            buildUpon.scheme("https");
            buildUpon.appendQueryParameter("applink_ex", jSONObject.toString());
            C29187c.m107300a().mo103447a(context, buildUpon.toString());
        }
    }
}
