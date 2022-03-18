package com.ss.android.lark.calendar.impl.features.calendarview.main;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.MessageQueue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.article.common.monitor.stack.C3474b;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.calendar.dependency.idependency.ICommonDependency;
import com.ss.android.lark.calendar.dependency.idependency.IPerfDependency;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarFeelGoodManager;
import com.ss.android.lark.calendar.impl.features.calendarview.p1467c.C30667a;
import com.ss.android.lark.calendar.impl.features.calendarview.p1467c.C30668b;
import com.ss.android.lark.calendar.impl.features.common.widget.p1500b.C31164a;
import com.ss.android.lark.calendar.impl.features.events.detail.C31238b;
import com.ss.android.lark.calendar.impl.framework.hitpoint.appreciable.AppreciableHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.performance.LaunchMemoryMonitor;
import com.ss.android.lark.calendar.impl.framework.hitpoint.performance.LaunchPerfMonitor;
import com.ss.android.lark.calendar.impl.framework.hitpoint.performance.PerfHelper;
import com.ss.android.lark.calendar.impl.p1437b.p1438a.C30076a;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.log.Log;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b&\u0018\u0000 :2\u00020\u00012\u00020\u0002:\u0002:;B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u001d\u001a\u00020\u001eH&J\n\u0010\u001f\u001a\u0004\u0018\u00010 H&J\u0018\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u000bH\u0016J\u0016\u0010$\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u000bJ\u0012\u0010'\u001a\u00020\u001e2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J&\u0010*\u001a\u0004\u0018\u00010 2\u0006\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\b\u0010/\u001a\u00020\u001eH\u0016J\b\u00100\u001a\u00020\u001eH\u0016J\u001a\u00101\u001a\u00020\u001e2\u0006\u00102\u001a\u00020 2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\b\u00103\u001a\u00020\u001eH\u0002J\u0010\u00104\u001a\u00020\u001e2\u0006\u00105\u001a\u00020)H\u0016J\u000e\u00106\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u0013J\u0010\u00107\u001a\u00020\u001e2\u0006\u00105\u001a\u00020)H&J\b\u00108\u001a\u00020\u001eH&J\b\u00109\u001a\u00020\u001eH&R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006<"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/main/CalendarViewBaseFragment;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/main/CalendarMainFragmentInterface;", "()V", "calendarFeelGoodManager", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarFeelGoodManager;", "getCalendarFeelGoodManager", "()Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarFeelGoodManager;", "calendarFeelGoodManager$delegate", "Lkotlin/Lazy;", "isCalendarTabFeelGoodEnabled", "", "isFromClickTab", "()Z", "setFromClickTab", "(Z)V", "isOnCalendarPage", "setOnCalendarPage", "lifeCycleListener", "Lcom/ss/android/lark/calendar/impl/features/calendarview/main/CalendarViewBaseFragment$LifeCycleListener;", "mActivity", "Landroid/app/Activity;", "getMActivity", "()Landroid/app/Activity;", "setMActivity", "(Landroid/app/Activity;)V", "mCreateTimes", "", "mIsDestroyed", "clickCalendarTabAgain", "", "createView", "Landroid/view/View;", "handlePageSwitch", "preIsCalTab", "curIsCalTab", "onClickCalTabAgain", "isCurrentCalendarTab", "forbidMoveToToday", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onPause", "onViewCreated", "view", "routeEventDetail", "setArgumentsFromSpec", "args", "setLifeCycleListener", "showViewByAppLink", "switchOutCalendarTab", "switchToCalendarTab", "Companion", "LifeCycleListener", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.main.b */
public abstract class CalendarViewBaseFragment extends BaseFragment implements CalendarMainFragmentInterface {

    /* renamed from: a */
    public static final Companion f77811a = new Companion(null);

    /* renamed from: b */
    private Activity f77812b;

    /* renamed from: c */
    private boolean f77813c;

    /* renamed from: d */
    private int f77814d;

    /* renamed from: e */
    private boolean f77815e;

    /* renamed from: f */
    private boolean f77816f = C30022a.f74883b.mo112713u();

    /* renamed from: g */
    private LifeCycleListener f77817g;

