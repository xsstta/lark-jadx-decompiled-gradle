package com.ss.android.lark.calendar.impl.features.meetingroom.profile.content;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1144ai;
import com.bytedance.lark.pb.calendar.v1.MeetingRoomStatus;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.joooonho.SelectableRoundedImageView;
import com.larksuite.framework.ui.ObservedScrollView;
import com.larksuite.framework.ui.SpareLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.edit.widget.CalendarLoadingView;
import com.ss.android.lark.calendar.impl.features.meetingroom.profile.data.MeetingRoomProfileBaseData;
import com.ss.android.lark.calendar.impl.features.meetingroom.profile.widget.MeetingRoomStateView;
import com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventCreator;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.CalendarLoadAvatarUtil;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.photo_picker.C58630d;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 .2\u00020\u0001:\u0001.B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002J\u0006\u0010\r\u001a\u00020\fJ\b\u0010\u000e\u001a\u00020\fH\u0002J\b\u0010\u000f\u001a\u00020\fH\u0002J\b\u0010\u0010\u001a\u00020\fH\u0002J&\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u001a\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u000e\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u0018J\b\u0010\u001d\u001a\u00020\fH\u0002J\b\u0010\u001e\u001a\u00020\fH\u0002J\u0010\u0010\u001f\u001a\u00020\f2\u0006\u0010 \u001a\u00020!H\u0002J \u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0002J\u0010\u0010(\u001a\u00020\f2\u0006\u0010 \u001a\u00020!H\u0002J\u0010\u0010)\u001a\u00020\f2\u0006\u0010*\u001a\u00020'H\u0002J\u0010\u0010+\u001a\u00020\f2\u0006\u0010 \u001a\u00020!H\u0002J\u0010\u0010,\u001a\u00020\f2\u0006\u0010 \u001a\u00020!H\u0002J\u0010\u0010-\u001a\u00020\f2\u0006\u0010 \u001a\u00020!H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006/"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/profile/content/ProfileContentFragment;", "Lcom/ss/android/lark/calendar/impl/framework/components/CalendarBaseFragment;", "()V", "mHideTitle", "", "mViewModel", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/profile/content/ProfileViewModel;", "getMViewModel", "()Lcom/ss/android/lark/calendar/impl/features/meetingroom/profile/content/ProfileViewModel;", "mViewModel$delegate", "Lkotlin/Lazy;", "hideLoading", "", "hideTitle", "initLiveData", "initLoadingView", "initScrollView", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "saveInstanceState", "outState", "showLoadError", "showLoading", "updateCapacityContainer", "roomData", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/profile/content/ProfileContentData;", "updateContainer", "containerView", "textView", "Landroid/widget/TextView;", "contentStr", "", "updateIncompatibleContainer", "updateMeetingRoomImage", "imageUrl", "updateMeetingStateInfoContainer", "updateResourceStateView", "updateSubscriptionContainer", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.profile.a.b */
public final class ProfileContentFragment extends CalendarBaseFragment {

    /* renamed from: a */
    public static final Companion f82150a = new Companion(null);

    /* renamed from: b */
    private boolean f82151b;

    /* renamed from: c */
    private final Lazy f82152c = LazyKt.lazy(new C32138f(this));

