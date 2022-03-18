package com.zackratos.ultimatebarx.ultimatebarx.p3442c;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import androidx.core.content.ContextCompat;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\f\u0010\r\u001a\u00020\u0001*\u00020\u0002H\u0001\u001a\u0014\u0010\u000e\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0002\u001a\u0016\u0010\u0011\u001a\u00020\u0006*\u00020\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u0006H\u0001\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0005\u001a\u00020\u0006*\u00020\u00028@X\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0018\u0010\t\u001a\u00020\u0006*\u00020\u00028AX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\b\"\u0018\u0010\u000b\u001a\u00020\u0006*\u00020\u00028@X\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\b¨\u0006\u0013"}, d2 = {"landscape", "", "Landroid/content/Context;", "getLandscape", "(Landroid/content/Context;)Z", "navigationBarHeight", "", "getNavigationBarHeight", "(Landroid/content/Context;)I", "screenHeight", "getScreenHeight", "statusBarHeight", "getStatusBarHeight", "commonNavigationBarExist", "getBarHeight", "name", "", "getColorInt", "colorRes", "ultimatebarx_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.zackratos.ultimatebarx.ultimatebarx.c.b */
public final class C68099b {
    /* renamed from: a */
    public static final int m264686a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "$this$statusBarHeight");
        return m264688a(context, "status_bar_height");
    }

    /* renamed from: b */
    public static final int m264689b(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "$this$navigationBarHeight");
        return m264688a(context, "navigation_bar_height");
    }

    /* renamed from: c */
    public static final boolean m264690c(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "$this$landscape");
        Resources resources = context.getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources, "resources");
        if (resources.getConfiguration().orientation == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static final int m264691d(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "$this$screenHeight");
        Object systemService = context.getSystemService("window");
        if (systemService != null) {
            Point point = new Point();
            ((WindowManager) systemService).getDefaultDisplay().getRealSize(point);
            return point.y;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.WindowManager");
    }

    /* renamed from: e */
    public static final boolean m264692e(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "$this$commonNavigationBarExist");
        Object systemService = context.getSystemService("window");
        if (systemService != null) {
            Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getRealMetrics(displayMetrics);
            int i = displayMetrics.heightPixels;
            int i2 = displayMetrics.widthPixels;
            DisplayMetrics displayMetrics2 = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics2);
            int i3 = displayMetrics2.heightPixels;
            if (i2 - displayMetrics2.widthPixels > 0 || i - i3 > 0) {
                return true;
            }
            return false;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.WindowManager");
    }

    /* renamed from: a */
    public static final int m264687a(Context context, int i) {
        Intrinsics.checkParameterIsNotNull(context, "$this$getColorInt");
        return ContextCompat.getColor(context, i);
    }

    /* renamed from: a */
    private static final int m264688a(Context context, String str) {
        return context.getResources().getDimensionPixelSize(context.getResources().getIdentifier(str, "dimen", "android"));
    }
}
