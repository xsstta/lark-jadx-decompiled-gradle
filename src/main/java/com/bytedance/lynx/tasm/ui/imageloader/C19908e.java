package com.bytedance.lynx.tasm.ui.imageloader;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.ui.utils.BorderRadius;
import com.lynx.tasm.utils.C26955i;

/* renamed from: com.bytedance.lynx.tasm.ui.imageloader.e */
public class C19908e extends View {

    /* renamed from: a */
    protected Drawable f48633a;

    /* renamed from: b */
    Path f48634b;

    /* renamed from: c */
    protected float f48635c;

    /* renamed from: d */
    protected float f48636d;

    /* renamed from: e */
    protected float f48637e;

    /* renamed from: f */
    protected float f48638f;

    /* renamed from: g */
    private String f48639g = "scaleToFill";

    /* renamed from: h */
    private Matrix f48640h;

    /* renamed from: i */
    private BorderRadius f48641i;

    /* renamed from: j */
    private RectF f48642j;

    /* renamed from: a */
    private void m72635a() {
        Drawable drawable = this.f48633a;
        if (drawable != null && drawable.getIntrinsicHeight() > 0 && this.f48633a.getIntrinsicWidth() > 0 && getWidth() > 0 && getHeight() > 0) {
            RectF rectF = new RectF(this.f48635c, this.f48636d, this.f48637e, this.f48638f);
            RectF rectF2 = new RectF((float) getPaddingLeft(), (float) getPaddingTop(), (float) getPaddingRight(), (float) getPaddingBottom());
            this.f48640h = m72632a(this.f48633a, getWidth(), getHeight(), rectF, rectF2, this.f48639g);
            this.f48634b = m72633a(this.f48641i, rectF, getWidth(), getHeight());
            this.f48642j = m72634a(getWidth(), getHeight(), rectF, rectF2);
            invalidate();
        }
    }

    public C19908e(Context context) {
        super(context);
    }

