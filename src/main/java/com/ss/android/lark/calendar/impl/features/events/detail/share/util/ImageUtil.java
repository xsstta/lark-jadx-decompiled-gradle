package com.ss.android.lark.calendar.impl.features.events.detail.share.util;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.ss.android.lark.log.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/share/util/ImageUtil;", "", "()V", "byteToBitmap", "Landroid/graphics/Bitmap;", "imageData", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.share.b.b */
public final class ImageUtil {

    /* renamed from: a */
    public static final ImageUtil f79500a = new ImageUtil();

    private ImageUtil() {
    }

    /* renamed from: a */
    public final Bitmap mo113951a(byte[] bArr) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(bArr, "imageData");
        if (bArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        try {
            return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        } catch (Throwable th) {
            Log.m165383e("ImageUtil", "byteToBitmap decode bitmap failed：" + th.getMessage());
            return null;
        }
    }
}
