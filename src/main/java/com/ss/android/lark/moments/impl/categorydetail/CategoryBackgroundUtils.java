package com.ss.android.lark.moments.impl.categorydetail;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.p036f.p037a.C0989b;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.p1153e.C25653b;
import com.ss.android.lark.utils.ImageUtils;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\u0018\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/moments/impl/categorydetail/CategoryBackgroundUtils;", "", "()V", "getSpecifySat", "", "sat", "getSpecifyVal", "value", "getTopicGroupBackgroundBitmap", "Landroid/graphics/Bitmap;", "oriBitmap", "context", "Landroid/content/Context;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.categorydetail.f */
public final class CategoryBackgroundUtils {

    /* renamed from: a */
    public static final CategoryBackgroundUtils f119124a = new CategoryBackgroundUtils();

    /* renamed from: a */
    private final float m187093a(float f) {
        double d = (double) f;
        if (d < 0.5d) {
            return 0.5f;
        }
        if (d < 0.5d || d > 0.8d) {
            return 0.8f;
        }
        return f;
    }

    /* renamed from: b */
    private final float m187094b(float f) {
        double d = (double) f;
        if (d < 0.3d) {
            return 0.3f;
        }
        if (d < 0.3d || d > 0.5d) {
            return 0.5f;
        }
        return f;
    }

    private CategoryBackgroundUtils() {
    }

    /* renamed from: a */
    public final Bitmap mo165996a(Bitmap bitmap, Context context) {
        Intrinsics.checkParameterIsNotNull(bitmap, "oriBitmap");
        Intrinsics.checkParameterIsNotNull(context, "context");
        C0989b a = C0989b.m4858a(bitmap).mo5042a();
        Intrinsics.checkExpressionValueIsNotNull(a, "Palette.from(oriBitmap).generate()");
        C0989b.C0993c a2 = a.mo5038a();
        if (a2 == null) {
            return null;
        }
        Intrinsics.checkExpressionValueIsNotNull(a2, "palette.dominantSwatch ?: return null");
        float[] b = a2.mo5044b();
        Intrinsics.checkExpressionValueIsNotNull(b, "swatch.hsl");
        int a3 = C25653b.m91893a(Color.HSVToColor(new float[]{b[0], m187093a(b[1]), m187094b(b[2])}), 0.8f);
        int width = bitmap.getWidth() / 4;
        int width2 = bitmap.getWidth() / 2;
        int height = bitmap.getHeight() - width;
        float windowWidth = (((float) UIHelper.getWindowWidth(context)) / 12.0f) / ((float) width2);
        Matrix matrix = new Matrix();
        matrix.postScale(windowWidth, windowWidth);
        Bitmap b2 = ImageUtils.m224137b(context, Bitmap.createBitmap(bitmap, width, width, width2, height, matrix, true), 25);
        Intrinsics.checkExpressionValueIsNotNull(b2, "burlBitmap");
        float windowWidth2 = ((float) UIHelper.getWindowWidth(context)) / ((float) b2.getWidth());
        Matrix matrix2 = new Matrix();
        matrix2.postScale(windowWidth2, windowWidth2);
        Bitmap createBitmap = Bitmap.createBitmap(b2, 0, 0, b2.getWidth(), b2.getHeight(), matrix2, true);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Intrinsics.checkExpressionValueIsNotNull(createBitmap, "zoomBitmap");
        Rect rect = new Rect(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
        Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap.getWidth(), createBitmap.getHeight(), Bitmap.Config.ARGB_4444);
        Canvas canvas = new Canvas(createBitmap2);
        canvas.drawARGB(0, 0, 0, 0);
        canvas.drawBitmap(createBitmap, rect, rect, paint);
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setColor(a3);
        canvas.drawRect(new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) createBitmap.getWidth(), (float) createBitmap.getHeight()), paint2);
        return createBitmap2;
    }
}
