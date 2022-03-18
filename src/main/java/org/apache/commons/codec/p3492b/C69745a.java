package org.apache.commons.codec.p3492b;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.apache.commons.codec.p3491a.C69744b;

/* renamed from: org.apache.commons.codec.b.a */
public class C69745a {
    /* renamed from: a */
    public static MessageDigest m267693a() {
        return m267694a("MD5");
    }

    /* renamed from: b */
    public static MessageDigest m267696b() {
        return m267694a("SHA-1");
    }

    /* renamed from: a */
    public static MessageDigest m267694a(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: b */
    public static byte[] m267697b(String str) {
        return m267695a(C69744b.m267691a(str));
    }

    /* renamed from: c */
    public static byte[] m267699c(String str) {
        return m267698b(C69744b.m267691a(str));
    }

    /* renamed from: a */
    public static byte[] m267695a(byte[] bArr) {
        return m267693a().digest(bArr);
    }

    /* renamed from: b */
    public static byte[] m267698b(byte[] bArr) {
        return m267696b().digest(bArr);
    }
}
