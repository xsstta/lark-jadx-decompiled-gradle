package com.bytedance.ee.bear.search;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.p424c.AbstractC8149a;
import com.larksuite.framework.utils.C26253ae;
import java.io.File;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.search.m */
public class C10868m {
    /* renamed from: a */
    public static String m45141a() {
        return System.currentTimeMillis() + File.separator + C26253ae.m94997a();
    }

    /* renamed from: a */
    public static String m45143a(String str) {
        if (TextUtils.isEmpty(str) || !str.contains("<em>") || !str.contains("</em>")) {
            return str;
        }
        return str.replaceAll("<em>", "").replaceAll("</em>", "");
    }

    /* renamed from: a */
    public static String m45142a(Context context, Document document) {
        if (TextUtils.isEmpty(document.mo32469n()) || !document.mo32469n().contains("<em>") || !document.mo32469n().contains("</em>")) {
            return ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31518c(context, document);
        }
        return document.mo32469n().replaceAll("<em>", "").replaceAll("</em>", "");
    }

    /* renamed from: a */
    public static String m45144a(String str, String str2) {
        if (TextUtils.isEmpty(str) || !str.contains("<em>") || !str.contains("</em>")) {
            return str2;
        }
        return str.replaceAll("<em>", "<font color=#007Aff>").replaceAll("</em>", "</font>");
    }
}
