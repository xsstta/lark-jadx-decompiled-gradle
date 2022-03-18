package com.ss.android.lark.calendar.impl.features.messagecard.p1553a.p1555b;

import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.bytedance.lark.pb.basic.v1.CalendarContent;
import com.bytedance.lark.pb.basic.v1.CalendarEventMessageCard;
import com.bytedance.lark.pb.basic.v1.Content;
import com.bytedance.lark.pb.basic.v1.EventCardTemplate;
import com.bytedance.lark.pb.basic.v1.GeneralCalendarContent;
import com.bytedance.lark.pb.basic.v1.ShareCalendarEventContent;
import com.bytedance.lark.pb.calendar.v1.CalendarEvent;
import com.bytedance.lark.pb.calendar.v1.ConflictType;
import com.squareup.wire.WireEnum;
import com.ss.android.lark.calendar.impl.features.messagecard.entity.CalendarCardContent;
import com.ss.android.lark.calendar.impl.features.messagecard.entity.CalendarEventCardDiff;
import com.ss.android.lark.calendar.impl.features.messagecard.entity.RSVPCommentCardInfo;
import com.ss.android.lark.calendar.impl.features.messagecard.entity.content.CalendarInternalContent;
import com.ss.android.lark.calendar.impl.features.messagecard.entity.content.CalendarInternalGeneralContent;
import com.ss.android.lark.calendar.impl.features.messagecard.entity.content.CalendarInternalShareEventContent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.rustadapter.p1573a.C32514b;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30045g;
import com.ss.android.lark.calendar.p1430a.p1431a.p1432a.AbstractC30026d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.calendar.impl.features.messagecard.a.b.b */
public class C32183b {

    /* renamed from: a */
    static AbstractC30045g f82293a = C30022a.f74882a.chatModuleDependency();

    /* renamed from: a */
    public static CalendarInternalShareEventContent m122667a(Content content) {
        CalendarEvent calendarEvent;
        int i;
        boolean z;
        ConflictType conflictType;
        long j;
        String str;
        CalendarInternalShareEventContent calendarInternalShareEventContent = new CalendarInternalShareEventContent();
        ShareCalendarEventContent shareCalendarEventContent = content.share_calendar_event_content;
        if (shareCalendarEventContent == null) {
            calendarEvent = null;
        } else {
            calendarEvent = C32514b.m124512a(shareCalendarEventContent.calendar_event);
        }
        calendarInternalShareEventContent.setCalendarEvent(calendarEvent);
        boolean z2 = false;
        if (shareCalendarEventContent == null) {
            i = 0;
        } else {
            i = shareCalendarEventContent.attendees_count.intValue();
        }
        calendarInternalShareEventContent.setAttendeesCount(i);
        if (shareCalendarEventContent == null) {
            z = false;
        } else {
            z = shareCalendarEventContent.is_joined.booleanValue();
        }
        calendarInternalShareEventContent.setJoined(z);
        if (shareCalendarEventContent != null) {
            z2 = shareCalendarEventContent.is_sharable.booleanValue();
        }
        calendarInternalShareEventContent.setSharable(z2);
        if (shareCalendarEventContent == null) {
            conflictType = CalendarEventMessageCard.DEFAULT_CONFLICT_TYPE;
        } else {
            conflictType = shareCalendarEventContent.conflict_type;
        }
        calendarInternalShareEventContent.setConflictType(CalendarInternalContent.ConflictType.forNumber(conflictType.getValue()));
        if (shareCalendarEventContent == null) {
            j = 0;
        } else {
            j = shareCalendarEventContent.conflict_time.longValue();
        }
        calendarInternalShareEventContent.setConflictTime(j);
        if (!(shareCalendarEventContent == null || shareCalendarEventContent.self_attendee_status == null)) {
            calendarInternalShareEventContent.setSelfAttendeeState(CalendarEventAttendee.Status.forNumber(shareCalendarEventContent.self_attendee_status.getValue()));
        }
        if (shareCalendarEventContent == null) {
            str = "";
        } else {
            str = shareCalendarEventContent.current_user_cal_id;
        }
        calendarInternalShareEventContent.setCurrentUserCalendarId(str);
        return calendarInternalShareEventContent;
    }

