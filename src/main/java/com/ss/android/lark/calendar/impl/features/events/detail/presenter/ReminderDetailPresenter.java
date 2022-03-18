package com.ss.android.lark.calendar.impl.features.events.detail.presenter;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.calendar.impl.features.events.detail.EventDetailSource;
import com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event2.CalendarEventHitPoint;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventInstance;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.OverallReminderData;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\nH\u0002J\b\u0010\u0018\u001a\u00020\u0016H\u0014J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001bH\u0002R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/presenter/ReminderDetailPresenter;", "Lcom/ss/android/lark/calendar/impl/features/events/detail/presenter/BaseDetailPresenter;", "initData", "Landroid/os/Bundle;", "view", "Lcom/ss/android/lark/calendar/impl/features/events/detail/ICalendarDetailContact$IDetailView;", "model", "Lcom/ss/android/lark/calendar/impl/features/events/detail/ICalendarDetailContact$IDetailModel;", "(Landroid/os/Bundle;Lcom/ss/android/lark/calendar/impl/features/events/detail/ICalendarDetailContact$IDetailView;Lcom/ss/android/lark/calendar/impl/features/events/detail/ICalendarDetailContact$IDetailModel;)V", "calendarId", "", "endTime", "", "isFirstEnter", "", "isSendOfflineClick", "key", "originalTime", ShareHitPoint.f121868c, "Lcom/ss/android/lark/calendar/impl/features/events/detail/EventDetailSource;", "startTime", "hitPointOfflineReminderClick", "", "eventId", "loadEventData", "updateInstanceTime", "event", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "updateStartTime", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.presenter.f */
public final class ReminderDetailPresenter extends BaseDetailPresenter {

    /* renamed from: b */
    public static final Companion f79428b = new Companion(null);

    /* renamed from: a */
    public boolean f79429a = true;

    /* renamed from: h */
    private final EventDetailSource f79430h;

    /* renamed from: i */
    private final String f79431i;

    /* renamed from: j */
    private final String f79432j;

    /* renamed from: k */
    private final long f79433k;

    /* renamed from: l */
    private long f79434l;

    /* renamed from: m */
    private long f79435m;

    /* renamed from: n */
    private boolean f79436n;

