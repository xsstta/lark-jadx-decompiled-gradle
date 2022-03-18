package com.ss.android.vc.irtc.utils;

/* renamed from: com.ss.android.vc.irtc.utils.a */
public class C61073a {
    /* renamed from: a */
    public static byte[] m237504a(Object obj) {
        return m237506c(Reflect.m237492a(obj).mo211284a("getPublicKey").mo211286a());
    }

    /* renamed from: b */
    public static byte[] m237505b(Object obj) {
        return m237506c(Reflect.m237492a(obj).mo211284a("getPrivateKey").mo211286a());
    }

    /* renamed from: c */
    public static byte[] m237506c(Object obj) {
        return (byte[]) Reflect.m237492a(obj).mo211284a("toBytes").mo211286a();
    }
}
