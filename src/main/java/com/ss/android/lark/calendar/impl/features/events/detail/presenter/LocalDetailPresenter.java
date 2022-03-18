package com.ss.android.lark.calendar.impl.features.events.detail.presenter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.EventChipViewData;
import com.ss.android.lark.calendar.impl.features.common.helper.LargeCalendarTransmitHelper;
import com.ss.android.lark.calendar.impl.features.events.detail.EventDetailActivity;
import com.ss.android.lark.calendar.impl.features.events.detail.EventDetailSource;
import com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact;
import com.ss.android.lark.calendar.impl.features.events.edit.data.UpdateTimeType;
import com.ss.android.lark.calendar.impl.features.local.C31927d;
import com.ss.android.lark.calendar.impl.framework.hitpoint.appreciable.AppreciableHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event2.CalendarEventHitPoint;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventInstance;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.calendar.p1430a.p1431a.p1432a.AbstractC30023a;
import com.ss.android.lark.log.Log;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 /2\u00020\u0001:\u0001/B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J*\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0002J\u001f\u0010\u001c\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002¢\u0006\u0002\u0010!J\b\u0010\"\u001a\u00020#H\u0014J\u0018\u0010$\u001a\u00020#2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010&H\u0016J&\u0010'\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u0011J\u0012\u0010,\u001a\u00020#2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/presenter/LocalDetailPresenter;", "Lcom/ss/android/lark/calendar/impl/features/events/detail/presenter/BaseDetailPresenter;", "initData", "Landroid/os/Bundle;", "view", "Lcom/ss/android/lark/calendar/impl/features/events/detail/ICalendarDetailContact$IDetailView;", "model", "Lcom/ss/android/lark/calendar/impl/features/events/detail/ICalendarDetailContact$IDetailModel;", "(Landroid/os/Bundle;Lcom/ss/android/lark/calendar/impl/features/events/detail/ICalendarDetailContact$IDetailView;Lcom/ss/android/lark/calendar/impl/features/events/detail/ICalendarDetailContact$IDetailModel;)V", "calendarId", "", "eventInstance", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventInstance;", "isFirstEnter", "", "key", "originalTime", "", "getDisplayTypeByFreeStatus", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent$DisplayType;", "isFree", "selfAttendeeStatus", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee$Status;", "getLocalSystemEventDisplayType", "visibility", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent$Visibility;", "selfAccessRole", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar$AccessRole;", "getLocalSystemEventIsEditable", "event", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "calendar", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;)Ljava/lang/Boolean;", "loadEventData", "", "refreshEventView", "forbiddenRefreshItems", "", "updateLocalEvent", "updateTypeNum", "", "startTimeDiff", "endTimeDiff", "updateOnActivityResult", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.presenter.d */
public final class LocalDetailPresenter extends BaseDetailPresenter {

    /* renamed from: a */
    public static final Companion f79413a = new Companion(null);

    /* renamed from: b */
    private final String f79414b;

    /* renamed from: h */
    private final String f79415h;

    /* renamed from: i */
    private final long f79416i;

    /* renamed from: j */
    private final CalendarEventInstance f79417j;

    /* renamed from: k */
    private boolean f79418k = true;

