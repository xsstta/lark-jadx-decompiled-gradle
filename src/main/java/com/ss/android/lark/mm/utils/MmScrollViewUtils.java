package com.ss.android.lark.mm.utils;

import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.widget.NestedScrollView;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0016\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\n¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/mm/utils/MmScrollViewUtils;", "", "()V", "getDeepChildOffset", "", "mainParent", "Landroid/view/ViewGroup;", "parent", "Landroid/view/ViewParent;", "child", "Landroid/view/View;", "accumulatedOffset", "Landroid/graphics/Point;", "scrollToView", "scrollViewParent", "Landroidx/core/widget/NestedScrollView;", "view", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.utils.l */
public final class MmScrollViewUtils {

    /* renamed from: a */
    public static final MmScrollViewUtils f118646a = new MmScrollViewUtils();

    private MmScrollViewUtils() {
    }

    /* renamed from: a */
    public final void mo165500a(NestedScrollView nestedScrollView, View view) {
        Intrinsics.checkParameterIsNotNull(nestedScrollView, "scrollViewParent");
        Intrinsics.checkParameterIsNotNull(view, "view");
        Point point = new Point();
        ViewParent parent = view.getParent();
        Intrinsics.checkExpressionValueIsNotNull(parent, "view.parent");
        m186574a(nestedScrollView, parent, view, point);
        nestedScrollView.mo4752b(0, point.y);
    }

    /* renamed from: a */
    private final void m186574a(ViewGroup viewGroup, ViewParent viewParent, View view, Point point) {
        if (viewParent != null) {
            ViewGroup viewGroup2 = (ViewGroup) viewParent;
            point.x += view.getLeft();
            point.y += view.getTop();
            if (!Intrinsics.areEqual(viewGroup2, viewGroup)) {
                ViewParent parent = viewGroup2.getParent();
                Intrinsics.checkExpressionValueIsNotNull(parent, "parentGroup.parent");
                m186574a(viewGroup, parent, viewGroup2, point);
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }
}
