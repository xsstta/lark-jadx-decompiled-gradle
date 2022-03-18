package com.ss.android.lark.widget.linked_emojicon.p2941a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.style.LineHeightSpan;
import android.text.style.ReplacementSpan;
import androidx.core.content.res.C0760e;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* renamed from: com.ss.android.lark.widget.linked_emojicon.a.a */
public class C58497a extends ReplacementSpan implements LineHeightSpan {

    /* renamed from: b */
    private static float f144268b = 2.0f;

    /* renamed from: c */
    private static float f144269c = 3.0f;

    /* renamed from: d */
    private static float f144270d = 2.0f;

    /* renamed from: e */
    private static float f144271e = 1.0f;

    /* renamed from: A */
    private int f144272A;

    /* renamed from: a */
    Paint.FontMetrics f144273a;

    /* renamed from: f */
    private Context f144274f;

    /* renamed from: g */
    private int f144275g;

    /* renamed from: h */
    private int f144276h;

    /* renamed from: i */
    private int f144277i;

    /* renamed from: j */
    private Typeface f144278j;

    /* renamed from: k */
    private int f144279k;

    /* renamed from: l */
    private int f144280l;

    /* renamed from: m */
    private int f144281m;

    /* renamed from: n */
    private int f144282n;

    /* renamed from: o */
    private int f144283o;

    /* renamed from: p */
    private int f144284p;

    /* renamed from: q */
    private int f144285q;

    /* renamed from: r */
    private WeakReference<Drawable> f144286r;

    /* renamed from: s */
    private WeakReference<Bitmap> f144287s;

    /* renamed from: t */
    private int f144288t;

    /* renamed from: u */
    private int f144289u;

    /* renamed from: v */
    private int f144290v;

    /* renamed from: w */
    private int f144291w;

    /* renamed from: x */
    private int f144292x;

    /* renamed from: y */
    private int f144293y;

    /* renamed from: z */
    private Paint.Style f144294z;

    /* renamed from: a */
    private Bitmap m226912a() {
        Bitmap bitmap;
        WeakReference<Bitmap> weakReference = this.f144287s;
        if (weakReference != null) {
            bitmap = weakReference.get();
        } else {
            bitmap = null;
        }
        if (bitmap != null) {
            return bitmap;
        }
        Bitmap a = m226913a(m226914b());
        this.f144287s = new WeakReference<>(a);
        return a;
    }

