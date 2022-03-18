package com.ss.android.lark.calendar.impl.features.calendars.editor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendars.editor.CalendarCreatorPresenter;
import com.ss.android.lark.calendar.impl.features.common.helper.LargeCalendarTransmitHelper;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.desktopmode.base.FloatWindowParams;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.eetroublecapture.AbstractC36982d;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 F2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002EFB\u0005¢\u0006\u0002\u0010\u0004J\b\u00101\u001a\u000202H\u0002J\"\u00103\u001a\u0002022\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u0002052\b\u00107\u001a\u0004\u0018\u000108H\u0016J\u0006\u00109\u001a\u000202J\b\u0010:\u001a\u000202H\u0016J&\u0010;\u001a\u0004\u0018\u00010<2\u0006\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010@2\b\u0010A\u001a\u0004\u0018\u00010BH\u0016J\u001a\u0010C\u001a\u0002022\u0006\u0010D\u001a\u00020<2\b\u0010A\u001a\u0004\u0018\u00010BH\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020%X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010&\"\u0004\b'\u0010(R\u000e\u0010)\u001a\u00020*X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010+\u001a\u00020\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010!\"\u0004\b-\u0010#R\u001a\u0010.\u001a\u00020\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010!\"\u0004\b0\u0010#¨\u0006G"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/editor/CalendarCreatorFragment;", "Lcom/ss/android/lark/desktopmode/app/DesktopCompatFragment;", "Lcom/ss/android/lark/desktopmode/base/FloatWindowParams;", "Lcom/ss/android/lark/eetroublecapture/ICaptureCallback;", "()V", "activityDependency", "Lcom/ss/android/lark/calendar/impl/features/calendars/editor/CalendarCreatorFragment$ActivityDependency;", "getActivityDependency", "()Lcom/ss/android/lark/calendar/impl/features/calendars/editor/CalendarCreatorFragment$ActivityDependency;", "setActivityDependency", "(Lcom/ss/android/lark/calendar/impl/features/calendars/editor/CalendarCreatorFragment$ActivityDependency;)V", "calendarCreatorModel", "Lcom/ss/android/lark/calendar/impl/features/calendars/editor/CalendarCreatorModel;", "getCalendarCreatorModel", "()Lcom/ss/android/lark/calendar/impl/features/calendars/editor/CalendarCreatorModel;", "calendarCreatorModel$delegate", "Lkotlin/Lazy;", "calendarCreatorPresenter", "Lcom/ss/android/lark/calendar/impl/features/calendars/editor/CalendarCreatorPresenter;", "calendarCreatorView", "Lcom/ss/android/lark/calendar/impl/features/calendars/editor/CalendarCreatorView;", "getCalendarCreatorView", "()Lcom/ss/android/lark/calendar/impl/features/calendars/editor/CalendarCreatorView;", "calendarCreatorView$delegate", "calendarData", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "getCalendarData", "()Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "setCalendarData", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;)V", "calendarId", "", "getCalendarId", "()Ljava/lang/String;", "setCalendarId", "(Ljava/lang/String;)V", "isFromAppLink", "", "()Z", "setFromAppLink", "(Z)V", "mFragmentDependency", "Lcom/ss/android/lark/calendar/impl/features/calendars/editor/CalendarCreatorPresenter$FragmentDependency;", "managerType", "getManagerType", "setManagerType", "summary", "getSummary", "setSummary", "initMVP", "", "onActivityResult", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onBackPressed", "onCaptured", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "ActivityDependency", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.a */
public final class CalendarCreatorFragment extends C36516a<FloatWindowParams> implements AbstractC36982d {

    /* renamed from: b */
    public static final Companion f75829b = new Companion(null);

    /* renamed from: a */
    public ActivityDependency f75830a;

    /* renamed from: c */
    private String f75831c = "";

    /* renamed from: d */
    private String f75832d = "";

    /* renamed from: e */
    private String f75833e = "";

    /* renamed from: f */
    private boolean f75834f;

    /* renamed from: g */
    private Calendar f75835g;

    /* renamed from: h */
    private final Lazy f75836h = LazyKt.lazy(new C30282d(this));

    /* renamed from: i */
    private final Lazy f75837i = LazyKt.lazy(C30281c.INSTANCE);

    /* renamed from: j */
    private CalendarCreatorPresenter f75838j;

