package com.ss.android.lark.calendar.impl.rustadapter.p1573a;

import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.lark.pb.calendar.v1.AlternateCalendar;
import com.bytedance.lark.pb.calendar.v1.Calendar;
import com.bytedance.lark.pb.calendar.v1.CalendarDirtyType;
import com.bytedance.lark.pb.calendar.v1.CalendarEvent;
import com.bytedance.lark.pb.calendar.v1.CalendarEventAttachment;
import com.bytedance.lark.pb.calendar.v1.CalendarEventAttendee;
import com.bytedance.lark.pb.calendar.v1.CalendarEventDisplayInfo;
import com.bytedance.lark.pb.calendar.v1.CalendarEventInstance;
import com.bytedance.lark.pb.calendar.v1.CalendarEventReminder;
import com.bytedance.lark.pb.calendar.v1.CalendarEventUniqueField;
import com.bytedance.lark.pb.calendar.v1.CalendarLocation;
import com.bytedance.lark.pb.calendar.v1.CalendarMember;
import com.bytedance.lark.pb.calendar.v1.CalendarResource;
import com.bytedance.lark.pb.calendar.v1.CalendarSchemaCollection;
import com.bytedance.lark.pb.calendar.v1.CalendarSchemaCompatibility;
import com.bytedance.lark.pb.calendar.v1.CalendarSetting;
import com.bytedance.lark.pb.calendar.v1.ConflictType;
import com.bytedance.lark.pb.calendar.v1.DayInstancesSlotMetric;
import com.bytedance.lark.pb.calendar.v1.DayOfWeek;
import com.bytedance.lark.pb.calendar.v1.EntitySchema;
import com.bytedance.lark.pb.calendar.v1.EventAttendeeInfo;
import com.bytedance.lark.pb.calendar.v1.EventCreator;
import com.bytedance.lark.pb.calendar.v1.EventHighLight;
import com.bytedance.lark.pb.calendar.v1.EventInviteOperator;
import com.bytedance.lark.pb.calendar.v1.GetCalendarEventMappingColorsResponse;
import com.bytedance.lark.pb.calendar.v1.GetChatFreeBusyFavorResponse;
import com.bytedance.lark.pb.calendar.v1.GetMeetingEventResponse;
import com.bytedance.lark.pb.calendar.v1.GetRecentTimezonesResponse;
import com.bytedance.lark.pb.calendar.v1.GetTimezoneByCityResponse;
import com.bytedance.lark.pb.calendar.v1.IncompatibleLevel;
import com.bytedance.lark.pb.calendar.v1.InstanceLayout;
import com.bytedance.lark.pb.calendar.v1.InstanceSlotMetric;
import com.bytedance.lark.pb.calendar.v1.JudgeNotificationBoxTypeResponse;
import com.bytedance.lark.pb.calendar.v1.MappingColor;
import com.bytedance.lark.pb.calendar.v1.PullAttendeesInDepartmentsResponse;
import com.bytedance.lark.pb.calendar.v1.RedDotUiItem;
import com.bytedance.lark.pb.calendar.v1.SchemaExtraData;
import com.bytedance.lark.pb.calendar.v1.SearchCalendarEventContent;
import com.bytedance.lark.pb.calendar.v1.SearchCalendarEventInstance;
import com.bytedance.lark.pb.calendar.v1.SearchMeetingRoomsResponse;
import com.bytedance.lark.pb.calendar.v1.ShareCalendarEventMessageResponse;
import com.bytedance.lark.pb.calendar.v1.SimpleMember;
import com.bytedance.lark.pb.calendar.v1.SimpleMembers;
import com.bytedance.lark.pb.calendar.v1.SkinSetting;
import com.bytedance.lark.pb.calendar.v1.WorkHourItem;
import com.bytedance.lark.pb.calendar.v1.WorkHourSetting;
import com.bytedance.lark.pb.calendar.v1.WorkHourSpan;
import com.larksuite.framework.utils.C26249aa;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.calendar.impl.features.calendarview.timezone.adapter.TimeZoneItemData;
import com.ss.android.lark.calendar.impl.features.search.HighLightTag;
import com.ss.android.lark.calendar.impl.features.search.SearchCalendarEventResult;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarBuilding;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttachment;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventCreator;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventDisplayExtraData;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventDisplayInfo;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventInstance;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventInstanceTime;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventReminder;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarLocation;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarMeetingEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarMember;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarResource;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSchemaCollection;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSchemaCompatibility;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSettingConfig;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSkinColorTool;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarWorkHourSetting;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarWorkHourSpan;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.ChatFreeBusyFavor;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.DayInstancesLayout;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.DirtyType;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.DoVideoMeeting;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.EntitySchema;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.EventInviteOperator;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.InstanceSlotMetric;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Meeting;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.MeetingDependency;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.NotificationBoxType;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.PullEventGroupAttendeeMembersResponse;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.RedDotUiItem;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.SchemaExtraData;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.ShareFailedChat;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.SimpleMember;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.UserAttendeeBaseInfo;
import com.ss.android.lark.calendar.impl.utils.TimeZoneUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.calendar.impl.rustadapter.a.b */
public class C32514b {
    /* renamed from: a */
    public static List<Calendar> m124545a(List<com.bytedance.lark.pb.calendar.v1.Calendar> list) {
        return C26249aa.m94984a(list, new C26249aa.AbstractC26250a<com.bytedance.lark.pb.calendar.v1.Calendar, Calendar>() {
            /* class com.ss.android.lark.calendar.impl.rustadapter.p1573a.C32514b.C325151 */

            /* renamed from: a */
            public Calendar get(com.bytedance.lark.pb.calendar.v1.Calendar calendar) {
                return C32514b.m124510a(calendar);
            }
        });
    }

    /* renamed from: a */
    public static Map<String, Calendar> m124547a(Map<String, com.bytedance.lark.pb.calendar.v1.Calendar> map) {
        return C26249aa.m94985a(map, new C26249aa.AbstractC26250a<com.bytedance.lark.pb.calendar.v1.Calendar, Calendar>() {
            /* class com.ss.android.lark.calendar.impl.rustadapter.p1573a.C32514b.C325217 */

            /* renamed from: a */
            public Calendar get(com.bytedance.lark.pb.calendar.v1.Calendar calendar) {
                return C32514b.m124510a(calendar);
            }
        });
    }

    /* renamed from: a */
    public static CalendarEventInstance m124516a(com.bytedance.lark.pb.calendar.v1.CalendarEventInstance calendarEventInstance) {
        if (calendarEventInstance == null) {
            return null;
        }
        CalendarEventInstance calendarEventInstance2 = new CalendarEventInstance();
        calendarEventInstance2.setId(calendarEventInstance.id);
        calendarEventInstance2.setEventId(calendarEventInstance.event_id);
        calendarEventInstance2.setCalendarId(calendarEventInstance.calendar_id);
        calendarEventInstance2.setOrganizerId(calendarEventInstance.organizer_id);
        calendarEventInstance2.setStartTime(calendarEventInstance.start_time.longValue());
        calendarEventInstance2.setStartTimezone(calendarEventInstance.start_timezone);
        calendarEventInstance2.setEndTime(calendarEventInstance.end_time.longValue());
        calendarEventInstance2.setEndTimezone(calendarEventInstance.end_timezone);
        calendarEventInstance2.setStartDay(calendarEventInstance.start_day.intValue());
        calendarEventInstance2.setEndDay(calendarEventInstance.end_day.intValue());
        calendarEventInstance2.setStartMinute(calendarEventInstance.start_minute.intValue());
        calendarEventInstance2.setEndMinute(calendarEventInstance.end_minute.intValue());
        calendarEventInstance2.setKey(calendarEventInstance.key);
        calendarEventInstance2.setOriginalTime(calendarEventInstance.original_time.longValue());
        calendarEventInstance2.setColor(calendarEventInstance.color.intValue());
        calendarEventInstance2.setCalForegroundColor(calendarEventInstance.cal_foreground_color.intValue());
        calendarEventInstance2.setCalBackgroundColor(calendarEventInstance.cal_background_color.intValue());
        calendarEventInstance2.setEventType(CalendarEvent.Type.forNumber(calendarEventInstance.event_type.getValue()));
        MappingColor mappingColor = calendarEventInstance.event_color;
        if (mappingColor != null) {
            calendarEventInstance2.setEventColor(new com.ss.android.lark.calendar.impl.rustadapter.doentity.MappingColor(mappingColor.background_color.intValue(), mappingColor.foreground_color.intValue(), mappingColor.event_card_color.intValue(), mappingColor.event_color_index));
        }
        MappingColor mappingColor2 = calendarEventInstance.cal_color;
        if (mappingColor2 != null) {
            calendarEventInstance2.setCalColor(new com.ss.android.lark.calendar.impl.rustadapter.doentity.MappingColor(mappingColor2.background_color.intValue(), mappingColor2.foreground_color.intValue(), mappingColor2.event_card_color.intValue(), mappingColor2.event_color_index));
        }
        calendarEventInstance2.setSummary(calendarEventInstance.summary);
        calendarEventInstance2.setIsAllDay(calendarEventInstance.is_all_day.booleanValue());
        calendarEventInstance2.setStatus(CalendarEvent.Status.forNumber(calendarEventInstance.status.getValue()));
        calendarEventInstance2.setSelfAttendeeStatus(CalendarEventAttendee.Status.forNumber(calendarEventInstance.self_attendee_status.getValue()));
        calendarEventInstance2.setIsFree(calendarEventInstance.is_free.booleanValue());
        calendarEventInstance2.setCalAccessRole(Calendar.AccessRole.forNumber(calendarEventInstance.cal_access_role.getValue()));
        calendarEventInstance2.setEventServerId(calendarEventInstance.event_server_id);
        calendarEventInstance2.setIsEditable(calendarEventInstance.is_editable.booleanValue());
        calendarEventInstance2.setCalendarLocation(m124518a(calendarEventInstance.location));
        calendarEventInstance2.setVisibility(CalendarEvent.Visibility.forNumber(calendarEventInstance.visibility.getValue()));
        calendarEventInstance2.setIsSubscriber(calendarEventInstance.is_subscriber.booleanValue());
        calendarEventInstance2.setMeetingRooms(new ArrayList(calendarEventInstance.meeting_rooms));
        calendarEventInstance2.setDisplayType(CalendarEvent.DisplayType.forNumber(calendarEventInstance.display_type.getValue()));
        calendarEventInstance2.setSource(CalendarEvent.Source.forNumber(calendarEventInstance.source.getValue()));
        calendarEventInstance2.setEventCreator(m124514a(calendarEventInstance.creator));
        calendarEventInstance2.setOriginalEventCreator(m124514a(calendarEventInstance.original_event_creator));
        calendarEventInstance2.setImportanceScore(calendarEventInstance.importance_score);
        if (calendarEventInstance.category != null) {
            calendarEventInstance2.setCategory(CalendarEvent.Category.forNumber(calendarEventInstance.category.getValue()));
        }
        return calendarEventInstance2;
    }

    /* renamed from: a */
    public static CalendarEventCreator m124514a(EventCreator eventCreator) {
        if (eventCreator == null) {
            return null;
        }
        CalendarEventCreator calendarEventCreator = new CalendarEventCreator();
        calendarEventCreator.setType(CalendarEventCreator.Type.valueOf(eventCreator.type.getValue()));
        calendarEventCreator.setAvatarUrl(eventCreator.avatar_url);
        calendarEventCreator.setAvatarKey(eventCreator.avatar_key);
        calendarEventCreator.setChatterId(eventCreator.chatter_id);
        calendarEventCreator.setDepartment(eventCreator.department);
        calendarEventCreator.setName(eventCreator.name);
        calendarEventCreator.setHasResigned(eventCreator.has_resigned.booleanValue());
        return calendarEventCreator;
    }

