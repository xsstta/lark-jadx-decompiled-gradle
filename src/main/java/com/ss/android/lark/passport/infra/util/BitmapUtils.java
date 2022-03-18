package com.ss.android.lark.passport.infra.util;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u0004\u0018\u00010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\nH\u0007J,\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/passport/infra/util/BitmapUtils;", "", "()V", "createHeaderBitMap", "Landroid/graphics/Bitmap;", "list", "", "context", "Landroid/content/Context;", "radius", "", "resizeBitmap", "bitmap", "newWidth", "roundBitmap", "outWidth", "outHeight", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.infra.util.e */
public final class BitmapUtils {

    /* renamed from: a */
    public static final BitmapUtils f123471a = new BitmapUtils();

    private BitmapUtils() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final Bitmap m193931a(Bitmap bitmap, int i) {
        if (bitmap == null) {
            return null;
        }
        float width = ((float) i) / ((float) bitmap.getWidth());
        Matrix matrix = new Matrix();
        matrix.postScale(width, width);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    @JvmStatic
    /* renamed from: a */
    public static final Bitmap m193933a(List<Bitmap> list, Context context, int i) {
        int i2;
        Resources resources;
        Intrinsics.checkParameterIsNotNull(list, "list");
        if (list.isEmpty()) {
            return null;
        }
        int a = C49154ag.m193828a(context, 42.0f);
        int a2 = C49154ag.m193828a(context, 2.0f);
        Bitmap createBitmap = Bitmap.createBitmap(a, a, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        if (context == null || (resources = context.getResources()) == null) {
            i2 = 0;
        } else {
            i2 = resources.getColor(R.color.bg_body_overlay);
        }
        canvas.drawColor(i2);
        int a3 = C49154ag.m193828a(context, 20.0f);
        int size = list.size();
        if (size == 1) {
            Bitmap a4 = m193931a(list.get(0), a);
            if (a4 != null) {
                canvas.drawBitmap(a4, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (Paint) null);
            }
        } else if (size == 2) {
            float a5 = (float) C49154ag.m193828a(context, 12.0f);
            Bitmap a6 = m193932a(list.get(0), a3, a3, a2);
            if (a6 != null) {
                canvas.drawBitmap(a6, BitmapDescriptorFactory.HUE_RED, a5, (Paint) null);
            }
            Bitmap a7 = m193932a(list.get(1), a3, a3, a2);
            if (a7 != null) {
                canvas.drawBitmap(a7, (float) (a - a3), a5, (Paint) null);
            }
        } else if (size == 3) {
            float a8 = (float) C49154ag.m193828a(context, 11.0f);
            Bitmap a9 = m193932a(list.get(0), a3, a3, a2);
            if (a9 != null) {
                canvas.drawBitmap(a9, a8, BitmapDescriptorFactory.HUE_RED, (Paint) null);
            }
            Bitmap a10 = m193932a(list.get(1), a3, a3, a2);
            if (a10 != null) {
                canvas.drawBitmap(a10, BitmapDescriptorFactory.HUE_RED, (float) (a - a3), (Paint) null);
            }
            Bitmap a11 = m193932a(list.get(2), a3, a3, a2);
            if (a11 != null) {
                float f = (float) (a - a3);
                canvas.drawBitmap(a11, f, f, (Paint) null);
            }
        } else if (size == 4) {
            Bitmap a12 = m193932a(list.get(0), a3, a3, a2);
            if (a12 != null) {
                canvas.drawBitmap(a12, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (Paint) null);
            }
            Bitmap a13 = m193932a(list.get(1), a3, a3, a2);
            if (a13 != null) {
                canvas.drawBitmap(a13, (float) (a - a3), BitmapDescriptorFactory.HUE_RED, (Paint) null);
            }
            Bitmap a14 = m193932a(list.get(2), a3, a3, a2);
            if (a14 != null) {
                canvas.drawBitmap(a14, BitmapDescriptorFactory.HUE_RED, (float) (a - a3), (Paint) null);
            }
            Bitmap a15 = m193932a(list.get(3), a3, a3, a2);
            if (a15 != null) {
                float f2 = (float) (a - a3);
                canvas.drawBitmap(a15, f2, f2, (Paint) null);
            }
        }
        return m193932a(createBitmap, a, a, i);
    }

    @JvmStatic
    /* renamed from: a */
    public static final Bitmap m193932a(Bitmap bitmap, int i, int i2, int i3) {
        if (bitmap == null) {
            return null;
        }
        float f = (float) i;
        float width = (f * 1.0f) / ((float) bitmap.getWidth());
        float height = (((float) i2) * 1.0f) / ((float) bitmap.getHeight());
        Matrix matrix = new Matrix();
        matrix.setScale(width, height);
        BitmapShader bitmapShader = new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        bitmapShader.setLocalMatrix(matrix);
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
        float f2 = (float) i3;
        canvas.drawRoundRect(new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, f), f2, f2, paint);
        return createBitmap;
    }
}