    /* renamed from: k */
    private final CalendarCreatorPresenter.FragmentDependency f75839k = new C30283e(this);

    /* renamed from: l */
    private HashMap f75840l;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/editor/CalendarCreatorFragment$ActivityDependency;", "", "getActivity", "Landroid/app/Activity;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.a$a */
    public interface ActivityDependency {
        /* renamed from: a */
        Activity mo109383a();
    }

    /* renamed from: j */
    private final CalendarCreatorView m112507j() {
        return (CalendarCreatorView) this.f75836h.getValue();
    }

    /* renamed from: k */
    private final CalendarCreatorModel m112508k() {
        return (CalendarCreatorModel) this.f75837i.getValue();
    }

    /* renamed from: a */
    public View mo109384a(int i) {
        if (this.f75840l == null) {
            this.f75840l = new HashMap();
        }
        View view = (View) this.f75840l.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f75840l.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: i */
    public void mo109395i() {
        HashMap hashMap = this.f75840l;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo109395i();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nXT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/editor/CalendarCreatorFragment$Companion;", "", "()V", "CALENDAR_ID", "", "CALENDAR_SUMMARY", "FROM_APPLINK", "MANAGER_CALENDAR_TYPE", "NEW_CALENDAR_TYPE", "REQUEST_MANAGER_CALENDAR", "", "REQUEST_NEW_CALENDAR", "SERIALIZABLE_FROM_TYPE", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.a$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final String mo109385a() {
        return this.f75831c;
    }

    /* renamed from: b */
    public final String mo109388b() {
        return this.f75832d;
    }

    /* renamed from: c */
    public final String mo109389c() {
        return this.f75833e;
    }

    /* renamed from: d */
    public final boolean mo109390d() {
        return this.f75834f;
    }

    /* renamed from: e */
    public final Calendar mo109391e() {
        return this.f75835g;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/features/calendars/editor/CalendarCreatorModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.a$c */
    static final class C30281c extends Lambda implements Function0<CalendarCreatorModel> {
        public static final C30281c INSTANCE = new C30281c();

        C30281c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CalendarCreatorModel invoke() {
            return new CalendarCreatorModel();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\n\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u000eH\u0016J\u0012\u0010\u0016\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u000eH\u0016J\u0012\u0010\u0019\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u001a"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/editor/CalendarCreatorFragment$mFragmentDependency$1", "Lcom/ss/android/lark/calendar/impl/features/calendars/editor/CalendarCreatorPresenter$FragmentDependency;", "addFragment", "", "fragment", "Landroidx/fragment/app/Fragment;", "containerId", "", "finishActivity", "getActivity", "Landroid/app/Activity;", "getCalendarFromBundle", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "getCalendarId", "", "getCalendarSummary", "getFragment", "Lcom/ss/android/lark/desktopmode/app/DesktopCompatFragment;", "Lcom/ss/android/lark/desktopmode/base/FloatWindowParams;", "getIsFromAppLink", "", "getManagerType", "hideFragment", "setManagerType", ShareHitPoint.f121869d, "showFragment", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.a$e */
    public static final class C30283e implements CalendarCreatorPresenter.FragmentDependency {

        /* renamed from: a */
        final /* synthetic */ CalendarCreatorFragment f75841a;

        @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.CalendarCreatorPresenter.FragmentDependency
        /* renamed from: d */
        public String mo109403d() {
            return this.f75841a.mo109388b();
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.CalendarCreatorPresenter.FragmentDependency
        /* renamed from: e */
        public boolean mo109404e() {
            return this.f75841a.mo109390d();
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.CalendarCreatorPresenter.FragmentDependency
        /* renamed from: f */
        public String mo109405f() {
            return this.f75841a.mo109389c();
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.CalendarCreatorPresenter.FragmentDependency
        /* renamed from: g */
        public String mo109406g() {
            return this.f75841a.mo109385a();
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.CalendarCreatorPresenter.FragmentDependency
        /* renamed from: b */
        public Activity mo109400b() {
            return this.f75841a.mo109392f().mo109383a();
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.CalendarCreatorPresenter.FragmentDependency
        /* renamed from: c */
        public Calendar mo109402c() {
            Calendar e = this.f75841a.mo109391e();
            if (e != null) {
                return e;
            }
            return null;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.CalendarCreatorPresenter.FragmentDependency
        /* renamed from: a */
        public void mo109396a() {
            if (Intrinsics.areEqual(this.f75841a.mo109385a(), "new_calendar_type")) {
                this.f75841a.setResult(1);
            } else {
                this.f75841a.setResult(2);
            }
            this.f75841a.finish();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30283e(CalendarCreatorFragment aVar) {
            this.f75841a = aVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.CalendarCreatorPresenter.FragmentDependency
        /* renamed from: a */
        public void mo109399a(String str) {
            Intrinsics.checkParameterIsNotNull(str, ShareHitPoint.f121869d);
            this.f75841a.mo109387a(str);
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.CalendarCreatorPresenter.FragmentDependency
        /* renamed from: b */
        public void mo109401b(Fragment fragment) {
            if (fragment != null) {
                this.f75841a.getChildFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_right_in, R.anim.slide_right_out).hide(fragment).commitAllowingStateLoss();
                this.f75841a.getChildFragmentManager().executePendingTransactions();
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.CalendarCreatorPresenter.FragmentDependency
        /* renamed from: a */
        public void mo109397a(Fragment fragment) {
            if (fragment != null) {
                this.f75841a.getChildFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_right_in, R.anim.slide_right_out).show(fragment).commitAllowingStateLoss();
                this.f75841a.getChildFragmentManager().executePendingTransactions();
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.CalendarCreatorPresenter.FragmentDependency
        /* renamed from: a */
        public void mo109398a(Fragment fragment, int i) {
            if (fragment != null) {
                this.f75841a.getChildFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_right_in, R.anim.slide_right_out).add(i, fragment, (String) null).commitAllowingStateLoss();
                this.f75841a.getChildFragmentManager().executePendingTransactions();
            }
        }
    }

    /* renamed from: f */
    public final ActivityDependency mo109392f() {
        ActivityDependency aVar = this.f75830a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activityDependency");
        }
        return aVar;
    }

    /* renamed from: g */
    public final void mo109393g() {
        CalendarCreatorPresenter cVar = this.f75838j;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("calendarCreatorPresenter");
        }
        cVar.mo109507h();
    }

    @Override // com.ss.android.lark.eetroublecapture.AbstractC36982d
    /* renamed from: h */
    public void mo109394h() {
        CalendarCreatorPresenter cVar = this.f75838j;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("calendarCreatorPresenter");
        }
        cVar.mo109508i();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/features/calendars/editor/CalendarCreatorView;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.a$d */
    static final class C30282d extends Lambda implements Function0<CalendarCreatorView> {
        final /* synthetic */ CalendarCreatorFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30282d(CalendarCreatorFragment aVar) {
            super(0);
            this.this$0 = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CalendarCreatorView invoke() {
            FrameLayout frameLayout = (FrameLayout) this.this$0.mo109384a(R.id.activityRoot);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout, "activityRoot");
            return new CalendarCreatorView(frameLayout);
        }
    }

    /* renamed from: l */
    private final void m112509l() {
        CalendarCreatorPresenter cVar = new CalendarCreatorPresenter(m112508k(), m112507j(), this.f75839k);
        this.f75838j = cVar;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("calendarCreatorPresenter");
        }
        cVar.create();
    }

    /* renamed from: a */
    public final void mo109386a(ActivityDependency aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "<set-?>");
        this.f75830a = aVar;
    }

    /* renamed from: a */
    public final void mo109387a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f75831c = str;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("serializable_from_type");
            String str = "";
            if (string == null) {
                string = str;
            }
            this.f75831c = string;
            String string2 = arguments.getString("calendar_summary");
            if (string2 == null) {
                string2 = str;
            }
            this.f75832d = string2;
            this.f75834f = arguments.getBoolean("from_applink", false);
            String string3 = arguments.getString("calendar_id");
            if (string3 != null) {
                str = string3;
            }
            this.f75833e = str;
            if (Intrinsics.areEqual(this.f75831c, "manager_calendar_type") && !this.f75834f) {
                this.f75835g = LargeCalendarTransmitHelper.m116188b(arguments);
            }
        }
        m112509l();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        CalendarCreatorPresenter cVar = this.f75838j;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("calendarCreatorPresenter");
        }
        cVar.mo109494a(i, i2, intent);
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.calendar_activity_creator, viewGroup, false);
    }
}
