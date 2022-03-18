package com.ss.android.lark.widget.span;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.widget.span.e */
public class C59154e {
    /* renamed from: a */
    public static Drawable m229814a(Drawable drawable, int i, int i2, C59153c cVar) {
        if (cVar == null) {
            return drawable;
        }
        return new Drawable(cVar, i, i2, drawable) {
            /* class com.ss.android.lark.widget.span.C59154e.C591551 */

            /* renamed from: a */
            RectF f146826a = new RectF();

            /* renamed from: b */
            RectF f146827b = new RectF();

            /* renamed from: c */
            RectF f146828c = new RectF();

            /* renamed from: d */
            Path f146829d = new Path();

            /* renamed from: e */
            Paint f146830e = new Paint(2);

            /* renamed from: f */
            Paint f146831f = new Paint();

            /* renamed from: g */
            int f146832g;

            /* renamed from: h */
            int f146833h;

            /* renamed from: i */
            final /* synthetic */ C59153c f146834i;

            /* renamed from: j */
            final /* synthetic */ int f146835j;

            /* renamed from: k */
            final /* synthetic */ int f146836k;

            /* renamed from: l */
            final /* synthetic */ Drawable f146837l;

            public int getOpacity() {
                return -3;
            }

            public void setAlpha(int i) {
            }

            public void setColorFilter(ColorFilter colorFilter) {
            }

            /* renamed from: a */
            private void m229815a() {
                this.f146826a.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) this.f146835j, (float) this.f146836k);
                float f = (((float) this.f146832g) * 1.0f) / 2.0f;
                this.f146828c.set(this.f146826a);
                this.f146828c.inset(f, f);
                this.f146827b.set(this.f146826a);
                RectF rectF = this.f146827b;
                int i = this.f146832g;
                rectF.inset((float) i, (float) i);
            }

            public void draw(Canvas canvas) {
                m229815a();
                m229816a(canvas);
                m229817b(canvas);
            }

            /* renamed from: b */
            private void m229817b(Canvas canvas) {
                this.f146831f.setAntiAlias(true);
                this.f146831f.setStyle(Paint.Style.STROKE);
                this.f146831f.setColor(this.f146834i.mo201080a());
                this.f146831f.setStrokeWidth((float) this.f146834i.mo201081b());
                this.f146829d.reset();
                Path path = this.f146829d;
                RectF rectF = this.f146828c;
                int i = this.f146833h;
                path.addRoundRect(rectF, (float) i, (float) i, Path.Direction.CW);
                canvas.drawPath(this.f146829d, this.f146831f);
            }

            /* renamed from: a */
            private void m229816a(Canvas canvas) {
                Drawable drawable = this.f146837l;
                if (drawable instanceof BitmapDrawable) {
                    Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                    if (bitmap == null || bitmap.isRecycled()) {
                        Log.m165389i("ImageBorderUtils", "bitmap recycled");
                        return;
                    }
                    this.f146831f.setAntiAlias(true);
                    int saveCount = canvas.getSaveCount();
                    canvas.save();
                    this.f146829d.reset();
                    Path path = this.f146829d;
                    RectF rectF = this.f146827b;
                    int i = this.f146833h;
                    path.addRoundRect(rectF, (float) i, (float) i, Path.Direction.CW);
                    canvas.clipPath(this.f146829d);
                    canvas.drawBitmap(bitmap, (Rect) null, this.f146826a, this.f146830e);
                    canvas.restoreToCount(saveCount);
                }
            }

            {
                this.f146834i = r1;
                this.f146835j = r2;
                this.f146836k = r3;
                this.f146837l = r4;
                this.f146832g = r1.mo201081b();
                this.f146833h = r1.mo201082c();
            }
        };
    }
}
