package com.ss.android.lark.calendar.impl.features.events.edit.fragment.expandresource.adapter;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.expandresource.adapter.EditCommonResourceBinder;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J.\u0010\u0007\u001a\u00020\b2\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/expandresource/adapter/ExpandResourceViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "getView", "()Landroid/view/View;", "bindResource", "", "chosenMeetingRooms", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "Lkotlin/collections/ArrayList;", "meetingRoomData", "resourceExpandDependency", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/expandresource/adapter/EditCommonResourceBinder$EditCommonResourceListener;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.c.a.c */
public final class ExpandResourceViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a */
    private final View f80476a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpandResourceViewHolder(View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f80476a = view;
    }

    /* renamed from: a */
    public final void mo115345a(ArrayList<CalendarEventAttendee> arrayList, CalendarEventAttendee calendarEventAttendee, EditCommonResourceBinder.EditCommonResourceListener aVar) {
        Intrinsics.checkParameterIsNotNull(arrayList, "chosenMeetingRooms");
        Intrinsics.checkParameterIsNotNull(calendarEventAttendee, "meetingRoomData");
        Intrinsics.checkParameterIsNotNull(aVar, "resourceExpandDependency");
        new EditCommonResourceBinder(this.f80476a).mo115336a(arrayList, calendarEventAttendee, aVar);
    }
}
