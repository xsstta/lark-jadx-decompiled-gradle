package com.bytedance.ee.bear.contract.p282f;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.contract.f.a */
public class C5171a {
    /* renamed from: b */
    public static boolean m21152b(String str) {
        if (str == null || !str.endsWith("#history")) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m21154c(String str) {
        if (str == null || !str.contains("subscription=1")) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m21155d(BearUrl bearUrl) {
        if (bearUrl == null || !TextUtils.equals(bearUrl.f17446a, "wiki_home")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m21149a(BearUrl bearUrl) {
        if (bearUrl == null) {
            return false;
        }
        try {
            return TextUtils.equals(bearUrl.mo25327c().get("template_preview_source"), "announce");
        } catch (Exception unused) {
            C13479a.m54775e("DocumentTypeUtil", "illegal url to judge is announce doc");
            return false;
        }
    }

    /* renamed from: c */
    public static String m21153c(BearUrl bearUrl) {
        if (bearUrl == null) {
            return "";
        }
        try {
            return bearUrl.mo25327c().get("template_preview_source");
        } catch (Exception unused) {
            C13479a.m54775e("DocumentTypeUtil", "illegal url to get template preview tag doc");
            return "";
        }
    }

    /* renamed from: e */
    public static boolean m21156e(BearUrl bearUrl) {
        if (bearUrl == null || !TextUtils.equals(bearUrl.f17446a, C8275a.f22377j.mo32553a())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m21150a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return TextUtils.equals(Uri.parse(str).getQueryParameter("open_type"), "announce");
        } catch (Exception unused) {
            C13479a.m54775e("DocumentTypeUtil", "illegal url to judge is announce doc");
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m21151b(BearUrl bearUrl) {
        if (bearUrl == null) {
            return false;
        }
        try {
            String str = bearUrl.mo25327c().get("template_preview_source");
            if (TextUtils.equals(str, "system") || TextUtils.equals(str, "corporate") || TextUtils.equals(str, "custom") || TextUtils.equals(str, "link")) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            C13479a.m54775e("DocumentTypeUtil", "illegal url to judge is preview doc");
            return false;
        }
    }
}
