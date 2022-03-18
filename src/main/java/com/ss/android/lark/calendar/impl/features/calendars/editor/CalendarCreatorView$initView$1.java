package com.ss.android.lark.calendar.impl.features.calendars.editor;

import android.content.Context;
import com.ss.android.lark.widget.StableLinearLayoutManager;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/editor/CalendarCreatorView$initView$1", "Lcom/ss/android/lark/widget/StableLinearLayoutManager;", "canScrollHorizontally", "", "canScrollVertically", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CalendarCreatorView$initView$1 extends StableLinearLayoutManager {

    /* renamed from: a */
    final /* synthetic */ CalendarCreatorView f75828a;

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
    public boolean canScrollHorizontally() {
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
    public boolean canScrollVertically() {
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CalendarCreatorView$initView$1(CalendarCreatorView dVar, Context context, int i, boolean z) {
        super(context, i, z);
        this.f75828a = dVar;
    }
}
