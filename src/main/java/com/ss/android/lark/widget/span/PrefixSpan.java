package com.ss.android.lark.widget.span;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.LeadingMarginSpan;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;

public class PrefixSpan implements LeadingMarginSpan {

    /* renamed from: b */
    private static Paint f146774b = new Paint();

    /* renamed from: a */
    private final C59146b f146775a;

    public enum Type {
        FILL_CIRCLE,
        HOLLOW_CIRCLE,
        FILL_RECT,
        HOLLOW_RECT,
        LIST_NUM,
        QUOTE,
        NONE,
        LEFT_MARGIN
    }

    /* renamed from: com.ss.android.lark.widget.span.PrefixSpan$b */
    public static class C59146b {

        /* renamed from: a */
        public Type f146778a;

        /* renamed from: b */
        public boolean f146779b = true;

        /* renamed from: c */
        public float f146780c;

        /* renamed from: d */
        public float f146781d;

        /* renamed from: e */
        public float f146782e;

        /* renamed from: f */
        public float f146783f;

        /* renamed from: g */
        public String f146784g;

        /* renamed from: h */
        public int f146785h;

        /* renamed from: a */
        public Type mo201020a() {
            return this.f146778a;
        }

        /* renamed from: b */
        public String mo201022b() {
            return this.f146784g;
        }

        /* renamed from: a */
        public void mo201021a(Type type) {
            this.f146778a = type;
        }
    }

    /* renamed from: b */
    public C59146b mo201009b() {
        return this.f146775a;
    }

    /* renamed from: a */
    public Type mo201008a() {
        return this.f146775a.mo201020a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.widget.span.PrefixSpan$1 */
    public static /* synthetic */ class C591441 {

        /* renamed from: a */
        static final /* synthetic */ int[] f146776a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.ss.android.lark.widget.span.PrefixSpan$Type[] r0 = com.ss.android.lark.widget.span.PrefixSpan.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.widget.span.PrefixSpan.C591441.f146776a = r0
                com.ss.android.lark.widget.span.PrefixSpan$Type r1 = com.ss.android.lark.widget.span.PrefixSpan.Type.FILL_CIRCLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.widget.span.PrefixSpan.C591441.f146776a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.widget.span.PrefixSpan$Type r1 = com.ss.android.lark.widget.span.PrefixSpan.Type.FILL_RECT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.widget.span.PrefixSpan.C591441.f146776a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.widget.span.PrefixSpan$Type r1 = com.ss.android.lark.widget.span.PrefixSpan.Type.HOLLOW_CIRCLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.widget.span.PrefixSpan.C591441.f146776a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.lark.widget.span.PrefixSpan$Type r1 = com.ss.android.lark.widget.span.PrefixSpan.Type.HOLLOW_RECT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.ss.android.lark.widget.span.PrefixSpan.C591441.f146776a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.ss.android.lark.widget.span.PrefixSpan$Type r1 = com.ss.android.lark.widget.span.PrefixSpan.Type.QUOTE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = com.ss.android.lark.widget.span.PrefixSpan.C591441.f146776a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.ss.android.lark.widget.span.PrefixSpan$Type r1 = com.ss.android.lark.widget.span.PrefixSpan.Type.LIST_NUM     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.widget.span.PrefixSpan.C591441.<clinit>():void");
        }
    }

    /* renamed from: com.ss.android.lark.widget.span.PrefixSpan$a */
    public static class C59145a {

        /* renamed from: a */
        private C59146b f146777a;

        /* renamed from: a */
        public PrefixSpan mo201016a() {
            return new PrefixSpan(this.f146777a);
        }

        /* renamed from: a */
        public C59145a mo201012a(float f) {
            this.f146777a.f146780c = f;
            return this;
        }

        /* renamed from: b */
        public C59145a mo201017b(float f) {
            this.f146777a.f146782e = f;
            return this;
        }

        /* renamed from: c */
        public C59145a mo201018c(float f) {
            this.f146777a.f146781d = f;
            return this;
        }

        /* renamed from: d */
        public C59145a mo201019d(float f) {
            this.f146777a.f146783f = f;
            return this;
        }

        public C59145a(Type type) {
            C59146b bVar = new C59146b();
            this.f146777a = bVar;
            bVar.f146778a = type;
        }

        /* renamed from: a */
        public C59145a mo201013a(int i) {
            this.f146777a.f146785h = i;
            return this;
        }

        /* renamed from: a */
        public C59145a mo201014a(String str) {
            this.f146777a.f146784g = str;
            return this;
        }

        /* renamed from: a */
        public C59145a mo201015a(boolean z) {
            this.f146777a.f146779b = z;
            return this;
        }
    }

    public PrefixSpan(C59146b bVar) {
        this.f146775a = bVar;
    }

