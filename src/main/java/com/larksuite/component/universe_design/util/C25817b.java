package com.larksuite.component.universe_design.util;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import androidx.core.graphics.drawable.C0774a;
import java.lang.reflect.Field;

/* renamed from: com.larksuite.component.universe_design.util.b */
public class C25817b {

    /* renamed from: a */
    public static final Rect f63879a = new Rect();

    /* renamed from: b */
    private static final int[] f63880b = {16842912};

    /* renamed from: c */
    private static final int[] f63881c = new int[0];

    /* renamed from: d */
    private static Class<?> f63882d;

    static {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                f63882d = Class.forName("android.graphics.Insets");
            } catch (ClassNotFoundException unused) {
            }
        }
    }

    /* renamed from: a */
    public static Rect m93299a(Drawable drawable) {
        if (f63882d != null) {
            try {
                Drawable h = C0774a.m3780h(drawable);
                Object invoke = h.getClass().getMethod("getOpticalInsets", new Class[0]).invoke(h, new Object[0]);
                if (invoke != null) {
                    Rect rect = new Rect();
                    Field[] fields = f63882d.getFields();
                    for (Field field : fields) {
                        String name = field.getName();
                        char c = 65535;
                        switch (name.hashCode()) {
                            case -1383228885:
                                if (name.equals("bottom")) {
                                    c = 3;
                                    break;
                                }
                                break;
                            case 115029:
                                if (name.equals("top")) {
                                    c = 1;
                                    break;
                                }
                                break;
                            case 3317767:
                                if (name.equals("left")) {
                                    c = 0;
                                    break;
                                }
                                break;
                            case 108511772:
                                if (name.equals("right")) {
                                    c = 2;
                                    break;
                                }
                                break;
                        }
                        if (c == 0) {
                            rect.left = field.getInt(invoke);
                        } else if (c == 1) {
                            rect.top = field.getInt(invoke);
                        } else if (c == 2) {
                            rect.right = field.getInt(invoke);
                        } else if (c == 3) {
                            rect.bottom = field.getInt(invoke);
                        }
                    }
                    return rect;
                }
            } catch (Exception unused) {
                Log.e("DrawableUtils", "Couldn't obtain the optical insets. Ignoring.");
            }
        }
        return f63879a;
    }
}
