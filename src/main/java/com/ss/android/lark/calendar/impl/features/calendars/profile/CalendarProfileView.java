package com.ss.android.lark.calendar.impl.features.calendars.profile;

import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1144ai;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.calendar.impl.features.calendars.profile.CalendarProfileActivity;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.RequestLoadingDialog;
import com.ss.android.lark.calendar.impl.features.events.edit.widget.CalendarLoadingView;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 &2\u00020\u0001:\u0001&B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0006\u0010\u0017\u001a\u00020\u0018J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u0018H\u0002J\b\u0010\u001e\u001a\u00020\u0018H\u0002J\b\u0010\u001f\u001a\u00020\u0018H\u0002J\b\u0010 \u001a\u00020\u0018H\u0002J\u0010\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020\u0018H\u0002J\b\u0010%\u001a\u00020\u0018H\u0002R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00148BX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/profile/CalendarProfileView;", "", "rootView", "Landroid/view/View;", "activity", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "activityDependency", "Lcom/ss/android/lark/calendar/impl/features/calendars/profile/CalendarProfileActivity$ActivityDependency;", "viewModelProvider", "Landroidx/lifecycle/ViewModelProvider;", "(Landroid/view/View;Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;Lcom/ss/android/lark/calendar/impl/features/calendars/profile/CalendarProfileActivity$ActivityDependency;Landroidx/lifecycle/ViewModelProvider;)V", "getActivity", "()Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "getActivityDependency", "()Lcom/ss/android/lark/calendar/impl/features/calendars/profile/CalendarProfileActivity$ActivityDependency;", "mLoadingToast", "Lcom/ss/android/lark/calendar/impl/features/calendarview/widget/RequestLoadingDialog;", "getRootView", "()Landroid/view/View;", "viewModel", "Lcom/ss/android/lark/calendar/impl/features/calendars/profile/CalendarProfileViewModel;", "getViewModel", "()Lcom/ss/android/lark/calendar/impl/features/calendars/profile/CalendarProfileViewModel;", "create", "", "getCreatorShowText", "", "creatorName", "", "initLiveData", "initLoadingLiveData", "initView", "showPrivateCalendarView", "updateProfileBottomBtn", "calendar", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "updateRouteCalendarViewStyle", "updateSubscribeStyle", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.profile.b */
public final class CalendarProfileView {

    /* renamed from: b */
    public static final Companion f76062b = new Companion(null);

    /* renamed from: a */
    public RequestLoadingDialog f76063a;

    /* renamed from: c */
    private final View f76064c;

    /* renamed from: d */
    private final BaseFragmentActivity f76065d;

    /* renamed from: e */
    private final CalendarProfileActivity.ActivityDependency f76066e;

    /* renamed from: f */
    private final C1144ai f76067f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/profile/CalendarProfileView$Companion;", "", "()V", "TOAST_HEIGHT", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.profile.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: d */
    public final View mo109680d() {
        return this.f76064c;
    }

    /* renamed from: e */
    public final BaseFragmentActivity mo109681e() {
        return this.f76065d;
    }

    /* renamed from: f */
    public final CalendarProfileActivity.ActivityDependency mo109682f() {
        return this.f76066e;
    }

    /* renamed from: b */
    public final void mo109678b() {
        m112922g();
        m112923h();
    }

