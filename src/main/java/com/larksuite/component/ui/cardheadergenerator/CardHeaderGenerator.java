package com.larksuite.component.ui.cardheadergenerator;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import androidx.core.p028b.C0745a;
import androidx.p036f.p037a.C0989b;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\"\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J \u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0012"}, d2 = {"Lcom/larksuite/component/ui/cardheadergenerator/CardHeaderGenerator;", "", "()V", "clampLightness", "", "lightness", "clampSaturation", "saturation", "createFallbackPlaceholderDrawable", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", "generateHeaderBackgroundBitmap", "Landroid/graphics/Bitmap;", "oriBitmap", "targetWidth", "", "generateHeaderBackgroundDrawable", "card-header-generator_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.larksuite.component.ui.b.a */
public final class CardHeaderGenerator {

    /* renamed from: a */
    public static final CardHeaderGenerator f62500a = new CardHeaderGenerator();

    private CardHeaderGenerator() {
    }

    /* renamed from: a */
    private final float m91672a(float f) {
        return C0745a.m3626a(f, 0.5f, 0.8f);
    }

    /* renamed from: b */
    private final float m91675b(float f) {
        return C0745a.m3626a(f, 0.3f, 0.5f);
    }

    /* renamed from: a */
    private final Drawable m91673a(Context context) {
        Drawable drawable = ContextCompat.getDrawable(context, R.drawable.coretoken_groupshare_bg_placeholder);
        if (drawable == null) {
            Intrinsics.throwNpe();
        }
        return drawable;
    }

    @JvmStatic
    /* renamed from: a */
    public static final Drawable m91674a(Context context, Bitmap bitmap, int i) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(bitmap, "oriBitmap");
        Bitmap b = m91676b(context, bitmap, i);
        if (b != null) {
            return new BitmapDrawable(context.getResources(), b);
        }
        return f62500a.m91673a(context);
    }

    @JvmStatic
    /* renamed from: b */
    public static final Bitmap m91676b(Context context, Bitmap bitmap, int i) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(bitmap, "oriBitmap");
        C0989b a = C0989b.m4858a(bitmap).mo5042a();
        Intrinsics.checkExpressionValueIsNotNull(a, "Palette.from(oriBitmap).generate()");
        C0989b.C0993c a2 = a.mo5038a();
        if (a2 == null) {
            return null;
        }
        Intrinsics.checkExpressionValueIsNotNull(a2, "palette.dominantSwatch ?: return null");
        float[] b = a2.mo5044b();
        Intrinsics.checkExpressionValueIsNotNull(b, "swatch.hsl");
        CardHeaderGenerator aVar = f62500a;
        int HSVToColor = Color.HSVToColor(new float[]{b[0], aVar.m91672a(b[1]), aVar.m91675b(b[2])});
        int argb = Color.argb((int) 204.0f, Color.red(HSVToColor), Color.green(HSVToColor), Color.blue(HSVToColor));
        int width = bitmap.getWidth() / 4;
        int width2 = bitmap.getWidth() / 2;
        int height = bitmap.getHeight() - width;
        float f = (float) i;
        float f2 = (f / 12.0f) / ((float) width2);
        Matrix matrix = new Matrix();
        matrix.postScale(f2, f2);
        Bitmap a3 = C25628b.m91677a(context, Bitmap.createBitmap(bitmap, width, width, width2, height, matrix, true), 25);
        Intrinsics.checkExpressionValueIsNotNull(a3, "ImageUtils.blurByRenderS…(context, cropBitmap, 25)");
        float width3 = f / ((float) a3.getWidth());
        Matrix matrix2 = new Matrix();
        matrix2.postScale(width3, width3);
        Bitmap createBitmap = Bitmap.createBitmap(a3, 0, 0, a3.getWidth(), a3.getHeight(), matrix2, true);
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
        paint2.setColor(argb);
        canvas.drawRect(new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) createBitmap.getWidth(), (float) createBitmap.getHeight()), paint2);
        return createBitmap2;
    }
}
