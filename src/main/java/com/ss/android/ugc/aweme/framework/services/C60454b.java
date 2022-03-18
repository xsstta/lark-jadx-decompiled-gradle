package com.ss.android.ugc.aweme.framework.services;

import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.Objects;

/* renamed from: com.ss.android.ugc.aweme.framework.services.b */
public final class C60454b {

    /* renamed from: a */
    private static final Double f151057a = Double.valueOf(0.0d);

    /* renamed from: b */
    private static final Float f151058b = Float.valueOf((float) BitmapDescriptorFactory.HUE_RED);

    /* renamed from: a */
    public static <T> T m234889a(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    /* renamed from: a */
    public static <T> T m234888a(Class<T> cls) {
        m234889a((Object) cls);
        if (cls == Boolean.TYPE) {
            return (T) Boolean.FALSE;
        }
        if (cls == Character.TYPE) {
            return (T) 0;
        }
        if (cls == Byte.TYPE) {
            return (T) (byte) 0;
        }
        if (cls == Short.TYPE) {
            return (T) 0;
        }
        if (cls == Integer.TYPE) {
            return (T) 0;
        }
        if (cls == Long.TYPE) {
            return (T) 0L;
        }
        if (cls == Float.TYPE) {
            return (T) f151058b;
        }
        if (cls == Double.TYPE) {
            return (T) f151057a;
        }
        return null;
    }
}
