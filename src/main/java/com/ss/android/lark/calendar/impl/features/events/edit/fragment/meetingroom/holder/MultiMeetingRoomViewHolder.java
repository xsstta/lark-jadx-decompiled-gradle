package com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.holder;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.adapter.BuildingAdapter;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.model.MultiMeetingRoomModel;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.EditSelectStateView;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.SchemaHelper;
import com.ss.android.lark.calendar.impl.utils.ao;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0007J \u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001a\u0010\u0011\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J$\u0010\u0016\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\f\u001a\u00020\u0002H\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/holder/MultiMeetingRoomViewHolder;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/holder/BaseViewHolder;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/model/MultiMeetingRoomModel;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "mOnItemClickListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/holder/MultiMeetingRoomViewHolder$OnItemClickListener;", "setOnItemClickListener", "", "onItemClickListener", "setUpView", "model", "position", "", "adapter", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/adapter/BuildingAdapter;", "updateMeetingContainerMargin", "meetingTextContainer", "Landroid/widget/LinearLayout;", "rightMarginDp", "", "updateMeetingInfo", "meetingRoomInfoIv", "OnItemClickListener", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.a.l */
public final class MultiMeetingRoomViewHolder extends BaseViewHolder<MultiMeetingRoomModel> {

    /* renamed from: a */
    public OnItemClickListener f80708a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/holder/MultiMeetingRoomViewHolder$OnItemClickListener;", "", "onItemClick", "", "roomModel", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/model/MultiMeetingRoomModel;", "onMeetingRoomInfoClicked", "calendarId", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.a.l$a */
    public interface OnItemClickListener {
        /* renamed from: a */
        void mo115717a(MultiMeetingRoomModel kVar);

        /* renamed from: a */
        void mo115718a(String str);
    }

