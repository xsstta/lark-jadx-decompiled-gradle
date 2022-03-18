package com.ss.android.lark.calendar.impl.features.calendarview.days.util;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.calendar.impl.features.calendarview.days.data.DragDrawChipViewData;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.log.Log;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u001a\u0010\f\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u000bJ\u001e\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0011J$\u0010\u0012\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0013\u001a\u00020\bJ\f\u0010\u0014\u001a\u00020\b*\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/days/util/ChipsBitmapUtil;", "", "()V", "TAG", "", "mPaint", "Landroid/graphics/Paint;", "cropChip", "Landroid/graphics/Bitmap;", "bitmap", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/data/DragDrawChipViewData;", "drawChip", "drawChipsBitmap", "", "preBitmap", "chipData", "", "drawCropChip", "cropBitmap", "clear", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.d.b */
public final class ChipsBitmapUtil {

    /* renamed from: a */
    public static final ChipsBitmapUtil f77181a = new ChipsBitmapUtil();

    /* renamed from: b */
    private static final Paint f77182b = new Paint(2);

    private ChipsBitmapUtil() {
    }

    /* renamed from: a */
    private final Bitmap m114502a(Bitmap bitmap) {
        Canvas canvas = new Canvas();
        canvas.setBitmap(bitmap);
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        return bitmap;
    }

    /* renamed from: a */
    public final Bitmap mo111132a(Bitmap bitmap, DragDrawChipViewData eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (bitmap != null) {
            Canvas canvas = new Canvas();
            canvas.setBitmap(bitmap);
            eVar.mo110961a(canvas);
        }
        return bitmap;
    }

    /* renamed from: a */
    public final void mo111134a(Bitmap bitmap, List<DragDrawChipViewData> list) {
        Intrinsics.checkParameterIsNotNull(list, "chipData");
        if (bitmap != null) {
            m114502a(bitmap);
            Canvas canvas = new Canvas();
            canvas.setBitmap(bitmap);
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                it.next().mo110961a(canvas);
            }
            return;
        }
        Log.m165383e("ChipsBitmapUtil", C32673y.m125378d("preBitmap = null"));
    }

    /* renamed from: b */
    public final Bitmap mo111135b(Bitmap bitmap, DragDrawChipViewData eVar) {
        if (!(bitmap == null || eVar == null)) {
            try {
                return Bitmap.createBitmap(bitmap, eVar.mo110977j(), eVar.mo110976i(), eVar.mo110973g(), eVar.mo110974h(), (Matrix) null, false);
            } catch (Exception e) {
                Log.m165383e("ChipsBitmapUtil", C32673y.m125378d("cropChip: [" + bitmap.getWidth() + ", " + bitmap.getHeight() + "]; [" + eVar.mo110977j() + ", " + eVar.mo110976i() + ", " + eVar.mo110973g() + ", " + eVar.mo110974h() + "]; " + e));
            }
        }
        return null;
    }

    /* renamed from: a */
    public final Bitmap mo111133a(Bitmap bitmap, DragDrawChipViewData eVar, Bitmap bitmap2) {
        Intrinsics.checkParameterIsNotNull(bitmap2, "cropBitmap");
        if (bitmap == null || eVar == null) {
            return null;
        }
        Canvas canvas = new Canvas();
        canvas.setBitmap(bitmap);
        canvas.drawBitmap(bitmap2, (float) eVar.mo110977j(), (float) eVar.mo110976i(), f77182b);
        return bitmap;
    }
}
