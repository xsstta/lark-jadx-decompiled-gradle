package com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.holder;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.EditSelectStateView;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model.MeetingRoomModel;
import com.ss.android.lark.calendar.impl.p1436a.C30068b;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.an;
import com.ss.android.lark.calendar.impl.utils.ao;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00192\u00020\u0001:\u0002\u0019\u001aB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\b\u0010\u000f\u001a\u00020\fH\u0002J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\fH\u0002J$\u0010\u0014\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/MeetingRoomViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/ss/android/lark/calendar/impl/databinding/ItemEventMeetingRoomBinding;", "(Lcom/ss/android/lark/calendar/impl/databinding/ItemEventMeetingRoomBinding;)V", "actionListener", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/MeetingRoomViewHolder$IActionListener;", "getActionListener", "()Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/MeetingRoomViewHolder$IActionListener;", "setActionListener", "(Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/MeetingRoomViewHolder$IActionListener;)V", "bindData", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/model/MeetingRoomModel;", "refreshInvalidItem", "refreshSplitLine", "isShowStartPadding", "", "refreshValidItem", "updateMeetingInfo", "meetingRoomInfoIv", "Landroid/view/View;", "meetingTextContainer", "Landroid/widget/LinearLayout;", "Companion", "IActionListener", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.a.f */
public final class MeetingRoomViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a */
    public static final Companion f81795a = new Companion(null);

    /* renamed from: b */
    private IActionListener f81796b;

    /* renamed from: c */
    private final C30068b f81797c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/MeetingRoomViewHolder$IActionListener;", "", "onClickInfoIcon", "", "resourceData", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/model/MeetingRoomModel;", "onSelectMeetingRoom", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.a.f$b */
    public interface IActionListener {
        /* renamed from: a */
        void mo116705a(MeetingRoomModel meetingRoomModel);

        /* renamed from: b */
        void mo116706b(MeetingRoomModel meetingRoomModel);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/MeetingRoomViewHolder$Companion;", "", "()V", "MEETING_ROOM_INFO_RIGHT_MARGIN", "", "ROOM_START_PADDING", "create", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/MeetingRoomViewHolder;", "parent", "Landroid/view/ViewGroup;", "meetingRoomAction", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/MeetingRoomViewHolder$IActionListener;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.a.f$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final MeetingRoomViewHolder mo116735a(ViewGroup viewGroup, IActionListener bVar) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            C30068b a = C30068b.m111267a(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(a, "ItemEventMeetingRoomBind…           parent, false)");
            MeetingRoomViewHolder fVar = new MeetingRoomViewHolder(a);
            fVar.mo116733a(bVar);
            return fVar;
        }
    }

    /* renamed from: a */
    public final IActionListener mo116732a() {
        return this.f81796b;
    }

    /* renamed from: b */
    private final void m121735b() {
        ImageView imageView = this.f81797c.f74933d;
        Intrinsics.checkExpressionValueIsNotNull(imageView, "binding.ivMeetingIcon");
        Drawable d = C32634ae.m125184d(R.drawable.ud_icon_room_outlined);
        d.setTint(C32634ae.m125178a(R.color.icon_n3));
        imageView.setBackground(d);
        this.f81797c.f74943n.setTextColor(C32634ae.m125178a(R.color.text_title));
        ImageView imageView2 = this.f81797c.f74934e;
        Intrinsics.checkExpressionValueIsNotNull(imageView2, "binding.ivMeetingRoomCapacity");
        Drawable d2 = C32634ae.m125184d(R.drawable.ud_icon_group_outlined);
        d2.setTint(C32634ae.m125178a(R.color.icon_n3));
        imageView2.setBackground(d2);
        this.f81797c.f74941l.setTextColor(C32634ae.m125178a(R.color.text_caption));
        this.f81797c.f74942m.setTextColor(C32634ae.m125178a(R.color.text_caption));
        this.f81797c.f74931b.setBackgroundColor(C32634ae.m125178a(R.color.text_caption));
    }

    /* renamed from: c */
    private final void m121736c() {
        ImageView imageView = this.f81797c.f74933d;
        Intrinsics.checkExpressionValueIsNotNull(imageView, "binding.ivMeetingIcon");
        Drawable d = C32634ae.m125184d(R.drawable.ud_icon_room_unavailable_outlined);
        d.setTint(C32634ae.m125178a(R.color.icon_disable));
        imageView.setBackground(d);
        this.f81797c.f74943n.setTextColor(C32634ae.m125178a(R.color.text_disable));
        ImageView imageView2 = this.f81797c.f74934e;
        Intrinsics.checkExpressionValueIsNotNull(imageView2, "binding.ivMeetingRoomCapacity");
        Drawable d2 = C32634ae.m125184d(R.drawable.ud_icon_group_outlined);
        d2.setTint(C32634ae.m125178a(R.color.icon_disable));
        imageView2.setBackground(d2);
        this.f81797c.f74941l.setTextColor(C32634ae.m125178a(R.color.text_disable));
        this.f81797c.f74942m.setTextColor(C32634ae.m125178a(R.color.text_disable));
        this.f81797c.f74931b.setBackgroundColor(C32634ae.m125178a(R.color.text_disable));
    }

    /* renamed from: a */
    public final void mo116733a(IActionListener bVar) {
        this.f81796b = bVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.a.f$c */
    public static final class View$OnClickListenerC31996c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MeetingRoomViewHolder f81798a;

        /* renamed from: b */
        final /* synthetic */ MeetingRoomModel f81799b;

        View$OnClickListenerC31996c(MeetingRoomViewHolder fVar, MeetingRoomModel meetingRoomModel) {
            this.f81798a = fVar;
            this.f81799b = meetingRoomModel;
        }

        public final void onClick(View view) {
            IActionListener a = this.f81798a.mo116732a();
            if (a != null) {
                a.mo116705a(this.f81799b);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.a.f$d */
    public static final class View$OnClickListenerC31997d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MeetingRoomViewHolder f81800a;

        /* renamed from: b */
        final /* synthetic */ MeetingRoomModel f81801b;

        View$OnClickListenerC31997d(MeetingRoomViewHolder fVar, MeetingRoomModel meetingRoomModel) {
            this.f81800a = fVar;
            this.f81801b = meetingRoomModel;
        }

        public final void onClick(View view) {
            IActionListener a = this.f81800a.mo116732a();
            if (a != null) {
                a.mo116706b(this.f81801b);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MeetingRoomViewHolder(C30068b bVar) {
        super(bVar.mo108414a());
        Intrinsics.checkParameterIsNotNull(bVar, "binding");
        this.f81797c = bVar;
    }

    /* renamed from: a */
    private final void m121734a(boolean z) {
        float f;
        int i;
        if (z) {
            f = 29.0f;
        } else {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        if (z) {
            i = R.id.iv_meeting_icon;
        } else {
            i = R.id.text_group;
        }
        RelativeLayout relativeLayout = this.f81797c.f74936g;
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "binding.meetingRoomItemContainer");
        ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = null;
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams != null) {
            marginLayoutParams.setMarginStart(UIHelper.dp2px(f));
        }
        RelativeLayout relativeLayout2 = this.f81797c.f74936g;
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout2, "binding.meetingRoomItemContainer");
        relativeLayout2.setLayoutParams(marginLayoutParams);
        View view = this.f81797c.f74938i;
        Intrinsics.checkExpressionValueIsNotNull(view, "binding.splitLine");
        ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
        if (layoutParams3 instanceof RelativeLayout.LayoutParams) {
            layoutParams2 = layoutParams3;
        }
        RelativeLayout.LayoutParams layoutParams4 = layoutParams2;
        if (layoutParams4 != null) {
            layoutParams4.addRule(5, i);
        }
        View view2 = this.f81797c.f74938i;
        Intrinsics.checkExpressionValueIsNotNull(view2, "binding.splitLine");
        view2.setLayoutParams(layoutParams4);
    }

    /* renamed from: a */
    public final void mo116734a(MeetingRoomModel meetingRoomModel) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(meetingRoomModel, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        TextView textView = this.f81797c.f74943n;
        Intrinsics.checkExpressionValueIsNotNull(textView, "binding.tvMeetingRoomName");
        textView.setText(meetingRoomModel.mo116767e());
        TextView textView2 = this.f81797c.f74941l;
        Intrinsics.checkExpressionValueIsNotNull(textView2, "binding.tvMeetingRoomCapacity");
        textView2.setText(meetingRoomModel.mo116769f());
        TextView textView3 = this.f81797c.f74942m;
        Intrinsics.checkExpressionValueIsNotNull(textView3, "binding.tvMeetingRoomDesc");
        textView3.setText(meetingRoomModel.mo116770g().mo116889c());
        if (meetingRoomModel.mo116765c()) {
            m121735b();
        } else {
            m121736c();
        }
        boolean z2 = true;
        if (meetingRoomModel.mo116774j() == MeetingRoomModel.MeetingRoomShowType.TYPE_BUILDING) {
            z = true;
        } else {
            z = false;
        }
        m121734a(z);
        View view = this.f81797c.f74931b;
        Intrinsics.checkExpressionValueIsNotNull(view, "binding.dividerCapacityDesc");
        if (meetingRoomModel.mo116770g().mo116889c().length() <= 0) {
            z2 = false;
        }
        an.m125213a(view, z2);
        this.f81797c.mo108414a().setOnClickListener(new View$OnClickListenerC31996c(this, meetingRoomModel));
        TextView textView4 = this.f81797c.f74944o;
        Intrinsics.checkExpressionValueIsNotNull(textView4, "binding.tvNeedApproval");
        an.m125213a(textView4, meetingRoomModel.mo116766d());
        m121733a(this.f81797c.f74935f, this.f81797c.f74939j, meetingRoomModel);
        EditSelectStateView editSelectStateView = this.f81797c.f74937h;
        an.m125213a(editSelectStateView, meetingRoomModel.mo116763b());
        editSelectStateView.setEnabled(meetingRoomModel.mo116765c());
        editSelectStateView.setClickable(meetingRoomModel.mo116765c());
        if (meetingRoomModel.mo116763b()) {
            editSelectStateView.mo115963a(meetingRoomModel.mo116773i());
        }
    }

    /* renamed from: a */
    private final void m121733a(View view, LinearLayout linearLayout, MeetingRoomModel meetingRoomModel) {
        ViewGroup.LayoutParams layoutParams;
        if (view != null) {
            view.setVisibility(0);
        }
        if (view != null) {
            view.setClickable(true);
        }
        if (view != null) {
            view.setOnClickListener(new View$OnClickListenerC31997d(this, meetingRoomModel));
        }
        ao.m125223a(view, 10, 10);
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
            marginLayoutParams2.rightMargin = UIHelper.dp2px(42.0f);
        }
    }
}
