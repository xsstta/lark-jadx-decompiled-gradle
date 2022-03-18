package com.ss.android.lark.calendar.impl.features.calendarview;

import com.alibaba.fastjson.JSONObject;
import com.bytedance.lark.pb.basic.v1.Command;
import com.ss.android.lark.calendar.impl.rustadapter.p1574b.AbstractC32524a;
import com.ss.android.lark.calendar.impl.rustadapter.push.CalendarPushProcess;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30037ag;
import com.ss.android.lark.log.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\u0018\u0000 \"2\u00020\u0001:\u0002\"#B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u0014\u001a\u00020\u0012H\u0002J\b\u0010\u0015\u001a\u00020\u0012H\u0002J\u0006\u0010\u0016\u001a\u00020\u0012J\b\u0010\u0017\u001a\u00020\u0012H\u0002J\u000e\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\rJ\u000e\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\bJ\b\u0010\u001c\u001a\u00020\u0012H\u0002J\b\u0010\u001d\u001a\u00020\u0012H\u0002J\b\u0010\u001e\u001a\u00020\u0012H\u0002J\b\u0010\u001f\u001a\u00020\u0012H\u0002J\u0006\u0010 \u001a\u00020\u0012J\b\u0010!\u001a\u00020\u0012H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarPushManager;", "", "()V", "mCalendarAndEventSyncPushListener", "Lcom/ss/android/lark/calendar/impl/rustadapter/push/CalendarPushHandleCallBack;", "mCalendarEventInvitationPushListener", "mCalendarEventSyncPushListener", "mCalendarPushDirty", "", "mCalendarSyncPushListener", "mEventPushDirty", "mIsOnCalendarTab", "mPushListener", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarPushManager$IPushListener;", "mTimeFormatChangeListener", "Lcom/ss/android/lark/calendar/dependency/idependency/ITimeFormatDependency$ITimeFormatChangeListener;", "mTimeFormatPushDirty", "registerCalendarAndEventSyncPush", "", "registerCalendarEventInvitationPush", "registerCalendarEventSyncPush", "registerCalendarSyncPush", "registerPush", "registerTimeFormatChangePush", "setPushListener", "pushListener", "switchMainTab", "isCalendarTab", "unRegisterCalendarAndEventSyncPush", "unRegisterCalendarEventInvitationPush", "unRegisterCalendarEventSyncPush", "unRegisterCalendarSyncPush", "unRegisterPush", "unRegisterTimeFormatChangePush", "Companion", "IPushListener", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.d */
public final class CalendarPushManager {

    /* renamed from: f */
    public static final Companion f76939f = new Companion(null);

    /* renamed from: a */
    public IPushListener f76940a;

    /* renamed from: b */
    public boolean f76941b = true;

    /* renamed from: c */
    public boolean f76942c;

    /* renamed from: d */
    public boolean f76943d;

    /* renamed from: e */
    public boolean f76944e;

    /* renamed from: g */
    private AbstractC30037ag.AbstractC30038a f76945g;

    /* renamed from: h */
    private AbstractC32524a f76946h;

    /* renamed from: i */
    private AbstractC32524a f76947i;

    /* renamed from: j */
    private AbstractC32524a f76948j;

    /* renamed from: k */
    private AbstractC32524a f76949k;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarPushManager$IPushListener;", "", "onLoadAllCalendars", "", "onLoadCalendarsAndEvents", "onLoadEvents", "onRefreshTimeFormat", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.d$b */
    public interface IPushListener {
        /* renamed from: a */
        void mo110866a();

        /* renamed from: b */
        void mo110867b();

        /* renamed from: c */
        void mo110868c();

        /* renamed from: d */
        void mo110869d();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarPushManager$Companion;", "", "()V", "TAG", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: d */
    private final void m114193d() {
        if (this.f76945g != null) {
            C30022a.f74882a.timeFormatDependency().mo108190b(this.f76945g);
        }
    }

    /* renamed from: f */
    private final void m114195f() {
        if (this.f76946h != null) {
            CalendarPushProcess.f83425a.mo118827b(Command.PUSH_CALENDAR_SYNC_NOTIFICATION, this.f76946h);
        }
    }

