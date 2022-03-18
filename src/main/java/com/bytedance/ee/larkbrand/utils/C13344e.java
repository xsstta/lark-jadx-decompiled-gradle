package com.bytedance.ee.larkbrand.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;

/* renamed from: com.bytedance.ee.larkbrand.utils.e */
public class C13344e {
    /* renamed from: a */
    public static String m54322a(String str) {
        try {
            if (!TextUtils.isEmpty(str) && str.length() > 7) {
                int parseColor = Color.parseColor(str);
                int i = (parseColor << 24) | (parseColor >>> 8);
                return "#" + Integer.toHexString(i).toUpperCase();
            }
        } catch (IllegalArgumentException e) {
            AppBrandLogger.m52829e("ColorUtil", "rgba2argb error" + e.getMessage());
        }
        return str;
    }

    /* renamed from: a */
    public static int m54321a(int i, Context context) {
        if (String.valueOf(i).startsWith("0X") || String.valueOf(i).startsWith("#")) {
            return i;
        }
        try {
            return context.getResources().getColor(i);
        } catch (Resources.NotFoundException unused) {
            return i;
        }
    }
}