    /* renamed from: d */
    private HashMap f82153d;

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public View mo109250a(int i) {
        if (this.f82153d == null) {
            this.f82153d = new HashMap();
        }
        View view = (View) this.f82153d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f82153d.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public void mo109251a() {
        HashMap hashMap = this.f82153d;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: b */
    public final ProfileViewModel mo117251b() {
        return (ProfileViewModel) this.f82152c.getValue();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment, com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo109251a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/profile/content/ProfileContentFragment$Companion;", "", "()V", "AVATAR_IMAGE_VIEW_SIZE_DP", "", "RESOURCE_IMAGE_HEIGHT_DP", "RESOURCE_IMAGE_WIDTH_DP", "TAG", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.profile.a.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/lark/calendar/impl/features/meetingroom/profile/content/ProfileContentFragment$initLoadingView$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/widget/CalendarLoadingView$OnLoadingViewClickedListener;", "onTitleBarBackPressed", "", "onTryAgainClicked", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.profile.a.b$d */
    public static final class C32136d implements CalendarLoadingView.AbstractC31882a {

        /* renamed from: a */
        final /* synthetic */ ProfileContentFragment f82156a;

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.widget.CalendarLoadingView.AbstractC31882a
        /* renamed from: b */
        public void mo110520b() {
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.widget.CalendarLoadingView.AbstractC31882a
        /* renamed from: a */
        public void mo110519a() {
            this.f82156a.mo117251b().loadMeetingRoomInfo();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32136d(ProfileContentFragment bVar) {
            this.f82156a = bVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/profile/content/ProfileViewModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.profile.a.b$f */
    static final class C32138f extends Lambda implements Function0<ProfileViewModel> {
        final /* synthetic */ ProfileContentFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32138f(ProfileContentFragment bVar) {
            super(0);
            this.this$0 = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ProfileViewModel invoke() {
            return (ProfileViewModel) new C1144ai(this.this$0, new C1144ai.AbstractC1146b(this) {
                /* class com.ss.android.lark.calendar.impl.features.meetingroom.profile.content.ProfileContentFragment.C32138f.C321391 */

                /* renamed from: a */
                final /* synthetic */ C32138f f82158a;

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f82158a = r1;
                }

                @Override // androidx.lifecycle.C1144ai.AbstractC1146b
                public <T extends AbstractC1142af> T create(Class<T> cls) {
                    Intrinsics.checkParameterIsNotNull(cls, "modelClass");
                    return new ProfileViewModel(MeetingRoomProfileBaseData.f82165a.mo117305a(this.f82158a.this$0.getArguments()));
                }
            }).mo6005a(ProfileViewModel.class);
        }
    }

    /* renamed from: h */
    private final void m122224h() {
        ((CalendarLoadingView) mo109250a(R.id.loadingView)).setOnLoadingViewClickedListener(new C32136d(this));
    }

    /* renamed from: c */
    public final void mo117253c() {
        CalendarLoadingView calendarLoadingView = (CalendarLoadingView) mo109250a(R.id.loadingView);
        Intrinsics.checkExpressionValueIsNotNull(calendarLoadingView, "loadingView");
        calendarLoadingView.setVisibility(0);
        ((CalendarLoadingView) mo109250a(R.id.loadingView)).mo116402a();
    }

    /* renamed from: d */
    public final void mo117255d() {
        ((CalendarLoadingView) mo109250a(R.id.loadingView)).mo116404b();
        CalendarLoadingView calendarLoadingView = (CalendarLoadingView) mo109250a(R.id.loadingView);
        Intrinsics.checkExpressionValueIsNotNull(calendarLoadingView, "loadingView");
        calendarLoadingView.setVisibility(8);
    }

    /* renamed from: e */
    public final void mo117256e() {
        ((CalendarLoadingView) mo109250a(R.id.loadingView)).mo116405c();
        CalendarLoadingView calendarLoadingView = (CalendarLoadingView) mo109250a(R.id.loadingView);
        Intrinsics.checkExpressionValueIsNotNull(calendarLoadingView, "loadingView");
        calendarLoadingView.setVisibility(0);
    }

    /* renamed from: f */
    public final void mo117257f() {
        this.f82151b = true;
        CommonTitleBar commonTitleBar = (CommonTitleBar) mo109250a(R.id.titleBar);
        if (commonTitleBar != null) {
            commonTitleBar.setVisibility(8);
        }
    }

    /* renamed from: i */
    private final void m122225i() {
        ProfileContentFragment bVar = this;
        mo117251b().getStartLoadLiveData().mo5923a(bVar, new C32134b(this));
        mo117251b().getProfileLiveData().mo5923a(bVar, new C32135c(this));
    }

    /* renamed from: g */
    private final void m122223g() {
        if (this.f82151b) {
            CommonTitleBar commonTitleBar = (CommonTitleBar) mo109250a(R.id.titleBar);
            Intrinsics.checkExpressionValueIsNotNull(commonTitleBar, "titleBar");
            commonTitleBar.setVisibility(8);
            TextView textView = (TextView) mo109250a(R.id.meetingRoomName);
            Intrinsics.checkExpressionValueIsNotNull(textView, "meetingRoomName");
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            if (layoutParams != null) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                layoutParams2.topMargin = 0;
                TextView textView2 = (TextView) mo109250a(R.id.meetingRoomName);
                Intrinsics.checkExpressionValueIsNotNull(textView2, "meetingRoomName");
                textView2.setLayoutParams(layoutParams2);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            }
        }
        ((ObservedScrollView) mo109250a(R.id.rootScrollView)).setOnScrollListener(new C32137e(this));
        ((CommonTitleBar) mo109250a(R.id.titleBar)).setCenterViewVisible(8);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.profile.a.b$g */
    public static final class View$OnClickListenerC32140g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Context f82159a;

        /* renamed from: b */
        final /* synthetic */ String f82160b;

        View$OnClickListenerC32140g(Context context, String str) {
            this.f82159a = context;
            this.f82160b = str;
        }

        public final void onClick(View view) {
            C58630d.m227373a(this.f82159a, CollectionsKt.listOf(this.f82160b), 0, view, true);
        }
    }

    /* renamed from: a */
    public final void mo117247a(Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(bundle, "outState");
        mo117251b().saveInstanceState(bundle);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", UpdateKey.STATUS, "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Integer;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.profile.a.b$b */
    public static final class C32134b<T> implements AbstractC1178x<Integer> {

        /* renamed from: a */
        final /* synthetic */ ProfileContentFragment f82154a;

        C32134b(ProfileContentFragment bVar) {
            this.f82154a = bVar;
        }

        /* renamed from: a */
        public final void onChanged(Integer num) {
            if (num != null && num.intValue() == 1) {
                this.f82154a.mo117253c();
            } else if (num != null && num.intValue() == 2) {
                this.f82154a.mo117255d();
            } else {
                this.f82154a.mo117255d();
                this.f82154a.mo117256e();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.profile.a.b$h */
    public static final class View$OnClickListenerC32141h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ProfileContentFragment f82161a;

        /* renamed from: b */
        final /* synthetic */ CalendarEventCreator f82162b;

        View$OnClickListenerC32141h(ProfileContentFragment bVar, CalendarEventCreator calendarEventCreator) {
            this.f82161a = bVar;
            this.f82162b = calendarEventCreator;
        }

        public final void onClick(View view) {
            Context context;
            boolean z;
            String chatterId = this.f82162b.getChatterId();
            View view2 = this.f82161a.getView();
            if (view2 != null) {
                context = view2.getContext();
            } else {
                context = null;
            }
            if (chatterId.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z && context != null) {
                C30022a.f74882a.chatModuleDependency().mo108226b(context, chatterId);
            }
        }
    }

    /* renamed from: b */
    public final void mo117252b(ProfileContentData aVar) {
        if (!aVar.mo117244k()) {
            MeetingRoomStateView meetingRoomStateView = (MeetingRoomStateView) mo109250a(R.id.meetingRoomStateView);
            Intrinsics.checkExpressionValueIsNotNull(meetingRoomStateView, "meetingRoomStateView");
            meetingRoomStateView.setVisibility(8);
            return;
        }
        MeetingRoomStateView meetingRoomStateView2 = (MeetingRoomStateView) mo109250a(R.id.meetingRoomStateView);
        Intrinsics.checkExpressionValueIsNotNull(meetingRoomStateView2, "meetingRoomStateView");
        meetingRoomStateView2.setVisibility(0);
        ((MeetingRoomStateView) mo109250a(R.id.meetingRoomStateView)).setState(aVar.mo117242i());
    }

    /* renamed from: e */
    private final void m122222e(ProfileContentData aVar) {
        boolean z;
        View a = mo109250a(R.id.blockContainer);
        Intrinsics.checkExpressionValueIsNotNull(a, "blockContainer");
        a.setVisibility(8);
        String b = aVar.mo117235b();
        if (b.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            RelativeLayout relativeLayout = (RelativeLayout) mo109250a(R.id.incompatibleContainer);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "incompatibleContainer");
            relativeLayout.setVisibility(8);
            return;
        }
        RelativeLayout relativeLayout2 = (RelativeLayout) mo109250a(R.id.incompatibleContainer);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout2, "incompatibleContainer");
        relativeLayout2.setVisibility(0);
        TextView textView = (TextView) mo109250a(R.id.incompatibleRuleTv);
        Intrinsics.checkExpressionValueIsNotNull(textView, "incompatibleRuleTv");
        textView.setText(b);
    }

    /* renamed from: a */
    public final void mo117249a(ProfileContentData aVar) {
        String str;
        long e = aVar.mo117238e();
        if (e <= 0) {
            str = "";
        } else {
            str = C32634ae.m125180a(R.plurals.Calendar_MeetingView_GuestCapacity, (int) e);
        }
        LinearLayout linearLayout = (LinearLayout) mo109250a(R.id.capacityContainer);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "capacityContainer");
        TextView textView = (TextView) mo109250a(R.id.meetingRoomCapacityTv);
        Intrinsics.checkExpressionValueIsNotNull(textView, "meetingRoomCapacityTv");
        Intrinsics.checkExpressionValueIsNotNull(str, "capacityText");
        mo117248a(linearLayout, textView, str);
    }

    /* renamed from: c */
    public final void mo117254c(ProfileContentData aVar) {
        if (!aVar.mo117244k() || aVar.mo117242i() == MeetingRoomStatus.CAN_RESERVE) {
            View a = mo109250a(R.id.blockContainer);
            Intrinsics.checkExpressionValueIsNotNull(a, "blockContainer");
            a.setVisibility(8);
            RelativeLayout relativeLayout = (RelativeLayout) mo109250a(R.id.incompatibleContainer);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "incompatibleContainer");
            relativeLayout.setVisibility(8);
            return;
        }
        int i = C32142c.f82163a[aVar.mo117242i().ordinal()];
        if (i == 1) {
            m122221d(aVar);
        } else if (i == 2) {
            m122222e(aVar);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "roomData", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/profile/content/ProfileContentData;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.profile.a.b$c */
    public static final class C32135c<T> implements AbstractC1178x<ProfileContentData> {

        /* renamed from: a */
        final /* synthetic */ ProfileContentFragment f82155a;

        C32135c(ProfileContentFragment bVar) {
            this.f82155a = bVar;
        }

        /* renamed from: a */
        public final void onChanged(ProfileContentData aVar) {
            ObservedScrollView observedScrollView = (ObservedScrollView) this.f82155a.mo109250a(R.id.rootScrollView);
            Intrinsics.checkExpressionValueIsNotNull(observedScrollView, "rootScrollView");
            observedScrollView.setVisibility(0);
            TextView textView = (TextView) this.f82155a.mo109250a(R.id.meetingRoomName);
            Intrinsics.checkExpressionValueIsNotNull(textView, "meetingRoomName");
            textView.setText(aVar.mo117236c());
            TextView textView2 = (TextView) this.f82155a.mo109250a(R.id.buildingName);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "buildingName");
            textView2.setText(aVar.mo117237d());
            ((CommonTitleBar) this.f82155a.mo109250a(R.id.titleBar)).setTitle(aVar.mo117236c());
            ProfileContentFragment bVar = this.f82155a;
            Intrinsics.checkExpressionValueIsNotNull(aVar, "roomData");
            bVar.mo117252b(aVar);
            this.f82155a.mo117254c(aVar);
            this.f82155a.mo117249a(aVar);
            ProfileContentFragment bVar2 = this.f82155a;
            LinearLayout linearLayout = (LinearLayout) bVar2.mo109250a(R.id.equipmentContainer);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "equipmentContainer");
            TextView textView3 = (TextView) this.f82155a.mo109250a(R.id.meetingRoomEquipmentTv);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "meetingRoomEquipmentTv");
            bVar2.mo117248a(linearLayout, textView3, aVar.mo117241h());
            ProfileContentFragment bVar3 = this.f82155a;
            LinearLayout linearLayout2 = (LinearLayout) bVar3.mo109250a(R.id.ruleContainer);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "ruleContainer");
            TextView textView4 = (TextView) this.f82155a.mo109250a(R.id.meetingRoomRuleTv);
            Intrinsics.checkExpressionValueIsNotNull(textView4, "meetingRoomRuleTv");
            bVar3.mo117248a(linearLayout2, textView4, aVar.mo117234a());
            ProfileContentFragment bVar4 = this.f82155a;
            LinearLayout linearLayout3 = (LinearLayout) bVar4.mo109250a(R.id.descriptionContainer);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout3, "descriptionContainer");
            TextView textView5 = (TextView) this.f82155a.mo109250a(R.id.meetingRoomDescriptionTv);
            Intrinsics.checkExpressionValueIsNotNull(textView5, "meetingRoomDescriptionTv");
            bVar4.mo117248a(linearLayout3, textView5, aVar.mo117239f());
            this.f82155a.mo117250a(aVar.mo117240g());
        }
    }

    /* renamed from: a */
    public final void mo117250a(String str) {
        boolean z;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            LinearLayout linearLayout = (LinearLayout) mo109250a(R.id.imageContainer);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "imageContainer");
            linearLayout.setVisibility(8);
            return;
        }
        Context context = getContext();
        if (context != null) {
            Intrinsics.checkExpressionValueIsNotNull(context, "context ?: return");
            C30022a.f74882a.imageDependency().mo108245a(context, str, (SelectableRoundedImageView) mo109250a(R.id.meetingRoomImageView), 311, 208);
            ((SelectableRoundedImageView) mo109250a(R.id.meetingRoomImageView)).setOnClickListener(new View$OnClickListenerC32140g(context, str));
        }
    }

