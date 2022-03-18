package com.ss.android.lark.calendar.impl.features.events.detail.fragment.meetingroom;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.detail.fragment.meetingroom.DetailResourceFragment;
import com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016J\u0014\u0010\u0015\u001a\u00020\u000e2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/meetingroom/DetailResourceAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/meetingroom/DetailResourceViewHolder;", "listener", "Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/meetingroom/DetailResourceFragment$DetailResourceFragmentAction;", "(Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/meetingroom/DetailResourceFragment$DetailResourceFragmentAction;)V", "getListener", "()Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/meetingroom/DetailResourceFragment$DetailResourceFragmentAction;", "resourceData", "", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IBodyData$IMeetingRoomData;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.fragment.a.b */
public final class DetailResourceAdapter extends RecyclerView.Adapter<DetailResourceViewHolder> {

    /* renamed from: a */
    private List<? extends IBodyData.IMeetingRoomData> f79233a = CollectionsKt.emptyList();

    /* renamed from: b */
    private final DetailResourceFragment.DetailResourceFragmentAction f79234b;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f79233a.size();
    }

    public DetailResourceAdapter(DetailResourceFragment.DetailResourceFragmentAction aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f79234b = aVar;
    }

    /* renamed from: a */
    public final void mo113712a(List<? extends IBodyData.IMeetingRoomData> list) {
        Intrinsics.checkParameterIsNotNull(list, "resourceData");
        this.f79233a = new ArrayList(list);
    }

    /* renamed from: a */
    public DetailResourceViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_calendar_detail_resource_fragment, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "itemView");
        return new DetailResourceViewHolder(inflate);
    }

    /* renamed from: a */
    public void onBindViewHolder(DetailResourceViewHolder dVar, int i) {
        Intrinsics.checkParameterIsNotNull(dVar, "holder");
        dVar.mo113718a((IBodyData.IMeetingRoomData) this.f79233a.get(i), this.f79234b);
    }
}
