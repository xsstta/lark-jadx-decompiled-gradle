package com.ss.android.lark.threadtab.view;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.core.graphics.C0768a;
import androidx.p036f.p037a.C0989b;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.threadtab.view.a */
public class C55985a {
    /* renamed from: a */
    private static float m217600a(float f) {
        double d = (double) f;
        if (d < 0.3d) {
            return 0.3f;
        }
        if (d < 0.3d || d > 0.5d) {
            return 0.5f;
        }
        return f;
    }

    /* renamed from: b */
    private static float m217604b(float f) {
        if (f < BitmapDescriptorFactory.HUE_RED) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        if (f < BitmapDescriptorFactory.HUE_RED || ((double) f) > 0.5d) {
            return 0.5f;
        }
        return f;
    }

    /* renamed from: a */
    private static void m217603a(boolean z, Canvas canvas, RectF rectF, Paint paint) {
        if (z) {
            canvas.drawRoundRect(rectF, (float) UIHelper.dp2px(4.0f), (float) UIHelper.dp2px(4.0f), paint);
        } else {
            canvas.drawRect(rectF, paint);
        }
    }

    /* renamed from: a */
    public static Bitmap m217602a(Bitmap bitmap, int i, int i2, boolean z) {
        if (i == 0 || i2 == 0) {
            return bitmap;
        }
        C0989b.C0993c a = C0989b.m4858a(bitmap).mo5041a((bitmap.getWidth() * bitmap.getHeight()) / 8).mo5042a().mo5038a();
        float[] fArr = new float[3];
        Color.colorToHSV(UIHelper.getColor(R.color.msg_menu_press), fArr);
        if (a != null) {
            fArr = a.mo5044b();
        }
        int HSVToColor = Color.HSVToColor(new float[]{fArr[0], m217604b(fArr[1]), m217600a(fArr[2])});
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_4444);
        Canvas canvas = new Canvas(createBitmap);
        RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) i, (float) i2);
        canvas.drawARGB(0, 0, 0, 0);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(HSVToColor);
        m217603a(z, canvas, rectF, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SCREEN));
        canvas.drawBitmap(m217601a(C0768a.m3716c(HSVToColor, 178), C0768a.m3716c(HSVToColor, 0), i, i2, z), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, paint);
        return createBitmap;
    }

    /* renamed from: a */
    public static Bitmap m217601a(int i, int i2, int i3, int i4, boolean z) {
        Bitmap createBitmap = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_4444);
        Canvas canvas = new Canvas();
        canvas.setBitmap(createBitmap);
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        LinearGradient linearGradient = new LinearGradient((float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED, (float) createBitmap.getHeight(), i, i2, Shader.TileMode.CLAMP);
        Paint paint = new Paint();
        paint.setShader(linearGradient);
        m217603a(z, canvas, new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) createBitmap.getWidth(), (float) createBitmap.getHeight()), paint);
        return createBitmap;
    }
}
