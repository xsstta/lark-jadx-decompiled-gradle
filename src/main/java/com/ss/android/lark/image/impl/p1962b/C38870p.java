package com.ss.android.lark.image.impl.p1962b;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import com.bumptech.glide.load.resource.bitmap.C2455y;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005H\u0002\u001a\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000eH\u0002\u001a\u0016\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e\u001a*\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u00142\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"DEFAULT_PAINT", "Landroid/graphics/Paint;", "applyMatrix", "", "inBitmap", "Landroid/graphics/Bitmap;", "targetBitmap", "matrix", "Landroid/graphics/Matrix;", "getNonNullConfig", "Landroid/graphics/Bitmap$Config;", "bitmap", "initializeMatrixForRotation", "exifOrientation", "", "isRotationRequired", "", "degreesToRotate", "rotateImageExif", "rotateSizeIfNeeded", "Lkotlin/Pair;", "width", "height", "base_lark-image_lark-image_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.image.impl.b.p */
public final class C38870p {

    /* renamed from: a */
    private static final Paint f99867a = new Paint(6);

    /* renamed from: a */
    private static final boolean m153432a(int i) {
        return i == 90 || i == 270;
    }

    /* renamed from: a */
    private static final Bitmap.Config m153427a(Bitmap bitmap) {
        if (bitmap.getConfig() == null) {
            return Bitmap.Config.ARGB_8888;
        }
        Bitmap.Config config = bitmap.getConfig();
        Intrinsics.checkExpressionValueIsNotNull(config, "bitmap.config");
        return config;
    }

    /* renamed from: a */
    public static final Bitmap m153428a(Bitmap bitmap, int i) {
        Intrinsics.checkParameterIsNotNull(bitmap, "inBitmap");
        if (!C2455y.m10377b(i)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        m153430a(i, matrix);
        RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) bitmap.getWidth(), (float) bitmap.getHeight());
        matrix.mapRect(rectF);
        Bitmap createBitmap = Bitmap.createBitmap(Math.round(rectF.width()), Math.round(rectF.height()), m153427a(bitmap));
        Intrinsics.checkExpressionValueIsNotNull(createBitmap, "Bitmap.createBitmap(newWidth, newHeight, config)");
        matrix.postTranslate(-rectF.left, -rectF.top);
        createBitmap.setHasAlpha(bitmap.hasAlpha());
        m153431a(bitmap, createBitmap, matrix);
        return createBitmap;
    }

    /* renamed from: a */
    private static final void m153430a(int i, Matrix matrix) {
        switch (i) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                return;
            case 3:
                matrix.setRotate(180.0f);
                return;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 6:
                matrix.setRotate(90.0f);
                return;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 8:
                matrix.setRotate(-90.0f);
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public static final Pair<Integer, Integer> m153429a(int i, int i2, int i3) {
        if (m153432a(C2455y.m10363a(i3))) {
            i2 = i;
            i = i2;
        }
        return new Pair<>(Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* renamed from: a */
    private static final void m153431a(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        C2455y.m10369a().lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f99867a);
            canvas.setBitmap(null);
        } finally {
            C2455y.m10369a().unlock();
        }
    }
}
