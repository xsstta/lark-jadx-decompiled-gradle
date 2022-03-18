package com.ss.android.lark.calendar.impl.features.calendars.share.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.lark.pb.calendar.v1.Calendar;
import com.bytedance.lark.pb.calendar.v1.CalendarTenantInfo;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendars.share.fragment.CalendarEditShareOptionFragment;
import com.ss.android.lark.calendar.impl.features.calendars.share.fragment.listener.IShareOptionDelegate;
import com.ss.android.lark.calendar.impl.features.calendars.share.fragment.listener.IShareOptionFragmentData;
import com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.utils.StatusBarUtil;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n*\u0001\f\u0018\u0000 -2\u00020\u0001:\u0001-B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0013H\u0002J\u0012\u0010\u001a\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\b\u0010\u001b\u001a\u00020\u0013H\u0002J\u0006\u0010\u001c\u001a\u00020\bJ&\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u001a\u0010%\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\u001e2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010'\u001a\u00020\u0013H\u0002J\u0006\u0010(\u001a\u00020\u0013J\b\u0010)\u001a\u00020\u0013H\u0002J\u0010\u0010*\u001a\u00020\u00132\u0006\u0010+\u001a\u00020\bH\u0002J\u0012\u0010,\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0004\n\u0002\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/share/fragment/CalendarShareOptionFragment;", "Lcom/ss/android/lark/calendar/impl/framework/components/CalendarBaseFragment;", "()V", "calendarTenantName", "", "getCalendarTenantName", "()Ljava/lang/String;", "isShowCalendarEditShareOptionFragment", "", "mCalendarEditShareOptionFragment", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/fragment/CalendarEditShareOptionFragment;", "mEditShareOptionCallback", "com/ss/android/lark/calendar/impl/features/calendars/share/fragment/CalendarShareOptionFragment$mEditShareOptionCallback$1", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/fragment/CalendarShareOptionFragment$mEditShareOptionCallback$1;", "shareOptionDelegate", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/fragment/listener/IShareOptionDelegate;", "shareOptionFragmentData", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/fragment/listener/IShareOptionFragmentData;", "addFragment", "", "fragment", "Landroidx/fragment/app/Fragment;", "getShareOptionText", "shareOption", "Lcom/bytedance/lark/pb/calendar/v1/Calendar$ShareOption;", "hideCalendarEditShareOptionFragment", "hideFragment", "initView", "onBackPressed", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "refreshView", "setData", "setListener", "showCalendarEditShareFragment", "isCrossTenant", "showFragment", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.b.f */
public final class CalendarShareOptionFragment extends CalendarBaseFragment {

    /* renamed from: c */
    public static final Companion f76294c = new Companion(null);

    /* renamed from: a */
    public IShareOptionFragmentData f76295a;

    /* renamed from: b */
    public IShareOptionDelegate f76296b;

    /* renamed from: d */
    private CalendarEditShareOptionFragment f76297d;

    /* renamed from: e */
    private boolean f76298e;

    /* renamed from: f */
    private final C30492b f76299f = new C30492b(this);

    /* renamed from: g */
    private HashMap f76300g;

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public View mo109250a(int i) {
        if (this.f76300g == null) {
            this.f76300g = new HashMap();
        }
        View view = (View) this.f76300g.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f76300g.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public void mo109251a() {
        HashMap hashMap = this.f76300g;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment, com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo109251a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/share/fragment/CalendarShareOptionFragment$Companion;", "", "()V", "newInstance", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/fragment/CalendarShareOptionFragment;", "shareOptionFragmentData", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/fragment/listener/IShareOptionFragmentData;", "shareOptionDelegate", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/fragment/listener/IShareOptionDelegate;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.b.f$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final CalendarShareOptionFragment mo110001a(IShareOptionFragmentData dVar, IShareOptionDelegate cVar) {
            Intrinsics.checkParameterIsNotNull(dVar, "shareOptionFragmentData");
            Intrinsics.checkParameterIsNotNull(cVar, "shareOptionDelegate");
            CalendarShareOptionFragment fVar = new CalendarShareOptionFragment();
            fVar.f76295a = dVar;
            fVar.f76296b = cVar;
            return fVar;
        }
    }

