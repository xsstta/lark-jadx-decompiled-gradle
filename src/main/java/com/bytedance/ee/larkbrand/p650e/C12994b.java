package com.bytedance.ee.larkbrand.p650e;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import com.bumptech.glide.load.engine.p087a.AbstractC2283e;
import com.bumptech.glide.load.resource.bitmap.AbstractC2429f;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.security.MessageDigest;

/* renamed from: com.bytedance.ee.larkbrand.e.b */
public class C12994b extends AbstractC2429f {

    /* renamed from: b */
    private float f34601b;

    /* renamed from: c */
    private float f34602c;

    /* renamed from: d */
    private int f34603d = -16777216;

    @Override // com.bumptech.glide.load.AbstractC2265c
    public void updateDiskCacheKey(MessageDigest messageDigest) {
    }

    /* renamed from: a */
    private Bitmap m53459a(AbstractC2283e eVar, Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        Bitmap a = eVar.mo10690a(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        if (a == null) {
            a = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        }
        Canvas canvas = new Canvas(a);
        Paint paint = new Paint();
        paint.setShader(new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));
        paint.setAntiAlias(true);
        RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) bitmap.getWidth(), (float) bitmap.getHeight());
        float f = this.f34601b;
        canvas.drawRoundRect(rectF, f, f, paint);
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setColor(this.f34603d);
        paint2.setStrokeWidth(this.f34602c);
        RectF rectF2 = new RectF(2.0f, 2.0f, (float) (bitmap.getWidth() - 2), (float) (bitmap.getHeight() - 2));
        float f2 = this.f34601b;
        canvas.drawRoundRect(rectF2, f2, f2, paint2);
        return a;
    }

    public C12994b(float f, float f2, int i) {
        this.f34601b = f;
        this.f34602c = f2;
        if (i != 0) {
            this.f34603d = i;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.resource.bitmap.AbstractC2429f
    /* renamed from: a */
    public Bitmap mo10942a(AbstractC2283e eVar, Bitmap bitmap, int i, int i2) {
        return m53459a(eVar, bitmap);
    }
}
