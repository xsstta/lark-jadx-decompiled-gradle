package com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.holder;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.lark.pb.calendar.v1.SchemaExtraData;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.edit.data.EventMeetingRoomData;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.model.MeetingRoomModel;
import com.ss.android.lark.calendar.impl.features.events.edit.helper.MeetingRoomApprovalHelper;
import com.ss.android.lark.calendar.impl.features.meetingroom.helper.NeedApprovalType;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.SchemaExtraData;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.ao;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0007J \u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001a\u0010\u0013\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J$\u0010\u0018\u001a\u00020\u000b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u000e\u001a\u00020\u0002H\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/holder/MeetingRoomViewHolder;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/holder/BaseViewHolder;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/model/MeetingRoomModel;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "mOnItemClickListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/holder/MeetingRoomViewHolder$OnItemClickListener;", "searchFilterFG", "", "setOnItemClickListener", "", "onMeetingRoomItemClickedListener", "setUpView", "model", "position", "", "adapter", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/adapter/BuildingAdapter;", "updateMeetingContainerMargin", "meetingTextContainer", "Landroid/widget/LinearLayout;", "rightMarginDp", "", "updateMeetingInfo", "meetingRoomInfoIv", "OnItemClickListener", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.a.i */
public final class MeetingRoomViewHolder extends BaseViewHolder<MeetingRoomModel> {

    /* renamed from: a */
    public OnItemClickListener f80693a;

    /* renamed from: b */
    private final boolean f80694b = C30022a.f74883b.mo112706n();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/holder/MeetingRoomViewHolder$OnItemClickListener;", "", "onClickMultipleResource", "", "model", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/model/MeetingRoomModel;", "onItemClick", "meetingRoomData", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/EventMeetingRoomData;", "onMeetingRoomInfoClicked", "calendarId", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.a.i$a */
    public interface OnItemClickListener {
        /* renamed from: a */
        void mo115706a(EventMeetingRoomData eventMeetingRoomData);

        /* renamed from: a */
        void mo115707a(MeetingRoomModel iVar);

        /* renamed from: a */
        void mo115708a(String str);
    }

    /* renamed from: a */
    public final void mo115704a(OnItemClickListener aVar) {
        this.f80693a = aVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.a.i$c */
    public static final class View$OnClickListenerC31751c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MeetingRoomViewHolder f80700a;

        /* renamed from: b */
        final /* synthetic */ MeetingRoomModel f80701b;

        View$OnClickListenerC31751c(MeetingRoomViewHolder iVar, MeetingRoomModel iVar2) {
            this.f80700a = iVar;
            this.f80701b = iVar2;
        }

        public final void onClick(View view) {
            OnItemClickListener aVar = this.f80700a.f80693a;
            if (aVar != null) {
                aVar.mo115708a(this.f80701b.mo115790f());
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MeetingRoomViewHolder(View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.a.i$b */
    public static final class View$OnClickListenerC31750b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MeetingRoomViewHolder f80695a;

        /* renamed from: b */
        final /* synthetic */ MeetingRoomModel f80696b;

        /* renamed from: c */
        final /* synthetic */ Pair f80697c;

        /* renamed from: d */
        final /* synthetic */ ViewGroup f80698d;

        /* renamed from: e */
        final /* synthetic */ SchemaExtraData f80699e;

        View$OnClickListenerC31750b(MeetingRoomViewHolder iVar, MeetingRoomModel iVar2, Pair pair, ViewGroup viewGroup, SchemaExtraData schemaExtraData) {
            this.f80695a = iVar;
            this.f80696b = iVar2;
            this.f80697c = pair;
            this.f80698d = viewGroup;
            this.f80699e = schemaExtraData;
        }

        public final void onClick(View view) {
            SchemaExtraData.ApprovalTrigger approvalTrigger;
            if (this.f80696b.mo115791g() && ((Boolean) this.f80697c.getFirst()).booleanValue()) {
                int i = C31752j.f80702a[((NeedApprovalType) this.f80697c.getSecond()).ordinal()];
                if (i == 1) {
                    Context context = this.f80698d.getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context, "container.context");
                    String b = C32634ae.m125182b(R.string.Calendar_Approval_ExplainNo);
                    Intrinsics.checkExpressionValueIsNotNull(b, "ResUtil.getString(R.stri…endar_Approval_ExplainNo)");
                    UDToast.show(context, b);
                } else if (i == 2) {
                    MeetingRoomApprovalHelper eVar = MeetingRoomApprovalHelper.f79933a;
                    com.ss.android.lark.calendar.impl.rustadapter.doentity.SchemaExtraData schemaExtraData = this.f80699e;
                    if (schemaExtraData != null) {
                        approvalTrigger = MeetingRoomApprovalHelper.f79933a.mo114616a(schemaExtraData);
                    } else {
                        approvalTrigger = null;
                    }
                    String a = eVar.mo114617a(approvalTrigger);
                    Context context2 = this.f80698d.getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context2, "container.context");
                    String a2 = C30022a.f74882a.utilsDependency().mo108195a(R.string.Calendar_Rooms_CantReserveOverTime, "num", a);
                    Intrinsics.checkExpressionValueIsNotNull(a2, "CalendarDependencyHolder…         triggerDuration)");
                    UDToast.show(context2, a2);
                }
            } else if (this.f80696b.mo115793i() == IBuildingContract.ResourceSelectMode.MULTIPLE) {
                OnItemClickListener aVar = this.f80695a.f80693a;
                if (aVar != null) {
                    aVar.mo115707a(this.f80696b);
                }
            } else {
                OnItemClickListener aVar2 = this.f80695a.f80693a;
                if (aVar2 != null) {
                    aVar2.mo115706a(this.f80696b.mo115795k());
                }
            }
        }
    }

    /* renamed from: a */
    private final void m120274a(LinearLayout linearLayout, float f) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        if (linearLayout != null) {
            layoutParams = linearLayout.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = layoutParams;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
        if (marginLayoutParams2 != null) {
            marginLayoutParams2.rightMargin = UIHelper.dp2px(f);
        }
    }

    /* renamed from: a */
    private final void m120273a(View view, LinearLayout linearLayout, MeetingRoomModel iVar) {
        if (C30022a.f74883b.mo112709q()) {
            if (view != null) {
                view.setVisibility(0);
            }
            if (view != null) {
                view.setOnClickListener(new View$OnClickListenerC31751c(this, iVar));
            }
            ao.m125223a(view, 10, 10);
            m120274a(linearLayout, 42.0f);
            return;
        }
        if (view != null) {
            view.setVisibility(8);
        }
        ao.m125222a(view);
        m120274a(linearLayout, 12.0f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:140:0x02e5  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x02eb  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x02f2  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x02f7  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x02fe  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0304  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01df  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01fd  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x020e  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0251  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo115682a(com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.model.MeetingRoomModel r23, int r24, com.ss.android.lark.calendar.impl.features.events.edit.fragment.adapter.BuildingAdapter r25) {
        /*
        // Method dump skipped, instructions count: 778
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.holder.MeetingRoomViewHolder.mo115682a(com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.b.i, int, com.ss.android.lark.calendar.impl.features.events.edit.fragment.a.c):void");
    }
}
