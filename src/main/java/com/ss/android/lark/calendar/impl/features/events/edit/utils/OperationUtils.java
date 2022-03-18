package com.ss.android.lark.calendar.impl.features.events.edit.utils;

import android.text.TextUtils;
import com.bytedance.lark.pb.calendar.v1.EventVideoMeetingConfig;
import com.larksuite.framework.utils.aj;
import com.ss.android.lark.calendar.impl.features.events.detail.videoUrl.entity.VideoType;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.CalendarHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttachment;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventInstance;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.DoVideoMeeting;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\r\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0006J,\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000f\u001a\u00020\u000bJ\u0018\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J \u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u0006H\u0002J \u0010\u0015\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000bH\u0002J\u001a\u0010\u0016\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0013J\u0010\u0010\u0019\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u001a\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0006J\"\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u000e\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0006J\u000e\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0006J\u0010\u0010\u001e\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u001f\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0006J\"\u0010 \u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u000e\u0010!\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0006J\u0016\u0010\"\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u000bJ\u001c\u0010&\u001a\u00020\u000b2\b\u0010'\u001a\u0004\u0018\u00010(2\b\u0010)\u001a\u0004\u0018\u00010(H\u0002J\u0010\u0010*\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0006J\u001c\u0010+\u001a\u00020\u000b2\b\u0010,\u001a\u0004\u0018\u00010-2\b\u0010.\u001a\u0004\u0018\u00010-H\u0002J*\u0010/\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00020\u000bJB\u00100\u001a\u00020\u00042\u0006\u00101\u001a\u0002022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u00103\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u00104\u001a\u00020\u00132\b\u00105\u001a\u0004\u0018\u00010\u0013¨\u00066"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/utils/OperationUtils;", "", "()V", "addLocalCalendarEditHitPoint", "", "originalEvent", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "newEvent", "instance", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventInstance;", "canDeleteAll", "", "event", "canDeleteSelf", "checkPropertyModifySupportRepeat", "needAddNewOrganizer", "checkPropertyModifySupportThisEvent", "getResourceIds", "", "", "actionSource", "isAttendeeChanged", "isDeletedRRule", "originalRRule", "currentRRule", "isEditLocalSystemEvent", "isEditable", "isEventAttributeChanged", "isEventRequiredFieldsEmpty", "isExceptional", "isExchangeEvent", "isGoogleEvent", "isLocalEventAttributeChanged", "isMeetingEvent", "isOneExceptional", "exceptionalEventNum", "", "hasOriginalRepeatEvent", "isOtherVideoConfigsChanged", "oldOtherVideoConfigs", "Lcom/bytedance/lark/pb/calendar/v1/EventVideoMeetingConfig$OtherVideoMeetingConfigs;", "otherVideoConfigs", "isRepeatEvent", "isVideoMeetingChanged", "oldVideoMeeting", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/DoVideoMeeting;", "videoMeeting", "onlyHasSwitchDefaultChanges", "saveEditHitPoint", "notificationType", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent$NotificationType;", "isEditEvent", "chatType", "chatId", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.d.e */
public final class OperationUtils {

    /* renamed from: a */
    public static final OperationUtils f80189a = new OperationUtils();

    /* renamed from: a */
    public final boolean mo114876a(int i, boolean z) {
        return i == 1 && !z;
    }

    private OperationUtils() {
    }

