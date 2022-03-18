package com.ss.android.lark.calendar.impl.utils;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.utils.KeyboardUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006\u001a&\u0010\u0007\u001a\u00020\u0001*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f\u001a\u0012\u0010\u000e\u001a\u00020\f*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\f¨\u0006\u0010"}, d2 = {"circleOutline", "", "Landroid/view/View;", "hideKeyboard", "roundOutline", "radius", "", "scrollToPositionTop", "Landroidx/recyclerview/widget/RecyclerView;", "position", "", "smooth", "", "onlyScrollBy", "visibleOrGone", "visible", "calendar-impl_release"}, mo238835k = 2, mv = {1, 1, 16})
public final class an {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/calendar/impl/utils/ViewExtentionsKt$circleOutline$1", "Landroid/view/ViewOutlineProvider;", "getOutline", "", "view", "Landroid/view/View;", "outline", "Landroid/graphics/Outline;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.utils.an$a */
    public static final class C32636a extends ViewOutlineProvider {
        C32636a() {
        }

        public void getOutline(View view, Outline outline) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(outline, "outline");
            outline.setOval(0, 0, view.getWidth(), view.getHeight());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/calendar/impl/utils/ViewExtentionsKt$roundOutline$1", "Landroid/view/ViewOutlineProvider;", "getOutline", "", "view", "Landroid/view/View;", "outline", "Landroid/graphics/Outline;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.utils.an$b */
    public static final class C32637b extends ViewOutlineProvider {

        /* renamed from: a */
        final /* synthetic */ Number f83750a;

        C32637b(Number number) {
            this.f83750a = number;
        }

        public void getOutline(View view, Outline outline) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(outline, "outline");
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f83750a.floatValue());
        }
    }

    /* renamed from: b */
    public static final void m125214b(View view) {
        Intrinsics.checkParameterIsNotNull(view, "$this$hideKeyboard");
        KeyboardUtils.hideKeyboard(view.getContext());
        view.clearFocus();
    }

    /* renamed from: a */
    public static final void m125209a(View view) {
        Intrinsics.checkParameterIsNotNull(view, "$this$circleOutline");
        view.setOutlineProvider(new C32636a());
        view.setClipToOutline(true);
    }

    /* renamed from: a */
    public static final void m125210a(View view, Number number) {
        Intrinsics.checkParameterIsNotNull(view, "$this$roundOutline");
        Intrinsics.checkParameterIsNotNull(number, "radius");
        view.setOutlineProvider(new C32637b(number));
        view.setClipToOutline(true);
    }

    /* renamed from: a */
    public static final boolean m125213a(View view, boolean z) {
        int i;
        Intrinsics.checkParameterIsNotNull(view, "$this$visibleOrGone");
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        return z;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JR\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0016¨\u0006\u000f"}, d2 = {"com/ss/android/lark/calendar/impl/utils/ViewExtentionsKt$scrollToPositionTop$2", "Landroid/view/View$OnLayoutChangeListener;", "onLayoutChange", "", "v", "Landroid/view/View;", "left", "", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.utils.an$c */
    public static final class View$OnLayoutChangeListenerC32638c implements View.OnLayoutChangeListener {

        /* renamed from: a */
        final /* synthetic */ RecyclerView f83751a;

        /* renamed from: b */
        final /* synthetic */ int f83752b;

        /* renamed from: c */
        final /* synthetic */ boolean f83753c;

        View$OnLayoutChangeListenerC32638c(RecyclerView recyclerView, int i, boolean z) {
            this.f83751a = recyclerView;
            this.f83752b = i;
            this.f83753c = z;
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.f83751a.removeOnLayoutChangeListener(this);
            an.m125211a(this.f83751a, this.f83752b, this.f83753c, true);
        }
    }

    /* renamed from: a */
    public static final void m125211a(RecyclerView recyclerView, int i, boolean z, boolean z2) {
        Intrinsics.checkParameterIsNotNull(recyclerView, "$this$scrollToPositionTop");
        if (recyclerView.getChildCount() != 0) {
            int childAdapterPosition = recyclerView.getChildAdapterPosition(recyclerView.getChildAt(0));
            int childAdapterPosition2 = recyclerView.getChildAdapterPosition(recyclerView.getChildAt(recyclerView.getChildCount() - 1));
            if ((childAdapterPosition <= i && childAdapterPosition2 >= i) || z2) {
                RecyclerView.ViewHolder findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i);
                if (findViewHolderForAdapterPosition == null) {
                    return;
                }
                if (z) {
                    View view = findViewHolderForAdapterPosition.itemView;
                    Intrinsics.checkExpressionValueIsNotNull(view, "it.itemView");
                    recyclerView.smoothScrollBy(0, view.getTop());
                    return;
                }
                View view2 = findViewHolderForAdapterPosition.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view2, "it.itemView");
                recyclerView.scrollBy(0, view2.getTop());
            } else if (childAdapterPosition <= i) {
                recyclerView.scrollToPosition(i);
                recyclerView.addOnLayoutChangeListener(new View$OnLayoutChangeListenerC32638c(recyclerView, i, z));
            } else if (z) {
                recyclerView.smoothScrollToPosition(i);
            } else {
                recyclerView.scrollToPosition(i);
            }
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m125212a(RecyclerView recyclerView, int i, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        m125211a(recyclerView, i, z, z2);
    }
}