    /* renamed from: a */
    public static CalendarInternalContent m122666a(C14928Entity entity, Content content) {
        String str;
        String str2;
        String str3;
        List<String> list;
        Map<String, String> map;
        List list2;
        List list3;
        String str4;
        String str5;
        ConflictType conflictType;
        boolean z;
        WireEnum wireEnum;
        String str6;
        boolean z2;
        String str7;
        int i;
        CalendarEvent.Type type;
        String str8;
        CalendarInternalContent.CalendarEventCardStatus calendarEventCardStatus;
        CalendarInternalContent calendarInternalContent = new CalendarInternalContent();
        if (!(entity == null || content == null)) {
            CalendarContent calendarContent = content.calendar_content;
            Map<String, AbstractC30026d> a = f82293a.mo108220a(entity);
            if (!(calendarContent == null || a == null)) {
                if (calendarContent.message_version == null || calendarContent.message_version.compareTo((Enum) CalendarContent.CalendarMessageVersion.V3) < 0) {
                    new C32182a(calendarInternalContent).mo117524a(calendarContent.payload);
                    calendarInternalContent.setStartTime(calendarContent.start_time.longValue() * 1000);
                    calendarInternalContent.setStartTimeZone(calendarContent.start_timezone);
                    calendarInternalContent.setEndTime(calendarContent.end_time.longValue() * 1000);
                    calendarInternalContent.setAllDay(calendarContent.is_all_day.booleanValue());
                } else {
                    CalendarEventMessageCard calendarEventMessageCard = calendarContent.event_card;
                    calendarInternalContent.setMessageVersion(CalendarInternalContent.CalendarMessageVersion.forNumber(calendarContent.message_version.getValue()));
                    calendarInternalContent.setMeesageType(CalendarInternalContent.CalendarMessageType.forNumber(calendarContent.message_type.getValue()));
                    String str9 = "";
                    if (calendarEventMessageCard != null) {
                        str = calendarEventMessageCard.summary;
                    } else {
                        str = str9;
                    }
                    calendarInternalContent.setSummary(str);
                    if (calendarEventMessageCard != null) {
                        str2 = calendarEventMessageCard.location;
                    } else {
                        str2 = str9;
                    }
                    calendarInternalContent.setLocation(str2);
                    if (calendarEventMessageCard != null) {
                        str3 = calendarEventMessageCard.sender_user_id;
                    } else {
                        str3 = str9;
                    }
                    calendarInternalContent.setBotMessageSender(a.get(str3));
                    ArrayList<AbstractC30026d> arrayList = new ArrayList<>();
                    if (calendarEventMessageCard != null) {
                        list = calendarEventMessageCard.attendee_user_ids;
                    } else {
                        list = new ArrayList();
                    }
                    if (list != null && list.size() > 0) {
                        for (String str10 : list) {
                            AbstractC30026d dVar = a.get(str10);
                            if (dVar != null) {
                                arrayList.add(dVar);
                            }
                        }
                    }
                    if (arrayList.size() > 0) {
                        calendarInternalContent.setAttendeeList(arrayList);
                    }
                    if (calendarEventMessageCard != null) {
                        map = calendarEventMessageCard.chat_names;
                    } else {
                        map = new HashMap<>();
                    }
                    calendarInternalContent.setChatNames(map);
                    calendarInternalContent.setAttendeeCount(calendarEventMessageCard.attendee_count.intValue());
                    StringBuilder sb = new StringBuilder(50);
                    if (calendarEventMessageCard != null) {
                        list2 = calendarEventMessageCard.meeting_rooms;
                    } else {
                        list2 = new ArrayList();
                    }
                    if (calendarEventMessageCard != null) {
                        list3 = calendarEventMessageCard.is_meeting_rooms_disabled;
                    } else {
                        list3 = new ArrayList();
                    }
                    boolean z3 = true;
                    boolean z4 = false;
                    if (list2 != null && list2.size() > 0) {
                        boolean z5 = false;
                        for (int i2 = 0; i2 < list2.size(); i2++) {
                            if (!((Boolean) list3.get(i2)).booleanValue()) {
                                if (z5) {
                                    sb.append(", ");
                                }
                                sb.append((String) list2.get(i2));
                                z5 = true;
                            }
                        }
                    }
                    if (sb.length() > 0) {
                        calendarInternalContent.setMeetingRoom(sb.toString());
                    }
                    ArrayList arrayList2 = new ArrayList();
                    if (list2 != null) {
                        arrayList2.addAll(list2);
                    }
                    calendarInternalContent.setMeetingRoomList(arrayList2);
                    if (calendarEventMessageCard != null) {
                        str4 = calendarEventMessageCard.description;
                    } else {
                        str4 = str9;
                    }
                    calendarInternalContent.setDescription(str4);
                    if (calendarEventMessageCard == null) {
                        str5 = str9;
                    } else {
                        str5 = calendarEventMessageCard.rrule;
                    }
                    calendarInternalContent.setrRule(str5);
                    if (calendarEventMessageCard == null) {
                        conflictType = CalendarEventMessageCard.DEFAULT_CONFLICT_TYPE;
                    } else {
                        conflictType = calendarEventMessageCard.conflict_type;
                    }
                    calendarInternalContent.setConflictType(CalendarInternalContent.ConflictType.forNumber(conflictType.getValue()));
                    long j = 0;
                    calendarInternalContent.setConflictTime(calendarEventMessageCard == null ? 0 : calendarEventMessageCard.conflict_time.longValue() * 1000);
                    if (calendarEventMessageCard == null) {
                        z = false;
                    } else {
                        z = calendarEventMessageCard.is_optional.booleanValue();
                    }
                    calendarInternalContent.setOptional(z);
                    if (calendarEventMessageCard == null) {
                        wireEnum = CalendarEventMessageCard.DEFAULT_CONFLICT_TYPE;
                    } else {
                        wireEnum = calendarEventMessageCard.self_attendee_status;
                    }
                    calendarInternalContent.setmStatus(CalendarEventAttendee.Status.forNumber(wireEnum.getValue()));
                    calendarInternalContent.setStartTime(calendarEventMessageCard == null ? 0 : calendarEventMessageCard.start_time.longValue() * 1000);
                    if (calendarEventMessageCard == null) {
                        str6 = str9;
                    } else {
                        str6 = calendarEventMessageCard.start_timezone;
                    }
                    calendarInternalContent.setStartTimeZone(str6);
                    calendarInternalContent.setEndTime(calendarEventMessageCard == null ? 0 : calendarEventMessageCard.end_time.longValue() * 1000);
                    if (calendarEventMessageCard == null) {
                        z2 = false;
                    } else {
                        z2 = calendarEventMessageCard.is_all_day.booleanValue();
                    }
                    calendarInternalContent.setAllDay(z2);
                    if (calendarEventMessageCard != null) {
                        j = calendarEventMessageCard.original_time.longValue();
                    }
                    calendarInternalContent.setOriginalTime(j);
                    if (calendarEventMessageCard == null) {
                        str7 = str9;
                    } else {
                        str7 = calendarEventMessageCard.event_key;
                    }
                    calendarInternalContent.setEventKey(str7);
                    if (calendarEventMessageCard == null) {
                        i = 0;
                    } else {
                        i = calendarEventMessageCard.calendar_id;
                    }
                    calendarInternalContent.setCalendarId(String.valueOf(i));
                    if (calendarEventMessageCard == null) {
                        type = CalendarEventMessageCard.DEFAULT_EVENT_TYPE;
                    } else {
                        type = calendarEventMessageCard.event_type;
                    }
                    calendarInternalContent.setEventType(CalendarEvent.Type.forNumber(type.getValue()));
                    if (calendarEventMessageCard != null) {
                        z4 = calendarEventMessageCard.is_cross_tenant.booleanValue();
                    }
                    calendarInternalContent.setCrossExternal(z4);
                    if (calendarEventMessageCard == null) {
                        str8 = str9;
                    } else {
                        str8 = calendarEventMessageCard.event_id;
                    }
                    calendarInternalContent.setEventServiceId(str8);
                    if (calendarEventMessageCard != null) {
                        str9 = calendarEventMessageCard.user_invite_operator_id;
                    }
                    calendarInternalContent.setUserInviteOperatorId(str9);
                    if (calendarEventMessageCard != null) {
                        z3 = calendarEventMessageCard.show_reply_inviter_entry.booleanValue();
                    }
                    calendarInternalContent.setShowReplyInviterEntry(z3);
                    if (calendarEventMessageCard == null) {
                        calendarEventCardStatus = CalendarInternalContent.CalendarEventCardStatus.NORMAL;
                    } else {
                        calendarEventCardStatus = CalendarInternalContent.CalendarEventCardStatus.forNumber(calendarEventMessageCard.card_status.getValue());
                    }
                    calendarInternalContent.setEventCardStatus(calendarEventCardStatus);
                    if (!(calendarEventMessageCard == null || calendarEventMessageCard.card_info_for_diff == null)) {
                        CalendarEventMessageCard.EventCardInfoForDiff eventCardInfoForDiff = calendarEventMessageCard.card_info_for_diff;
                        ArrayList arrayList3 = new ArrayList();
                        if (eventCardInfoForDiff.meeting_rooms != null) {
                            arrayList3.addAll(eventCardInfoForDiff.meeting_rooms);
                        }
                        calendarInternalContent.setEventCardDiffInfo(new CalendarEventCardDiff(eventCardInfoForDiff.start_time.longValue(), eventCardInfoForDiff.end_time.longValue(), eventCardInfoForDiff.rrule, eventCardInfoForDiff.is_all_day.booleanValue(), eventCardInfoForDiff.description, eventCardInfoForDiff.location, arrayList3));
                    }
                }
            }
        }
        return calendarInternalContent;
    }

