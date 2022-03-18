package com.ss.android.lark.calendar.impl.features.calendarview.main.viewmodel;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.eventbus.EventBus;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.calendarview.p1467c.C30667a;
import com.ss.android.lark.calendar.impl.framework.C32484a;
import com.ss.android.lark.calendar.impl.framework.busevents.CalendarViewSwitchEvent;
import com.ss.android.lark.calendar.impl.framework.busevents.SettingChangedEvent;
import com.ss.android.lark.calendar.impl.framework.p1568a.C32485a;
import com.ss.android.lark.calendar.impl.framework.p1568a.C32486b;
import com.ss.android.lark.calendar.impl.framework.p1568a.C32487d;
import com.ss.android.lark.calendar.impl.framework.p1568a.C32489g;
import com.ss.android.lark.calendar.impl.framework.p1568a.C32490h;
import com.ss.android.lark.calendar.impl.framework.p1568a.C32493l;
import com.ss.android.lark.calendar.impl.framework.viewmodel.RxEvent;
import com.ss.android.lark.calendar.impl.framework.viewmodel.RxMutableEvent;
import com.ss.android.lark.calendar.impl.framework.viewmodel.RxMutableState;
import com.ss.android.lark.calendar.impl.framework.viewmodel.RxState;
import com.ss.android.lark.calendar.impl.p1437b.p1438a.C30076a;
import com.ss.android.lark.calendar.impl.rustadapter.p1574b.AbstractC32524a;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32583e;
import com.ss.android.lark.calendar.impl.rustadapter.push.CalendarPushProcess;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30037ag;
import com.ss.android.lark.log.Log;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class CalendarShellViewModel implements AbstractC30037ag.AbstractC30038a {

    /* renamed from: a */
    public static final CalendarShellViewModel f77899a = new CalendarShellViewModel();

    /* renamed from: b */
    private static final Context f77900b;

    /* renamed from: c */
    private static final RxMutableEvent<ViewMode> f77901c = new RxMutableEvent<>();

    /* renamed from: d */
    private static ViewMode f77902d;

    /* renamed from: e */
    private static final Lazy f77903e = LazyKt.lazy(C30932d.INSTANCE);

    /* renamed from: f */
    private static final Lazy f77904f = LazyKt.lazy(C30933e.INSTANCE);

    /* renamed from: g */
    private static final RxMutableEvent<C32490h> f77905g = new RxMutableEvent<>();

    /* renamed from: h */
    private static final CalendarShellViewModel$timeZoneChangedReceiver$1 f77906h = new CalendarShellViewModel$timeZoneChangedReceiver$1();

    /* renamed from: i */
    private static final RxMutableEvent<Boolean> f77907i = new RxMutableEvent<>();

    /* renamed from: j */
    private static final RxMutableEvent<C32485a> f77908j = new RxMutableEvent<>();

    /* renamed from: k */
    private static final RxMutableEvent<SettingChangedEvent> f77909k = new RxMutableEvent<>();

    /* renamed from: l */
    private static final RxMutableEvent<Object> f77910l = new RxMutableEvent<>();

    /* renamed from: m */
    private static final RxMutableEvent<Object> f77911m = new RxMutableEvent<>();

    /* renamed from: n */
    private static final AbstractC32524a f77912n = C30931c.f77924a;

    /* renamed from: o */
    private static final AbstractC32524a f77913o = C30930b.f77923a;

    /* renamed from: p */
    private static final AbstractC32524a f77914p = C30929a.f77922a;

    /* renamed from: q */
    private static final RxMutableEvent<C32487d> f77915q = new RxMutableEvent<>();

    /* renamed from: r */
    private static final RxMutableEvent<C32489g> f77916r = new RxMutableEvent<>();

    /* renamed from: s */
    private static final RxMutableEvent<Object> f77917s = new RxMutableEvent<>();

    /* renamed from: t */
    private static final RxMutableEvent<Object> f77918t = new RxMutableEvent<>();

    /* renamed from: u */
    private static long f77919u = -1;

    /* renamed from: v */
    private static long f77920v = -1;

    /* renamed from: w */
    private static AtomicInteger f77921w = new AtomicInteger(0);

    /* renamed from: x */
    private final RxMutableState<Integer> m115391x() {
        return (RxMutableState) f77903e.getValue();
    }

    /* renamed from: y */
    private final RxMutableState<Integer> m115392y() {
        return (RxMutableState) f77904f.getValue();
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.main.viewmodel.CalendarShellViewModel$f */
    public static final class C30934f implements IGetDataCallback<Boolean> {
        C30934f() {
        }

        /* renamed from: a */
        public void onSuccess(Boolean bool) {
            Log.m165389i("CalendarShellView", "onAppendEvent onSuccess " + bool);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165389i("CalendarShellView", "onAppendEvent onError " + errorResult.getErrorCode() + ' ' + errorResult.getDebugMsg());
        }
    }

    private CalendarShellViewModel() {
    }

    /* renamed from: o */
    public final long mo111982o() {
        return f77919u;
    }

    /* renamed from: p */
    public final long mo111991p() {
        return f77920v;
    }

    /* renamed from: b */
    public final RxEvent<ViewMode> mo111967b() {
        return f77901c;
    }

    /* renamed from: c */
    public final ViewMode mo111970c() {
        return f77902d;
    }

    /* renamed from: d */
    public final RxState<Integer> mo111971d() {
        return m115391x();
    }

    /* renamed from: e */
    public final RxState<Integer> mo111972e() {
        return m115392y();
    }

    /* renamed from: f */
    public final RxEvent<C32490h> mo111973f() {
        return f77905g;
    }

    /* renamed from: g */
    public final RxEvent<Boolean> mo111974g() {
        return f77907i;
    }

    /* renamed from: h */
    public final RxEvent<C32485a> mo111975h() {
        return f77908j;
    }

    /* renamed from: i */
    public final RxEvent<SettingChangedEvent> mo111976i() {
        return f77909k;
    }

    /* renamed from: j */
    public final RxEvent<Object> mo111977j() {
        return f77910l;
    }

    /* renamed from: k */
    public final RxEvent<C32487d> mo111978k() {
        return f77915q;
    }

    /* renamed from: l */
    public final RxEvent<C32489g> mo111979l() {
        return f77916r;
    }

    /* renamed from: m */
    public final RxEvent<Object> mo111980m() {
        return f77917s;
    }

    /* renamed from: n */
    public final RxEvent<Object> mo111981n() {
        return f77918t;
    }

    /* renamed from: u */
    public final void mo111996u() {
        Log.m165389i("CalendarShellView", "backToday");
        f77917s.mo118782a(Unit.INSTANCE);
    }

    /* renamed from: v */
    public final void mo111997v() {
        Log.m165389i("CalendarShellView", "animateAppendButton");
        f77918t.mo118782a(Unit.INSTANCE);
    }

    /* renamed from: w */
    public final boolean mo111998w() {
        AbstractC30037ag timeFormatDependency = C30022a.f74882a.timeFormatDependency();
        Intrinsics.checkExpressionValueIsNotNull(timeFormatDependency, "CalendarDependencyHolder…cy.timeFormatDependency()");
        return timeFormatDependency.mo108189a();
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.main.viewmodel.CalendarShellViewModel$d */
    static final class C30932d extends Lambda implements Function0<RxMutableState<Integer>> {
        public static final C30932d INSTANCE = new C30932d();

        C30932d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final RxMutableState<Integer> invoke() {
            return new RxMutableState<>(Integer.valueOf(new CalendarDate().getJulianDay()));
        }
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.main.viewmodel.CalendarShellViewModel$e */
    static final class C30933e extends Lambda implements Function0<RxMutableState<Integer>> {
        public static final C30933e INSTANCE = new C30933e();

        C30933e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final RxMutableState<Integer> invoke() {
            return new RxMutableState<>(Integer.valueOf(new CalendarDate().getJulianDay()));
        }
    }

    /* renamed from: s */
    public final void mo111994s() {
        Log.m165389i("CalendarShellView", "selectMeetingRoom");
        C30667a.m114022d();
        m115387a(new ViewMode(1, C30667a.m114020b()));
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30037ag.AbstractC30038a
    /* renamed from: a */
    public void mo108191a() {
        boolean w = mo111998w();
        Log.m165389i("CalendarShellView", "ReloadAllEvent " + w);
        f77907i.mo118782a(Boolean.valueOf(w));
    }

    /* renamed from: t */
    public final CalendarDate mo111995t() {
        int i;
        CalendarDate calendarDate = new CalendarDate();
        if (f77902d.mo112001a()) {
            i = mo111972e().mo118786a().intValue();
        } else {
            i = mo111971d().mo118786a().intValue();
        }
        CalendarDate julianDay = calendarDate.setJulianDay(i);
        Intrinsics.checkExpressionValueIsNotNull(julianDay, "CalendarDate().setJulian…ctedDayState.value\n    })");
        return julianDay;
    }

    /* renamed from: q */
    public final void mo111992q() {
        if (f77921w.getAndIncrement() <= 0) {
            Log.m165389i("CalendarShellView", "vm start");
            EventBus.getDefault().register(this);
            C30022a.f74882a.timeFormatDependency().mo108188a(this);
            CalendarPushProcess.f83425a.mo118826a(Command.PUSH_CALENDAR_EVENT_SYNC_NOTIFICATION, f77912n);
            CalendarPushProcess.f83425a.mo118826a(Command.PUSH_CALENDAR_SYNC_NOTIFICATION, f77913o);
            CalendarPushProcess.f83425a.mo118826a(Command.PUSH_CALENDAR_AND_EVENT_SYNC_NOTIFICATION, f77914p);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            m115384a(f77900b, f77906h, intentFilter);
            C30076a.m111290a().mo108431c();
            C32583e.m124816a().mo119040b();
        }
    }

    /* renamed from: r */
    public final void mo111993r() {
        if (f77921w.decrementAndGet() <= 0) {
            Log.m165389i("CalendarShellView", "vm stop");
            EventBus.getDefault().unregister(this);
            C30022a.f74882a.timeFormatDependency().mo108190b(this);
            CalendarPushProcess.f83425a.mo118827b(Command.PUSH_CALENDAR_EVENT_SYNC_NOTIFICATION, f77912n);
            CalendarPushProcess.f83425a.mo118827b(Command.PUSH_CALENDAR_SYNC_NOTIFICATION, f77913o);
            CalendarPushProcess.f83425a.mo118827b(Command.PUSH_CALENDAR_AND_EVENT_SYNC_NOTIFICATION, f77914p);
            f77900b.unregisterReceiver(f77906h);
        }
    }

    static {
        Context a = new C32484a().mo118635a();
        Intrinsics.checkExpressionValueIsNotNull(a, "CalendarContext().appContext");
        f77900b = a.getApplicationContext();
        boolean c = C30667a.m114021c();
        f77902d = new ViewMode(c ? 1 : 0, C30667a.m114020b());
    }

    /* renamed from: a */
    private final void m115387a(ViewMode aVar) {
        f77902d = aVar;
        f77901c.mo118782a(aVar);
    }

    /* renamed from: b */
    public final void mo111969b(long j) {
        f77920v = j;
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.main.viewmodel.CalendarShellViewModel$a */
    static final class C30929a implements AbstractC32524a {

        /* renamed from: a */
        public static final C30929a f77922a = new C30929a();

        C30929a() {
        }

        @Override // com.ss.android.lark.calendar.impl.rustadapter.p1574b.AbstractC32524a
        public final void onPush(JSONObject jSONObject) {
            Intrinsics.checkParameterIsNotNull(jSONObject, "it");
            CalendarShellViewModel calendarShellViewModel = CalendarShellViewModel.f77899a;
            CalendarShellViewModel.f77912n.onPush(jSONObject);
            CalendarShellViewModel calendarShellViewModel2 = CalendarShellViewModel.f77899a;
            CalendarShellViewModel.f77913o.onPush(jSONObject);
        }
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.main.viewmodel.CalendarShellViewModel$b */
    static final class C30930b implements AbstractC32524a {

        /* renamed from: a */
        public static final C30930b f77923a = new C30930b();

        C30930b() {
        }

        @Override // com.ss.android.lark.calendar.impl.rustadapter.p1574b.AbstractC32524a
        public final void onPush(JSONObject jSONObject) {
            Intrinsics.checkParameterIsNotNull(jSONObject, "it");
            CalendarShellViewModel calendarShellViewModel = CalendarShellViewModel.f77899a;
            CalendarShellViewModel.f77911m.mo118782a(Unit.INSTANCE);
            C30076a.m111290a().mo108431c();
        }
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.main.viewmodel.CalendarShellViewModel$c */
    static final class C30931c implements AbstractC32524a {

        /* renamed from: a */
        public static final C30931c f77924a = new C30931c();

        C30931c() {
        }

        @Override // com.ss.android.lark.calendar.impl.rustadapter.p1574b.AbstractC32524a
        public final void onPush(JSONObject jSONObject) {
            Intrinsics.checkParameterIsNotNull(jSONObject, "it");
            CalendarShellViewModel calendarShellViewModel = CalendarShellViewModel.f77899a;
            CalendarShellViewModel.f77910l.mo118782a(Unit.INSTANCE);
        }
    }

    public final void onAccountChangedEvent(C32485a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "event");
        Log.m165389i("CalendarShellView", "AccountChangedEvent");
        f77908j.mo118782a(aVar);
        mo108191a();
        onNormalViewTimeZoneChangedEvent(new C32490h());
    }

    public final void onInvalidTimeZoneEvent(C32489g gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "event");
        Log.m165389i("CalendarShellView", "InvalidTimeZoneEvent");
        f77916r.mo118782a(gVar);
    }

    public final void onLaunchFinished(C32487d dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "event");
        Log.m165389i("CalendarShellView", "CalendarColdLaunchFinishEvent");
        f77915q.mo118782a(dVar);
    }

    public final void onNormalViewTimeZoneChangedEvent(C32490h hVar) {
        Intrinsics.checkParameterIsNotNull(hVar, "event");
        Log.m165389i("CalendarShellView", "NormalViewTimeZoneChangedEvent");
        f77905g.mo118782a(hVar);
    }

    public final void onReloadAllEvent(C32493l lVar) {
        Intrinsics.checkParameterIsNotNull(lVar, "event");
        Log.m165389i("CalendarShellView", "ReloadAllEvent");
        f77910l.mo118782a(lVar);
    }

    public final void onSettingChangedEvent(SettingChangedEvent mVar) {
        Intrinsics.checkParameterIsNotNull(mVar, "event");
        Log.m165389i("CalendarShellView", "SettingChangedEvent");
        f77909k.mo118782a(mVar);
    }

    /* renamed from: b */
    public final void mo111968b(int i) {
        Log.m165389i("CalendarShellView", "updateMeetingRoomSelectedDate " + i);
        m115392y().mo118782a(Integer.valueOf(i));
    }

    public final void onAppendEvent(C32486b bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "appendEvent");
        String a = bVar.mo118637a();
        Log.m165389i("CalendarShellView", "onAppendEvent " + a);
        C30076a.m111290a().mo108425a(a, true, (IGetDataCallback<Boolean>) new C30934f());
    }

    public final void onCalendarViewSwitchEvent(CalendarViewSwitchEvent fVar) {
        Intrinsics.checkParameterIsNotNull(fVar, "event");
        Log.m165389i("CalendarShellView", "CalendarViewSwitchEvent " + fVar.mo118646a());
        m115387a(new ViewMode(0, fVar.mo118646a()));
    }

    /* renamed from: a */
    public final void mo111964a(int i) {
        Log.m165389i("CalendarShellView", "updateCalendarSelectedDate " + i);
        m115391x().mo118782a(Integer.valueOf(i));
    }

    /* renamed from: a */
    public final void mo111965a(long j) {
        f77919u = j;
    }

    /* renamed from: a */
    public final void mo111966a(Integer num) {
        Log.m165389i("CalendarShellView", "selectCalendar " + num);
        if (num != null) {
            num.intValue();
            C30667a.m114019a(num.intValue());
        }
        C30667a.m114023e();
        m115387a(new ViewMode(0, C30667a.m114020b()));
    }

    /* renamed from: a */
    public static Intent m115384a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m115386a(CalendarShellViewModel calendarShellViewModel, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        calendarShellViewModel.mo111966a(num);
    }
}
