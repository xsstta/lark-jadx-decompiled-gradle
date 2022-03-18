package com.ss.android.lark.passport.infra.base.network;

import android.text.TextUtils;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import java.util.Locale;

/* renamed from: com.ss.android.lark.passport.infra.base.network.e */
public class C49081e {
    /* renamed from: a */
    public static String m193468a() {
        return ServiceFinder.m193752g().getRequestId();
    }

    /* renamed from: c */
    public static String m193470c() {
        return ServiceFinder.m193751f().getOldHost();
    }

    /* renamed from: b */
    public static String m193469b() {
        Locale locale;
        if (ServiceFinder.m193748c() != null) {
            locale = ServiceFinder.m193752g().getLanguageSetting();
        } else {
            locale = null;
        }
        String str = "";
        if (locale == null || TextUtils.isEmpty(locale.getLanguage()) || TextUtils.isEmpty(locale.getCountry())) {
            return str;
        }
        StringBuilder sb = new StringBuilder(locale.getLanguage());
        sb.append("_");
        if (!TextUtils.isEmpty(locale.getCountry())) {
            str = locale.getCountry();
        }
        sb.append(str);
        String sb2 = sb.toString();
        if (TextUtils.isEmpty(sb2) || !sb2.equals("in_ID")) {
            return sb2;
        }
        return "id_ID";
    }
}
