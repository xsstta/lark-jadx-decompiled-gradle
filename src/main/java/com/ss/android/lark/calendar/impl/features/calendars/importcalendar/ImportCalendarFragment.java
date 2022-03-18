package com.ss.android.lark.calendar.impl.features.calendars.importcalendar;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendars.importcalendar.ImportCalendarModel;
import com.ss.android.lark.calendar.impl.features.calendars.importcalendar.ImportCalendarPresenter;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u000b\u0018\u0000 02\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002/0B\u0005¢\u0006\u0002\u0010\u0003J\u0006\u0010\u001f\u001a\u00020 J&\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\b\u0010)\u001a\u00020 H\u0016J\u000e\u0010*\u001a\u00020 2\u0006\u0010+\u001a\u00020,J\u001a\u0010-\u001a\u00020 2\u0006\u0010\u001a\u001a\u00020\"2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\b\u0010.\u001a\u00020 H\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0004\n\u0002\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001c\u0010\u001d¨\u00061"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/ImportCalendarFragment;", "Lcom/ss/android/lark/desktopmode/app/DesktopCompatFragment;", "Lcom/ss/android/lark/desktopmode/base/FloatWindowParams;", "()V", "activityDependency", "Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/ImportCalendarFragment$ActivityDependency;", "getActivityDependency", "()Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/ImportCalendarFragment$ActivityDependency;", "setActivityDependency", "(Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/ImportCalendarFragment$ActivityDependency;)V", "fragmentDependency", "com/ss/android/lark/calendar/impl/features/calendars/importcalendar/ImportCalendarFragment$fragmentDependency$1", "Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/ImportCalendarFragment$fragmentDependency$1;", "mFromSource", "", "model", "Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/ImportCalendarModel;", "getModel", "()Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/ImportCalendarModel;", "model$delegate", "Lkotlin/Lazy;", "presenter", "Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/ImportCalendarPresenter;", "getPresenter", "()Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/ImportCalendarPresenter;", "presenter$delegate", "view", "Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/ImportCalendarView;", "getView", "()Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/ImportCalendarView;", "view$delegate", "onBackPressed", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onNewIntent", "intent", "Landroid/content/Intent;", "onViewCreated", "updateFromSource", "ActivityDependency", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.importcalendar.b */
public final class ImportCalendarFragment extends C36516a<FloatWindowParams> {

    /* renamed from: d */
    public static final Companion f75990d = new Companion(null);

    /* renamed from: a */
    public int f75991a = -1;

    /* renamed from: b */
    public ActivityDependency f75992b;

    /* renamed from: c */
    public final C30346c f75993c = new C30346c(this);

    /* renamed from: e */
    private final Lazy f75994e = LazyKt.lazy(new C30350g(this));

    /* renamed from: f */
    private final Lazy f75995f = LazyKt.lazy(C30347d.INSTANCE);

    /* renamed from: g */
    private final Lazy f75996g = LazyKt.lazy(new C30349f(this));

    /* renamed from: h */
    private HashMap f75997h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/ImportCalendarFragment$ActivityDependency;", "", "getActivity", "Landroid/app/Activity;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.importcalendar.b$a */
    public interface ActivityDependency {
        /* renamed from: a */
        Activity mo109596a();
    }

    /* renamed from: f */
    private final ImportCalendarPresenter m112839f() {
        return (ImportCalendarPresenter) this.f75996g.getValue();
    }

