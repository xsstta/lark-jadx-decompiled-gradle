package com.huawei.hms.device;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.support.log.common.Base64;
import com.huawei.hms.utils.IOUtils;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.huawei.hms.device.a */
public class C23533a {
    /* renamed from: a */
    public static boolean m85320a(List<X509Certificate> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (!m85315a(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m85319a(X509Certificate x509Certificate, byte[] bArr, byte[] bArr2) {
        try {
            Signature instance = Signature.getInstance(x509Certificate.getSigAlgName());
            instance.initVerify(x509Certificate.getPublicKey());
            instance.update(bArr);
            return instance.verify(bArr2);
        } catch (InvalidKeyException | NoSuchAlgorithmException | SignatureException e) {
            HMSLog.m86964e("X509CertUtil", "failed checkSignature : " + e.getMessage());
            return false;
        }
    }

    /* renamed from: a */
    public static X509Certificate m85311a(Context context) {
        return m85312a(context, "052root");
    }

    /* renamed from: b */
    public static List<X509Certificate> m85321b(String str) {
        return m85322b(m85325c(str));
    }

    /* renamed from: a */
    public static boolean m85315a(X509Certificate x509Certificate) {
        if (x509Certificate == null || x509Certificate.getBasicConstraints() == -1) {
            return false;
        }
        boolean[] keyUsage = x509Certificate.getKeyUsage();
        if (5 < keyUsage.length) {
            return keyUsage[5];
        }
        return false;
    }

    /* renamed from: a */
    public static X509Certificate m85313a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return m85314a(Base64.decode(str));
        } catch (IllegalArgumentException e) {
            HMSLog.m86964e("X509CertUtil", "getCert failed : " + e.getMessage());
            return null;
        }
    }

    /* renamed from: b */
    public static List<X509Certificate> m85322b(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            arrayList.add(m85313a(str));
        }
        return arrayList;
    }

    /* renamed from: c */
    public static List<String> m85325c(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() <= 1) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList(jSONArray.length());
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
            return arrayList;
        } catch (JSONException e) {
            HMSLog.m86964e("X509CertUtil", "Failed to getCertChain: " + e.getMessage());
            return Collections.emptyList();
        }
    }

    /* renamed from: a */
    public static X509Certificate m85314a(byte[] bArr) {
        try {
            return (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(bArr));
        } catch (CertificateException e) {
            HMSLog.m86964e("X509CertUtil", "Failed to get cert: " + e.getMessage());
            return null;
        }
    }

    /* renamed from: b */
    public static boolean m85323b(X509Certificate x509Certificate, String str) {
        return m85324b(x509Certificate, "OU", str);
    }

    /* renamed from: a */
    public static boolean m85316a(X509Certificate x509Certificate, String str) {
        return m85324b(x509Certificate, "CN", str);
    }

    /* renamed from: a */
    public static String m85310a(String str, String str2) {
        String upperCase = str.toUpperCase(Locale.getDefault());
        int indexOf = upperCase.indexOf(str2 + ContainerUtils.KEY_VALUE_DELIMITER);
        if (indexOf == -1) {
            return null;
        }
        int indexOf2 = str.indexOf(",", indexOf);
        if (indexOf2 != -1) {
            return str.substring(indexOf + str2.length() + 1, indexOf2);
        }
        return str.substring(indexOf + str2.length() + 1);
    }

    /* renamed from: a */
    public static X509Certificate m85312a(Context context, String str) {
        Throwable th;
        Exception e;
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (context == null || TextUtils.isEmpty(str)) {
            HMSLog.m86964e("X509CertUtil", "args are error");
            return null;
        }
        try {
            KeyStore instance = KeyStore.getInstance("bks");
            inputStream = context.getAssets().open("hmsrootcas.bks");
            try {
                instance.load(inputStream, "".toCharArray());
                if (!instance.containsAlias(str)) {
                    HMSLog.m86964e("X509CertUtil", "Not include alias " + str);
                    IOUtils.closeQuietly(inputStream);
                    return null;
                }
                Certificate certificate = instance.getCertificate(str);
                if (certificate instanceof X509Certificate) {
                    X509Certificate x509Certificate = (X509Certificate) certificate;
                    x509Certificate.checkValidity();
                    IOUtils.closeQuietly(inputStream);
                    return x509Certificate;
                }
                IOUtils.closeQuietly(inputStream);
                return null;
            } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e2) {
                e = e2;
                try {
                    HMSLog.m86964e("X509CertUtil", "exception:" + e.getMessage());
                    IOUtils.closeQuietly(inputStream);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    inputStream2 = inputStream;
                    IOUtils.closeQuietly(inputStream2);
                    throw th;
                }
            }
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e3) {
            e = e3;
            inputStream = null;
            HMSLog.m86964e("X509CertUtil", "exception:" + e.getMessage());
            IOUtils.closeQuietly(inputStream);
            return null;
        } catch (Throwable th3) {
            th = th3;
            IOUtils.closeQuietly(inputStream2);
            throw th;
        }
    }

    /* renamed from: a */
    public static boolean m85318a(X509Certificate x509Certificate, List<X509Certificate> list) {
        if (list == null || list.size() == 0) {
            return false;
        }
        if (x509Certificate == null) {
            HMSLog.m86964e("X509CertUtil", "rootCert is null,verify failed ");
            return false;
        }
        PublicKey publicKey = x509Certificate.getPublicKey();
        for (X509Certificate x509Certificate2 : list) {
            if (x509Certificate2 == null) {
                return false;
            }
            try {
                x509Certificate2.verify(publicKey);
                publicKey = x509Certificate2.getPublicKey();
            } catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchProviderException | SignatureException | CertificateException e) {
                HMSLog.m86964e("X509CertUtil", "verify failed " + e.getMessage());
            }
        }
        return m85320a(list);
    }

    /* renamed from: b */
    public static boolean m85324b(X509Certificate x509Certificate, String str, String str2) {
        if (x509Certificate == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        return str2.equals(m85310a(x509Certificate.getSubjectDN().getName(), str));
    }

    /* renamed from: a */
    public static boolean m85317a(X509Certificate x509Certificate, String str, String str2) {
        try {
            return m85319a(x509Certificate, str.getBytes("UTF-8"), Base64.decode(str2));
        } catch (UnsupportedEncodingException | IllegalArgumentException e) {
            HMSLog.m86964e("X509CertUtil", " plainText exception: " + e.getMessage());
            return false;
        }
    }
}
