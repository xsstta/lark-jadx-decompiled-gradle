package com.ss.android.lark.mm.widget.texthighlightbg;

import android.os.Build;
import android.text.Layout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0012\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0004\u001a\u0012\u0010\u0007\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0004\u001a\u0012\u0010\b\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0004\u001a\u0012\u0010\t\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"DEFAULT_LINESPACING_EXTRA", "", "DEFAULT_LINESPACING_MULTIPLIER", "getLineBottomWithoutPadding", "", "Landroid/text/Layout;", "line", "getLineBottomWithoutSpacing", "getLineHeight", "getLineTopWithoutPadding", "mm_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.widget.texthighlightbg.a */
public final class C47174a {
    /* renamed from: b */
    public static final int m186885b(Layout layout, int i) {
        Intrinsics.checkParameterIsNotNull(layout, "$this$getLineHeight");
        return layout.getLineTop(i + 1) - layout.getLineTop(i);
    }

    /* renamed from: c */
    public static final int m186886c(Layout layout, int i) {
        Intrinsics.checkParameterIsNotNull(layout, "$this$getLineTopWithoutPadding");
        int lineTop = layout.getLineTop(i);
        if (i == 0) {
            return lineTop - layout.getTopPadding();
        }
        return lineTop;
    }

    /* renamed from: d */
    public static final int m186887d(Layout layout, int i) {
        Intrinsics.checkParameterIsNotNull(layout, "$this$getLineBottomWithoutPadding");
        int a = m186884a(layout, i);
        if (i == layout.getLineCount() - 1) {
            return a - layout.getBottomPadding();
        }
        return a;
    }

    /* renamed from: a */
    public static final int m186884a(Layout layout, int i) {
        boolean z;
        boolean z2;
        Intrinsics.checkParameterIsNotNull(layout, "$this$getLineBottomWithoutSpacing");
        int lineBottom = layout.getLineBottom(i);
        boolean z3 = false;
        if (Build.VERSION.SDK_INT >= 19) {
            z = true;
        } else {
            z = false;
        }
        if (i == layout.getLineCount() - 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        float spacingAdd = layout.getSpacingAdd();
        float spacingMultiplier = layout.getSpacingMultiplier();
        if (!(spacingAdd == BitmapDescriptorFactory.HUE_RED && spacingMultiplier == 1.0f)) {
            z3 = true;
        }
        if (!z3) {
            return lineBottom;
        }
        if (z2 && z) {
            return lineBottom;
        }
        if (Float.compare(spacingMultiplier, 1.0f) != 0) {
            float b = (float) m186885b(layout, i);
            spacingAdd = b - ((b - spacingAdd) / spacingMultiplier);
        }
        return (int) (((float) lineBottom) - spacingAdd);
    }
}