    /* renamed from: a */
    public final CalendarProfileViewModel mo109675a() {
        AbstractC1142af a = this.f76067f.mo6005a(CalendarProfileViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(a, "viewModelProvider.get(Ca…ileViewModel::class.java)");
        return (CalendarProfileViewModel) a;
    }

    /* renamed from: h */
    private final void m112923h() {
        m112924i();
        mo109675a().getCalendarLiveData().mo5923a(this.f76065d, new C30374b(this));
        mo109675a().getCreatorLiveData().mo5923a(this.f76065d, new C30375c(this));
    }

    /* renamed from: j */
    private final void m112925j() {
        TextView textView = (TextView) this.f76064c.findViewById(R.id.profileBottomBt);
        textView.setText(C32634ae.m125182b(R.string.Calendar_Calendar_SubscribeToCalendarButton));
        textView.setTextColor(C32634ae.m125178a(R.color.ud_neutral_color_1));
        textView.setOnClickListener(new View$OnClickListenerC30381i(this));
        textView.setBackground(C32634ae.m125184d(R.drawable.bg_calendar_profile_subscribe_btn));
    }

    /* renamed from: k */
    private final void m112926k() {
        TextView textView = (TextView) this.f76064c.findViewById(R.id.profileBottomBt);
        textView.setText(C32634ae.m125182b(R.string.Calendar_Calendar_ViewCalendarButton));
        textView.setTextColor(C32634ae.m125178a(R.color.ud_neutral_color_12));
        textView.setBackground(C32634ae.m125184d(R.drawable.bg_calendar_profile_route_calendar_view));
        textView.setOnClickListener(new View$OnClickListenerC30380h(this));
    }

    /* renamed from: g */
    private final void m112922g() {
        ((CommonTitleBar) this.f76064c.findViewById(R.id.titleBar)).setLeftImageResource(R.drawable.ic_svg_titlebar_close);
        ((CalendarLoadingView) this.f76064c.findViewById(R.id.loadingView)).setTitleBarVisibility(0);
        ((CalendarLoadingView) this.f76064c.findViewById(R.id.loadingView)).setTitleBarText(C32634ae.m125182b(R.string.Calendar_Calendar_CalendarDetails));
        ((CalendarLoadingView) this.f76064c.findViewById(R.id.loadingView)).setTitleLeftImageResource(R.drawable.ic_svg_titlebar_close);
        ((CalendarLoadingView) this.f76064c.findViewById(R.id.loadingView)).setTitleBarDividerVisibility(0);
    }

    /* renamed from: i */
    private final void m112924i() {
        mo109675a().getLoadingViewLiveData().mo5923a(this.f76065d, new C30376d(this));
        mo109675a().getLoadingViewErrLiveData().mo5923a(this.f76065d, new C30377e(this));
        mo109675a().getSubscribeToastLoadingLiveData().mo5923a(this.f76065d, new C30378f(this));
        mo109675a().getSubscribeToastLoadingErrLiveData().mo5923a(this.f76065d, new C30379g(this));
    }

    /* renamed from: c */
    public final void mo109679c() {
        CalendarLoadingView calendarLoadingView = (CalendarLoadingView) this.f76064c.findViewById(R.id.loadingView);
        Intrinsics.checkExpressionValueIsNotNull(calendarLoadingView, "rootView.loadingView");
        calendarLoadingView.setVisibility(0);
        ((CalendarLoadingView) this.f76064c.findViewById(R.id.loadingView)).setErrorTipPanel(C32634ae.m125184d(R.drawable.illustration_placeholder_common_no_preview));
        ((CalendarLoadingView) this.f76064c.findViewById(R.id.loadingView)).setErrorText(C32634ae.m125182b(R.string.Calendar_SubscribeCalendar_PrivateCalendarCannotBeSubscribed));
        ((CalendarLoadingView) this.f76064c.findViewById(R.id.loadingView)).mo116405c();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.profile.b$g */
    public static final class C30379g<T> implements AbstractC1178x<Object> {

        /* renamed from: a */
        final /* synthetic */ CalendarProfileView f76073a;

        C30379g(CalendarProfileView bVar) {
            this.f76073a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1178x
        public final void onChanged(Object obj) {
            RequestLoadingDialog requestLoadingDialog = this.f76073a.f76063a;
            if (requestLoadingDialog != null) {
                requestLoadingDialog.mo112592c(R.string.Calendar_SubscribeCalendar_OperationFailed);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/calendar/impl/features/calendars/profile/CalendarProfileView$updateRouteCalendarViewStyle$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.profile.b$h */
    public static final class View$OnClickListenerC30380h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarProfileView f76074a;

        View$OnClickListenerC30380h(CalendarProfileView bVar) {
            this.f76074a = bVar;
        }

        public final void onClick(View view) {
            this.f76074a.mo109682f().mo109674a();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/calendar/impl/features/calendars/profile/CalendarProfileView$updateSubscribeStyle$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.profile.b$i */
    public static final class View$OnClickListenerC30381i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarProfileView f76075a;

        View$OnClickListenerC30381i(CalendarProfileView bVar) {
            this.f76075a = bVar;
        }

        public final void onClick(View view) {
            this.f76075a.mo109675a().subscribeCalendar();
        }
    }

    /* renamed from: a */
    public final CharSequence mo109676a(String str) {
        String b = C32634ae.m125182b(R.string.Calendar_Calendar_Creator);
        return b + ": " + str;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.profile.b$e */
    public static final class C30377e<T> implements AbstractC1178x<Object> {

        /* renamed from: a */
        final /* synthetic */ CalendarProfileView f76071a;

        C30377e(CalendarProfileView bVar) {
            this.f76071a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1178x
        public final void onChanged(Object obj) {
            ((CalendarLoadingView) this.f76071a.mo109680d().findViewById(R.id.loadingView)).setErrorTipPanel(C32634ae.m125184d(R.drawable.illustration_empty_negative_load_failed));
            ((CalendarLoadingView) this.f76071a.mo109680d().findViewById(R.id.loadingView)).setErrorText(C32634ae.m125182b(R.string.Calendar_Common_FailedToLoad));
            ((CalendarLoadingView) this.f76071a.mo109680d().findViewById(R.id.loadingView)).mo116405c();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.profile.b$f */
    public static final class C30378f<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ CalendarProfileView f76072a;

        C30378f(CalendarProfileView bVar) {
            this.f76072a = bVar;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            Intrinsics.checkExpressionValueIsNotNull(bool, "it");
            if (bool.booleanValue()) {
                RequestLoadingDialog requestLoadingDialog = this.f76072a.f76063a;
                if (requestLoadingDialog != null) {
                    requestLoadingDialog.mo112585a(R.string.Calendar_Common_Loading);
                    return;
                }
                CalendarProfileView bVar = this.f76072a;
                RequestLoadingDialog requestLoadingDialog2 = new RequestLoadingDialog(this.f76072a.mo109681e());
                requestLoadingDialog2.mo112594e(SmActions.ACTION_ONTHECALL_EXIT);
                requestLoadingDialog2.mo112585a(R.string.Calendar_Common_Loading);
                bVar.f76063a = requestLoadingDialog2;
                return;
            }
            RequestLoadingDialog requestLoadingDialog3 = this.f76072a.f76063a;
            if (requestLoadingDialog3 != null) {
                requestLoadingDialog3.mo112593d(R.string.Calendar_Calendar_SubscribedToast);
            }
        }
    }

    /* renamed from: a */
    public final void mo109677a(Calendar calendar) {
        if (calendar.isSubscriber()) {
            m112926k();
        } else {
            m112925j();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "creatorName", "", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.profile.b$c */
    public static final class C30375c<T> implements AbstractC1178x<String> {

        /* renamed from: a */
        final /* synthetic */ CalendarProfileView f76069a;

        C30375c(CalendarProfileView bVar) {
            this.f76069a = bVar;
        }

        /* renamed from: a */
        public final void onChanged(String str) {
            boolean z;
            String str2 = str;
            if (str2 == null || str2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                TextView textView = (TextView) this.f76069a.mo109680d().findViewById(R.id.creatorTv);
                Intrinsics.checkExpressionValueIsNotNull(textView, "rootView.creatorTv");
                textView.setVisibility(8);
                return;
            }
            TextView textView2 = (TextView) this.f76069a.mo109680d().findViewById(R.id.creatorTv);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "rootView.creatorTv");
            textView2.setVisibility(0);
            TextView textView3 = (TextView) this.f76069a.mo109680d().findViewById(R.id.creatorTv);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "rootView.creatorTv");
            textView3.setText(this.f76069a.mo109676a(str));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.profile.b$d */
    public static final class C30376d<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ CalendarProfileView f76070a;

        C30376d(CalendarProfileView bVar) {
            this.f76070a = bVar;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            Intrinsics.checkExpressionValueIsNotNull(bool, "it");
            if (bool.booleanValue()) {
                CalendarLoadingView calendarLoadingView = (CalendarLoadingView) this.f76070a.mo109680d().findViewById(R.id.loadingView);
                Intrinsics.checkExpressionValueIsNotNull(calendarLoadingView, "rootView.loadingView");
                calendarLoadingView.setVisibility(0);
                ((CalendarLoadingView) this.f76070a.mo109680d().findViewById(R.id.loadingView)).mo116402a();
                return;
            }
            CalendarLoadingView calendarLoadingView2 = (CalendarLoadingView) this.f76070a.mo109680d().findViewById(R.id.loadingView);
            Intrinsics.checkExpressionValueIsNotNull(calendarLoadingView2, "rootView.loadingView");
            calendarLoadingView2.setVisibility(8);
            ((CalendarLoadingView) this.f76070a.mo109680d().findViewById(R.id.loadingView)).mo116404b();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.profile.b$b */
    public static final class C30374b<T> implements AbstractC1178x<Calendar> {

        /* renamed from: a */
        final /* synthetic */ CalendarProfileView f76068a;

        C30374b(CalendarProfileView bVar) {
            this.f76068a = bVar;
        }

        /* renamed from: a */
        public final void onChanged(Calendar calendar) {
            boolean z;
            if (this.f76068a.mo109675a().isPrivateAuthority()) {
                this.f76068a.mo109679c();
                return;
            }
            TextView textView = (TextView) this.f76068a.mo109680d().findViewById(R.id.calendarTitle);
            Intrinsics.checkExpressionValueIsNotNull(textView, "rootView.calendarTitle");
            Intrinsics.checkExpressionValueIsNotNull(calendar, "it");
            textView.setText(calendar.getSummary());
            TextView textView2 = (TextView) this.f76068a.mo109680d().findViewById(R.id.calendarDescriptionTv);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "rootView.calendarDescriptionTv");
            textView2.setText(calendar.getDescription());
            View findViewById = this.f76068a.mo109680d().findViewById(R.id.calendarInfoDivider);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "rootView.calendarInfoDivider");
            String description = calendar.getDescription();
            int i = 0;
            if (description == null || description.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i = 8;
            }
            findViewById.setVisibility(i);
            this.f76068a.mo109677a(calendar);
        }
    }

    public CalendarProfileView(View view, BaseFragmentActivity baseFragmentActivity, CalendarProfileActivity.ActivityDependency aVar, C1144ai aiVar) {
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        Intrinsics.checkParameterIsNotNull(baseFragmentActivity, "activity");
        Intrinsics.checkParameterIsNotNull(aVar, "activityDependency");
        Intrinsics.checkParameterIsNotNull(aiVar, "viewModelProvider");
        this.f76064c = view;
        this.f76065d = baseFragmentActivity;
        this.f76066e = aVar;
        this.f76067f = aiVar;
    }
}
