package com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.holder;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.edit.data.EventMeetingRoomData;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.adapter.BuildingAdapter;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.model.ChosenMeetingRoomModel;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0007J \u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/holder/ChosenMeetingRoomViewHolder;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/holder/BaseViewHolder;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/model/ChosenMeetingRoomModel;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "mDeleteClickListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/holder/ChosenMeetingRoomViewHolder$OnDeleteBtnClickListener;", "setDeleteClickListener", "", "deleteClickListener", "setUpView", "model", "position", "", "adapter", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/adapter/BuildingAdapter;", "OnDeleteBtnClickListener", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.a.b */
public final class ChosenMeetingRoomViewHolder extends BaseViewHolder<ChosenMeetingRoomModel> {

    /* renamed from: a */
    public OnDeleteBtnClickListener f80679a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/holder/ChosenMeetingRoomViewHolder$OnDeleteBtnClickListener;", "", "onDeleted", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/EventMeetingRoomData;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.a.b$a */
    public interface OnDeleteBtnClickListener {
        /* renamed from: a */
        void mo115685a(EventMeetingRoomData eventMeetingRoomData);
    }

    /* renamed from: a */
    public final void mo115683a(OnDeleteBtnClickListener aVar) {
        this.f80679a = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChosenMeetingRoomViewHolder(View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.a.b$b */
    public static final class View$OnClickListenerC31744b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ChosenMeetingRoomViewHolder f80680a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f80681b;

        View$OnClickListenerC31744b(ChosenMeetingRoomViewHolder bVar, ViewGroup viewGroup) {
            this.f80680a = bVar;
            this.f80681b = viewGroup;
        }

        public final void onClick(View view) {
            OnDeleteBtnClickListener aVar = this.f80680a.f80679a;
            if (aVar != null) {
                Object tag = this.f80681b.getTag();
                if (tag != null) {
                    aVar.mo115685a((EventMeetingRoomData) tag);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.calendar.impl.features.events.edit.data.EventMeetingRoomData");
            }
        }
    }

    /* renamed from: a */
    public void mo115682a(ChosenMeetingRoomModel aVar, int i, BuildingAdapter cVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        Intrinsics.checkParameterIsNotNull(cVar, "adapter");
        TextView textView = (TextView) mo115681a(R.id.tv_event_boardroom_name);
        if (textView != null) {
            textView.setText(aVar.mo115746a());
        }
        ViewGroup viewGroup = (ViewGroup) mo115681a(R.id.ll_delete_container);
        int i2 = 8;
        if (aVar.mo115748b() || aVar.mo115751d()) {
            if (viewGroup != null) {
                viewGroup.setTag(aVar.mo115752e());
            }
            if (viewGroup != null) {
                viewGroup.setOnClickListener(new View$OnClickListenerC31744b(this, viewGroup));
            }
        } else if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        ImageView imageView = (ImageView) mo115681a(R.id.iv_meeting_icon);
        if (imageView != null) {
            Context context = imageView.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            Context context2 = imageView.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "context");
            imageView.setBackground(UDIconUtils.getIconDrawable(context, (int) R.drawable.ud_icon_room_outlined, UDColorUtils.getColor(context2, R.color.icon_n3)));
            imageView.setVisibility(0);
        }
        TextView textView2 = (TextView) mo115681a(R.id.tv_disabled_icon);
        if (textView2 != null) {
            if (aVar.mo115750c()) {
                i2 = 0;
            }
            textView2.setVisibility(i2);
        }
    }
}
