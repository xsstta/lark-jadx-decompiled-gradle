package com.ss.android.lark.widget.linked_emojicon.p2942b;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.style.LineHeightSpan;
import android.text.style.ReplacementSpan;
import androidx.core.content.res.C0760e;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* renamed from: com.ss.android.lark.widget.linked_emojicon.b.a */
public class C58499a extends ReplacementSpan implements LineHeightSpan {

    /* renamed from: a */
    Paint.FontMetrics f144300a;

    /* renamed from: b */
    Paint.FontMetrics f144301b;

    /* renamed from: c */
    private Context f144302c;

    /* renamed from: d */
    private int f144303d;

    /* renamed from: e */
    private int f144304e;

    /* renamed from: f */
    private int f144305f;

    /* renamed from: g */
    private Typeface f144306g;

    /* renamed from: h */
    private int f144307h;

    /* renamed from: i */
    private int f144308i;

    /* renamed from: j */
    private int f144309j;

    /* renamed from: k */
    private int f144310k;

    /* renamed from: l */
    private int f144311l;

    /* renamed from: m */
    private int f144312m;

    /* renamed from: n */
    private int f144313n;

    /* renamed from: o */
    private WeakReference<Drawable> f144314o;

    /* renamed from: p */
    private WeakReference<Bitmap> f144315p;

    /* renamed from: q */
    private int f144316q;

    /* renamed from: r */
    private int f144317r;

    /* renamed from: s */
    private int f144318s;

    /* renamed from: t */
    private int f144319t;

    /* renamed from: u */
    private int f144320u;

    /* renamed from: v */
    private int f144321v;

    /* renamed from: a */
    private Bitmap m226920a() {
        Bitmap bitmap;
        WeakReference<Bitmap> weakReference = this.f144315p;
        if (weakReference != null) {
            bitmap = weakReference.get();
        } else {
            bitmap = null;
        }
        if (bitmap != null) {
            return bitmap;
        }
        Bitmap a = m226921a(m226922b());
        this.f144315p = new WeakReference<>(a);
        return a;
    }

    /* renamed from: b */
    private Drawable m226922b() {
        Drawable drawable;
        WeakReference<Drawable> weakReference = this.f144314o;
        if (weakReference != null) {
            drawable = weakReference.get();
        } else {
            drawable = null;
        }
        if (drawable == null) {
            try {
                drawable = C0760e.m3682a(this.f144302c.getResources(), this.f144316q, null);
            } catch (Resources.NotFoundException unused) {
            }
            this.f144314o = new WeakReference<>(drawable);
        }
        return drawable;
    }