    public int getLeadingMargin(boolean z) {
        float f;
        if (mo201008a() == Type.LEFT_MARGIN) {
            f = this.f146775a.f146780c;
        } else {
            f = this.f146775a.f146780c + this.f146775a.f146781d + this.f146775a.f146783f + 0.5f;
        }
        return (int) f;
    }

    /* renamed from: a */
    private void m229760a(Paint paint) {
        f146774b.reset();
        f146774b.set(paint);
        f146774b.setAntiAlias(true);
        f146774b.setColor(this.f146775a.f146785h);
        int i = C591441.f146776a[this.f146775a.f146778a.ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4 || i == 5) {
            f146774b.setStyle(Paint.Style.FILL);
        }
    }

    /* renamed from: c */
    private void m229763c(Canvas canvas, int i, int i2, int i3, int i4) {
        float f = (float) i;
        canvas.drawRect(f, (float) i3, (float) ((int) ((((float) i2) * this.f146775a.f146781d) + f)), (float) i4, f146774b);
    }

    /* renamed from: a */
    private void m229758a(Canvas canvas, int i, int i2, int i3, int i4) {
        float f = this.f146775a.f146781d / 2.0f;
        float f2 = ((float) i) + (((float) i2) * (this.f146775a.f146780c + f));
        float f3 = ((float) (i3 + i4)) / 2.0f;
        if (this.f146775a.f146778a == Type.FILL_CIRCLE) {
            canvas.drawCircle(f2, f3, f, f146774b);
        } else if (this.f146775a.f146778a == Type.HOLLOW_CIRCLE) {
            canvas.drawCircle(f2, f3, f, f146774b);
            f146774b.setColor(UIHelper.getColor(R.color.lkui_N00));
            canvas.drawCircle(f2, f3, f - this.f146775a.f146782e, f146774b);
        }
    }

    /* renamed from: b */
    private void m229761b(Canvas canvas, int i, int i2, int i3, int i4) {
        float f = ((float) (i3 + i4)) / 2.0f;
        float f2 = (float) i2;
        float f3 = ((float) i) + (this.f146775a.f146780c * f2);
        float f4 = (this.f146775a.f146781d * f2) + f3;
        float f5 = f - ((this.f146775a.f146781d * f2) / 2.0f);
        float f6 = ((f2 * this.f146775a.f146781d) / 2.0f) + f;
        if (this.f146775a.f146778a == Type.FILL_RECT) {
            canvas.drawRect(f3, f5, f4, f6, f146774b);
        } else if (this.f146775a.f146778a == Type.HOLLOW_RECT) {
            canvas.drawRect(f3, f5, f4, f6, f146774b);
            f146774b.setColor(UIHelper.getColor(R.color.lkui_N00));
            canvas.drawRect(f3 + this.f146775a.f146782e, f5 + this.f146775a.f146782e, f4 - this.f146775a.f146782e, f6 - this.f146775a.f146782e, f146774b);
        }
    }

    /* renamed from: a */
    private void m229759a(Canvas canvas, int i, int i2, int i3, int i4, int i5) {
        switch (C591441.f146776a[this.f146775a.f146778a.ordinal()]) {
            case 1:
            case 3:
                m229758a(canvas, i, i2, i3, i4);
                return;
            case 2:
            case 4:
                m229761b(canvas, i, i2, i3, i4);
                return;
            case 5:
                m229763c(canvas, i, i2, i3, i4);
                return;
            case 6:
                m229762b(canvas, i, i2, i3, i4, i5);
                return;
            default:
                return;
        }
    }

    /* renamed from: b */
    private void m229762b(Canvas canvas, int i, int i2, int i3, int i4, int i5) {
        String str = this.f146775a.f146784g;
        if (!TextUtils.isEmpty(str)) {
            float f = ((float) i) + (((float) i2) * this.f146775a.f146780c);
            Paint.FontMetricsInt fontMetricsInt = f146774b.getFontMetricsInt();
            if (i4 - i3 > (fontMetricsInt.bottom - fontMetricsInt.top) * 2) {
                Rect rect = new Rect();
                f146774b.getTextBounds(str, 0, str.length(), rect);
                canvas.drawText(str, f, (float) (i3 + rect.height() + ((fontMetricsInt.ascent - fontMetricsInt.top) * 2)), f146774b);
                return;
            }
            canvas.drawText(str, f, (float) i5, f146774b);
        }
    }

    public void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        if (this.f146775a.f146779b) {
            m229760a(paint);
            if (this.f146775a.f146778a == Type.QUOTE) {
                m229759a(canvas, i, i2, i3, i5, i4);
            } else if (((Spanned) charSequence).getSpanStart(this) == i6) {
                m229759a(canvas, i, i2, i3, i5, i4);
            }
        }
    }
}
