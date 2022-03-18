package com.bytedance.ee.bear.util.keyboard;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import com.bytedance.ee.log.C13479a;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007¨\u0006\n"}, d2 = {"Lcom/bytedance/ee/bear/util/keyboard/HardKeyboardUtils;", "", "()V", "hasHardKeyboard", "", "context", "Landroid/content/Context;", "isInMultiWindowMode", "activity", "Landroid/app/Activity;", "util_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.q.a.c */
public final class HardKeyboardUtils {

    /* renamed from: a */
    public static final HardKeyboardUtils f28326a = new HardKeyboardUtils();

    private HardKeyboardUtils() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final boolean m43693a(Activity activity) {
        if (activity == null || Build.VERSION.SDK_INT < 24) {
            return false;
        }
        return activity.isInMultiWindowMode();
    }

    @JvmStatic
    /* renamed from: a */
    public static final boolean m43694a(Context context) {
        Integer num;
        if (context == null) {
            return false;
        }
        Resources resources = context.getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources, "context.resources");
        Configuration configuration = resources.getConfiguration();
        StringBuilder sb = new StringBuilder();
        sb.append(" hardKeyboardHidden=");
        Integer num2 = null;
        if (configuration != null) {
            num = Integer.valueOf(configuration.hardKeyboardHidden);
        } else {
            num = null;
        }
        sb.append(num);
        sb.append(" keyboard=");
        if (configuration != null) {
            num2 = Integer.valueOf(configuration.keyboard);
        }
        sb.append(num2);
        C13479a.m54764b("HardKeyboardUtils", sb.toString());
        if (configuration == null || configuration.hardKeyboardHidden != 1) {
            return false;
        }
        if (configuration.keyboard == 2 || configuration.keyboard == 3) {
            return true;
        }
        return false;
    }
}
