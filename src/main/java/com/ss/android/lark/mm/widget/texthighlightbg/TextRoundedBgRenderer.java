package com.ss.android.lark.mm.widget.texthighlightbg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import com.ss.android.lark.ui.p2892a.C57582a;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005JT\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0003H&J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0003H\u0004J\u0018\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0003H\u0004J-\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\u001eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/mm/widget/texthighlightbg/TextRoundedBgRenderer;", "", "horizontalPadding", "", "verticalPadding", "(II)V", "getHorizontalPadding", "()I", "getVerticalPadding", "draw", "", "context", "Landroid/content/Context;", "canvas", "Landroid/graphics/Canvas;", "drawable", "Lkotlin/Pair;", "Landroid/graphics/drawable/Drawable;", "layout", "Landroid/text/Layout;", "startLine", "endLine", "startOffset", "endOffset", "getLineBottom", "line", "getLineTop", "getRectTopAndBottom", "", "highlightType", "getRectTopAndBottom$mm_release", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.widget.texthighlightbg.e */
public abstract class TextRoundedBgRenderer {

    /* renamed from: a */
    private final int f118992a;

    /* renamed from: b */
    private final int f118993b;

    /* renamed from: a */
    public abstract void mo165878a(Context context, Canvas canvas, Pair<Integer, ? extends Drawable> pair, Layout layout, int i, int i2, int i3, int i4);

    /* renamed from: a */
    public final int mo165879a() {
        return this.f118992a;
    }

    public TextRoundedBgRenderer(int i, int i2) {
        this.f118992a = i;
        this.f118993b = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo165880a(Layout layout, int i) {
        Intrinsics.checkParameterIsNotNull(layout, "layout");
        return C47174a.m186886c(layout, i) - this.f118993b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo165882b(Layout layout, int i) {
        Intrinsics.checkParameterIsNotNull(layout, "layout");
        return C47174a.m186887d(layout, i) + this.f118993b;
    }

    /* renamed from: a */
    public final int[] mo165881a(Context context, Layout layout, int i, int i2) {
        int a;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(layout, "layout");
        int a2 = mo165880a(layout, i);
        int b = mo165882b(layout, i);
        if (i2 == HighlightStyle.COMMENT_DOTTED_LINE.getValue()) {
            a = C57582a.m223600a(5);
        } else if (i2 == HighlightStyle.COMMENT_SELECTION_UNDERLINE.getValue()) {
            a = C57582a.m223600a(2);
        } else {
            if (i2 == HighlightStyle.MENTION.getValue()) {
                a2 += C57582a.m223600a(1);
                b -= C57582a.m223600a(1);
            }
            return new int[]{a2, b};
        }
        a2 = b - a;
        return new int[]{a2, b};
    }
}
