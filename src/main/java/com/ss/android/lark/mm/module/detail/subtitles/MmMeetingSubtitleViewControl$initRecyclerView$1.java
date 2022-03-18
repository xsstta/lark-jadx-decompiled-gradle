package com.ss.android.lark.mm.module.detail.subtitles;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0003H\u0016J0\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/mm/module/detail/subtitles/MmMeetingSubtitleViewControl$initRecyclerView$1", "Landroidx/recyclerview/widget/LinearLayoutManager;", "requestChildRectangleOnScreen", "", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "child", "Landroid/view/View;", "rect", "Landroid/graphics/Rect;", "immediate", "focusedChildVisible", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MmMeetingSubtitleViewControl$initRecyclerView$1 extends LinearLayoutManager {

    /* renamed from: a */
    final /* synthetic */ MmMeetingSubtitleViewControl f116268a;

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z) {
        Intrinsics.checkParameterIsNotNull(recyclerView, "parent");
        Intrinsics.checkParameterIsNotNull(view, "child");
        Intrinsics.checkParameterIsNotNull(rect, "rect");
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        Intrinsics.checkParameterIsNotNull(recyclerView, "parent");
        Intrinsics.checkParameterIsNotNull(view, "child");
        Intrinsics.checkParameterIsNotNull(rect, "rect");
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MmMeetingSubtitleViewControl$initRecyclerView$1(MmMeetingSubtitleViewControl eVar, Context context) {
        super(context);
        this.f116268a = eVar;
    }
}
