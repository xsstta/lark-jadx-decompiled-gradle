package com.bytedance.ee.bear.contract.doc;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.lark.p414b.AbstractC7993f;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.p424c.AbstractC8149a;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.contract.doc.a */
public class C5130a {

    /* renamed from: a */
    private static String f14850a;

    /* renamed from: a */
    public static String m20992a() {
        return f14850a;
    }

    /* renamed from: a */
    public static void m20994a(String str) {
        f14850a = str;
    }

    /* renamed from: b */
    public static boolean m20997b(String str) {
        return Document.m33924M(str);
    }

    /* renamed from: c */
    public static int m20998c(String str) {
        if (!TextUtils.isEmpty(str)) {
            return C8275a.m34051b(C6313i.m25327a().mo25399g(str).f17446a);
        }
        return C8275a.f22371d.mo32555b();
    }

    /* renamed from: a */
    public static boolean m20995a(int i) {
        if (i == C8275a.f22371d.mo32555b() || i == C8275a.f22378k.mo32555b() || i == C8275a.f22372e.mo32555b() || i == C8275a.f22376i.mo32555b() || i == C8275a.f22374g.mo32555b() || i == C8275a.f22373f.mo32555b() || i == C8275a.f22377j.mo32555b()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m20996b(int i) {
        boolean e = ((AbstractC7993f) KoinJavaComponent.m268610a(AbstractC7993f.class)).mo30993e();
        if (i == C8275a.f22373f.mo32555b() && e) {
            return !C4211a.m17514a().mo16536a("ccm.spacekit.bitable.enable", false);
        }
        if (i == C8275a.f22374g.mo32555b()) {
            return !((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31523e();
        }
        if (i == C8275a.f22376i.mo32555b()) {
            return !C4211a.m17514a().mo16536a("spacekit.mobile.slide_enabled", false);
        }
        return false;
    }

    /* renamed from: a */
    public static String m20993a(String str, String str2) {
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        if (!TextUtils.isEmpty(buildUpon.build().getQueryParameter("from"))) {
            return str;
        }
        buildUpon.appendQueryParameter("from", str2);
        return buildUpon.build().toString();
    }
}
