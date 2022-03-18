package com.ss.android.lark.reaction.widget.flowlayout.reaction;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.DynamicDrawableSpan;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004JR\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0016\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/reaction/widget/flowlayout/reaction/OffsetDynamicDrawableSpan;", "Landroid/text/style/DynamicDrawableSpan;", "verticalAlignment", "", "(I)V", "mDx", "", "mDy", "draw", "", "canvas", "Landroid/graphics/Canvas;", "text", "", "start", "end", "x", "top", "y", "bottom", "paint", "Landroid/graphics/Paint;", "updateOffset", "dx", "dy", "reaction-component_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.reaction.widget.flowlayout.reaction.c */
public abstract class OffsetDynamicDrawableSpan extends DynamicDrawableSpan {

    /* renamed from: a */
    private float f131178a;

    /* renamed from: b */
    private float f131179b;

    public OffsetDynamicDrawableSpan(int i) {
        super(i);
    }

    /* renamed from: a */
    public final void mo181279a(float f, float f2) {
        this.f131178a = f;
        this.f131179b = f2;
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        Intrinsics.checkParameterIsNotNull(paint, "paint");
        canvas.save();
        canvas.translate(this.f131178a, this.f131179b);
        super.draw(canvas, charSequence, i, i2, f, i3, i4, i5, paint);
        canvas.restore();
    }
}
