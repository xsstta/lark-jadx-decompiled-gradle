package com.ss.android.lark.calendar.impl.features.events.detail.fragment.attendee.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1356d;
import androidx.recyclerview.widget.C1374g;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.utils.p1203a.AbstractC26248b;
import com.larksuite.framework.utils.p1203a.C26247a;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.detail.fragment.attendee.data.AttendeeViewData;
import com.ss.android.lark.calendar.impl.features.events.detail.fragment.attendee.data.IAttendeeViewData;
import com.ss.android.lark.calendar.impl.features.events.detail.fragment.attendee.data.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\fH\u0016J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\fH\u0016J\u0014\u0010\u0016\u001a\u00020\u00102\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u0018R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/attendee/adapter/DetailAttendeeAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "listener", "Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/attendee/adapter/IDetailAttendeeVH;", "(Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/attendee/adapter/IDetailAttendeeVH;)V", "getListener", "()Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/attendee/adapter/IDetailAttendeeVH;", "mDiffer", "Landroidx/recyclerview/widget/AsyncListDiffer;", "Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/attendee/data/IAttendeeViewData;", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "attendeeDataList", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.fragment.attendee.a.d */
public final class DetailAttendeeAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a */
    private C1356d<IAttendeeViewData> f79261a = new C1356d<>(this, new C1374g.AbstractC1378c<IAttendeeViewData>() {
        /* class com.ss.android.lark.calendar.impl.features.events.detail.fragment.attendee.adapter.DetailAttendeeAdapter.C313071 */

        /* renamed from: a */
        public boolean areItemsTheSame(IAttendeeViewData cVar, IAttendeeViewData cVar2) {
            Intrinsics.checkParameterIsNotNull(cVar, "oldItem");
            Intrinsics.checkParameterIsNotNull(cVar2, "newItem");
            return C26247a.m94980a((AbstractC26248b) cVar, (AbstractC26248b) cVar2);
        }

        /* renamed from: b */
        public boolean areContentsTheSame(IAttendeeViewData cVar, IAttendeeViewData cVar2) {
            Intrinsics.checkParameterIsNotNull(cVar, "oldItem");
            Intrinsics.checkParameterIsNotNull(cVar2, "newItem");
            return C26247a.m94983b(cVar, cVar2);
        }
    });

    /* renamed from: b */
    private final IDetailAttendeeVH f79262b;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f79261a.mo7374a().size();
    }

    public DetailAttendeeAdapter(IDetailAttendeeVH fVar) {
        Intrinsics.checkParameterIsNotNull(fVar, "listener");
        this.f79262b = fVar;
    }

    /* renamed from: a */
    public final void mo113737a(List<? extends IAttendeeViewData> list) {
        Intrinsics.checkParameterIsNotNull(list, "attendeeDataList");
        this.f79261a.mo7376a(new ArrayList(list));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.f79261a.mo7374a().get(i).mo113786a().getValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
        IAttendeeViewData cVar = this.f79261a.mo7374a().get(i);
        boolean z = cVar instanceof AttendeeViewData;
        if (z && (viewHolder instanceof AttendeeViewHolder)) {
            ((AttendeeViewHolder) viewHolder).mo113733a((AttendeeViewData) cVar);
        } else if (z && (viewHolder instanceof GroupMemberVH)) {
            ((GroupMemberVH) viewHolder).mo113741a((AttendeeViewData) cVar);
        } else if (viewHolder instanceof AttendeeTipTextVH) {
            IAttendeeViewData cVar2 = this.f79261a.mo7374a().get(i);
            Intrinsics.checkExpressionValueIsNotNull(cVar2, "mDiffer.currentList[position]");
            ((AttendeeTipTextVH) viewHolder).mo113730a(cVar2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        if (i == Type.HIDE_FOR_SAFE_TEXT_TIP.getValue() || i == Type.GROUP_EXPAND_TIP.getValue() || i == Type.NO_MORE_INDIVIDUAL_TIP.getValue()) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_event_detail_attendee_tip_text, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
            return new AttendeeTipTextVH(inflate, this.f79262b);
        } else if (i == Type.GROUP_MEMBER.getValue()) {
            View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_attendee_group_members, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate2, "view");
            return new GroupMemberVH(inflate2, this.f79262b);
        } else {
            View inflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_event_edit_attendee, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate3, "view");
            return new AttendeeViewHolder(inflate3, this.f79262b);
        }
    }
}