    /* renamed from: b */
    public static CalendarInternalGeneralContent m122668b(C14928Entity entity, Content content) {
        GeneralCalendarContent generalCalendarContent;
        String str;
        String str2;
        boolean z;
        String str3;
        boolean z2;
        String str4;
        String str5;
        String str6;
        int i;
        String str7;
        int i2;
        List<String> list;
        List<Boolean> list2;
        List<String> list3;
        List<String> list4;
        int i3;
        String str8;
        int i4;
        List<String> list5;
        ConflictType conflictType;
        Map<String, String> map;
        CalendarInternalGeneralContent calendarInternalGeneralContent = new CalendarInternalGeneralContent();
        CalendarCardContent calendarCardContent = new CalendarCardContent();
        if (entity == null || content == null || (generalCalendarContent = content.general_calendar_content) == null) {
            return calendarInternalGeneralContent;
        }
        if (GeneralCalendarContent.Type.UNKNOWN.equals(generalCalendarContent.calendar_type)) {
            return null;
        }
        Map<String, AbstractC30026d> a = f82293a.mo108220a(entity);
        calendarInternalGeneralContent.setMessageType(CalendarInternalGeneralContent.CalendarMessageType.forNumber(generalCalendarContent.calendar_type.getValue()));
        EventCardTemplate eventCardTemplate = generalCalendarContent.event_card;
        if (calendarInternalGeneralContent.getMessageType() != CalendarInternalGeneralContent.CalendarMessageType.UNKNOWN) {
            String str9 = "";
            if (eventCardTemplate == null) {
                str = str9;
            } else {
                str = eventCardTemplate.summary;
            }
            calendarCardContent.setSummary(str);
            if (eventCardTemplate == null) {
                str2 = str9;
            } else {
                str2 = eventCardTemplate.sender_id;
            }
            calendarCardContent.setSender(a.get(str2));
            boolean z3 = false;
            if (eventCardTemplate == null) {
                z = false;
            } else {
                z = eventCardTemplate.is_optional.booleanValue();
            }
            calendarCardContent.setIsOptional(z);
            long j = 0;
            calendarCardContent.setStartTime(eventCardTemplate == null ? 0 : eventCardTemplate.start_time.longValue() * 1000);
            calendarCardContent.setEndTime(eventCardTemplate == null ? 0 : eventCardTemplate.end_time.longValue() * 1000);
            if (eventCardTemplate == null) {
                str3 = str9;
            } else {
                str3 = eventCardTemplate.rrule;
            }
            calendarCardContent.setRRule(str3);
            if (eventCardTemplate == null) {
                z2 = false;
            } else {
                z2 = eventCardTemplate.is_all_day.booleanValue();
            }
            calendarCardContent.setIsAllDay(z2);
            calendarCardContent.setVersion(eventCardTemplate == null ? 0 : eventCardTemplate.version.longValue());
            if (eventCardTemplate == null) {
                str4 = str9;
            } else {
                str4 = eventCardTemplate.start_timezone;
            }
            calendarCardContent.setStartTimezone(str4);
            if (eventCardTemplate == null) {
                str5 = str9;
            } else {
                str5 = eventCardTemplate.end_timezone;
            }
            calendarCardContent.setEndTimezone(str5);
            if (eventCardTemplate == null) {
                str6 = str9;
            } else {
                str6 = eventCardTemplate.id;
            }
            calendarCardContent.setId(str6);
            if (eventCardTemplate == null) {
                i = 0;
            } else {
                i = eventCardTemplate.type.intValue();
            }
            calendarCardContent.setType(i);
            if (eventCardTemplate == null) {
                str7 = str9;
            } else {
                str7 = eventCardTemplate.key;
            }
            calendarCardContent.setKey(str7);
            calendarCardContent.setOriginalTime(eventCardTemplate == null ? 0 : eventCardTemplate.original_time.longValue());
            if (eventCardTemplate == null) {
                i2 = 0;
            } else {
                i2 = eventCardTemplate.calendar_id;
            }
            calendarCardContent.setCalendarId(String.valueOf(i2));
            if (eventCardTemplate != null) {
                list = eventCardTemplate.meeting_rooms;
            } else {
                list = new ArrayList<>();
            }
            calendarCardContent.setMeetingRooms(list);
            if (eventCardTemplate != null) {
                list2 = eventCardTemplate.is_meeting_rooms_disabled;
            } else {
                list2 = new ArrayList<>();
            }
            calendarCardContent.setMeetingRoomsIsDisabled(list2);
            ArrayList<AbstractC30026d> arrayList = new ArrayList<>();
            if (eventCardTemplate != null) {
                list3 = eventCardTemplate.attendee_chatter_ids;
            } else {
                list3 = new ArrayList();
            }
            if (list3 != null && list3.size() > 0) {
                for (String str10 : list3) {
                    AbstractC30026d dVar = a.get(str10);
                    if (dVar != null) {
                        arrayList.add(dVar);
                    }
                }
            }
            if (arrayList.size() > 0) {
                calendarCardContent.setAttendeeList(arrayList);
            }
            if (eventCardTemplate != null) {
                list4 = eventCardTemplate.chat_ids;
            } else {
                list4 = new ArrayList<>();
            }
            calendarCardContent.setChatIds(list4);
            if (eventCardTemplate == null) {
                i3 = EventCardTemplate.DEFAULT_CONFLICT_TYPE.getValue();
            } else {
                i3 = eventCardTemplate.self_attendee_status.intValue();
            }
            calendarCardContent.setSelfAttendeeStatus(CalendarEventAttendee.Status.forNumber(i3));
            calendarCardContent.setAttendeeCount(eventCardTemplate.attendee_count.intValue());
            if (eventCardTemplate != null) {
                str8 = eventCardTemplate.location;
            } else {
                str8 = str9;
            }
            calendarCardContent.setLocation(str8);
            if (eventCardTemplate != null) {
                str9 = eventCardTemplate.description;
            }
            calendarCardContent.setDescription(str9);
            if (eventCardTemplate == null) {
                i4 = CalendarEventMessageCard.DEFAULT_EVENT_TYPE.getValue();
            } else {
                i4 = eventCardTemplate.event_type.intValue();
            }
            calendarCardContent.setEventType(CalendarEvent.Type.forNumber(i4));
            if (eventCardTemplate != null) {
                z3 = eventCardTemplate.is_cross_tenant.booleanValue();
            }
            calendarCardContent.setIsCrossTenant(z3);
            if (eventCardTemplate != null) {
                list5 = eventCardTemplate.individual_chatter_ids;
            } else {
                list5 = new ArrayList<>();
            }
            calendarCardContent.setIndividualChatterIds(list5);
            if (eventCardTemplate == null) {
                conflictType = CalendarEventMessageCard.DEFAULT_CONFLICT_TYPE;
            } else {
                conflictType = eventCardTemplate.conflict_type;
            }
            calendarCardContent.setConflictType(CalendarInternalContent.ConflictType.forNumber(conflictType.getValue()));
            if (eventCardTemplate != null) {
                j = eventCardTemplate.conflict_time.longValue() * 1000;
            }
            calendarCardContent.setConflictTime(j);
            if (eventCardTemplate != null) {
                map = eventCardTemplate.chat_names;
            } else {
                map = new HashMap<>();
            }
            calendarCardContent.setChatNames(map);
        }
        calendarInternalGeneralContent.setCalendarCardContent(calendarCardContent);
        if (generalCalendarContent.rsvp_comment_card_info != null) {
            calendarInternalGeneralContent.setRSVPCommentCardInfo(new RSVPCommentCardInfo(generalCalendarContent.rsvp_comment_card_info.responder_user_id));
        }
        HashMap hashMap = new HashMap();
        for (String str11 : a.keySet()) {
            AbstractC30026d dVar2 = a.get(str11);
            if (dVar2 != null) {
                hashMap.put(str11, dVar2);
            }
        }
        calendarInternalGeneralContent.setMessageChatters(hashMap);
        return calendarInternalGeneralContent;
    }
}
