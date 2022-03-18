package com.ss.android.lark.calendar.impl.features.calendarview.room.meetingroom;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.room.viewdata.OneInstance;
import com.ss.android.lark.calendar.impl.features.calendarview.room.viewdata.OneRoomItemData;
import com.ss.android.lark.calendar.impl.features.calendarview.room.widget.TimeBarView;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/room/meetingroom/MeetingRoomViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "getView", "()Landroid/view/View;", "bindItem", "", "oneRoomData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/viewdata/OneRoomItemData;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.b.b */
public final class MeetingRoomViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a */
    private final View f78161a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MeetingRoomViewHolder(View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f78161a = view;
    }

    /* renamed from: a */
    public final void mo112241a(OneRoomItemData kVar) {
        Intrinsics.checkParameterIsNotNull(kVar, "oneRoomData");
        TextView textView = (TextView) this.f78161a.findViewById(R.id.roomName);
        Intrinsics.checkExpressionValueIsNotNull(textView, "view.roomName");
        textView.setText(kVar.mo112407c());
        TextView textView2 = (TextView) this.f78161a.findViewById(R.id.capacityTv);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "view.capacityTv");
        textView2.setText(String.valueOf(kVar.mo112409e()));
        TextView textView3 = (TextView) this.f78161a.findViewById(R.id.equipmentTv);
        Intrinsics.checkExpressionValueIsNotNull(textView3, "view.equipmentTv");
        textView3.setText(kVar.mo112412g());
        if (TextUtils.isEmpty(kVar.mo112412g())) {
            View findViewById = this.f78161a.findViewById(R.id.infoDivider);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.infoDivider");
            findViewById.setVisibility(8);
        } else {
            View findViewById2 = this.f78161a.findViewById(R.id.infoDivider);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "view.infoDivider");
            findViewById2.setVisibility(0);
        }
        if (kVar.mo112408d()) {
            TextView textView4 = (TextView) this.f78161a.findViewById(R.id.tvNeedApproval);
            Intrinsics.checkExpressionValueIsNotNull(textView4, "view.tvNeedApproval");
            textView4.setVisibility(0);
        } else {
            TextView textView5 = (TextView) this.f78161a.findViewById(R.id.tvNeedApproval);
            Intrinsics.checkExpressionValueIsNotNull(textView5, "view.tvNeedApproval");
            textView5.setVisibility(8);
        }
        TimeBarView timeBarView = (TimeBarView) this.f78161a.findViewById(R.id.roomBusyView);
        List<OneInstance> j = kVar.mo112416j();
        if (j == null) {
            j = CollectionsKt.emptyList();
        }
        timeBarView.mo112452a(j, kVar.mo112415i());
    }
}
