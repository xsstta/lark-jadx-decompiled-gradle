package com.huawei.agconnect.p1009a.p1010a;

import android.content.Context;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

/* access modifiers changed from: package-private */
/* renamed from: com.huawei.agconnect.a.a.g */
public class C23407g extends C23406f {

    /* renamed from: a */
    private final Map<String, String> f57723a = new HashMap();

    /* renamed from: b */
    private final Object f57724b = new Object();

    /* renamed from: c */
    private SecretKey f57725c;

    C23407g(Context context, String str) {
        super(context, str);
        try {
            String a = m84946a("/AD91D45E3E72DB6989DDCB13287E75061FABCB933D886E6C6ABEF0939B577138");
            String a2 = m84946a("/B314B3BF013DF5AC4134E880AF3D2B7C9FFBE8F0305EAC1C898145E2BCF1F21C");
            String a3 = m84946a("/C767BD8FDF53E53D059BE95B09E2A71056F5F180AECC62836B287ACA5793421B");
            String a4 = m84946a("/DCB3E6D4C2CF80F30D89CDBC412C964DA8381BB84668769391FBCC3E329AD0FD");
            if (a != null && a2 != null && a3 != null && a4 != null) {
                this.f57725c = C23405e.m84939a(C23403c.m84935a(a), C23403c.m84935a(a2), C23403c.m84935a(a3), C23403c.m84935a(a4));
            }
        } catch (NoSuchAlgorithmException | InvalidKeySpecException unused) {
            Log.e("SecurityResourcesReader", "Exception when reading the 'K&I' for 'Config'.");
            this.f57725c = null;
        }
    }

    /* renamed from: a */
    private String m84946a(String str) {
        return super.mo81790a(str, (String) null);
    }

    /* renamed from: a */
    private static byte[] m84947a(SecretKey secretKey, byte[] bArr) throws GeneralSecurityException {
        if (secretKey == null || bArr == null) {
            throw new NullPointerException("key or cipherText must not be null.");
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 1, 17);
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
        instance.init(2, secretKey, new IvParameterSpec(copyOfRange));
        return instance.doFinal(bArr, copyOfRange.length + 1, (bArr.length - copyOfRange.length) - 1);
    }

    @Override // com.huawei.agconnect.p1009a.p1010a.C23406f, com.huawei.agconnect.p1009a.p1010a.AbstractC23402b
    /* renamed from: a */
    public String mo81790a(String str, String str2) {
        if (this.f57725c == null) {
            Log.e("SecurityResourcesReader", "KEY is null return def directly");
            return str2;
        }
        synchronized (this.f57724b) {
            String str3 = this.f57723a.get(str);
            if (str3 != null) {
                return str3;
            }
            String a = m84946a(str);
            if (a == null) {
                return str2;
            }
            try {
                String str4 = new String(m84947a(this.f57725c, C23403c.m84935a(a)), "UTF-8");
                this.f57723a.put(str, str4);
                return str4;
            } catch (UnsupportedEncodingException | GeneralSecurityException unused) {
                Log.e("SecurityResourcesReader", "Exception when reading the 'V' for 'Config'.");
                return str2;
            }
        }
    }
}
