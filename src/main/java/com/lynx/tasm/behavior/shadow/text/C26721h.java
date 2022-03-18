package com.lynx.tasm.behavior.shadow.text;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.kit.nglynx.log.LynxKitALogDelegate;

/* renamed from: com.lynx.tasm.behavior.shadow.text.h */
public class C26721h {
    /* renamed from: a */
    public static StaticLayout m96853a(CharSequence charSequence, int i, int i2, TextPaint textPaint, int i3, Layout.Alignment alignment, float f, float f2, boolean z, TextUtils.TruncateAt truncateAt, int i4) {
        if (i4 == -1) {
            return new StaticLayout(charSequence, i, i2, textPaint, i3, alignment, f, f2, z);
        }
        try {
            return (StaticLayout) StaticLayout.class.getConstructor(CharSequence.class, Integer.TYPE, Integer.TYPE, TextPaint.class, Integer.TYPE, Layout.Alignment.class, TextDirectionHeuristic.class, Float.TYPE, Float.TYPE, Boolean.TYPE, TextUtils.TruncateAt.class, Integer.TYPE, Integer.TYPE).newInstance(charSequence, Integer.valueOf(i), Integer.valueOf(i2), textPaint, Integer.valueOf(i3), alignment, TextDirectionHeuristics.FIRSTSTRONG_LTR, Float.valueOf(f), Float.valueOf(f2), Boolean.valueOf(z), truncateAt, Integer.valueOf(i3), Integer.valueOf(i4));
        } catch (Throwable th) {
            Log.e(LynxKitALogDelegate.f38587a, "create StaticLayout failed!", th);
            return new StaticLayout(charSequence, i, i2, textPaint, i3, alignment, f, f2, z);
        }
    }
}
