package com.ss.android.lark.calendar.impl.utils;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import com.larksuite.framework.utils.UIUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006JP\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J2\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/calendar/impl/utils/RoundBgTag;", "Landroid/text/style/ReplacementSpan;", "mBgColor", "", "mTextColor", "mRadius", "(III)V", "draw", "", "canvas", "Landroid/graphics/Canvas;", "text", "", "start", "end", "x", "", "top", "y", "bottom", "paint", "Landroid/graphics/Paint;", "getSize", "fm", "Landroid/graphics/Paint$FontMetricsInt;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.utils.af */
public final class RoundBgTag extends ReplacementSpan {

    /* renamed from: a */
    private final int f83730a;

    /* renamed from: b */
    private final int f83731b;

    /* renamed from: c */
    private final int f83732c;

    public RoundBgTag(int i, int i2, int i3) {
        this.f83730a = i;
        this.f83731b = i2;
        this.f83732c = i3;
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Intrinsics.checkParameterIsNotNull(paint, "paint");
        Intrinsics.checkParameterIsNotNull(charSequence, "text");
        return Math.round(paint.measureText(charSequence, i, i2) + ((float) UIUtils.dp2px(C32634ae.m125179a(), 10.0f)));
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        Intrinsics.checkParameterIsNotNull(charSequence, "text");
        Intrinsics.checkParameterIsNotNull(paint, "paint");
        int color = paint.getColor();
        paint.setColor(this.f83730a);
        float f2 = (float) i3;
        canvas.drawRoundRect(new RectF(f, f2, paint.measureText(charSequence, i, i2) + f + ((float) UIUtils.dp2px(C32634ae.m125179a(), 5.0f)), ((paint.descent() + f2) - paint.ascent()) + ((float) UIUtils.dp2px(C32634ae.m125179a(), 2.0f))), (float) UIUtils.dp2px(C32634ae.m125179a(), (float) this.f83732c), (float) UIUtils.dp2px(C32634ae.m125179a(), (float) this.f83732c), paint);
        paint.setColor(this.f83731b);
        paint.setTextSize((float) UIUtils.dp2px(C32634ae.m125179a(), 11.0f));
        paint.setFakeBoldText(true);
        canvas.drawText(charSequence, i, i2, f + ((float) UIUtils.dp2px(C32634ae.m125179a(), 5.0f)), (float) i4, paint);
        paint.setColor(color);
    }
}
