package com.huawei.agconnect.p1009a.p1010a;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* access modifiers changed from: package-private */
/* renamed from: com.huawei.agconnect.a.a.f */
public class C23406f implements AbstractC23402b {

    /* renamed from: a */
    private final Context f57721a;

    /* renamed from: b */
    private final String f57722b;

    C23406f(Context context, String str) {
        this.f57721a = context;
        this.f57722b = str;
    }

    /* renamed from: a */
    private static String m84943a(String str) {
        try {
            return "agc_" + C23403c.m84934a(m84944a(str.getBytes("UTF-8")));
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException unused) {
            return "";
        }
    }

    /* renamed from: a */
    private static byte[] m84944a(byte[] bArr) throws NoSuchAlgorithmException {
        return MessageDigest.getInstance("SHA-256").digest(bArr);
    }

    @Override // com.huawei.agconnect.p1009a.p1010a.AbstractC23402b
    /* renamed from: a */
    public String mo81790a(String str, String str2) {
        int identifier;
        String a = m84943a(str);
        if (TextUtils.isEmpty(a) || (identifier = this.f57721a.getResources().getIdentifier(a, "string", this.f57722b)) == 0) {
            return str2;
        }
        try {
            return this.f57721a.getResources().getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return str2;
        }
    }
}
