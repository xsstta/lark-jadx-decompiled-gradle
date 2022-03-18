package com.ss.android.lark.mm.widget.texthighlightbg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005JT\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0003H\u0016J8\u0010\u0015\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0003H\u0002J8\u0010\u001b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0003H\u0002¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/mm/widget/texthighlightbg/MultiLineRenderer;", "Lcom/ss/android/lark/mm/widget/texthighlightbg/TextRoundedBgRenderer;", "horizontalPadding", "", "verticalPadding", "(II)V", "draw", "", "context", "Landroid/content/Context;", "canvas", "Landroid/graphics/Canvas;", "drawablePair", "Lkotlin/Pair;", "Landroid/graphics/drawable/Drawable;", "layout", "Landroid/text/Layout;", "startLine", "endLine", "startOffset", "endOffset", "drawEnd", "drawable", "start", "top", "end", "bottom", "drawStart", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.widget.texthighlightbg.c */
public final class MultiLineRenderer extends TextRoundedBgRenderer {
    public MultiLineRenderer(int i, int i2) {
        super(i, i2);
    }

    /* renamed from: a */
    private final void m186892a(Canvas canvas, Drawable drawable, int i, int i2, int i3, int i4) {
        if (i > i3) {
            drawable.setBounds(i3, i2, i, i4);
            drawable.draw(canvas);
            return;
        }
        drawable.setBounds(i, i2, i3, i4);
        drawable.draw(canvas);
    }

    /* renamed from: b */
    private final void m186893b(Canvas canvas, Drawable drawable, int i, int i2, int i3, int i4) {
        if (i > i3) {
            drawable.setBounds(i3, i2, i, i4);
            drawable.draw(canvas);
            return;
        }
        drawable.setBounds(i, i2, i3, i4);
        drawable.draw(canvas);
    }

    @Override // com.ss.android.lark.mm.widget.texthighlightbg.TextRoundedBgRenderer
    /* renamed from: a */
    public void mo165878a(Context context, Canvas canvas, Pair<Integer, ? extends Drawable> pair, Layout layout, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        Intrinsics.checkParameterIsNotNull(pair, "drawablePair");
        Intrinsics.checkParameterIsNotNull(layout, "layout");
        int intValue = pair.getFirst().intValue();
        int paragraphDirection = layout.getParagraphDirection(i);
        if (paragraphDirection == -1) {
            f = layout.getLineLeft(i) - ((float) mo165879a());
        } else {
            f = layout.getLineRight(i) + ((float) mo165879a());
        }
        int i5 = (int) f;
        int[] a = mo165881a(context, layout, i, pair.getFirst().intValue());
        int i6 = a[1];
        int i7 = a[0];
        if (intValue == HighlightStyle.ORIGINAL_TEXT_BG.getValue() || intValue == HighlightStyle.COMMENT_SELECTION_BG.getValue() || intValue == HighlightStyle.COMMENT_SELECTION_UNDERLINE.getValue()) {
            i5 = Math.max(layout.getWidth(), i5);
        }
        m186892a(canvas, (Drawable) pair.getSecond(), i3, i7, i5, i6);
        for (int i8 = i + 1; i8 < i2; i8++) {
            int[] a2 = mo165881a(context, layout, i8, pair.getFirst().intValue());
            int i9 = a2[0];
            int i10 = a2[1];
            int lineRight = ((int) layout.getLineRight(i8)) + mo165879a();
            if (intValue == HighlightStyle.ORIGINAL_TEXT_BG.getValue() || intValue == HighlightStyle.COMMENT_SELECTION_BG.getValue() || intValue == HighlightStyle.COMMENT_SELECTION_UNDERLINE.getValue()) {
                lineRight = Math.max(layout.getWidth(), lineRight);
            }
            ((Drawable) pair.getSecond()).setBounds(((int) layout.getLineLeft(i8)) - mo165879a(), i9, lineRight, i10);
            ((Drawable) pair.getSecond()).draw(canvas);
        }
        if (paragraphDirection == -1) {
            f2 = layout.getLineRight(i) + ((float) mo165879a());
        } else {
            f2 = layout.getLineLeft(i) - ((float) mo165879a());
        }
        int i11 = (int) f2;
        int[] a3 = mo165881a(context, layout, i2, pair.getFirst().intValue());
        m186893b(canvas, (Drawable) pair.getSecond(), i11, a3[0], i4, a3[1]);
    }
}
