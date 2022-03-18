package com.larksuite.component.blockit.p1067b;

import android.text.TextUtils;
import com.larksuite.component.blockit.AbstractC24049b;
import com.larksuite.component.blockit.entity.BlockitEnv;
import com.larksuite.framework.http.request.HttpHeaders;
import java.util.Locale;

/* renamed from: com.larksuite.component.blockit.b.a */
public class C24050a {

    /* renamed from: a */
    private static String f59452a = "XN0YXJ0-a8da7d90-9b05-4ad0-9f16-b22ac409410g-WVuZA";

    /* renamed from: b */
    private static AbstractC24049b f59453b;

    /* renamed from: c */
    public static BlockitEnv m87868c() {
        AbstractC24049b bVar = f59453b;
        if (bVar != null) {
            return bVar.getEnv();
        }
        return BlockitEnv.STAGING;
    }

    /* renamed from: a */
    public static String m87865a() {
        AbstractC24049b bVar = f59453b;
        if (bVar != null) {
            String session = bVar.getSession();
            if (!TextUtils.isEmpty(session)) {
                return session;
            }
        }
        return f59452a;
    }

    /* renamed from: b */
    public static String m87867b() {
        Locale locale;
        AbstractC24049b bVar = f59453b;
        if (bVar == null || (locale = bVar.getLocale()) == null) {
            return null;
        }
        return locale.getLanguage().toLowerCase() + "-" + locale.getCountry().toUpperCase();
    }

    /* renamed from: d */
    public static HttpHeaders m87869d() {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.put("Cookie", "session=" + m87865a());
        httpHeaders.put("Accept-Language", m87867b());
        return httpHeaders;
    }

    /* renamed from: a */
    public static void m87866a(AbstractC24049b bVar) {
        f59453b = bVar;
    }
}
