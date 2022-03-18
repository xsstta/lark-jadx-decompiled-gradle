package com.ss.android.lark.calendar.impl.features.calendars.selector.vh;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendars.selector.C30397a;
import com.ss.android.lark.calendar.impl.features.calendars.sidebar.widget.SwitchView;
import com.ss.android.lark.calendar.impl.features.calendarview.p1467c.C30667a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/selector/vh/ViewSwitchVH;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "rootView", "Landroid/view/View;", "listener", "Lcom/ss/android/lark/calendar/impl/features/calendars/selector/CalendarSelectorAdapter$OnRecyclerViewItemClickListener;", "(Landroid/view/View;Lcom/ss/android/lark/calendar/impl/features/calendars/selector/CalendarSelectorAdapter$OnRecyclerViewItemClickListener;)V", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.selector.vh.e */
public final class ViewSwitchVH extends RecyclerView.ViewHolder {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ViewSwitchVH(View view, final C30397a.AbstractC30399a aVar) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        ((SwitchView) view.findViewById(R.id.calendarSwitcher)).setSelectView(C30667a.m114024f());
        ((SwitchView) view.findViewById(R.id.calendarSwitcher)).setViewSelectListener(new SwitchView.IOnViewSelectListener() {
            /* class com.ss.android.lark.calendar.impl.features.calendars.selector.vh.ViewSwitchVH.C304361 */

            @Override // com.ss.android.lark.calendar.impl.features.calendars.sidebar.widget.SwitchView.IOnViewSelectListener
            /* renamed from: a */
            public void mo109861a(int i) {
                C30397a.AbstractC30399a aVar = aVar;
                if (aVar != null) {
                    aVar.mo109744a(i);
                }
            }
        });
    }
}