    /* renamed from: d */
    private final void m122221d(ProfileContentData aVar) {
        boolean z;
        boolean z2;
        String str;
        View a = mo109250a(R.id.blockContainer);
        Intrinsics.checkExpressionValueIsNotNull(a, "blockContainer");
        a.setVisibility(0);
        RelativeLayout relativeLayout = (RelativeLayout) mo109250a(R.id.incompatibleContainer);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "incompatibleContainer");
        relativeLayout.setVisibility(8);
        TextView textView = (TextView) mo109250a(R.id.blockTimeTv);
        Intrinsics.checkExpressionValueIsNotNull(textView, "blockTimeTv");
        textView.setText(aVar.mo117243j());
        CalendarEventCreator l = aVar.mo117245l();
        if (l == null) {
            RelativeLayout relativeLayout2 = (RelativeLayout) mo109250a(R.id.blockerChatContainer);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout2, "blockerChatContainer");
            relativeLayout2.setVisibility(8);
            return;
        }
        RelativeLayout relativeLayout3 = (RelativeLayout) mo109250a(R.id.blockerChatContainer);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout3, "blockerChatContainer");
        relativeLayout3.setVisibility(0);
        TextView textView2 = (TextView) mo109250a(R.id.blockerNameTv);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "blockerNameTv");
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
            TextView textView3 = (TextView) mo109250a(R.id.blockerDepartment);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "blockerDepartment");
            textView3.setVisibility(8);
            SpareLayout spareLayout = (SpareLayout) mo109250a(R.id.blockerSpareLayout);
            Intrinsics.checkExpressionValueIsNotNull(spareLayout, "blockerSpareLayout");
            ViewGroup.LayoutParams layoutParams2 = spareLayout.getLayoutParams();
            if (layoutParams2 instanceof RelativeLayout.LayoutParams) {
                layoutParams = layoutParams2;
            }
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) layoutParams;
            if (layoutParams3 != null) {
                layoutParams3.addRule(15);
            }
        } else {
            TextView textView4 = (TextView) mo109250a(R.id.blockerDepartment);
            Intrinsics.checkExpressionValueIsNotNull(textView4, "blockerDepartment");
            textView4.setVisibility(0);
            TextView textView5 = (TextView) mo109250a(R.id.blockerDepartment);
            Intrinsics.checkExpressionValueIsNotNull(textView5, "blockerDepartment");
            textView5.setText(str2);
            SpareLayout spareLayout2 = (SpareLayout) mo109250a(R.id.blockerSpareLayout);
            Intrinsics.checkExpressionValueIsNotNull(spareLayout2, "blockerSpareLayout");
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
            ImageView imageView = (ImageView) mo109250a(R.id.blockChatIcon);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "blockChatIcon");
            imageView.setVisibility(8);
        } else {
            ImageView imageView2 = (ImageView) mo109250a(R.id.blockChatIcon);
            Intrinsics.checkExpressionValueIsNotNull(imageView2, "blockChatIcon");
            imageView2.setVisibility(0);
            ((ImageView) mo109250a(R.id.blockChatIcon)).setOnClickListener(new View$OnClickListenerC32141h(this, l));
        }
        CalendarLoadAvatarUtil.m125306a(getContext(), (SelectableRoundedImageView) mo109250a(R.id.blockerAvatar), 32, 32, l.getAvatarKey(), l.getChatterId(), null);
        if (C30022a.f74883b.mo112710r()) {
            CalendarEventCreator m = aVar.mo117246m();
            if (m == null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) mo109250a(R.id.eventCreatorZone);
                Intrinsics.checkExpressionValueIsNotNull(constraintLayout, "eventCreatorZone");
                constraintLayout.setVisibility(8);
            } else if (Intrinsics.areEqual(m.getChatterId(), l.getChatterId())) {
                ConstraintLayout constraintLayout2 = (ConstraintLayout) mo109250a(R.id.eventCreatorZone);
                Intrinsics.checkExpressionValueIsNotNull(constraintLayout2, "eventCreatorZone");
                constraintLayout2.setVisibility(8);
            } else {
                ConstraintLayout constraintLayout3 = (ConstraintLayout) mo109250a(R.id.eventCreatorZone);
                Intrinsics.checkExpressionValueIsNotNull(constraintLayout3, "eventCreatorZone");
                constraintLayout3.setVisibility(0);
                String a2 = C30022a.f74882a.utilsDependency().mo108195a(R.string.Calendar_Detail_CreatedBy, "creator", m.getName());
                TextView textView6 = (TextView) mo109250a(R.id.eventCreatorTV);
                Intrinsics.checkExpressionValueIsNotNull(textView6, "eventCreatorTV");
                textView6.setText(a2);
            }
        } else {
            ConstraintLayout constraintLayout4 = (ConstraintLayout) mo109250a(R.id.eventCreatorZone);
            Intrinsics.checkExpressionValueIsNotNull(constraintLayout4, "eventCreatorZone");
            constraintLayout4.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m122223g();
        m122224h();
        m122225i();
        mo117251b().loadMeetingRoomInfo();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_calendar_meetingroom_content, viewGroup, false);
    }

    /* renamed from: a */
    public final void mo117248a(View view, TextView textView, String str) {
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
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.profile.a.b$e */
    public static final class C32137e implements ObservedScrollView.AbstractC26173a {

        /* renamed from: a */
        final /* synthetic */ ProfileContentFragment f82157a;

        C32137e(ProfileContentFragment bVar) {
            this.f82157a = bVar;
        }

        @Override // com.larksuite.framework.ui.ObservedScrollView.AbstractC26173a
        /* renamed from: a */
        public final void mo93133a(int i, int i2, int i3, int i4) {
            ObservedScrollView observedScrollView = (ObservedScrollView) this.f82157a.mo109250a(R.id.rootScrollView);
            Intrinsics.checkExpressionValueIsNotNull(observedScrollView, "rootScrollView");
            int scrollY = observedScrollView.getScrollY();
            RelativeLayout relativeLayout = (RelativeLayout) this.f82157a.mo109250a(R.id.meetingRoomBaseInfoContainer);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "meetingRoomBaseInfoContainer");
            if (scrollY >= relativeLayout.getHeight()) {
                ((CommonTitleBar) this.f82157a.mo109250a(R.id.titleBar)).setCenterViewVisible(0);
            } else {
                ((CommonTitleBar) this.f82157a.mo109250a(R.id.titleBar)).setCenterViewVisible(8);
            }
        }
    }
}
