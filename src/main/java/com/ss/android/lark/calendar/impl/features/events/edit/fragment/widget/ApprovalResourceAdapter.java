package com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lark.pb.calendar.v1.SchemaExtraData;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.edit.helper.MeetingRoomApprovalHelper;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.p1430a.C30022a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0016R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/ApprovalResourceAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "resourceDataList", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "(Ljava/util/List;)V", "getResourceDataList", "()Ljava/util/List;", "setResourceDataList", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.a */
public final class ApprovalResourceAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a */
    private List<? extends CalendarEventAttendee> f81009a;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f81009a.size();
    }

    public ApprovalResourceAdapter(List<? extends CalendarEventAttendee> list) {
        Intrinsics.checkParameterIsNotNull(list, "resourceDataList");
        this.f81009a = list;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/ApprovalResourceAdapter$onCreateViewHolder$1", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.a$a */
    public static final class C31815a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f81010a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31815a(ViewGroup viewGroup, View view) {
            super(view);
            this.f81010a = viewGroup;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        return new C31815a(viewGroup, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.calendar_approval_reosurce_layout, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        TextView textView;
        Long l;
        SchemaExtraData.ApprovalTrigger a;
        Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
        CalendarEventAttendee calendarEventAttendee = (CalendarEventAttendee) this.f81009a.get(i);
        TextView textView2 = (TextView) viewHolder.itemView.findViewById(R.id.resourceNameTv);
        if (textView2 != null && (textView = (TextView) viewHolder.itemView.findViewById(R.id.resourceTipTv)) != null) {
            textView2.setText(calendarEventAttendee.getLocalizedDisplayName());
            com.ss.android.lark.calendar.impl.rustadapter.doentity.SchemaExtraData schemaExtraData = calendarEventAttendee.getSchemaExtraData();
            if (schemaExtraData == null || (a = MeetingRoomApprovalHelper.f79933a.mo114616a(schemaExtraData)) == null) {
                l = null;
            } else {
                l = a.duration_trigger;
            }
            if (l != null) {
                textView.setVisibility(0);
                textView.setText(C30022a.f74882a.utilsDependency().mo108195a(R.string.Calendar_Rooms_OverReserveTimeApprove, "num", String.valueOf((int) (l.longValue() / ((long) 3600)))));
                return;
            }
            textView.setVisibility(8);
        }
    }
}
