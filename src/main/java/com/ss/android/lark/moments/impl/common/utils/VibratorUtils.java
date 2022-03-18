package com.ss.android.lark.moments.impl.common.utils;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/moments/impl/common/utils/VibratorUtils;", "", "()V", "vibrate", "", "context", "Landroid/content/Context;", "time", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.common.utils.l */
public final class VibratorUtils {

    /* renamed from: a */
    public static final VibratorUtils f119257a = new VibratorUtils();

    private VibratorUtils() {
    }

    /* renamed from: a */
    public final void mo166220a(Context context, long j) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Object systemService = context.getSystemService("vibrator");
        if (systemService != null) {
            Vibrator vibrator = (Vibrator) systemService;
            if (Build.VERSION.SDK_INT >= 26) {
                vibrator.vibrate(VibrationEffect.createOneShot(j, -1));
            } else {
                vibrator.vibrate(j);
            }
        } else {
            throw new TypeCastException("null cannot be cast to non-null type android.os.Vibrator");
        }
    }
}
