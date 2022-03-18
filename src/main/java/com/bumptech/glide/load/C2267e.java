package com.bumptech.glide.load;

import com.bumptech.glide.util.C2567j;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.e */
public final class C2267e<T> {

    /* renamed from: a */
    private static final AbstractC2269a<Object> f7601a = new AbstractC2269a<Object>() {
        /* class com.bumptech.glide.load.C2267e.C22681 */

        @Override // com.bumptech.glide.load.C2267e.AbstractC2269a
        /* renamed from: a */
        public void mo10637a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    };

    /* renamed from: b */
    private final T f7602b;

    /* renamed from: c */
    private final AbstractC2269a<T> f7603c;

    /* renamed from: d */
    private final String f7604d;

    /* renamed from: e */
    private volatile byte[] f7605e;

    /* renamed from: com.bumptech.glide.load.e$a */
    public interface AbstractC2269a<T> {
        /* renamed from: a */
        void mo10637a(byte[] bArr, T t, MessageDigest messageDigest);
    }

    /* renamed from: c */
    private static <T> AbstractC2269a<T> m9713c() {
        return (AbstractC2269a<T>) f7601a;
    }

    /* renamed from: a */
    public T mo10632a() {
        return this.f7602b;
    }

    public int hashCode() {
        return this.f7604d.hashCode();
    }

    /* renamed from: b */
    private byte[] m9712b() {
        if (this.f7605e == null) {
            this.f7605e = this.f7604d.getBytes(AbstractC2265c.f7599a);
        }
        return this.f7605e;
    }

    public String toString() {
        return "Option{key='" + this.f7604d + '\'' + '}';
    }

    /* renamed from: a */
    public static <T> C2267e<T> m9709a(String str) {
        return new C2267e<>(str, null, m9713c());
    }

    public boolean equals(Object obj) {
        if (obj instanceof C2267e) {
            return this.f7604d.equals(((C2267e) obj).f7604d);
        }
        return false;
    }

    /* renamed from: a */
    public static <T> C2267e<T> m9710a(String str, T t) {
        return new C2267e<>(str, t, m9713c());
    }

    /* renamed from: a */
    public void mo10633a(T t, MessageDigest messageDigest) {
        this.f7603c.mo10637a(m9712b(), t, messageDigest);
    }

    /* renamed from: a */
    public static <T> C2267e<T> m9711a(String str, T t, AbstractC2269a<T> aVar) {
        return new C2267e<>(str, t, aVar);
    }

    private C2267e(String str, T t, AbstractC2269a<T> aVar) {
        this.f7604d = C2567j.m10896a(str);
        this.f7602b = t;
        this.f7603c = (AbstractC2269a) C2567j.m10894a(aVar);
    }
}