    public void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
        invalidate();
    }

    public void setBorderRadius(BorderRadius borderRadius) {
        this.f48641i = borderRadius;
        m72635a();
    }

    public void setScaleType(String str) {
        this.f48639g = str;
        m72635a();
    }

    public void setDrawable(Drawable drawable) {
        this.f48633a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        m72635a();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.f48642j != null) {
            TraceEvent.m96443a("UIImageView.onDraw");
            m72637a(canvas, this.f48642j, this.f48634b, this.f48633a, this.f48640h, (Paint) null);
            TraceEvent.m96444b("UIImageView.onDraw");
        }
    }

    public void setBitmap(Bitmap bitmap) {
        if (bitmap == null) {
            setDrawable(null);
            return;
        }
        BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmap);
        bitmapDrawable.setBounds(0, 0, bitmapDrawable.getIntrinsicWidth(), bitmapDrawable.getIntrinsicHeight());
        setDrawable(bitmapDrawable);
    }

    public void layout(int i, int i2, int i3, int i4) {
        super.layout(i, i2, i3, i4);
        m72635a();
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        m72635a();
    }

    /* renamed from: a */
    public void mo67435a(float f, float f2, float f3, float f4) {
        this.f48635c = f;
        this.f48636d = f2;
        this.f48637e = f3;
        this.f48638f = f4;
        m72635a();
    }

    /* renamed from: a */
    public static RectF m72634a(int i, int i2, RectF rectF, RectF rectF2) {
        return new RectF(rectF.left + rectF2.left, rectF.top + rectF2.top, (((float) i) - rectF2.right) - rectF.right, (((float) i2) - rectF2.bottom) - rectF.bottom);
    }

    /* renamed from: a */
    public static Path m72633a(BorderRadius borderRadius, RectF rectF, int i, int i2) {
        if (borderRadius == null) {
            return null;
        }
        Path path = new Path();
        float f = (float) i;
        float f2 = (float) i2;
        borderRadius.mo95505a(f, f2);
        float[] b = borderRadius.mo95508b();
        path.addRoundRect(new RectF(rectF.left, rectF.top, f - rectF.right, f2 - rectF.bottom), new float[]{Math.max(b[0] - rectF.left, (float) BitmapDescriptorFactory.HUE_RED), Math.max(b[1] - rectF.top, (float) BitmapDescriptorFactory.HUE_RED), Math.max(b[2] - rectF.right, (float) BitmapDescriptorFactory.HUE_RED), Math.max(b[3] - rectF.top, (float) BitmapDescriptorFactory.HUE_RED), Math.max(b[4] - rectF.right, (float) BitmapDescriptorFactory.HUE_RED), Math.max(b[5] - rectF.bottom, (float) BitmapDescriptorFactory.HUE_RED), Math.max(b[6] - rectF.left, (float) BitmapDescriptorFactory.HUE_RED), Math.max(b[7] - rectF.bottom, (float) BitmapDescriptorFactory.HUE_RED)}, Path.Direction.CW);
        return path;
    }

    /* renamed from: a */
    public static Matrix m72631a(Bitmap bitmap, int i, int i2, RectF rectF, RectF rectF2, String str) {
        BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmap);
        bitmapDrawable.setBounds(0, 0, bitmapDrawable.getIntrinsicWidth(), bitmapDrawable.getIntrinsicHeight());
        return m72632a(bitmapDrawable, i, i2, rectF, rectF2, str);
    }

    /* renamed from: a */
    public static Matrix m72632a(Drawable drawable, int i, int i2, RectF rectF, RectF rectF2, String str) {
        Matrix matrix = new Matrix();
        if (drawable != null && drawable.getIntrinsicHeight() > 0 && drawable.getIntrinsicWidth() > 0 && i > 0 && i2 > 0) {
            float intrinsicWidth = (float) drawable.getIntrinsicWidth();
            float intrinsicHeight = (float) drawable.getIntrinsicHeight();
            float f = (((((float) i) - rectF.left) - rectF2.left) - rectF.right) - rectF2.right;
            float f2 = (((((float) i2) - rectF.top) - rectF2.top) - rectF.bottom) - rectF2.bottom;
            float f3 = rectF.left + rectF2.left;
            float f4 = rectF.top + rectF2.top;
            if ("center".equals(str)) {
                float a = C26955i.m97952a(1.0f);
                matrix.preTranslate(f3 - (((intrinsicWidth * a) - f) / 2.0f), f4 - (((intrinsicHeight * a) - f2) / 2.0f));
                matrix.preScale(a, a);
            } else if ("aspectFill".equals(str)) {
                float max = Math.max(f / intrinsicWidth, f2 / intrinsicHeight);
                matrix.preTranslate(f3 + ((f - (intrinsicWidth * max)) / 2.0f), f4 + ((f2 - (intrinsicHeight * max)) / 2.0f));
                matrix.preScale(max, max);
            } else if ("aspectFit".equals(str)) {
                float min = Math.min(f / intrinsicWidth, f2 / intrinsicHeight);
                matrix.preTranslate(f3 + ((f - (intrinsicWidth * min)) / 2.0f), f4 + ((f2 - (intrinsicHeight * min)) / 2.0f));
                matrix.preScale(min, min);
            } else {
                matrix.preTranslate(f3, f4);
                matrix.preScale(f / intrinsicWidth, f2 / intrinsicHeight);
            }
        }
        return matrix;
    }

    /* renamed from: a */
    public static void m72636a(Canvas canvas, RectF rectF, Path path, Bitmap bitmap, Matrix matrix, Paint paint) {
        BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmap);
        bitmapDrawable.setBounds(0, 0, bitmapDrawable.getIntrinsicWidth(), bitmapDrawable.getIntrinsicHeight());
        m72637a(canvas, rectF, path, bitmapDrawable, matrix, paint);
    }

    /* renamed from: a */
    public static void m72637a(Canvas canvas, RectF rectF, Path path, Drawable drawable, Matrix matrix, Paint paint) {
        int save = canvas.save();
        canvas.clipRect(rectF);
        if (path != null) {
            canvas.clipPath(path);
        }
        if (drawable != null) {
            canvas.concat(matrix);
            if (paint != null) {
                canvas.drawPaint(paint);
            }
            drawable.draw(canvas);
        }
        canvas.restoreToCount(save);
    }
}
