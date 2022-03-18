package com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.holder;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.adapter.BuildingAdapter;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.model.MeetingRoomBuildingModel;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.EditSelectStateView;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.ao;
import com.ss.android.lark.calendar.p1430a.C30022a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0007J \u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/holder/MeetingRoomBuildingViewHolder;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/holder/BaseViewHolder;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/model/MeetingRoomBuildingModel;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "mOnItemClickListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/holder/MeetingRoomBuildingViewHolder$OnItemClickListener;", "searchFilterFG", "", "setOnItemClickListener", "", "onItemClickListener", "setUpView", "model", "position", "", "adapter", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/adapter/BuildingAdapter;", "OnItemClickListener", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.a.g */
public final class MeetingRoomBuildingViewHolder extends BaseViewHolder<MeetingRoomBuildingModel> {

    /* renamed from: a */
    public OnItemClickListener f80686a;

    /* renamed from: b */
    private final boolean f80687b = C30022a.f74883b.mo112706n();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/holder/MeetingRoomBuildingViewHolder$OnItemClickListener;", "", "onItemClick", "", "clickBuildingModel", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/model/MeetingRoomBuildingModel;", "onMultipleSelectClicked", "onMultipleSelectExpandIconClicked", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.a.g$a */
    public interface OnItemClickListener {
        /* renamed from: a */
        void mo115699a(MeetingRoomBuildingModel hVar);

        /* renamed from: b */
        void mo115700b(MeetingRoomBuildingModel hVar);

        /* renamed from: c */
        void mo115701c(MeetingRoomBuildingModel hVar);
    }

    /* renamed from: a */
    public final void mo115697a(OnItemClickListener aVar) {
        this.f80686a = aVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.a.g$c */
    public static final class View$OnClickListenerC31748c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MeetingRoomBuildingViewHolder f80690a;

        /* renamed from: b */
        final /* synthetic */ MeetingRoomBuildingModel f80691b;

        View$OnClickListenerC31748c(MeetingRoomBuildingViewHolder gVar, MeetingRoomBuildingModel hVar) {
            this.f80690a = gVar;
            this.f80691b = hVar;
        }

        public final void onClick(View view) {
            OnItemClickListener aVar = this.f80690a.f80686a;
            if (aVar != null) {
                aVar.mo115701c(this.f80691b);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MeetingRoomBuildingViewHolder(View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.a.g$b */
    public static final class View$OnClickListenerC31747b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MeetingRoomBuildingViewHolder f80688a;

        /* renamed from: b */
        final /* synthetic */ MeetingRoomBuildingModel f80689b;

        View$OnClickListenerC31747b(MeetingRoomBuildingViewHolder gVar, MeetingRoomBuildingModel hVar) {
            this.f80688a = gVar;
            this.f80689b = hVar;
        }

        public final void onClick(View view) {
            if (C31749h.f80692a[this.f80689b.mo115767b().ordinal()] != 1) {
                OnItemClickListener aVar = this.f80688a.f80686a;
                if (aVar != null) {
                    aVar.mo115699a(this.f80689b);
                    return;
                }
                return;
            }
            OnItemClickListener aVar2 = this.f80688a.f80686a;
            if (aVar2 != null) {
                aVar2.mo115700b(this.f80689b);
            }
        }
    }

    /* renamed from: a */
    public void mo115682a(MeetingRoomBuildingModel hVar, int i, BuildingAdapter cVar) {
        Intrinsics.checkParameterIsNotNull(hVar, "model");
        Intrinsics.checkParameterIsNotNull(cVar, "adapter");
        hVar.mo115768b(i);
        TextView textView = (TextView) mo115681a(R.id.tv_building_name);
        View a = mo115681a(R.id.multipleSelectBt);
        if (!(a instanceof EditSelectStateView)) {
            a = null;
        }
        EditSelectStateView editSelectStateView = (EditSelectStateView) a;
        if (textView != null) {
            textView.setText(hVar.mo115761a());
        }
        View a2 = mo115681a(R.id.building_item_container);
        if (a2 != null) {
            a2.setOnClickListener(new View$OnClickListenerC31747b(this, hVar));
        }
        if (this.f80687b) {
            ImageView imageView = (ImageView) mo115681a(R.id.enter_meeting_room_arrow);
            if (hVar.mo115772e()) {
                if (imageView != null) {
                    Drawable d = C32634ae.m125184d(R.drawable.ud_icon_up_outlined);
                    d.setTint(C32634ae.m125178a(R.color.icon_n3));
                    imageView.setImageDrawable(d);
                }
            } else if (imageView != null) {
                Drawable d2 = C32634ae.m125184d(R.drawable.ud_icon_down_outlined);
                d2.setTint(C32634ae.m125178a(R.color.icon_n3));
                imageView.setImageDrawable(d2);
            }
            if (hVar.mo115767b() == IBuildingContract.ResourceSelectMode.MULTIPLE) {
                if (imageView != null) {
                    imageView.setOnClickListener(new View$OnClickListenerC31748c(this, hVar));
                }
                ao.m125223a((View) imageView, 6, 6);
            } else {
                if (imageView != null) {
                    imageView.setOnClickListener(null);
                }
                ao.m125222a(imageView);
            }
            if (editSelectStateView != null) {
                editSelectStateView.mo115963a(hVar.mo115770c());
            }
            if (hVar.mo115767b() == IBuildingContract.ResourceSelectMode.MULTIPLE) {
                if (editSelectStateView != null) {
                    editSelectStateView.setVisibility(0);
                }
            } else if (editSelectStateView != null) {
                editSelectStateView.setVisibility(8);
            }
        }
    }
}
