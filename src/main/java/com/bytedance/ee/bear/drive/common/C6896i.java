package com.bytedance.ee.bear.drive.common;

import com.bytedance.ee.util.io.C13675f;
import com.bytedance.ee.util.p718t.C13749l;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.bytedance.ee.bear.drive.common.i */
public final class C6896i {
    /* renamed from: a */
    public static int m27267a() {
        return C13749l.m55748b() * C13749l.m55736a() * 20;
    }

    /* renamed from: b */
    public static int m27270b() {
        return C13749l.m55748b() * C13749l.m55736a() * 2;
    }

    /* renamed from: a */
    public static boolean m27269a(String str) {
        if (C13675f.m55525d(str) < 31457280) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m27272c(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return false;
        }
        if (i / i2 > 2 || i2 / i > 2) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m27268a(int i, int i2) {
        if (i * i2 > m27270b()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m27271b(int i, int i2) {
        if (i * i2 < m27267a()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static int m27273d(int i, int i2) {
        int i3 = 1;
        while ((i * i2) / (i3 * i3) > m27270b()) {
            i3 *= 2;
        }
        return i3;
    }

    /* renamed from: a */
    public static float m27266a(int i, int i2, float f, float f2) {
        if (f == BitmapDescriptorFactory.HUE_RED || f2 == BitmapDescriptorFactory.HUE_RED || i == 0 || i2 == 0 || !m27272c((int) f2, (int) f)) {
            return 2.0f;
        }
        if (f2 > f) {
            return ((float) i) / f;
        }
        return ((float) i2) / f2;
    }
}
