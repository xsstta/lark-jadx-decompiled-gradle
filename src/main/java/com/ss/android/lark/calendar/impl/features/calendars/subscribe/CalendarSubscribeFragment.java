package com.ss.android.lark.calendar.impl.features.calendars.subscribe;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendars.subscribe.CalendarSubscribePresenter;
import com.ss.android.lark.calendar.impl.features.meetingroom.profile.MeetingRoomProfileActivityEntrance;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.p1572c.C32503j;
import com.ss.android.lark.calendar.p1430a.C30022a;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$B\u0005¢\u0006\u0002\u0010\u0003J\u0006\u0010\u0016\u001a\u00020\u0017J&\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010 \u001a\u00020!H\u0016J\u001a\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribeFragment;", "Lcom/ss/android/lark/desktopmode/app/DesktopCompatFragment;", "Lcom/ss/android/lark/desktopmode/base/FloatWindowParams;", "()V", "calendarSubscribeModel", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribeModel;", "getCalendarSubscribeModel", "()Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribeModel;", "calendarSubscribeModel$delegate", "Lkotlin/Lazy;", "calendarSubscribePresenter", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribePresenter;", "getCalendarSubscribePresenter", "()Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribePresenter;", "calendarSubscribePresenter$delegate", "calendarSubscribeView", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribeView;", "getCalendarSubscribeView", "()Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribeView;", "calendarSubscribeView$delegate", "mFragmentDependency", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribePresenter$FragmentDependency;", "onBackPressed", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "", "onViewCreated", "view", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.b */
public final class CalendarSubscribeFragment extends C36516a<FloatWindowParams> {

    /* renamed from: b */
    public static final Companion f76557b = new Companion(null);

    /* renamed from: a */
    public final CalendarSubscribePresenter.FragmentDependency f76558a = new C30605e(this);

    /* renamed from: c */
    private final Lazy f76559c = LazyKt.lazy(new C30604d(this));

    /* renamed from: d */
    private final Lazy f76560d = LazyKt.lazy(C30602b.INSTANCE);

    /* renamed from: e */
    private final Lazy f76561e = LazyKt.lazy(new C30603c(this));

    /* renamed from: f */
    private HashMap f76562f;

    /* renamed from: e */
    private final CalendarSubscribePresenter m113726e() {
        return (CalendarSubscribePresenter) this.f76561e.getValue();
    }

    /* renamed from: a */
    public View mo110420a(int i) {
        if (this.f76562f == null) {
            this.f76562f = new HashMap();
        }
        View view = (View) this.f76562f.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f76562f.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final CalendarSubscribeView mo110421a() {
        return (CalendarSubscribeView) this.f76559c.getValue();
    }

    /* renamed from: b */
    public final CalendarSubscribeModel mo110422b() {
        return (CalendarSubscribeModel) this.f76560d.getValue();
    }

    /* renamed from: d */
    public void mo110424d() {
        HashMap hashMap = this.f76562f;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo110424d();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribeFragment$Companion;", "", "()V", "PATH_CALENDAR_SUBSCRIBE", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribeModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.b$b */
    static final class C30602b extends Lambda implements Function0<CalendarSubscribeModel> {
        public static final C30602b INSTANCE = new C30602b();

        C30602b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CalendarSubscribeModel invoke() {
            return new CalendarSubscribeModel();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        m113726e().destroy();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribeView;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.b$d */
    static final class C30604d extends Lambda implements Function0<CalendarSubscribeView> {
        final /* synthetic */ CalendarSubscribeFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30604d(CalendarSubscribeFragment bVar) {
            super(0);
            this.this$0 = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CalendarSubscribeView invoke() {
            FrameLayout frameLayout = (FrameLayout) this.this$0.mo110420a(R.id.activityRoot);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout, "activityRoot");
            return new CalendarSubscribeView(frameLayout);
        }
    }

    /* renamed from: c */
    public final boolean mo110423c() {
        if (!mo110421a().mo110383c()) {
            return true;
        }
        m113726e().mo110329f();
        return false;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribePresenter;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.b$c */
    static final class C30603c extends Lambda implements Function0<CalendarSubscribePresenter> {
        final /* synthetic */ CalendarSubscribeFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30603c(CalendarSubscribeFragment bVar) {
            super(0);
            this.this$0 = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CalendarSubscribePresenter invoke() {
            FrameLayout frameLayout = (FrameLayout) this.this$0.mo110420a(R.id.activityRoot);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout, "activityRoot");
            Context context = frameLayout.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "activityRoot.context");
            return new CalendarSubscribePresenter(this.this$0.mo110422b(), this.this$0.mo110421a(), context, this.this$0.f76558a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0012\u0010\r\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribeFragment$mFragmentDependency$1", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribePresenter$FragmentDependency;", "addFragment", "", "fragment", "Landroidx/fragment/app/Fragment;", "containerId", "", "finishActivity", "hideFragment", "routeMeetingRoomActivity", "resourceCalendarId", "", "showFragment", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.b$e */
    public static final class C30605e implements CalendarSubscribePresenter.FragmentDependency {

        /* renamed from: a */
        final /* synthetic */ CalendarSubscribeFragment f76563a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30605e(CalendarSubscribeFragment bVar) {
            this.f76563a = bVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.subscribe.CalendarSubscribePresenter.FragmentDependency
        /* renamed from: a */
        public void mo110333a(Fragment fragment) {
            if (fragment != null) {
                this.f76563a.getChildFragmentManager().beginTransaction().show(fragment).commitAllowingStateLoss();
                this.f76563a.getChildFragmentManager().executePendingTransactions();
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.subscribe.CalendarSubscribePresenter.FragmentDependency
        /* renamed from: b */
        public void mo110336b(Fragment fragment) {
            if (fragment != null) {
                this.f76563a.getChildFragmentManager().beginTransaction().hide(fragment).commitAllowingStateLoss();
                this.f76563a.getChildFragmentManager().executePendingTransactions();
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.subscribe.CalendarSubscribePresenter.FragmentDependency
        /* renamed from: a */
        public void mo110335a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "resourceCalendarId");
            Context context = this.f76563a.getContext();
            if (context != null) {
                Intrinsics.checkExpressionValueIsNotNull(context, "context ?: return");
                if (C30022a.f74883b.mo112709q()) {
                    MeetingRoomProfileActivityEntrance.f82147a.mo117232a(context, str);
                    GeneralHitPoint.m124201a("cal_subscribe", (String) null, 2, (Object) null);
                }
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.subscribe.CalendarSubscribePresenter.FragmentDependency
        /* renamed from: a */
        public void mo110334a(Fragment fragment, int i) {
            if (fragment != null) {
                this.f76563a.getChildFragmentManager().beginTransaction().add(i, fragment, (String) null).commitAllowingStateLoss();
                this.f76563a.getChildFragmentManager().executePendingTransactions();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        m113726e().create();
        C32503j.m124386a();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.calendar_activity_subscribe_calendar, viewGroup, false);
    }
}
