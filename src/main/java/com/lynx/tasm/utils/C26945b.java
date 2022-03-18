package com.lynx.tasm.utils;

import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.lynx.tasm.base.LLog;

/* renamed from: com.lynx.tasm.utils.b */
public class C26945b {
    /* renamed from: a */
    public static float m97907a(float f) {
        if (f >= -3.4028235E38f && f <= Float.MAX_VALUE) {
            return f;
        }
        if (f < -3.4028235E38f || f == Float.NEGATIVE_INFINITY) {
            return -3.4028235E38f;
        }
        if (f > Float.MAX_VALUE || f == Float.POSITIVE_INFINITY) {
            return Float.MAX_VALUE;
        }
        if (Float.isNaN(f)) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        LLog.m96427d("lynx", "Invalid float property value: " + f);
        return BitmapDescriptorFactory.HUE_RED;
    }

    /* renamed from: a */
    public static boolean m97908a(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            if (!Float.isNaN(f) || !Float.isNaN(f2)) {
                return false;
            }
            return true;
        } else if (Math.abs(f2 - f) < 1.0E-5f) {
            return true;
        } else {
            return false;
        }
    }
}
