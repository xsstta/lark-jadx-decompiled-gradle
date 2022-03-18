package com.ss.android.lark.floating.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import com.ss.android.floatbubble.util.RomUtils;
import com.ss.android.lark.log.Log;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0016\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\nJ\u0016\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\nJ\u000e\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\nJ\u000e\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020!R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/ss/android/lark/floating/utils/DisplayUtils;", "", "()V", "TAG", "", "dp2px", "", "context", "Landroid/content/Context;", "dpVal", "", "getNavigationBarCurrentHeight", "getNavigationBarHeight", "getScreenHeight", "getScreenSize", "Landroid/graphics/Point;", "getScreenWidth", "getStatusBarHeight", "hasNavigationBar", "", "isHasNavigationBar", "isHuaWeiHideNav", "isMiuiFullScreen", "isVivoFullScreen", "px2dp", "pxVal", "px2sp", "pxValue", "rejectedNavHeight", "sp2px", "spValue", "statusBarHeight", "view", "Landroid/view/View;", "float_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.floating.d.c */
public final class DisplayUtils {

    /* renamed from: a */
    public static final DisplayUtils f98497a = new DisplayUtils();

    private DisplayUtils() {
    }

    /* renamed from: g */
    private final boolean m150960g(Context context) {
        int i;
        if (Build.VERSION.SDK_INT < 21) {
            i = Settings.System.getInt(context.getContentResolver(), "navigationbar_is_min", 0);
        } else {
            i = Settings.Global.getInt(context.getContentResolver(), "navigationbar_is_min", 0);
        }
        if (i != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final int mo140264a(View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Context context = view.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "view.context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkExpressionValueIsNotNull(applicationContext, "view.context.applicationContext");
        return mo140266b(applicationContext);
    }

    /* renamed from: b */
    public final int mo140266b(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: d */
    public final int mo140268d(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (mo140269e(context)) {
            return mo140267c(context);
        }
        return 0;
    }

    /* renamed from: e */
    public final boolean mo140269e(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (mo140267c(context) == 0) {
            return false;
        }
        if (!RomUtils.m104303c() || !m150960g(context)) {
            return m150961h(context);
        }
        return false;
    }

    /* renamed from: f */
    public final int mo140270f(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Point a = mo140265a(context);
        if (a.x > a.y) {
            return a.y;
        }
        return a.y - mo140268d(context);
    }

    /* renamed from: a */
    public final Point mo140265a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Point point = new Point();
        Object systemService = context.getSystemService("window");
        if (systemService != null) {
            ((WindowManager) systemService).getDefaultDisplay().getRealSize(point);
            return point;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.WindowManager");
    }

    /* renamed from: c */
    public final int mo140267c(Context context) {
        int i;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            i = resources.getDimensionPixelSize(identifier);
        } else {
            i = 0;
        }
        Log.m165379d("DisplayUtils--->", "getNavigationBarHeight = " + i);
        return i;
    }

    /* renamed from: h */
    private final boolean m150961h(Context context) {
        Object systemService = context.getSystemService("window");
        if (systemService != null) {
            Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            if (Build.VERSION.SDK_INT >= 17) {
                defaultDisplay.getRealMetrics(displayMetrics);
            }
            int i = displayMetrics.heightPixels;
            int i2 = displayMetrics.widthPixels;
            DisplayMetrics displayMetrics2 = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics2);
            int i3 = displayMetrics2.heightPixels;
            int i4 = displayMetrics2.widthPixels;
            if (mo140267c(context) + i3 > i) {
                return false;
            }
            if (i2 - i4 > 0 || i - i3 > 0) {
                return true;
            }
            return false;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.WindowManager");
    }
}