    /* renamed from: a */
    public static CalendarEvent m124512a(com.bytedance.lark.pb.calendar.v1.CalendarEvent calendarEvent) {
        if (calendarEvent == null) {
            return null;
        }
        CalendarEvent calendarEvent2 = new CalendarEvent();
        calendarEvent2.setId(calendarEvent.id);
        calendarEvent2.setCreatorCalendarId(calendarEvent.creator_calendar_id);
        calendarEvent2.setCalendarId(calendarEvent.calendar_id);
        calendarEvent2.setOrganizerCalendarId(calendarEvent.organizer_calendar_id);
        calendarEvent2.setServerId(calendarEvent.server_id);
        calendarEvent2.setSelfAttendeeStatus(CalendarEventAttendee.Status.forNumber(calendarEvent.self_attendee_status.getValue()));
        calendarEvent2.setKey(calendarEvent.key);
        calendarEvent2.setOriginalTime(calendarEvent.original_time.longValue());
        calendarEvent2.setOriginalEventKey(calendarEvent.original_event_key);
        calendarEvent2.setOriginalIsAllDay(calendarEvent.original_is_all_day.booleanValue());
        calendarEvent2.setIsFree(calendarEvent.is_free.booleanValue());
        calendarEvent2.setLastDate(calendarEvent.last_date.longValue());
        calendarEvent2.setCreateTime(calendarEvent.create_time.longValue());
        calendarEvent2.setUpdateTime(calendarEvent.update_time.longValue());
        calendarEvent2.setColor(calendarEvent.color.intValue());
        calendarEvent2.setType(CalendarEvent.Type.forNumber(calendarEvent.type.getValue()));
        calendarEvent2.setConflictType(CalendarEvent.ConflictType.forNumber(calendarEvent.conflict_type.getValue()));
        calendarEvent2.setMeetingId(calendarEvent.meeting_id);
        calendarEvent2.setIsEditable(calendarEvent.is_editable);
        MappingColor mappingColor = calendarEvent.cal_color;
        if (mappingColor != null) {
            calendarEvent2.setCalColor(new com.ss.android.lark.calendar.impl.rustadapter.doentity.MappingColor(mappingColor.background_color.intValue(), mappingColor.foreground_color.intValue(), mappingColor.event_card_color.intValue(), mappingColor.event_color_index));
        }
        MappingColor mappingColor2 = calendarEvent.event_color;
        if (mappingColor2 != null) {
            calendarEvent2.setEventColor(new com.ss.android.lark.calendar.impl.rustadapter.doentity.MappingColor(mappingColor2.background_color.intValue(), mappingColor2.foreground_color.intValue(), mappingColor2.event_card_color.intValue(), mappingColor2.event_color_index));
        }
        calendarEvent2.setSource(CalendarEvent.Source.forNumber(calendarEvent.source.getValue()));
        calendarEvent2.setVisibility(CalendarEvent.Visibility.forNumber(calendarEvent.visibility.getValue()));
        calendarEvent2.setImportance(calendarEvent.importance.intValue());
        calendarEvent2.setDirtyType(DirtyType.forNumber(calendarEvent.dirty_type.getValue()));
        calendarEvent2.setVersion(calendarEvent.version.intValue());
        calendarEvent2.setIsNeedUpdate(calendarEvent.need_update.booleanValue());
        calendarEvent2.setSummary(calendarEvent.summary);
        calendarEvent2.setDescription(calendarEvent.description);
        calendarEvent2.setDocsDescription(calendarEvent.docs_description);
        calendarEvent2.setIsAllDay(calendarEvent.is_all_day.booleanValue());
        calendarEvent2.setStartTime(calendarEvent.start_time.longValue());
        calendarEvent2.setStartTimeZone(calendarEvent.start_timezone);
        calendarEvent2.setEndTime(calendarEvent.end_time.longValue());
        calendarEvent2.setEndTimeZone(calendarEvent.end_timezone);
        calendarEvent2.setStatus(CalendarEvent.Status.forNumber(calendarEvent.status.getValue()));
        calendarEvent2.setRRule(calendarEvent.rrule);
        calendarEvent2.setGuestsCanInvite(calendarEvent.guest_can_invite.booleanValue());
        calendarEvent2.setGuestsCanSeeOtherGuests(calendarEvent.guest_can_see_other_guests.booleanValue());
        calendarEvent2.setGuestsCanModify(calendarEvent.guest_can_modify.booleanValue());
        calendarEvent2.setUrl(calendarEvent.url);
        calendarEvent2.setLocation(m124518a(calendarEvent.location));
        calendarEvent2.setHasAlarm(calendarEvent.has_alarm.booleanValue());
        calendarEvent2.setHasAttendee(calendarEvent.has_attendee.booleanValue());
        calendarEvent2.setIsScheduled(calendarEvent.is_scheduled.booleanValue());
        calendarEvent2.setCreator(m124513a(calendarEvent.creator));
        calendarEvent2.setOrganizer(m124513a(calendarEvent.organizer));
        calendarEvent2.setSuccessor(m124513a(calendarEvent.successor));
        calendarEvent2.setCreatorIsAttend(calendarEvent.will_creator_attend.booleanValue());
        calendarEvent2.setOrganizerIsAttend(calendarEvent.will_organizer_attend.booleanValue());
        calendarEvent2.setSuccessorIsAttend(calendarEvent.will_successor_attend.booleanValue());
        calendarEvent2.setAttendees(m124557f(calendarEvent.attendees));
        calendarEvent2.setReminders(m124553d(calendarEvent.reminders));
        calendarEvent2.setAttachments(m124555e(calendarEvent.attachments));
        calendarEvent2.setDisplayType(CalendarEvent.DisplayType.forNumber(calendarEvent.display_type.getValue()));
        calendarEvent2.setIsDeletable(CalendarEvent.Deletable.forNumber(calendarEvent.is_deletable.getValue()));
        calendarEvent2.setSharability(CalendarEvent.Sharability.forNumber(calendarEvent.sharability.getValue()));
        calendarEvent2.setIsCrossTenant(calendarEvent.is_cross_tenant.booleanValue());
        calendarEvent2.setMeetingMinuteUrl(calendarEvent.meeting_minute_url);
        calendarEvent2.setUserInviteOperatorId(calendarEvent.user_invite_operator_id);
        calendarEvent2.setCalendarEventDisplayInfo(m124515a(calendarEvent.calendar_event_display_info));
        calendarEvent2.setUserInviteOperator(m124529a(calendarEvent.user_invite_operator));
        if (calendarEvent.video_meeting != null) {
            calendarEvent2.setVideoMeeting(new DoVideoMeeting(calendarEvent.video_meeting));
        }
        if (calendarEvent.schema != null) {
            calendarEvent2.setCalendarSchemaCollection(m124522a(calendarEvent.schema));
        }
        calendarEvent2.setAttendeeSource(calendarEvent.attendee_source.intValue());
        if (calendarEvent.attendee_info != null) {
            calendarEvent2.setEventAttendeeInfo(calendarEvent.attendee_info);
            calendarEvent2.setAttendeeNum(calendarEvent.attendee_info.total_no.intValue());
        }
        if (calendarEvent.category != null) {
            calendarEvent2.setCategory(CalendarEvent.Category.forNumber(calendarEvent.category.getValue()));
        }
        return calendarEvent2;
    }

