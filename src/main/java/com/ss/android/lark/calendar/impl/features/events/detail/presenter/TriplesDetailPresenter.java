package com.ss.android.lark.calendar.impl.features.events.detail.presenter;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.lark.pb.basic.v1.Command;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.detail.EventDetailSource;
import com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event2.CalendarEventHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.performance.CalendarPerfMonitor;
import com.ss.android.lark.calendar.impl.framework.hitpoint.performance.PerfHelper;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CreateEventShareToChatData;
import com.ss.android.lark.calendar.impl.rustadapter.p1574b.AbstractC32524a;
import com.ss.android.lark.calendar.impl.rustadapter.push.CalendarPushProcess;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import java.util.Date;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000  2\u00020\u0001:\u0001 B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\u0010\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u0018H\u0014J\b\u0010\u001e\u001a\u00020\u0018H\u0002J\b\u0010\u001f\u001a\u00020\u0018H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/presenter/TriplesDetailPresenter;", "Lcom/ss/android/lark/calendar/impl/features/events/detail/presenter/BaseDetailPresenter;", "initData", "Landroid/os/Bundle;", "view", "Lcom/ss/android/lark/calendar/impl/features/events/detail/ICalendarDetailContact$IDetailView;", "model", "Lcom/ss/android/lark/calendar/impl/features/events/detail/ICalendarDetailContact$IDetailModel;", "(Landroid/os/Bundle;Lcom/ss/android/lark/calendar/impl/features/events/detail/ICalendarDetailContact$IDetailView;Lcom/ss/android/lark/calendar/impl/features/events/detail/ICalendarDetailContact$IDetailModel;)V", "calendarId", "", "createEventShareToChatPushListener", "Lcom/ss/android/lark/calendar/impl/rustadapter/push/CalendarPushHandleCallBack;", "isFirstEnter", "", "isInitGetData", "key", "mCardMessageStatus", "", "originalTime", "", ShareHitPoint.f121868c, "Lcom/ss/android/lark/calendar/impl/features/events/detail/EventDetailSource;", "create", "", "destroy", "hitpint", "event", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "loadEventData", "registerCalendarEventSyncPush", "unRegisterCalendarEventSyncPush", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.presenter.i */
public final class TriplesDetailPresenter extends BaseDetailPresenter {

    /* renamed from: i */
    public static final String f79460i = TriplesDetailPresenter.class.getSimpleName();

    /* renamed from: j */
    public static final Companion f79461j = new Companion(null);

    /* renamed from: a */
    public final String f79462a;

    /* renamed from: b */
    public final String f79463b;

    /* renamed from: h */
    public final long f79464h;

    /* renamed from: k */
    private final EventDetailSource f79465k;

    /* renamed from: l */
    private int f79466l = 1;

    /* renamed from: m */
    private boolean f79467m = true;

    /* renamed from: n */
    private AbstractC32524a f79468n;

    /* renamed from: o */
    private boolean f79469o = true;

