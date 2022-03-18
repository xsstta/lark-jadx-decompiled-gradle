package com.ss.android.lark.widget.light.layout;

import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.LruCache;
import androidx.core.text.AbstractC0827d;
import androidx.core.text.C0828e;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;

public class TextLayoutBuilder {

    /* renamed from: a */
    static final LruCache<Integer, Layout> f144165a = new LruCache<>(100);

    /* renamed from: b */
    final C58485a f144166b = new C58485a();

    /* renamed from: c */
    private int f144167c;

    /* renamed from: d */
    private int f144168d = 2;

    /* renamed from: e */
    private int f144169e = Integer.MAX_VALUE;

    /* renamed from: f */
    private int f144170f = 2;

    /* renamed from: g */
    private Layout f144171g = null;

    /* renamed from: h */
    private AbstractC58486a f144172h;

    /* renamed from: i */
    private boolean f144173i = true;

    /* renamed from: j */
    private boolean f144174j = false;

    @Retention(RetentionPolicy.SOURCE)
    public @interface MeasureMode {
    }

    /* renamed from: b */
    public static void m226861b() {
        f144165a.evictAll();
    }

    /* renamed from: com.ss.android.lark.widget.light.layout.TextLayoutBuilder$a */
    static class C58485a {

        /* renamed from: A */
        boolean f144175A;

        /* renamed from: a */
        TextPaint f144176a = new TextPaint(1);

        /* renamed from: b */
        public int f144177b;

        /* renamed from: c */
        float f144178c;

        /* renamed from: d */
        float f144179d;

        /* renamed from: e */
        float f144180e;

        /* renamed from: f */
        int f144181f;

        /* renamed from: g */
        int f144182g;

        /* renamed from: h */
        int f144183h;

        /* renamed from: i */
        CharSequence f144184i;

        /* renamed from: j */
        ColorStateList f144185j;

        /* renamed from: k */
        float f144186k = 1.0f;

        /* renamed from: l */
        float f144187l = BitmapDescriptorFactory.HUE_RED;

        /* renamed from: m */
        float f144188m = Float.MAX_VALUE;

        /* renamed from: n */
        boolean f144189n = true;

        /* renamed from: o */
        boolean f144190o;

        /* renamed from: p */
        boolean f144191p;

        /* renamed from: q */
        TextUtils.TruncateAt f144192q;

        /* renamed from: r */
        boolean f144193r;

        /* renamed from: s */
        int f144194s;

        /* renamed from: t */
        Layout.Alignment f144195t;

        /* renamed from: u */
        AbstractC0827d f144196u;

        /* renamed from: v */
        int f144197v;

        /* renamed from: w */
        int f144198w;

        /* renamed from: x */
        int f144199x;

        /* renamed from: y */
        int[] f144200y;

