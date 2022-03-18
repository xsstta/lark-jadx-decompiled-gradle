package com.ss.android.lark.watermark.p2925b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import java.util.ArrayList;

/* renamed from: com.ss.android.lark.watermark.b.c */
public class C58247c {
    /* renamed from: a */
    public static Bitmap m225940a(Drawable drawable) {
        Bitmap bitmap;
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                return bitmapDrawable.getBitmap();
            }
        }
        if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
            bitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        } else {
            bitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        }
        Canvas canvas = new Canvas(bitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmap;
    }

    /* renamed from: a */
    private static Canvas m225941a(Bitmap bitmap, int i) {
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(i);
        return canvas;
    }

    /* renamed from: b */
    private static Bitmap m225945b(Context context, Bitmap bitmap) {
        BitmapDrawable a = m225943a(context, bitmap);
        if (a.getIntrinsicWidth() <= DeviceUtils.getScreenWidth(context) && a.getIntrinsicHeight() <= DeviceUtils.getScreenHeight(context)) {
            return bitmap;
        }
        int min = Math.min(DeviceUtils.getScreenWidth(context), a.getIntrinsicWidth());
        int min2 = Math.min(DeviceUtils.getScreenHeight(context), a.getIntrinsicHeight());
        if (min <= 0 || min2 <= 0) {
            return bitmap;
        }
        return Bitmap.createBitmap(bitmap, 0, 0, min, min2);
    }

    /* renamed from: a */
    public static BitmapDrawable m225943a(Context context, Bitmap bitmap) {
        BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), bitmap);
        bitmapDrawable.setTileModeXY(Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
        bitmapDrawable.setDither(true);
        bitmapDrawable.setTargetDensity(bitmap.getDensity());
        return bitmapDrawable;
    }

    /* renamed from: a */
    private static Paint m225942a(Context context, int i, float f) {
        Paint paint = new Paint();
        paint.setColor(context.getResources().getColor(R.color.lkui_N500));
        paint.setAlpha((int) (f * 255.0f));
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.LEFT);
        paint.setTextSize((float) UIUtils.dp2px(context, (float) i));
        return paint;
    }

    /* renamed from: a */
    public static Bitmap m225939a(Context context, String str, int i, int i2, float f) {
        if (str.length() < 10) {
            return m225945b(context, m225946b(context, str, i, i2, f));
        }
        return m225945b(context, m225947c(context, str, i, i2, f));
    }

    /* renamed from: a */
    private static void m225944a(Context context, Canvas canvas, String str, C58243a aVar, Paint paint) {
        Path path = new Path();
        path.moveTo((float) UIUtils.dp2px(context, (float) ((int) aVar.mo197283a())), (float) UIUtils.dp2px(context, (float) ((int) aVar.mo197285b())));
        path.lineTo((float) UIUtils.dp2px(context, (float) ((int) aVar.mo197287c())), (float) UIUtils.dp2px(context, (float) ((int) aVar.mo197289d())));
        canvas.drawTextOnPath(str, path, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, paint);
    }

    /* renamed from: b */
    private static Bitmap m225946b(Context context, String str, int i, int i2, float f) {
        double length = (double) (((str.length() - 5) * 2) + 5);
        int sin = (int) ((Math.sin(0.2617993877991494d) * 60.0d) + (21.3d * length * Math.cos(0.2617993877991494d)));
        int tan = (int) (((double) sin) * Math.tan(0.2617993877991494d) * 4.0d);
        Bitmap createBitmap = Bitmap.createBitmap(UIUtils.dp2px(context, (float) sin), UIUtils.dp2px(context, (float) tan), Bitmap.Config.ARGB_8888);
        Canvas a = m225941a(createBitmap, i2);
        Paint a2 = m225942a(context, i, f);
        double d = length * 7.1d;
        double sin2 = Math.sin(0.2617993877991494d) * d;
        double cos = d * Math.cos(0.2617993877991494d);
        double d2 = ((double) (tan / 2)) - 0.7d;
        double sin3 = Math.sin(0.2617993877991494d) * 10.0d;
        double d3 = sin3 + cos;
        m225944a(context, a, str, new C58243a(sin3, d2, d3, d2 - sin2), a2);
        double d4 = ((double) tan) - 0.7d;
        m225944a(context, a, str, new C58243a(sin3, d4, d3, d4 - sin2), a2);
        double d5 = (double) (sin / 3);
        double d6 = (double) (tan / 4);
        double tan2 = (d2 - (Math.tan(0.2617993877991494d) * d5)) - d6;
        double d7 = sin3 + d5;
        double d8 = d7 + cos;
        m225944a(context, a, str, new C58243a(d7, tan2, d8, tan2 - sin2), a2);
        double tan3 = (d4 - (d5 * Math.tan(0.2617993877991494d))) - d6;
        m225944a(context, a, str, new C58243a(d7, tan3, d8, tan3 - sin2), a2);
        double d9 = (double) ((sin * 2) / 3);
        double tan4 = d2 - (Math.tan(0.2617993877991494d) * d9);
        double d10 = sin3 + d9;
        double d11 = d10 + cos;
        m225944a(context, a, str, new C58243a(d10, tan4, d11, tan4 - sin2), a2);
        double tan5 = d4 - (d9 * Math.tan(0.2617993877991494d));
        m225944a(context, a, str, new C58243a(d10, tan5, d11, tan5 - sin2), a2);
        a.save();
        a.restore();
        return createBitmap;
    }

    /* renamed from: c */
    private static Bitmap m225947c(Context context, String str, int i, int i2, float f) {
        Bitmap bitmap;
        Context context2 = context;
        Paint a = m225942a(context2, i, f);
        double px2dp = (double) UIUtils.px2dp(context2, a.measureText(str));
        double sin = (Math.sin(0.2617993877991494d) * px2dp) + 10.0d;
        double cos = (px2dp * Math.cos(0.2617993877991494d)) + 10.0d;
        double sin2 = Math.sin(0.2617993877991494d) * 10.0d;
        double d = cos + 10.0d;
        Bitmap createBitmap = Bitmap.createBitmap(UIUtils.dp2px(context2, (float) (5.0d * d)), UIUtils.dp2px(context2, (float) (6.0d * sin)), Bitmap.Config.ARGB_8888);
        Canvas a2 = m225941a(createBitmap, i2);
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        while (i3 < 10) {
            C58243a aVar = new C58243a();
            aVar.mo197286b((((double) i3) * sin * 2.0d) + sin + 1.0d);
            aVar.mo197284a(sin2);
            aVar.mo197290d(aVar.mo197285b() - sin);
            aVar.mo197288c(aVar.mo197283a() + cos);
            arrayList.add(aVar);
            m225944a(context2, a2, str, aVar, a);
            i3++;
            d = d;
        }
        ArrayList arrayList2 = new ArrayList();
        int i4 = 0;
        while (i4 < 9) {
            C58243a aVar2 = new C58243a();
            if (i4 < 6) {
                bitmap = createBitmap;
                aVar2.mo197286b((((C58243a) arrayList.get(i4)).mo197289d() + ((C58243a) arrayList.get(i4 + 1)).mo197289d()) / 2.0d);
            } else {
                bitmap = createBitmap;
                aVar2.mo197286b(((((C58243a) arrayList.get(i4)).mo197289d() * 3.0d) / 2.0d) - (((C58243a) arrayList.get(i4 - 1)).mo197289d() / 2.0d));
            }
            aVar2.mo197284a(sin2 + cos + 10.0d);
            aVar2.mo197290d(aVar2.mo197285b() - sin);
            aVar2.mo197288c(aVar2.mo197283a() + cos);
            arrayList2.add(aVar2);
            context2 = context;
            m225944a(context2, a2, str, aVar2, a);
            i4++;
            createBitmap = bitmap;
        }
        ArrayList arrayList3 = new ArrayList();
        int i5 = 0;
        while (i5 < 8) {
            C58243a aVar3 = new C58243a();
            int i6 = i5 + 1;
            aVar3.mo197286b((((C58243a) arrayList2.get(i5)).mo197289d() + ((C58243a) arrayList2.get(i6)).mo197289d()) / 2.0d);
            aVar3.mo197284a((d * 2.0d) + sin2);
            aVar3.mo197290d(aVar3.mo197285b() - sin);
            aVar3.mo197288c(aVar3.mo197283a() + cos);
            arrayList3.add(aVar3);
            m225944a(context2, a2, str, aVar3, a);
            i5 = i6;
        }
        ArrayList arrayList4 = new ArrayList();
        int i7 = 0;
        while (i7 < 7) {
            C58243a aVar4 = new C58243a();
            int i8 = i7 + 1;
            aVar4.mo197286b(((((C58243a) arrayList3.get(i7)).mo197289d() * 3.0d) / 2.0d) - (((C58243a) arrayList3.get(i8)).mo197289d() / 2.0d));
            aVar4.mo197284a((d * 3.0d) + sin2);
            aVar4.mo197290d(aVar4.mo197285b() - sin);
            aVar4.mo197288c(aVar4.mo197283a() + cos);
            arrayList4.add(aVar4);
            m225944a(context2, a2, str, aVar4, a);
            arrayList3 = arrayList3;
            i7 = i8;
        }
        int i9 = 0;
        while (i9 < 6) {
            C58243a aVar5 = new C58243a();
            int i10 = i9 + 1;
            aVar5.mo197286b((((C58243a) arrayList4.get(i9)).mo197289d() + ((C58243a) arrayList4.get(i10)).mo197289d()) / 2.0d);
            aVar5.mo197284a((4.0d * d) + sin2);
            aVar5.mo197290d(aVar5.mo197285b() - sin);
            aVar5.mo197288c(aVar5.mo197283a() + cos);
            m225944a(context2, a2, str, aVar5, a);
            arrayList4 = arrayList4;
            i9 = i10;
        }
        a2.save();
        a2.restore();
        return createBitmap;
    }
}