    /* renamed from: h */
    private final void m114197h() {
        if (this.f76947i != null) {
            CalendarPushProcess.f83425a.mo118827b(Command.PUSH_CALENDAR_AND_EVENT_SYNC_NOTIFICATION, this.f76947i);
        }
    }

    /* renamed from: j */
    private final void m114199j() {
        if (this.f76948j != null) {
            CalendarPushProcess.f83425a.mo118827b(Command.PUSH_CALENDAR_EVENT_SYNC_NOTIFICATION, this.f76948j);
        }
    }

    /* renamed from: k */
    private final void m114200k() {
        this.f76949k = C30693d.f76951a;
        CalendarPushProcess.f83425a.mo118826a(Command.PUSH_CALENDAR_EVENT_INVITATION, this.f76949k);
    }

    /* renamed from: l */
    private final void m114201l() {
        if (this.f76949k != null) {
            CalendarPushProcess.f83425a.mo118827b(Command.PUSH_CALENDAR_EVENT_INVITATION, this.f76949k);
        }
    }

    /* renamed from: a */
    public final void mo110862a() {
        m114192c();
        m114194e();
        m114196g();
        m114198i();
        m114200k();
    }

    /* renamed from: b */
    public final void mo110865b() {
        m114193d();
        m114195f();
        m114197h();
        m114199j();
        m114201l();
    }

    /* renamed from: c */
    private final void m114192c() {
        this.f76945g = new C30696g(this);
        C30022a.f74882a.timeFormatDependency().mo108188a(this.f76945g);
    }

    /* renamed from: e */
    private final void m114194e() {
        this.f76946h = new C30695f(this);
        CalendarPushProcess.f83425a.mo118826a(Command.PUSH_CALENDAR_SYNC_NOTIFICATION, this.f76946h);
    }

    /* renamed from: g */
    private final void m114196g() {
        this.f76947i = new C30692c(this);
        CalendarPushProcess.f83425a.mo118826a(Command.PUSH_CALENDAR_AND_EVENT_SYNC_NOTIFICATION, this.f76947i);
    }

