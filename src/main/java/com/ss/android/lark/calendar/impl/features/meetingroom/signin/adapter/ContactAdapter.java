package com.ss.android.lark.calendar.impl.features.meetingroom.signin.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventCreator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/adapter/ContactAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/adapter/ViewHolder;", "()V", "contactList", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventCreator;", "getContactList", "()Ljava/util/List;", "setContactList", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.signin.a.a */
public final class ContactAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* renamed from: a */
    private List<CalendarEventCreator> f82197a = CollectionsKt.emptyList();

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f82197a.size();
    }

    /* renamed from: a */
    public final void mo117405a(List<CalendarEventCreator> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.f82197a = list;
    }

    /* renamed from: a */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_calendar_sign_in_contact, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
        return new ViewHolder(inflate);
    }

    /* renamed from: a */
    public void onBindViewHolder(ViewHolder bVar, int i) {
        Intrinsics.checkParameterIsNotNull(bVar, "holder");
        bVar.mo117406a(this.f82197a.get(i));
    }
}
