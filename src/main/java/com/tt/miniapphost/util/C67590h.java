package com.tt.miniapphost.util;

import android.app.Application;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.tt.miniapp.util.C67043j;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.data.ContextSingletonInstance;
import com.tt.miniapphost.host.HostDependManager;
import java.lang.reflect.Array;
import java.util.regex.Pattern;

/* renamed from: com.tt.miniapphost.util.h */
public class C67590h {
    /* renamed from: b */
    private static boolean m263084b(int i) {
        return i == 0 || i == 8 || i == 4;
    }

    /* renamed from: a */
    public static void m263077a(View view, int i, int i2, int i3, int i4) {
        ViewGroup.LayoutParams layoutParams;
        if (view != null && (layoutParams = view.getLayoutParams()) != null && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            m263078a(view, (ViewGroup.MarginLayoutParams) layoutParams, i, i2, i3, i4);
        }
    }

    /* renamed from: a */
    private static void m263078a(View view, ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2, int i3, int i4) {
        if (view != null && marginLayoutParams != null) {
            if (marginLayoutParams.leftMargin != i || marginLayoutParams.topMargin != i2 || marginLayoutParams.rightMargin != i3 || marginLayoutParams.bottomMargin != i4) {
                if (i != -3) {
                    marginLayoutParams.leftMargin = i;
                }
                if (i2 != -3) {
                    marginLayoutParams.topMargin = i2;
                }
                if (i3 != -3) {
                    marginLayoutParams.rightMargin = i3;
                }
                if (i4 != -3) {
                    marginLayoutParams.bottomMargin = i4;
                }
                view.setLayoutParams(marginLayoutParams);
            }
        }
    }

