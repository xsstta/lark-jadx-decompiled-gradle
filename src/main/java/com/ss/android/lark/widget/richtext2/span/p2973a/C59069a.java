package com.ss.android.lark.widget.richtext2.span.p2973a;

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

/* renamed from: com.ss.android.lark.widget.richtext2.span.a.a */
public class C59069a extends ReplacementSpan implements LineHeightSpan {

    /* renamed from: a */
    Paint.FontMetrics f146428a;

    /* renamed from: b */
    private Context f146429b;

    /* renamed from: c */
    private int f146430c;

    /* renamed from: d */
    private int f146431d;

    /* renamed from: e */
    private Typeface f146432e;

    /* renamed from: f */
    private int f146433f;

    /* renamed from: g */
    private int f146434g;

    /* renamed from: h */
    private int f146435h;

    /* renamed from: i */
    private int f146436i;

    /* renamed from: j */
    private int f146437j;

    /* renamed from: k */
    private int f146438k;

    /* renamed from: l */
    private WeakReference<Drawable> f146439l;

    /* renamed from: m */
    private WeakReference<Bitmap> f146440m;

    /* renamed from: n */
    private int f146441n;

    /* renamed from: o */
    private int f146442o;

    /* renamed from: p */
    private int f146443p;

    /* renamed from: q */
    private int f146444q;

    /* renamed from: r */
    private int f146445r;

    /* renamed from: s */
    private int f146446s;

    /* renamed from: t */
    private Paint.Style f146447t;

    /* renamed from: u */
    private int f146448u;

    /* renamed from: v */
    private int f146449v;

    /* renamed from: a */
    private Bitmap m229441a() {
        Bitmap bitmap;
        WeakReference<Bitmap> weakReference = this.f146440m;
        if (weakReference != null) {
            bitmap = weakReference.get();
        } else {
            bitmap = null;
        }
        if (bitmap != null) {
            return bitmap;
        }
        Bitmap a = m229442a(m229443b());
        this.f146440m = new WeakReference<>(a);
        return a;
    }

    /* renamed from: b */
    private Drawable m229443b() {
        Drawable drawable;
        WeakReference<Drawable> weakReference = this.f146439l;
        if (weakReference != null) {
            drawable = weakReference.get();
        } else {
            drawable = null;
        }
        if (drawable == null) {
            try {
                drawable = C0760e.m3682a(this.f146429b.getResources(), this.f146441n, null);
            } catch (Resources.NotFoundException unused) {
            }
            this.f146439l = new WeakReference<>(drawable);
        }
        return drawable;
    }

    /* renamed from: a */
    public static Bitmap m229442a(Drawable drawable) {
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

    /* renamed from: a */
    private float m229440a(Paint paint, CharSequence charSequence, int i, int i2) {
        paint.setTypeface(this.f146432e);
        paint.setTextSize((float) this.f146433f);
        return paint.measureText(charSequence, i, i2);
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        int i3;
        paint.setTypeface(this.f146432e);
        paint.setTextSize((float) this.f146433f);
        if (m229441a() == null) {
            i3 = 0;
        } else {
            i3 = m229441a().getWidth() + this.f146436i;
        }
        float measureText = paint.measureText(charSequence, i, i2) + ((float) i3);
        int i4 = this.f146435h;
        int round = Math.round(measureText + ((float) (i4 + i4)) + ((float) (this.f146437j + this.f146438k)));
        this.f146449v = round;
        return round;
    }

    public void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        if (this.f146428a.bottom - this.f146428a.top > ((float) (fontMetricsInt.bottom - fontMetricsInt.top))) {
            fontMetricsInt.top = ((int) this.f146428a.top) - this.f146445r;
            fontMetricsInt.ascent = ((int) this.f146428a.ascent) - this.f146445r;
            fontMetricsInt.bottom = ((int) this.f146428a.bottom) + this.f146446s;
            fontMetricsInt.descent = ((int) this.f146428a.descent) + this.f146446s;
        }
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        CharSequence charSequence2;
        float f2;
        String charSequence3 = charSequence.toString();
        Bitmap a = m229441a();
        Bitmap a2 = m229441a();
        float f3 = BitmapDescriptorFactory.HUE_RED;
        if (a2 != null) {
            a.getWidth();
            float height = (float) ((i4 - (m229441a().getHeight() / 2)) - (this.f146442o / 2));
            charSequence2 = charSequence;
            f3 = ((float) this.f146435h) + f + ((float) this.f146437j);
            f2 = height;
        } else {
            charSequence2 = charSequence;
            f2 = BitmapDescriptorFactory.HUE_RED;
        }
        float a3 = m229440a(paint, charSequence2, i, i2);
        int i6 = this.f146434g;
        int i7 = this.f146444q;
        float f4 = (float) (((i4 - i6) - this.f146443p) - i7);
        int i8 = this.f146437j;
        float f5 = ((float) i8) + f;
        float f6 = (float) (i4 - i7);
        float f7 = ((float) this.f146435h) + f + ((float) i8);
        paint.setTextSize((float) this.f146433f);
        paint.setColor(this.f146430c);
        canvas.drawRect(new RectF(f, (float) i3, ((float) this.f146449v) + f, (float) i5), paint);
        if (a != null) {
            canvas.drawBitmap(a, f3, f2, paint);
        }
        paint.setColor(this.f146431d);
        canvas.drawText(charSequence, i, i2, f7, f6, paint);
        String substring = charSequence3.substring(i, i2);
        if (!substring.equals("@" + UIUtils.getString(this.f146429b, R.string.Lark_Legacy_AllPeople))) {
            if (this.f146447t == Paint.Style.STROKE) {
                paint.setStyle(Paint.Style.STROKE);
            } else {
                paint.setStyle(Paint.Style.FILL_AND_STROKE);
            }
            paint.setStrokeWidth((float) UIUtils.dp2px(this.f146429b, 1.0f));
            paint.setColor(this.f146448u);
            canvas.drawCircle(f5 + a3 + ((float) UIUtils.dp2px(this.f146429b, 2.0f)), f4 + ((float) UIUtils.dp2px(this.f146429b, 3.0f)), (float) UIUtils.dp2px(this.f146429b, 2.0f), paint);
        }
    }
}