    @JvmStatic
    /* renamed from: a */
    public static final void m118000a(Activity activity, EventChipViewData eventChipViewData) {
        f79413a.mo113913a(activity, eventChipViewData);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m118001a(Context context, EventChipViewData eventChipViewData, boolean z) {
        f79413a.mo113914a(context, eventChipViewData, z);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0003J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bH\u0003J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\bH\u0007J \u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/presenter/LocalDetailPresenter$Companion;", "", "()V", "TAG", "", "getDetailActivityBundle", "Landroid/os/Bundle;", "chipViewData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/entity/EventChipViewData;", "getEventDetailIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "startEventDetailActivity", "", "activity", "Landroid/app/Activity;", "startEventDetailActivityFromListView", "isOpenNearbyClick", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.presenter.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final Bundle mo113912a(EventChipViewData eventChipViewData) {
            long originalTime = eventChipViewData.getOriginalTime();
            String key = eventChipViewData.getKey();
            String calendarId = eventChipViewData.getCalendarId();
            Bundle bundle = new Bundle();
            bundle.putString("key", key);
            bundle.putString("calendar_id", calendarId);
            bundle.putLong("origin_time", originalTime);
            bundle.putInt("enterDetailSource", EventDetailSource.FROM_CALENDAR_VIEW_LOCAL.getValue());
            bundle.putSerializable("calendarInstance", eventChipViewData.getCalendarEventInstance());
            bundle.putString("calendar_meeting_title", eventChipViewData.getEventDetailTitle());
            CalendarEventInstance calendarEventInstance = eventChipViewData.getCalendarEventInstance();
            Intrinsics.checkExpressionValueIsNotNull(calendarEventInstance, "chipViewData.calendarEventInstance");
            CalendarEvent.Type eventType = calendarEventInstance.getEventType();
            Intrinsics.checkExpressionValueIsNotNull(eventType, "chipViewData.calendarEventInstance.eventType");
            bundle.putInt("calendar_event_type", eventType.getNumber());
            return bundle;
        }

        @JvmStatic
        /* renamed from: a */
        public final Intent mo113911a(Context context, EventChipViewData eventChipViewData) {
            Bundle a = mo113912a(eventChipViewData);
            C30022a.f74882a.statisticsDependency().mo108187b();
            AbstractC30023a a2 = C30022a.f74882a.appRouter().mo108210a(EventDetailActivity.class);
            Intrinsics.checkExpressionValueIsNotNull(a2, "CalendarDependencyHolder…tailActivity::class.java)");
            Intent a3 = a2.mo108151a(a).mo108150a(context);
            Intrinsics.checkExpressionValueIsNotNull(a3, "routerBuilder.param(bundle).intent(context)");
            return a3;
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo113913a(Activity activity, EventChipViewData eventChipViewData) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
            Intrinsics.checkParameterIsNotNull(eventChipViewData, "chipViewData");
            Intent a = mo113911a((Context) activity, eventChipViewData);
            AppreciableHitPoint.f83321a.mo118695k();
            activity.startActivity(a);
            BaseDetailPresenter.f79314g.mo113873a("instance");
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo113914a(Context context, EventChipViewData eventChipViewData, boolean z) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(eventChipViewData, "chipViewData");
            AppreciableHitPoint.f83321a.mo118695k();
            Bundle a = mo113912a(eventChipViewData);
            C30022a.f74882a.statisticsDependency().mo108187b();
            BaseDetailPresenter.f79314g.mo113872a(context, a);
            BaseDetailPresenter.f79314g.mo113873a("instance");
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.calendar.impl.features.events.detail.presenter.BaseDetailPresenter
    /* renamed from: a */
    public void mo113839a() {
        String str;
        ((ICalendarDetailContact.IDetailModel) mo118652t()).mo113406a(C31927d.m121459a().mo116552d(this.f79417j.getEventId()));
        CalendarEvent c = ((ICalendarDetailContact.IDetailModel) mo118652t()).mo113417c();
        if (c != null) {
            Calendar a = C31927d.m121459a().mo116541a(c.getCalendarId());
            ((ICalendarDetailContact.IDetailModel) mo118652t()).mo113405a(a);
            CalendarEvent.Visibility visibility = c.getVisibility();
            Intrinsics.checkExpressionValueIsNotNull(visibility, "event.visibility");
            boolean isFree = c.isFree();
            CalendarEventAttendee.Status selfAttendeeStatus = c.getSelfAttendeeStatus();
            Intrinsics.checkExpressionValueIsNotNull(selfAttendeeStatus, "event.selfAttendeeStatus");
            Intrinsics.checkExpressionValueIsNotNull(a, "calendar");
            c.setDisplayType(m117997a(visibility, isFree, selfAttendeeStatus, a.getSelfAccessRole()));
            c.setIsEditable(m117999a(c, a));
            c.setEventColor(this.f79417j.getmEventColor());
            mo113857e();
        } else {
            Log.m165383e("LocalDetailPresenter", C32673y.m125377c("event is null"));
            ((ICalendarDetailContact.IDetailView) mo118651s()).mo113514e();
        }
        if (this.f79418k) {
            CalendarEventHitPoint cVar = CalendarEventHitPoint.f83362a;
            CalendarEvent c2 = ((ICalendarDetailContact.IDetailModel) mo118652t()).mo113417c();
            if (c2 == null || (str = c2.getServerId()) == null) {
                str = "";
            }
            cVar.mo118753c(str, ((ICalendarDetailContact.IDetailModel) mo118652t()).mo113397F());
            this.f79418k = false;
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.presenter.BaseDetailPresenter
    /* renamed from: a */
    public void mo113842a(Intent intent) {
        int i;
        long j;
        CalendarEvent a = LargeCalendarTransmitHelper.m116178a(intent);
        if (a != null) {
            if (intent != null) {
                i = intent.getIntExtra("edit_calendar_event_adjust_time", 1);
            } else {
                i = 1;
            }
            long j2 = 0;
            if (intent != null) {
                j = intent.getLongExtra("edit_calendar_event_adjust_time_start", 0);
            } else {
                j = 0;
            }
            if (intent != null) {
                j2 = intent.getLongExtra("edit_calendar_event_adjust_time_end", 0);
            }
            mo113910a(a, i, j, j2);
            mo113857e();
            return;
        }
        Log.m165383e("LocalDetailPresenter", C32673y.m125378d("local_update_event_is_null"));
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.presenter.BaseDetailPresenter
    /* renamed from: a */
    public void mo113848a(List<String> list) {
        ((ICalendarDetailContact.IDetailView) mo118651s()).mo113513d();
        ((ICalendarDetailContact.IDetailView) mo118651s()).mo113504a(list);
        ((ICalendarDetailContact.IDetailView) mo118651s()).mo113516g();
        ((ICalendarDetailContact.IDetailView) mo118651s()).mo113517h();
        ((ICalendarDetailContact.IDetailView) mo118651s()).mo113518i();
        ((ICalendarDetailContact.IDetailView) mo118651s()).mo113519j();
        ((ICalendarDetailContact.IDetailView) mo118651s()).mo113520k();
    }

    /* renamed from: a */
    private final CalendarEvent.DisplayType m117998a(boolean z, CalendarEventAttendee.Status status) {
        if (z || status == CalendarEventAttendee.Status.DECLINE) {
            return CalendarEvent.DisplayType.INVISIBLE;
        }
        return CalendarEvent.DisplayType.LIMITED;
    }

    /* renamed from: a */
    private final Boolean m117999a(CalendarEvent calendarEvent, Calendar calendar) {
        boolean z;
        Calendar.AccessRole selfAccessRole = calendar.getSelfAccessRole();
        boolean z2 = false;
        if (selfAccessRole == Calendar.AccessRole.WRITER || selfAccessRole == Calendar.AccessRole.OWNER) {
            z = true;
        } else {
            z = false;
        }
        if (calendarEvent.isOrganizer()) {
            return Boolean.valueOf(z);
        }
        if (z) {
            z2 = calendarEvent.isGuestsCanModify();
        }
        return Boolean.valueOf(z2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LocalDetailPresenter(Bundle bundle, ICalendarDetailContact.IDetailView bVar, ICalendarDetailContact.IDetailModel aVar) {
        super(bVar, aVar);
        Intrinsics.checkParameterIsNotNull(bundle, "initData");
        Intrinsics.checkParameterIsNotNull(bVar, "view");
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        aVar.mo113403a(EventDetailSource.FROM_CALENDAR_VIEW_LOCAL);
        Serializable serializable = bundle.getSerializable("calendarInstance");
        CalendarEventInstance calendarEventInstance = (CalendarEventInstance) (!(serializable instanceof CalendarEventInstance) ? null : serializable);
        calendarEventInstance = calendarEventInstance == null ? new CalendarEventInstance() : calendarEventInstance;
        this.f79417j = calendarEventInstance;
        aVar.mo113409a(calendarEventInstance);
        String string = bundle.getString("calendar_id", "");
        Intrinsics.checkExpressionValueIsNotNull(string, "initData.getString(Calen…Y_PARAMS_CALENDAR_ID, \"\")");
        this.f79414b = string;
        String string2 = bundle.getString("key", "");
        Intrinsics.checkExpressionValueIsNotNull(string2, "initData.getString(Calen…onfig.KEY_PARAMS_KEY, \"\")");
        this.f79415h = string2;
        this.f79416i = bundle.getLong("origin_time", 0);
    }

    /* renamed from: a */
    private final CalendarEvent.DisplayType m117997a(CalendarEvent.Visibility visibility, boolean z, CalendarEventAttendee.Status status, Calendar.AccessRole accessRole) {
        if (visibility == CalendarEvent.Visibility.PUBLIC) {
            return CalendarEvent.DisplayType.FULL;
        }
        if (accessRole != null && (accessRole == Calendar.AccessRole.OWNER || accessRole == Calendar.AccessRole.WRITER)) {
            return CalendarEvent.DisplayType.FULL;
        }
        if (visibility == CalendarEvent.Visibility.PRIVATE) {
            return m117998a(z, status);
        }
        if (accessRole == Calendar.AccessRole.READER) {
            return CalendarEvent.DisplayType.FULL;
        }
        return m117998a(z, status);
    }

    /* renamed from: a */
    public final void mo113910a(CalendarEvent calendarEvent, int i, long j, long j2) {
        Intrinsics.checkParameterIsNotNull(calendarEvent, "event");
        Calendar a = C31927d.m121459a().mo116541a(calendarEvent.getCalendarId());
        if (a != null) {
            ((ICalendarDetailContact.IDetailModel) mo118652t()).mo113405a(a);
            CalendarEvent.Visibility visibility = calendarEvent.getVisibility();
            Intrinsics.checkExpressionValueIsNotNull(visibility, "event.visibility");
            boolean isFree = calendarEvent.isFree();
            CalendarEventAttendee.Status selfAttendeeStatus = calendarEvent.getSelfAttendeeStatus();
            Intrinsics.checkExpressionValueIsNotNull(selfAttendeeStatus, "event.selfAttendeeStatus");
            calendarEvent.setDisplayType(m117997a(visibility, isFree, selfAttendeeStatus, a.getSelfAccessRole()));
            calendarEvent.setIsEditable(m117999a(calendarEvent, a));
            if (UpdateTimeType.forNumber(i) == UpdateTimeType.UPDATE_TIME_BY_EVENT) {
                ((ICalendarDetailContact.IDetailModel) mo118652t()).mo113407a(calendarEvent, true);
                return;
            }
            CalendarEventInstance calendarEventInstance = this.f79417j;
            calendarEventInstance.setStartTime(calendarEventInstance.getStartTime() + j);
            CalendarEventInstance calendarEventInstance2 = this.f79417j;
            calendarEventInstance2.setEndTime(calendarEventInstance2.getEndTime() + j2);
            ((ICalendarDetailContact.IDetailModel) mo118652t()).mo113407a(calendarEvent, false);
            return;
        }
        Log.m165383e("LocalDetailPresenter", C32673y.m125378d("local_update_calendar_is_null"));
    }
}