    /* renamed from: b */
    private Drawable m226914b() {
        Drawable drawable;
        WeakReference<Drawable> weakReference = this.f144286r;
        if (weakReference != null) {
            drawable = weakReference.get();
        } else {
            drawable = null;
        }
        if (drawable == null) {
            try {
                drawable = C0760e.m3682a(this.f144274f.getResources(), this.f144288t, null);
            } catch (Resources.NotFoundException unused) {
            }
            this.f144286r = new WeakReference<>(drawable);
        }
        return drawable;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f144275g), Integer.valueOf(this.f144276h), Integer.valueOf(this.f144277i), this.f144278j, Integer.valueOf(this.f144279k), Integer.valueOf(this.f144280l), Integer.valueOf(this.f144281m), Integer.valueOf(this.f144282n), Integer.valueOf(this.f144283o), Integer.valueOf(this.f144284p), Integer.valueOf(this.f144285q), Integer.valueOf(this.f144289u), Integer.valueOf(this.f144290v), Integer.valueOf(this.f144291w), Integer.valueOf(this.f144292x), Integer.valueOf(this.f144293y), this.f144294z);
    }

    /* renamed from: a */
    public static Bitmap m226913a(Drawable drawable) {
        Bitmap bitmap;
        if (drawable == null) {
            return null;
        }
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

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C58497a)) {
            return false;
        }
        C58497a aVar = (C58497a) obj;
        if (this.f144275g == aVar.f144275g && this.f144276h == aVar.f144276h && this.f144277i == aVar.f144277i && this.f144279k == aVar.f144279k && this.f144280l == aVar.f144280l && this.f144281m == aVar.f144281m && this.f144282n == aVar.f144282n && this.f144283o == aVar.f144283o && this.f144284p == aVar.f144284p && this.f144285q == aVar.f144285q && this.f144289u == aVar.f144289u && this.f144290v == aVar.f144290v && this.f144291w == aVar.f144291w && this.f144292x == aVar.f144292x && this.f144293y == aVar.f144293y && Objects.equals(this.f144278j, aVar.f144278j) && this.f144294z == aVar.f144294z) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private float m226911a(Paint paint, CharSequence charSequence, int i, int i2) {
        paint.setTypeface(this.f144278j);
        paint.setTextSize((float) this.f144279k);
        return paint.measureText(charSequence, i, i2);
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        int i3;
        paint.setTypeface(this.f144278j);
        paint.setTextSize((float) this.f144279k);
        if (m226912a() == null) {
            i3 = 0;
        } else {
            i3 = m226912a().getWidth() + this.f144282n;
        }
        float measureText = paint.measureText(charSequence, i, i2) + ((float) i3);
        int i4 = this.f144281m;
        return Math.round(measureText + ((float) (i4 + i4)) + ((float) (this.f144283o + this.f144284p)));
    }

    public void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        if (this.f144273a.bottom - this.f144273a.top > ((float) (fontMetricsInt.bottom - fontMetricsInt.top))) {
            fontMetricsInt.top = ((int) this.f144273a.top) - this.f144292x;
            fontMetricsInt.ascent = ((int) this.f144273a.ascent) - this.f144292x;
            fontMetricsInt.bottom = ((int) this.f144273a.bottom) + this.f144293y;
            fontMetricsInt.descent = ((int) this.f144273a.descent) + this.f144293y;
        }
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        CharSequence charSequence2;
        float f2;
        float f3;
        String charSequence3 = charSequence.toString();
        Bitmap a = m226912a();
        Bitmap a2 = m226912a();
        float f4 = BitmapDescriptorFactory.HUE_RED;
        if (a2 != null) {
            f4 = (float) (a.getWidth() + this.f144282n);
            f3 = (float) ((i4 - (m226912a().getHeight() / 2)) - (this.f144289u / 2));
            f2 = f + ((float) this.f144281m) + ((float) this.f144283o);
            charSequence2 = charSequence;
        } else {
            charSequence2 = charSequence;
            f3 = BitmapDescriptorFactory.HUE_RED;
            f2 = BitmapDescriptorFactory.HUE_RED;
        }
        float a3 = m226911a(paint, charSequence2, i, i2);
        int i6 = this.f144280l;
        int i7 = this.f144291w;
        float f5 = (float) (((i4 - i6) - this.f144290v) - i7);
        int i8 = this.f144283o;
        float f6 = f + ((float) i8);
        int i9 = this.f144281m;
        float f7 = f + a3 + f4 + ((float) (i9 + i9)) + ((float) this.f144284p);
        float f8 = (float) (i4 - i7);
        float f9 = ((float) i8) + f + f4 + ((float) i9);
        paint.setTextSize((float) this.f144279k);
        paint.setColor(this.f144276h);
        RectF rectF = new RectF(f6, f5, f7, (float) ((i4 + i6) - i7));
        int i10 = this.f144275g;
        canvas.drawRoundRect(rectF, (float) i10, (float) i10, paint);
        if (a != null) {
            canvas.drawBitmap(a, f2, f3, paint);
        }
        paint.setColor(this.f144277i);
        canvas.drawText(charSequence, i, i2, f9, f8, paint);
        String substring = charSequence3.substring(i, i2);
        if (!substring.equals("@" + UIUtils.getString(this.f144274f, R.string.Lark_Legacy_AllPeople))) {
            if (this.f144294z == Paint.Style.STROKE) {
                paint.setStyle(Paint.Style.STROKE);
            } else {
                paint.setStyle(Paint.Style.FILL_AND_STROKE);
            }
            paint.setStrokeWidth((float) UIUtils.dp2px(this.f144274f, f144271e));
            paint.setColor(this.f144272A);
            canvas.drawCircle(f6 + a3 + ((float) UIUtils.dp2px(this.f144274f, f144268b)), f5 + ((float) UIUtils.dp2px(this.f144274f, f144269c)), (float) UIUtils.dp2px(this.f144274f, f144270d), paint);
        }
    }
}