    /* renamed from: h */
    private final Lazy f77818h = LazyKt.lazy(C30894c.INSTANCE);

    /* renamed from: i */
    private boolean f77819i = true;

    /* renamed from: j */
    private HashMap f77820j;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/main/CalendarViewBaseFragment$LifeCycleListener;", "", "onCreate", "", "onDestroy", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.main.b$b */
    public interface LifeCycleListener {
        /* renamed from: a */
        void mo111895a();

        /* renamed from: b */
        void mo111896b();
    }

    /* renamed from: h */
    private final CalendarFeelGoodManager mo111958h() {
        return (CalendarFeelGoodManager) this.f77818h.getValue();
    }

    /* renamed from: b */
    public abstract void mo111887b(Bundle bundle);

    /* renamed from: c */
    public abstract View mo111890c();

    /* renamed from: d */
    public abstract void mo111891d();

    /* renamed from: e */
    public abstract void mo111892e();

    /* renamed from: f */
    public abstract void mo111893f();

    /* renamed from: g */
    public void mo111894g() {
        HashMap hashMap = this.f77820j;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo111894g();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/main/CalendarViewBaseFragment$Companion;", "", "()V", "APP_LINK_VIEW_DATE", "", "APP_LINK_VIEW_TYPE", "CAL_TAB_PAGE_FROM", "FROM_APP_LINK", "FROM_EVENT_SEARCH", "TAG_LOG", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.main.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Activity mo111885a() {
        return this.f77812b;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarFeelGoodManager;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.main.b$c */
    static final class C30894c extends Lambda implements Function0<CalendarFeelGoodManager> {
        public static final C30894c INSTANCE = new C30894c();

        C30894c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CalendarFeelGoodManager invoke() {
            return new CalendarFeelGoodManager();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo111889b() {
        return this.f77815e;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.main.b$d */
    public static final class RunnableC30895d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CalendarViewBaseFragment f77821a;

        RunnableC30895d(CalendarViewBaseFragment bVar) {
            this.f77821a = bVar;
        }

        public final void run() {
            Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler(this) {
                /* class com.ss.android.lark.calendar.impl.features.calendarview.main.CalendarViewBaseFragment.RunnableC30895d.C308961 */

                /* renamed from: a */
                final /* synthetic */ RunnableC30895d f77822a;

                {
                    this.f77822a = r1;
                }

                public final boolean queueIdle() {
                    Activity a = this.f77822a.f77821a.mo111885a();
                    if (a == null) {
                        return false;
                    }
                    ICommonDependency commonDependency = C30022a.f74882a.commonDependency();
                    Context applicationContext = a.getApplicationContext();
                    Intrinsics.checkExpressionValueIsNotNull(applicationContext, "it.applicationContext");
                    if (commonDependency.mo108227a(applicationContext) || !C30022a.f74883b.mo112698f()) {
                        return false;
                    }
                    C31164a.m116337a().mo112895a(a.getApplicationContext());
                    return false;
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        Log.m165389i("CalendarViewBaseFragment", C32673y.m125378d("onPause"));
        LaunchPerfMonitor.m124429d();
    }

    /* renamed from: i */
    private final void mo111959i() {
        Bundle bundle;
        Intent intent;
        FragmentActivity activity = getActivity();
        if (activity == null || (intent = activity.getIntent()) == null) {
            bundle = null;
        } else {
            bundle = intent.getExtras();
        }
        if (bundle != null && bundle.getBoolean("enter_calendar_tab_from_offline_push", false)) {
            C31238b.m116881d(this.f77812b, bundle);
            bundle.putBoolean("enter_calendar_tab_from_offline_push", false);
            Log.m165389i("CalendarViewBaseFragment", C32673y.m125378d("startEventDetailActivityFromOfflinePush"));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        Log.m165389i("CalendarViewBaseFragment", C32673y.m125378d("onDestroy"));
        this.f77814d--;
        if (this.f77813c) {
            C3474b.m14691a("CalendarDaysFragment's onDestroy() called more than once!(onCreate() called " + this.f77814d + "times)");
            return;
        }
        if (this.f77816f) {
            mo111958h().mo110713a();
        }
        this.f77813c = true;
        LifeCycleListener bVar = this.f77817g;
        if (bVar != null) {
            bVar.mo111896b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo111886a(Activity activity) {
        this.f77812b = activity;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.main.CalendarMainFragmentInterface
    /* renamed from: a */
    public void mo111854a(Bundle bundle) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(bundle, "args");
        Log.m165389i("CalendarViewBaseFragment", C32673y.m125378d("setArgumentsFromSpec"));
        String string = bundle.getString("cal_tab_page_from", "");
        Intrinsics.checkExpressionValueIsNotNull(string, "from");
        if (string.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        this.f77819i = z;
        if (Intrinsics.areEqual(string, "from_app_link") && !this.f77813c) {
            mo111887b(bundle);
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.m165389i("CalendarViewBaseFragment", C32673y.m125378d("onCreate"));
        int i = this.f77814d + 1;
        this.f77814d = i;
        this.f77813c = false;
        if (i > 1) {
            C3474b.m14691a("CalendarDaysFragment's onCreate() called " + this.f77814d + " times!");
        }
    }

    /* renamed from: b */
    public final void mo111888b(boolean z, boolean z2) {
        Log.m165389i("CalendarViewBaseFragment", C32673y.m125378d("handlePageSwitch isCurrentCalendarTab = " + z + " forbidMoveToToday = " + z2));
        if (z && !z2) {
            mo111893f();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        Log.m165389i("CalendarViewBaseFragment", C32673y.m125378d("onViewCreated"));
        mo111959i();
        UICallbackExecutor.executeDelayed(new RunnableC30895d(this), 3000);
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.main.CalendarMainFragmentInterface
    /* renamed from: a */
    public void mo111856a(boolean z, boolean z2) {
        Log.m165389i("CalendarViewBaseFragment", C32673y.m125378d("handlePageSwitch preIsCalTab = " + z + " curIsCalTab = " + z2));
        if (!z && !z2) {
            return;
        }
        if (!z || !z2) {
            this.f77819i = true;
            this.f77815e = z2;
            C30076a.m111290a().mo108427a(z2);
            C30022a.f74884c.mo108457c(z2);
            if (z2) {
                mo111891d();
                GeneralHitPoint.m124229b();
                int a = C30668b.m114025a(C30667a.m114018a());
                if (a == 1) {
                    AppreciableHitPoint.f83321a.mo118679b();
                } else if (a == 31) {
                    AppreciableHitPoint.f83321a.mo118685e();
                } else if (a == 3) {
                    AppreciableHitPoint.f83321a.mo118681c();
                } else if (a == 4) {
                    AppreciableHitPoint.f83321a.mo118683d();
                }
                if (this.f77816f) {
                    mo111958h().mo110714a(this.f77812b);
                }
            }
            if (z) {
                mo111892e();
                LaunchPerfMonitor.m124429d();
                if (this.f77816f) {
                    mo111958h().mo110713a();
                    return;
                }
                return;
            }
            return;
        }
        mo111888b(true, !this.f77819i);
        this.f77819i = true;
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        Log.m165389i("CalendarViewBaseFragment", C32673y.m125378d("onCreateView"));
        long currentTimeMillis = System.currentTimeMillis();
        LaunchPerfMonitor.m124422a(PerfHelper.m124435a());
        LaunchPerfMonitor.m124421a();
        LaunchPerfMonitor.m124428c("show_grid");
        LaunchMemoryMonitor.m124419a(PerfHelper.m124435a());
        View c = mo111890c();
        Log.m165389i("CalendarViewBaseFragment", C32673y.m125378d("CalendarMainFragment onCreateView cost = " + (System.currentTimeMillis() - currentTimeMillis) + ", rootView = " + c));
        if (c == null) {
            IPerfDependency.C30057b.m111175a(C30022a.f74882a.perfDependency(), "CalendarMainFragmentBlank", null, null, null, 14, null);
        }
        LifeCycleListener bVar = this.f77817g;
        if (bVar != null) {
            bVar.mo111895a();
        }
        return c;
    }
}