    /* renamed from: a */
    public static void m263076a(View view) {
        if (view != null && view.getParent() != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                try {
                    ((ViewGroup) parent).removeView(view);
                } catch (Exception e) {
                    AppBrandLogger.stacktrace(6, "UIUtils", e.getStackTrace());
                }
            }
        }
    }

    /* renamed from: a */
    public static final boolean m263079a(View view, int i) {
        if (view == null || view.getVisibility() == i || !m263084b(i)) {
            return false;
        }
        view.setVisibility(i);
        return true;
    }

    /* renamed from: a */
    public static void m263074a(Context context, View view) {
        m263075a(context, view, (Runnable) null);
    }

    /* renamed from: a */
    public static void m263075a(final Context context, final View view, final Runnable runnable) {
        if (context != null && view != null && !HostDependManager.getInst().interceptSetTitleBarMargin(context, view)) {
            view.post(new Runnable() {
                /* class com.tt.miniapphost.util.C67590h.RunnableC675911 */

                public void run() {
                    C67590h.m263083b(context, view, runnable);
                }
            });
        }
    }

    /* renamed from: c */
    public static boolean m263089c(String str) {
        return Pattern.matches("^#([0-9a-fA-F]{8}|[0-9a-fA-F]{6}|[0-9a-fA-F]{3})$", str);
    }

    /* renamed from: d */
    public static int m263090d(Context context) {
        return ContextSingletonInstance.getInstance().getDeviceInfo().mo234269d(context);
    }

    /* renamed from: e */
    public static int m263091e(Context context) {
        return ContextSingletonInstance.getInstance().getDeviceInfo().mo234270e(context);
    }

    /* renamed from: a */
    public static final int m263066a(Context context) {
        DisplayMetrics displayMetrics;
        if (context == null || (displayMetrics = context.getResources().getDisplayMetrics()) == null) {
            return 0;
        }
        return displayMetrics.widthPixels;
    }

    /* renamed from: b */
    public static final int m263080b(Context context) {
        DisplayMetrics displayMetrics;
        if (context == null || (displayMetrics = context.getResources().getDisplayMetrics()) == null) {
            return 0;
        }
        return displayMetrics.heightPixels;
    }

    /* renamed from: c */
    public static void m263088c(View view) {
        if (view != null) {
            try {
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(view);
                }
            } catch (Exception e) {
                AppBrandLogger.m52828d("UIUtils", e);
            }
        }
    }

    /* renamed from: b */
    public static int m263082b(String str) throws IllegalColorException {
        try {
            return Color.parseColor(str);
        } catch (IllegalArgumentException unused) {
            throw new IllegalColorException("illegal color " + str);
        }
    }

    /* renamed from: c */
    public static int m263086c(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            Class.forName("android.view.Display").getMethod("getRealMetrics", DisplayMetrics.class).invoke(defaultDisplay, displayMetrics);
            return displayMetrics.heightPixels;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: a */
    public static int m263068a(String str) throws RuntimeException {
        if (str != null) {
            int length = str.length();
            StringBuilder sb = new StringBuilder("#");
            if (length == 7 || length == 9) {
                sb.append(str.substring(1, 7));
                return Color.parseColor(sb.toString());
            }
            throw new IllegalArgumentException("Unknown color");
        }
        throw new IllegalArgumentException("Unknown color");
    }

    /* renamed from: b */
    public static final boolean m263085b(View view) {
        if (view != null && view.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static String m263073a(int i) {
        Application applicationContext = AppbrandContext.getInst().getApplicationContext();
        if (applicationContext == null) {
            return "";
        }
        return applicationContext.getResources().getString(i);
    }

    /* renamed from: a */
    public static ColorStateList m263070a(int i, int i2) {
        return m263071a(i, i2, i2, i);
    }

    /* renamed from: a */
    public static float m263065a(Context context, float f) {
        return (f * context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    /* renamed from: b */
    public static int m263081b(Context context, float f) {
        return (int) ((f / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: c */
    public static int m263087c(Context context, float f) {
        return (int) TypedValue.applyDimension(2, f, context.getResources().getDisplayMetrics());
    }

    /* renamed from: a */
    public static int m263067a(Context context, boolean z) {
        float f;
        float f2;
        if (z) {
            f = (float) 0;
            f2 = m263065a(context, 14.0f);
        } else {
            f = (float) C67043j.m261285g(context);
            f2 = m263065a(context, (float) BitmapDescriptorFactory.HUE_RED);
        }
        return ((int) m263065a(context, 44.0f)) + ((int) (f + f2));
    }

    /* renamed from: a */
    public static int m263069a(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Color.parseColor(str);
            } catch (Exception e) {
                AppBrandLogger.eWithThrowable("UIUtils", "illegal color " + str, e);
            }
        }
        return Color.parseColor(str2);
    }

    /* renamed from: b */
    public static void m263083b(Context context, View view, Runnable runnable) {
        boolean z;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (context.getResources().getConfiguration().orientation == 2) {
            z = true;
        } else {
            z = false;
        }
        int a = m263067a(context, z);
        if (a != layoutParams.height) {
            layoutParams.height = a;
            view.requestLayout();
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* renamed from: a */
    public static Bitmap m263072a(Bitmap bitmap, float f, int i) {
        int[] iArr;
        int i2 = i;
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, Math.round(((float) bitmap.getWidth()) * f), Math.round(((float) bitmap.getHeight()) * f), false);
        Bitmap copy = createScaledBitmap.copy(createScaledBitmap.getConfig(), true);
        if (i2 < 1) {
            return null;
        }
        int width = copy.getWidth();
        int height = copy.getHeight();
        int i3 = width * height;
        int[] iArr2 = new int[i3];
        Log.e("pix", width + " " + height + " " + i3);
        copy.getPixels(iArr2, 0, width, 0, 0, width, height);
        int i4 = width + -1;
        int i5 = height + -1;
        int i6 = i2 + i2 + 1;
        int[] iArr3 = new int[i3];
        int[] iArr4 = new int[i3];
        int[] iArr5 = new int[i3];
        int[] iArr6 = new int[Math.max(width, height)];
        int i7 = (i6 + 1) >> 1;
        int i8 = i7 * i7;
        int i9 = i8 * DynamicModule.f58006b;
        int[] iArr7 = new int[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            iArr7[i10] = i10 / i8;
        }
        int[] iArr8 = new int[2];
        iArr8[1] = 3;
        iArr8[0] = i6;
        int[][] iArr9 = (int[][]) Array.newInstance(int.class, iArr8);
        int i11 = i2 + 1;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i12 < height) {
            int i15 = -i2;
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            int i24 = 0;
            while (i15 <= i2) {
                int i25 = iArr2[i13 + Math.min(i4, Math.max(i15, 0))];
                int[] iArr10 = iArr9[i15 + i2];
                iArr10[0] = (i25 & 16711680) >> 16;
                iArr10[1] = (i25 & 65280) >> 8;
                iArr10[2] = i25 & 255;
                int abs = i11 - Math.abs(i15);
                i16 += iArr10[0] * abs;
                i17 += iArr10[1] * abs;
                i18 += iArr10[2] * abs;
                if (i15 > 0) {
                    i22 += iArr10[0];
                    i23 += iArr10[1];
                    i24 += iArr10[2];
                } else {
                    i19 += iArr10[0];
                    i20 += iArr10[1];
                    i21 += iArr10[2];
                }
                i15++;
                i5 = i5;
                iArr6 = iArr6;
            }
            int i26 = i2;
            int i27 = 0;
            while (i27 < width) {
                iArr3[i13] = iArr7[i16];
                iArr4[i13] = iArr7[i17];
                iArr5[i13] = iArr7[i18];
                int i28 = i16 - i19;
                int i29 = i17 - i20;
                int i30 = i18 - i21;
                int[] iArr11 = iArr9[((i26 - i2) + i6) % i6];
                int i31 = i19 - iArr11[0];
                int i32 = i20 - iArr11[1];
                int i33 = i21 - iArr11[2];
                if (i12 == 0) {
                    iArr = iArr7;
                    iArr6[i27] = Math.min(i27 + i2 + 1, i4);
                } else {
                    iArr = iArr7;
                }
                int i34 = iArr2[i14 + iArr6[i27]];
                iArr11[0] = (i34 & 16711680) >> 16;
                iArr11[1] = (i34 & 65280) >> 8;
                iArr11[2] = i34 & 255;
                int i35 = i22 + iArr11[0];
                int i36 = i23 + iArr11[1];
                int i37 = i24 + iArr11[2];
                i16 = i28 + i35;
                i17 = i29 + i36;
                i18 = i30 + i37;
                i26 = (i26 + 1) % i6;
                int[] iArr12 = iArr9[i26 % i6];
                i19 = i31 + iArr12[0];
                i20 = i32 + iArr12[1];
                i21 = i33 + iArr12[2];
                i22 = i35 - iArr12[0];
                i23 = i36 - iArr12[1];
                i24 = i37 - iArr12[2];
                i13++;
                i27++;
                iArr7 = iArr;
            }
            i14 += width;
            i12++;
            i3 = i3;
            height = height;
            i5 = i5;
            iArr6 = iArr6;
        }
        int i38 = i5;
        int i39 = height;
        int i40 = 0;
        while (i40 < width) {
            int i41 = -i2;
            int i42 = 0;
            int i43 = 0;
            int i44 = 0;
            int i45 = 0;
            int i46 = 0;
            int i47 = 0;
            int i48 = 0;
            int i49 = i41;
            int i50 = i41 * width;
            int i51 = 0;
            int i52 = 0;
            while (i49 <= i2) {
                int max = Math.max(0, i50) + i40;
                int[] iArr13 = iArr9[i49 + i2];
                iArr13[0] = iArr3[max];
                iArr13[1] = iArr4[max];
                iArr13[2] = iArr5[max];
                int abs2 = i11 - Math.abs(i49);
                i51 += iArr3[max] * abs2;
                i52 += iArr4[max] * abs2;
                i42 += iArr5[max] * abs2;
                if (i49 > 0) {
                    i46 += iArr13[0];
                    i47 += iArr13[1];
                    i48 += iArr13[2];
                } else {
                    i43 += iArr13[0];
                    i44 += iArr13[1];
                    i45 += iArr13[2];
                }
                if (i49 < i38) {
                    i50 += width;
                }
                i49++;
                i38 = i38;
                width = width;
            }
            int i53 = i2;
            int i54 = i40;
            int i55 = i42;
            int i56 = i52;
            int i57 = i51;
            int i58 = 0;
            while (i58 < i39) {
                iArr2[i54] = (iArr2[i54] & -16777216) | (iArr7[i57] << 16) | (iArr7[i56] << 8) | iArr7[i55];
                int i59 = i57 - i43;
                int i60 = i56 - i44;
                int i61 = i55 - i45;
                int[] iArr14 = iArr9[((i53 - i2) + i6) % i6];
                int i62 = i43 - iArr14[0];
                int i63 = i44 - iArr14[1];
                int i64 = i45 - iArr14[2];
                if (i40 == 0) {
                    iArr6[i58] = Math.min(i58 + i11, i38) * width;
                }
                int i65 = iArr6[i58] + i40;
                iArr14[0] = iArr3[i65];
                iArr14[1] = iArr4[i65];
                iArr14[2] = iArr5[i65];
                int i66 = i46 + iArr14[0];
                int i67 = i47 + iArr14[1];
                int i68 = i48 + iArr14[2];
                i57 = i59 + i66;
                i56 = i60 + i67;
                i55 = i61 + i68;
                i53 = (i53 + 1) % i6;
                int[] iArr15 = iArr9[i53];
                i43 = i62 + iArr15[0];
                i44 = i63 + iArr15[1];
                i45 = i64 + iArr15[2];
                i46 = i66 - iArr15[0];
                i47 = i67 - iArr15[1];
                i48 = i68 - iArr15[2];
                i54 += width;
                i58++;
                i2 = i;
            }
            i40++;
            i2 = i;
            i38 = i38;
            i39 = i39;
            i6 = i6;
            iArr2 = iArr2;
            width = width;
        }
        Log.e("pix", width + " " + i39 + " " + i3);
        copy.setPixels(iArr2, 0, width, 0, 0, width, i39);
        return copy;
    }

    /* renamed from: a */
    public static ColorStateList m263071a(int i, int i2, int i3, int i4) {
        int[] iArr = {i2, i3, i, i3, i4, i};
        return new ColorStateList(new int[][]{new int[]{16842919, 16842910}, new int[]{16842910, 16842908}, new int[]{16842910}, new int[]{16842908}, new int[]{16842909}, new int[0]}, iArr);
    }
}
