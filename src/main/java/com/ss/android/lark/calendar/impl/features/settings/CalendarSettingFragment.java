package com.ss.android.lark.calendar.impl.features.settings;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import butterknife.ButterKnife;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.settings.AbstractC32460d;
import com.ss.android.lark.calendar.impl.features.settings.C32447c;
import com.ss.android.lark.calendar.impl.features.settings.CalendarSettingView;
import com.ss.android.lark.calendar.impl.features.settings.account.AccountManageActivity;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.desktopmode.base.MainWindowParams;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000O\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0005\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\nH\u0002J\"\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0006\u0010\u0011\u001a\u00020\nJ&\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001a\u001a\u00020\nH\u0016J\b\u0010\u001b\u001a\u00020\nH\u0016J\u001a\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016R\u0010\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/settings/CalendarSettingFragment;", "Lcom/ss/android/lark/desktopmode/app/DesktopCompatFragment;", "Lcom/ss/android/lark/desktopmode/base/MainWindowParams;", "()V", "mFragmentDependency", "com/ss/android/lark/calendar/impl/features/settings/CalendarSettingFragment$mFragmentDependency$1", "Lcom/ss/android/lark/calendar/impl/features/settings/CalendarSettingFragment$mFragmentDependency$1;", "mPresenter", "Lcom/ss/android/lark/calendar/impl/features/settings/CalendarSettingPresenter;", "initMVP", "", "onActivityResult", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onBackPressed", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onResume", "onViewCreated", "view", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.settings.a */
public final class CalendarSettingFragment extends C36516a<MainWindowParams> {

    /* renamed from: a */
    public static final Companion f82996a = new Companion(null);

    /* renamed from: b */
    private C32447c f82997b;

    /* renamed from: c */
    private final C32396c f82998c = new C32396c(this);

    /* renamed from: d */
    private HashMap f82999d;

    /* renamed from: b */
    public void mo118367b() {
        HashMap hashMap = this.f82999d;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo118367b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/settings/CalendarSettingFragment$Companion;", "", "()V", "GOOGLE_CALENDAR_RESULT_CODE", "", "TAB_KEY_SYSTEM_SETTING", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.settings.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/calendar/impl/features/settings/CalendarSettingFragment$initMVP$view$1", "Lcom/ss/android/lark/calendar/impl/features/settings/CalendarSettingView$ViewDependency;", "finishActivity", "", "injectView", "view", "Lcom/ss/android/lark/calendar/impl/features/settings/ISettingContract$IEventDetailView;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.settings.a$b */
    public static final class C32395b implements CalendarSettingView.AbstractC32381a {

        /* renamed from: a */
        final /* synthetic */ CalendarSettingFragment f83000a;

        @Override // com.ss.android.lark.calendar.impl.features.settings.CalendarSettingView.AbstractC32381a
        /* renamed from: a */
        public void mo118283a() {
            this.f83000a.finish();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32395b(CalendarSettingFragment aVar) {
            this.f83000a = aVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.settings.CalendarSettingView.AbstractC32381a
        /* renamed from: a */
        public void mo118284a(AbstractC32460d.AbstractC32463b bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "view");
            View view = this.f83000a.getView();
            if (view != null) {
                ButterKnife.bind(bVar, view);
            }
        }
    }

    /* renamed from: a */
    public final void mo118366a() {
        C32447c cVar = this.f82997b;
        if (cVar != null) {
            cVar.mo118552c();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C32447c cVar = this.f82997b;
        if (cVar != null) {
            cVar.destroy();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        C32447c cVar = this.f82997b;
        if (cVar != null) {
            cVar.mo118553d();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¨\u0006\u0010"}, d2 = {"com/ss/android/lark/calendar/impl/features/settings/CalendarSettingFragment$mFragmentDependency$1", "Lcom/ss/android/lark/calendar/impl/features/settings/CalendarSettingPresenter$FragmentDependency;", "addFragment", "", "fragment", "Landroidx/fragment/app/Fragment;", "containerId", "", "isShowInThinDrawer", "", "hideFragment", "onShowAccountManage", "showFragment", "startActivityByIntent", "intent", "Landroid/content/Intent;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.settings.a$c */
    public static final class C32396c implements C32447c.AbstractC32456a {

        /* renamed from: a */
        final /* synthetic */ CalendarSettingFragment f83001a;

        @Override // com.ss.android.lark.calendar.impl.features.settings.C32447c.AbstractC32456a
        /* renamed from: a */
        public void mo118368a() {
            Context context = this.f83001a.getContext();
            if (context != null) {
                C30022a.f74882a.appRouter().mo108210a(AccountManageActivity.class).mo108156b(context);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32396c(CalendarSettingFragment aVar) {
            this.f83001a = aVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.settings.C32447c.AbstractC32456a
        /* renamed from: a */
        public void mo118369a(Intent intent) {
            Intrinsics.checkParameterIsNotNull(intent, "intent");
            this.f83001a.startActivity(intent);
        }

        @Override // com.ss.android.lark.calendar.impl.features.settings.C32447c.AbstractC32456a
        /* renamed from: b */
        public void mo118372b(Fragment fragment, boolean z) {
            Intrinsics.checkParameterIsNotNull(fragment, "fragment");
            this.f83001a.getChildFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_right_in, R.anim.slide_right_out).hide(fragment).commitAllowingStateLoss();
            this.f83001a.getChildFragmentManager().executePendingTransactions();
        }

        @Override // com.ss.android.lark.calendar.impl.features.settings.C32447c.AbstractC32456a
        /* renamed from: a */
        public void mo118371a(Fragment fragment, boolean z) {
            Intrinsics.checkParameterIsNotNull(fragment, "fragment");
            this.f83001a.getChildFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_right_in, R.anim.slide_right_out).show(fragment).commitAllowingStateLoss();
            this.f83001a.getChildFragmentManager().executePendingTransactions();
        }

        @Override // com.ss.android.lark.calendar.impl.features.settings.C32447c.AbstractC32456a
        /* renamed from: a */
        public void mo118370a(Fragment fragment, int i, boolean z) {
            Intrinsics.checkParameterIsNotNull(fragment, "fragment");
            this.f83001a.getChildFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_right_in, R.anim.slide_right_out).add(i, fragment, (String) null).commitAllowingStateLoss();
            this.f83001a.getChildFragmentManager().executePendingTransactions();
        }
    }

    /* renamed from: c */
    private final void m123621c() {
        Bundle arguments = getArguments();
        boolean z = false;
        if (arguments != null) {
            z = arguments.getBoolean("calendar_setting_is_launched_by_system_setting", false);
        }
        C32447c cVar = new C32447c(new C32430b(), new CalendarSettingView(getContext(), new C32395b(this), z), this.f82998c);
        this.f82997b = cVar;
        if (cVar != null) {
            cVar.create();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        m123621c();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.activity_calendar_setting, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        C32447c cVar;
        if (i2 == 0 && (cVar = this.f82997b) != null) {
            boolean z = false;
            if (intent != null) {
                z = intent.getBooleanExtra("isBinding", false);
            }
            cVar.mo118550a(z);
        }
    }
}
