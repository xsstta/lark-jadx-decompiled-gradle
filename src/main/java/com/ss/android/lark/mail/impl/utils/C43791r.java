package com.ss.android.lark.mail.impl.utils;

import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.network.NetworkChangeListener;

/* renamed from: com.ss.android.lark.mail.impl.utils.r */
public class C43791r {
    /* renamed from: b */
    public static NetworkChangeListener.NetworkLevel m173559b() {
        return C41816b.m166115a().mo150112B().mo150174a();
    }

    /* renamed from: a */
    public static boolean m173558a() {
        NetworkChangeListener.NetworkLevel b = m173559b();
        if (b == NetworkChangeListener.NetworkLevel.SERVICE_UNAVAILABLE || b == NetworkChangeListener.NetworkLevel.NET_UNAVAILABLE) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m173557a(NetworkChangeListener networkChangeListener) {
        C41816b.m166115a().mo150112B().mo150175a(networkChangeListener);
    }

    /* renamed from: b */
    public static void m173560b(NetworkChangeListener networkChangeListener) {
        C41816b.m166115a().mo150112B().mo150176b(networkChangeListener);
    }
}
