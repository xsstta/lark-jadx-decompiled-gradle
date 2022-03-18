package com.android.volley;

import com.android.volley.AbstractC1921a;

/* renamed from: com.android.volley.j */
public class C1936j<T> {

    /* renamed from: a */
    public final T f6613a;

    /* renamed from: b */
    public final AbstractC1921a.C1922a f6614b;

    /* renamed from: c */
    public final VolleyError f6615c;

    /* renamed from: d */
    public boolean f6616d;

    /* renamed from: com.android.volley.j$a */
    public interface AbstractC1937a {
        void onErrorResponse(VolleyError volleyError);
    }

    /* renamed from: com.android.volley.j$b */
    public interface AbstractC1938b<T> {
        void onResponse(T t);
    }

    /* renamed from: a */
    public boolean mo9814a() {
        if (this.f6615c == null) {
            return true;
        }
        return false;
    }

    private C1936j(VolleyError volleyError) {
        this.f6615c = volleyError;
    }

    /* renamed from: a */
    public static <T> C1936j<T> m8593a(VolleyError volleyError) {
        return new C1936j<>(volleyError);
    }

    private C1936j(T t, AbstractC1921a.C1922a aVar) {
        this.f6613a = t;
        this.f6614b = aVar;
    }

    /* renamed from: a */
    public static <T> C1936j<T> m8594a(T t, AbstractC1921a.C1922a aVar) {
        return new C1936j<>(t, aVar);
    }
}
