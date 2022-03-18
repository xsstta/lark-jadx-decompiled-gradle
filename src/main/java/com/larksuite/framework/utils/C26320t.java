package com.larksuite.framework.utils;

import java.io.File;
import java.io.FileInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.larksuite.framework.utils.t */
public class C26320t {
    /* renamed from: a */
    public static String m95318a(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    MessageDigest instance = MessageDigest.getInstance("MD5");
                    instance.update(str.getBytes("UTF-8"));
                    return m95319a(instance.digest());
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public static String m95317a(File file) {
        Throwable th;
        Exception e;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        if (file == null || !file.isFile()) {
            return null;
        }
        byte[] bArr = new byte[1024];
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            fileInputStream = new FileInputStream(file);
            while (true) {
                try {
                    int read = fileInputStream.read(bArr, 0, 1024);
                    if (read == -1) {
                        break;
                    }
                    instance.update(bArr, 0, read);
                } catch (Exception e2) {
                    e = e2;
                    try {
                        e.printStackTrace();
                        C26314q.m95296a(fileInputStream);
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream2 = fileInputStream;
                        C26314q.m95296a(fileInputStream2);
                        throw th;
                    }
                }
            }
            C26314q.m95296a(fileInputStream);
            String bigInteger = new BigInteger(1, instance.digest()).toString(16);
            while (bigInteger.length() < 32) {
                bigInteger = "0" + bigInteger;
            }
            return bigInteger;
        } catch (Exception e3) {
            e = e3;
            fileInputStream = null;
            e.printStackTrace();
            C26314q.m95296a(fileInputStream);
            return null;
        } catch (Throwable th3) {
            th = th3;
            C26314q.m95296a(fileInputStream2);
            throw th;
        }
    }

    /* renamed from: a */
    public static String m95319a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.reset();
            instance.update(bArr);
            byte[] digest = instance.digest();
            for (int i = 0; i < digest.length; i++) {
                if (Integer.toHexString(digest[i] & 255).length() == 1) {
                    stringBuffer.append("0");
                    stringBuffer.append(Integer.toHexString(digest[i] & 255));
                } else {
                    stringBuffer.append(Integer.toHexString(digest[i] & 255));
                }
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return stringBuffer.toString();
    }
}
