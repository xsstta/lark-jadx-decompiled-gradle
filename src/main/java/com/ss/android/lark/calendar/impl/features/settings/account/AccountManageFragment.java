package com.ss.android.lark.calendar.impl.features.settings.account;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendars.importcalendar.ImportCalendarActivity;
import com.ss.android.lark.calendar.impl.features.calendars.importcalendar.widget.ExchangeLoginFragment;
import com.ss.android.lark.calendar.impl.features.settings.account.AccountManagePresenter;
import com.ss.android.lark.desktopmode.base.FloatWindowParams;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000g\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u000b\u0018\u0000 02\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002/0B\u0005¢\u0006\u0002\u0010\u0003J\"\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0006\u0010$\u001a\u00020\u001eJ&\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\b\u0010-\u001a\u00020\u001eH\u0016J\u001a\u0010.\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00020&2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0004\n\u0002\u0010\fR\u001b\u0010\r\u001a\u00020\u000e8BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001a\u0010\u001b¨\u00061"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountManageFragment;", "Lcom/ss/android/lark/desktopmode/app/DesktopCompatFragment;", "Lcom/ss/android/lark/desktopmode/base/FloatWindowParams;", "()V", "activityDependency", "Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountManageFragment$ActivityDependency;", "getActivityDependency", "()Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountManageFragment$ActivityDependency;", "setActivityDependency", "(Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountManageFragment$ActivityDependency;)V", "fragmentDependency", "com/ss/android/lark/calendar/impl/features/settings/account/AccountManageFragment$fragmentDependency$1", "Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountManageFragment$fragmentDependency$1;", "model", "Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountManageModel;", "getModel", "()Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountManageModel;", "model$delegate", "Lkotlin/Lazy;", "presenter", "Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountManagePresenter;", "getPresenter", "()Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountManagePresenter;", "presenter$delegate", "view", "Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountManageView;", "getView", "()Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountManageView;", "view$delegate", "onActivityResult", "", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onBackPressed", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onViewCreated", "ActivityDependency", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.settings.account.d */
public final class AccountManageFragment extends C36516a<FloatWindowParams> {

    /* renamed from: b */
    public static final Companion f83044b = new Companion(null);

    /* renamed from: a */
    public final C32405c f83045a = new C32405c(this);

    /* renamed from: c */
    private final Lazy f83046c = LazyKt.lazy(new C32408f(this));

    /* renamed from: d */
    private final Lazy f83047d = LazyKt.lazy(C32406d.INSTANCE);

    /* renamed from: e */
    private final Lazy f83048e = LazyKt.lazy(new C32407e(this));

    /* renamed from: f */
    private ActivityDependency f83049f;

    /* renamed from: g */
    private HashMap f83050g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountManageFragment$ActivityDependency;", "", "getActivity", "Landroid/app/Activity;", "updateStatusBarColor", "", "colorRes", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.settings.account.d$a */
    public interface ActivityDependency {
        /* renamed from: a */
        Activity mo118396a();

        /* renamed from: a */
        void mo118397a(int i);
    }

    /* renamed from: f */
    private final AccountManagePresenter m123697f() {
        return (AccountManagePresenter) this.f83048e.getValue();
    }

