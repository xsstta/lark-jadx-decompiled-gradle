package com.ss.android.lark.utils;

import android.text.TextUtils;
import com.huawei.hms.feature.dynamic.DynamicModule;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.apache.commons.codec.p3491a.C69743a;
import org.apache.commons.codec.p3492b.C69745a;

/* renamed from: com.ss.android.lark.utils.q */
public class C57859q {

    /* renamed from: a */
    private static final String f142487a;

    /* renamed from: b */
    private static final String f142488b;

    /* renamed from: c */
    private static final String f142489c;

    static {
        String str = new String(C69743a.m267688a(C69745a.m267697b("ee")));
        f142487a = str;
        f142488b = str.substring(str.length() - 6);
        f142489c = str.substring(0, 6);
    }

    /* renamed from: c */
    public static String m224567c(String str) {
        String str2 = new String(C69743a.m267688a(C69745a.m267697b(str + "42b91e")));
        return new String(C69743a.m267688a(C69745a.m267699c("08a441" + str2)));
    }

    /* renamed from: a */
    public static String m224565a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String str2 = new String(C69743a.m267688a(C69745a.m267697b(str + f142488b)));
        return new String(C69743a.m267688a(C69745a.m267699c(f142489c + str2)));
    }

    /* renamed from: b */
    public static String m224566b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String str2 = "littleapp" + str;
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(str2.getBytes());
            byte[] digest = instance.digest(str.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(Integer.toString((b & 255) + DynamicModule.f58006b, 16).substring(1));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }
}