    /* renamed from: a */
    public final void mo115715a(OnItemClickListener aVar) {
        this.f80708a = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiMeetingRoomViewHolder(View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.a.l$c */
    public static final class View$OnClickListenerC31756c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MultiMeetingRoomViewHolder f80712a;

        /* renamed from: b */
        final /* synthetic */ MultiMeetingRoomModel f80713b;

        View$OnClickListenerC31756c(MultiMeetingRoomViewHolder lVar, MultiMeetingRoomModel kVar) {
            this.f80712a = lVar;
            this.f80713b = kVar;
        }

        public final void onClick(View view) {
            OnItemClickListener aVar = this.f80712a.f80708a;
            if (aVar != null) {
                String calendarId = this.f80713b.mo115802a().getCalendarId();
                Intrinsics.checkExpressionValueIsNotNull(calendarId, "model.calendarResource.calendarId");
                aVar.mo115718a(calendarId);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.a.l$b */
    public static final class View$OnClickListenerC31755b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MultiMeetingRoomViewHolder f80709a;

        /* renamed from: b */
        final /* synthetic */ MultiMeetingRoomModel f80710b;

        /* renamed from: c */
        final /* synthetic */ ViewGroup f80711c;

        View$OnClickListenerC31755b(MultiMeetingRoomViewHolder lVar, MultiMeetingRoomModel kVar, ViewGroup viewGroup) {
            this.f80709a = lVar;
            this.f80710b = kVar;
            this.f80711c = viewGroup;
        }

        public final void onClick(View view) {
            if (!this.f80710b.mo115808c() || !SchemaHelper.f83746a.mo120312a(this.f80710b.mo115802a().getResourceSchema())) {
                OnItemClickListener aVar = this.f80709a.f80708a;
                if (aVar != null) {
                    aVar.mo115717a(this.f80710b);
                    return;
                }
                return;
            }
            LKUIToast.show(this.f80711c.getContext(), C32634ae.m125182b(R.string.Calendar_Approval_ExplainNo));
        }
    }

    /* renamed from: a */
    private final void m120287a(LinearLayout linearLayout, float f) {
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
    private final void m120286a(View view, LinearLayout linearLayout, MultiMeetingRoomModel kVar) {
        if (C30022a.f74883b.mo112709q()) {
            if (view != null) {
                view.setVisibility(0);
            }
            if (view != null) {
                view.setOnClickListener(new View$OnClickListenerC31756c(this, kVar));
            }
            ao.m125223a(view, 10, 10);
            m120287a(linearLayout, 42.0f);
            return;
        }
        if (view != null) {
            view.setVisibility(8);
        }
        ao.m125222a(view);
        m120287a(linearLayout, 12.0f);
    }

    /* renamed from: a */
    public void mo115682a(MultiMeetingRoomModel kVar, int i, BuildingAdapter cVar) {
        TextView textView;
        CharSequence charSequence;
        Intrinsics.checkParameterIsNotNull(kVar, "model");
        Intrinsics.checkParameterIsNotNull(cVar, "adapter");
        kVar.mo115803a(i);
        ViewGroup viewGroup = (ViewGroup) mo115681a(R.id.multi_meeting_room_item_container);
        ImageView imageView = (ImageView) mo115681a(R.id.iv_meeting_icon);
        TextView textView2 = (TextView) mo115681a(R.id.tv_meeting_room_name);
        ImageView imageView2 = (ImageView) mo115681a(R.id.iv_meeting_room_capacity);
        TextView textView3 = (TextView) mo115681a(R.id.tv_meeting_room_capacity);
        TextView textView4 = (TextView) mo115681a(R.id.tv_meeting_room_desc);
        View a = mo115681a(R.id.divider_capacity_desc);
        View a2 = mo115681a(R.id.meetingRoomInfoIcon);
        LinearLayout linearLayout = (LinearLayout) mo115681a(R.id.text_group);
        View a3 = mo115681a(R.id.multipleSelectBt);
        if (!(a3 instanceof EditSelectStateView)) {
            a3 = null;
        }
        EditSelectStateView editSelectStateView = (EditSelectStateView) a3;
        if (kVar.mo115806b()) {
            if (imageView != null) {
                Drawable d = C32634ae.m125184d(R.drawable.ud_icon_room_outlined);
                d.setTint(C32634ae.m125178a(R.color.icon_n3));
                imageView.setBackground(d);
            }
            if (textView2 != null) {
                textView2.setTextColor(C32634ae.m125178a(R.color.text_title));
            }
            if (imageView2 != null) {
                Drawable d2 = C32634ae.m125184d(R.drawable.ud_icon_group_outlined);
                d2.setTint(C32634ae.m125178a(R.color.icon_n3));
                imageView2.setBackground(d2);
            }
            if (textView3 != null) {
                textView3.setTextColor(C32634ae.m125178a(R.color.text_caption));
            }
            if (textView4 != null) {
                textView4.setTextColor(C32634ae.m125178a(R.color.text_caption));
            }
            if (a != null) {
                a.setBackgroundColor(C32634ae.m125178a(R.color.text_caption));
            }
        } else {
            if (imageView != null) {
                Drawable d3 = C32634ae.m125184d(R.drawable.ud_icon_room_unavailable_outlined);
                d3.setTint(C32634ae.m125178a(R.color.icon_disable));
                imageView.setBackground(d3);
            }
            if (textView2 != null) {
                textView2.setTextColor(C32634ae.m125178a(R.color.text_disable));
            }
            if (imageView2 != null) {
                Drawable d4 = C32634ae.m125184d(R.drawable.ud_icon_group_outlined);
                d4.setTint(C32634ae.m125178a(R.color.icon_disable));
                imageView2.setBackground(d4);
            }
            if (textView3 != null) {
                textView3.setTextColor(C32634ae.m125178a(R.color.text_disable));
            }
            if (textView4 != null) {
                textView4.setTextColor(C32634ae.m125178a(R.color.text_disable));
            }
            if (a != null) {
                a.setBackgroundColor(C32634ae.m125178a(R.color.text_disable));
            }
        }
        if (editSelectStateView != null) {
            editSelectStateView.setEnabled(kVar.mo115806b());
        }
        if (viewGroup != null) {
            textView = (TextView) viewGroup.findViewById(R.id.tv_need_approval);
        } else {
            textView = null;
        }
        if (SchemaHelper.f83746a.mo120312a(kVar.mo115802a().getResourceSchema())) {
            if (textView != null) {
                textView.setVisibility(0);
            }
            if (kVar.mo115808c()) {
                if (imageView != null) {
                    Drawable d5 = C32634ae.m125184d(R.drawable.ud_icon_room_unavailable_outlined);
                    d5.setTint(C32634ae.m125178a(R.color.icon_n3));
                    imageView.setBackground(d5);
                }
                if (textView2 != null) {
                    textView2.setTextColor(C32634ae.m125178a(R.color.text_disable));
                }
                if (imageView2 != null) {
                    Drawable d6 = C32634ae.m125184d(R.drawable.ud_icon_group_outlined);
                    d6.setTint(C32634ae.m125178a(R.color.ud_N400));
                    imageView2.setBackground(d6);
                }
                if (textView3 != null) {
                    textView3.setTextColor(C32634ae.m125178a(R.color.text_disable));
                }
                if (textView4 != null) {
                    textView4.setTextColor(C32634ae.m125178a(R.color.text_disable));
                }
                if (a != null) {
                    a.setBackgroundColor(C32634ae.m125178a(R.color.text_disable));
                }
                if (editSelectStateView != null) {
                    editSelectStateView.setClickable(false);
                }
            }
        } else if (textView != null) {
            textView.setVisibility(8);
        }
        if (textView2 != null) {
            textView2.setText(kVar.mo115809d());
        }
        if (textView3 != null) {
            textView3.setText(kVar.mo115811f());
        }
        if (textView4 != null) {
            textView4.setText(kVar.mo115810e());
        }
        if (viewGroup != null) {
            viewGroup.setOnClickListener(new View$OnClickListenerC31755b(this, kVar, viewGroup));
        }
        m120286a(a2, linearLayout, kVar);
        if (editSelectStateView != null) {
            editSelectStateView.mo115963a(kVar.mo115812g().mo115823b());
        }
        if (editSelectStateView != null) {
            editSelectStateView.setVisibility(0);
        }
        if (textView4 != null) {
            charSequence = textView4.getText();
        } else {
            charSequence = null;
        }
        if (TextUtils.isEmpty(charSequence)) {
            if (a != null) {
                a.setVisibility(8);
            }
        } else if (a != null) {
            a.setVisibility(0);
        }
    }
}
