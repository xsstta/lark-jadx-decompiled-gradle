package com.ss.android.lark.widget.light.layout;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.core.text.AbstractC0827d;
import androidx.core.text.C0828e;
import java.lang.reflect.Field;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.widget.light.layout.d */
public class C58490d {
    /* renamed from: a */
    public static TextDirectionHeuristic m226891a(AbstractC0827d dVar) {
        if (dVar == C0828e.f3298a) {
            return TextDirectionHeuristics.LTR;
        }
        if (dVar == C0828e.f3299b) {
            return TextDirectionHeuristics.RTL;
        }
        if (dVar == C0828e.f3300c) {
            return TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
        if (dVar == C0828e.f3301d) {
            return TextDirectionHeuristics.FIRSTSTRONG_RTL;
        }
        if (dVar == C0828e.f3302e) {
            return TextDirectionHeuristics.ANYRTL_LTR;
        }
        if (dVar == C0828e.f3303f) {
            return TextDirectionHeuristics.LOCALE;
        }
        return TextDirectionHeuristics.FIRSTSTRONG_LTR;
    }

    /* renamed from: a */
    public static boolean m226893a(StaticLayout staticLayout) {
        int lineStart = staticLayout.getLineStart(0);
        int lineCount = staticLayout.getLineCount();
        int i = 0;
        while (i < lineCount) {
            int lineEnd = staticLayout.getLineEnd(i);
            if (lineEnd < lineStart) {
                try {
                    Field declaredField = StaticLayout.class.getDeclaredField("mLines");
                    declaredField.setAccessible(true);
                    Field declaredField2 = StaticLayout.class.getDeclaredField("mColumns");
                    declaredField2.setAccessible(true);
                    int[] iArr = (int[]) declaredField.get(staticLayout);
                    int i2 = declaredField2.getInt(staticLayout);
                    for (int i3 = 0; i3 < i2; i3++) {
                        int i4 = (i2 * i) + i3;
                        m226892a(iArr, i4, i4 + i2);
                    }
                    return false;
                } catch (Exception unused) {
                }
            } else {
                i++;
                lineStart = lineEnd;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static void m226892a(int[] iArr, int i, int i2) {
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
    }

    /* renamed from: a */
    private static StaticLayout m226888a(CharSequence charSequence, int i, int i2, TextPaint textPaint, int i3, Layout.Alignment alignment, float f, float f2, boolean z, TextUtils.TruncateAt truncateAt, int i4) {
        return new StaticLayout(charSequence, i, i2, textPaint, i3, alignment, f, f2, z, truncateAt, i4);
    }

    /* renamed from: a */
    private static StaticLayout m226889a(CharSequence charSequence, int i, int i2, TextPaint textPaint, int i3, Layout.Alignment alignment, float f, float f2, boolean z, TextUtils.TruncateAt truncateAt, int i4, int i5, AbstractC0827d dVar) {
        try {
            return m226894b(charSequence, i, i2, textPaint, i3, alignment, f, f2, z, truncateAt, i4, i5, dVar);
        } catch (LinkageError unused) {
            return m226888a(charSequence, i, i2, textPaint, i3, alignment, f, f2, z, truncateAt, i4);
        }
    }

    /* renamed from: b */
    private static StaticLayout m226894b(CharSequence charSequence, int i, int i2, TextPaint textPaint, int i3, Layout.Alignment alignment, float f, float f2, boolean z, TextUtils.TruncateAt truncateAt, int i4, int i5, AbstractC0827d dVar) {
        try {
            return new StaticLayout(charSequence, i, i2, textPaint, i3, alignment, f, f2, z, truncateAt, i4);
        } catch (IllegalArgumentException e) {
            if (e.getMessage().contains("utext_close")) {
                return new StaticLayout(charSequence, i, i2, textPaint, i3, alignment, f, f2, z, truncateAt, i4);
            }
            throw e;
        }
    }

    /* renamed from: a */
    public static StaticLayout m226890a(CharSequence charSequence, int i, int i2, TextPaint textPaint, int i3, Layout.Alignment alignment, float f, float f2, boolean z, TextUtils.TruncateAt truncateAt, int i4, int i5, AbstractC0827d dVar, int i6, int i7, int i8, int[] iArr, int[] iArr2, boolean z2) {
        int lineStart;
        int i9;
        CharSequence charSequence2 = charSequence;
        if (Build.VERSION.SDK_INT >= 23) {
            StaticLayout.Builder indents = StaticLayout.Builder.obtain(charSequence, i, i2, textPaint, i3).setAlignment(alignment).setLineSpacing(f2, f).setIncludePad(z).setEllipsize(truncateAt).setEllipsizedWidth(i4).setMaxLines(i5).setTextDirection(m226891a(dVar)).setBreakStrategy(i6).setHyphenationFrequency(i7).setIndents(iArr, iArr2);
            if (Build.VERSION.SDK_INT >= 26) {
                indents.setJustificationMode(i8);
            }
            if (Build.VERSION.SDK_INT >= 28) {
                indents.setUseLineSpacingFromFallbacks(z2);
            }
            return indents.build();
        }
        StaticLayout a = m226889a(charSequence, i, i2, textPaint, i3, alignment, f, f2, z, truncateAt, i4, i5, dVar);
        if (i5 > 0) {
            StaticLayout staticLayout = a;
            int i10 = i2;
            while (staticLayout.getLineCount() > i5 && (lineStart = staticLayout.getLineStart(i5)) < i10) {
                int i11 = lineStart;
                while (i11 > i && Character.isSpace(charSequence2.charAt(i11 - 1))) {
                    i11--;
                }
                StaticLayout a2 = m226889a(charSequence, i, i11, textPaint, i3, alignment, f, f2, z, truncateAt, i4, i5, dVar);
                if (a2.getLineCount() < i5 || a2.getEllipsisCount(i5 - 1) != 0) {
                    i9 = i11;
                    charSequence2 = charSequence;
                } else {
                    StringBuilder sb = new StringBuilder();
                    charSequence2 = charSequence;
                    sb.append((Object) charSequence2.subSequence(i, i11));
                    sb.append(" …");
                    String sb2 = sb.toString();
                    i9 = i11;
                    a2 = m226889a(sb2, 0, sb2.length(), textPaint, i3, alignment, f, f2, z, truncateAt, i4, i5, dVar);
                }
                staticLayout = a2;
                i10 = i9;
            }
            a = staticLayout;
        }
        do {
        } while (!m226893a(a));
        return a;
    }
}
