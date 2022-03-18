package com.lynx.tasm.utils;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.kit.nglynx.log.LynxKitALogDelegate;
import java.lang.reflect.Field;

/* renamed from: com.lynx.tasm.utils.d */
public class C26947d {

    /* renamed from: a */
    private static Field f66899a;

    /* renamed from: b */
    private static Field f66900b;

    static {
        try {
            Field declaredField = StaticLayout.class.getDeclaredField("mLines");
            f66899a = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = StaticLayout.class.getDeclaredField("mColumns");
            f66900b = declaredField2;
            declaredField2.setAccessible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m97912a(Layout layout, CharSequence charSequence) {
        int lineCount;
        int i;
        int ellipsisStart;
        if (layout != null && !TextUtils.isEmpty(charSequence) && (lineCount = layout.getLineCount()) != 0 && (ellipsisStart = layout.getEllipsisStart(lineCount - 1)) >= 0 && Character.isLowSurrogate(charSequence.charAt(ellipsisStart))) {
            int i2 = ellipsisStart + 1;
            if (layout instanceof StaticLayout) {
                try {
                    ((int[]) f66899a.get(layout))[(((Integer) f66900b.get(layout)).intValue() * i) + 5] = i2;
                } catch (Exception e) {
                    Log.e(LynxKitALogDelegate.f38587a, "HuaWei emoji err", e);
                    e.printStackTrace();
                }
            }
        }
    }
}
