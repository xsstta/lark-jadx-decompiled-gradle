package com.ss.android.lark.calendar.impl.features.events.detail.presenter;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.lark.pb.calendar.v1.CalendarEvent;
import com.bytedance.lark.pb.calendar.v1.CalendarEventDisplayInfo;
import com.bytedance.lark.pb.calendar.v1.EventCreator;
import com.bytedance.lark.pb.calendar.v1.ResourceContactPerson;
import com.bytedance.lark.pb.calendar.v1.RoomViewInstance;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.detail.EventDetailSource;
import com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact;
import com.ss.android.lark.calendar.impl.features.events.edit.data.EventMeetingRoomData;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event2.CalendarEventHitPoint;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventDisplayExtraData;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventDisplayInfo;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.log.Log;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0014J\u0018\u0010\r\u001a\u00020\f2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u0016R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/presenter/RoomInstanceDetailPresenter;", "Lcom/ss/android/lark/calendar/impl/features/events/detail/presenter/BaseDetailPresenter;", "initData", "Landroid/os/Bundle;", "view", "Lcom/ss/android/lark/calendar/impl/features/events/detail/ICalendarDetailContact$IDetailView;", "model", "Lcom/ss/android/lark/calendar/impl/features/events/detail/ICalendarDetailContact$IDetailModel;", "(Landroid/os/Bundle;Lcom/ss/android/lark/calendar/impl/features/events/detail/ICalendarDetailContact$IDetailView;Lcom/ss/android/lark/calendar/impl/features/events/detail/ICalendarDetailContact$IDetailModel;)V", "isFirstEnter", "", "loadEventData", "", "refreshEventView", "forbiddenRefreshItems", "", "", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.presenter.g */
public final class RoomInstanceDetailPresenter extends BaseDetailPresenter {

    /* renamed from: b */
    public static final Companion f79440b = new Companion(null);

    /* renamed from: a */
    public boolean f79441a = true;