    @JvmStatic
    /* renamed from: a */
    public static final void m118044a(Activity activity, Bundle bundle) {
        f79461j.mo113932a(activity, bundle);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m118045a(Activity activity, CalendarEvent calendarEvent) {
        f79461j.mo113933a(activity, calendarEvent);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m118046a(Context context, CalendarEvent calendarEvent) {
        f79461j.mo113934a(context, calendarEvent);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m118047a(Context context, String str, String str2, long j) {
        f79461j.mo113935a(context, str, str2, j);
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m118048b(Activity activity, Bundle bundle) {
        f79461j.mo113936b(activity, bundle);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0002J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0018\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0007H\u0007J(\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0007H\u0007J\u0018\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u0013H\u0007R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/presenter/TriplesDetailPresenter$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "getBundle", "Landroid/os/Bundle;", "fromSource", "", "key", "calendarId", "originalTime", "", "startEventDetailActivityFromAppend", "", "activity", "Landroid/app/Activity;", "event", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "startEventDetailActivityFromBotMessage", "bundle", "startEventDetailActivityFromEmail", "context", "Landroid/content/Context;", "startEventDetailActivityFromGeneralBot", "startEventDetailActivityFromPreempt", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.presenter.i$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo113933a(Activity activity, CalendarEvent calendarEvent) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
            Intrinsics.checkParameterIsNotNull(calendarEvent, "event");
            int value = EventDetailSource.FROM_APPEND.getValue();
            String key = calendarEvent.getKey();
            Intrinsics.checkExpressionValueIsNotNull(key, "event.key");
            String calendarId = calendarEvent.getCalendarId();
            Intrinsics.checkExpressionValueIsNotNull(calendarId, "event.calendarId");
            BaseDetailPresenter.f79314g.mo113872a(activity, m118053a(value, key, calendarId, calendarEvent.getOriginalTime()));
        }

        @JvmStatic
        /* renamed from: b */
        public final void mo113936b(Activity activity, Bundle bundle) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
            Intrinsics.checkParameterIsNotNull(bundle, "bundle");
            bundle.putInt("enterDetailSource", EventDetailSource.FROM_BOT.getValue());
            BaseDetailPresenter.f79314g.mo113872a(activity, bundle);
            C30022a.f74882a.statisticsDependency().mo108187b();
            BaseDetailPresenter.f79314g.mo113873a("msg_invite");
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo113932a(Activity activity, Bundle bundle) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
            Intrinsics.checkParameterIsNotNull(bundle, "bundle");
            bundle.putInt("enterDetailSource", EventDetailSource.FROM_CALENDAR_GENERAL_BOT.getValue());
            bundle.putInt("calendar_event_type", CalendarEvent.Type.MEETING.getNumber());
            C30022a.f74882a.statisticsDependency().mo108187b();
            BaseDetailPresenter.f79314g.mo113872a(activity, bundle);
            CalendarPerfMonitor.m124415a("key_perf_cal_event_show", "perf_cal_event_show", "action_source", "msg_transfer", "view_type", PerfHelper.m124435a());
            CalendarPerfMonitor.m124415a("key_perf_cal_event_stage_cost", "cal_perf_common", "scene_type", "event_detail_in");
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo113934a(Context context, CalendarEvent calendarEvent) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(calendarEvent, "event");
            int value = EventDetailSource.FROM_PREEMPT_MEETING_ROOM.getValue();
            String key = calendarEvent.getKey();
            Intrinsics.checkExpressionValueIsNotNull(key, "event.key");
            String calendarId = calendarEvent.getCalendarId();
            Intrinsics.checkExpressionValueIsNotNull(calendarId, "event.calendarId");
            BaseDetailPresenter.f79314g.mo113872a(context, m118053a(value, key, calendarId, calendarEvent.getOriginalTime()));
        }

        /* renamed from: a */
        private final Bundle m118053a(int i, String str, String str2, long j) {
            Bundle bundle = new Bundle();
            bundle.putString("key", str);
            bundle.putString("calendar_id", str2);
            bundle.putLong("origin_time", j);
            bundle.putInt("enterDetailSource", i);
            return bundle;
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo113935a(Context context, String str, String str2, long j) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(str, "key");
            Intrinsics.checkParameterIsNotNull(str2, "calendarId");
            BaseDetailPresenter.f79314g.mo113872a(context, m118053a(EventDetailSource.FROM_EMAIL.getValue(), str, str2, j));
        }
    }

    @Override // com.ss.android.lark.calendar.impl.framework.calendarmvp.BasePresenterCalendar, com.ss.android.lark.calendar.impl.features.events.detail.presenter.BaseDetailPresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m118049c();
    }

    @Override // com.ss.android.lark.calendar.impl.framework.calendarmvp.BasePresenterCalendar, com.ss.android.lark.calendar.impl.features.events.detail.presenter.BaseDetailPresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        m118050v();
    }

    /* renamed from: v */
    private final void m118050v() {
        if (this.f79468n != null) {
            CalendarPushProcess.f83425a.mo118827b(Command.PUSH_EVENT_SHARE_TO_CHAT_NOTIFICATION, this.f79468n);
        }
    }

    /* renamed from: c */
    private final void m118049c() {
        this.f79468n = new C31373c(this);
        CalendarPushProcess.f83425a.mo118826a(Command.PUSH_EVENT_SHARE_TO_CHAT_NOTIFICATION, this.f79468n);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.calendar.impl.features.events.detail.presenter.BaseDetailPresenter
    /* renamed from: a */
    public void mo113839a() {
        String valueOf = String.valueOf(new Date().getTime());
        Log.m165389i(f79460i, C32673y.m125376b(valueOf, "getEventRequest", "calendar_id", this.f79462a, "key", this.f79463b, "original_time", String.valueOf(this.f79464h)));
        mo113856d().mo118878b(this.f79462a, this.f79463b, this.f79464h, mo118653u().wrapAndAddGetDataCallback(new C31372b(this, valueOf, "getEventRequest")));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/presenter/TriplesDetailPresenter$loadEventData$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "sdkEvent", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.presenter.i$b */
    public static final class C31372b implements IGetDataCallback<CalendarEvent> {

        /* renamed from: a */
        final /* synthetic */ TriplesDetailPresenter f79470a;

        /* renamed from: b */
        final /* synthetic */ String f79471b;

        /* renamed from: c */
        final /* synthetic */ String f79472c;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e(TriplesDetailPresenter.f79460i, C32673y.m125370a(this.f79471b, this.f79472c, errorResult));
            ((ICalendarDetailContact.IDetailView) this.f79470a.mo118651s()).mo113514e();
        }

        /* renamed from: a */
        public void onSuccess(CalendarEvent calendarEvent) {
            Log.m165389i(TriplesDetailPresenter.f79460i, C32673y.m125373a(this.f79471b, this.f79472c, new String[0]));
            if (calendarEvent != null) {
                ((ICalendarDetailContact.IDetailModel) this.f79470a.mo118652t()).mo113407a(calendarEvent, true);
                this.f79470a.mo113857e();
                BaseDetailPresenter.m117871a(this.f79470a, calendarEvent, false, 2, null);
                this.f79470a.mo113851b(calendarEvent);
                this.f79470a.mo113931d(calendarEvent);
                return;
            }
            Log.m165383e(TriplesDetailPresenter.f79460i, C32673y.m125378d("sdk_event_is_null"));
        }

        C31372b(TriplesDetailPresenter iVar, String str, String str2) {
            this.f79470a = iVar;
            this.f79471b = str;
            this.f79472c = str2;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000b\u0010\u0002\u001a\u00070\u0003¢\u0006\u0002\b\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/alibaba/fastjson/JSONObject;", "Lorg/jetbrains/annotations/NotNull;", "onPush"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.presenter.i$c */
    public static final class C31373c implements AbstractC32524a {

        /* renamed from: a */
        final /* synthetic */ TriplesDetailPresenter f79473a;

        C31373c(TriplesDetailPresenter iVar) {
            this.f79473a = iVar;
        }

        @Override // com.ss.android.lark.calendar.impl.rustadapter.p1574b.AbstractC32524a
        public final void onPush(JSONObject jSONObject) {
            int i;
            Intrinsics.checkParameterIsNotNull(jSONObject, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            Log.m165389i(TriplesDetailPresenter.f79460i, C32673y.m125374b("pushCalEventSync"));
            Object obj = jSONObject.get("calendar_create_event_share_to_chat");
            if (obj != null) {
                Intrinsics.checkExpressionValueIsNotNull(obj, "data[CalendarPushConstan…alendarPushHandleCallBack");
                if (obj != null) {
                    CreateEventShareToChatData eVar = (CreateEventShareToChatData) obj;
                    String a = eVar.mo120078a();
                    String b = eVar.mo120079b();
                    long c = eVar.mo120080c();
                    boolean d = eVar.mo120081d();
                    if (TextUtils.equals(a, this.f79473a.f79462a) && TextUtils.equals(b, this.f79473a.f79463b) && c == this.f79473a.f79464h) {
                        if (d) {
                            i = R.string.Calendar_Share_SucTip;
                        } else {
                            i = R.string.Calendar_ChatFindTime_FailedtoShare;
                        }
                        ((ICalendarDetailContact.IDetailView) this.f79473a.mo118651s()).mo113493a(i);
                        return;
                    }
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.calendar.impl.rustadapter.doentity.CreateEventShareToChatData");
            }
        }
    }

    /* renamed from: d */
    public final void mo113931d(CalendarEvent calendarEvent) {
        String str;
        if (this.f79469o) {
            CalendarEventHitPoint cVar = CalendarEventHitPoint.f83362a;
            CalendarEvent c = ((ICalendarDetailContact.IDetailModel) mo118652t()).mo113417c();
            if (c == null || (str = c.getServerId()) == null) {
                str = "";
            }
            cVar.mo118753c(str, ((ICalendarDetailContact.IDetailModel) mo118652t()).mo113397F());
            this.f79469o = false;
        }
        if (this.f79467m) {
            int i = C31374j.f79474a[this.f79465k.ordinal()];
            if (i == 1) {
                GeneralHitPoint.m124205a("card_message", "invitation", calendarEvent, this.f79466l);
            } else if (i == 2) {
                GeneralHitPoint.m124204a("card_message", "transfer_event", calendarEvent);
            } else if (i == 3) {
                GeneralHitPoint.m124204a("email_card_message", "invitation", calendarEvent);
            }
            this.f79467m = false;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TriplesDetailPresenter(Bundle bundle, ICalendarDetailContact.IDetailView bVar, ICalendarDetailContact.IDetailModel aVar) {
        super(bVar, aVar);
        Intrinsics.checkParameterIsNotNull(bundle, "initData");
        Intrinsics.checkParameterIsNotNull(bVar, "view");
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        EventDetailSource a = EventDetailSource.Companion.mo113373a(bundle.getInt("enterDetailSource"));
        a = a == null ? EventDetailSource.FROM_APPEND : a;
        this.f79465k = a;
        aVar.mo113403a(a);
        String string = bundle.getString("calendar_id", "");
        Intrinsics.checkExpressionValueIsNotNull(string, "initData.getString(Calen…Y_PARAMS_CALENDAR_ID, \"\")");
        this.f79462a = string;
        String string2 = bundle.getString("key", "");
        Intrinsics.checkExpressionValueIsNotNull(string2, "initData.getString(Calen…onfig.KEY_PARAMS_KEY, \"\")");
        this.f79463b = string2;
        this.f79464h = bundle.getLong("origin_time", 0);
        this.f79466l = bundle.getInt("calendar_message_card_status", 1);
    }
}
