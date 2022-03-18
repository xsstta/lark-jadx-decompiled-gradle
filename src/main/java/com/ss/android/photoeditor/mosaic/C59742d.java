package com.ss.android.photoeditor.mosaic;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.photoeditor.mosaic.p3011a.C59739b;
import java.util.List;

/* renamed from: com.ss.android.photoeditor.mosaic.d */
public class C59742d {
    /* renamed from: a */
    private static int m231710a(int i, int i2) {
        if (i > 0) {
            if (i < i2) {
                return i;
            }
            int i3 = i2 - 1;
            if (i3 >= 0) {
                return i3;
            }
        }
        return 0;
    }

    /* renamed from: a */
    public static Bitmap m231712a(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int i = 45;
        float f = (float) 45;
        int ceil = (int) Math.ceil((double) (((float) width) / f));
        int ceil2 = (int) Math.ceil((double) (((float) height) / f));
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        int i2 = 0;
        while (i2 < ceil) {
            int i3 = i * i2;
            int i4 = 0;
            while (i4 < ceil2) {
                int i5 = i * i4;
                int i6 = i3 + 45;
                if (i6 >= width) {
                    i6 = width - 1;
                }
                int i7 = i5 + 45;
                if (i7 >= height) {
                    i7 = height - 1;
                }
                i3 = m231710a(i3, bitmap.getWidth());
                int a = m231710a(i5, bitmap.getHeight());
                int pixel = bitmap.getPixel(i3, a);
                Rect rect = new Rect(i3, a, i6, i7);
                paint.setColor(pixel);
                canvas.drawRect(rect, paint);
                i4++;
                i = 45;
            }
            i2++;
            i = 45;
        }
        canvas.save();
        return createBitmap;
    }

    /* renamed from: a */
    public static Bitmap m231711a(Context context, Bitmap bitmap) {
        return m231715b(context, bitmap);
    }

    /* renamed from: b */
    public static Bitmap m231715b(Context context, Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        RenderScript create = RenderScript.create(context);
        Allocation createFromBitmap = Allocation.createFromBitmap(create, bitmap);
        Allocation createTyped = Allocation.createTyped(create, createFromBitmap.getType());
        ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
        create2.setRadius(25.0f);
        create2.setInput(createFromBitmap);
        create2.forEach(createTyped);
        createTyped.copyTo(createBitmap);
        return createBitmap;
    }

    /* renamed from: a */
    public static float m231708a(C59741c cVar, C59741c cVar2) {
        double d;
        float f = cVar2.f148391a - cVar.f148391a;
        if (f == BitmapDescriptorFactory.HUE_RED) {
            f = 1.0f;
        }
        float atan = (float) ((Math.atan((double) Math.abs((cVar2.f148392b - cVar.f148392b) / f)) * 180.0d) / 3.141592653589793d);
        if (cVar2.f148392b <= cVar.f148392b && cVar2.f148391a >= cVar.f148391a) {
            atan = -atan;
        } else if (cVar2.f148392b <= cVar.f148392b && cVar2.f148391a <= cVar.f148391a) {
            atan = -(180.0f - atan);
        } else if (cVar2.f148392b >= cVar.f148392b && cVar2.f148391a <= cVar.f148391a) {
            atan = 180.0f - atan;
        }
        if (Math.random() > 0.5d) {
            d = ((double) atan) + (Math.random() * 10.0d) + 10.0d;
        } else {
            d = ((double) atan) - ((Math.random() * 10.0d) + 10.0d);
        }
        return (float) d;
    }

    /* renamed from: a */
    public static void m231714a(Bitmap bitmap, List<C59739b> list) {
        if (!(list == null || list.isEmpty())) {
            Canvas canvas = new Canvas(bitmap);
            Path path = new Path();
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(-65536);
            Bitmap createBitmap = Bitmap.createBitmap(bitmap);
            Canvas canvas2 = new Canvas(createBitmap);
            canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
            int width = canvas2.getWidth();
            int height = canvas2.getHeight();
            for (C59739b bVar : list) {
                path.reset();
                for (PointF pointF : bVar.f148369a) {
                    if (path.isEmpty()) {
                        path.moveTo(((float) width) * pointF.x, ((float) height) * pointF.y);
                    } else {
                        path.lineTo(((float) width) * pointF.x, ((float) height) * pointF.y);
                    }
                }
                path.close();
                canvas2.drawPath(path, paint);
            }
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            canvas.drawBitmap(createBitmap, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, paint);
        }
    }

    /* renamed from: a */
    public static int m231709a(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        return (int) Math.sqrt((double) ((f5 * f5) + (f6 * f6)));
    }

    /* renamed from: a */
    public static Bitmap m231713a(Bitmap bitmap, int i, int i2, boolean z) {
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float max = Math.max(((float) i) / ((float) width), ((float) i2) / ((float) height));
        Matrix matrix = new Matrix();
        matrix.postScale(max, max);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
        if (z) {
            bitmap.recycle();
        }
        return createBitmap;
    }
}
