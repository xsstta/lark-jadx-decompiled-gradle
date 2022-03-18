package com.bytedance.lynx.tasm.ui.imageloader;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.ui.utils.BorderRadius;

/* renamed from: com.bytedance.lynx.tasm.ui.imageloader.d */
public class C19907d extends C19908e {
    public C19907d(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.lynx.tasm.ui.imageloader.C19908e
    public void onDraw(Canvas canvas) {
        TraceEvent.m96443a("UIFilterImageView.onDraw");
        int saveCount = canvas.getSaveCount();
        if (this.f48634b != null) {
            canvas.clipPath(this.f48634b);
        }
        if (this.f48633a != null) {
            this.f48633a.draw(canvas);
        }
        canvas.restoreToCount(saveCount);
        TraceEvent.m96444b("UIFilterImageView.onDraw");
    }

    /* renamed from: a */
    public static Bitmap m72630a(Bitmap bitmap, RectF rectF, RectF rectF2, UIFilterImage uIFilterImage) {
        if (bitmap == null) {
            return null;
        }
        int T = uIFilterImage.mo94937T();
        int U = uIFilterImage.mo94938U();
        if (uIFilterImage.f48608e > 0) {
            BitmapBlur.nativeBlur(bitmap, uIFilterImage.f48608e);
        }
        BorderRadius e = uIFilterImage.aA().mo95538e();
        RectF a = m72634a(T, U, rectF, rectF2);
        Path a2 = m72633a(e, rectF, T, U);
        Matrix a3 = m72631a(bitmap, T, U, rectF, rectF2, uIFilterImage.f48615g);
        Bitmap createBitmap = Bitmap.createBitmap(T, U, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        if (uIFilterImage.f48607d > 0) {
            Paint paint = new Paint();
            paint.setFlags(3);
            paint.setColorFilter(new PorterDuffColorFilter(uIFilterImage.f48606c, PorterDuff.Mode.SRC_IN));
            int save = canvas.save();
            canvas.translate((float) uIFilterImage.f48604a, (float) uIFilterImage.f48605b);
            m72636a(canvas, a, a2, bitmap, a3, paint);
            canvas.restoreToCount(save);
            BitmapBlur.nativeBlur(createBitmap, uIFilterImage.f48607d);
        }
        m72636a(canvas, a, a2, bitmap, a3, (Paint) null);
        return createBitmap;
    }
}