    @JvmStatic
    /* renamed from: a */
    public static final void m118027a(Context context, RoomViewInstance roomViewInstance, EventMeetingRoomData eventMeetingRoomData) {
        f79440b.mo113924a(context, roomViewInstance, eventMeetingRoomData);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J\"\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/presenter/RoomInstanceDetailPresenter$Companion;", "", "()V", "TAG", "", "convertToCalendar", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "pbRoomInstance", "Lcom/bytedance/lark/pb/calendar/v1/RoomViewInstance;", "roomInfo", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/EventMeetingRoomData;", "convertToEvent", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "convertToOrganizer", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "contactPerson", "Lcom/bytedance/lark/pb/calendar/v1/EventCreator;", "startEventDetailActivity", "", "context", "Landroid/content/Context;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.presenter.g$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        private final CalendarEventAttendee m118032a(EventCreator eventCreator) {
            if (eventCreator == null) {
                return null;
            }
            if (TextUtils.isEmpty(eventCreator.name) && TextUtils.isEmpty(eventCreator.avatar_key) && TextUtils.isEmpty(eventCreator.chatter_id)) {
                return null;
            }
            CalendarEventAttendee calendarEventAttendee = new CalendarEventAttendee();
            calendarEventAttendee.setLocalizedDisplayName(eventCreator.name);
            calendarEventAttendee.setAvatarKey(eventCreator.avatar_key);
            calendarEventAttendee.setUserId(eventCreator.chatter_id);
            calendarEventAttendee.setLarkId(eventCreator.chatter_id);
            calendarEventAttendee.setId(eventCreator.chatter_id);
            return calendarEventAttendee;
        }

        /* renamed from: a */
        private final CalendarEvent m118031a(RoomViewInstance roomViewInstance) {
            EventCreator eventCreator;
            String str;
            CalendarEvent calendarEvent = new CalendarEvent();
            CalendarEvent.Category category = roomViewInstance.category;
            Intrinsics.checkExpressionValueIsNotNull(category, "pbRoomInstance.category");
            calendarEvent.setCategory(CalendarEvent.Category.forNumber(category.getValue()));
            Long l = roomViewInstance.start_time;
            Intrinsics.checkExpressionValueIsNotNull(l, "pbRoomInstance.start_time");
            calendarEvent.setStartTime(l.longValue());
            calendarEvent.setStartTimeZone(roomViewInstance.start_timezone);
            Long l2 = roomViewInstance.end_time;
            Intrinsics.checkExpressionValueIsNotNull(l2, "pbRoomInstance.end_time");
            calendarEvent.setEndTime(l2.longValue());
            calendarEvent.setEndTimeZone(roomViewInstance.end_timezone);
            ResourceContactPerson resourceContactPerson = roomViewInstance.resource_contact_person;
            if (resourceContactPerson != null) {
                eventCreator = resourceContactPerson.contact_person;
            } else {
                eventCreator = null;
            }
            calendarEvent.setOrganizer(m118032a(eventCreator));
            calendarEvent.setDisplayType(CalendarEvent.DisplayType.LIMITED);
            calendarEvent.setIsEditable(false);
            calendarEvent.setCalendarEventDisplayInfo(new CalendarEventDisplayInfo(false, false, false, false, false, false, false, true, CalendarEventDisplayInfo.ButtonDisplayType.HIDDEN, CalendarEventDisplayInfo.ButtonDisplayType.HIDDEN, new CalendarEventDisplayExtraData(false)));
            if (roomViewInstance.current_user_accessibility != RoomViewInstance.UserAccessibility.SUMMARY_VISIBLE) {
                str = C32634ae.m125182b(R.string.Calendar_Detail_Reserved);
            } else if (TextUtils.isEmpty(roomViewInstance.summary)) {
                str = C32634ae.m125182b(R.string.Calendar_Common_NoTitle);
            } else {
                str = roomViewInstance.summary;
            }
            calendarEvent.setSummary(str);
            return calendarEvent;
        }

        /* renamed from: a */
        private final Calendar m118030a(RoomViewInstance roomViewInstance, EventMeetingRoomData eventMeetingRoomData) {
            boolean z;
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("roomInfo is null: ");
            if (eventMeetingRoomData == null) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z);
            Log.m165389i("RoomInstanceDetailPresenter", C32673y.m125378d(sb.toString()));
            Calendar calendar = new Calendar();
            calendar.setServerId(roomViewInstance.resource_calendar_id);
            if (eventMeetingRoomData != null) {
                str = eventMeetingRoomData.getMDisplayText$calendar_impl_release();
            } else {
                str = null;
            }
            calendar.setLocalizedSummary(str);
            calendar.setType(Calendar.Type.RESOURCES);
            calendar.setExternalPasswordInvalid(true);
            return calendar;
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo113924a(Context context, RoomViewInstance roomViewInstance, EventMeetingRoomData eventMeetingRoomData) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(roomViewInstance, "pbRoomInstance");
            Bundle bundle = new Bundle();
            Companion aVar = this;
            com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent a = aVar.m118031a(roomViewInstance);
            Calendar a2 = aVar.m118030a(roomViewInstance, eventMeetingRoomData);
            bundle.putSerializable("calendarEvent", a);
            bundle.putSerializable("calendar_data", a2);
            bundle.putInt("enterDetailSource", EventDetailSource.FROM_ROOM_VIEW_NOT_ACCESSIBLE.getValue());
            BaseDetailPresenter.f79314g.mo113872a(context, bundle);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.calendar.impl.features.events.detail.presenter.BaseDetailPresenter
    /* renamed from: a */
    public void mo113839a() {
        CalendarEventAttendee organizer;
        String userId;
        mo113857e();
        com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent c = ((ICalendarDetailContact.IDetailModel) mo118652t()).mo113417c();
        if (c != null && (organizer = c.getOrganizer()) != null && (userId = organizer.getUserId()) != null) {
            String valueOf = String.valueOf(new Date().getTime());
            Log.m165389i("RoomInstanceDetailPresenter", C32673y.m125376b(valueOf, "getAttendeesByChatterIds", "chatter_ids", userId));
            mo113856d().mo118880b(CollectionsKt.listOf(userId), new C31369b(this, valueOf, "getAttendeesByChatterIds", userId));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u001e\u0010\t\u001a\u00020\u00062\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/presenter/RoomInstanceDetailPresenter$loadEventData$attendeeCallback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "chatterIdAttendeeMap", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.presenter.g$b */
    public static final class C31369b implements IGetDataCallback<Map<String, ? extends CalendarEventAttendee>> {

        /* renamed from: a */
        final /* synthetic */ RoomInstanceDetailPresenter f79442a;

        /* renamed from: b */
        final /* synthetic */ String f79443b;

        /* renamed from: c */
        final /* synthetic */ String f79444c;

        /* renamed from: d */
        final /* synthetic */ String f79445d;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("RoomInstanceDetailPresenter", C32673y.m125370a(this.f79443b, this.f79444c, errorResult));
        }

        /* renamed from: a */
        public void onSuccess(Map<String, ? extends CalendarEventAttendee> map) {
            String str;
            String serverId;
            CalendarEventAttendee organizer;
            String str2;
            CalendarEventAttendee calendarEventAttendee;
            String str3 = "";
            if (map == null) {
                str = "null";
            } else {
                str = str3 + map.size();
            }
            Log.m165389i("RoomInstanceDetailPresenter", C32673y.m125373a(this.f79443b, this.f79444c, "chatter_id_attendees_size", str));
            com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent c = ((ICalendarDetailContact.IDetailModel) this.f79442a.mo118652t()).mo113417c();
            if (!(c == null || (organizer = c.getOrganizer()) == null)) {
                if (map == null || (calendarEventAttendee = (CalendarEventAttendee) map.get(this.f79445d)) == null) {
                    str2 = null;
                } else {
                    str2 = calendarEventAttendee.getAttendeeCalendarId();
                }
                organizer.setAttendeeCalendarId(str2);
            }
            if (this.f79442a.f79441a) {
                CalendarEventHitPoint cVar = CalendarEventHitPoint.f83362a;
                com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent c2 = ((ICalendarDetailContact.IDetailModel) this.f79442a.mo118652t()).mo113417c();
                if (!(c2 == null || (serverId = c2.getServerId()) == null)) {
                    str3 = serverId;
                }
                cVar.mo118753c(str3, ((ICalendarDetailContact.IDetailModel) this.f79442a.mo118652t()).mo113397F());
                this.f79442a.f79441a = false;
            }
        }

        C31369b(RoomInstanceDetailPresenter gVar, String str, String str2, String str3) {
            this.f79442a = gVar;
            this.f79443b = str;
            this.f79444c = str2;
            this.f79445d = str3;
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.presenter.BaseDetailPresenter
    /* renamed from: a */
    public void mo113848a(List<String> list) {
        ((ICalendarDetailContact.IDetailView) mo118651s()).mo113513d();
        ((ICalendarDetailContact.IDetailView) mo118651s()).mo113504a(list);
        ((ICalendarDetailContact.IDetailView) mo118651s()).mo113517h();
        ((ICalendarDetailContact.IDetailView) mo118651s()).mo113516g();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RoomInstanceDetailPresenter(Bundle bundle, ICalendarDetailContact.IDetailView bVar, ICalendarDetailContact.IDetailModel aVar) {
        super(bVar, aVar);
        Intrinsics.checkParameterIsNotNull(bundle, "initData");
        Intrinsics.checkParameterIsNotNull(bVar, "view");
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        EventDetailSource a = EventDetailSource.Companion.mo113373a(bundle.getInt("enterDetailSource"));
        aVar.mo113403a(a == null ? EventDetailSource.FROM_ROOM_VIEW_NOT_ACCESSIBLE : a);
        Serializable serializable = bundle.getSerializable("calendarEvent");
        Calendar calendar = null;
        com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent calendarEvent = (com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent) (!(serializable instanceof com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent) ? null : serializable);
        if (calendarEvent != null) {
            aVar.mo113407a(calendarEvent, true);
        }
        Serializable serializable2 = bundle.getSerializable("calendar_data");
        aVar.mo113405a(serializable2 instanceof Calendar ? serializable2 : calendar);
    }
}
