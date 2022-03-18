package com.ss.android.lark.calendar.impl.features.calendarview.main;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1144ai;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDaysContract;
import com.ss.android.lark.calendar.impl.features.calendarview.main.CalendarPresenter;
import com.ss.android.lark.calendar.impl.features.calendarview.main.container.CalendarDiagramContainer;
import com.ss.android.lark.calendar.impl.features.calendarview.main.container.CalendarTabContainer;
import com.ss.android.lark.calendar.impl.features.calendarview.manager.CalendarFirstTabLauncher;
import com.ss.android.lark.calendar.impl.features.calendarview.p1467c.C30667a;
import com.ss.android.lark.calendar.impl.features.calendarview.p1467c.C30668b;
import com.ss.android.lark.calendar.impl.features.calendarview.room.IRoomDiagramView;
import com.ss.android.lark.calendar.impl.features.calendarview.room.IRoomViewModel;
import com.ss.android.lark.calendar.impl.features.calendarview.room.RoomDiagramView;
import com.ss.android.lark.calendar.impl.features.calendarview.room.RoomDiagramViewModel;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.ViewIndicator;
import com.ss.android.lark.calendar.impl.features.events.edit.EditActivityEntrance;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event2.CalendarMainHitPoint;
import com.ss.android.lark.calendar.impl.utils.C32646c;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.impl.utils.diskcache.ArrayGenerator;
import com.ss.android.lark.calendar.impl.utils.diskcache.CalendarAndroidKeyStore;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30054s;
import com.ss.android.lark.calendar.p1430a.p1431a.p1432a.AbstractC30028g;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 12\u00020\u0001:\u00011B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0012\u0010\u0018\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\b\u0010\u0019\u001a\u00020\u0012H\u0002J\n\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0012H\u0002J\b\u0010\u001d\u001a\u00020\u0012H\u0002J\b\u0010\u001e\u001a\u00020\u0012H\u0016J\b\u0010\u001f\u001a\u00020\u0012H\u0016J\u001a\u0010 \u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u001b2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0006\u0010$\u001a\u00020\u0012J\u000e\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020'J\b\u0010(\u001a\u00020\u0012H\u0002J\b\u0010)\u001a\u00020\u0012H\u0002J\u000e\u0010*\u001a\u00020\u00122\u0006\u0010&\u001a\u00020'J\u0010\u0010+\u001a\u00020\u00122\u0006\u0010,\u001a\u00020#H\u0016J\b\u0010-\u001a\u00020\u0012H\u0016J\b\u0010.\u001a\u00020\u0012H\u0016J\u0010\u0010/\u001a\u00020\u00122\u0006\u00100\u001a\u00020\u0010H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/main/CalendarViewMainFragment;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/main/CalendarViewBaseFragment;", "()V", "mCalendarPresenter", "Lcom/ss/android/lark/calendar/impl/features/calendarview/main/CalendarPresenter;", "mDiagramContainer", "Lcom/ss/android/lark/calendar/impl/features/calendarview/main/container/CalendarDiagramContainer;", "mFirstTabLauncher", "Lcom/ss/android/lark/calendar/impl/features/calendarview/manager/CalendarFirstTabLauncher;", "mRoomView", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/IRoomDiagramView;", "mRoomViewModel", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/IRoomViewModel;", "mTabContainer", "Lcom/ss/android/lark/calendar/impl/features/calendarview/main/container/CalendarTabContainer;", "mTitleController", "Lcom/ss/android/lark/calendar/dependency/idependency/entity/ITitleControllerProxy;", "clickCalendarTabAgain", "", "createCalendarPresenter", "context", "Landroid/content/Context;", "viewMode", "", "createDiagramContainer", "createRoomVew", "createView", "Landroid/view/View;", "handleSwitchToCalendarView", "handleSwitchToRoomView", "onDestroy", "onResume", "onViewCreated", "view", "savedInstanceState", "Landroid/os/Bundle;", "preloadTabPageData", "preloadTabPageView", "activity", "Landroid/app/Activity;", "refreshTabView", "refreshTitleDate", "setActivity", "showViewByAppLink", "args", "switchOutCalendarTab", "switchToCalendarTab", "updateTitleController", "titleController", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.main.c */
public final class CalendarViewMainFragment extends CalendarViewBaseFragment {

    /* renamed from: d */
    public static final Companion f77884d = new Companion(null);

    /* renamed from: b */
    public IRoomViewModel f77885b;

