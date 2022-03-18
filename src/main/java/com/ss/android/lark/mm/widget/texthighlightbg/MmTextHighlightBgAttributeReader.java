package com.ss.android.lark.mm.widget.texthighlightbg;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\nR\u0011\u0010\u0013\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/mm/widget/texthighlightbg/MmTextHighlightBgAttributeReader;", "", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "findDrawable", "Landroid/graphics/drawable/Drawable;", "getFindDrawable", "()Landroid/graphics/drawable/Drawable;", "findHighlightDrawable", "getFindHighlightDrawable", "horizontalPadding", "", "getHorizontalPadding", "()I", "syncDrawable", "getSyncDrawable", "verticalPadding", "getVerticalPadding", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MmTextHighlightBgAttributeReader {

    /* renamed from: a */
    private final int f118975a;

    /* renamed from: b */
    private final int f118976b;

    /* renamed from: c */
    private final Drawable f118977c;

    /* renamed from: d */
    private final Drawable f118978d;

    /* renamed from: e */
    private final Drawable f118979e;

    /* renamed from: a */
    public final int mo165870a() {
        return this.f118975a;
    }

    /* renamed from: b */
    public final int mo165871b() {
        return this.f118976b;
    }

    /* renamed from: c */
    public final Drawable mo165872c() {
        return this.f118977c;
    }

    /* renamed from: d */
    public final Drawable mo165873d() {
        return this.f118978d;
    }

    /* renamed from: e */
    public final Drawable mo165874e() {
        return this.f118979e;
    }

    public MmTextHighlightBgAttributeReader(Context context, AttributeSet attributeSet) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.findHighlightDrawable, R.attr.findIndexHighlightDrawable, R.attr.highlightBgHorizontalPadding, R.attr.highlightBgVerticalPadding, R.attr.syncHighlightDrawable}, 0, R.style.RoundedBgTextView);
        Intrinsics.checkExpressionValueIsNotNull(obtainStyledAttributes, "context.obtainStyledAttr…undedBgTextView\n        )");
        this.f118975a = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f118976b = obtainStyledAttributes.getDimensionPixelSize(3, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(4);
        if (drawable == null) {
            Intrinsics.throwNpe();
        }
        this.f118977c = drawable;
        Drawable drawable2 = obtainStyledAttributes.getDrawable(0);
        if (drawable2 == null) {
            Intrinsics.throwNpe();
        }
        this.f118978d = drawable2;
        Drawable drawable3 = obtainStyledAttributes.getDrawable(1);
        if (drawable3 == null) {
            Intrinsics.throwNpe();
        }
        this.f118979e = drawable3;
        obtainStyledAttributes.recycle();
    }
}
