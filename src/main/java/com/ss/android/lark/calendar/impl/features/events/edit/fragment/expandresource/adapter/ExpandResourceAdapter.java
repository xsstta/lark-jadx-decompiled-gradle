package com.ss.android.lark.calendar.impl.features.events.edit.fragment.expandresource.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.expandresource.adapter.EditCommonResourceBinder;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000fH\u0016J\u001e\u0010\u0018\u001a\u00020\u00112\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/expandresource/adapter/ExpandResourceAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/expandresource/adapter/ExpandResourceViewHolder;", "resourceList", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "Lkotlin/collections/ArrayList;", "resourceExpandDependency", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/expandresource/adapter/EditCommonResourceBinder$EditCommonResourceListener;", "(Ljava/util/ArrayList;Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/expandresource/adapter/EditCommonResourceBinder$EditCommonResourceListener;)V", "getResourceExpandDependency", "()Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/expandresource/adapter/EditCommonResourceBinder$EditCommonResourceListener;", "setResourceExpandDependency", "(Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/expandresource/adapter/EditCommonResourceBinder$EditCommonResourceListener;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.c.a.b */
public final class ExpandResourceAdapter extends RecyclerView.Adapter<ExpandResourceViewHolder> {

    /* renamed from: a */
    private ArrayList<CalendarEventAttendee> f80474a;

    /* renamed from: b */
    private EditCommonResourceBinder.EditCommonResourceListener f80475b;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f80474a.size();
    }

    /* renamed from: a */
    public final void mo115344a(ArrayList<CalendarEventAttendee> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "resourceList");
        this.f80474a = new ArrayList<>(arrayList);
    }

    public ExpandResourceAdapter(ArrayList<CalendarEventAttendee> arrayList, EditCommonResourceBinder.EditCommonResourceListener aVar) {
        Intrinsics.checkParameterIsNotNull(arrayList, "resourceList");
        Intrinsics.checkParameterIsNotNull(aVar, "resourceExpandDependency");
        this.f80474a = arrayList;
        this.f80475b = aVar;
    }

    /* renamed from: a */
    public ExpandResourceViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_event_edit_meeting_room, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "itemView");
        return new ExpandResourceViewHolder(inflate);
    }

    /* renamed from: a */
    public void onBindViewHolder(ExpandResourceViewHolder cVar, int i) {
        Intrinsics.checkParameterIsNotNull(cVar, "holder");
        ArrayList<CalendarEventAttendee> arrayList = this.f80474a;
        CalendarEventAttendee calendarEventAttendee = arrayList.get(i);
        Intrinsics.checkExpressionValueIsNotNull(calendarEventAttendee, "resourceList[position]");
        cVar.mo115345a(arrayList, calendarEventAttendee, this.f80475b);
    }
}
