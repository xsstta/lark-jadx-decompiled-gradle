package com.huawei.secure.android.common.p1021a.p1023b;

import android.text.TextUtils;
import com.huawei.secure.android.common.p1021a.p1026d.C23809b;
import com.huawei.secure.android.common.p1021a.p1026d.C23810c;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.huawei.secure.android.common.a.b.b */
public final class C23806b {

    /* renamed from: a */
    private static final String f58978a = "b";

    /* renamed from: b */
    private static final String[] f58979b = {"SHA-256", "SHA-384", "SHA-512"};

    private C23806b() {
    }

    /* renamed from: a */
    public static String m87008a(String str) {
        return m87009a(str, "SHA-256");
    }

    /* renamed from: b */
    private static boolean m87010b(String str) {
        for (String str2 : f58979b) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static String m87009a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            C23810c.m87026b(f58978a, "content or algorithm is null.");
            return "";
        } else if (!m87010b(str2)) {
            C23810c.m87026b(f58978a, "algorithm is not safe or legal");
            return "";
        } else {
            try {
                MessageDigest instance = MessageDigest.getInstance(str2);
                instance.update(str.getBytes("UTF-8"));
                return C23809b.m87022a(instance.digest());
            } catch (UnsupportedEncodingException unused) {
                C23810c.m87026b(f58978a, "Error in generate SHA UnsupportedEncodingException");
                return "";
            } catch (NoSuchAlgorithmException unused2) {
                C23810c.m87026b(f58978a, "Error in generate SHA NoSuchAlgorithmException");
                return "";
            }
        }
    }
}
