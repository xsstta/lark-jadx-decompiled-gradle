package com.google.android.datatransport;

/* renamed from: com.google.android.datatransport.c */
public abstract class AbstractC21350c<T> {
    /* renamed from: a */
    public abstract Integer mo72493a();

    /* renamed from: b */
    public abstract T mo72494b();

    /* renamed from: c */
    public abstract Priority mo72495c();

    /* renamed from: a */
    public static <T> AbstractC21350c<T> m77290a(T t) {
        return new C21348a(null, t, Priority.DEFAULT);
    }

    /* renamed from: b */
    public static <T> AbstractC21350c<T> m77291b(T t) {
        return new C21348a(null, t, Priority.VERY_LOW);
    }
}
