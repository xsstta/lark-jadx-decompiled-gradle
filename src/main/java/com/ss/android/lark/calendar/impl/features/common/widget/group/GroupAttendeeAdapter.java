package com.ss.android.lark.calendar.impl.features.common.widget.group;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1356d;
import androidx.recyclerview.widget.C1374g;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.utils.p1203a.AbstractC26248b;
import com.larksuite.framework.utils.p1203a.C26247a;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.common.widget.group.data.GroupMemberUIData;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\rH\u0016J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\rH\u0016J\u0014\u0010\u0017\u001a\u00020\u00112\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0019R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u0005¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/common/widget/group/GroupAttendeeAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "mGroupMemberDependency", "Lcom/ss/android/lark/calendar/impl/features/common/widget/group/GroupAttendeeAdapter$GroupMemberDependency;", "(Lcom/ss/android/lark/calendar/impl/features/common/widget/group/GroupAttendeeAdapter$GroupMemberDependency;)V", "mDiffer", "Landroidx/recyclerview/widget/AsyncListDiffer;", "Lcom/ss/android/lark/calendar/impl/features/common/widget/group/data/GroupMemberUIData;", "getMGroupMemberDependency", "()Lcom/ss/android/lark/calendar/impl/features/common/widget/group/GroupAttendeeAdapter$GroupMemberDependency;", "setMGroupMemberDependency", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "dataList", "", "GroupMemberDependency", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.group.a */
public final class GroupAttendeeAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a */
    private C1356d<GroupMemberUIData> f78882a = new C1356d<>(this, new C1374g.AbstractC1378c<GroupMemberUIData>() {
        /* class com.ss.android.lark.calendar.impl.features.common.widget.group.GroupAttendeeAdapter.C312021 */

        /* renamed from: a */
        public boolean areItemsTheSame(GroupMemberUIData groupMemberUIData, GroupMemberUIData groupMemberUIData2) {
            Intrinsics.checkParameterIsNotNull(groupMemberUIData, "oldItem");
            Intrinsics.checkParameterIsNotNull(groupMemberUIData2, "newItem");
            return C26247a.m94980a((AbstractC26248b) groupMemberUIData, (AbstractC26248b) groupMemberUIData2);
        }

        /* renamed from: b */
        public boolean areContentsTheSame(GroupMemberUIData groupMemberUIData, GroupMemberUIData groupMemberUIData2) {
            Intrinsics.checkParameterIsNotNull(groupMemberUIData, "oldItem");
            Intrinsics.checkParameterIsNotNull(groupMemberUIData2, "newItem");
            return C26247a.m94983b(groupMemberUIData, groupMemberUIData2);
        }
    });

    /* renamed from: b */
    private GroupMemberDependency f78883b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/common/widget/group/GroupAttendeeAdapter$GroupMemberDependency;", "", "onOpenProfilePageClicked", "", "attendeeCalendarId", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.group.a$a */
    public interface GroupMemberDependency {
        /* renamed from: a */
        void mo113140a(String str);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f78882a.mo7374a().size();
    }

    /* renamed from: a */
    public final void mo113137a(List<GroupMemberUIData> list) {
        Intrinsics.checkParameterIsNotNull(list, "dataList");
        this.f78882a.mo7376a(list);
    }

    public GroupAttendeeAdapter(GroupMemberDependency aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "mGroupMemberDependency");
        this.f78883b = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (this.f78882a.mo7374a().get(i).mo113165a() == GroupMemberUIData.GroupDataType.HIDE_TIP) {
            return R.layout.group_member_adapter_limit_bottom;
        }
        return R.layout.item_attendee_group_members;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
        if (viewHolder instanceof GroupAttendeeViewHolder) {
            GroupMemberUIData groupMemberUIData = this.f78882a.mo7374a().get(i);
            Intrinsics.checkExpressionValueIsNotNull(groupMemberUIData, "mDiffer.currentList[position]");
            ((GroupAttendeeViewHolder) viewHolder).mo113164a(groupMemberUIData);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        if (i == R.layout.group_member_adapter_limit_bottom) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.group_member_adapter_limit_bottom, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
            return new GroupHideTipViewHolder(inflate);
        }
        View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_attendee_group_members, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate2, "view");
        return new GroupAttendeeViewHolder(inflate2, this.f78883b);
    }
}
