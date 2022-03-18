package com.ss.android.lark.calendar.impl.utils;

import android.app.Application;
import android.content.Context;
import com.ss.android.lark.utils.LarkContext;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/utils/ContextUtils;", "", "()V", "getApplicationContext", "Landroid/content/Context;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.utils.k */
public final class ContextUtils {

    /* renamed from: a */
    public static final ContextUtils f83807a = new ContextUtils();

    private ContextUtils() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final Context m125334a() {
        Application application = LarkContext.getApplication();
        Intrinsics.checkExpressionValueIsNotNull(application, "LarkContext.getApplication()");
        Context applicationContext = application.getApplicationContext();
        Intrinsics.checkExpressionValueIsNotNull(applicationContext, "LarkContext.getApplication().applicationContext");
        return applicationContext;
    }
}