    /* renamed from: i */
    private final void m114198i() {
        this.f76948j = new C30694e(this);
        CalendarPushProcess.f83425a.mo118826a(Command.PUSH_CALENDAR_EVENT_SYNC_NOTIFICATION, this.f76948j);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onTimeFormatChange"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.d$g */
    public static final class C30696g implements AbstractC30037ag.AbstractC30038a {

        /* renamed from: a */
        final /* synthetic */ CalendarPushManager f76954a;

        C30696g(CalendarPushManager dVar) {
            this.f76954a = dVar;
        }

        @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30037ag.AbstractC30038a
        /* renamed from: a */
        public final void mo108191a() {
            if (!this.f76954a.f76941b) {
                Log.m165389i("CalendarPushManager", C32673y.m125374b("dirty_pushTimeFormatChange"));
                this.f76954a.f76944e = true;
                return;
            }
            Log.m165389i("CalendarPushManager", C32673y.m125374b("pushTimeFormatChange"));
            IPushListener bVar = this.f76954a.f76940a;
            if (bVar != null) {
                bVar.mo110866a();
            }
        }
    }

    /* renamed from: a */
    public final void mo110863a(IPushListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "pushListener");
        this.f76940a = bVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000b\u0010\u0002\u001a\u00070\u0003¢\u0006\u0002\b\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/alibaba/fastjson/JSONObject;", "Lorg/jetbrains/annotations/NotNull;", "onPush"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.d$d */
    public static final class C30693d implements AbstractC32524a {

        /* renamed from: a */
        public static final C30693d f76951a = new C30693d();

        C30693d() {
        }

        @Override // com.ss.android.lark.calendar.impl.rustadapter.p1574b.AbstractC32524a
        public final void onPush(JSONObject jSONObject) {
            Intrinsics.checkParameterIsNotNull(jSONObject, "it");
            Log.m165389i("CalendarPushManager", C32673y.m125374b("pushInvite"));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000b\u0010\u0002\u001a\u00070\u0003¢\u0006\u0002\b\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/alibaba/fastjson/JSONObject;", "Lorg/jetbrains/annotations/NotNull;", "onPush"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.d$c */
    public static final class C30692c implements AbstractC32524a {

        /* renamed from: a */
        final /* synthetic */ CalendarPushManager f76950a;

        C30692c(CalendarPushManager dVar) {
            this.f76950a = dVar;
        }

        @Override // com.ss.android.lark.calendar.impl.rustadapter.p1574b.AbstractC32524a
        public final void onPush(JSONObject jSONObject) {
            Intrinsics.checkParameterIsNotNull(jSONObject, "it");
            if (!this.f76950a.f76941b) {
                Log.m165389i("CalendarPushManager", C32673y.m125374b("dirty_pushCalEventSync"));
                this.f76950a.f76943d = true;
                this.f76950a.f76942c = true;
                return;
            }
            Log.m165389i("CalendarPushManager", C32673y.m125374b("pushCalEventSync"));
            IPushListener bVar = this.f76950a.f76940a;
            if (bVar != null) {
                bVar.mo110868c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000b\u0010\u0002\u001a\u00070\u0003¢\u0006\u0002\b\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/alibaba/fastjson/JSONObject;", "Lorg/jetbrains/annotations/NotNull;", "onPush"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.d$e */
    public static final class C30694e implements AbstractC32524a {

        /* renamed from: a */
        final /* synthetic */ CalendarPushManager f76952a;

        C30694e(CalendarPushManager dVar) {
            this.f76952a = dVar;
        }

        @Override // com.ss.android.lark.calendar.impl.rustadapter.p1574b.AbstractC32524a
        public final void onPush(JSONObject jSONObject) {
            Intrinsics.checkParameterIsNotNull(jSONObject, "it");
            if (!this.f76952a.f76941b) {
                Log.m165389i("CalendarPushManager", C32673y.m125374b("dirty_pushEventSync"));
                this.f76952a.f76942c = true;
                return;
            }
            Log.m165389i("CalendarPushManager", C32673y.m125374b("pushEventSync"));
            IPushListener bVar = this.f76952a.f76940a;
            if (bVar != null) {
                bVar.mo110869d();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000b\u0010\u0002\u001a\u00070\u0003¢\u0006\u0002\b\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/alibaba/fastjson/JSONObject;", "Lorg/jetbrains/annotations/NotNull;", "onPush"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.d$f */
    public static final class C30695f implements AbstractC32524a {

        /* renamed from: a */
        final /* synthetic */ CalendarPushManager f76953a;

        C30695f(CalendarPushManager dVar) {
            this.f76953a = dVar;
        }

        @Override // com.ss.android.lark.calendar.impl.rustadapter.p1574b.AbstractC32524a
        public final void onPush(JSONObject jSONObject) {
            Intrinsics.checkParameterIsNotNull(jSONObject, "it");
            if (!this.f76953a.f76941b) {
                Log.m165389i("CalendarPushManager", C32673y.m125374b("dirty_pushCalSync"));
                this.f76953a.f76943d = true;
                return;
            }
            Log.m165389i("CalendarPushManager", C32673y.m125374b("pushCalSync"));
            IPushListener bVar = this.f76953a.f76940a;
            if (bVar != null) {
                bVar.mo110867b();
            }
        }
    }

    /* renamed from: a */
    public final void mo110864a(boolean z) {
        this.f76941b = z;
        if (z) {
            if (this.f76943d) {
                Log.m165389i("CalendarPushManager", C32673y.m125374b("calendarSync"));
                IPushListener bVar = this.f76940a;
                if (bVar != null) {
                    bVar.mo110867b();
                }
            }
            if (this.f76942c) {
                Log.m165389i("CalendarPushManager", C32673y.m125374b("eventSync"));
                IPushListener bVar2 = this.f76940a;
                if (bVar2 != null) {
                    bVar2.mo110869d();
                }
            }
            if (this.f76944e) {
                Log.m165389i("CalendarPushManager", C32673y.m125374b("timeFormatPush"));
                IPushListener bVar3 = this.f76940a;
                if (bVar3 != null) {
                    bVar3.mo110866a();
                }
            }
            this.f76943d = false;
            this.f76942c = false;
            this.f76944e = false;
        }
    }
}
