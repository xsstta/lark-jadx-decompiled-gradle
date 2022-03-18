package com.bumptech.glide.util;

import android.text.TextUtils;
import java.util.Collection;
import java.util.Objects;

/* renamed from: com.bumptech.glide.util.j */
public final class C2567j {
    /* renamed from: a */
    public static <T> T m10894a(T t) {
        return (T) m10895a(t, "Argument must not be null");
    }

    /* renamed from: a */
    public static String m10896a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    /* renamed from: a */
    public static <T extends Collection<Y>, Y> T m10897a(T t) {
        if (!t.isEmpty()) {
            return t;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }

    /* renamed from: a */
    public static <T> T m10895a(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    /* renamed from: a */
    public static void m10898a(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }
}
