package androidx.core.text;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import androidx.core.util.C0843d;
import java.util.concurrent.Executor;

/* renamed from: androidx.core.text.c */
public class C0824c implements Spannable {

    /* renamed from: a */
    private static final Object f3284a = new Object();

    /* renamed from: b */
    private static Executor f3285b;

    /* renamed from: c */
    private final Spannable f3286c;

    /* renamed from: d */
    private final C0825a f3287d;

    /* renamed from: e */
    private final PrecomputedText f3288e;

    /* renamed from: androidx.core.text.c$a */
    public static final class C0825a {

        /* renamed from: a */
        final PrecomputedText.Params f3289a;

        /* renamed from: b */
        private final TextPaint f3290b;

        /* renamed from: c */
        private final TextDirectionHeuristic f3291c;

        /* renamed from: d */
        private final int f3292d;

        /* renamed from: e */
        private final int f3293e;

        /* renamed from: a */
        public TextPaint mo4455a() {
            return this.f3290b;
        }

        /* renamed from: b */
        public TextDirectionHeuristic mo4457b() {
            return this.f3291c;
        }

        /* renamed from: c */
        public int mo4458c() {
            return this.f3292d;
        }

        /* renamed from: d */
        public int mo4459d() {
            return this.f3293e;
        }

        /* renamed from: androidx.core.text.c$a$a */
        public static class C0826a {

            /* renamed from: a */
            private final TextPaint f3294a;

            /* renamed from: b */
            private TextDirectionHeuristic f3295b;

            /* renamed from: c */
            private int f3296c;

            /* renamed from: d */
            private int f3297d;

            /* renamed from: a */
            public C0825a mo4465a() {
                return new C0825a(this.f3294a, this.f3295b, this.f3296c, this.f3297d);
            }

            /* renamed from: a */
            public C0826a mo4463a(int i) {
                this.f3296c = i;
                return this;
            }

            /* renamed from: b */
            public C0826a mo4466b(int i) {
                this.f3297d = i;
                return this;
            }

            /* renamed from: a */
            public C0826a mo4464a(TextDirectionHeuristic textDirectionHeuristic) {
                this.f3295b = textDirectionHeuristic;
                return this;
            }

            public C0826a(TextPaint textPaint) {
                this.f3294a = textPaint;
                if (Build.VERSION.SDK_INT >= 23) {
                    this.f3296c = 1;
                    this.f3297d = 1;
                } else {
                    this.f3297d = 0;
                    this.f3296c = 0;
                }
                if (Build.VERSION.SDK_INT >= 18) {
                    this.f3295b = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                } else {
                    this.f3295b = null;
                }
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            sb.append("textSize=" + this.f3290b.getTextSize());
            sb.append(", textScaleX=" + this.f3290b.getTextScaleX());
            sb.append(", textSkewX=" + this.f3290b.getTextSkewX());
            if (Build.VERSION.SDK_INT >= 21) {
                sb.append(", letterSpacing=" + this.f3290b.getLetterSpacing());
                sb.append(", elegantTextHeight=" + this.f3290b.isElegantTextHeight());
            }
            if (Build.VERSION.SDK_INT >= 24) {
                sb.append(", textLocale=" + this.f3290b.getTextLocales());
            } else if (Build.VERSION.SDK_INT >= 17) {
                sb.append(", textLocale=" + this.f3290b.getTextLocale());
            }
            sb.append(", typeface=" + this.f3290b.getTypeface());
            if (Build.VERSION.SDK_INT >= 26) {
                sb.append(", variationSettings=" + this.f3290b.getFontVariationSettings());
            }
            sb.append(", textDir=" + this.f3291c);
            sb.append(", breakStrategy=" + this.f3292d);
            sb.append(", hyphenationFrequency=" + this.f3293e);
            sb.append("}");
            return sb.toString();
        }