        /* renamed from: z */
        int[] f144201z;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo198160a() {
            if (this.f144175A) {
                TextPaint textPaint = new TextPaint(this.f144176a);
                textPaint.set(this.f144176a);
                this.f144176a = textPaint;
                this.f144175A = false;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo198161b() {
            return Math.round((((float) this.f144176a.getFontMetricsInt(null)) * this.f144186k) + this.f144187l);
        }

        C58485a() {
            boolean z = true;
            this.f144190o = Build.VERSION.SDK_INT < 28 ? false : z;
            this.f144191p = false;
            this.f144192q = null;
            this.f144193r = false;
            this.f144194s = Integer.MAX_VALUE;
            this.f144195t = Layout.Alignment.ALIGN_NORMAL;
            this.f144196u = C0828e.f3300c;
            this.f144197v = 0;
            this.f144198w = 0;
            this.f144199x = 0;
            this.f144175A = false;
        }

        public int hashCode() {
            int i;
            int i2;
            int i3;
            int i4;
            int color = (((this.f144176a.getColor() + 31) * 31) + Float.floatToIntBits(this.f144176a.getTextSize())) * 31;
            int i5 = 0;
            if (this.f144176a.getTypeface() != null) {
                i = this.f144176a.getTypeface().hashCode();
            } else {
                i = 0;
            }
            int floatToIntBits = (((((((((((((((((((((((((((((color + i) * 31) + Float.floatToIntBits(this.f144178c)) * 31) + Float.floatToIntBits(this.f144179d)) * 31) + Float.floatToIntBits(this.f144180e)) * 31) + this.f144181f) * 31) + this.f144176a.linkColor) * 31) + Float.floatToIntBits(this.f144176a.density)) * 31) + Arrays.hashCode(this.f144176a.drawableState)) * 31) + this.f144182g) * 31) + this.f144183h) * 31) + Float.floatToIntBits(this.f144186k)) * 31) + Float.floatToIntBits(this.f144187l)) * 31) + Float.floatToIntBits(this.f144188m)) * 31) + (this.f144189n ? 1 : 0)) * 31) + (this.f144190o ? 1 : 0)) * 31;
            TextUtils.TruncateAt truncateAt = this.f144192q;
            if (truncateAt != null) {
                i2 = truncateAt.hashCode();
            } else {
                i2 = 0;
            }
            int i6 = (((((floatToIntBits + i2) * 31) + (this.f144193r ? 1 : 0)) * 31) + this.f144194s) * 31;
            Layout.Alignment alignment = this.f144195t;
            if (alignment != null) {
                i3 = alignment.hashCode();
            } else {
                i3 = 0;
            }
            int i7 = (i6 + i3) * 31;
            AbstractC0827d dVar = this.f144196u;
            if (dVar != null) {
                i4 = dVar.hashCode();
            } else {
                i4 = 0;
            }
            int hashCode = (((((((((i7 + i4) * 31) + this.f144197v) * 31) + this.f144198w) * 31) + Arrays.hashCode(this.f144200y)) * 31) + Arrays.hashCode(this.f144201z)) * 31;
            CharSequence charSequence = this.f144184i;
            if (charSequence != null) {
                i5 = charSequence.hashCode();
            }
            return ((hashCode + i5) * 31) + this.f144177b;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:74:0x01b3 A[LOOP:0: B:50:0x0122->B:74:0x01b3, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01c8 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.text.Layout mo198142a() {
        /*
        // Method dump skipped, instructions count: 458
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.widget.light.layout.TextLayoutBuilder.mo198142a():android.text.Layout");
    }

    /* renamed from: a */
    public TextLayoutBuilder mo198148a(AbstractC58486a aVar) {
        this.f144172h = aVar;
        return this;
    }

    /* renamed from: c */
    public TextLayoutBuilder mo198156c(boolean z) {
        this.f144173i = z;
        return this;
    }

    /* renamed from: d */
    public TextLayoutBuilder mo198158d(boolean z) {
        this.f144174j = z;
        return this;
    }

    /* renamed from: a */
    public TextLayoutBuilder mo198146a(Layout.Alignment alignment) {
        if (this.f144166b.f144195t != alignment) {
            this.f144166b.f144195t = alignment;
            this.f144171g = null;
        }
        return this;
    }

    /* renamed from: b */
    public TextLayoutBuilder mo198153b(boolean z) {
        if (this.f144166b.f144193r != z) {
            this.f144166b.f144193r = z;
            this.f144171g = null;
        }
        return this;
    }

    /* renamed from: c */
    public TextLayoutBuilder mo198155c(int i) {
        if (this.f144166b.f144194s != i) {
            this.f144166b.f144194s = i;
            this.f144171g = null;
        }
        return this;
    }

    /* renamed from: d */
    public TextLayoutBuilder mo198157d(int i) {
        this.f144169e = i;
        this.f144170f = 2;
        this.f144166b.f144177b = i;
        return this;
    }

    /* renamed from: a */
    public TextLayoutBuilder mo198143a(float f) {
        if (this.f144166b.f144188m == Float.MAX_VALUE && this.f144166b.f144187l != f) {
            this.f144166b.f144187l = f;
            this.f144171g = null;
        }
        return this;
    }

    /* renamed from: b */
    public TextLayoutBuilder mo198151b(float f) {
        if (this.f144166b.f144188m == Float.MAX_VALUE && this.f144166b.f144186k != f) {
            this.f144166b.f144186k = f;
            this.f144171g = null;
        }
        return this;
    }

    /* renamed from: e */
    public TextLayoutBuilder mo198159e(boolean z) {
        if (this.f144166b.f144191p != z) {
            this.f144166b.f144191p = z;
            if (this.f144166b.f144184i.length() == 0) {
                this.f144171g = null;
            }
        }
        return this;
    }

    /* renamed from: a */
    public TextLayoutBuilder mo198144a(int i) {
        float f = (float) i;
        if (this.f144166b.f144176a.getTextSize() != f) {
            this.f144166b.mo198160a();
            this.f144166b.f144176a.setTextSize(f);
            this.f144171g = null;
        }
        return this;
    }

    /* renamed from: b */
    public TextLayoutBuilder mo198152b(int i) {
        this.f144166b.mo198160a();
        this.f144166b.f144185j = null;
        this.f144166b.f144176a.setColor(i);
        this.f144171g = null;
        return this;
    }

    /* renamed from: c */
    public TextLayoutBuilder mo198154c(float f) {
        if (this.f144166b.f144188m != f) {
            this.f144166b.f144188m = f;
            C58485a aVar = this.f144166b;
            aVar.f144187l = f - aVar.f144176a.getFontMetrics(null);
            this.f144166b.f144186k = 1.0f;
            this.f144171g = null;
        }
        return this;
    }

    /* renamed from: a */
    public TextLayoutBuilder mo198145a(Typeface typeface) {
        if (this.f144166b.f144176a.getTypeface() != typeface) {
            this.f144166b.mo198160a();
            this.f144166b.f144176a.setTypeface(typeface);
            this.f144171g = null;
        }
        return this;
    }

    /* renamed from: a */
    public TextLayoutBuilder mo198147a(TextUtils.TruncateAt truncateAt) {
        if (this.f144166b.f144192q != truncateAt) {
            this.f144166b.f144192q = truncateAt;
            this.f144171g = null;
        }
        return this;
    }

    /* renamed from: a */
    public TextLayoutBuilder mo198149a(CharSequence charSequence) {
        if (charSequence == this.f144166b.f144184i) {
            return this;
        }
        if (Build.VERSION.SDK_INT >= 21 && (charSequence instanceof SpannableStringBuilder)) {
            try {
                charSequence.hashCode();
            } catch (NullPointerException e) {
                throw new IllegalArgumentException("The given text contains a null span. Due to an Android framework bug, this will cause an exception later down the line.", e);
            }
        }
        if (charSequence != null && charSequence.equals(this.f144166b.f144184i)) {
            return this;
        }
        this.f144166b.f144184i = charSequence;
        this.f144171g = null;
        return this;
    }

    /* renamed from: a */
    public TextLayoutBuilder mo198150a(boolean z) {
        if (this.f144166b.f144189n != z) {
            this.f144166b.f144189n = z;
            this.f144171g = null;
        }
        return this;
    }
}
