package com.tt.miniapp.shortcut.p3328a;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.tt.miniapp.util.C67053q;

/* renamed from: com.tt.miniapp.shortcut.a.a */
public class C66819a {

    /* renamed from: a */
    private final int f168564a;

    /* renamed from: b */
    private Object f168565b;

    /* renamed from: c */
    private int f168566c;

    /* renamed from: d */
    private int f168567d;

    /* renamed from: a */
    public Icon mo232744a() {
        int i = this.f168564a;
        if (i == 1) {
            return Icon.createWithBitmap((Bitmap) this.f168565b);
        }
        if (i == 2) {
            return Icon.createWithResource((Context) this.f168565b, this.f168566c);
        }
        if (i == 3) {
            return Icon.createWithData((byte[]) this.f168565b, this.f168566c, this.f168567d);
        }
        if (i == 4) {
            return Icon.createWithContentUri((String) this.f168565b);
        }
        if (i != 5) {
            throw new IllegalArgumentException("Unknown type");
        } else if (Build.VERSION.SDK_INT >= 26) {
            return Icon.createWithAdaptiveBitmap((Bitmap) this.f168565b);
        } else {
            return Icon.createWithBitmap(m260720b((Bitmap) this.f168565b));
        }
    }

    private C66819a(int i) {
        this.f168564a = i;
    }

    /* renamed from: a */
    public static C66819a m260718a(Bitmap bitmap) {
        if (bitmap != null) {
            C66819a aVar = new C66819a(1);
            aVar.f168565b = bitmap;
            return aVar;
        }
        throw new IllegalArgumentException("Bitmap must not be null.");
    }

    /* renamed from: a */
    public static C66819a m260719a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                byte[] a = C67053q.m261328a(str);
                if (a == null || a.length <= 0) {
                    return null;
                }
                return m260718a(BitmapFactory.decodeByteArray(a, 0, a.length));
            } catch (Exception e) {
                AppBrandLogger.m52829e("CustomIconCompat", e);
                return null;
            }
        } else {
            throw new IllegalArgumentException("url must not be empty.");
        }
    }

    /* renamed from: b */
    static Bitmap m260720b(Bitmap bitmap) {
        int min = (int) (((float) Math.min(bitmap.getWidth(), bitmap.getHeight())) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f = (float) min;
        float f2 = 0.5f * f;
        float f3 = 0.9166667f * f2;
        float f4 = 0.010416667f * f;
        paint.setColor(0);
        paint.setShadowLayer(f4, BitmapDescriptorFactory.HUE_RED, f * 0.020833334f, 1023410176);
        canvas.drawCircle(f2, f2, f3, paint);
        paint.setShadowLayer(f4, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 503316480);
        canvas.drawCircle(f2, f2, f3, paint);
        paint.clearShadowLayer();
        paint.setColor(-16777216);
        BitmapShader bitmapShader = new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        Matrix matrix = new Matrix();
        matrix.setTranslate((float) ((-(bitmap.getWidth() - min)) / 2), (float) ((-(bitmap.getHeight() - min)) / 2));
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f2, f2, f3, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    /* renamed from: a */
    public void mo232745a(Intent intent) {
        int i = this.f168564a;
        if (i == 1) {
            intent.putExtra("android.intent.extra.shortcut.ICON", (Bitmap) this.f168565b);
        } else if (i == 2) {
            intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext((Context) this.f168565b, this.f168566c));
        } else if (i == 5) {
            intent.putExtra("android.intent.extra.shortcut.ICON", m260720b((Bitmap) this.f168565b));
        } else {
            throw new IllegalArgumentException("Icon type not supported for intent shortcuts");
        }
    }
}
