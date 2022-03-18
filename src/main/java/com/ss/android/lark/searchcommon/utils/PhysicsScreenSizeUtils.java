package com.ss.android.lark.searchcommon.utils;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.ss.android.lark.utils.LarkContext;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/searchcommon/utils/PhysicsScreenSizeUtils;", "", "()V", "getScreenInches", "", "getScreenXInches", "", "getScreenYInches", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.utils.a */
public final class PhysicsScreenSizeUtils {

    /* renamed from: a */
    public static final PhysicsScreenSizeUtils f133386a = new PhysicsScreenSizeUtils();

    private PhysicsScreenSizeUtils() {
    }

    /* renamed from: a */
    public final float mo184559a() {
        Application application = LarkContext.getApplication();
        Intrinsics.checkExpressionValueIsNotNull(application, "LarkContext.getApplication()");
        Object systemService = application.getApplicationContext().getSystemService("window");
        if (systemService != null) {
            Point point = new Point();
            ((WindowManager) systemService).getDefaultDisplay().getRealSize(point);
            Application application2 = LarkContext.getApplication();
            Intrinsics.checkExpressionValueIsNotNull(application2, "LarkContext.getApplication()");
            Context applicationContext = application2.getApplicationContext();
            Intrinsics.checkExpressionValueIsNotNull(applicationContext, "LarkContext.getApplication().applicationContext");
            Resources resources = applicationContext.getResources();
            Intrinsics.checkExpressionValueIsNotNull(resources, "LarkContext.getApplicati…licationContext.resources");
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            Intrinsics.checkExpressionValueIsNotNull(displayMetrics, "LarkContext.getApplicati….resources.displayMetrics");
            return ((float) point.x) / displayMetrics.xdpi;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.WindowManager");
    }

    /* renamed from: b */
    public final float mo184560b() {
        Application application = LarkContext.getApplication();
        Intrinsics.checkExpressionValueIsNotNull(application, "LarkContext.getApplication()");
        Object systemService = application.getApplicationContext().getSystemService("window");
        if (systemService != null) {
            Point point = new Point();
            ((WindowManager) systemService).getDefaultDisplay().getRealSize(point);
            Application application2 = LarkContext.getApplication();
            Intrinsics.checkExpressionValueIsNotNull(application2, "LarkContext.getApplication()");
            Context applicationContext = application2.getApplicationContext();
            Intrinsics.checkExpressionValueIsNotNull(applicationContext, "LarkContext.getApplication().applicationContext");
            Resources resources = applicationContext.getResources();
            Intrinsics.checkExpressionValueIsNotNull(resources, "LarkContext.getApplicati…licationContext.resources");
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            Intrinsics.checkExpressionValueIsNotNull(displayMetrics, "LarkContext.getApplicati….resources.displayMetrics");
            return ((float) point.y) / displayMetrics.ydpi;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.WindowManager");
    }
}
