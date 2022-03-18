package com.ss.android.lark.calendar.impl.features.events.detail.presenter.auxpresenter;

import com.bytedance.lark.pb.basic.v1.Command;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.p1574b.AbstractC32524a;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32533b;
import com.ss.android.lark.calendar.impl.rustadapter.push.CalendarPushProcess;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.log.Log;
import java.util.Date;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0012\u001a\u00020\u0013H\u0002J\u0006\u0010\u0014\u001a\u00020\u0013J\u0006\u0010\u0015\u001a\u00020\u0013R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R#\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\n8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/presenter/auxpresenter/EventChangeAuxPresenter;", "", "view", "Lcom/ss/android/lark/calendar/impl/features/events/detail/ICalendarDetailContact$IDetailView;", "model", "Lcom/ss/android/lark/calendar/impl/features/events/detail/ICalendarDetailContact$IDetailModel;", "callbackManager", "Lcom/larksuite/framework/callback/CallbackManager;", "(Lcom/ss/android/lark/calendar/impl/features/events/detail/ICalendarDetailContact$IDetailView;Lcom/ss/android/lark/calendar/impl/features/events/detail/ICalendarDetailContact$IDetailModel;Lcom/larksuite/framework/callback/CallbackManager;)V", "mCalendarEventService", "Lcom/ss/android/lark/calendar/impl/rustadapter/service/CalendarEventService;", "kotlin.jvm.PlatformType", "getMCalendarEventService", "()Lcom/ss/android/lark/calendar/impl/rustadapter/service/CalendarEventService;", "mCalendarEventService$delegate", "Lkotlin/Lazy;", "mEventChangePushListener", "Lcom/ss/android/lark/calendar/impl/rustadapter/push/CalendarPushHandleCallBack;", "loadEventData", "", "registerEventChangedPush", "unRegisterEventChangedPush", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.presenter.a.a */
public final class EventChangeAuxPresenter {

    /* renamed from: c */
    public static final Companion f79391c = new Companion(null);

    /* renamed from: a */
    public final ICalendarDetailContact.IDetailView f79392a;

    /* renamed from: b */
    public final ICalendarDetailContact.IDetailModel f79393b;

    /* renamed from: d */
    private AbstractC32524a f79394d;

    /* renamed from: e */
    private final Lazy f79395e = LazyKt.lazy(C31363c.INSTANCE);

    /* renamed from: f */
    private final CallbackManager f79396f;

    /* renamed from: d */
    private final C32533b m117981d() {
        return (C32533b) this.f79395e.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/presenter/auxpresenter/EventChangeAuxPresenter$Companion;", "", "()V", "TAG", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.presenter.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/rustadapter/service/CalendarEventService;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.presenter.a.a$c */
    static final class C31363c extends Lambda implements Function0<C32533b> {
        public static final C31363c INSTANCE = new C31363c();

        C31363c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C32533b invoke() {
            return C32533b.m124620a();
        }
    }

    /* renamed from: b */
    public final void mo113901b() {
        if (this.f79394d != null) {
            CalendarPushProcess.f83425a.mo118827b(Command.PUSH_CALENDAR_EVENT_CHANGED_NOTIFICATION, this.f79394d);
        }
    }

    /* renamed from: a */
    public final void mo113900a() {
        this.f79394d = new C31364d(this);
        CalendarPushProcess.f83425a.mo118826a(Command.PUSH_CALENDAR_EVENT_CHANGED_NOTIFICATION, this.f79394d);
    }

    /* renamed from: c */
    public final void mo113902c() {
        String str;
        String str2;
        long j;
        String key;
        String calendarId;
        CalendarEvent c = this.f79393b.mo113417c();
        if (c == null || (calendarId = c.getCalendarId()) == null) {
            str = "";
        } else {
            str = calendarId;
        }
        CalendarEvent c2 = this.f79393b.mo113417c();
        if (c2 == null || (key = c2.getKey()) == null) {
            str2 = "";
        } else {
            str2 = key;
        }
        CalendarEvent c3 = this.f79393b.mo113417c();
        if (c3 != null) {
            j = c3.getOriginalTime();
        } else {
            j = 0;
        }
        String valueOf = String.valueOf(new Date().getTime());
        Log.m165389i("EventChangeAuxPresenter", C32673y.m125376b(valueOf, "getEventRequest", "calendar_id", str, "key", str2, "original_time", String.valueOf(j)));
        m117981d().mo118878b(str, str2, j, this.f79396f.wrapAndAddGetDataCallback(new C31362b(this, valueOf, "getEventRequest")));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/presenter/auxpresenter/EventChangeAuxPresenter$loadEventData$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "sdkEvent", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.presenter.a.a$b */
    public static final class C31362b implements IGetDataCallback<CalendarEvent> {

        /* renamed from: a */
        final /* synthetic */ EventChangeAuxPresenter f79397a;

        /* renamed from: b */
        final /* synthetic */ String f79398b;

        /* renamed from: c */
        final /* synthetic */ String f79399c;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("EventChangeAuxPresenter", C32673y.m125370a(this.f79398b, this.f79399c, errorResult));
        }

        /* renamed from: a */
        public void onSuccess(CalendarEvent calendarEvent) {
            Log.m165389i("EventChangeAuxPresenter", C32673y.m125373a(this.f79398b, this.f79399c, new String[0]));
            if (calendarEvent != null) {
                CalendarEvent c = this.f79397a.f79393b.mo113417c();
                if (c != null && Intrinsics.areEqual(c.getCalendarId(), calendarEvent.getCalendarId()) && Intrinsics.areEqual(c.getKey(), calendarEvent.getKey()) && c.getOriginalTime() == calendarEvent.getOriginalTime()) {
                    this.f79397a.f79393b.mo113406a(calendarEvent);
                    this.f79397a.f79392a.mo113504a((List<String>) null);
                    return;
                }
                return;
            }
            Log.m165383e("EventChangeAuxPresenter", C32673y.m125378d("sdk_event_is_null"));
        }

        C31362b(EventChangeAuxPresenter aVar, String str, String str2) {
            this.f79397a = aVar;
            this.f79398b = str;
            this.f79399c = str2;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000b\u0010\u0002\u001a\u00070\u0003¢\u0006\u0002\b\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/alibaba/fastjson/JSONObject;", "Lorg/jetbrains/annotations/NotNull;", "onPush"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.presenter.a.a$d */
    public static final class C31364d implements AbstractC32524a {

        /* renamed from: a */
        final /* synthetic */ EventChangeAuxPresenter f79400a;

        C31364d(EventChangeAuxPresenter aVar) {
            this.f79400a = aVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x0071 A[SYNTHETIC] */
        @Override // com.ss.android.lark.calendar.impl.rustadapter.p1574b.AbstractC32524a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onPush(com.alibaba.fastjson.JSONObject r7) {
            /*
            // Method dump skipped, instructions count: 119
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.events.detail.presenter.auxpresenter.EventChangeAuxPresenter.C31364d.onPush(com.alibaba.fastjson.JSONObject):void");
        }
    }

    public EventChangeAuxPresenter(ICalendarDetailContact.IDetailView bVar, ICalendarDetailContact.IDetailModel aVar, CallbackManager callbackManager) {
        Intrinsics.checkParameterIsNotNull(bVar, "view");
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        Intrinsics.checkParameterIsNotNull(callbackManager, "callbackManager");
        this.f79392a = bVar;
        this.f79393b = aVar;
        this.f79396f = callbackManager;
    }
}
