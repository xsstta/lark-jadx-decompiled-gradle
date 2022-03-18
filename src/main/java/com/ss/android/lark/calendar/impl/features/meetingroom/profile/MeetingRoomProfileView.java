package com.ss.android.lark.calendar.impl.features.meetingroom.profile;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lark.pb.calendar.v1.MeetingRoomStatus;
import com.joooonho.SelectableRoundedImageView;
import com.larksuite.framework.ui.ObservedScrollView;
import com.larksuite.framework.ui.SpareLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.edit.widget.CalendarLoadingView;
import com.ss.android.lark.calendar.impl.features.meetingroom.profile.MeetingRoomProfileContract;
import com.ss.android.lark.calendar.impl.features.meetingroom.profile.widget.MeetingRoomStateView;
import com.ss.android.lark.calendar.impl.framework.calendarmvp.BaseViewCalendar;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventCreator;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.CalendarLoadAvatarUtil;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.photo_picker.C58630d;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001 B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u000bH\u0002J\b\u0010\u000e\u001a\u00020\u000bH\u0002J\b\u0010\u000f\u001a\u00020\u000bH\u0002J\b\u0010\u0010\u001a\u00020\u000bH\u0016J\b\u0010\u0011\u001a\u00020\u000bH\u0016J\b\u0010\u0012\u001a\u00020\u000bH\u0016J\b\u0010\u0013\u001a\u00020\u000bH\u0002J \u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u000bH\u0002J\u0010\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u0019H\u0002J\b\u0010\u001d\u001a\u00020\u000bH\u0002J\b\u0010\u001e\u001a\u00020\u000bH\u0002J\b\u0010\u001f\u001a\u00020\u000bH\u0002R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006!"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/profile/MeetingRoomProfileView;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/BaseViewCalendar;", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/profile/MeetingRoomProfileContract$IMeetingRoomViewData;", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/profile/MeetingRoomProfileContract$IMeetingRoomViewAction;", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/profile/MeetingRoomProfileContract$IMeetingRoomViewApi;", "rootView", "Landroid/view/View;", "(Landroid/view/View;)V", "getRootView", "()Landroid/view/View;", "create", "", "hideLoading", "initLoadingView", "initScrollView", "initView", "refreshAllView", "showLoadError", "showLoading", "updateCapacityContainer", "updateContainer", "containerView", "textView", "Landroid/widget/TextView;", "contentStr", "", "updateIncompatibleContainer", "updateMeetingRoomImage", "imageUrl", "updateMeetingStateInfoContainer", "updateResourceStateView", "updateSubscriptionContainer", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.profile.e */
public final class MeetingRoomProfileView extends BaseViewCalendar<MeetingRoomProfileContract.IMeetingRoomViewData, MeetingRoomProfileContract.IMeetingRoomViewAction> implements MeetingRoomProfileContract.IMeetingRoomViewApi {

    /* renamed from: a */
    public static final Companion f82183a = new Companion(null);

