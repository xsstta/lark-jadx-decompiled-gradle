package org.apache.commons.lang3.math;

import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: org.apache.commons.lang3.math.a */
public class C69883a {

    /* renamed from: a */
    public static final Long f174706a = 0L;

    /* renamed from: b */
    public static final Long f174707b = 1L;

    /* renamed from: c */
    public static final Long f174708c = -1L;

    /* renamed from: d */
    public static final Integer f174709d = 0;

    /* renamed from: e */
    public static final Integer f174710e = 1;

    /* renamed from: f */
    public static final Integer f174711f = -1;

    /* renamed from: g */
    public static final Short f174712g = 0;

    /* renamed from: h */
    public static final Short f174713h = 1;

    /* renamed from: i */
    public static final Short f174714i = -1;

    /* renamed from: j */
    public static final Byte f174715j = (byte) 0;

    /* renamed from: k */
    public static final Byte f174716k = (byte) 1;

    /* renamed from: l */
    public static final Byte f174717l = (byte) -1;

    /* renamed from: m */
    public static final Double f174718m = Double.valueOf(0.0d);

    /* renamed from: n */
    public static final Double f174719n = Double.valueOf(1.0d);

    /* renamed from: o */
    public static final Double f174720o = Double.valueOf(-1.0d);

    /* renamed from: p */
    public static final Float f174721p = Float.valueOf((float) BitmapDescriptorFactory.HUE_RED);

    /* renamed from: q */
    public static final Float f174722q = Float.valueOf(1.0f);

    /* renamed from: r */
    public static final Float f174723r = Float.valueOf(-1.0f);

    /* renamed from: a */
    public static int m268185a(byte b, byte b2) {
        return b - b2;
    }

    /* renamed from: a */
    public static int m268186a(int i, int i2) {
        if (i == i2) {
            return 0;
        }
        return i < i2 ? -1 : 1;
    }

    /* renamed from: a */
    public static int m268187a(long j, long j2) {
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i == 0) {
            return 0;
        }
        return i < 0 ? -1 : 1;
    }

    /* renamed from: a */
    public static int m268188a(short s, short s2) {
        if (s == s2) {
            return 0;
        }
        return s < s2 ? -1 : 1;
    }

    /* renamed from: a */
    public static float m268184a(String str, float f) {
        if (str == null) {
            return f;
        }
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            return f;
        }
    }
}
