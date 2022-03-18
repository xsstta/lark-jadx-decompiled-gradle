package com.bytedance.kit.nglynx.util;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.os.LocaleList;
import android.view.Display;
import android.view.WindowManager;
import com.lynx.tasm.base.LLog;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0018J\u0016\u0010 \u001a\u00020\u00122\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u0017\u001a\u00020\u0018R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\b\u0010\nR\u0011\u0010\u000b\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\f\u0010\u0007R\u0011\u0010\r\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0007R\u0011\u0010\u000f\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0007R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0007¨\u0006#"}, d2 = {"Lcom/bytedance/kit/nglynx/util/DevicesUtil;", "", "()V", "TAG", "", "brand", "getBrand", "()Ljava/lang/String;", "isHuawei", "", "()Z", "language", "getLanguage", "model", "getModel", "platform", "getPlatform", "sStatusBarHeight", "", "system", "getSystem", "getDisplay", "Landroid/view/Display;", "context", "Landroid/content/Context;", "getPixelRadio", "", "getScreenHight", "getScreenRotation", "getScreenWidth", "getStatusBarHeight", "isScreenPortrait", "px2dp", "px", "", "x-lynx-kit_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.kit.nglynx.g.b */
public final class DevicesUtil {

    /* renamed from: a */
    public static final DevicesUtil f38615a = new DevicesUtil();

    /* renamed from: b */
    private static int f38616b;

    /* renamed from: c */
    public final String mo53825c() {
        return "Android";
    }

    private DevicesUtil() {
    }

    /* renamed from: a */
    public final String mo53821a() {
        String str = Build.MODEL;
        Intrinsics.checkExpressionValueIsNotNull(str, "Build.MODEL");
        return str;
    }

    /* renamed from: b */
    public final String mo53823b() {
        String str = Build.VERSION.RELEASE;
        Intrinsics.checkExpressionValueIsNotNull(str, "Build.VERSION.RELEASE");
        return str;
    }

    /* renamed from: d */
    public final String mo53826d() {
        Locale locale;
        if (Build.VERSION.SDK_INT >= 24) {
            locale = LocaleList.getDefault().get(0);
            Intrinsics.checkExpressionValueIsNotNull(locale, "LocaleList.getDefault()[0]");
        } else {
            locale = Locale.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.getDefault()");
        }
        return locale.getLanguage() + "-" + locale.getCountry();
    }

    /* renamed from: d */
    private final Display m59031d(Context context) {
        WindowManager windowManager;
        if (context instanceof Activity) {
            windowManager = ((Activity) context).getWindowManager();
        } else {
            Object systemService = context.getSystemService("window");
            if (systemService != null) {
                windowManager = (WindowManager) systemService;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.view.WindowManager");
            }
        }
        if (windowManager != null) {
            return windowManager.getDefaultDisplay();
        }
        return null;
    }

    /* renamed from: a */
    public final int mo53820a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Display d = m59031d(context);
        if (d == null) {
            return 0;
        }
        try {
            Point point = new Point();
            d.getSize(point);
            return point.y;
        } catch (Exception e) {
            LLog.m96429e("DevicesUtil", e.getMessage());
            return 0;
        }
    }

    /* renamed from: b */
    public final int mo53822b(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Display d = m59031d(context);
        if (d == null) {
            return 0;
        }
        try {
            Point point = new Point();
            d.getSize(point);
            return point.x;
        } catch (Exception e) {
            LLog.m96429e("DevicesUtil", e.getMessage());
            return 0;
        }
    }

    /* renamed from: c */
    public final int mo53824c(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        int i = f38616b;
        if (i > 0) {
            return i;
        }
        if (ConcaveScreenUtils.f38610a.mo53814a(context)) {
            int a = (int) UIUtils.f38617a.mo53827a(context, (float) 27);
            f38616b = a;
            return a;
        } else if (ConcaveScreenUtils.f38610a.mo53817c(context)) {
            int d = ConcaveScreenUtils.f38610a.mo53818d(context);
            f38616b = d;
            return d;
        } else {
            int i2 = 0;
            int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
            if (identifier > 0) {
                i2 = context.getResources().getDimensionPixelOffset(identifier);
            }
            if (i2 == 0) {
                i2 = (int) UIUtils.f38617a.mo53827a(context, 25.0f);
            }
            f38616b = i2;
            return i2;
        }
    }

    /* renamed from: a */
    public final int mo53819a(double d, Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Resources resources = context.getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources, "context.resources");
        return (int) ((d / ((double) resources.getDisplayMetrics().density)) + ((double) 0.5f));
    }
}