    /* renamed from: a */
    public static Map<String, CalendarEventAttendee> m124546a(List<String> list, List<PullAttendeesInDepartmentsResponse.DepartmentAttendees> list2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (PullAttendeesInDepartmentsResponse.DepartmentAttendees departmentAttendees : list2) {
            for (com.bytedance.lark.pb.calendar.v1.CalendarEventAttendee calendarEventAttendee : departmentAttendees.attendees) {
                linkedHashMap.put(calendarEventAttendee.user.user_id, m124513a(calendarEventAttendee));
            }
        }
        for (String str : list) {
            linkedHashMap.put(str, null);
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    public static CalendarEventAttendee m124513a(com.bytedance.lark.pb.calendar.v1.CalendarEventAttendee calendarEventAttendee) {
        if (calendarEventAttendee == null) {
            return null;
        }
        CalendarEventAttendee calendarEventAttendee2 = new CalendarEventAttendee();
        calendarEventAttendee2.setId(calendarEventAttendee.id);
        calendarEventAttendee2.setKey(calendarEventAttendee.key);
        calendarEventAttendee2.setOriginalTime(calendarEventAttendee.original_time.longValue());
        calendarEventAttendee2.setDisplayName(calendarEventAttendee.display_name);
        calendarEventAttendee2.setLocalizedDisplayName(calendarEventAttendee.display_name);
        calendarEventAttendee2.setAttendeeCalendarId(calendarEventAttendee.attendee_calendar_id);
        calendarEventAttendee2.setIsOrganizer(calendarEventAttendee.is_organizer.booleanValue());
        calendarEventAttendee2.setStatus(CalendarEventAttendee.Status.forNumber(calendarEventAttendee.status.getValue()));
        calendarEventAttendee2.setAdditionalGuestsCount(calendarEventAttendee.additional_guests_count.intValue());
        calendarEventAttendee2.setAvatarKey(calendarEventAttendee.avatar_key);
        calendarEventAttendee2.setIsOptional(calendarEventAttendee.is_optional.booleanValue());
        calendarEventAttendee2.setIsEditable(calendarEventAttendee.is_editable.booleanValue());
        calendarEventAttendee2.setInviterCalendarId(calendarEventAttendee.inviter_calendar_id);
        calendarEventAttendee2.setCategory(CalendarEventAttendee.Category.fromValue(calendarEventAttendee.category.getValue()));
        if (calendarEventAttendee.category == CalendarEventAttendee.Category.USER) {
            if (calendarEventAttendee.user != null) {
                calendarEventAttendee2.setTenantId(calendarEventAttendee.user.tenant_id);
                calendarEventAttendee2.setUserId(calendarEventAttendee.user.user_id);
                calendarEventAttendee2.setTimeZoneId(calendarEventAttendee.user.timezone_id);
            }
        } else if (calendarEventAttendee.category == CalendarEventAttendee.Category.GROUP) {
            if (calendarEventAttendee.group != null) {
                calendarEventAttendee2.setTenantId(calendarEventAttendee.group.tenant_id);
                calendarEventAttendee2.setGroupId(calendarEventAttendee.group.group_id);
                calendarEventAttendee2.setIsCrossTenantGroup(calendarEventAttendee.group.is_cross_tenant.booleanValue());
                calendarEventAttendee2.setOpenSecurity(calendarEventAttendee.group.open_security.booleanValue());
                calendarEventAttendee2.setShowMemberLimit(calendarEventAttendee.group.show_member_limit.intValue());
                calendarEventAttendee2.setValidMemberCount(calendarEventAttendee.group.valid_member_count.intValue());
                calendarEventAttendee2.setIsAnyRemoved(calendarEventAttendee.group.is_any_removed.booleanValue());
                calendarEventAttendee2.setIsSelfInGroup(calendarEventAttendee.group.is_self_in_group.booleanValue());
                if (calendarEventAttendee.group.members != null && calendarEventAttendee.group.members.size() > 0) {
                    ArrayList arrayList = new ArrayList();
                    for (com.bytedance.lark.pb.calendar.v1.CalendarEventAttendee calendarEventAttendee3 : calendarEventAttendee.group.members) {
                        arrayList.add(m124513a(calendarEventAttendee3));
                    }
                    calendarEventAttendee2.setGroupMembers(arrayList);
                }
            }
        } else if (calendarEventAttendee.category == CalendarEventAttendee.Category.RESOURCE) {
            if (calendarEventAttendee.resource != null) {
                calendarEventAttendee2.setTenantId(calendarEventAttendee.resource.tenant_id);
                calendarEventAttendee2.setDisabled(calendarEventAttendee.resource.is_disabled.booleanValue());
                boolean z = true;
                if (calendarEventAttendee.resource.resource_status.getValue() != 1) {
                    z = false;
                }
                calendarEventAttendee2.setForceReleased(Boolean.valueOf(z));
            }
        } else if (calendarEventAttendee.category == CalendarEventAttendee.Category.THIRD_PARTY_USER && calendarEventAttendee.third_party_user != null) {
            calendarEventAttendee2.setEmail(calendarEventAttendee.third_party_user.email);
        }
        if (calendarEventAttendee.attendee_schema != null) {
            calendarEventAttendee2.setSchemaCollection(m124522a(calendarEventAttendee.attendee_schema));
        }
        if (calendarEventAttendee.schema_extra_data != null) {
            calendarEventAttendee2.setSchemaExtraData(m124535a(calendarEventAttendee.schema_extra_data));
        }
        return calendarEventAttendee2;
    }

    /* renamed from: a */
    public static CalendarLocation m124518a(com.bytedance.lark.pb.calendar.v1.CalendarLocation calendarLocation) {
        if (calendarLocation == null) {
            return null;
        }
        CalendarLocation calendarLocation2 = new CalendarLocation();
        calendarLocation2.setLocation(calendarLocation.location);
        calendarLocation2.setAddress(calendarLocation.address);
        calendarLocation2.setLatitude(calendarLocation.latitude.floatValue());
        calendarLocation2.setLongitude(calendarLocation.longitude.floatValue());
        return calendarLocation2;
    }

    /* renamed from: a */
    public static EventInviteOperator m124529a(com.bytedance.lark.pb.calendar.v1.EventInviteOperator eventInviteOperator) {
        if (eventInviteOperator == null) {
            return null;
        }
        return new EventInviteOperator(eventInviteOperator.user_invite_operator_id, eventInviteOperator.user_invite_operator_localized_name);
    }

    /* renamed from: a */
    public static CalendarEventDisplayInfo m124515a(com.bytedance.lark.pb.calendar.v1.CalendarEventDisplayInfo calendarEventDisplayInfo) {
        if (calendarEventDisplayInfo == null) {
            return null;
        }
        boolean z = false;
        if (calendarEventDisplayInfo.display_extra_data != null) {
            z = calendarEventDisplayInfo.display_extra_data.has_event_creator_resigned.booleanValue();
        }
        return new CalendarEventDisplayInfo(calendarEventDisplayInfo.is_editable_btn_show.booleanValue(), calendarEventDisplayInfo.is_sharable_btn_show.booleanValue(), calendarEventDisplayInfo.is_deletable_btn_show.booleanValue(), calendarEventDisplayInfo.is_transfer_btn_show.booleanValue(), calendarEventDisplayInfo.is_video_meeting_btn_show.booleanValue(), calendarEventDisplayInfo.is_report_btn_show.booleanValue(), calendarEventDisplayInfo.is_event_creator_show.booleanValue(), calendarEventDisplayInfo.is_event_organizer_show.booleanValue(), calendarEventDisplayInfo.meeting_chat_btn_display_type, calendarEventDisplayInfo.meeting_minutes_btn_display_type, new CalendarEventDisplayExtraData(z));
    }

    /* renamed from: a */
    public static CalendarBuilding m124511a(com.bytedance.lark.pb.calendar.v1.CalendarBuilding calendarBuilding) {
        if (calendarBuilding == null) {
            return null;
        }
        CalendarBuilding calendarBuilding2 = new CalendarBuilding();
        calendarBuilding2.setId(calendarBuilding.id);
        calendarBuilding2.setName(calendarBuilding.name);
        calendarBuilding2.setDescription(calendarBuilding.description);
        calendarBuilding2.setWeight(calendarBuilding.weight.intValue());
        if (calendarBuilding.meeting_rooms != null && calendarBuilding.meeting_rooms.size() > 0) {
            ArrayList arrayList = new ArrayList();
            for (CalendarResource calendarResource : calendarBuilding.meeting_rooms) {
                arrayList.add(m124521a(calendarResource));
            }
            calendarBuilding2.setCalendarResources(arrayList);
        }
        return calendarBuilding2;
    }

    /* renamed from: a */
    public static com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarResource m124521a(CalendarResource calendarResource) {
        if (calendarResource == null) {
            return null;
        }
        com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarResource calendarResource2 = new com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarResource();
        calendarResource2.setId(calendarResource.id);
        calendarResource2.setCalendarId(calendarResource.calendar_id);
        calendarResource2.setName(calendarResource.name);
        calendarResource2.setType(CalendarResource.Type.forNumber(calendarResource.type.getValue()));
        calendarResource2.setStatus(CalendarResource.Status.forNumber(calendarResource.status.getValue()));
        calendarResource2.setBuildingId(calendarResource.building_id);
        calendarResource2.setDescription(calendarResource.description);
        calendarResource2.setCapacity(calendarResource.capacity.intValue());
        calendarResource2.setFloorName(calendarResource.floor_name);
        calendarResource2.setWeight(calendarResource.weight.intValue());
        calendarResource2.setTenantId(calendarResource.tenant_id);
        calendarResource2.setDisabled(calendarResource.is_disabled.booleanValue());
        if (calendarResource.resource_schema != null) {
            calendarResource2.setResourceSchema(m124522a(calendarResource.resource_schema));
        }
        if (calendarResource.schema_extra_data != null) {
            calendarResource2.setSchemaExtraData(m124535a(calendarResource.schema_extra_data));
        }
        calendarResource2.setEquipments(calendarResource.equipments);
        return calendarResource2;
    }

    /* renamed from: a */
    public static Calendar m124510a(com.bytedance.lark.pb.calendar.v1.Calendar calendar) {
        if (calendar == null) {
            return null;
        }
        Calendar calendar2 = new Calendar();
        ArrayList arrayList = new ArrayList();
        for (CalendarEventReminder calendarEventReminder : calendar.default_reminders) {
            com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventReminder calendarEventReminder2 = new com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventReminder();
            calendarEventReminder2.setCalendarEventId(calendarEventReminder.calendar_event_id);
            calendarEventReminder2.setMinutes(calendarEventReminder.minutes.intValue());
            calendarEventReminder2.setMethod(CalendarEventReminder.Method.forNumber(calendarEventReminder.method.getValue()));
            arrayList.add(calendarEventReminder2);
        }
        calendar2.setId(calendar.id);
        calendar2.setServerId(calendar.server_id);
        calendar2.setEmail(calendar.email);
        calendar2.setUserId(calendar.user_id);
        calendar2.setSummary(calendar.summary);
        calendar2.setLocalizedSummary(calendar.localized_summary);
        calendar2.setNote(calendar.note);
        calendar2.setDescription(calendar.description);
        calendar2.setType(Calendar.Type.forNumber(calendar.type.getValue()));
        calendar2.setDefaultTimeZone(calendar.default_timezone);
        calendar2.setDefaultAccessRole(Calendar.AccessRole.forNumber(calendar.default_access_role.getValue()));
        calendar2.setDirtyType(DirtyType.forNumber(calendar.dirty_type.getValue()));
        calendar2.setForegroundColor(calendar.foreground_color.intValue());
        calendar2.setBackgroundColor(calendar.background_color.intValue());
        calendar2.setWeight(calendar.weight.intValue());
        calendar2.setIsDefault(calendar.is_default.booleanValue());
        calendar2.setIsSynced(calendar.is_synced.booleanValue());
        calendar2.setIsVisible(calendar.is_visible.booleanValue());
        calendar2.setIsLoading(calendar.is_loading.booleanValue());
        calendar2.setIsPrimary(calendar.is_primary.booleanValue());
        calendar2.setIsPublic(calendar.is_public.booleanValue());
        calendar2.isSubscriber(calendar.is_subscriber.booleanValue());
        calendar2.setDefaultReminders(arrayList);
        calendar2.setCreateTime(calendar.create_time.longValue());
        calendar2.setUpdateTime(calendar.update_time.longValue());
        calendar2.setSelfAccessRole(Calendar.AccessRole.forNumber(calendar.self_access_role.getValue()));
        calendar2.setSelfStatus(Calendar.Status.forNumber(calendar.self_status.getValue()));
        calendar2.setActive(calendar.is_active.booleanValue());
        calendar2.setIsDisabled(calendar.is_disabled.booleanValue());
        calendar2.setIsAllStaff(calendar.is_all_staff.booleanValue());
        calendar2.setOwner(m124520a(calendar.owner));
        calendar2.setResourceCapacity(calendar.resource_capacity.intValue());
        calendar2.setExternalPasswordInvalid(calendar.external_password_invalid.booleanValue());
        if (calendar.external_account_email != null) {
            calendar2.setExternalAccount(calendar.external_account_email);
        }
        calendar2.setWorkHourSetting(calendar.work_hour_setting);
        if (calendar.calendar_schema != null) {
            calendar2.setCalendarSchema(m124522a(calendar.calendar_schema));
        }
        if (calendar.calendar_event_schema != null) {
            calendar2.setCalendarEventSchema(m124522a(calendar.calendar_event_schema));
        }
        if (calendar.schema_extra_data != null) {
            calendar2.setmSchemaExtraData(m124535a(calendar.schema_extra_data));
        }
        if (calendar.auth_info != null) {
            calendar2.setCalendarAuthInfo(calendar.auth_info);
        }
        calendar2.setSuccessorChatterId(calendar.successor_chatter_id);
        calendar2.setCalendarShareInfo(calendar.share_info);
        calendar2.setCalendarShareOptions(calendar.share_options);
        calendar2.setIsCrossTenant(calendar.is_cross_tenant.booleanValue());
        calendar2.setTenantId(calendar.calendar_tenant_id);
        calendar2.setOwnerId(calendar.calendar_owner_id);
        return calendar2;
    }

    /* renamed from: a */
    public static CalendarMember m124520a(com.bytedance.lark.pb.calendar.v1.CalendarMember calendarMember) {
        if (calendarMember == null) {
            return null;
        }
        CalendarMember calendarMember2 = new CalendarMember();
        calendarMember2.setId(calendarMember.id);
        calendarMember2.setCalendarId(calendarMember.calendar_id);
        calendarMember2.setUserId(calendarMember.user_id);
        calendarMember2.setAccessRole(Calendar.AccessRole.valueOf(calendarMember.access_role.getValue()));
        calendarMember2.setStatus(Calendar.Status.valueOf(calendarMember.status.getValue()));
        calendarMember2.setName(calendarMember.name);
        calendarMember2.setAvatarKey(calendarMember.avatar_key);
        calendarMember2.setLocalizedName(calendarMember.localized_name);
        calendarMember2.setMemberType(CalendarMember.CalendarMemberType.valueOf(calendarMember.member_type.getValue()));
        calendarMember2.setChatId(calendarMember.chat_id);
        calendarMember2.setChatMemberCount(calendarMember.chat_member_count.intValue());
        calendarMember2.setTenantId(calendarMember.tenant_id);
        calendarMember2.setIsCrossTenant(calendarMember.is_cross_tenant.booleanValue());
        return calendarMember2;
    }

    /* renamed from: a */
    public static ShareFailedChat m124539a(ShareCalendarEventMessageResponse.ShareFailedChat shareFailedChat) {
        if (shareFailedChat == null) {
            return null;
        }
        return new ShareFailedChat(shareFailedChat.error_code.intValue(), shareFailedChat.chat_id, shareFailedChat.chat_name);
    }

    /* renamed from: a */
    public static CalendarSchemaCollection m124522a(com.bytedance.lark.pb.calendar.v1.CalendarSchemaCollection calendarSchemaCollection) {
        if (calendarSchemaCollection == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (CollectionUtils.isNotEmpty(calendarSchemaCollection.entity_schemas)) {
            for (EntitySchema entitySchema : calendarSchemaCollection.entity_schemas) {
                if (entitySchema != null) {
                    arrayList.add(m124528a(entitySchema));
                }
            }
        }
        return new CalendarSchemaCollection(arrayList, m124523a(calendarSchemaCollection.compatibility));
    }

    /* renamed from: a */
    public static com.ss.android.lark.calendar.impl.rustadapter.doentity.EntitySchema m124528a(EntitySchema entitySchema) {
        if (entitySchema == null) {
            return null;
        }
        com.ss.android.lark.calendar.impl.rustadapter.doentity.EntitySchema entitySchema2 = new com.ss.android.lark.calendar.impl.rustadapter.doentity.EntitySchema();
        entitySchema2.setUniqueName(entitySchema.unique_name);
        entitySchema2.setUiLevel(EntitySchema.ItemUILevel.valueOf(entitySchema.ui_level.getValue()));
        entitySchema2.setAppLink(entitySchema.app_link);
        return entitySchema2;
    }

    /* renamed from: a */
    public static CalendarSchemaCompatibility m124523a(com.bytedance.lark.pb.calendar.v1.CalendarSchemaCompatibility calendarSchemaCompatibility) {
        if (calendarSchemaCompatibility == null) {
            return null;
        }
        return new CalendarSchemaCompatibility(calendarSchemaCompatibility.minimum_compatibility_ver.intValue(), calendarSchemaCompatibility.incompatible_level.getValue());
    }

    /* renamed from: a */
    public static SchemaExtraData m124535a(com.bytedance.lark.pb.calendar.v1.SchemaExtraData schemaExtraData) {
        if (schemaExtraData == null) {
            return null;
        }
        SchemaExtraData schemaExtraData2 = new SchemaExtraData();
        if (CollectionUtils.isNotEmpty(schemaExtraData.biz_data)) {
            for (SchemaExtraData.BizData bizData : schemaExtraData.biz_data) {
                if (bizData != null) {
                    schemaExtraData2.getBizDataList().add(m124534a(bizData));
                }
            }
        }
        return schemaExtraData2;
    }

    /* renamed from: a */
    public static SchemaExtraData.BizData m124534a(SchemaExtraData.BizData bizData) {
        if (bizData == null) {
            return null;
        }
        SchemaExtraData.BizData bizData2 = new SchemaExtraData.BizData();
        if (bizData.type != null) {
            bizData2.setType(SchemaExtraData.Type.valueOf(bizData.type.getValue()));
        }
        if (SchemaExtraData.Type.APPROVAL_REQUEST.equals(bizData.type)) {
            if (bizData.approval_request == null) {
                return bizData2;
            }
            if (bizData.approval_request.approver_user_ids != null) {
                for (String str : bizData.approval_request.approver_user_ids) {
                    if (!TextUtils.isEmpty(str)) {
                        bizData2.getApproverUserIdList().add(str);
                    }
                }
            }
            if (!TextUtils.isEmpty(bizData.approval_request.create_chatter_id)) {
                bizData2.setCreateUserId(bizData.approval_request.create_chatter_id);
            }
        } else if (SchemaExtraData.Type.RESOURCE_APPROVAL_INFO.equals(bizData.type)) {
            if (bizData.resource_approval_info == null) {
                return bizData2;
            }
            if (bizData.resource_approval_info.approver_user_ids != null) {
                for (String str2 : bizData.resource_approval_info.approver_user_ids) {
                    if (!TextUtils.isEmpty(str2)) {
                        bizData2.getApproverUserIdList().add(str2);
                    }
                }
            }
            bizData2.setApprovalInfo(bizData.resource_approval_info);
        } else if (SchemaExtraData.Type.RESOURCE_STRATEGY.equals(bizData.type)) {
            bizData2.setResourceStrategy(bizData.resource_strategy);
        } else if (SchemaExtraData.Type.RESOURCE_REQUISITION.equals(bizData.type)) {
            bizData2.setResourceRequisition(bizData.resource_requisition);
        } else if (SchemaExtraData.Type.RESOURCE_CUSTOMIZATION.equals(bizData.type)) {
            bizData2.setResourceCustomization(bizData.resource_customization);
        }
        return bizData2;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ List m124544a(SimpleMembers simpleMembers) {
        if (simpleMembers == null || CollectionUtils.isEmpty(simpleMembers.members)) {
            return null;
        }
        return m124561i(simpleMembers.members);
    }

    /* renamed from: a */
    public static SimpleMember m124540a(com.bytedance.lark.pb.calendar.v1.SimpleMember simpleMember) {
        CalendarEventAttendee.Status status = null;
        if (simpleMember == null) {
            return null;
        }
        SimpleMember yVar = new SimpleMember();
        if (simpleMember.status != null) {
            status = CalendarEventAttendee.Status.forNumber(simpleMember.status.getValue());
        }
        if (status == null) {
            status = CalendarEventAttendee.Status.NEEDS_ACTION;
        }
        yVar.mo120250a(status);
        if (simpleMember.calendar_id != null) {
            yVar.mo120251a(simpleMember.calendar_id);
        }
        return yVar;
    }

    /* renamed from: a */
    public static UserAttendeeBaseInfo m124536a(com.bytedance.lark.pb.calendar.v1.UserAttendeeBaseInfo userAttendeeBaseInfo) {
        if (userAttendeeBaseInfo == null) {
            return null;
        }
        return new UserAttendeeBaseInfo(userAttendeeBaseInfo.attendee_calendar_id, userAttendeeBaseInfo.display_name, userAttendeeBaseInfo.avatar_key, userAttendeeBaseInfo.avatar_path, userAttendeeBaseInfo.timezone_id, userAttendeeBaseInfo.user_id, "");
    }

    /* renamed from: a */
    public static PullEventGroupAttendeeMembersResponse m124538a(com.bytedance.lark.pb.calendar.v1.PullEventGroupAttendeeMembersResponse pullEventGroupAttendeeMembersResponse) {
        if (pullEventGroupAttendeeMembersResponse == null) {
            return null;
        }
        return new PullEventGroupAttendeeMembersResponse(pullEventGroupAttendeeMembersResponse.has_more_page.booleanValue(), pullEventGroupAttendeeMembersResponse.page_offset, C26249aa.m94984a(pullEventGroupAttendeeMembersResponse.members, $$Lambda$B14MC_6P2nEh_b5qUeT0wLJr2yg.INSTANCE));
    }

    /* renamed from: a */
    public static com.bytedance.lark.pb.calendar.v1.CalendarMember m124497a(CalendarMember calendarMember) {
        if (calendarMember == null) {
            return null;
        }
        CalendarMember.C15546a aVar = new CalendarMember.C15546a();
        aVar.mo56392a(calendarMember.getId());
        aVar.mo56394b(calendarMember.getCalendarId());
        aVar.mo56395c(calendarMember.getUserId());
        aVar.mo56396d(calendarMember.getName());
        aVar.mo56397e(calendarMember.getAvatarKey());
        aVar.mo56398f(calendarMember.getLocalizedName());
        aVar.mo56399g(calendarMember.getChatId());
        aVar.mo56391a(Integer.valueOf(calendarMember.getChatMemberCount()));
        aVar.mo56400h(calendarMember.getTenantId());
        if (calendarMember.getAccessRole() != null) {
            aVar.mo56388a(Calendar.AccessRole.fromValue(calendarMember.getAccessRole().getNumber()));
        }
        if (calendarMember.getStatus() != null) {
            aVar.mo56389a(Calendar.Status.fromValue(calendarMember.getStatus().getNumber()));
        }
        if (calendarMember.getMemberType() != null) {
            aVar.mo56390a(CalendarMember.CalendarMemberType.fromValue(calendarMember.getMemberType().getNumber()));
        }
        return aVar.build();
    }

    /* renamed from: a */
    public static EventAttendeeInfo m124502a(EventAttendeeInfo eventAttendeeInfo, int i) {
        EventAttendeeInfo.C15606a a = new EventAttendeeInfo.C15606a().mo56586a(Integer.valueOf(i));
        if (eventAttendeeInfo == null) {
            return a.build();
        }
        a.mo56585a(eventAttendeeInfo.all_individual_attendee).mo56587a(eventAttendeeInfo.snapshot_page_token).mo56589b(eventAttendeeInfo.accept_no).mo56590c(eventAttendeeInfo.decline_no).mo56591d(eventAttendeeInfo.tentative_no).mo56592e(eventAttendeeInfo.need_action_no);
        return a.build();
    }

    /* renamed from: a */
    public static List<CalendarBuilding> m124543a(SearchMeetingRoomsResponse searchMeetingRoomsResponse) {
        return C26249aa.m94984a(searchMeetingRoomsResponse.buildings, new C26249aa.AbstractC26250a<com.bytedance.lark.pb.calendar.v1.CalendarBuilding, CalendarBuilding>() {
            /* class com.ss.android.lark.calendar.impl.rustadapter.p1573a.C32514b.C325162 */

            /* renamed from: a */
            public CalendarBuilding get(com.bytedance.lark.pb.calendar.v1.CalendarBuilding calendarBuilding) {
                return C32514b.m124511a(calendarBuilding);
            }
        });
    }

    /* renamed from: a */
    public static CalendarSetting m124500a(com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting calendarSetting) {
        CalendarSetting.C15564a aVar = new CalendarSetting.C15564a();
        aVar.mo56468b(Boolean.valueOf(calendarSetting.isBindGoogleCalendar()));
        aVar.mo56465a(calendarSetting.getGoogleAccount());
        aVar.mo56469b(Integer.valueOf(calendarSetting.getDefaultAllDayReminder()));
        aVar.mo56473c(Integer.valueOf(calendarSetting.getDefaultNoneAllDayReminder()));
        aVar.mo56464a(Integer.valueOf(calendarSetting.getDefaultEventDuration()));
        aVar.mo56463a(Boolean.valueOf(calendarSetting.isShowRejectSchedule()));
        aVar.mo56472c(Boolean.valueOf(calendarSetting.isOnlyAcceptReminder()));
        aVar.mo56474d(Boolean.valueOf(calendarSetting.isDeclineInvitationReminder()));
        aVar.mo56475e(Boolean.valueOf(calendarSetting.isShowPastEventsMaskPC()));
        aVar.mo56477g(Boolean.valueOf(calendarSetting.isShowPastEventsMaskIOS()));
        aVar.mo56476f(Boolean.valueOf(calendarSetting.isShowPastEventsMask()));
        aVar.mo56461a(SkinSetting.SkinType.fromValue(calendarSetting.getSkinTypePC().getNumber()));
        aVar.mo56471c(SkinSetting.SkinType.fromValue(calendarSetting.getSkinTypeIOS().getNumber()));
        aVar.mo56467b(SkinSetting.SkinType.fromValue(calendarSetting.getSkinType().getNumber()));
        aVar.mo56460a(DayOfWeek.fromValue(calendarSetting.getWeekStartDay().getNumber()));
        aVar.mo56462a(m124508a(calendarSetting.getWorkHourSetting()));
        aVar.mo56470b(calendarSetting.getMobileNormalViewTimezone());
        aVar.mo56479i(Boolean.valueOf(calendarSetting.getUseSystemMobileNormalViewTimezone()));
        aVar.mo56478h(Boolean.valueOf(calendarSetting.isShowOtherTimeZone()));
        aVar.mo56459a(m124489a(calendarSetting.getAlternateCalendar()));
        return aVar.build();
    }

    /* renamed from: a */
    public static WorkHourSetting m124508a(CalendarWorkHourSetting calendarWorkHourSetting) {
        if (calendarWorkHourSetting == null) {
            return null;
        }
        WorkHourSetting.C16124a aVar = new WorkHourSetting.C16124a();
        aVar.f42231a = Boolean.valueOf(calendarWorkHourSetting.isEnable());
        HashMap hashMap = new HashMap();
        for (Map.Entry<CalendarSetting.DayOfWeek, CalendarWorkHourSpan> entry : calendarWorkHourSetting.getWorkHourItems().entrySet()) {
            WorkHourSpan workHourSpan = new WorkHourSpan(Integer.valueOf(entry.getValue().getStartMinute()), Integer.valueOf(entry.getValue().getEndMinute()));
            ArrayList arrayList = new ArrayList();
            arrayList.add(workHourSpan);
            hashMap.put(String.valueOf(entry.getKey().getNumber()), new WorkHourItem(arrayList));
        }
        aVar.f42232b = hashMap;
        aVar.f42233c = Boolean.valueOf(calendarWorkHourSetting.isFirstSet());
        return aVar.build();
    }

    /* renamed from: a */
    public static CalendarEventInstanceTime m124517a(com.bytedance.lark.pb.calendar.v1.CalendarEventInstanceTime calendarEventInstanceTime) {
        if (calendarEventInstanceTime == null) {
            return null;
        }
        CalendarEventInstanceTime calendarEventInstanceTime2 = new CalendarEventInstanceTime();
        calendarEventInstanceTime2.setStartTime(calendarEventInstanceTime.start_time.longValue());
        calendarEventInstanceTime2.setEndTime(calendarEventInstanceTime.end_time.longValue());
        return calendarEventInstanceTime2;
    }

    /* renamed from: a */
    public static CalendarMeetingEvent m124519a(GetMeetingEventResponse getMeetingEventResponse) {
        if (getMeetingEventResponse == null) {
            return null;
        }
        CalendarMeetingEvent calendarMeetingEvent = new CalendarMeetingEvent();
        calendarMeetingEvent.setCalendarEvent(m124512a(getMeetingEventResponse.event));
        calendarMeetingEvent.setMeeting(m124530a(getMeetingEventResponse.meeting));
        return calendarMeetingEvent;
    }

    /* renamed from: a */
    public static Meeting m124530a(com.bytedance.lark.pb.calendar.v1.Meeting meeting) {
        if (meeting == null) {
            return null;
        }
        Meeting meeting2 = new Meeting();
        meeting2.setId(meeting.id);
        meeting2.setChatId(meeting.chat_id);
        meeting2.setFirstEntrance(meeting.is_first_entrance.booleanValue());
        meeting2.setShouldShowScroll(meeting.should_show_scroll.booleanValue());
        return meeting2;
    }

    /* renamed from: a */
    public static MeetingDependency m124531a(com.bytedance.lark.pb.calendar.v1.MeetingDependency meetingDependency) {
        if (meetingDependency == null) {
            return null;
        }
        MeetingDependency meetingDependency2 = new MeetingDependency();
        meetingDependency2.setMeeting(m124530a(meetingDependency.meeting));
        meetingDependency2.setCalendarEvent(m124512a(meetingDependency.event));
        meetingDependency2.setCalendarEventInstanceTime(m124517a(meetingDependency.instance_time));
        return meetingDependency2;
    }

    /* renamed from: a */
    public static RedDotUiItem m124533a(com.bytedance.lark.pb.calendar.v1.RedDotUiItem redDotUiItem) {
        RedDotUiItem redDotUiItem2 = new RedDotUiItem();
        if (redDotUiItem == null) {
            return redDotUiItem2;
        }
        RedDotUiItem redDotUiItem3 = new RedDotUiItem();
        redDotUiItem3.mo119954a(redDotUiItem.id.intValue());
        redDotUiItem3.mo119955a(RedDotUiItem.ItemName.forValue(redDotUiItem.name));
        return redDotUiItem3;
    }

    /* renamed from: a */
    public static com.bytedance.lark.pb.calendar.v1.RedDotUiItem m124504a(RedDotUiItem redDotUiItem) {
        RedDotUiItem.C15974a aVar = new RedDotUiItem.C15974a();
        if (redDotUiItem == null) {
            return aVar.build();
        }
        aVar.f41974b = Integer.valueOf(redDotUiItem.mo119953a());
        aVar.f41973a = redDotUiItem.mo119956b().getValue();
        return aVar.build();
    }

    /* renamed from: a */
    public static CalendarEventUniqueField m124495a(com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventUniqueField bVar) {
        CalendarEventUniqueField.C15540a aVar = new CalendarEventUniqueField.C15540a();
        String str = "";
        aVar.mo56370a(bVar.mo120059a() == null ? str : bVar.mo120059a());
        if (bVar.mo120060b() != null) {
            str = bVar.mo120060b();
        }
        aVar.mo56372b(str);
        aVar.mo56369a(Long.valueOf(bVar.mo120061c() == null ? 0 : bVar.mo120061c().longValue()));
        return aVar.build();
    }

    /* renamed from: a */
    public static com.bytedance.lark.pb.calendar.v1.CalendarSchemaCollection m124498a(CalendarSchemaCollection calendarSchemaCollection) {
        if (calendarSchemaCollection == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (calendarSchemaCollection.getUiItems() != null) {
            for (com.ss.android.lark.calendar.impl.rustadapter.doentity.EntitySchema entitySchema : calendarSchemaCollection.getUiItems()) {
                if (entitySchema != null) {
                    arrayList.add(m124501a(entitySchema));
                }
            }
        }
        return new CalendarSchemaCollection.C15560a().mo56447a(m124499a(calendarSchemaCollection.getCompatibility())).mo56448a(arrayList).build();
    }

    /* renamed from: a */
    public static com.bytedance.lark.pb.calendar.v1.EntitySchema m124501a(com.ss.android.lark.calendar.impl.rustadapter.doentity.EntitySchema entitySchema) {
        if (entitySchema == null) {
            return null;
        }
        return new EntitySchema.C15602a().mo56575a(entitySchema.getUniqueName()).mo56574a(EntitySchema.ItemUILevel.fromValue(entitySchema.getUiLevel().getValue())).mo56577b(entitySchema.getAppLink()).build();
    }

    /* renamed from: a */
    public static com.bytedance.lark.pb.calendar.v1.CalendarSchemaCompatibility m124499a(CalendarSchemaCompatibility calendarSchemaCompatibility) {
        if (calendarSchemaCompatibility == null) {
            return null;
        }
        return new CalendarSchemaCompatibility.C15562a().mo56454a(Integer.valueOf(calendarSchemaCompatibility.getMinimumCompatibilityVersion())).mo56453a(IncompatibleLevel.fromValue(calendarSchemaCompatibility.getIncompatibleLevel())).build();
    }

    /* renamed from: a */
    public static com.bytedance.lark.pb.calendar.v1.SchemaExtraData m124506a(com.ss.android.lark.calendar.impl.rustadapter.doentity.SchemaExtraData schemaExtraData) {
        if (schemaExtraData == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (SchemaExtraData.BizData bizData : schemaExtraData.getBizDataList()) {
            if (bizData != null) {
                arrayList.add(m124505a(bizData));
            }
        }
        return new SchemaExtraData.C16016a().mo57623a(arrayList).build();
    }

    /* renamed from: a */
    public static SchemaExtraData.BizData m124505a(SchemaExtraData.BizData bizData) {
        if (bizData == null) {
            return null;
        }
        SchemaExtraData.BizData.C16000a aVar = new SchemaExtraData.BizData.C16000a();
        aVar.mo57590a(SchemaExtraData.Type.fromValue(bizData.getType().getValue()));
        int i = C325206.f83424a[bizData.getType().ordinal()];
        if (i == 1) {
            aVar.mo57585a(m124548b(bizData));
        } else if (i == 2) {
            aVar.mo57589a(bizData.getResourceStrategy());
        } else if (i == 3) {
            aVar.mo57588a(bizData.getResourceRequisition());
        } else if (i == 4) {
            aVar.mo57587a(bizData.getResourceCustomization());
        }
        return aVar.build();
    }

    /* renamed from: a */
    public static NotificationBoxType m124532a(JudgeNotificationBoxTypeResponse judgeNotificationBoxTypeResponse) {
        NotificationBoxType notificationBoxType = new NotificationBoxType();
        if (judgeNotificationBoxTypeResponse == null) {
            return notificationBoxType;
        }
        NotificationBoxType.BoxSubjectType forNumber = NotificationBoxType.BoxSubjectType.forNumber(judgeNotificationBoxTypeResponse.box_type.getValue());
        NotificationBoxType.MeetingEventSpecialRule forNumber2 = NotificationBoxType.MeetingEventSpecialRule.forNumber(judgeNotificationBoxTypeResponse.meeting_rule.getValue());
        NotificationBoxType.MailAttendeeSpecialRule forNumber3 = NotificationBoxType.MailAttendeeSpecialRule.forNumber(judgeNotificationBoxTypeResponse.mail_rule.getValue());
        notificationBoxType.mo119919a(forNumber);
        notificationBoxType.mo119921a(forNumber2);
        notificationBoxType.mo119920a(forNumber3);
        return notificationBoxType;
    }

    /* renamed from: a */
    public static com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting m124525a(com.bytedance.lark.pb.calendar.v1.CalendarSetting calendarSetting) {
        if (calendarSetting == null) {
            return null;
        }
        com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting calendarSetting2 = new com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting();
        calendarSetting2.setDefaultEventDuration(calendarSetting.default_event_duration_v2.intValue());
        calendarSetting2.setWeekStartDay(CalendarSetting.DayOfWeek.forNumber(calendarSetting.week_start_day.getValue()));
        calendarSetting2.setShowRejectSchedule(calendarSetting.show_rejected_schedule.booleanValue());
        calendarSetting2.setDefaultAllDayReminder(calendarSetting.default_all_day_reminder.intValue());
        calendarSetting2.setDefaultNoneAllDayReminder(calendarSetting.default_none_all_day_reminder.intValue());
        calendarSetting2.setBindGoogleCalendar(calendarSetting.bind_google_calendar.booleanValue());
        calendarSetting2.setGoogleAccount(calendarSetting.google_calendar_email);
        calendarSetting2.setOnlyAcceptReminder(calendarSetting.remind_accept_only.booleanValue());
        calendarSetting2.setDeclineInvitationReminder(calendarSetting.notify_when_guests_decline.booleanValue());
        calendarSetting2.setShowPastEventsMask(calendarSetting.show_past_events_mask_android.booleanValue());
        calendarSetting2.setShowPastEventsMaskPC(calendarSetting.show_past_events_mask_pc.booleanValue());
        calendarSetting2.setShowPastEventsMaskIOS(calendarSetting.show_past_events_mask_ios.booleanValue());
        calendarSetting2.setSkinType(CalendarSkinColorTool.SkinType.forNumber(calendarSetting.skin_type_android.getValue()));
        calendarSetting2.setSkinTypePC(CalendarSkinColorTool.SkinType.forNumber(calendarSetting.skin_type_pc.getValue()));
        calendarSetting2.setSkinTypeIOS(CalendarSkinColorTool.SkinType.forNumber(calendarSetting.skin_type_ios.getValue()));
        calendarSetting2.setWorkHourSetting(m124527a(calendarSetting.work_hour_setting));
        calendarSetting2.setMobileNormalViewTimezone(calendarSetting.mobile_normal_view_timezone);
        calendarSetting2.setUseSystemMobileNormalViewTimezone(calendarSetting.use_system_timezone_in_mobile_normal_view.booleanValue());
        calendarSetting2.setShowOtherTimeZone(calendarSetting.show_other_timezone.booleanValue());
        calendarSetting2.setAlternateCalendar(m124524a(calendarSetting.alternate_calendar));
        calendarSetting2.setCalendarSettingConfig(m124526a(calendarSetting.calendar_setting_config));
        return calendarSetting2;
    }

    /* renamed from: a */
    public static CalendarSettingConfig m124526a(com.bytedance.lark.pb.calendar.v1.CalendarSettingConfig calendarSettingConfig) {
        if (calendarSettingConfig == null) {
            return null;
        }
        CalendarSettingConfig calendarSettingConfig2 = new CalendarSettingConfig();
        calendarSettingConfig2.setLangAlternateCalendarMap(C26249aa.m94985a(calendarSettingConfig.lang_alternate_calendar_map, new C26249aa.AbstractC26250a<AlternateCalendar, CalendarSetting.AlternateCalendar>() {
            /* class com.ss.android.lark.calendar.impl.rustadapter.p1573a.C32514b.C325195 */

            /* renamed from: a */
            public CalendarSetting.AlternateCalendar get(AlternateCalendar alternateCalendar) {
                return C32514b.m124524a(alternateCalendar);
            }
        }));
        return calendarSettingConfig2;
    }

    /* renamed from: a */
    public static CalendarSetting.AlternateCalendar m124524a(AlternateCalendar alternateCalendar) {
        if (alternateCalendar == null) {
            return null;
        }
        return CalendarSetting.AlternateCalendar.forNumber(alternateCalendar.getValue());
    }

    /* renamed from: a */
    public static CalendarWorkHourSetting m124527a(WorkHourSetting workHourSetting) {
        if (workHourSetting == null) {
            return new CalendarWorkHourSetting(false, new HashMap(), false);
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, WorkHourItem> entry : workHourSetting.work_hour_items.entrySet()) {
            List<WorkHourSpan> list = entry.getValue().spans;
            CalendarWorkHourSpan calendarWorkHourSpan = null;
            if (CollectionUtils.isNotEmpty(list)) {
                calendarWorkHourSpan = new CalendarWorkHourSpan(list.get(0).start_minute.intValue(), list.get(0).end_minute.intValue());
            }
            hashMap.put(CalendarSetting.DayOfWeek.valueOf(Integer.parseInt(entry.getKey())), calendarWorkHourSpan);
        }
        return new CalendarWorkHourSetting(workHourSetting.enable_work_hour.booleanValue(), hashMap, workHourSetting.is_first_set.booleanValue());
    }

    /* renamed from: a */
    public static SearchCalendarEventResult m124509a(com.bytedance.lark.pb.calendar.v1.SearchCalendarEventResult searchCalendarEventResult) {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        if (searchCalendarEventResult == null) {
            return new SearchCalendarEventResult(arrayList, hashMap, 0);
        }
        SearchCalendarEventResult fVar = new SearchCalendarEventResult(arrayList, hashMap, searchCalendarEventResult.search_result_count.longValue());
        for (SearchCalendarEventInstance searchCalendarEventInstance : searchCalendarEventResult.instances) {
            arrayList.add(new com.ss.android.lark.calendar.impl.features.search.SearchCalendarEventInstance(searchCalendarEventInstance.event_server_id, searchCalendarEventInstance.start_time.longValue(), searchCalendarEventInstance.end_time.longValue(), searchCalendarEventInstance.cross_day_no.intValue(), searchCalendarEventInstance.cross_day_sum.intValue(), searchCalendarEventInstance.cross_day_start_time.longValue(), searchCalendarEventInstance.cross_day_end_time.longValue()));
        }
        Iterator<Map.Entry<String, SearchCalendarEventContent>> it = searchCalendarEventResult.contents.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, SearchCalendarEventContent> next = it.next();
            ArrayList arrayList2 = new ArrayList();
            for (EventHighLight eventHighLight : next.getValue().event_highlights) {
                arrayList2.add(new com.ss.android.lark.calendar.impl.features.search.EventHighLight(HighLightTag.valueOf(eventHighLight.tag.name()), new ArrayList(eventHighLight.highlights)));
            }
            fVar.mo118187b().put(next.getKey(), new com.ss.android.lark.calendar.impl.features.search.SearchCalendarEventContent(next.getValue().calendar_id, next.getValue().key, next.getValue().original_time.longValue(), next.getValue().summary, next.getValue().attendee, next.getValue().organizer, next.getValue().creator, next.getValue().resource, next.getValue().location, next.getValue().description, arrayList2, next.getValue().owner, CalendarEventAttendee.Status.valueOf(next.getValue().self_attendee_status.name()), next.getValue().event_color_index.intValue(), next.getValue().calendar_color_index.intValue(), next.getValue().is_all_day.booleanValue(), Calendar.Type.valueOf(next.getValue().calendar_type.name()), next.getValue().start_timezone, next.getValue().is_cross_tenant.booleanValue()));
            it = it;
            fVar = fVar;
        }
        return fVar;
    }

    /* renamed from: a */
    public static ChatFreeBusyFavor m124537a(GetChatFreeBusyFavorResponse getChatFreeBusyFavorResponse) {
        if (getChatFreeBusyFavorResponse != null) {
            return new ChatFreeBusyFavor(getChatFreeBusyFavorResponse.chat_id, new ArrayList(getChatFreeBusyFavorResponse.ordered_favor_chatter_ids), new ArrayList(getChatFreeBusyFavorResponse.selected_favor_chatter_ids));
        }
        return new ChatFreeBusyFavor("", new ArrayList(), new ArrayList());
    }

    /* renamed from: a */
    public static ArrayList<String> m124541a(GetRecentTimezonesResponse getRecentTimezonesResponse) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (getRecentTimezonesResponse.timezone_ids == null) {
            return arrayList;
        }
        arrayList.addAll(getRecentTimezonesResponse.timezone_ids);
        return arrayList;
    }

    /* renamed from: a */
    public static ArrayList<TimeZoneItemData> m124542a(GetTimezoneByCityResponse getTimezoneByCityResponse) {
        ArrayList<TimeZoneItemData> arrayList = new ArrayList<>();
        if (getTimezoneByCityResponse.city_timezones == null) {
            return arrayList;
        }
        for (GetTimezoneByCityResponse.CityTimezone cityTimezone : getTimezoneByCityResponse.city_timezones) {
            TimeZoneItemData aVar = new TimeZoneItemData(cityTimezone.timezone.timezone_id, cityTimezone.timezone.timezone_name, TimeZoneUtils.m125205a(cityTimezone.timezone.timezone_offset.intValue()));
            aVar.mo112472a(new ArrayList<>(cityTimezone.city_names));
            arrayList.add(aVar);
        }
        return arrayList;
    }

    /* renamed from: a */
    public static com.bytedance.lark.pb.calendar.v1.SimpleMember m124507a(SimpleMember yVar) {
        SimpleMember.C16056a aVar = new SimpleMember.C16056a();
        aVar.mo57737a(yVar.mo120249a());
        aVar.mo57736a(CalendarEventAttendee.Status.fromValue(yVar.mo120252b().getNumber()));
        return aVar.build();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.a.b$6 */
    public static /* synthetic */ class C325206 {

        /* renamed from: a */
        static final /* synthetic */ int[] f83424a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.ss.android.lark.calendar.impl.rustadapter.doentity.SchemaExtraData$Type[] r0 = com.ss.android.lark.calendar.impl.rustadapter.doentity.SchemaExtraData.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.calendar.impl.rustadapter.p1573a.C32514b.C325206.f83424a = r0
                com.ss.android.lark.calendar.impl.rustadapter.doentity.SchemaExtraData$Type r1 = com.ss.android.lark.calendar.impl.rustadapter.doentity.SchemaExtraData.Type.APPROVAL_REQUEST     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.calendar.impl.rustadapter.p1573a.C32514b.C325206.f83424a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.calendar.impl.rustadapter.doentity.SchemaExtraData$Type r1 = com.ss.android.lark.calendar.impl.rustadapter.doentity.SchemaExtraData.Type.RESOURCE_STRATEGY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.calendar.impl.rustadapter.p1573a.C32514b.C325206.f83424a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.calendar.impl.rustadapter.doentity.SchemaExtraData$Type r1 = com.ss.android.lark.calendar.impl.rustadapter.doentity.SchemaExtraData.Type.RESOURCE_REQUISITION     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.calendar.impl.rustadapter.p1573a.C32514b.C325206.f83424a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.lark.calendar.impl.rustadapter.doentity.SchemaExtraData$Type r1 = com.ss.android.lark.calendar.impl.rustadapter.doentity.SchemaExtraData.Type.RESOURCE_CUSTOMIZATION     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.rustadapter.p1573a.C32514b.C325206.<clinit>():void");
        }
    }

    /* renamed from: e */
    public static Map<String, List<com.ss.android.lark.calendar.impl.rustadapter.doentity.SimpleMember>> m124556e(Map<String, SimpleMembers> map) {
        return C26249aa.m94985a(map, $$Lambda$b$iQIsKIIGQ1MMvImLY87GFyTNw9I.INSTANCE);
    }

    /* renamed from: i */
    public static List<com.ss.android.lark.calendar.impl.rustadapter.doentity.SimpleMember> m124561i(List<com.bytedance.lark.pb.calendar.v1.SimpleMember> list) {
        return C26249aa.m94984a(list, $$Lambda$D6baMk8IbwEpsOdRnT1P7mGqE.INSTANCE);
    }

    /* renamed from: a */
    public static AlternateCalendar m124489a(CalendarSetting.AlternateCalendar alternateCalendar) {
        if (alternateCalendar == null) {
            return null;
        }
        return AlternateCalendar.fromValue(alternateCalendar.getNumber());
    }

    /* renamed from: b */
    public static List<CalendarEventInstance> m124549b(List<com.bytedance.lark.pb.calendar.v1.CalendarEventInstance> list) {
        return C26249aa.m94984a(list, new C26249aa.AbstractC26250a<com.bytedance.lark.pb.calendar.v1.CalendarEventInstance, CalendarEventInstance>() {
            /* class com.ss.android.lark.calendar.impl.rustadapter.p1573a.C32514b.C325228 */

            /* renamed from: a */
            public CalendarEventInstance get(com.bytedance.lark.pb.calendar.v1.CalendarEventInstance calendarEventInstance) {
                return C32514b.m124516a(calendarEventInstance);
            }
        });
    }

    /* renamed from: c */
    public static List<CalendarEvent> m124551c(List<com.bytedance.lark.pb.calendar.v1.CalendarEvent> list) {
        return C26249aa.m94984a(list, new C26249aa.AbstractC26250a<com.bytedance.lark.pb.calendar.v1.CalendarEvent, CalendarEvent>() {
            /* class com.ss.android.lark.calendar.impl.rustadapter.p1573a.C32514b.C325239 */

            /* renamed from: a */
            public CalendarEvent get(com.bytedance.lark.pb.calendar.v1.CalendarEvent calendarEvent) {
                return C32514b.m124512a(calendarEvent);
            }
        });
    }

    /* renamed from: d */
    public static Map<String, com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarResource> m124554d(Map<String, com.bytedance.lark.pb.calendar.v1.CalendarResource> map) {
        return C26249aa.m94985a(map, new C26249aa.AbstractC26250a<com.bytedance.lark.pb.calendar.v1.CalendarResource, com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarResource>() {
            /* class com.ss.android.lark.calendar.impl.rustadapter.p1573a.C32514b.AnonymousClass12 */

            /* renamed from: a */
            public com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarResource get(com.bytedance.lark.pb.calendar.v1.CalendarResource calendarResource) {
                return C32514b.m124521a(calendarResource);
            }
        });
    }

    /* renamed from: f */
    public static Map<String, SimpleMembers> m124558f(Map<String, List<com.ss.android.lark.calendar.impl.rustadapter.doentity.SimpleMember>> map) {
        Map<String, SimpleMembers> a = C26249aa.m94985a(map, $$Lambda$b$baMtcB9ultD_Bbv3JJS9VzbVg0U.INSTANCE);
        if (CollectionUtils.isEmpty(a)) {
            return null;
        }
        return a;
    }

    /* renamed from: p */
    public static List<com.ss.android.lark.calendar.impl.rustadapter.doentity.RedDotUiItem> m124568p(List<com.bytedance.lark.pb.calendar.v1.RedDotUiItem> list) {
        return C26249aa.m94984a(list, new C26249aa.AbstractC26250a<com.bytedance.lark.pb.calendar.v1.RedDotUiItem, com.ss.android.lark.calendar.impl.rustadapter.doentity.RedDotUiItem>() {
            /* class com.ss.android.lark.calendar.impl.rustadapter.p1573a.C32514b.C325173 */

            /* renamed from: a */
            public com.ss.android.lark.calendar.impl.rustadapter.doentity.RedDotUiItem get(com.bytedance.lark.pb.calendar.v1.RedDotUiItem redDotUiItem) {
                return C32514b.m124533a(redDotUiItem);
            }
        });
    }

    /* renamed from: q */
    public static List<com.bytedance.lark.pb.calendar.v1.RedDotUiItem> m124569q(List<com.ss.android.lark.calendar.impl.rustadapter.doentity.RedDotUiItem> list) {
        return C26249aa.m94984a(list, new C26249aa.AbstractC26250a<com.ss.android.lark.calendar.impl.rustadapter.doentity.RedDotUiItem, com.bytedance.lark.pb.calendar.v1.RedDotUiItem>() {
            /* class com.ss.android.lark.calendar.impl.rustadapter.p1573a.C32514b.C325184 */

            /* renamed from: a */
            public com.bytedance.lark.pb.calendar.v1.RedDotUiItem get(com.ss.android.lark.calendar.impl.rustadapter.doentity.RedDotUiItem redDotUiItem) {
                return C32514b.m124504a(redDotUiItem);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public static /* synthetic */ SimpleMembers m124571s(List list) {
        if (CollectionUtils.isEmpty(list)) {
            return null;
        }
        return m124570r(list);
    }

    /* renamed from: a */
    private static com.bytedance.lark.pb.calendar.v1.EventInviteOperator m124503a(EventInviteOperator eventInviteOperator) {
        if (eventInviteOperator == null) {
            return null;
        }
        EventInviteOperator.C15616a aVar = new EventInviteOperator.C15616a();
        aVar.mo56612a(eventInviteOperator.getUserInviteOperatorId());
        aVar.mo56614b(eventInviteOperator.getUserInviteOperatorLocalizedName());
        return aVar.build();
    }

    /* renamed from: b */
    public static Map<String, com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee> m124550b(Map<String, com.bytedance.lark.pb.calendar.v1.CalendarEventAttendee> map) {
        return C26249aa.m94985a(map, new C26249aa.AbstractC26250a<com.bytedance.lark.pb.calendar.v1.CalendarEventAttendee, com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee>() {
            /* class com.ss.android.lark.calendar.impl.rustadapter.p1573a.C32514b.AnonymousClass10 */

            /* renamed from: a */
            public com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee get(com.bytedance.lark.pb.calendar.v1.CalendarEventAttendee calendarEventAttendee) {
                return C32514b.m124513a(calendarEventAttendee);
            }
        });
    }

    /* renamed from: c */
    public static Map<String, CalendarBuilding> m124552c(Map<String, com.bytedance.lark.pb.calendar.v1.CalendarBuilding> map) {
        return C26249aa.m94985a(map, new C26249aa.AbstractC26250a<com.bytedance.lark.pb.calendar.v1.CalendarBuilding, CalendarBuilding>() {
            /* class com.ss.android.lark.calendar.impl.rustadapter.p1573a.C32514b.AnonymousClass11 */

            /* renamed from: a */
            public CalendarBuilding get(com.bytedance.lark.pb.calendar.v1.CalendarBuilding calendarBuilding) {
                return C32514b.m124511a(calendarBuilding);
            }
        });
    }

    /* renamed from: r */
    public static SimpleMembers m124570r(List<com.ss.android.lark.calendar.impl.rustadapter.doentity.SimpleMember> list) {
        List<com.bytedance.lark.pb.calendar.v1.SimpleMember> a = C26249aa.m94984a(list, $$Lambda$xxXztVBFipThRshkUP9pqlqZno0.INSTANCE);
        if (CollectionUtils.isEmpty(a)) {
            return null;
        }
        SimpleMembers.C16058a aVar = new SimpleMembers.C16058a();
        aVar.mo57742a(a);
        return aVar.build();
    }

    /* renamed from: a */
    public static com.bytedance.lark.pb.calendar.v1.CalendarLocation m124496a(CalendarLocation calendarLocation) {
        if (calendarLocation == null) {
            return null;
        }
        CalendarLocation.C15544a aVar = new CalendarLocation.C15544a();
        aVar.mo56381a(calendarLocation.getLocation());
        aVar.mo56384b(calendarLocation.getAddress());
        aVar.mo56380a(Float.valueOf((float) calendarLocation.getLatitude()));
        aVar.mo56383b(Float.valueOf((float) calendarLocation.getLongitude()));
        return aVar.build();
    }

    /* renamed from: d */
    public static List<com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventReminder> m124553d(List<com.bytedance.lark.pb.calendar.v1.CalendarEventReminder> list) {
        ArrayList arrayList = new ArrayList();
        for (com.bytedance.lark.pb.calendar.v1.CalendarEventReminder calendarEventReminder : list) {
            com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventReminder calendarEventReminder2 = new com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventReminder();
            calendarEventReminder2.setCalendarEventId(calendarEventReminder.calendar_event_id);
            calendarEventReminder2.setMinutes(calendarEventReminder.minutes.intValue());
            calendarEventReminder2.setMethod(CalendarEventReminder.Method.forNumber(calendarEventReminder.method.getValue()));
            arrayList.add(calendarEventReminder2);
        }
        return arrayList;
    }

    /* renamed from: f */
    public static List<com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee> m124557f(List<com.bytedance.lark.pb.calendar.v1.CalendarEventAttendee> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return null;
        }
        for (com.bytedance.lark.pb.calendar.v1.CalendarEventAttendee calendarEventAttendee : list) {
            arrayList.add(m124513a(calendarEventAttendee));
        }
        return arrayList;
    }

    /* renamed from: g */
    public static List<com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarMember> m124559g(List<com.bytedance.lark.pb.calendar.v1.CalendarMember> list) {
        ArrayList arrayList = new ArrayList();
        if (CollectionUtils.isEmpty(list)) {
            return arrayList;
        }
        for (com.bytedance.lark.pb.calendar.v1.CalendarMember calendarMember : list) {
            if (calendarMember != null) {
                arrayList.add(m124520a(calendarMember));
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    public static List<ShareFailedChat> m124560h(List<ShareCalendarEventMessageResponse.ShareFailedChat> list) {
        if (CollectionUtils.isEmpty(list)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (ShareCalendarEventMessageResponse.ShareFailedChat shareFailedChat : list) {
            arrayList.add(m124539a(shareFailedChat));
        }
        return arrayList;
    }

    /* renamed from: j */
    public static List<com.bytedance.lark.pb.calendar.v1.CalendarMember> m124562j(List<com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarMember> list) {
        ArrayList arrayList = new ArrayList();
        if (CollectionUtils.isEmpty(list)) {
            return arrayList;
        }
        for (com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarMember calendarMember : list) {
            if (calendarMember != null) {
                arrayList.add(m124497a(calendarMember));
            }
        }
        return arrayList;
    }

    /* renamed from: m */
    public static List<com.bytedance.lark.pb.calendar.v1.CalendarEventAttendee> m124565m(List<com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return null;
        }
        for (com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee calendarEventAttendee : list) {
            arrayList.add(m124492a(calendarEventAttendee));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static SparseArray<com.ss.android.lark.calendar.impl.rustadapter.doentity.MappingColor> m124488a(GetCalendarEventMappingColorsResponse getCalendarEventMappingColorsResponse) {
        SparseArray<com.ss.android.lark.calendar.impl.rustadapter.doentity.MappingColor> sparseArray = new SparseArray<>();
        if (!(getCalendarEventMappingColorsResponse == null || getCalendarEventMappingColorsResponse.colors == null)) {
            for (Map.Entry<String, MappingColor> entry : getCalendarEventMappingColorsResponse.colors.entrySet()) {
                MappingColor value = entry.getValue();
                sparseArray.put(Integer.parseInt(entry.getKey()), new com.ss.android.lark.calendar.impl.rustadapter.doentity.MappingColor(value.background_color.intValue(), value.foreground_color.intValue(), value.event_card_color.intValue(), value.event_color_index));
            }
        }
        return sparseArray;
    }

    /* renamed from: b */
    private static SchemaExtraData.ApprovalRequest m124548b(SchemaExtraData.BizData bizData) {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = bizData.getApproverUserIdList().iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next != null && !next.isEmpty()) {
                arrayList.add(next);
            }
        }
        SchemaExtraData.ApprovalTrigger approvalTrigger = null;
        if (bizData.getApprovalInfo() != null) {
            approvalTrigger = bizData.getApprovalInfo().trigger;
        }
        return new SchemaExtraData.ApprovalRequest.C15996a().mo57574a(bizData.getReason()).mo57575a(arrayList).mo57577b(bizData.getCreateUserId()).mo57573a(approvalTrigger).build();
    }

    /* renamed from: e */
    public static List<CalendarEventAttachment> m124555e(List<com.bytedance.lark.pb.calendar.v1.CalendarEventAttachment> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        for (com.bytedance.lark.pb.calendar.v1.CalendarEventAttachment calendarEventAttachment : list) {
            CalendarEventAttachment calendarEventAttachment2 = new CalendarEventAttachment();
            calendarEventAttachment2.setFileToken(calendarEventAttachment.file_token);
            calendarEventAttachment2.setName(calendarEventAttachment.name);
            calendarEventAttachment2.setFileSize(calendarEventAttachment.file_size);
            calendarEventAttachment2.setLocalPath(calendarEventAttachment.local_path);
            calendarEventAttachment2.setUploaderUserId(calendarEventAttachment.uploader_user_id);
            calendarEventAttachment2.setPosition(calendarEventAttachment.position.intValue());
            calendarEventAttachment2.setType(CalendarEventAttachment.Type.forNumber(calendarEventAttachment.type.getValue()));
            calendarEventAttachment2.setDeleted(calendarEventAttachment.is_deleted.booleanValue());
            arrayList.add(calendarEventAttachment2);
        }
        return arrayList;
    }

    /* renamed from: k */
    public static List<com.bytedance.lark.pb.calendar.v1.CalendarEventReminder> m124563k(List<com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventReminder> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        for (com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventReminder calendarEventReminder : list) {
            arrayList.add(new CalendarEventReminder.C15538a().mo56364a(calendarEventReminder.getCalendarEventId()).mo56363a(Integer.valueOf(calendarEventReminder.getMinutes())).mo56362a(CalendarEventReminder.Method.fromValue(calendarEventReminder.getMethod().getNumber())).build());
        }
        return arrayList;
    }

    /* renamed from: l */
    public static List<com.bytedance.lark.pb.calendar.v1.CalendarEventAttachment> m124564l(List<CalendarEventAttachment> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        for (CalendarEventAttachment calendarEventAttachment : list) {
            arrayList.add(new CalendarEventAttachment.C15518a().mo56262c(calendarEventAttachment.getName()).mo56259a(calendarEventAttachment.getFileToken()).mo56261b(calendarEventAttachment.getFileSize()).mo56263d(calendarEventAttachment.getLocalPath()).mo56264e(calendarEventAttachment.getUploaderUserId()).mo56257a(Boolean.valueOf(calendarEventAttachment.isDeleted())).mo56258a(Integer.valueOf(calendarEventAttachment.getPosition())).mo56256a(CalendarEventAttachment.Type.fromValue(calendarEventAttachment.getType().getNumber())).build());
        }
        return arrayList;
    }

    /* renamed from: a */
    public static com.bytedance.lark.pb.calendar.v1.CalendarEventDisplayInfo m124493a(CalendarEventDisplayInfo calendarEventDisplayInfo) {
        if (calendarEventDisplayInfo == null) {
            return null;
        }
        CalendarEventDisplayInfo.C15532a aVar = new CalendarEventDisplayInfo.C15532a();
        aVar.mo56314a(Boolean.valueOf(calendarEventDisplayInfo.isEditableBtnShow()));
        aVar.mo56317b(Boolean.valueOf(calendarEventDisplayInfo.isSharableBtnShow()));
        aVar.mo56318c(Boolean.valueOf(calendarEventDisplayInfo.isDeletableBtnShow()));
        aVar.mo56321f(Boolean.valueOf(calendarEventDisplayInfo.isReportBtnShow()));
        aVar.mo56319d(Boolean.valueOf(calendarEventDisplayInfo.isTransferBtnShow()));
        aVar.mo56320e(Boolean.valueOf(calendarEventDisplayInfo.isVideoMeetingBtnShow()));
        aVar.mo56322g(Boolean.valueOf(calendarEventDisplayInfo.isEventCreatorShow()));
        aVar.mo56313a(calendarEventDisplayInfo.getMeetingChatBtnDisplayType());
        aVar.mo56316b(calendarEventDisplayInfo.getMeetingMinutesBtnDisplayType());
        return aVar.build();
    }

    /* renamed from: n */
    public static List<DayInstancesSlotMetric> m124566n(List<com.ss.android.lark.calendar.impl.rustadapter.doentity.DayInstancesSlotMetric> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        for (com.ss.android.lark.calendar.impl.rustadapter.doentity.DayInstancesSlotMetric dayInstancesSlotMetric : list) {
            List<InstanceSlotMetric> instanceSlotMetrics = dayInstancesSlotMetric.getInstanceSlotMetrics();
            ArrayList arrayList2 = new ArrayList();
            for (InstanceSlotMetric instanceSlotMetric : instanceSlotMetrics) {
                arrayList2.add(new InstanceSlotMetric.C15816a().mo57105a(instanceSlotMetric.getId()).mo57109c(Integer.valueOf(instanceSlotMetric.getStartDay())).mo57110d(Integer.valueOf(instanceSlotMetric.getEndDay())).mo57103a(Integer.valueOf(instanceSlotMetric.getStartMinute())).mo57107b(Integer.valueOf(instanceSlotMetric.getEndMinute())).mo57108b(Long.valueOf(instanceSlotMetric.getEndTime())).mo57104a(Long.valueOf(instanceSlotMetric.getStartTime())).build());
            }
            arrayList.add(new DayInstancesSlotMetric.C15590a().mo56543a(Integer.valueOf(dayInstancesSlotMetric.getLayoutDay())).mo56544a(arrayList2).build());
        }
        return arrayList;
    }

    /* renamed from: o */
    public static ArrayList<DayInstancesLayout> m124567o(List<com.bytedance.lark.pb.calendar.v1.DayInstancesLayout> list) {
        ArrayList<DayInstancesLayout> arrayList = new ArrayList<>();
        if (list == null) {
            return arrayList;
        }
        for (com.bytedance.lark.pb.calendar.v1.DayInstancesLayout dayInstancesLayout : list) {
            ArrayList arrayList2 = new ArrayList();
            for (InstanceLayout instanceLayout : dayInstancesLayout.instances_layout) {
                arrayList2.add(new com.ss.android.lark.calendar.impl.rustadapter.doentity.InstanceLayout().setWidth(instanceLayout.width.floatValue()).setHeight(instanceLayout.height.floatValue()).setId(instanceLayout.id).setXOffset(instanceLayout.x_offset.floatValue()).setYOffset(instanceLayout.y_offset.floatValue()).setZIndex(instanceLayout.z_index.intValue()));
            }
            arrayList.add(new DayInstancesLayout().setLayoutDay(dayInstancesLayout.layout_day.intValue()).setInstanceLayouts(arrayList2));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static com.bytedance.lark.pb.calendar.v1.Calendar m124490a(com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar calendar) {
        if (calendar == null) {
            return null;
        }
        List<com.bytedance.lark.pb.calendar.v1.CalendarEventReminder> k = m124563k(calendar.getDefaultReminders());
        Calendar.C15508a aVar = new Calendar.C15508a();
        aVar.mo56141a(calendar.getId()).mo56148b(calendar.getServerId());
        if (calendar.getEmail() != null) {
            aVar.mo56151c(calendar.getEmail());
        }
        aVar.mo56154d(calendar.getUserId());
        if (calendar.getSummary() != null) {
            aVar.mo56156e(calendar.getSummary());
        }
        if (calendar.getLocalizedSummary() != null) {
            aVar.mo56162h(calendar.getLocalizedSummary());
        }
        if (calendar.getNote() != null) {
            aVar.mo56164i(calendar.getNote());
        }
        if (calendar.getDescription() != null) {
            aVar.mo56158f(calendar.getDescription());
        }
        if (calendar.getType() != null) {
            aVar.mo56134a(Calendar.Type.fromValue(calendar.getType().getNumber()));
        }
        if (calendar.getDefaultTimeZone() != null) {
            aVar.mo56160g(calendar.getDefaultTimeZone());
        }
        if (calendar.getDefaultAccessRole() != null) {
            aVar.mo56129a(Calendar.AccessRole.fromValue(calendar.getDefaultAccessRole().getNumber()));
        }
        if (calendar.getDirtyType() != null) {
            aVar.mo56135a(CalendarDirtyType.fromValue(calendar.getDirtyType().getNumber()));
        }
        aVar.mo56139a(Integer.valueOf(calendar.getForegroundColor()));
        aVar.mo56146b(Integer.valueOf(calendar.getBackgroundColor()));
        aVar.mo56150c(Integer.valueOf(calendar.getWeight()));
        aVar.mo56138a(Boolean.valueOf(calendar.isDefault()));
        aVar.mo56145b(Boolean.valueOf(calendar.isSynced()));
        aVar.mo56149c(Boolean.valueOf(calendar.isVisible()));
        aVar.mo56161h(Boolean.valueOf(calendar.isLoading()));
        aVar.mo56152d(Boolean.valueOf(calendar.isPrimary()));
        aVar.mo56155e(Boolean.valueOf(calendar.isPublic()));
        aVar.mo56157f(Boolean.valueOf(calendar.isSubscriber()));
        aVar.mo56142a(k);
        aVar.mo56140a(Long.valueOf(calendar.getCreateTime()));
        aVar.mo56147b(Long.valueOf(calendar.getUpdateTime()));
        aVar.mo56159g(Boolean.valueOf(calendar.isAllStaff()));
        aVar.mo56153d(Integer.valueOf(calendar.getResourceCapacity()));
        aVar.mo56165j(calendar.getExternalAccount());
        aVar.mo56137a(calendar.getWorkHourSetting());
        aVar.mo56130a(calendar.getCalendarAuthInfo());
        if (calendar.getSelfAccessRole() != null) {
            aVar.mo56144b(Calendar.AccessRole.fromValue(calendar.getSelfAccessRole().getNumber()));
        }
        if (calendar.getSelfStatus() != null) {
            aVar.mo56133a(Calendar.Status.fromValue(calendar.getSelfStatus().getNumber()));
        }
        if (calendar.getOwner() != null) {
            aVar.mo56136a(m124497a(calendar.getOwner()));
        }
        aVar.mo56166k(calendar.getSuccessorChatterId());
        aVar.mo56163i(Boolean.valueOf(calendar.getIsCrossTenant()));
        aVar.mo56131a(calendar.getCalendarShareInfo());
        aVar.mo56132a(calendar.getCalendarShareOptions());
        aVar.mo56167l(calendar.getOwnerId());
        aVar.mo56168m(calendar.getTenantId());
        return aVar.build();
    }

    /* renamed from: a */
    public static com.bytedance.lark.pb.calendar.v1.CalendarEvent m124491a(CalendarEvent calendarEvent) {
        CalendarEvent.C15516a aVar = new CalendarEvent.C15516a();
        if (calendarEvent == null) {
            return null;
        }
        aVar.mo56206a(calendarEvent.getId());
        aVar.mo56214b(calendarEvent.getCreatorCalendarId());
        aVar.mo56220c(calendarEvent.getCalendarId());
        aVar.mo56225d(calendarEvent.getOrganizerCalendarId());
        if (calendarEvent.getServerId() != null) {
            aVar.mo56228e(calendarEvent.getServerId());
        }
        if (calendarEvent.getSelfAttendeeStatus() != null) {
            aVar.mo56194a(CalendarEventAttendee.Status.fromValue(calendarEvent.getSelfAttendeeStatus().getNumber()));
        }
        aVar.mo56231f(calendarEvent.getKey());
        aVar.mo56205a(Long.valueOf(calendarEvent.getOriginalTime()));
        if (calendarEvent.getOriginalEventKey() != null) {
            aVar.mo56233g(calendarEvent.getOriginalEventKey());
        }
        aVar.mo56203a(Boolean.valueOf(calendarEvent.originalIsAllDay()));
        aVar.mo56211b(Boolean.valueOf(calendarEvent.isFree()));
        aVar.mo56213b(Long.valueOf(calendarEvent.getLastDate()));
        aVar.mo56219c(Long.valueOf(calendarEvent.getCreateTime()));
        aVar.mo56224d(Long.valueOf(calendarEvent.getUpdateTime()));
        com.ss.android.lark.calendar.impl.rustadapter.doentity.MappingColor calColor = calendarEvent.getCalColor();
        if (calColor != null) {
            aVar.mo56210b(new MappingColor.C15856a().mo57219a(Integer.valueOf(calColor.getBackgroundColor())).mo57223c(Integer.valueOf(calColor.getEventCardColor())).mo57222b(Integer.valueOf(calColor.getForegroundColor())).build());
        }
        com.ss.android.lark.calendar.impl.rustadapter.doentity.MappingColor eventColor = calendarEvent.getEventColor();
        if (eventColor != null) {
            aVar.mo56201a(new MappingColor.C15856a().mo57219a(Integer.valueOf(eventColor.getBackgroundColor())).mo57223c(Integer.valueOf(eventColor.getEventCardColor())).mo57222b(Integer.valueOf(eventColor.getForegroundColor())).mo57220a(eventColor.getEventColorIndex()).build());
        }
        aVar.mo56204a(Integer.valueOf(calendarEvent.getColor()));
        if (calendarEvent.getSource() != null) {
            aVar.mo56190a(CalendarEvent.Source.fromValue(calendarEvent.getSource().getNumber()));
        }
        if (calendarEvent.getVisibility() != null) {
            aVar.mo56193a(CalendarEvent.Visibility.fromValue(calendarEvent.getVisibility().getNumber()));
        }
        aVar.mo56212b(Integer.valueOf(calendarEvent.getImportance()));
        if (calendarEvent.getDirtyType() != null) {
            aVar.mo56184a(CalendarDirtyType.fromValue(calendarEvent.getDirtyType().getNumber()));
        }
        aVar.mo56218c(Integer.valueOf(calendarEvent.getVersion()));
        aVar.mo56217c(Boolean.valueOf(calendarEvent.isNeedUpdate()));
        aVar.mo56235h(calendarEvent.getSummary());
        if (calendarEvent.getDescription() != null) {
            aVar.mo56237i(calendarEvent.getDescription());
        }
        if (calendarEvent.getDocsDescription() != null) {
            aVar.mo56250p(calendarEvent.getDocsDescription());
        }
        aVar.mo56222d(Boolean.valueOf(calendarEvent.isAllDay()));
        aVar.mo56227e(Long.valueOf(calendarEvent.getStartTime()));
        aVar.mo56239j(calendarEvent.getStartTimeZone());
        aVar.mo56230f(Long.valueOf(calendarEvent.getEndTime()));
        aVar.mo56241k(calendarEvent.getEndTimeZone());
        if (calendarEvent.getStatus() != null) {
            aVar.mo56191a(CalendarEvent.Status.fromValue(calendarEvent.getStatus().getNumber()));
        }
        if (calendarEvent.getRRule() != null) {
            aVar.mo56243l(calendarEvent.getRRule());
        }
        aVar.mo56226e(Boolean.valueOf(calendarEvent.isGuestsCanInvite()));
        aVar.mo56229f(Boolean.valueOf(calendarEvent.isGuestsCanSeeOtherGuests()));
        aVar.mo56232g(Boolean.valueOf(calendarEvent.isGuestsCanModify()));
        if (calendarEvent.getAudioUrl() != null) {
            aVar.mo56245m(calendarEvent.getAudioUrl());
        }
        if (calendarEvent.getUrl() != null) {
            aVar.mo56247n(calendarEvent.getUrl());
        }
        if (calendarEvent.getLocation() != null) {
            aVar.mo56197a(m124496a(calendarEvent.getLocation()));
        }
        aVar.mo56234h(Boolean.valueOf(calendarEvent.hasAlarm()));
        aVar.mo56236i(Boolean.valueOf(calendarEvent.hasAttendee()));
        aVar.mo56238j(Boolean.valueOf(calendarEvent.isScheduled()));
        com.bytedance.lark.pb.calendar.v1.CalendarEventAttendee a = m124492a(calendarEvent.getSuccessor());
        if (a != null) {
            aVar.mo56216c(a);
        }
        com.bytedance.lark.pb.calendar.v1.CalendarEventAttendee a2 = m124492a(calendarEvent.getCreator());
        if (a2 != null) {
            aVar.mo56195a(a2);
        }
        com.bytedance.lark.pb.calendar.v1.CalendarEventAttendee a3 = m124492a(calendarEvent.getOrganizer());
        if (a3 != null) {
            aVar.mo56209b(a3);
        }
        List<com.bytedance.lark.pb.calendar.v1.CalendarEventAttendee> m = m124565m(calendarEvent.getAttendees());
        if (m != null) {
            aVar.mo56207a(m);
        }
        aVar.mo56215b(m124563k(calendarEvent.getReminders()));
        aVar.mo56221c(m124564l(calendarEvent.getAttachment()));
        if (calendarEvent.getDisplayType() != null) {
            aVar.mo56187a(CalendarEvent.DisplayType.fromValue(calendarEvent.getDisplayType().getNumber()));
        }
        aVar.mo56192a(CalendarEvent.Type.fromValue(calendarEvent.getType().getNumber()));
        if (calendarEvent.getConflictType() != null) {
            aVar.mo56198a(ConflictType.fromValue(calendarEvent.getConflictType().getNumber()));
        }
        if (calendarEvent.getMeetingId() != null) {
            aVar.mo56249o(calendarEvent.getMeetingId());
        }
        if (calendarEvent.getIsDeletable() != null) {
            aVar.mo56186a(CalendarEvent.Deletable.fromValue(calendarEvent.getIsDeletable().getNumber()));
        }
        if (calendarEvent.getNotificationType() != null) {
            aVar.mo56188a(CalendarEvent.NotificationType.fromValue(calendarEvent.getNotificationType().getNumber()));
        }
        if (calendarEvent.getVideoMeeting() != null) {
            aVar.mo56202a(calendarEvent.getVideoMeeting().getVchat());
        }
        if (calendarEvent.getUserInviteOperatorId() != null) {
            aVar.mo56252r(calendarEvent.getUserInviteOperatorId());
        }
        if (calendarEvent.getSharability() != null) {
            aVar.mo56189a(CalendarEvent.Sharability.fromValue(calendarEvent.getSharability().getNumber()));
        }
        aVar.mo56246n(Boolean.valueOf(calendarEvent.organizerIsAttend()));
        aVar.mo56244m(Boolean.valueOf(calendarEvent.creatorIsAttend()));
        aVar.mo56248o(Boolean.valueOf(calendarEvent.successorIsAttend()));
        aVar.mo56240k(calendarEvent.getIsEditable());
        aVar.mo56242l(Boolean.valueOf(calendarEvent.isCrossTenant()));
        aVar.mo56251q(calendarEvent.getMeetingMinuteUrl());
        aVar.mo56200a(m124503a(calendarEvent.getUserInviteOperator()));
        if (calendarEvent.getCalendarEventDisplayInfo() != null) {
            aVar.mo56196a(m124493a(calendarEvent.getCalendarEventDisplayInfo()));
        }
        aVar.mo56223d(Integer.valueOf(calendarEvent.getAttendeeSource()));
        aVar.mo56185a(CalendarEvent.Category.fromValue(calendarEvent.getCategory().getValue()));
        aVar.mo56199a(m124502a(calendarEvent.getEventAttendeeInfo(), calendarEvent.getAttendeeNum()));
        return aVar.build();
    }

    /* renamed from: a */
    public static com.bytedance.lark.pb.calendar.v1.CalendarEventAttendee m124492a(com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee calendarEventAttendee) {
        if (calendarEventAttendee == null) {
            return null;
        }
        CalendarEventAttendee.C15528a aVar = new CalendarEventAttendee.C15528a();
        aVar.mo56297a(calendarEventAttendee.getId());
        if (calendarEventAttendee.getKey() != null) {
            aVar.mo56300b(calendarEventAttendee.getKey());
        }
        aVar.mo56296a(Long.valueOf(calendarEventAttendee.getOriginalTime()));
        if (calendarEventAttendee.getLocalizedDisplayName() != null) {
            aVar.mo56302c(calendarEventAttendee.getLocalizedDisplayName());
        }
        aVar.mo56303d(calendarEventAttendee.getAttendeeCalendarId());
        aVar.mo56294a(Boolean.valueOf(calendarEventAttendee.isOrganizer()));
        if (calendarEventAttendee.getStatus() != null) {
            aVar.mo56289a(CalendarEventAttendee.Status.fromValue(calendarEventAttendee.getStatus().getNumber()));
        }
        aVar.mo56295a(Integer.valueOf(calendarEventAttendee.getAdditionalGuestsCount()));
        aVar.mo56305f(calendarEventAttendee.getAvatarKey());
        aVar.mo56299b(Boolean.valueOf(calendarEventAttendee.isOptional()));
        aVar.mo56301c(Boolean.valueOf(calendarEventAttendee.isEditable()));
        aVar.mo56304e(calendarEventAttendee.getInviterCalendarId());
        aVar.mo56286a(CalendarEventAttendee.Category.fromValue(calendarEventAttendee.getCategory().getValue()));
        if (CalendarEventAttendee.Category.USER.equals(calendarEventAttendee.getCategory())) {
            CalendarEventAttendee.User.C15526a aVar2 = new CalendarEventAttendee.User.C15526a();
            aVar2.f41113b = calendarEventAttendee.getTenantId();
            aVar2.f41112a = calendarEventAttendee.getUserId();
            aVar.f41132q = aVar2.build();
        } else if (CalendarEventAttendee.Category.GROUP.equals(calendarEventAttendee.getCategory())) {
            CalendarEventAttendee.Group.C15520a aVar3 = new CalendarEventAttendee.Group.C15520a();
            aVar3.f41099a = calendarEventAttendee.getGroupId();
            if (CollectionUtils.isNotEmpty(calendarEventAttendee.getGroupMembers())) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < calendarEventAttendee.getGroupMembers().size(); i++) {
                    arrayList.add(m124492a(calendarEventAttendee.getGroupMembers().get(i)));
                }
                aVar3.mo56268a(arrayList);
            }
            aVar3.f41101c = calendarEventAttendee.getTenantId();
            aVar3.f41102d = Boolean.valueOf(calendarEventAttendee.getIsCrossTenantGroup());
            aVar3.f41105g = Integer.valueOf(calendarEventAttendee.getValidMemberCount());
            aVar3.f41106h = Boolean.valueOf(calendarEventAttendee.isAnyRemoved());
            aVar3.f41107i = Boolean.valueOf(calendarEventAttendee.isSelfInGroup());
            aVar.f41133r = aVar3.build();
        } else if (CalendarEventAttendee.Category.RESOURCE.equals(calendarEventAttendee.getCategory())) {
            CalendarEventAttendee.Resource.C15522a aVar4 = new CalendarEventAttendee.Resource.C15522a();
            aVar4.f41108a = calendarEventAttendee.getTenantId();
            aVar.f41134s = aVar4.build();
        } else if (CalendarEventAttendee.Category.THIRD_PARTY_USER.equals(calendarEventAttendee.getCategory())) {
            CalendarEventAttendee.ThirdPartyUser.C15524a aVar5 = new CalendarEventAttendee.ThirdPartyUser.C15524a();
            aVar5.mo56277a(calendarEventAttendee.getEmail());
            aVar.f41135t = aVar5.build();
        }
        if (calendarEventAttendee.getSchemaCollection() != null) {
            aVar.mo56292a(m124498a(calendarEventAttendee.getSchemaCollection()));
        }
        if (calendarEventAttendee.getSchemaExtraData() != null) {
            aVar.mo56293a(m124506a(calendarEventAttendee.getSchemaExtraData()));
        }
        return aVar.build();
    }

    /* renamed from: a */
    public static com.bytedance.lark.pb.calendar.v1.CalendarEventInstance m124494a(CalendarEventInstance calendarEventInstance) {
        if (calendarEventInstance == null) {
            return null;
        }
        CalendarEventInstance.C15534a aVar = new CalendarEventInstance.C15534a();
        if (calendarEventInstance.getId() == null) {
            aVar.mo56335a("0");
        } else {
            aVar.mo56335a(calendarEventInstance.getId());
        }
        aVar.mo56341b(calendarEventInstance.getEventId());
        aVar.mo56345c(calendarEventInstance.getCalendarId());
        aVar.mo56348d(calendarEventInstance.getOrganizerId());
        aVar.mo56334a(Long.valueOf(calendarEventInstance.getStartTime()));
        aVar.mo56350e(calendarEventInstance.getStartTimezone());
        aVar.mo56340b(Long.valueOf(calendarEventInstance.getEndTime()));
        aVar.mo56351f(calendarEventInstance.getEndTimezone());
        aVar.mo56333a(Integer.valueOf(calendarEventInstance.getStartDay()));
        aVar.mo56339b(Integer.valueOf(calendarEventInstance.getEndDay()));
        aVar.mo56343c(Integer.valueOf(calendarEventInstance.getStartMinute()));
        aVar.mo56347d(Integer.valueOf(calendarEventInstance.getEndMinute()));
        aVar.mo56352g(calendarEventInstance.getKey());
        aVar.mo56344c(Long.valueOf(calendarEventInstance.getOriginalTime()));
        aVar.mo56349e(Integer.valueOf(calendarEventInstance.getColor()));
        if (calendarEventInstance.getSummary() != null) {
            aVar.mo56353h(calendarEventInstance.getSummary());
        }
        aVar.mo56332a(Boolean.valueOf(calendarEventInstance.isAllDay()));
        if (calendarEventInstance.getStatus() != null) {
            aVar.mo56328a(CalendarEvent.Status.fromValue(calendarEventInstance.getStatus().getNumber()));
        }
        if (calendarEventInstance.getSelfAttendeeStatus() != null) {
            aVar.mo56330a(CalendarEventAttendee.Status.fromValue(calendarEventInstance.getSelfAttendeeStatus().getNumber()));
        }
        aVar.mo56338b(Boolean.valueOf(calendarEventInstance.isFree()));
        if (calendarEventInstance.getCalAccessRole() != null) {
            aVar.mo56326a(Calendar.AccessRole.fromValue(calendarEventInstance.getCalAccessRole().getNumber()));
        }
        aVar.mo56354i(calendarEventInstance.getEventServerId());
        aVar.mo56342c(Boolean.valueOf(calendarEventInstance.isEditable()));
        com.bytedance.lark.pb.calendar.v1.CalendarLocation a = m124496a(calendarEventInstance.getCalendarLocation());
        if (a != null) {
            aVar.mo56331a(a);
        }
        if (calendarEventInstance.getVisibility() != null) {
            aVar.mo56329a(CalendarEvent.Visibility.fromValue(calendarEventInstance.getVisibility().getNumber()));
        }
        aVar.mo56346d(Boolean.valueOf(calendarEventInstance.isSubscriber()));
        if (calendarEventInstance.getMeetingRooms() != null) {
            aVar.mo56336a(new ArrayList(calendarEventInstance.getMeetingRooms()));
        }
        if (calendarEventInstance.getDisplayType() != null) {
            aVar.mo56327a(CalendarEvent.DisplayType.fromValue(calendarEventInstance.getDisplayType().getNumber()));
        }
        return aVar.build();
    }
}
