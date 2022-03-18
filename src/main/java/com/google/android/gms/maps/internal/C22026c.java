package com.google.android.gms.maps.internal;

/* renamed from: com.google.android.gms.maps.internal.c */
public final class C22026c {
    /* renamed from: a */
    public static Boolean m79513a(byte b) {
        if (b == 0) {
            return Boolean.FALSE;
        }
        if (b != 1) {
            return null;
        }
        return Boolean.TRUE;
    }

    /* renamed from: a */
    public static byte m79512a(Boolean bool) {
        if (bool != null) {
            return bool.booleanValue() ? (byte) 1 : 0;
        }
        return -1;
    }
}