    /* renamed from: b */
    private final View f82184b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/profile/MeetingRoomProfileView$Companion;", "", "()V", "AVATAR_IMAGE_VIEW_SIZE_DP", "", "RESOURCE_IMAGE_HEIGHT_DP", "RESOURCE_IMAGE_WIDTH_DP", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.profile.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.calendar.impl.framework.calendarmvp.BaseViewCalendar, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        m122329f();
    }

    /* renamed from: e */
    public final View mo117325e() {
        return this.f82184b;
    }

    /* renamed from: f */
    private final void m122329f() {
        m122330g();
        m122331h();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/lark/calendar/impl/features/meetingroom/profile/MeetingRoomProfileView$initLoadingView$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/widget/CalendarLoadingView$OnLoadingViewClickedListener;", "onTitleBarBackPressed", "", "onTryAgainClicked", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.profile.e$b */
    public static final class C32147b implements CalendarLoadingView.AbstractC31882a {

        /* renamed from: a */
        final /* synthetic */ MeetingRoomProfileView f82185a;

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.widget.CalendarLoadingView.AbstractC31882a
        /* renamed from: b */
        public void mo110520b() {
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.widget.CalendarLoadingView.AbstractC31882a
        /* renamed from: a */
        public void mo110519a() {
            this.f82185a.mo117272a();
            ((MeetingRoomProfileContract.IMeetingRoomViewAction) this.f82185a.mo118655q()).mo117270a();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32147b(MeetingRoomProfileView eVar) {
            this.f82185a = eVar;
        }
    }

    /* renamed from: g */
    private final void m122330g() {
        ((ObservedScrollView) this.f82184b.findViewById(R.id.rootScrollView)).setOnScrollListener(new C32148c(this));
    }

    /* renamed from: h */
    private final void m122331h() {
        ((CalendarLoadingView) this.f82184b.findViewById(R.id.loadingView)).setOnLoadingViewClickedListener(new C32147b(this));
    }

    @Override // com.ss.android.lark.calendar.impl.features.meetingroom.profile.MeetingRoomProfileContract.IMeetingRoomViewApi
    /* renamed from: c */
    public void mo117274c() {
        ((CalendarLoadingView) this.f82184b.findViewById(R.id.loadingView)).mo116405c();
        CalendarLoadingView calendarLoadingView = (CalendarLoadingView) this.f82184b.findViewById(R.id.loadingView);
        Intrinsics.checkExpressionValueIsNotNull(calendarLoadingView, "rootView.loadingView");
        calendarLoadingView.setVisibility(0);
    }

    @Override // com.ss.android.lark.calendar.impl.features.meetingroom.profile.MeetingRoomProfileContract.IMeetingRoomViewApi
    /* renamed from: a */
    public void mo117272a() {
        CalendarLoadingView calendarLoadingView = (CalendarLoadingView) this.f82184b.findViewById(R.id.loadingView);
        Intrinsics.checkExpressionValueIsNotNull(calendarLoadingView, "rootView.loadingView");
        calendarLoadingView.setVisibility(0);
        ((CalendarLoadingView) this.f82184b.findViewById(R.id.loadingView)).mo116402a();
    }

    @Override // com.ss.android.lark.calendar.impl.features.meetingroom.profile.MeetingRoomProfileContract.IMeetingRoomViewApi
    /* renamed from: b */
    public void mo117273b() {
        ((CalendarLoadingView) this.f82184b.findViewById(R.id.loadingView)).mo116404b();
        CalendarLoadingView calendarLoadingView = (CalendarLoadingView) this.f82184b.findViewById(R.id.loadingView);
        Intrinsics.checkExpressionValueIsNotNull(calendarLoadingView, "rootView.loadingView");
        calendarLoadingView.setVisibility(8);
    }

    /* renamed from: i */
    private final void m122332i() {
        String str;
        long c = ((MeetingRoomProfileContract.IMeetingRoomViewData) mo118654p()).mo117278c();
        if (c <= 0) {
            str = "";
        } else {
            str = C32634ae.m125180a(R.plurals.Calendar_MeetingView_GuestCapacity, (int) c);
        }
        LinearLayout linearLayout = (LinearLayout) this.f82184b.findViewById(R.id.capacityContainer);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "rootView.capacityContainer");
        TextView textView = (TextView) this.f82184b.findViewById(R.id.meetingRoomCapacityTv);
        Intrinsics.checkExpressionValueIsNotNull(textView, "rootView.meetingRoomCapacityTv");
        Intrinsics.checkExpressionValueIsNotNull(str, "capacityText");
        m122327a(linearLayout, textView, str);
    }

    /* renamed from: j */
    private final void m122333j() {
        if (!((MeetingRoomProfileContract.IMeetingRoomViewData) mo118654p()).mo117286k()) {
            MeetingRoomStateView meetingRoomStateView = (MeetingRoomStateView) this.f82184b.findViewById(R.id.meetingRoomStateView);
            Intrinsics.checkExpressionValueIsNotNull(meetingRoomStateView, "rootView.meetingRoomStateView");
            meetingRoomStateView.setVisibility(8);
            return;
        }
        MeetingRoomStateView meetingRoomStateView2 = (MeetingRoomStateView) this.f82184b.findViewById(R.id.meetingRoomStateView);
        Intrinsics.checkExpressionValueIsNotNull(meetingRoomStateView2, "rootView.meetingRoomStateView");
        meetingRoomStateView2.setVisibility(0);
        ((MeetingRoomStateView) this.f82184b.findViewById(R.id.meetingRoomStateView)).setState(((MeetingRoomProfileContract.IMeetingRoomViewData) mo118654p()).mo117283h());
    }

    /* renamed from: k */
    private final void m122334k() {
        if (!((MeetingRoomProfileContract.IMeetingRoomViewData) mo118654p()).mo117286k() || ((MeetingRoomProfileContract.IMeetingRoomViewData) mo118654p()).mo117283h() == MeetingRoomStatus.CAN_RESERVE) {
            View findViewById = this.f82184b.findViewById(R.id.blockContainer);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "rootView.blockContainer");
            findViewById.setVisibility(8);
            RelativeLayout relativeLayout = (RelativeLayout) this.f82184b.findViewById(R.id.incompatibleContainer);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "rootView.incompatibleContainer");
            relativeLayout.setVisibility(8);
            return;
        }
        int i = C32151f.f82191a[((MeetingRoomProfileContract.IMeetingRoomViewData) mo118654p()).mo117283h().ordinal()];
        if (i == 1) {
            m122335l();
        } else if (i == 2) {
            m122336m();
        }
    }

    /* renamed from: m */
    private final void m122336m() {
        boolean z;
        View findViewById = this.f82184b.findViewById(R.id.blockContainer);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "rootView.blockContainer");
        findViewById.setVisibility(8);
        String i = ((MeetingRoomProfileContract.IMeetingRoomViewData) mo118654p()).mo117284i();
        if (i.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            RelativeLayout relativeLayout = (RelativeLayout) this.f82184b.findViewById(R.id.incompatibleContainer);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "rootView.incompatibleContainer");
            relativeLayout.setVisibility(8);
            return;
        }
        RelativeLayout relativeLayout2 = (RelativeLayout) this.f82184b.findViewById(R.id.incompatibleContainer);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout2, "rootView.incompatibleContainer");
        relativeLayout2.setVisibility(0);
        TextView textView = (TextView) this.f82184b.findViewById(R.id.incompatibleRuleTv);
        Intrinsics.checkExpressionValueIsNotNull(textView, "rootView.incompatibleRuleTv");
        textView.setText(i);
    }

    @Override // com.ss.android.lark.calendar.impl.features.meetingroom.profile.MeetingRoomProfileContract.IMeetingRoomViewApi
    /* renamed from: d */
    public void mo117275d() {
        ObservedScrollView observedScrollView = (ObservedScrollView) this.f82184b.findViewById(R.id.rootScrollView);
        Intrinsics.checkExpressionValueIsNotNull(observedScrollView, "rootView.rootScrollView");
        observedScrollView.setVisibility(0);
        TextView textView = (TextView) this.f82184b.findViewById(R.id.meetingRoomName);
        Intrinsics.checkExpressionValueIsNotNull(textView, "rootView.meetingRoomName");
        textView.setText(((MeetingRoomProfileContract.IMeetingRoomViewData) mo118654p()).mo117276a());
        TextView textView2 = (TextView) this.f82184b.findViewById(R.id.buildingName);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "rootView.buildingName");
        textView2.setText(((MeetingRoomProfileContract.IMeetingRoomViewData) mo118654p()).mo117277b());
        m122333j();
        m122334k();
        m122332i();
        LinearLayout linearLayout = (LinearLayout) this.f82184b.findViewById(R.id.equipmentContainer);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "rootView.equipmentContainer");
        TextView textView3 = (TextView) this.f82184b.findViewById(R.id.meetingRoomEquipmentTv);
        Intrinsics.checkExpressionValueIsNotNull(textView3, "rootView.meetingRoomEquipmentTv");
        m122327a(linearLayout, textView3, ((MeetingRoomProfileContract.IMeetingRoomViewData) mo118654p()).mo117282g());
        LinearLayout linearLayout2 = (LinearLayout) this.f82184b.findViewById(R.id.ruleContainer);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "rootView.ruleContainer");
        TextView textView4 = (TextView) this.f82184b.findViewById(R.id.meetingRoomRuleTv);
        Intrinsics.checkExpressionValueIsNotNull(textView4, "rootView.meetingRoomRuleTv");
        m122327a(linearLayout2, textView4, ((MeetingRoomProfileContract.IMeetingRoomViewData) mo118654p()).mo117279d());
        LinearLayout linearLayout3 = (LinearLayout) this.f82184b.findViewById(R.id.descriptionContainer);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout3, "rootView.descriptionContainer");
        TextView textView5 = (TextView) this.f82184b.findViewById(R.id.meetingRoomDescriptionTv);
        Intrinsics.checkExpressionValueIsNotNull(textView5, "rootView.meetingRoomDescriptionTv");
        m122327a(linearLayout3, textView5, ((MeetingRoomProfileContract.IMeetingRoomViewData) mo118654p()).mo117280e());
        m122328a(((MeetingRoomProfileContract.IMeetingRoomViewData) mo118654p()).mo117281f());
    }

    /* renamed from: l */
    private final void m122335l() {
        boolean z;
        boolean z2;
        String str;
        View findViewById = this.f82184b.findViewById(R.id.blockContainer);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "rootView.blockContainer");
        findViewById.setVisibility(0);
        RelativeLayout relativeLayout = (RelativeLayout) this.f82184b.findViewById(R.id.incompatibleContainer);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "rootView.incompatibleContainer");
        relativeLayout.setVisibility(8);
        TextView textView = (TextView) this.f82184b.findViewById(R.id.blockTimeTv);
        Intrinsics.checkExpressionValueIsNotNull(textView, "rootView.blockTimeTv");
        textView.setText(((MeetingRoomProfileContract.IMeetingRoomViewData) mo118654p()).mo117285j());
        CalendarEventCreator l = ((MeetingRoomProfileContract.IMeetingRoomViewData) mo118654p()).mo117287l();
        if (l == null) {
            RelativeLayout relativeLayout2 = (RelativeLayout) this.f82184b.findViewById(R.id.blockerChatContainer);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout2, "rootView.blockerChatContainer");
            relativeLayout2.setVisibility(8);
            return;
        }
        RelativeLayout relativeLayout3 = (RelativeLayout) this.f82184b.findViewById(R.id.blockerChatContainer);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout3, "rootView.blockerChatContainer");
        relativeLayout3.setVisibility(0);
        TextView textView2 = (TextView) this.f82184b.findViewById(R.id.blockerNameTv);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "rootView.blockerNameTv");
        textView2.setText(l.getName());
        boolean z3 = true;
        if (l.getChatterId().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !(!Intrinsics.areEqual(l.getChatterId(), "0"))) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            str = l.getDepartment();
        } else {
            str = UIHelper.mustacheFormat((int) R.string.Calendar_Setting_LarkContactNotFound);
        }
        Intrinsics.checkExpressionValueIsNotNull(str, "subtitle");
        String str2 = str;
        if (str2.length() != 0) {
            z3 = false;
        }
        RelativeLayout.LayoutParams layoutParams = null;
        if (z3) {
            TextView textView3 = (TextView) this.f82184b.findViewById(R.id.blockerDepartment);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "rootView.blockerDepartment");
            textView3.setVisibility(8);
            SpareLayout spareLayout = (SpareLayout) this.f82184b.findViewById(R.id.blockerSpareLayout);
            Intrinsics.checkExpressionValueIsNotNull(spareLayout, "rootView.blockerSpareLayout");
            ViewGroup.LayoutParams layoutParams2 = spareLayout.getLayoutParams();
            if (layoutParams2 instanceof RelativeLayout.LayoutParams) {
                layoutParams = layoutParams2;
            }
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) layoutParams;
            if (layoutParams3 != null) {
                layoutParams3.addRule(15);
            }
        } else {
            TextView textView4 = (TextView) this.f82184b.findViewById(R.id.blockerDepartment);
            Intrinsics.checkExpressionValueIsNotNull(textView4, "rootView.blockerDepartment");
            textView4.setVisibility(0);
            TextView textView5 = (TextView) this.f82184b.findViewById(R.id.blockerDepartment);
            Intrinsics.checkExpressionValueIsNotNull(textView5, "rootView.blockerDepartment");
            textView5.setText(str2);
            SpareLayout spareLayout2 = (SpareLayout) this.f82184b.findViewById(R.id.blockerSpareLayout);
            Intrinsics.checkExpressionValueIsNotNull(spareLayout2, "rootView.blockerSpareLayout");
            ViewGroup.LayoutParams layoutParams4 = spareLayout2.getLayoutParams();
            if (layoutParams4 instanceof RelativeLayout.LayoutParams) {
                layoutParams = layoutParams4;
            }
            RelativeLayout.LayoutParams layoutParams5 = layoutParams;
            if (layoutParams5 != null) {
                layoutParams5.removeRule(15);
            }
        }
        if (!z2) {
            ImageView imageView = (ImageView) this.f82184b.findViewById(R.id.blockChatIcon);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "rootView.blockChatIcon");
            imageView.setVisibility(8);
        } else {
            ImageView imageView2 = (ImageView) this.f82184b.findViewById(R.id.blockChatIcon);
            Intrinsics.checkExpressionValueIsNotNull(imageView2, "rootView.blockChatIcon");
            imageView2.setVisibility(0);
            ((ImageView) this.f82184b.findViewById(R.id.blockChatIcon)).setOnClickListener(new View$OnClickListenerC32150e(this, l));
        }
        CalendarLoadAvatarUtil.m125306a(this.f82184b.getContext(), (SelectableRoundedImageView) this.f82184b.findViewById(R.id.blockerAvatar), 32, 32, l.getAvatarKey(), l.getChatterId(), null);
        if (C30022a.f74883b.mo112710r()) {
            CalendarEventCreator m = ((MeetingRoomProfileContract.IMeetingRoomViewData) mo118654p()).mo117288m();
            if (m == null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) this.f82184b.findViewById(R.id.eventCreatorZone);
                Intrinsics.checkExpressionValueIsNotNull(constraintLayout, "rootView.eventCreatorZone");
                constraintLayout.setVisibility(8);
            } else if (Intrinsics.areEqual(m.getChatterId(), l.getChatterId())) {
                ConstraintLayout constraintLayout2 = (ConstraintLayout) this.f82184b.findViewById(R.id.eventCreatorZone);
                Intrinsics.checkExpressionValueIsNotNull(constraintLayout2, "rootView.eventCreatorZone");
                constraintLayout2.setVisibility(8);
            } else {
                ConstraintLayout constraintLayout3 = (ConstraintLayout) this.f82184b.findViewById(R.id.eventCreatorZone);
                Intrinsics.checkExpressionValueIsNotNull(constraintLayout3, "rootView.eventCreatorZone");
                constraintLayout3.setVisibility(0);
                String a = C30022a.f74882a.utilsDependency().mo108195a(R.string.Calendar_Detail_CreatedBy, "creator", m.getName());
                TextView textView6 = (TextView) this.f82184b.findViewById(R.id.eventCreatorTV);
                Intrinsics.checkExpressionValueIsNotNull(textView6, "rootView.eventCreatorTV");
                textView6.setText(a);
            }
        } else {
            ConstraintLayout constraintLayout4 = (ConstraintLayout) this.f82184b.findViewById(R.id.eventCreatorZone);
            Intrinsics.checkExpressionValueIsNotNull(constraintLayout4, "rootView.eventCreatorZone");
            constraintLayout4.setVisibility(8);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.profile.e$d */
    public static final class View$OnClickListenerC32149d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Context f82187a;

        /* renamed from: b */
        final /* synthetic */ String f82188b;

        View$OnClickListenerC32149d(Context context, String str) {
            this.f82187a = context;
            this.f82188b = str;
        }

        public final void onClick(View view) {
            C58630d.m227373a(this.f82187a, CollectionsKt.listOf(this.f82188b), 0, view, true);
        }
    }

    public MeetingRoomProfileView(View view) {
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        this.f82184b = view;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.profile.e$e */
    public static final class View$OnClickListenerC32150e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MeetingRoomProfileView f82189a;

        /* renamed from: b */
        final /* synthetic */ CalendarEventCreator f82190b;

        View$OnClickListenerC32150e(MeetingRoomProfileView eVar, CalendarEventCreator calendarEventCreator) {
            this.f82189a = eVar;
            this.f82190b = calendarEventCreator;
        }

        public final void onClick(View view) {
            ((MeetingRoomProfileContract.IMeetingRoomViewAction) this.f82189a.mo118655q()).mo117271a(this.f82190b.getChatterId());
        }
    }

    /* renamed from: a */
    private final void m122328a(String str) {
        boolean z;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            LinearLayout linearLayout = (LinearLayout) this.f82184b.findViewById(R.id.imageContainer);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "rootView.imageContainer");
            linearLayout.setVisibility(8);
            return;
        }
        Context context = this.f82184b.getContext();
        if (context != null) {
            C30022a.f74882a.imageDependency().mo108245a(context, str, (SelectableRoundedImageView) this.f82184b.findViewById(R.id.meetingRoomImageView), 311, 208);
            ((SelectableRoundedImageView) this.f82184b.findViewById(R.id.meetingRoomImageView)).setOnClickListener(new View$OnClickListenerC32149d(context, str));
        }
    }

    /* renamed from: a */
    private final void m122327a(View view, TextView textView, String str) {
        boolean z;
        String str2 = str;
        if (str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            view.setVisibility(8);
            return;
        }
        view.setVisibility(0);
        textView.setText(str2);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "<anonymous parameter 2>", "<anonymous parameter 3>", "onScroll"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.profile.e$c */
    public static final class C32148c implements ObservedScrollView.AbstractC26173a {

        /* renamed from: a */
        final /* synthetic */ MeetingRoomProfileView f82186a;

        C32148c(MeetingRoomProfileView eVar) {
            this.f82186a = eVar;
        }

        @Override // com.larksuite.framework.ui.ObservedScrollView.AbstractC26173a
        /* renamed from: a */
        public final void mo93133a(int i, int i2, int i3, int i4) {
            ObservedScrollView observedScrollView = (ObservedScrollView) this.f82186a.mo117325e().findViewById(R.id.rootScrollView);
            Intrinsics.checkExpressionValueIsNotNull(observedScrollView, "rootView.rootScrollView");
            int scrollY = observedScrollView.getScrollY();
            RelativeLayout relativeLayout = (RelativeLayout) this.f82186a.mo117325e().findViewById(R.id.meetingRoomBaseInfoContainer);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "rootView.meetingRoomBaseInfoContainer");
            if (scrollY >= relativeLayout.getHeight()) {
                ((CommonTitleBar) this.f82186a.mo117325e().findViewById(R.id.titleBar)).setCenterViewVisible(0);
                ((CommonTitleBar) this.f82186a.mo117325e().findViewById(R.id.titleBar)).setTitle(((MeetingRoomProfileContract.IMeetingRoomViewData) this.f82186a.mo118654p()).mo117276a());
                return;
            }
            ((CommonTitleBar) this.f82186a.mo117325e().findViewById(R.id.titleBar)).setCenterViewVisible(8);
        }
    }
}
