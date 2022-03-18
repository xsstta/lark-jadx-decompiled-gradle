package com.ss.android.lark.watermark.mysterious;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import com.ss.android.lark.watermark.p2925b.C58247c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ.\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/watermark/mysterious/MysteriousWatermarkPainter;", "", "()V", "bitmapToDrawable", "Landroid/graphics/drawable/BitmapDrawable;", "context", "Landroid/content/Context;", "watermark", "Landroid/graphics/Bitmap;", "createWatermarkBitmap", "text", "", "textSize", "", "backgroundColor", "alpha", "", "drawMysteriousWatermarkOnBitmap", "", "target", "core_watermark_watermark_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.watermark.mysterious.d */
public final class MysteriousWatermarkPainter {
    /* renamed from: a */
    public final BitmapDrawable mo197410a(Context context, Bitmap bitmap) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(bitmap, "watermark");
        BitmapDrawable a = C58247c.m225943a(context, bitmap);
        Intrinsics.checkExpressionValueIsNotNull(a, "WatermarkDrawableCreator…wable(context, watermark)");
        return a;
    }

    /* renamed from: a */
    public final void mo197411a(Bitmap bitmap, Bitmap bitmap2) {
        Intrinsics.checkParameterIsNotNull(bitmap, "watermark");
        Intrinsics.checkParameterIsNotNull(bitmap2, "target");
        Canvas canvas = new Canvas(bitmap2);
        Paint paint = new Paint();
        int i = 0;
        while (i < bitmap2.getWidth()) {
            int i2 = 0;
            while (i2 < bitmap2.getHeight()) {
                canvas.drawBitmap(bitmap, (float) i, (float) i2, paint);
                i2 += bitmap.getHeight();
            }
            i += bitmap.getWidth();
        }
    }

    /* renamed from: a */
    public final Bitmap mo197409a(Context context, String str, int i, int i2, float f) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "text");
        Bitmap a = C58247c.m225939a(context, str, i, i2, f);
        Intrinsics.checkExpressionValueIsNotNull(a, "bitmap");
        return a;
    }
}
