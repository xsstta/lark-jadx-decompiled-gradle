package com.lynx.tasm.utils;

import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.lynx.tasm.base.LLog;

/* renamed from: com.lynx.tasm.utils.n */
public class C26960n {
    /* renamed from: a */
    public static float m97974a(String str) {
        return m97975a(str, BitmapDescriptorFactory.HUE_RED);
    }

    /* renamed from: a */
    public static float m97975a(String str, float f) {
        return m97977a(str, (float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED, f);
    }

    /* renamed from: a */
    public static float m97980a(String str, float f, float f2, DisplayMetrics displayMetrics) {
        int i;
        float f3;
        if (TextUtils.isEmpty(str)) {
            i = 0;
        } else {
            i = str.length();
        }
        if (i > 1) {
            try {
                if (str.endsWith("%")) {
                    f3 = (Float.parseFloat(str.substring(0, i - 1)) * f) / 100.0f;
                    return f3;
                }
            } catch (Throwable unused) {
                LLog.m96427d("lynx", "Number parse error from value = " + str + " to px!");
                return f2;
            }
        }
        f3 = m97978a(str, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f2, displayMetrics);
        return f3;
    }

    /* renamed from: a */
    public static float m97976a(String str, float f, float f2, float f3, float f4) {
        return m97978a(str, f, f2, f3, f4, BitmapDescriptorFactory.HUE_RED, DisplayMetricsHolder.m97898a());
    }

    /* renamed from: a */
    public static float m97977a(String str, float f, float f2, float f3, float f4, float f5) {
        return m97978a(str, f, f2, f3, f4, f5, DisplayMetricsHolder.m97898a());
    }

    /* renamed from: a */
    public static float m97979a(String str, float f, float f2, float f3, float f4, DisplayMetrics displayMetrics) {
        return m97978a(str, f, f2, f3, f4, BitmapDescriptorFactory.HUE_RED, displayMetrics);
    }

    /* renamed from: a */
    public static float m97978a(String str, float f, float f2, float f3, float f4, float f5, DisplayMetrics displayMetrics) {
        int i;
        if (TextUtils.isEmpty(str)) {
            i = 0;
        } else {
            i = str.length();
        }
        if (i > 3) {
            try {
                if (str.endsWith("rpx")) {
                    return (((float) displayMetrics.widthPixels) * Float.parseFloat(str.substring(0, i - 3))) / 750.0f;
                }
            } catch (Throwable unused) {
                LLog.m96427d("lynx", "Number parse error from value = " + str + " to px!");
                return f5;
            }
        }
        if (i > 3 && str.endsWith("ppx")) {
            return Float.parseFloat(str.substring(0, i - 3));
        }
        if (i > 2 && str.endsWith("px")) {
            return C26955i.m97952a(Float.parseFloat(str.substring(0, i - 2)));
        }
        if (i > 1 && str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, i - 1)) / 100.0f;
        }
        if (i > 3 && str.endsWith("rem")) {
            return f * Float.parseFloat(str.substring(0, i - 3));
        }
        if (i > 2 && str.endsWith("em")) {
            return f2 * Float.parseFloat(str.substring(0, i - 2));
        }
        if (i > 2 && str.endsWith("vw")) {
            return (f3 * Float.parseFloat(str.substring(0, i - 2))) / 100.0f;
        }
        if (i > 2 && str.endsWith("vh")) {
            return (f4 * Float.parseFloat(str.substring(0, i - 2))) / 100.0f;
        }
        if (i > 0) {
            return Float.parseFloat(str);
        }
        return f5;
    }
}