        public int hashCode() {
            if (Build.VERSION.SDK_INT >= 24) {
                return C0843d.m3986a(Float.valueOf(this.f3290b.getTextSize()), Float.valueOf(this.f3290b.getTextScaleX()), Float.valueOf(this.f3290b.getTextSkewX()), Float.valueOf(this.f3290b.getLetterSpacing()), Integer.valueOf(this.f3290b.getFlags()), this.f3290b.getTextLocales(), this.f3290b.getTypeface(), Boolean.valueOf(this.f3290b.isElegantTextHeight()), this.f3291c, Integer.valueOf(this.f3292d), Integer.valueOf(this.f3293e));
            } else if (Build.VERSION.SDK_INT >= 21) {
                return C0843d.m3986a(Float.valueOf(this.f3290b.getTextSize()), Float.valueOf(this.f3290b.getTextScaleX()), Float.valueOf(this.f3290b.getTextSkewX()), Float.valueOf(this.f3290b.getLetterSpacing()), Integer.valueOf(this.f3290b.getFlags()), this.f3290b.getTextLocale(), this.f3290b.getTypeface(), Boolean.valueOf(this.f3290b.isElegantTextHeight()), this.f3291c, Integer.valueOf(this.f3292d), Integer.valueOf(this.f3293e));
            } else if (Build.VERSION.SDK_INT >= 18) {
                return C0843d.m3986a(Float.valueOf(this.f3290b.getTextSize()), Float.valueOf(this.f3290b.getTextScaleX()), Float.valueOf(this.f3290b.getTextSkewX()), Integer.valueOf(this.f3290b.getFlags()), this.f3290b.getTextLocale(), this.f3290b.getTypeface(), this.f3291c, Integer.valueOf(this.f3292d), Integer.valueOf(this.f3293e));
            } else if (Build.VERSION.SDK_INT >= 17) {
                return C0843d.m3986a(Float.valueOf(this.f3290b.getTextSize()), Float.valueOf(this.f3290b.getTextScaleX()), Float.valueOf(this.f3290b.getTextSkewX()), Integer.valueOf(this.f3290b.getFlags()), this.f3290b.getTextLocale(), this.f3290b.getTypeface(), this.f3291c, Integer.valueOf(this.f3292d), Integer.valueOf(this.f3293e));
            } else {
                return C0843d.m3986a(Float.valueOf(this.f3290b.getTextSize()), Float.valueOf(this.f3290b.getTextScaleX()), Float.valueOf(this.f3290b.getTextSkewX()), Integer.valueOf(this.f3290b.getFlags()), this.f3290b.getTypeface(), this.f3291c, Integer.valueOf(this.f3292d), Integer.valueOf(this.f3293e));
            }
        }

        public C0825a(PrecomputedText.Params params) {
            this.f3290b = params.getTextPaint();
            this.f3291c = params.getTextDirection();
            this.f3292d = params.getBreakStrategy();
            this.f3293e = params.getHyphenationFrequency();
            this.f3289a = Build.VERSION.SDK_INT < 29 ? null : params;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0825a)) {
                return false;
            }
            C0825a aVar = (C0825a) obj;
            if (!mo4456a(aVar)) {
                return false;
            }
            if (Build.VERSION.SDK_INT < 18 || this.f3291c == aVar.mo4457b()) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public boolean mo4456a(C0825a aVar) {
            if ((Build.VERSION.SDK_INT >= 23 && (this.f3292d != aVar.mo4458c() || this.f3293e != aVar.mo4459d())) || this.f3290b.getTextSize() != aVar.mo4455a().getTextSize() || this.f3290b.getTextScaleX() != aVar.mo4455a().getTextScaleX() || this.f3290b.getTextSkewX() != aVar.mo4455a().getTextSkewX()) {
                return false;
            }
            if ((Build.VERSION.SDK_INT >= 21 && (this.f3290b.getLetterSpacing() != aVar.mo4455a().getLetterSpacing() || !TextUtils.equals(this.f3290b.getFontFeatureSettings(), aVar.mo4455a().getFontFeatureSettings()))) || this.f3290b.getFlags() != aVar.mo4455a().getFlags()) {
                return false;
            }
            if (Build.VERSION.SDK_INT >= 24) {
                if (!this.f3290b.getTextLocales().equals(aVar.mo4455a().getTextLocales())) {
                    return false;
                }
            } else if (Build.VERSION.SDK_INT >= 17 && !this.f3290b.getTextLocale().equals(aVar.mo4455a().getTextLocale())) {
                return false;
            }
            if (this.f3290b.getTypeface() == null) {
                if (aVar.mo4455a().getTypeface() != null) {
                    return false;
                }
                return true;
            } else if (!this.f3290b.getTypeface().equals(aVar.mo4455a().getTypeface())) {
                return false;
            } else {
                return true;
            }
        }

        C0825a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f3289a = new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.f3289a = null;
            }
            this.f3290b = textPaint;
            this.f3291c = textDirectionHeuristic;
            this.f3292d = i;
            this.f3293e = i2;
        }
    }

    /* renamed from: b */
    public C0825a mo4443b() {
        return this.f3287d;
    }

    public int length() {
        return this.f3286c.length();
    }

    public String toString() {
        return this.f3286c.toString();
    }

    /* renamed from: a */
    public PrecomputedText mo4442a() {
        Spannable spannable = this.f3286c;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    public char charAt(int i) {
        return this.f3286c.charAt(i);
    }

    public int getSpanEnd(Object obj) {
        return this.f3286c.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        return this.f3286c.getSpanFlags(obj);
    }

    public int getSpanStart(Object obj) {
        return this.f3286c.getSpanStart(obj);
    }

    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.f3288e.removeSpan(obj);
        } else {
            this.f3286c.removeSpan(obj);
        }
    }

    public CharSequence subSequence(int i, int i2) {
        return this.f3286c.subSequence(i, i2);
    }

    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.f3286c.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 29 ? (T[]) this.f3288e.getSpans(i, i2, cls) : (T[]) this.f3286c.getSpans(i, i2, cls);
    }

    public void setSpan(Object obj, int i, int i2, int i3) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.f3288e.setSpan(obj, i, i2, i3);
        } else {
            this.f3286c.setSpan(obj, i, i2, i3);
        }
    }
}