    /* renamed from: c */
    public CalendarPresenter f77886c;

    /* renamed from: e */
    private AbstractC30028g f77887e;

    /* renamed from: f */
    private CalendarDiagramContainer f77888f;

    /* renamed from: g */
    private final CalendarTabContainer f77889g = new CalendarTabContainer();

    /* renamed from: h */
    private IRoomDiagramView f77890h;

    /* renamed from: i */
    private final CalendarFirstTabLauncher f77891i = new CalendarFirstTabLauncher();

    /* renamed from: j */
    private HashMap f77892j;

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.main.CalendarViewBaseFragment
    /* renamed from: g */
    public void mo111894g() {
        HashMap hashMap = this.f77892j;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment, com.ss.android.lark.calendar.impl.features.calendarview.main.CalendarViewBaseFragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo111894g();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\u0006J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/main/CalendarViewMainFragment$Companion;", "", "()V", "TAG_LOG", "", "getFromAppLinkBundle", "Landroid/os/Bundle;", ShareHitPoint.f121869d, "date", "getFromSearchBundle", "newInstance", "Lcom/ss/android/lark/calendar/impl/features/calendarview/main/CalendarViewMainFragment;", "context", "Landroid/content/Context;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.main.c$a */
    public static final class Companion {
        private Companion() {
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.main.c$a$a */
        static final class RunnableC30925a implements Runnable {

            /* renamed from: a */
            public static final RunnableC30925a f77893a = new RunnableC30925a();

            RunnableC30925a() {
            }

            public final void run() {
                CalendarAndroidKeyStore.f83769a.mo120341a();
                ArrayGenerator aVar = ArrayGenerator.f83762a;
                AbstractC30054s loginDependency = C30022a.f74882a.loginDependency();
                Intrinsics.checkExpressionValueIsNotNull(loginDependency, "CalendarDependencyHolder…endency.loginDependency()");
                String a = loginDependency.mo108269a();
                Intrinsics.checkExpressionValueIsNotNull(a, "CalendarDependencyHolder….loginDependency().userId");
                aVar.mo120333a(a);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final CalendarViewMainFragment mo111961a(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
            coreThreadPool.getCachedThreadPool().execute(RunnableC30925a.f77893a);
            CalendarViewMainFragment cVar = new CalendarViewMainFragment();
            Log.m165389i("CalendarViewMainFragment", C32673y.m125378d("CalendarMainFragment"));
            return cVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendarview/main/CalendarViewMainFragment$createCalendarPresenter$1", "Lcom/ss/android/lark/calendar/impl/features/calendarview/main/CalendarPresenter$IDependency;", "preDay", "", "getPreDay", "()I", "setPreDay", "(I)V", "getActivity", "Landroid/app/Activity;", "onCalendarViewSwitched", "", "refreshMonthTitle", "date", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.main.c$b */
    public static final class C30926b implements CalendarPresenter.IDependency {

        /* renamed from: a */
        final /* synthetic */ CalendarViewMainFragment f77894a;

        /* renamed from: b */
        final /* synthetic */ CalendarDiagramContainer f77895b;

        /* renamed from: c */
        private int f77896c;

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.main.CalendarPresenter.IDependency
        /* renamed from: a */
        public Activity mo111841a() {
            return this.f77894a.mo111885a();
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.main.CalendarPresenter.IDependency
        /* renamed from: b */
        public void mo111843b() {
            View view;
            CalendarDiagramContainer aVar = this.f77895b;
            CalendarPresenter calendarPresenter = this.f77894a.f77886c;
            if (calendarPresenter != null) {
                view = calendarPresenter.mo111817g();
            } else {
                view = null;
            }
            aVar.mo111860a(view);
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.main.CalendarPresenter.IDependency
        /* renamed from: a */
        public void mo111842a(CalendarDate calendarDate) {
            Intrinsics.checkParameterIsNotNull(calendarDate, "date");
            if (calendarDate.getJulianDay() != this.f77896c) {
                CalendarMainHitPoint.m124364a("day_change", null, null, 6, null);
            }
            this.f77896c = calendarDate.getJulianDay();
            this.f77894a.mo111960j();
        }

        C30926b(CalendarViewMainFragment cVar, CalendarDiagramContainer aVar) {
            this.f77894a = cVar;
            this.f77895b = aVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendarview/main/CalendarViewMainFragment$createDiagramContainer$3", "Lcom/ss/android/lark/calendar/impl/features/calendarview/main/container/CalendarDiagramContainer$IContainerAction;", "onCalendarSelected", "", "onOpenAppendEventActivity", "startTime", "", "endTime", "onRoomSelected", "onStartActivity", "intent", "Landroid/content/Intent;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.main.c$c */
    public static final class C30927c implements CalendarDiagramContainer.IContainerAction {

        /* renamed from: a */
        final /* synthetic */ CalendarViewMainFragment f77897a;

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.main.container.CalendarDiagramContainer.IContainerAction
        /* renamed from: a */
        public void mo111872a() {
            this.f77897a.mo111958h();
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.main.container.CalendarDiagramContainer.IContainerAction
        /* renamed from: b */
        public void mo111875b() {
            this.f77897a.mo111959i();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30927c(CalendarViewMainFragment cVar) {
            this.f77897a = cVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.main.container.CalendarDiagramContainer.IContainerAction
        /* renamed from: a */
        public void mo111874a(Intent intent) {
            CalendarDaysContract.AbstractC30658d c;
            Intrinsics.checkParameterIsNotNull(intent, "intent");
            CalendarPresenter calendarPresenter = this.f77897a.f77886c;
            if (calendarPresenter != null && (c = calendarPresenter.mo111813c()) != null) {
                c.mo108515a(intent, false);
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.main.container.CalendarDiagramContainer.IContainerAction
        /* renamed from: a */
        public void mo111873a(long j, long j2) {
            CalendarDaysContract.AbstractC30658d c;
            CalendarDate calendarDate;
            CalendarDaysContract.AbstractC30658d c2;
            CalendarDate calendarDate2;
            if (C30667a.m114021c()) {
                EditActivityEntrance.Companion aVar = EditActivityEntrance.f79940a;
                Context context = this.f77897a.mContext;
                Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
                IRoomViewModel bVar = this.f77897a.f77885b;
                if (bVar == null || (calendarDate2 = bVar.getSelectedDate()) == null) {
                    calendarDate2 = new CalendarDate();
                }
                aVar.mo114667a(context, calendarDate2, true);
            } else if (j == -1 || j2 == -1) {
                CalendarPresenter calendarPresenter = this.f77897a.f77886c;
                if (calendarPresenter != null && (c = calendarPresenter.mo111813c()) != null) {
                    CalendarPresenter calendarPresenter2 = this.f77897a.f77886c;
                    if (calendarPresenter2 != null) {
                        calendarDate = calendarPresenter2.mo111818h();
                    } else {
                        calendarDate = null;
                    }
                    c.mo108516a(calendarDate, this.f77897a.mContext, true);
                }
            } else {
                long[] jArr = {j, j2};
                EditActivityEntrance.Companion aVar2 = EditActivityEntrance.f79940a;
                Context context2 = this.f77897a.mContext;
                Intrinsics.checkExpressionValueIsNotNull(context2, "mContext");
                Intent a = aVar2.mo114660a(context2, jArr);
                CalendarPresenter calendarPresenter3 = this.f77897a.f77886c;
                if (calendarPresenter3 != null && (c2 = calendarPresenter3.mo111813c()) != null) {
                    c2.mo108515a(a, false);
                }
            }
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.main.CalendarViewBaseFragment
    /* renamed from: e */
    public void mo111892e() {
        IRoomDiagramView aVar = this.f77890h;
        if (aVar != null) {
            aVar.mo112217a(false);
        }
        CalendarPresenter calendarPresenter = this.f77886c;
        if (calendarPresenter != null) {
            calendarPresenter.mo111835q();
        }
        CalendarPresenter calendarPresenter2 = this.f77886c;
        if (calendarPresenter2 != null) {
            calendarPresenter2.mo111811a(false);
        }
        CalendarPresenter calendarPresenter3 = this.f77886c;
        if (calendarPresenter3 != null) {
            calendarPresenter3.mo111825o();
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.main.CalendarViewBaseFragment
    /* renamed from: f */
    public void mo111893f() {
        if (C30667a.m114021c()) {
            IRoomDiagramView aVar = this.f77890h;
            if (aVar != null) {
                aVar.mo112218b();
                return;
            }
            return;
        }
        CalendarPresenter calendarPresenter = this.f77886c;
        if (calendarPresenter != null) {
            calendarPresenter.mo111837s();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Log.m165389i("CalendarViewMainFragment", C32673y.m125378d("onResume"));
        CalendarPresenter calendarPresenter = this.f77886c;
        if (calendarPresenter != null) {
            calendarPresenter.mo111820j();
        }
        IRoomDiagramView aVar = this.f77890h;
        if (aVar != null) {
            aVar.mo112219c();
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.main.CalendarViewBaseFragment
    /* renamed from: d */
    public void mo111891d() {
        if (C30667a.m114021c()) {
            GeneralHitPoint.m124169B();
        } else {
            CalendarMainHitPoint.m124362a();
        }
        IRoomDiagramView aVar = this.f77890h;
        if (aVar != null) {
            aVar.mo112217a(true);
        }
        CalendarPresenter calendarPresenter = this.f77886c;
        if (calendarPresenter != null) {
            calendarPresenter.mo111834p();
            calendarPresenter.mo111836r();
            calendarPresenter.mo111824n();
            calendarPresenter.mo111839u();
            calendarPresenter.mo111838t();
            calendarPresenter.mo111811a(true);
            AbstractC30028g gVar = this.f77887e;
            if (gVar != null) {
                gVar.mo108168a();
            }
        }
    }

    /* renamed from: h */
    public final void mo111958h() {
        View view;
        if (this.f77886c == null) {
            m115361a(getContext(), C30667a.m114018a());
            Unit unit = Unit.INSTANCE;
        }
        CalendarDiagramContainer aVar = this.f77888f;
        if (aVar != null) {
            CalendarPresenter calendarPresenter = this.f77886c;
            if (calendarPresenter != null) {
                view = calendarPresenter.mo111817g();
            } else {
                view = null;
            }
            aVar.mo111860a(view);
        }
        mo111960j();
        m115363l();
    }

    /* renamed from: i */
    public final void mo111959i() {
        View view;
        IRoomViewModel bVar;
        if (this.f77890h == null || (bVar = this.f77885b) == null) {
            m115362k();
        } else if (bVar != null) {
            bVar.onRefreshInstanceManually();
        }
        CalendarDiagramContainer aVar = this.f77888f;
        if (aVar != null) {
            IRoomDiagramView aVar2 = this.f77890h;
            if (aVar2 != null) {
                view = aVar2.mo112215a();
            } else {
                view = null;
            }
            aVar.mo111860a(view);
        }
        mo111960j();
        m115363l();
    }

    /* renamed from: j */
    public final void mo111960j() {
        CalendarDate calendarDate;
        if (C30667a.m114021c()) {
            IRoomViewModel bVar = this.f77885b;
            if (bVar == null || (calendarDate = bVar.getSelectedDate()) == null) {
                calendarDate = new CalendarDate();
            }
        } else {
            CalendarPresenter calendarPresenter = this.f77886c;
            if (calendarPresenter == null || (calendarDate = calendarPresenter.mo111818h()) == null) {
                calendarDate = new CalendarDate();
            }
        }
        String a = C32646c.m125257a(calendarDate);
        Intrinsics.checkExpressionValueIsNotNull(a, "CalendarDateTimeShowUtil…hCombineStr(selectedDate)");
        AbstractC30028g gVar = this.f77887e;
        if (gVar != null) {
            gVar.mo108169a(a);
        }
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.lark.calendar.impl.features.calendarview.main.CalendarViewBaseFragment
    public void onDestroy() {
        super.onDestroy();
        CalendarPresenter calendarPresenter = this.f77886c;
        if (calendarPresenter != null) {
            calendarPresenter.mo111821k();
        }
        this.f77886c = null;
        IRoomDiagramView aVar = this.f77890h;
        if (aVar != null) {
            aVar.mo112220d();
        }
        IRoomViewModel bVar = this.f77885b;
        if (bVar != null) {
            bVar.destroy();
        }
        this.f77885b = null;
        this.f77890h = null;
        this.f77891i.mo110722e();
        this.f77889g.mo111880a();
    }

    /* renamed from: k */
    private final void m115362k() {
        CalendarDate currentDate;
        AbstractC1142af a = new C1144ai(this).mo6005a(RoomDiagramViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(a, "ViewModelProvider(this).…ramViewModel::class.java)");
        RoomDiagramViewModel roomDiagramViewModel = (RoomDiagramViewModel) a;
        roomDiagramViewModel.preLoadData();
        roomDiagramViewModel.getSelectDateChangeLiveData().mo5923a(this, new C30928d(this));
        IRoomDiagramView aVar = this.f77890h;
        if (aVar != null) {
            aVar.mo112220d();
        }
        RoomDiagramViewModel roomDiagramViewModel2 = roomDiagramViewModel;
        this.f77890h = new RoomDiagramView(roomDiagramViewModel2);
        IRoomViewModel bVar = this.f77885b;
        if (bVar != null) {
            bVar.destroy();
        }
        this.f77885b = roomDiagramViewModel2;
        IRoomDiagramView aVar2 = this.f77890h;
        if (aVar2 != null) {
            aVar2.mo112216a(getContext());
        }
        IRoomViewModel bVar2 = this.f77885b;
        if (bVar2 != null) {
            bVar2.create();
        }
        IRoomViewModel bVar3 = this.f77885b;
        if (bVar3 != null && (currentDate = bVar3.getCurrentDate()) != null) {
            this.f77889g.mo111883a(currentDate);
        }
    }

    /* renamed from: l */
    private final void m115363l() {
        CalendarDate calendarDate;
        float f;
        CalendarDate selectedDate;
        CalendarDate calendarDate2;
        if (C30667a.m114021c()) {
            IRoomViewModel bVar = this.f77885b;
            if (bVar == null || (calendarDate = bVar.getCurrentDate()) == null) {
                calendarDate = new CalendarDate();
            }
            CalendarTabContainer bVar2 = this.f77889g;
            IRoomViewModel bVar3 = this.f77885b;
            if (bVar3 == null || (selectedDate = bVar3.getSelectedDate()) == null) {
                f = BitmapDescriptorFactory.HUE_RED;
            } else {
                IRoomViewModel bVar4 = this.f77885b;
                if (bVar4 != null) {
                    calendarDate2 = bVar4.getCurrentDate();
                } else {
                    calendarDate2 = null;
                }
                f = (float) selectedDate.dayDiff(calendarDate2);
            }
            bVar2.mo111884a(false, f);
            this.f77889g.mo111883a(calendarDate);
            return;
        }
        CalendarPresenter calendarPresenter = this.f77886c;
        if (calendarPresenter != null) {
            calendarPresenter.mo111822l();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0054  */
    @Override // com.ss.android.lark.calendar.impl.features.calendarview.main.CalendarViewBaseFragment
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo111890c() {
        /*
            r3 = this;
            android.content.Context r0 = r3.getContext()
            r3.m115360a(r0)
            int r0 = com.ss.android.lark.calendar.impl.features.calendarview.p1467c.C30667a.m114018a()
            boolean r1 = com.ss.android.lark.calendar.impl.features.calendarview.p1467c.C30667a.m114021c()
            r2 = 0
            if (r1 == 0) goto L_0x002b
            r3.m115362k()
            com.ss.android.lark.calendar.impl.features.calendarview.main.a.a r0 = r3.f77888f
            if (r0 == 0) goto L_0x0022
            com.ss.android.lark.calendar.impl.features.calendarview.widget.ViewIndicator r0 = r0.mo111863b()
            if (r0 == 0) goto L_0x0022
            r0.mo112655d()
        L_0x0022:
            com.ss.android.lark.calendar.impl.features.calendarview.room.a r0 = r3.f77890h
            if (r0 == 0) goto L_0x0048
            android.view.View r0 = r0.mo112215a()
            goto L_0x0049
        L_0x002b:
            android.content.Context r1 = r3.getContext()
            r3.m115361a(r1, r0)
            com.ss.android.lark.calendar.impl.features.calendarview.main.a.a r0 = r3.f77888f
            if (r0 == 0) goto L_0x003f
            com.ss.android.lark.calendar.impl.features.calendarview.widget.ViewIndicator r0 = r0.mo111863b()
            if (r0 == 0) goto L_0x003f
            r0.mo112654c()
        L_0x003f:
            com.ss.android.lark.calendar.impl.features.calendarview.main.CalendarPresenter r0 = r3.f77886c
            if (r0 == 0) goto L_0x0048
            android.view.View r0 = r0.mo111817g()
            goto L_0x0049
        L_0x0048:
            r0 = r2
        L_0x0049:
            com.ss.android.lark.calendar.impl.features.calendarview.main.a.a r1 = r3.f77888f
            if (r1 == 0) goto L_0x0050
            r1.mo111860a(r0)
        L_0x0050:
            com.ss.android.lark.calendar.impl.features.calendarview.main.a.a r0 = r3.f77888f
            if (r0 == 0) goto L_0x0058
            com.ss.android.lark.calendar.impl.features.calendarview.widget.MonitorFirstDrawFrameLayout r2 = r0.mo111864c()
        L_0x0058:
            android.view.View r2 = (android.view.View) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.calendarview.main.CalendarViewMainFragment.mo111890c():android.view.View");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.main.c$d */
    public static final class C30928d<T> implements AbstractC1178x<CalendarDate> {

        /* renamed from: a */
        final /* synthetic */ CalendarViewMainFragment f77898a;

        C30928d(CalendarViewMainFragment cVar) {
            this.f77898a = cVar;
        }

        /* renamed from: a */
        public final void onChanged(CalendarDate calendarDate) {
            this.f77898a.mo111960j();
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.main.CalendarMainFragmentInterface
    /* renamed from: a */
    public void mo111855a(AbstractC30028g gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "titleController");
        Log.m165389i("CalendarViewMainFragment", C32673y.m125378d("updateTitleController"));
        this.f77887e = gVar;
    }

    /* renamed from: b */
    public final void mo111957b(Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Log.m165389i("CalendarViewMainFragment", C32673y.m125378d("setActivity"));
        mo111886a(activity);
    }

    /* renamed from: a */
    private final void m115360a(Context context) {
        if (this.f77888f == null) {
            if (context != null) {
                this.f77888f = new CalendarDiagramContainer(context);
            } else {
                Log.m165383e("CalendarViewMainFragment", C32673y.m125378d("init appContext = null"));
            }
            CalendarDiagramContainer aVar = this.f77888f;
            if (aVar != null) {
                aVar.mo111861a(new C30927c(this));
            }
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.main.CalendarViewBaseFragment
    /* renamed from: b */
    public void mo111887b(Bundle bundle) {
        ViewIndicator b;
        ViewIndicator b2;
        Intrinsics.checkParameterIsNotNull(bundle, "args");
        String string = bundle.getString("view_type", "");
        String string2 = bundle.getString("view_date", "");
        if (Intrinsics.areEqual(string, "meeting")) {
            mo111959i();
            CalendarDiagramContainer aVar = this.f77888f;
            if (aVar != null && (b2 = aVar.mo111863b()) != null) {
                b2.mo112655d();
                return;
            }
            return;
        }
        CalendarDiagramContainer aVar2 = this.f77888f;
        if (!(aVar2 == null || (b = aVar2.mo111863b()) == null)) {
            b.mo112654c();
        }
        if (this.f77886c == null) {
            m115361a(getContext(), C30667a.m114018a());
            Unit unit = Unit.INSTANCE;
        }
        CalendarPresenter calendarPresenter = this.f77886c;
        if (calendarPresenter != null) {
            Intrinsics.checkExpressionValueIsNotNull(string, "viewType");
            Intrinsics.checkExpressionValueIsNotNull(string2, "viewDate");
            calendarPresenter.mo111810a(string, string2);
        }
        CalendarPresenter calendarPresenter2 = this.f77886c;
        if (calendarPresenter2 != null) {
            calendarPresenter2.mo111838t();
        }
        mo111960j();
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.lark.calendar.impl.features.calendarview.main.CalendarViewBaseFragment
    public void onViewCreated(View view, Bundle bundle) {
        CalendarPresenter calendarPresenter;
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        if (mo111889b() && (calendarPresenter = this.f77886c) != null) {
            calendarPresenter.mo111839u();
        }
    }

    /* renamed from: a */
    private final void m115361a(Context context, int i) {
        if (context != null) {
            m115360a(context);
            CalendarDiagramContainer aVar = this.f77888f;
            if (aVar != null) {
                Log.m165389i("CalendarViewMainFragment", C32673y.m125378d("createPresenter"));
                if (this.f77886c == null) {
                    CalendarPresenter calendarPresenter = new CalendarPresenter(context, C30668b.m114025a(i), aVar);
                    this.f77886c = calendarPresenter;
                    if (calendarPresenter != null) {
                        calendarPresenter.mo111808a(new C30926b(this, aVar));
                    }
                    CalendarPresenter calendarPresenter2 = this.f77886c;
                    if (calendarPresenter2 != null) {
                        calendarPresenter2.mo111809a(this.f77889g);
                    }
                    this.f77891i.mo110717a(this.f77886c);
                    this.f77891i.mo110721d();
                    this.f77891i.mo110720c();
                    return;
                }
                return;
            }
            Log.m165383e("CalendarViewMainFragment", C32673y.m125378d("mDiagramContainer = null"));
            return;
        }
        Log.m165383e("CalendarViewMainFragment", C32673y.m125378d("appContext = null"));
    }
}
