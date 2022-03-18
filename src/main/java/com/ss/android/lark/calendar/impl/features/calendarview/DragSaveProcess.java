package com.ss.android.lark.calendar.impl.features.calendarview;

import android.app.Activity;
import android.content.Context;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.calendar.impl.features.events.edit.listener.process.INotificationListener;
import com.ss.android.lark.calendar.impl.features.events.edit.operation.NotificationProcess;
import com.ss.android.lark.calendar.impl.features.local.C31927d;
import com.ss.android.lark.calendar.impl.features.meetingroom.base.ResourceDragSaveProcess;
import com.ss.android.lark.calendar.impl.features.meetingroom.base.helper.OriginalEventData;
import com.ss.android.lark.calendar.impl.features.meetingroom.base.helper.ResourceApprovalDataHelper;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventInstance;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32533b;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.impl.utils.aj;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30029ab;
import com.ss.android.lark.log.Log;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.util.Date;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 '2\u00020\u0001:\u0002'(B\u0015\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0006\u0010\u000f\u001a\u00020\u0010J2\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001aJL\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u001e\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\u0017H\u0002J\u000e\u0010#\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\fJ\u001e\u0010%\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017J\u0012\u0010&\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002R\u0016\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\tX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/DragSaveProcess;", "", "activity", "Lkotlin/Function0;", "Landroid/app/Activity;", "(Lkotlin/jvm/functions/Function0;)V", "callbackManager", "Lcom/larksuite/framework/callback/CallbackManager;", "mCalendarEventService", "Lcom/ss/android/lark/calendar/impl/rustadapter/service/CalendarEventService;", "kotlin.jvm.PlatformType", "mDragSaveListener", "Lcom/ss/android/lark/calendar/impl/features/calendarview/DragSaveProcess$DragSaveListener;", "mNotificationProcess", "Lcom/ss/android/lark/calendar/impl/features/events/edit/operation/NotificationProcess;", "clear", "", "saveEventInstances", "event", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "instance", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventInstance;", "startTime", "", "endTime", "notificationType", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent$NotificationType;", "saveInterceptProcess", "context", "Landroid/content/Context;", "originalEvent", "span", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent$Span;", "viewStartTime", "viewEndTime", "setDragSaveListener", "dragSaveListener", "startNotificationOnEditChipView", "syncGetEvent", "Companion", "DragSaveListener", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.g */
public final class DragSaveProcess {

    /* renamed from: e */
    public static final Companion f77479e = new Companion(null);

    /* renamed from: a */
    public final CallbackManager f77480a = new CallbackManager();

    /* renamed from: b */
    public DragSaveListener f77481b;

    /* renamed from: c */
    public final NotificationProcess f77482c;

    /* renamed from: d */
    public final C32533b f77483d;

    /* renamed from: f */
    private final Function0<Activity> f77484f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/DragSaveProcess$DragSaveListener;", "", "onActiveRefresh", "", "onCancelSave", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.g$b */
    public interface DragSaveListener {
        /* renamed from: a */
        void mo111622a();

        /* renamed from: b */
        void mo111623b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/DragSaveProcess$Companion;", "", "()V", "TAG", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.g$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "produce"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.g$c */
    public static final class C30806c<T> implements AbstractC30029ab.AbstractC30032c<Boolean> {

        /* renamed from: a */
        final /* synthetic */ DragSaveProcess f77486a;

        /* renamed from: b */
        final /* synthetic */ CalendarEventInstance f77487b;

        /* renamed from: c */
        final /* synthetic */ long f77488c;

        /* renamed from: d */
        final /* synthetic */ long f77489d;

        /* renamed from: e */
        final /* synthetic */ CalendarEvent.NotificationType f77490e;

        /* renamed from: f */
        final /* synthetic */ CalendarEvent f77491f;

        C30806c(DragSaveProcess gVar, CalendarEventInstance calendarEventInstance, long j, long j2, CalendarEvent.NotificationType notificationType, CalendarEvent calendarEvent) {
            this.f77486a = gVar;
            this.f77487b = calendarEventInstance;
            this.f77488c = j;
            this.f77489d = j2;
            this.f77490e = notificationType;
            this.f77491f = calendarEvent;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30029ab.AbstractC30032c
        /* renamed from: a */
        public /* synthetic */ Boolean mo108174a() {
            return Boolean.valueOf(mo111624b());
        }

        /* renamed from: b */
        public final boolean mo111624b() {
            CalendarEvent.Span span;
            CalendarEvent.Span span2;
            if (this.f77487b.getSource() == CalendarEvent.Source.ANDROID) {
                CalendarEvent d = C31927d.m121459a().mo116552d(this.f77487b.getEventId());
                if (d == null) {
                    return false;
                }
                Intrinsics.checkExpressionValueIsNotNull(d, "LocalCalendarProvider.ge…?: return@IProducer false");
                CalendarEvent calendarEvent = new CalendarEvent(d);
                d.setStartTime(this.f77488c);
                d.setEndTime(this.f77489d);
                if (aj.m125201a(d.getRRule())) {
                    span2 = CalendarEvent.Span.NONE_SPAN;
                } else {
                    span2 = CalendarEvent.Span.THIS_EVENT;
                }
                GeneralHitPoint.m124203a("instance_block", "edit", this.f77490e, d, calendarEvent, "", "", null, SmActions.ACTION_ONTHECALL_EXIT, null);
                if (C31927d.m121459a().mo116542a(d, calendarEvent, this.f77487b, span2) != null) {
                    return true;
                }
            } else {
                CalendarEvent a = this.f77486a.mo111611a(this.f77487b);
                CalendarEvent calendarEvent2 = this.f77491f;
                if (calendarEvent2 == null || a == null) {
                    return false;
                }
                calendarEvent2.setNotificationType(this.f77490e);
                if (aj.m125201a(this.f77491f.getRRule())) {
                    span = CalendarEvent.Span.NONE_SPAN;
                } else {
                    span = CalendarEvent.Span.THIS_EVENT;
                }
                GeneralHitPoint.m124203a("instance_block", "edit", this.f77490e, this.f77491f, a, "", "", null, SmActions.ACTION_ONTHECALL_EXIT, null);
                if (this.f77486a.f77483d.mo118847a(this.f77491f, a, this.f77487b, span) != null) {
                    return true;
                }
            }
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendarview/DragSaveProcess$saveInterceptProcess$dragSaveActionListener$1", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/base/ResourceDragSaveProcess$DragSaveActionListener;", "cancelSave", "", "nextActionProcess", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.g$e */
    public static final class C30808e implements ResourceDragSaveProcess.DragSaveActionListener {

        /* renamed from: a */
        final /* synthetic */ DragSaveProcess f77494a;

        /* renamed from: b */
        final /* synthetic */ Context f77495b;

        /* renamed from: c */
        final /* synthetic */ CallbackManager f77496c;

        /* renamed from: d */
        final /* synthetic */ CalendarEvent f77497d;

        /* renamed from: e */
        final /* synthetic */ CalendarEvent f77498e;

        /* renamed from: f */
        final /* synthetic */ CalendarEventInstance f77499f;

        /* renamed from: g */
        final /* synthetic */ CalendarEvent.Span f77500g;

        /* renamed from: h */
        final /* synthetic */ long f77501h;

        /* renamed from: i */
        final /* synthetic */ long f77502i;

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.base.ResourceDragSaveProcess.DragSaveActionListener
        /* renamed from: b */
        public void mo111627b() {
            DragSaveListener bVar = this.f77494a.f77481b;
            if (bVar != null) {
                bVar.mo111622a();
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.base.ResourceDragSaveProcess.DragSaveActionListener
        /* renamed from: a */
        public void mo111626a() {
            this.f77494a.f77482c.mo114698a(this.f77495b, this.f77496c, this.f77497d, this.f77498e, this.f77499f, this.f77500g, this.f77501h, this.f77502i);
        }

        C30808e(DragSaveProcess gVar, Context context, CallbackManager callbackManager, CalendarEvent calendarEvent, CalendarEvent calendarEvent2, CalendarEventInstance calendarEventInstance, CalendarEvent.Span span, long j, long j2) {
            this.f77494a = gVar;
            this.f77495b = context;
            this.f77496c = callbackManager;
            this.f77497d = calendarEvent;
            this.f77498e = calendarEvent2;
            this.f77499f = calendarEventInstance;
            this.f77500g = span;
            this.f77501h = j;
            this.f77502i = j2;
        }
    }

    /* renamed from: a */
    public final void mo111612a() {
        this.f77481b = null;
        this.f77480a.cancelCallbacks();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.g$f */
    public static final class RunnableC30809f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DragSaveProcess f77503a;

        /* renamed from: b */
        final /* synthetic */ CalendarEventInstance f77504b;

        /* renamed from: c */
        final /* synthetic */ long f77505c;

        /* renamed from: d */
        final /* synthetic */ long f77506d;

        /* renamed from: e */
        final /* synthetic */ Activity f77507e;

        RunnableC30809f(DragSaveProcess gVar, CalendarEventInstance calendarEventInstance, long j, long j2, Activity activity) {
            this.f77503a = gVar;
            this.f77504b = calendarEventInstance;
            this.f77505c = j;
            this.f77506d = j2;
            this.f77507e = activity;
        }

        public final void run() {
            CalendarEvent.Span span;
            if (this.f77504b.getSource() == CalendarEvent.Source.ANDROID) {
                this.f77503a.mo111615a(null, this.f77504b, this.f77505c, this.f77506d, CalendarEvent.NotificationType.DEFAULT_NOTIFICATION_TYPE);
                return;
            }
            CalendarEvent a = this.f77503a.mo111611a(this.f77504b);
            if (a == null) {
                this.f77503a.mo111615a(null, this.f77504b, this.f77505c, this.f77506d, CalendarEvent.NotificationType.DEFAULT_NOTIFICATION_TYPE);
                return;
            }
            CalendarEvent calendarEvent = new CalendarEvent(a);
            a.setStartTime(this.f77505c);
            a.setEndTime(this.f77506d);
            if (aj.m125201a(a.getRRule())) {
                span = CalendarEvent.Span.NONE_SPAN;
            } else {
                span = CalendarEvent.Span.THIS_EVENT;
            }
            DragSaveProcess gVar = this.f77503a;
            gVar.mo111613a(this.f77507e, gVar.f77480a, a, calendarEvent, this.f77504b, span, this.f77505c, this.f77506d);
        }
    }

    /* renamed from: a */
    public final void mo111614a(DragSaveListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "dragSaveListener");
        this.f77481b = bVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function0<? extends android.app.Activity> */
    /* JADX WARN: Multi-variable type inference failed */
    public DragSaveProcess(Function0<? extends Activity> function0) {
        Intrinsics.checkParameterIsNotNull(function0, "activity");
        this.f77484f = function0;
        NotificationProcess dVar = new NotificationProcess();
        this.f77482c = dVar;
        this.f77483d = C32533b.m124620a();
        dVar.mo114702a(new INotificationListener(this) {
            /* class com.ss.android.lark.calendar.impl.features.calendarview.DragSaveProcess.C308051 */

            /* renamed from: a */
            final /* synthetic */ DragSaveProcess f77485a;

            @Override // com.ss.android.lark.calendar.impl.features.events.edit.listener.process.INotificationListener
            /* renamed from: a */
            public void mo111617a() {
                DragSaveListener bVar = this.f77485a.f77481b;
                if (bVar != null) {
                    bVar.mo111622a();
                }
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f77485a = r1;
            }

            @Override // com.ss.android.lark.calendar.impl.features.events.edit.listener.process.INotificationListener
            /* renamed from: b */
            public void mo111620b(CalendarEvent calendarEvent, CalendarEventInstance calendarEventInstance, long j, long j2) {
                this.f77485a.mo111615a(calendarEvent, calendarEventInstance, j, j2, CalendarEvent.NotificationType.DEFAULT_NOTIFICATION_TYPE);
            }

            @Override // com.ss.android.lark.calendar.impl.features.events.edit.listener.process.INotificationListener
            /* renamed from: a */
            public void mo111618a(CalendarEvent calendarEvent, CalendarEventInstance calendarEventInstance, long j, long j2) {
                this.f77485a.mo111615a(calendarEvent, calendarEventInstance, j, j2, CalendarEvent.NotificationType.DEFAULT_NOTIFICATION_TYPE);
            }

            @Override // com.ss.android.lark.calendar.impl.features.events.edit.listener.process.INotificationListener
            /* renamed from: b */
            public void mo111621b(boolean z, boolean z2, CalendarEvent calendarEvent, CalendarEventInstance calendarEventInstance, long j, long j2) {
                this.f77485a.mo111615a(calendarEvent, calendarEventInstance, j, j2, CalendarEvent.NotificationType.SEND_NOTIFICATION);
            }

            @Override // com.ss.android.lark.calendar.impl.features.events.edit.listener.process.INotificationListener
            /* renamed from: a */
            public void mo111619a(boolean z, boolean z2, CalendarEvent calendarEvent, CalendarEventInstance calendarEventInstance, long j, long j2) {
                this.f77485a.mo111615a(calendarEvent, calendarEventInstance, j, j2, CalendarEvent.NotificationType.NO_NOTIFICATION);
            }
        });
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendarview/DragSaveProcess$saveEventInstances$cancelableConsumer$1", "Lcom/ss/android/lark/calendar/dependency/idependency/IRxScheduledExecutorDependency$AbsCancelableConsumer;", "", "onConsume", "", "success", "(Ljava/lang/Boolean;)V", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.g$d */
    public static final class C30807d extends AbstractC30029ab.AbstractC30030a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ DragSaveProcess f77492a;

        /* renamed from: b */
        final /* synthetic */ CalendarEventInstance f77493b;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo108173b(Boolean bool) {
            if (!Intrinsics.areEqual((Object) bool, (Object) true)) {
                Log.m165389i("DragSaveProcess", "[saveEventInstances] failed.id:" + this.f77493b.getId() + " eventId:" + this.f77493b.getEventId() + " eventServerId:" + this.f77493b.getEventServerId());
            }
            DragSaveListener bVar = this.f77492a.f77481b;
            if (bVar != null) {
                bVar.mo111623b();
            }
        }

        C30807d(DragSaveProcess gVar, CalendarEventInstance calendarEventInstance) {
            this.f77492a = gVar;
            this.f77493b = calendarEventInstance;
        }
    }

    /* renamed from: a */
    public final CalendarEvent mo111611a(CalendarEventInstance calendarEventInstance) {
        String str;
        String valueOf = String.valueOf(new Date().getTime());
        Log.m165389i("DragSaveProcess", C32673y.m125376b(valueOf, "syncGetEvent", "calendar_id", calendarEventInstance.getCalendarId(), "key", calendarEventInstance.getKey(), "original_time", String.valueOf(calendarEventInstance.getOriginalTime()) + ""));
        CalendarEvent a = this.f77483d.mo118848a(calendarEventInstance.getCalendarId(), calendarEventInstance.getKey(), calendarEventInstance.getOriginalTime());
        if (a == null) {
            str = "null";
        } else {
            str = a.getKey();
        }
        Log.m165389i("DragSaveProcess", C32673y.m125373a(valueOf, "syncGetEvent", "key", str));
        return a;
    }

    /* renamed from: a */
    public final void mo111616a(CalendarEventInstance calendarEventInstance, long j, long j2) {
        Intrinsics.checkParameterIsNotNull(calendarEventInstance, "instance");
        Activity invoke = this.f77484f.invoke();
        if (invoke != null) {
            CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
            coreThreadPool.getCachedThreadPool().execute(new RunnableC30809f(this, calendarEventInstance, j, j2, invoke));
        }
    }

    /* renamed from: a */
    public final void mo111615a(CalendarEvent calendarEvent, CalendarEventInstance calendarEventInstance, long j, long j2, CalendarEvent.NotificationType notificationType) {
        Intrinsics.checkParameterIsNotNull(notificationType, "notificationType");
        if (calendarEventInstance != null) {
            C30022a.f74882a.rxScheduledExecutorDependency().mo108171a(new C30806c(this, calendarEventInstance, j, j2, notificationType, calendarEvent), new C30807d(this, calendarEventInstance));
        }
    }

    /* renamed from: a */
    public final void mo111613a(Context context, CallbackManager callbackManager, CalendarEvent calendarEvent, CalendarEvent calendarEvent2, CalendarEventInstance calendarEventInstance, CalendarEvent.Span span, long j, long j2) {
        String str;
        C30808e eVar = new C30808e(this, context, callbackManager, calendarEvent, calendarEvent2, calendarEventInstance, span, j, j2);
        TimeZone safeMobileNormalViewTimezone = C30022a.f74884c.mo108456c().getSafeMobileNormalViewTimezone();
        if (safeMobileNormalViewTimezone == null || (str = safeMobileNormalViewTimezone.getID()) == null) {
            TimeZone timeZone = TimeZone.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(timeZone, "TimeZone.getDefault()");
            str = timeZone.getID();
        }
        ResourceDragSaveProcess aVar = new ResourceDragSaveProcess(context, ResourceApprovalDataHelper.f81975a.mo117029a(calendarEvent.getAttendees()));
        aVar.mo116984a(eVar);
        long startTime = calendarEvent.getStartTime();
        long endTime = calendarEvent.getEndTime();
        Intrinsics.checkExpressionValueIsNotNull(str, "viewTimeZoneId");
        String rRule = calendarEvent.getRRule();
        Intrinsics.checkExpressionValueIsNotNull(rRule, "event.rRule");
        aVar.mo116982a(startTime, endTime, str, rRule, calendarEvent.getOriginalTime(), OriginalEventData.f81971a.mo117025a(calendarEvent2));
    }
}
