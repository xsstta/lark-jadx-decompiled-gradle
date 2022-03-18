package com.ss.android.lark.calendar.impl.features.events.edit.operation;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.calendar.impl.features.events.edit.listener.process.IExceptionEventListener;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.AbstractC32594f;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32533b;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.log.Log;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u000e\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/operation/ExceptionEventInitProcess;", "", "()V", "TAG", "", "mCalendarEventService", "Lcom/ss/android/lark/calendar/impl/rustadapter/service/ICalendarEventService;", "getMCalendarEventService$calendar_impl_release", "()Lcom/ss/android/lark/calendar/impl/rustadapter/service/ICalendarEventService;", "setMCalendarEventService$calendar_impl_release", "(Lcom/ss/android/lark/calendar/impl/rustadapter/service/ICalendarEventService;)V", "mExceptionEventListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/listener/process/IExceptionEventListener;", "initExceptionEventData", "", "event", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "loadExceptionalEventNumber", "loadExceptionalHasRepeat", "setExceptionEventListener", "exceptionEventListener", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.c.c */
public final class ExceptionEventInitProcess {

    /* renamed from: a */
    public final String f79980a = "ExceptionEventInitProcess";

    /* renamed from: b */
    public IExceptionEventListener f79981b;

    /* renamed from: c */
    private AbstractC32594f f79982c;

    public ExceptionEventInitProcess() {
        C32533b a = C32533b.m124620a();
        Intrinsics.checkExpressionValueIsNotNull(a, "CalendarEventService.getInstance()");
        this.f79982c = a;
    }

    /* renamed from: a */
    public final void mo114694a(IExceptionEventListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "exceptionEventListener");
        this.f79981b = bVar;
    }

    /* renamed from: a */
    public static final /* synthetic */ IExceptionEventListener m118999a(ExceptionEventInitProcess cVar) {
        IExceptionEventListener bVar = cVar.f79981b;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mExceptionEventListener");
        }
        return bVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/operation/ExceptionEventInitProcess$loadExceptionalEventNumber$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "events", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.c.c$a */
    public static final class C31559a implements IGetDataCallback<List<? extends CalendarEvent>> {

        /* renamed from: a */
        final /* synthetic */ ExceptionEventInitProcess f79983a;

        /* renamed from: b */
        final /* synthetic */ String f79984b;

        /* renamed from: c */
        final /* synthetic */ String f79985c;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e(this.f79983a.f79980a, C32673y.m125370a(this.f79984b, this.f79985c, errorResult));
        }

        /* renamed from: a */
        public void onSuccess(List<? extends CalendarEvent> list) {
            int i;
            if (list != null) {
                i = list.size();
            } else {
                i = 0;
            }
            String str = this.f79983a.f79980a;
            String str2 = this.f79984b;
            String str3 = this.f79985c;
            Log.m165389i(str, C32673y.m125373a(str2, str3, "exceptional_event_number", String.valueOf(i) + ""));
            ExceptionEventInitProcess.m118999a(this.f79983a).mo114634a(i);
        }

        C31559a(ExceptionEventInitProcess cVar, String str, String str2) {
            this.f79983a = cVar;
            this.f79984b = str;
            this.f79985c = str2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/operation/ExceptionEventInitProcess$loadExceptionalHasRepeat$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "event", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.c.c$b */
    public static final class C31560b implements IGetDataCallback<CalendarEvent> {

        /* renamed from: a */
        final /* synthetic */ ExceptionEventInitProcess f79986a;

        /* renamed from: b */
        final /* synthetic */ String f79987b;

        /* renamed from: c */
        final /* synthetic */ String f79988c;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            ExceptionEventInitProcess.m118999a(this.f79986a).mo114635a((CalendarEvent) null);
            Log.m165383e(this.f79986a.f79980a, C32673y.m125370a(this.f79987b, this.f79988c, errorResult));
        }

        /* renamed from: a */
        public void onSuccess(CalendarEvent calendarEvent) {
            Intrinsics.checkParameterIsNotNull(calendarEvent, "event");
            ExceptionEventInitProcess.m118999a(this.f79986a).mo114635a(calendarEvent);
            Log.m165389i(this.f79986a.f79980a, C32673y.m125373a(this.f79987b, this.f79988c, "exceptional_event_has_repeat_event", "true"));
        }

        C31560b(ExceptionEventInitProcess cVar, String str, String str2) {
            this.f79986a = cVar;
            this.f79987b = str;
            this.f79988c = str2;
        }
    }

    /* renamed from: b */
    private final void m119000b(CalendarEvent calendarEvent) {
        String l = Long.toString(new Date().getTime());
        Log.m165389i(this.f79980a, C32673y.m125376b(l, "loadExceptionalEventNumber", new String[0]));
        this.f79982c.mo118871a(calendarEvent.getCalendarId(), calendarEvent.getKey(), new C31559a(this, l, "loadExceptionalEventNumber"));
    }

    /* renamed from: c */
    private final void m119001c(CalendarEvent calendarEvent) {
        String l = Long.toString(new Date().getTime());
        Log.m165389i(this.f79980a, C32673y.m125376b(l, "loadExceptionalHasRepeat", new String[0]));
        this.f79982c.mo118878b(calendarEvent.getCalendarId(), calendarEvent.getKey(), 0, new C31560b(this, l, "loadExceptionalHasRepeat"));
    }

    /* renamed from: a */
    public final void mo114695a(CalendarEvent calendarEvent) {
        if (calendarEvent != null && calendarEvent.getSource() != CalendarEvent.Source.ANDROID && calendarEvent.getSource() != CalendarEvent.Source.UNKNOWN_SOURCE) {
            m119000b(calendarEvent);
            if (calendarEvent.getOriginalTime() != 0) {
                m119001c(calendarEvent);
            }
        }
    }
}
