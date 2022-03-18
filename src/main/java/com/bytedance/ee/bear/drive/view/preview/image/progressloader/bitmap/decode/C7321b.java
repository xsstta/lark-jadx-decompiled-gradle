package com.bytedance.ee.bear.drive.view.preview.image.progressloader.bitmap.decode;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import com.bytedance.ee.bear.drive.view.preview.image.progressloader.bitmap.p370a.AbstractC7301c;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.bytedance.ee.bear.drive.view.preview.image.progressloader.bitmap.decode.b */
public final class C7321b {
    /* renamed from: a */
    public static int m29252a(int i) {
        switch (i) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    /* renamed from: a */
    private static Bitmap.Config m29253a(Bitmap bitmap) {
        if (bitmap.getConfig() != null) {
            return bitmap.getConfig();
        }
        return Bitmap.Config.ARGB_8888;
    }

    /* renamed from: a */
    static void m29255a(int i, Matrix matrix) {
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
    public static Bitmap m29254a(Bitmap bitmap, AbstractC7301c cVar, int i) {
        Matrix matrix = new Matrix();
        m29255a(i, matrix);
        if (matrix.isIdentity()) {
            return bitmap;
        }
        RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) bitmap.getWidth(), (float) bitmap.getHeight());
        matrix.mapRect(rectF);
        int round = Math.round(rectF.width());
        int round2 = Math.round(rectF.height());
        Bitmap.Config a = m29253a(bitmap);
        Bitmap a2 = cVar.mo28505a(round, round2, a);
        if (a2 == null) {
            a2 = Bitmap.createBitmap(round, round2, a);
        }
        matrix.postTranslate(-rectF.left, -rectF.top);
        new Canvas(a2).drawBitmap(bitmap, matrix, new Paint(6));
        return a2;
    }
}