    @JvmStatic
    /* renamed from: a */
    public static final void m118014a(Activity activity, Bundle bundle) {
        f79428b.mo113919a(activity, bundle);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m118015a(Context context, long j, String str, String str2, long j2) {
        f79428b.mo113920a(context, j, str, str2, j2);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m118016a(Context context, long j, String str, String str2, long j2, long j3) {
        f79428b.mo113921a(context, j, str, str2, j2, j3);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m118017a(Context context, OverallReminderData overallReminderData) {
        f79428b.mo113922a(context, overallReminderData);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J0\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0016H\u0007J8\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u0016H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/presenter/ReminderDetailPresenter$Companion;", "", "()V", "OFFLINE_KEY_CALENDAR_ID", "", "OFFLINE_KEY_CALENDAR_KEY", "OFFLINE_KEY_ORIGINAL_TIME", "OFFLINE_KEY_START_TIME", "TAG", "startEventDetailActivityFromOfflinePush", "", "activity", "Landroid/app/Activity;", "dataBundle", "Landroid/os/Bundle;", "startEventDetailActivityFromReminder", "context", "Landroid/content/Context;", "reminder", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/OverallReminderData;", "startEventDetailActivityFromRoomView", "originalTime", "", "key", "calendarId", "startTime", "startEventDetailActivityFromSearch", "endTime", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.presenter.f$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo113919a(Activity activity, Bundle bundle) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
            Intrinsics.checkParameterIsNotNull(bundle, "dataBundle");
            String string = bundle.getString("key_offline_push_event_data");
            if (!TextUtils.isEmpty(string)) {
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    String string2 = jSONObject.getString("CalendarId");
                    String string3 = jSONObject.getString("Uid");
                    String string4 = jSONObject.getString("OriginalTime");
                    long j = jSONObject.getLong("StartTime");
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("calendar_id", string2);
                    bundle2.putString("key", string3);
                    bundle2.putString("origin_time", string4);
                    bundle2.putLong("calendar_event_start_time", j);
                    bundle2.putInt("enterDetailSource", EventDetailSource.FROM_OFFLINE_PUSH.getValue());
                    BaseDetailPresenter.f79314g.mo113872a(activity, bundle2);
                } catch (JSONException e) {
                    Log.m165383e("ReminderDetailPresenter", "notification click catch = " + e);
                }
                BaseDetailPresenter.f79314g.mo113873a("off_line");
            }
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo113922a(Context context, OverallReminderData overallReminderData) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(overallReminderData, "reminder");
            Bundle bundle = new Bundle();
            bundle.putString("key", overallReminderData.getKey());
            bundle.putString("calendar_id", overallReminderData.getCalendarId());
            bundle.putLong("origin_time", overallReminderData.getOriginalTime());
            bundle.putInt("enterDetailSource", EventDetailSource.FROM_REMINDER.getValue());
            bundle.putString("calendar_meeting_title", overallReminderData.getTitle());
            bundle.putLong("calendar_event_start_time", overallReminderData.getStartTime());
            bundle.putLong("calendar_event_end_time", overallReminderData.getEndTime());
            bundle.putInt("calendar_event_type", CalendarEvent.Type.MEETING.getNumber());
            C30022a.f74882a.statisticsDependency().mo108187b();
            BaseDetailPresenter.f79314g.mo113872a(context, bundle);
            BaseDetailPresenter.f79314g.mo113873a("remind");
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo113920a(Context context, long j, String str, String str2, long j2) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(str, "key");
            Intrinsics.checkParameterIsNotNull(str2, "calendarId");
            Bundle bundle = new Bundle();
            bundle.putString("key", str);
            bundle.putString("calendar_id", str2);
            bundle.putLong("origin_time", j);
            bundle.putInt("enterDetailSource", EventDetailSource.FROM_ROOM_VIEW_ACCESSIBLE.getValue());
            bundle.putLong("calendar_event_start_time", j2);
            BaseDetailPresenter.f79314g.mo113872a(context, bundle);
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo113921a(Context context, long j, String str, String str2, long j2, long j3) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(str, "key");
            Intrinsics.checkParameterIsNotNull(str2, "calendarId");
            Bundle bundle = new Bundle();
            bundle.putString("key", str);
            bundle.putString("calendar_id", str2);
            bundle.putLong("origin_time", j);
            bundle.putInt("enterDetailSource", EventDetailSource.FROM_CALENDAR_SEARCH.getValue());
            bundle.putLong("calendar_event_start_time", j2);
            bundle.putLong("calendar_event_end_time", j3);
            BaseDetailPresenter.f79314g.mo113872a(context, bundle);
            BaseDetailPresenter.f79314g.mo113873a("search");
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.calendar.impl.features.events.detail.presenter.BaseDetailPresenter
    /* renamed from: a */
    public void mo113839a() {
        String valueOf = String.valueOf(new Date().getTime());
        Log.m165389i("ReminderDetailPresenter", C32673y.m125376b(valueOf, "getEventRequest", "calendar_id", this.f79431i, "key", this.f79432j, "original_time", String.valueOf(this.f79433k)));
        mo113856d().mo118878b(this.f79431i, this.f79432j, this.f79433k, mo118653u().wrapAndAddGetDataCallback(new C31368b(this, valueOf, "getEventRequest")));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/presenter/ReminderDetailPresenter$loadEventData$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "sdkEvent", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.presenter.f$b */
    public static final class C31368b implements IGetDataCallback<CalendarEvent> {

        /* renamed from: a */
        final /* synthetic */ ReminderDetailPresenter f79437a;

        /* renamed from: b */
        final /* synthetic */ String f79438b;

        /* renamed from: c */
        final /* synthetic */ String f79439c;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("ReminderDetailPresenter", C32673y.m125370a(this.f79438b, this.f79439c, errorResult));
            ((ICalendarDetailContact.IDetailView) this.f79437a.mo118651s()).mo113514e();
        }

        /* renamed from: a */
        public void onSuccess(CalendarEvent calendarEvent) {
            String str;
            Log.m165389i("ReminderDetailPresenter", C32673y.m125373a(this.f79438b, this.f79439c, new String[0]));
            GeneralHitPoint.m124204a("notification_card", "no_value", calendarEvent);
            if (calendarEvent != null) {
                ((ICalendarDetailContact.IDetailModel) this.f79437a.mo118652t()).mo113407a(calendarEvent, true);
                this.f79437a.mo113918d(calendarEvent);
                this.f79437a.mo113857e();
                String str2 = null;
                BaseDetailPresenter.m117871a(this.f79437a, calendarEvent, false, 2, null);
                this.f79437a.mo113851b(calendarEvent);
                ReminderDetailPresenter fVar = this.f79437a;
                CalendarEvent c = ((ICalendarDetailContact.IDetailModel) fVar.mo118652t()).mo113417c();
                if (c != null) {
                    str2 = c.getServerId();
                }
                fVar.mo113917c(str2);
                if (this.f79437a.f79429a) {
                    CalendarEventHitPoint cVar = CalendarEventHitPoint.f83362a;
                    CalendarEvent c2 = ((ICalendarDetailContact.IDetailModel) this.f79437a.mo118652t()).mo113417c();
                    if (c2 == null || (str = c2.getServerId()) == null) {
                        str = "";
                    }
                    cVar.mo118753c(str, ((ICalendarDetailContact.IDetailModel) this.f79437a.mo118652t()).mo113397F());
                    this.f79437a.f79429a = false;
                    return;
                }
                return;
            }
            Log.m165383e("ReminderDetailPresenter", C32673y.m125378d("sdk_event_is_null"));
        }

        C31368b(ReminderDetailPresenter fVar, String str, String str2) {
            this.f79437a = fVar;
            this.f79438b = str;
            this.f79439c = str2;
        }
    }

    /* renamed from: e */
    private final void m118018e(CalendarEvent calendarEvent) {
        long j = this.f79434l;
        if (j != -1) {
            this.f79435m = (j + calendarEvent.getEndTime()) - calendarEvent.getStartTime();
        }
    }

    /* renamed from: c */
    public final void mo113917c(String str) {
        if (!this.f79436n && this.f79430h == EventDetailSource.FROM_OFFLINE_PUSH) {
            GeneralHitPoint.f83331a.mo118714A(str);
            this.f79436n = true;
        }
    }

    /* renamed from: d */
    public final void mo113918d(CalendarEvent calendarEvent) {
        CalendarEventInstance i;
        CalendarEventInstance i2;
        if (this.f79430h == EventDetailSource.FROM_CALENDAR_NOTIFICATION || this.f79430h == EventDetailSource.FROM_OFFLINE_PUSH) {
            m118018e(calendarEvent);
        }
        if (!(this.f79434l == -1 || (i2 = ((ICalendarDetailContact.IDetailModel) mo118652t()).mo113426i()) == null)) {
            i2.setStartTime(this.f79434l);
        }
        if (this.f79435m != -1 && (i = ((ICalendarDetailContact.IDetailModel) mo118652t()).mo113426i()) != null) {
            i.setEndTime(this.f79435m);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReminderDetailPresenter(Bundle bundle, ICalendarDetailContact.IDetailView bVar, ICalendarDetailContact.IDetailModel aVar) {
        super(bVar, aVar);
        Intrinsics.checkParameterIsNotNull(bundle, "initData");
        Intrinsics.checkParameterIsNotNull(bVar, "view");
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        EventDetailSource a = EventDetailSource.Companion.mo113373a(bundle.getInt("enterDetailSource"));
        a = a == null ? EventDetailSource.FROM_REMINDER : a;
        this.f79430h = a;
        aVar.mo113403a(a);
        String string = bundle.getString("calendar_id", "");
        Intrinsics.checkExpressionValueIsNotNull(string, "initData.getString(Calen…Y_PARAMS_CALENDAR_ID, \"\")");
        this.f79431i = string;
        String string2 = bundle.getString("key", "");
        Intrinsics.checkExpressionValueIsNotNull(string2, "initData.getString(Calen…onfig.KEY_PARAMS_KEY, \"\")");
        this.f79432j = string2;
        this.f79433k = bundle.getLong("origin_time", 0);
        this.f79434l = bundle.getLong("calendar_event_start_time", -1);
        this.f79435m = bundle.getLong("calendar_event_end_time", -1);
    }
}