    /* renamed from: a */
    public final boolean mo114880a(CalendarEvent calendarEvent, CalendarEvent calendarEvent2, CalendarEventInstance calendarEventInstance, boolean z) {
        Intrinsics.checkParameterIsNotNull(calendarEvent, "event");
        if (calendarEvent2 == null || calendarEventInstance == null || aj.m95022b(calendarEvent.getSummary(), calendarEvent2.getSummary()) || EventCompareUtils.f80187a.mo114865a(calendarEvent, calendarEventInstance)) {
            return false;
        }
        if (calendarEvent.isFree() != calendarEvent2.isFree()) {
            return false;
        }
        CalendarEvent.Visibility visibility = calendarEvent.getVisibility();
        Intrinsics.checkExpressionValueIsNotNull(visibility, "event.visibility");
        int number = visibility.getNumber();
        CalendarEvent.Visibility visibility2 = calendarEvent2.getVisibility();
        Intrinsics.checkExpressionValueIsNotNull(visibility2, "originalEvent.visibility");
        if ((number != visibility2.getNumber()) || EventCompareUtils.f80187a.mo114867b(calendarEvent2, calendarEvent) || aj.m95022b(calendarEvent.getDescription(), calendarEvent2.getDescription()) || aj.m95022b(calendarEvent.getRRule(), calendarEvent2.getRRule())) {
            return false;
        }
        if (!m119213a(calendarEvent, calendarEvent2, z) && calendarEvent.getColor() == calendarEvent2.getColor()) {
            return EventCompareUtils.f80187a.mo114868c(calendarEvent2, calendarEvent);
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo114881a(String str, String str2) {
        String str3 = str;
        if (str3 == null || str3.length() == 0) {
            return false;
        }
        String str4 = str2;
        return str4 == null || str4.length() == 0;
    }

    /* renamed from: b */
    public final boolean mo114882b(CalendarEvent calendarEvent) {
        if (calendarEvent == null || calendarEvent.getSource() != CalendarEvent.Source.GOOGLE) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo114889f(CalendarEvent calendarEvent) {
        if (calendarEvent == null || calendarEvent.getIsDeletable() != CalendarEvent.Deletable.ALL) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public final boolean mo114890g(CalendarEvent calendarEvent) {
        if (calendarEvent == null || calendarEvent.getIsDeletable() != CalendarEvent.Deletable.SELF) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final boolean mo114886c(CalendarEvent calendarEvent) {
        if (calendarEvent == null || TextUtils.isEmpty(calendarEvent.getRRule())) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final boolean mo114887d(CalendarEvent calendarEvent) {
        Intrinsics.checkParameterIsNotNull(calendarEvent, "event");
        if (calendarEvent.getOriginalTime() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final boolean mo114891h(CalendarEvent calendarEvent) {
        if (calendarEvent != null) {
            Boolean isEditable = calendarEvent.getIsEditable();
            Intrinsics.checkExpressionValueIsNotNull(isEditable, "event.isEditable");
            if (isEditable.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public final boolean mo114888e(CalendarEvent calendarEvent) {
        Intrinsics.checkParameterIsNotNull(calendarEvent, "event");
        if (calendarEvent.getCreatorCalendarId() == null || TextUtils.isEmpty(calendarEvent.getCalendarId()) || calendarEvent.getOrganizerCalendarId() == null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo114877a(CalendarEvent calendarEvent) {
        if (calendarEvent == null || calendarEvent.getSource() != CalendarEvent.Source.ANDROID) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private final boolean m119211a(EventVideoMeetingConfig.OtherVideoMeetingConfigs otherVideoMeetingConfigs, EventVideoMeetingConfig.OtherVideoMeetingConfigs otherVideoMeetingConfigs2) {
        if (otherVideoMeetingConfigs == null && otherVideoMeetingConfigs2 == null) {
            return false;
        }
        if (otherVideoMeetingConfigs == null || otherVideoMeetingConfigs2 == null || (!Intrinsics.areEqual(otherVideoMeetingConfigs.customized_description, otherVideoMeetingConfigs2.customized_description)) || otherVideoMeetingConfigs.icon != otherVideoMeetingConfigs2.icon) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private final List<String> m119210a(String str, CalendarEvent calendarEvent) {
        List<CalendarEventAttendee> attendees;
        if ((!Intrinsics.areEqual(str, "code_calendar")) || (attendees = calendarEvent.getAttendees()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (T t : attendees) {
            T t2 = t;
            Intrinsics.checkExpressionValueIsNotNull(t2, "it");
            if (t2.isResource()) {
                arrayList.add(t);
            }
        }
        ArrayList<CalendarEventAttendee> arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        for (CalendarEventAttendee calendarEventAttendee : arrayList2) {
            Intrinsics.checkExpressionValueIsNotNull(calendarEventAttendee, "it");
            String attendeeCalendarId = calendarEventAttendee.getAttendeeCalendarId();
            if (attendeeCalendarId == null) {
                attendeeCalendarId = "";
            }
            arrayList3.add(attendeeCalendarId);
        }
        return arrayList3;
    }

    /* renamed from: a */
    private final boolean m119214a(DoVideoMeeting doVideoMeeting, DoVideoMeeting doVideoMeeting2) {
        if (doVideoMeeting == null && doVideoMeeting2 == null) {
            return false;
        }
        if (doVideoMeeting == null || doVideoMeeting2 == null || doVideoMeeting.getMeetingType() != doVideoMeeting2.getMeetingType()) {
            return true;
        }
        if (doVideoMeeting.getMeetingType() != VideoType.OTHER) {
            return false;
        }
        if (m119211a(doVideoMeeting.getOtherVideoConfigs(), doVideoMeeting2.getOtherVideoConfigs()) || (!Intrinsics.areEqual(doVideoMeeting.getMeetingUrl(), doVideoMeeting2.getMeetingUrl()))) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo114878a(CalendarEvent calendarEvent, CalendarEvent calendarEvent2) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(calendarEvent, "event");
        if (calendarEvent2 == null || aj.m95022b(calendarEvent.getCalendarId(), calendarEvent2.getCalendarId()) || calendarEvent.getColor() != calendarEvent2.getColor()) {
            return false;
        }
        CalendarEvent.Visibility visibility = calendarEvent.getVisibility();
        Intrinsics.checkExpressionValueIsNotNull(visibility, "event.visibility");
        int number = visibility.getNumber();
        CalendarEvent.Visibility visibility2 = calendarEvent2.getVisibility();
        Intrinsics.checkExpressionValueIsNotNull(visibility2, "originalEvent.visibility");
        boolean z2 = true;
        if (number != visibility2.getNumber()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        if (calendarEvent.isFree() == calendarEvent2.isFree()) {
            z2 = false;
        }
        if (!z2 && !EventCompareUtils.f80187a.mo114868c(calendarEvent2, calendarEvent)) {
            return EventCompareUtils.f80187a.mo114863a(calendarEvent2, calendarEvent);
        }
        return false;
    }

    /* renamed from: a */
    private final boolean m119213a(CalendarEvent calendarEvent, CalendarEvent calendarEvent2, boolean z) {
        if (aj.m95020a(calendarEvent2.getCalendarId(), calendarEvent.getCalendarId())) {
            return EventCompareUtils.f80187a.mo114863a(calendarEvent2, calendarEvent);
        }
        return EventCompareUtils.f80187a.mo114864a(calendarEvent, calendarEvent2, z);
    }

    /* renamed from: b */
    public final boolean mo114883b(CalendarEvent calendarEvent, CalendarEvent calendarEvent2, CalendarEventInstance calendarEventInstance) {
        Intrinsics.checkParameterIsNotNull(calendarEvent, "event");
        if (calendarEvent2 == null || calendarEventInstance == null) {
            return false;
        }
        if (!aj.m95022b(calendarEvent.getSummary(), calendarEvent2.getSummary()) && !EventCompareUtils.f80187a.mo114865a(calendarEvent, calendarEventInstance) && !EventCompareUtils.f80187a.mo114867b(calendarEvent2, calendarEvent) && !aj.m95022b(calendarEvent.getDescription(), calendarEvent2.getDescription()) && !aj.m95022b(calendarEvent.getRRule(), calendarEvent2.getRRule())) {
            return EventCompareUtils.f80187a.mo114868c(calendarEvent2, calendarEvent);
        }
        return true;
    }

    /* renamed from: c */
    public final void mo114885c(CalendarEvent calendarEvent, CalendarEvent calendarEvent2, CalendarEventInstance calendarEventInstance) {
        if (calendarEvent != null && calendarEvent2 != null && calendarEventInstance != null) {
            if (aj.m95022b(calendarEvent2.getSummary(), calendarEvent.getSummary())) {
                String uuid = UUID.randomUUID().toString();
                Intrinsics.checkExpressionValueIsNotNull(uuid, "UUID.randomUUID().toString()");
                CalendarHitPoint.m124126b(uuid);
            }
            if (EventCompareUtils.f80187a.mo114865a(calendarEvent2, calendarEventInstance)) {
                String uuid2 = UUID.randomUUID().toString();
                Intrinsics.checkExpressionValueIsNotNull(uuid2, "UUID.randomUUID().toString()");
                CalendarHitPoint.m124129c(uuid2);
            }
            if (EventCompareUtils.f80187a.mo114868c(calendarEvent, calendarEvent2)) {
                String uuid3 = UUID.randomUUID().toString();
                Intrinsics.checkExpressionValueIsNotNull(uuid3, "UUID.randomUUID().toString()");
                CalendarHitPoint.m124131d(uuid3);
            }
            if (EventCompareUtils.f80187a.mo114867b(calendarEvent, calendarEvent2)) {
                String uuid4 = UUID.randomUUID().toString();
                Intrinsics.checkExpressionValueIsNotNull(uuid4, "UUID.randomUUID().toString()");
                CalendarHitPoint.m124133e(uuid4);
            }
            if (aj.m95022b(calendarEvent2.getRRule(), calendarEvent.getRRule())) {
                String uuid5 = UUID.randomUUID().toString();
                Intrinsics.checkExpressionValueIsNotNull(uuid5, "UUID.randomUUID().toString()");
                CalendarHitPoint.m124135f(uuid5);
            }
            if (aj.m95022b(calendarEvent2.getDescription(), calendarEvent.getDescription())) {
                String uuid6 = UUID.randomUUID().toString();
                Intrinsics.checkExpressionValueIsNotNull(uuid6, "UUID.randomUUID().toString()");
                CalendarHitPoint.m124137g(uuid6);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo114879a(CalendarEvent calendarEvent, CalendarEvent calendarEvent2, CalendarEventInstance calendarEventInstance) {
        Intrinsics.checkParameterIsNotNull(calendarEvent, "event");
        if (calendarEvent2 == null || calendarEventInstance == null) {
            return false;
        }
        if (aj.m95022b(calendarEvent.getSummary(), calendarEvent2.getSummary()) || EventCompareUtils.f80187a.mo114865a(calendarEvent, calendarEventInstance) || aj.m95022b(calendarEvent.getCalendarId(), calendarEvent2.getCalendarId()) || calendarEvent.isFree() != calendarEvent2.isFree()) {
            return true;
        }
        CalendarEvent.Visibility visibility = calendarEvent.getVisibility();
        Intrinsics.checkExpressionValueIsNotNull(visibility, "event.visibility");
        int number = visibility.getNumber();
        CalendarEvent.Visibility visibility2 = calendarEvent2.getVisibility();
        Intrinsics.checkExpressionValueIsNotNull(visibility2, "originalEvent.visibility");
        if (number != visibility2.getNumber() || EventCompareUtils.f80187a.mo114867b(calendarEvent2, calendarEvent) || aj.m95022b(calendarEvent.getDescription(), calendarEvent2.getDescription())) {
            return true;
        }
        EventCompareUtils cVar = EventCompareUtils.f80187a;
        List<CalendarEventAttachment> attachment = calendarEvent.getAttachment();
        Intrinsics.checkExpressionValueIsNotNull(attachment, "event.attachment");
        List<CalendarEventAttachment> attachment2 = calendarEvent2.getAttachment();
        Intrinsics.checkExpressionValueIsNotNull(attachment2, "originalEvent.attachment");
        if (!cVar.mo114866a(attachment, attachment2) && !aj.m95022b(calendarEvent.getRRule(), calendarEvent2.getRRule()) && !EventCompareUtils.f80187a.mo114863a(calendarEvent2, calendarEvent) && calendarEvent.getColor() == calendarEvent2.getColor() && !m119214a(calendarEvent2.getVideoMeeting(), calendarEvent.getVideoMeeting()) && !EventCompareUtils.f80187a.mo114870e(calendarEvent2, calendarEvent)) {
            return EventCompareUtils.f80187a.mo114868c(calendarEvent2, calendarEvent);
        }
        return true;
    }

    /* renamed from: b */
    public final boolean mo114884b(CalendarEvent calendarEvent, CalendarEvent calendarEvent2, CalendarEventInstance calendarEventInstance, boolean z) {
        Intrinsics.checkParameterIsNotNull(calendarEvent, "event");
        if (calendarEvent2 == null || calendarEventInstance == null || aj.m95020a(calendarEvent.getCalendarId(), calendarEvent2.getCalendarId()) || aj.m95022b(calendarEvent.getSummary(), calendarEvent2.getSummary()) || EventCompareUtils.f80187a.mo114865a(calendarEvent, calendarEventInstance) || calendarEvent.isFree() != calendarEvent2.isFree()) {
            return false;
        }
        CalendarEvent.Visibility visibility = calendarEvent.getVisibility();
        Intrinsics.checkExpressionValueIsNotNull(visibility, "event.visibility");
        int number = visibility.getNumber();
        CalendarEvent.Visibility visibility2 = calendarEvent2.getVisibility();
        Intrinsics.checkExpressionValueIsNotNull(visibility2, "originalEvent.visibility");
        if (number != visibility2.getNumber() || EventCompareUtils.f80187a.mo114867b(calendarEvent2, calendarEvent) || aj.m95022b(calendarEvent.getDescription(), calendarEvent2.getDescription())) {
            return false;
        }
        EventCompareUtils cVar = EventCompareUtils.f80187a;
        List<CalendarEventAttachment> attachment = calendarEvent.getAttachment();
        Intrinsics.checkExpressionValueIsNotNull(attachment, "event.attachment");
        List<CalendarEventAttachment> attachment2 = calendarEvent2.getAttachment();
        Intrinsics.checkExpressionValueIsNotNull(attachment2, "originalEvent.attachment");
        if (!cVar.mo114866a(attachment, attachment2) && !aj.m95022b(calendarEvent.getRRule(), calendarEvent2.getRRule()) && calendarEvent.getColor() == calendarEvent2.getColor() && !EventCompareUtils.f80187a.mo114868c(calendarEvent2, calendarEvent)) {
            return !EventCompareUtils.f80187a.mo114864a(calendarEvent, calendarEvent2, z);
        }
        return false;
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m119212a(OperationUtils eVar, CalendarEvent calendarEvent, CalendarEvent calendarEvent2, CalendarEventInstance calendarEventInstance, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        return eVar.mo114880a(calendarEvent, calendarEvent2, calendarEventInstance, z);
    }

    /* renamed from: a */
    public final void mo114875a(CalendarEvent.NotificationType notificationType, String str, boolean z, CalendarEvent calendarEvent, CalendarEvent calendarEvent2, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(notificationType, "notificationType");
        Intrinsics.checkParameterIsNotNull(str, "actionSource");
        Intrinsics.checkParameterIsNotNull(calendarEvent, "event");
        Intrinsics.checkParameterIsNotNull(str2, "chatType");
        if (z) {
            GeneralHitPoint.m124203a(str, "edit", notificationType, calendarEvent, calendarEvent2, str2, str3, null, SmActions.ACTION_ONTHECALL_EXIT, null);
        } else {
            GeneralHitPoint.m124202a(str, "new", notificationType, calendarEvent, calendarEvent2, str2, str3, m119210a(str, calendarEvent));
        }
    }
}