    /* renamed from: c */
    private void m226923c() {
        Paint paint = new Paint();
        paint.setTextSize((float) this.f144313n);
        paint.setTypeface(this.f144306g);
        Paint paint2 = new Paint();
        paint2.setTextSize((float) this.f144307h);
        paint2.setTypeface(this.f144306g);
        this.f144300a = paint.getFontMetrics();
        this.f144301b = paint2.getFontMetrics();
        this.f144320u = (8 - ((int) (-(this.f144300a.top - this.f144301b.top)))) - this.f144319t;
        this.f144321v = 8 - (((int) (this.f144300a.bottom - this.f144301b.bottom)) - this.f144319t);
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f144303d), Integer.valueOf(this.f144304e), Integer.valueOf(this.f144305f), this.f144306g, Integer.valueOf(this.f144307h), Integer.valueOf(this.f144308i), Integer.valueOf(this.f144309j), Integer.valueOf(this.f144310k), Integer.valueOf(this.f144311l), Integer.valueOf(this.f144312m), Integer.valueOf(this.f144313n), Integer.valueOf(this.f144317r), Integer.valueOf(this.f144318s), Integer.valueOf(this.f144319t), Integer.valueOf(this.f144320u), Integer.valueOf(this.f144321v));
    }

    /* renamed from: r */
    private void m226924r(int i) {
        this.f144316q = i;
    }

    /* renamed from: a */
    public void mo198246a(int i) {
        mo198249b(i);
    }

    /* renamed from: b */
    public void mo198249b(int i) {
        this.f144304e = i;
    }

    /* renamed from: c */
    public void mo198250c(int i) {
        this.f144305f = i;
    }

    /* renamed from: d */
    public void mo198252d(int i) {
        this.f144307h = i;
    }

    /* renamed from: f */
    public void mo198256f(int i) {
        this.f144308i = i;
    }

    /* renamed from: h */
    public void mo198259h(int i) {
        this.f144309j = i;
    }

    /* renamed from: j */
    public void mo198262j(int i) {
        this.f144310k = i;
    }

    /* renamed from: m */
    public void mo198265m(int i) {
        this.f144311l = i;
    }

    /* renamed from: n */
    public void mo198266n(int i) {
        this.f144312m = i;
    }

    /* renamed from: o */
    public void mo198267o(int i) {
        this.f144313n = i;
    }

    /* renamed from: q */
    public void mo198269q(int i) {
        this.f144303d = i;
    }

    /* renamed from: a */
    public void mo198247a(Typeface typeface) {
        this.f144306g = typeface;
    }

    /* renamed from: s */
    private int m226925s(int i) {
        Paint paint = new Paint();
        paint.setTypeface(this.f144306g);
        paint.setTextSize((float) i);
        return m226919a(paint, "T");
    }

    /* renamed from: e */
    public void mo198254e(int i) {
        int i2;
        if (i == 0) {
            i2 = 0;
        } else {
            i2 = this.f144302c.getResources().getDimensionPixelSize(i);
        }
        mo198256f(i2);
    }

    /* renamed from: g */
    public void mo198257g(int i) {
        int i2;
        if (i == 0) {
            i2 = 0;
        } else {
            i2 = this.f144302c.getResources().getDimensionPixelSize(i);
        }
        mo198259h(i2);
    }

    /* renamed from: i */
    public void mo198261i(int i) {
        int i2;
        if (i == 0) {
            i2 = 0;
        } else {
            i2 = this.f144302c.getResources().getDimensionPixelSize(i);
        }
        mo198262j(i2);
    }

    /* renamed from: k */
    public void mo198263k(int i) {
        int i2;
        if (i == 0) {
            i2 = 0;
        } else {
            i2 = this.f144302c.getResources().getDimensionPixelSize(i);
        }
        mo198265m(i2);
    }

    /* renamed from: l */
    public void mo198264l(int i) {
        int i2;
        if (i == 0) {
            i2 = 0;
        } else {
            i2 = this.f144302c.getResources().getDimensionPixelSize(i);
        }
        mo198266n(i2);
    }

    /* renamed from: p */
    public void mo198268p(int i) {
        int i2;
        if (i == 0) {
            i2 = 0;
        } else {
            i2 = this.f144302c.getResources().getDimensionPixelSize(i);
        }
        mo198269q(i2);
    }

    /* renamed from: a */
    public static Bitmap m226921a(Drawable drawable) {
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
        if (!(obj instanceof C58499a)) {
            return false;
        }
        C58499a aVar = (C58499a) obj;
        if (this.f144303d == aVar.f144303d && this.f144304e == aVar.f144304e && this.f144305f == aVar.f144305f && this.f144307h == aVar.f144307h && this.f144308i == aVar.f144308i && this.f144309j == aVar.f144309j && this.f144310k == aVar.f144310k && this.f144311l == aVar.f144311l && this.f144312m == aVar.f144312m && this.f144313n == aVar.f144313n && this.f144317r == aVar.f144317r && this.f144318s == aVar.f144318s && this.f144319t == aVar.f144319t && this.f144320u == aVar.f144320u && this.f144321v == aVar.f144321v && Objects.equals(this.f144306g, aVar.f144306g)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private int m226919a(Paint paint, String str) {
        Rect rect = new Rect();
        paint.getTextBounds(str.toString(), 0, str.toString().length(), rect);
        return rect.height();
    }

    /* renamed from: a */
    public void mo198248a(String str, Typeface typeface) {
        if (!TextUtils.isEmpty(str)) {
            mo198247a(Typeface.createFromAsset(this.f144302c.getAssets(), str));
        } else if (typeface != null) {
            mo198247a(typeface);
        }
    }

    /* renamed from: a */
    private float m226918a(Paint paint, CharSequence charSequence, int i, int i2) {
        paint.setTypeface(this.f144306g);
        paint.setTextSize((float) this.f144307h);
        return paint.measureText(charSequence, i, i2);
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        int i3;
        paint.setTypeface(this.f144306g);
        paint.setTextSize((float) this.f144307h);
        if (m226920a() == null) {
            i3 = 0;
        } else {
            i3 = m226920a().getWidth() + this.f144310k;
        }
        float measureText = paint.measureText(charSequence, i, i2) + ((float) i3);
        int i4 = this.f144309j;
        return Math.round(measureText + ((float) (i4 + i4)) + ((float) (this.f144311l + this.f144312m)));
    }

    public void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        if (this.f144300a.bottom - this.f144300a.top > ((float) (fontMetricsInt.bottom - fontMetricsInt.top))) {
            fontMetricsInt.top = ((int) this.f144300a.top) - this.f144320u;
            fontMetricsInt.ascent = ((int) this.f144300a.ascent) - this.f144320u;
            fontMetricsInt.bottom = ((int) this.f144300a.bottom) + this.f144321v;
            fontMetricsInt.descent = ((int) this.f144300a.descent) + this.f144321v;
        }
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        float f2;
        Bitmap a = m226920a();
        Bitmap a2 = m226920a();
        float f3 = BitmapDescriptorFactory.HUE_RED;
        if (a2 != null) {
            a.getWidth();
            float height = (float) ((i4 - (m226920a().getHeight() / 2)) - (this.f144317r / 2));
            f3 = f + ((float) this.f144309j) + ((float) this.f144311l);
            f2 = height;
        } else {
            f2 = BitmapDescriptorFactory.HUE_RED;
        }
        float min = (float) Math.min(i5, (i4 + this.f144308i) - this.f144319t);
        float f4 = (float) (((i4 - this.f144308i) - this.f144318s) - this.f144319t);
        float f5 = f + ((float) this.f144311l);
        int i6 = this.f144309j;
        float a3 = f + m226918a(paint, charSequence, i, i2) + ((float) (i6 + i6)) + ((float) this.f144312m);
        float f6 = (float) (i4 - this.f144319t);
        float f7 = f + ((float) i6) + ((float) this.f144311l);
        paint.setTextSize((float) this.f144307h);
        paint.setColor(this.f144304e);
        RectF rectF = new RectF(f5, f4, a3, min);
        float min2 = Math.min(Math.abs(min - f4), Math.abs(a3 - f5)) / 2.0f;
        canvas.drawRoundRect(rectF, min2, min2, paint);
        if (a != null) {
            canvas.drawBitmap(a, f3, f2, paint);
        }
        paint.setColor(this.f144305f);
        canvas.drawText(charSequence, i, i2, f7, f6, paint);
    }

    public C58499a(Context context, int i, int i2, int i3, String str, Typeface typeface, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        this.f144302c = context;
        mo198268p(i);
        mo198246a(i2);
        mo198250c(i3);
        mo198248a(str, typeface);
        mo198252d(i4);
        mo198254e(i5);
        mo198257g(i6);
        mo198261i(i7);
        mo198263k(i8);
        mo198264l(i9);
        mo198267o(i10);
        m226924r(i11);
        this.f144317r = m226925s(i10);
        int s = m226925s(i4);
        this.f144318s = s;
        this.f144319t = (this.f144317r - s) / 2;
        m226923c();
    }
}
