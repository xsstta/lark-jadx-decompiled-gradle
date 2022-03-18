package com.ss.android.lark.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.UIUtils;
import java.util.Random;

/* renamed from: com.ss.android.lark.utils.r */
public class C57860r {

    /* renamed from: a */
    private static Integer[] f142490a = {-16777216, -12303292, -7829368, -3355444, -65536, -16711936, -16776961, -256, -16711681, -65281};

    /* renamed from: a */
    private static int m224568a() {
        return f142490a[new Random().nextInt(10)].intValue();
    }

    /* renamed from: a */
    public static Bitmap m224569a(int i, int i2, String str) {
        return m224570a(i, i2, str, m224568a());
    }

    /* renamed from: a */
    public static Bitmap m224570a(int i, int i2, String str, int i3) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) canvas.getWidth(), (float) canvas.getHeight());
        Paint paint = new Paint(257);
        paint.setColor(-1);
        canvas.drawOval(rectF, paint);
        paint.setColor(i3);
        float f = (float) i2;
        canvas.drawRect(new RectF(f, f, rectF.width() - f, rectF.height() - f), paint);
        paint.setColor(-1);
        paint.setStrokeWidth(3.0f);
        paint.setTextSize(((float) i) * 0.5f);
        paint.setTextAlign(Paint.Align.CENTER);
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        canvas.drawText(str, rectF.centerX(), (((rectF.bottom + rectF.top) - ((float) fontMetricsInt.bottom)) - ((float) fontMetricsInt.top)) / 2.0f, paint);
        return createBitmap;
    }

    /* renamed from: a */
    public static Bitmap m224571a(Context context, String str, String str2, boolean z, String str3, int i) {
        if (!TextUtils.isEmpty(str3)) {
            return null;
        }
        if (!TextUtils.isEmpty(C57881t.m224629c(context, str + ".jpg"))) {
            return null;
        }
        if (z) {
            int dp2px = UIUtils.dp2px(context, BitmapDescriptorFactory.HUE_RED);
            if (!TextUtils.isEmpty(str2)) {
                str2 = str2.substring(str2.length() - 1);
            }
            return m224569a(UIUtils.dp2px(context, (float) i), dp2px, str2);
        }
        int dp2px2 = UIUtils.dp2px(context, 100.0f);
        return m224569a(dp2px2, dp2px2, str2);
    }
}