    /* renamed from: a */
    public View mo118435a(int i) {
        if (this.f83050g == null) {
            this.f83050g = new HashMap();
        }
        View view = (View) this.f83050g.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f83050g.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final AccountManageView mo118436a() {
        return (AccountManageView) this.f83046c.getValue();
    }

    /* renamed from: b */
    public final AccountManageModel mo118438b() {
        return (AccountManageModel) this.f83047d.getValue();
    }

    /* renamed from: e */
    public void mo118441e() {
        HashMap hashMap = this.f83050g;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo118441e();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountManageFragment$Companion;", "", "()V", "REQUEST_IMPORT_CALENDAR", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.settings.account.d$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: c */
    public final ActivityDependency mo118439c() {
        return this.f83049f;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010\u000b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/calendar/impl/features/settings/account/AccountManageFragment$fragmentDependency$1", "Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountManagePresenter$FragmentDependency;", "addFragment", "", "fragment", "Landroidx/fragment/app/Fragment;", "containerId", "", "finishActivity", "getActivityContext", "Landroid/app/Activity;", "hideFragment", "showFragment", "showImportCalendar", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.settings.account.d$c */
    public static final class C32405c implements AccountManagePresenter.FragmentDependency {

        /* renamed from: a */
        final /* synthetic */ AccountManageFragment f83051a;

        @Override // com.ss.android.lark.calendar.impl.features.settings.account.AccountManagePresenter.FragmentDependency
        /* renamed from: b */
        public void mo118445b() {
            this.f83051a.finish();
        }

        @Override // com.ss.android.lark.calendar.impl.features.settings.account.AccountManagePresenter.FragmentDependency
        /* renamed from: a */
        public Activity mo118442a() {
            ActivityDependency c = this.f83051a.mo118439c();
            if (c != null) {
                return c.mo118396a();
            }
            return null;
        }

        @Override // com.ss.android.lark.calendar.impl.features.settings.account.AccountManagePresenter.FragmentDependency
        /* renamed from: c */
        public void mo118447c() {
            Context context = this.f83051a.getContext();
            if (context != null) {
                this.f83051a.startActivityForResult(new Intent(context, ImportCalendarActivity.class), 1);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32405c(AccountManageFragment dVar) {
            this.f83051a = dVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.settings.account.AccountManagePresenter.FragmentDependency
        /* renamed from: a */
        public void mo118443a(Fragment fragment) {
            ActivityDependency c;
            Intrinsics.checkParameterIsNotNull(fragment, "fragment");
            this.f83051a.getChildFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_right_in, R.anim.slide_right_out).show(fragment).commitAllowingStateLoss();
            this.f83051a.getChildFragmentManager().executePendingTransactions();
            if ((fragment instanceof ExchangeLoginFragment) && (c = this.f83051a.mo118439c()) != null) {
                c.mo118397a(R.color.bg_body);
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.settings.account.AccountManagePresenter.FragmentDependency
        /* renamed from: b */
        public void mo118446b(Fragment fragment) {
            ActivityDependency c;
            if (fragment != null) {
                this.f83051a.getChildFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_right_in, R.anim.slide_right_out).hide(fragment).commitAllowingStateLoss();
                this.f83051a.getChildFragmentManager().executePendingTransactions();
            }
            if ((fragment instanceof ExchangeLoginFragment) && (c = this.f83051a.mo118439c()) != null) {
                c.mo118397a(R.color.bg_base);
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.settings.account.AccountManagePresenter.FragmentDependency
        /* renamed from: a */
        public void mo118444a(Fragment fragment, int i) {
            ActivityDependency c;
            if (fragment != null) {
                this.f83051a.getChildFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_right_in, R.anim.slide_right_out).add(i, fragment, (String) null).commitAllowingStateLoss();
                this.f83051a.getChildFragmentManager().executePendingTransactions();
            }
            if ((fragment instanceof ExchangeLoginFragment) && (c = this.f83051a.mo118439c()) != null) {
                c.mo118397a(R.color.bg_body);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountManageModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.settings.account.d$d */
    static final class C32406d extends Lambda implements Function0<AccountManageModel> {
        public static final C32406d INSTANCE = new C32406d();

        C32406d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AccountManageModel invoke() {
            return new AccountManageModel();
        }
    }

    /* renamed from: d */
    public final void mo118440d() {
        m123697f().mo118456c();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        m123697f().destroy();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountManagePresenter;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.settings.account.d$e */
    static final class C32407e extends Lambda implements Function0<AccountManagePresenter> {
        final /* synthetic */ AccountManageFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32407e(AccountManageFragment dVar) {
            super(0);
            this.this$0 = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final AccountManagePresenter invoke() {
            return new AccountManagePresenter(this.this$0.mo118438b(), this.this$0.mo118436a(), this.this$0.f83045a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountManageView;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.settings.account.d$f */
    static final class C32408f extends Lambda implements Function0<AccountManageView> {
        final /* synthetic */ AccountManageFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32408f(AccountManageFragment dVar) {
            super(0);
            this.this$0 = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final AccountManageView invoke() {
            FrameLayout frameLayout = (FrameLayout) this.this$0.mo118435a(R.id.activityRoot);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout, "activityRoot");
            FrameLayout frameLayout2 = (FrameLayout) this.this$0.mo118435a(R.id.activityRoot);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout2, "activityRoot");
            Context context = frameLayout2.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "activityRoot.context");
            return new AccountManageView(frameLayout, context);
        }
    }

    /* renamed from: a */
    public final void mo118437a(ActivityDependency aVar) {
        this.f83049f = aVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        m123697f().create();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        m123697f().mo118452a(i, i2, intent);
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.activity_calendar_account, viewGroup, false);
    }
}