    /* renamed from: a */
    public View mo109613a(int i) {
        if (this.f75997h == null) {
            this.f75997h = new HashMap();
        }
        View view = (View) this.f75997h.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f75997h.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final ImportCalendarView mo109614a() {
        return (ImportCalendarView) this.f75994e.getValue();
    }

    /* renamed from: b */
    public final ImportCalendarModel mo109617b() {
        return (ImportCalendarModel) this.f75995f.getValue();
    }

    /* renamed from: e */
    public void mo109620e() {
        HashMap hashMap = this.f75997h;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo109620e();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bXT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/ImportCalendarFragment$Companion;", "", "()V", "FROM_SETTING", "", "FROM_SIDEBAR", "FROM_UNKNOW", "INTENT_PARAM_BINDED", "", "INTENT_PARAM_FORM_SIDEBAR", "INTENT_PARAM_FORM_WEB", "PATH_CALENDAR_IMPORT", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.importcalendar.b$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/ImportCalendarModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.importcalendar.b$d */
    static final class C30347d extends Lambda implements Function0<ImportCalendarModel> {
        public static final C30347d INSTANCE = new C30347d();

        C30347d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ImportCalendarModel invoke() {
            return new ImportCalendarModel();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/importcalendar/ImportCalendarFragment$onViewCreated$1", "Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/ImportCalendarModel$ModelDelegate;", "onReceiveBindPush", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.importcalendar.b$e */
    public static final class C30348e implements ImportCalendarModel.ModelDelegate {

        /* renamed from: a */
        final /* synthetic */ ImportCalendarFragment f75999a;

        @Override // com.ss.android.lark.calendar.impl.features.calendars.importcalendar.ImportCalendarModel.ModelDelegate
        /* renamed from: a */
        public void mo109626a() {
            this.f75999a.finish();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30348e(ImportCalendarFragment bVar) {
            this.f75999a = bVar;
        }
    }

    /* renamed from: d */
    public final void mo109619d() {
        m112839f().mo109654a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\n\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u000f"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/importcalendar/ImportCalendarFragment$fragmentDependency$1", "Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/ImportCalendarPresenter$FragmentDependency;", "addFragment", "", "fragment", "Landroidx/fragment/app/Fragment;", "containerId", "", "getActivityContext", "Landroid/app/Activity;", "hideFragment", "isFromSetting", "", "onBackPressed", "showFragment", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.importcalendar.b$c */
    public static final class C30346c implements ImportCalendarPresenter.FragmentDependency {

        /* renamed from: a */
        final /* synthetic */ ImportCalendarFragment f75998a;

        @Override // com.ss.android.lark.calendar.impl.features.calendars.importcalendar.ImportCalendarPresenter.FragmentDependency
        /* renamed from: a */
        public Activity mo109621a() {
            return this.f75998a.mo109618c().mo109596a();
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.importcalendar.ImportCalendarPresenter.FragmentDependency
        /* renamed from: b */
        public boolean mo109625b() {
            if (this.f75998a.f75991a == 1) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30346c(ImportCalendarFragment bVar) {
            this.f75998a = bVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.importcalendar.ImportCalendarPresenter.FragmentDependency
        /* renamed from: a */
        public void mo109622a(Fragment fragment) {
            Intrinsics.checkParameterIsNotNull(fragment, "fragment");
            this.f75998a.getChildFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_right_in, R.anim.slide_right_out).show(fragment).commitAllowingStateLoss();
            this.f75998a.getChildFragmentManager().executePendingTransactions();
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.importcalendar.ImportCalendarPresenter.FragmentDependency
        /* renamed from: b */
        public void mo109624b(Fragment fragment) {
            if (fragment != null) {
                this.f75998a.getChildFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_right_in, R.anim.slide_right_out).hide(fragment).commitAllowingStateLoss();
                this.f75998a.getChildFragmentManager().executePendingTransactions();
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.importcalendar.ImportCalendarPresenter.FragmentDependency
        /* renamed from: a */
        public void mo109623a(Fragment fragment, int i) {
            if (fragment != null) {
                this.f75998a.getChildFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_right_in, R.anim.slide_right_out).add(i, fragment, (String) null).commitAllowingStateLoss();
                this.f75998a.getChildFragmentManager().executePendingTransactions();
            }
        }
    }

    /* renamed from: c */
    public final ActivityDependency mo109618c() {
        ActivityDependency aVar = this.f75992b;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activityDependency");
        }
        return aVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        m112839f().destroy();
        super.onDestroy();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/ImportCalendarPresenter;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.importcalendar.b$f */
    static final class C30349f extends Lambda implements Function0<ImportCalendarPresenter> {
        final /* synthetic */ ImportCalendarFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30349f(ImportCalendarFragment bVar) {
            super(0);
            this.this$0 = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ImportCalendarPresenter invoke() {
            return new ImportCalendarPresenter(this.this$0.mo109617b(), this.this$0.mo109614a(), this.this$0.f75993c);
        }
    }

    /* renamed from: g */
    private final void m112840g() {
        if (this.f75991a == -1) {
            Bundle arguments = getArguments();
            int i = 1;
            if (arguments != null && arguments.getBoolean("sidebar", false)) {
                i = 0;
            }
            this.f75991a = i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/ImportCalendarView;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.importcalendar.b$g */
    static final class C30350g extends Lambda implements Function0<ImportCalendarView> {
        final /* synthetic */ ImportCalendarFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30350g(ImportCalendarFragment bVar) {
            super(0);
            this.this$0 = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ImportCalendarView invoke() {
            FrameLayout frameLayout = (FrameLayout) this.this$0.mo109613a(R.id.activityRoot);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout, "activityRoot");
            FrameLayout frameLayout2 = (FrameLayout) this.this$0.mo109613a(R.id.activityRoot);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout2, "activityRoot");
            Context context = frameLayout2.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "activityRoot.context");
            return new ImportCalendarView(frameLayout, context);
        }
    }

    /* renamed from: a */
    public final void mo109616a(ActivityDependency aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "<set-?>");
        this.f75992b = aVar;
    }

    /* renamed from: a */
    public final void mo109615a(Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, "intent");
        m112839f().mo109655a(intent);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        boolean z = false;
        if (arguments != null && arguments.getBoolean("fromweb", false)) {
            finish();
        }
        m112840g();
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            z = arguments2.getBoolean("sidebar", false);
        }
        m112839f().mo109656a(z);
        m112839f().create();
        mo109617b().mo109653a(new C30348e(this));
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.activity_calendar_import, viewGroup, false);
    }
}
