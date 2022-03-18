package com.huawei.secure.android.common.p1021a.p1024c.p1025a;

import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import com.google.android.gms.stats.CodePackage;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.huawei.secure.android.common.p1021a.p1026d.C23809b;
import com.huawei.secure.android.common.p1021a.p1026d.C23810c;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* renamed from: com.huawei.secure.android.common.a.c.a.a */
public class C23807a {

    /* renamed from: a */
    private static final String f58980a = "a";

    /* renamed from: a */
    private static boolean m87013a() {
        if (Build.VERSION.SDK_INT >= 23) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static synchronized SecretKey m87012a(String str) {
        SecretKey secretKey;
        synchronized (C23807a.class) {
            secretKey = null;
            try {
                KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
                instance.load(null);
                Key key = instance.getKey(str, null);
                if (key == null || !(key instanceof SecretKey)) {
                    KeyGenerator instance2 = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                    instance2.init(new KeyGenParameterSpec.Builder(str, 3).setBlockModes(CodePackage.GCM).setEncryptionPaddings("NoPadding").setKeySize(DynamicModule.f58006b).build());
                    secretKey = instance2.generateKey();
                } else {
                    secretKey = (SecretKey) key;
                }
            } catch (KeyStoreException e) {
                String str2 = f58980a;
                C23810c.m87026b(str2, "KeyStoreException : " + e.getMessage());
            } catch (IOException e2) {
                String str3 = f58980a;
                C23810c.m87026b(str3, "IOException : " + e2.getMessage());
            } catch (CertificateException e3) {
                String str4 = f58980a;
                C23810c.m87026b(str4, "CertificateException : " + e3.getMessage());
            } catch (NoSuchAlgorithmException e4) {
                String str5 = f58980a;
                C23810c.m87026b(str5, "NoSuchAlgorithmException : " + e4.getMessage());
            } catch (UnrecoverableKeyException e5) {
                String str6 = f58980a;
                C23810c.m87026b(str6, "UnrecoverableKeyException : " + e5.getMessage());
            } catch (InvalidAlgorithmParameterException e6) {
                String str7 = f58980a;
                C23810c.m87026b(str7, "InvalidAlgorithmParameterException : " + e6.getMessage());
            } catch (NoSuchProviderException e7) {
                String str8 = f58980a;
                C23810c.m87026b(str8, "NoSuchProviderException : " + e7.getMessage());
            } catch (Exception e8) {
                String str9 = f58980a;
                C23810c.m87026b(str9, "Exception: " + e8.getMessage());
            }
        }
        return secretKey;
    }

    /* renamed from: a */
    public static String m87011a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            C23810c.m87026b(f58980a, "alias or encrypt content is null");
            return "";
        }
        try {
            return C23809b.m87022a(m87014a(str, str2.getBytes("UTF-8")));
        } catch (UnsupportedEncodingException e) {
            String str3 = f58980a;
            C23810c.m87026b(str3, "encrypt: UnsupportedEncodingException : " + e.getMessage());
            return "";
        }
    }

    /* renamed from: b */
    public static String m87015b(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            C23810c.m87026b(f58980a, "alias or encrypt content is null");
            return "";
        }
        try {
            return new String(m87016b(str, C23809b.m87023a(str2)), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            String str3 = f58980a;
            C23810c.m87026b(str3, "decrypt: UnsupportedEncodingException : " + e.getMessage());
            return "";
        }
    }

    /* renamed from: b */
    public static byte[] m87016b(String str, byte[] bArr) {
        byte[] bArr2 = new byte[0];
        if (TextUtils.isEmpty(str) || bArr == null) {
            C23810c.m87026b(f58980a, "alias or encrypt content is null");
            return bArr2;
        } else if (!m87013a()) {
            C23810c.m87026b(f58980a, "sdk version is too low");
            return bArr2;
        } else if (bArr.length <= 12) {
            C23810c.m87026b(f58980a, "Decrypt source data is invalid.");
            return bArr2;
        } else {
            SecretKey a = m87012a(str);
            if (a == null) {
                C23810c.m87026b(f58980a, "Decrypt secret key is null");
                return bArr2;
            }
            byte[] copyOf = Arrays.copyOf(bArr, 12);
            try {
                Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
                instance.init(2, a, new GCMParameterSpec(SmActions.ACTION_ONTHECALL_EXIT, copyOf));
                return instance.doFinal(bArr, 12, bArr.length - 12);
            } catch (NoSuchAlgorithmException e) {
                String str2 = f58980a;
                C23810c.m87026b(str2, "NoSuchAlgorithmException : " + e.getMessage());
                return bArr2;
            } catch (NoSuchPaddingException e2) {
                String str3 = f58980a;
                C23810c.m87026b(str3, "NoSuchPaddingException : " + e2.getMessage());
                return bArr2;
            } catch (InvalidKeyException e3) {
                String str4 = f58980a;
                C23810c.m87026b(str4, "InvalidKeyException : " + e3.getMessage());
                return bArr2;
            } catch (InvalidAlgorithmParameterException e4) {
                String str5 = f58980a;
                C23810c.m87026b(str5, "InvalidAlgorithmParameterException : " + e4.getMessage());
                return bArr2;
            } catch (IllegalBlockSizeException e5) {
                String str6 = f58980a;
                C23810c.m87026b(str6, "IllegalBlockSizeException : " + e5.getMessage());
                return bArr2;
            } catch (BadPaddingException e6) {
                String str7 = f58980a;
                C23810c.m87026b(str7, "BadPaddingException : " + e6.getMessage());
                return bArr2;
            } catch (Exception e7) {
                String str8 = f58980a;
                C23810c.m87026b(str8, "Exception: " + e7.getMessage());
                return bArr2;
            }
        }
    }

    /* renamed from: a */
    public static byte[] m87014a(String str, byte[] bArr) {
        byte[] bArr2 = new byte[0];
        if (TextUtils.isEmpty(str) || bArr == null) {
            C23810c.m87026b(f58980a, "alias or encrypt content is null");
            return bArr2;
        } else if (!m87013a()) {
            C23810c.m87026b(f58980a, "sdk version is too low");
            return bArr2;
        } else {
            try {
                Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
                SecretKey a = m87012a(str);
                if (a == null) {
                    C23810c.m87026b(f58980a, "Encrypt secret key is null");
                    return bArr2;
                }
                instance.init(1, a);
                byte[] doFinal = instance.doFinal(bArr);
                byte[] iv = instance.getIV();
                if (iv != null) {
                    if (iv.length == 12) {
                        byte[] copyOf = Arrays.copyOf(iv, iv.length + doFinal.length);
                        System.arraycopy(doFinal, 0, copyOf, iv.length, doFinal.length);
                        return copyOf;
                    }
                }
                C23810c.m87026b(f58980a, "IV is invalid.");
                return bArr2;
            } catch (NoSuchAlgorithmException e) {
                String str2 = f58980a;
                C23810c.m87026b(str2, "NoSuchAlgorithmException : " + e.getMessage());
                return bArr2;
            } catch (NoSuchPaddingException e2) {
                String str3 = f58980a;
                C23810c.m87026b(str3, "NoSuchPaddingException : " + e2.getMessage());
                return bArr2;
            } catch (BadPaddingException e3) {
                String str4 = f58980a;
                C23810c.m87026b(str4, "BadPaddingException : " + e3.getMessage());
                return bArr2;
            } catch (IllegalBlockSizeException e4) {
                String str5 = f58980a;
                C23810c.m87026b(str5, "IllegalBlockSizeException : " + e4.getMessage());
                return bArr2;
            } catch (InvalidKeyException e5) {
                String str6 = f58980a;
                C23810c.m87026b(str6, "InvalidKeyException : " + e5.getMessage());
                return bArr2;
            } catch (Exception e6) {
                String str7 = f58980a;
                C23810c.m87026b(str7, "Exception: " + e6.getMessage());
                return bArr2;
            }
        }
    }
}
