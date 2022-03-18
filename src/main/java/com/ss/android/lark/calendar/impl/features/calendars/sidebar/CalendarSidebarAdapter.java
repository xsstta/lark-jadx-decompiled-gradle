package com.ss.android.lark.calendar.impl.features.calendars.sidebar;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.calendar.impl.features.calendars.selector.C30397a;
import com.ss.android.lark.calendar.impl.features.calendars.selector.vh.DataListItem;
import com.ss.android.lark.calendar.impl.features.calendars.sidebar.vh.AddCalendarViewHolder;
import com.ss.android.lark.calendar.impl.features.calendars.sidebar.vh.CalendarTitleViewHolder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\bH\u0016¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/sidebar/CalendarSidebarAdapter;", "Lcom/ss/android/lark/calendar/impl/features/calendars/selector/CalendarSelectorAdapter;", "()V", "onBindViewHolder", "", "holder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.sidebar.b */
public final class CalendarSidebarAdapter extends C30397a {
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter, com.ss.android.lark.calendar.impl.features.calendars.selector.C30397a
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
        if (viewHolder instanceof CalendarTitleViewHolder) {
            Object obj = this.f76114b.get(i);
            Intrinsics.checkExpressionValueIsNotNull(obj, "mDataList[position]");
            ((CalendarTitleViewHolder) viewHolder).mo110237a((DataListItem) obj);
        } else if (viewHolder instanceof AddCalendarViewHolder) {
            Object obj2 = this.f76114b.get(i);
            Intrinsics.checkExpressionValueIsNotNull(obj2, "mDataList[position]");
            ((AddCalendarViewHolder) viewHolder).mo110234a((DataListItem) obj2, this.f76113a);
        } else {
            super.onBindViewHolder(viewHolder, i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter, com.ss.android.lark.calendar.impl.features.calendars.selector.C30397a
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        if (i == CalendarTitleViewHolder.f76434c.mo110238a()) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(CalendarTitleViewHolder.f76434c.mo110239b(), viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(pare…layoutRes, parent, false)");
            return new CalendarTitleViewHolder(inflate);
        } else if (i == DataListItem.TYPE.SUBSCRIBE_CALENDAR.getIntValue() || i == DataListItem.TYPE.ADD_CALENDAR.getIntValue()) {
            View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(AddCalendarViewHolder.f76427b.mo110236a(), viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate2, "LayoutInflater.from(pare…layoutRes, parent, false)");
            return new AddCalendarViewHolder(inflate2);
        } else {
            RecyclerView.ViewHolder onCreateViewHolder = super.onCreateViewHolder(viewGroup, i);
            Intrinsics.checkExpressionValueIsNotNull(onCreateViewHolder, "super.onCreateViewHolder(parent, viewType)");
            return onCreateViewHolder;
        }
    }
}
