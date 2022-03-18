package com.ss.android.lark.mm.widget.texthighlightbg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005JT\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0003H\u0016¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/mm/widget/texthighlightbg/SingleLineRenderer;", "Lcom/ss/android/lark/mm/widget/texthighlightbg/TextRoundedBgRenderer;", "horizontalPadding", "", "verticalPadding", "(II)V", "draw", "", "context", "Landroid/content/Context;", "canvas", "Landroid/graphics/Canvas;", "drawable", "Lkotlin/Pair;", "Landroid/graphics/drawable/Drawable;", "layout", "Landroid/text/Layout;", "startLine", "endLine", "startOffset", "endOffset", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.widget.texthighlightbg.d */
public final class SingleLineRenderer extends TextRoundedBgRenderer {
    public SingleLineRenderer(int i, int i2) {
        super(i, i2);
    }

    @Override // com.ss.android.lark.mm.widget.texthighlightbg.TextRoundedBgRenderer
    /* renamed from: a */
    public void mo165878a(Context context, Canvas canvas, Pair<Integer, ? extends Drawable> pair, Layout layout, int i, int i2, int i3, int i4) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        Intrinsics.checkParameterIsNotNull(pair, "drawable");
        Intrinsics.checkParameterIsNotNull(layout, "layout");
        int min = Math.min(i3, i4);
        int max = Math.max(i3, i4);
        if (pair.getFirst().intValue() == HighlightStyle.ORIGINAL_TEXT_BG.getValue()) {
            max = Math.max(max, layout.getWidth());
        }
        int[] a = mo165881a(context, layout, i, pair.getFirst().intValue());
        ((Drawable) pair.getSecond()).setBounds(min, a[0], max, a[1]);
        ((Drawable) pair.getSecond()).draw(canvas);
    }
}