    /* renamed from: c */
    public final void mo109997c() {
        mo109998d();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/share/fragment/CalendarShareOptionFragment$mEditShareOptionCallback$1", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/fragment/CalendarEditShareOptionFragment$EditShareOptionCallback;", "hideFragment", "", "onEditCalendarShareOptions", "newShareOptions", "Lcom/bytedance/lark/pb/calendar/v1/Calendar$CalendarShareOptions;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.b.f$b */
    public static final class C30492b implements CalendarEditShareOptionFragment.EditShareOptionCallback {

        /* renamed from: a */
        final /* synthetic */ CalendarShareOptionFragment f76301a;

        @Override // com.ss.android.lark.calendar.impl.features.calendars.share.fragment.CalendarEditShareOptionFragment.EditShareOptionCallback
        /* renamed from: a */
        public void mo109974a() {
            this.f76301a.mo110000f();
            this.f76301a.mo109998d();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30492b(CalendarShareOptionFragment fVar) {
            this.f76301a = fVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.share.fragment.CalendarEditShareOptionFragment.EditShareOptionCallback
        /* renamed from: a */
        public void mo109975a(Calendar.CalendarShareOptions calendarShareOptions) {
            Intrinsics.checkParameterIsNotNull(calendarShareOptions, "newShareOptions");
            IShareOptionDelegate cVar = this.f76301a.f76296b;
            if (cVar != null) {
                cVar.mo109365a(calendarShareOptions);
            }
            this.f76301a.mo109998d();
        }
    }

    /* renamed from: e */
    public final boolean mo109999e() {
        if (!this.f76298e) {
            return false;
        }
        CalendarEditShareOptionFragment cVar = this.f76297d;
        if (cVar == null) {
            return true;
        }
        cVar.mo109972d();
        return true;
    }

    /* renamed from: f */
    public final void mo110000f() {
        m113307c(this.f76297d);
        this.f76298e = false;
    }

    /* renamed from: b */
    public final String mo109996b() {
        CalendarTenantInfo c;
        String str;
        IShareOptionFragmentData dVar = this.f76295a;
        if (dVar == null || (c = dVar.mo109362c()) == null || (str = c.tenant_name) == null) {
            return "";
        }
        return str;
    }

    /* renamed from: h */
    private final void m113309h() {
        ((RelativeLayout) mo109250a(R.id.tenantContainer)).setOnClickListener(new View$OnClickListenerC30493c(this));
        ((RelativeLayout) mo109250a(R.id.crossTenantContainer)).setOnClickListener(new View$OnClickListenerC30494d(this));
        ((CommonTitleBar) mo109250a(R.id.calendarShareOptionTitleBar)).setLeftClickListener(new View$OnClickListenerC30495e(this));
    }

    /* renamed from: g */
    private final void m113308g() {
        m113309h();
        TextView textView = (TextView) mo109250a(R.id.tenantTipTv);
        Intrinsics.checkExpressionValueIsNotNull(textView, "tenantTipTv");
        textView.setText(C30022a.f74882a.utilsDependency().mo108195a(R.string.Calendar_Share_InternalSharingPermissionsTitle, "Org", mo109996b()));
        TextView textView2 = (TextView) mo109250a(R.id.crossTenantTipTv);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "crossTenantTipTv");
        textView2.setText(C30022a.f74882a.utilsDependency().mo108195a(R.string.Calendar_Share_ExternalSharingPermissionsTitle, "Org", mo109996b()));
        View a = mo109250a(R.id.titlePaddingView);
        Intrinsics.checkExpressionValueIsNotNull(a, "titlePaddingView");
        ViewGroup.LayoutParams layoutParams = a.getLayoutParams();
        View a2 = mo109250a(R.id.titlePaddingView);
        Intrinsics.checkExpressionValueIsNotNull(a2, "titlePaddingView");
        layoutParams.height = StatusBarUtil.getStatusBarHeight(a2.getContext());
        View a3 = mo109250a(R.id.titlePaddingView);
        Intrinsics.checkExpressionValueIsNotNull(a3, "titlePaddingView");
        a3.setLayoutParams(layoutParams);
    }

    /* renamed from: d */
    public final void mo109998d() {
        Calendar.CalendarShareOptions b;
        IShareOptionFragmentData dVar = this.f76295a;
        if (dVar != null && (b = dVar.mo109361b()) != null) {
            TextView textView = (TextView) mo109250a(R.id.tenantPermissionTv);
            Intrinsics.checkExpressionValueIsNotNull(textView, "tenantPermissionTv");
            Calendar.ShareOption shareOption = b.default_share_option;
            Intrinsics.checkExpressionValueIsNotNull(shareOption, "shareOption.default_share_option");
            textView.setText(m113304a(shareOption));
            TextView textView2 = (TextView) mo109250a(R.id.crossTenantPermissionTv);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "crossTenantPermissionTv");
            Calendar.ShareOption shareOption2 = b.cross_default_share_option;
            Intrinsics.checkExpressionValueIsNotNull(shareOption2, "shareOption.cross_default_share_option");
            textView2.setText(m113304a(shareOption2));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.b.f$c */
    public static final class View$OnClickListenerC30493c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarShareOptionFragment f76302a;

        View$OnClickListenerC30493c(CalendarShareOptionFragment fVar) {
            this.f76302a = fVar;
        }

        public final void onClick(View view) {
            this.f76302a.mo109995a(false);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.b.f$d */
    public static final class View$OnClickListenerC30494d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarShareOptionFragment f76303a;

        View$OnClickListenerC30494d(CalendarShareOptionFragment fVar) {
            this.f76303a = fVar;
        }

        public final void onClick(View view) {
            this.f76303a.mo109995a(true);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.b.f$e */
    public static final class View$OnClickListenerC30495e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarShareOptionFragment f76304a;

        View$OnClickListenerC30495e(CalendarShareOptionFragment fVar) {
            this.f76304a = fVar;
        }

        public final void onClick(View view) {
            IShareOptionDelegate cVar = this.f76304a.f76296b;
            if (cVar != null) {
                cVar.mo109364a();
            }
        }
    }

    /* renamed from: a */
    private final String m113304a(Calendar.ShareOption shareOption) {
        int i;
        int i2 = C30496g.f76305a[shareOption.ordinal()];
        if (i2 == 1) {
            i = R.string.Calendar_Share_Guest_Option;
        } else if (i2 != 2) {
            i = R.string.Calendar_Share_Private_Option;
        } else {
            i = R.string.Calendar_Share_Follower_Option;
        }
        String b = C32634ae.m125182b(i);
        Intrinsics.checkExpressionValueIsNotNull(b, "ResUtil.getString(stringId)");
        return b;
    }

    /* renamed from: b */
    private final void m113306b(Fragment fragment) {
        if (fragment != null) {
            getChildFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_right_in, R.anim.slide_right_out).show(fragment).commitAllowingStateLoss();
            getChildFragmentManager().executePendingTransactions();
        }
    }

    /* renamed from: c */
    private final void m113307c(Fragment fragment) {
        if (fragment != null) {
            getChildFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_right_in, R.anim.slide_right_out).hide(fragment).commitAllowingStateLoss();
            getChildFragmentManager().executePendingTransactions();
        }
    }

    /* renamed from: a */
    private final void m113305a(Fragment fragment) {
        if (fragment != null) {
            getChildFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_right_in, R.anim.slide_right_out).add(R.id.childFragmentContainer, fragment, (String) null).commitAllowingStateLoss();
            getChildFragmentManager().executePendingTransactions();
        }
    }

    /* renamed from: a */
    public final void mo109995a(boolean z) {
        IShareOptionFragmentData dVar = this.f76295a;
        if (dVar != null) {
            CalendarEditShareOptionFragment cVar = this.f76297d;
            if (cVar != null) {
                cVar.mo109968a(z);
                m113306b(this.f76297d);
            } else {
                CalendarEditShareOptionFragment a = CalendarEditShareOptionFragment.f76257f.mo109973a(dVar, z, this.f76299f);
                this.f76297d = a;
                m113305a(a);
            }
            this.f76298e = true;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        if (this.f76295a != null) {
            m113308g();
            mo109998d();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_calendar_default_share_permission, (ViewGroup) null);
    }
}
