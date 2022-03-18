package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.calendar.v1.OldVersionCalendarEventAttendee;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.mm.module.list.control.MmListControl;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.log.IVideoEventLogger;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class OldVersionCalendarEvent extends Message<OldVersionCalendarEvent, C15886a> {
    public static final ProtoAdapter<OldVersionCalendarEvent> ADAPTER = new C15887b();
    public static final Integer DEFAULT_COLOR = -1;
    public static final ConflictType DEFAULT_CONFLICT_TYPE = ConflictType.NONE;
    public static final Long DEFAULT_CREATE_TIME = 0L;
    public static final CalendarDirtyType DEFAULT_DIRTY_TYPE = CalendarDirtyType.NONE_DIRTY_TYPE;
    public static final DisplayType DEFAULT_DISPLAY_TYPE = DisplayType.INVISIBLE;
    public static final Long DEFAULT_END_TIME = 0L;
    public static final Boolean DEFAULT_GUEST_CAN_INVITE = true;
    public static final Boolean DEFAULT_GUEST_CAN_MODIFY = false;
    public static final Boolean DEFAULT_GUEST_CAN_SEE_OTHER_GUESTS = true;
    public static final Boolean DEFAULT_HAS_ALARM = false;
    public static final Boolean DEFAULT_HAS_ATTENDEE = false;
    public static final Integer DEFAULT_IMPORTANCE = 0;
    public static final Boolean DEFAULT_IS_ALL_DAY = false;
    public static final Boolean DEFAULT_IS_CROSS_TENANT = false;
    public static final Deletable DEFAULT_IS_DELETABLE = Deletable.NOT;
    public static final Boolean DEFAULT_IS_EDITABLE = false;
    public static final Boolean DEFAULT_IS_FREE = false;
    public static final Boolean DEFAULT_IS_SCHEDULED = false;
    public static final Long DEFAULT_LAST_DATE = 0L;
    public static final Boolean DEFAULT_NEED_UPDATE = false;
    public static final NotificationType DEFAULT_NOTIFICATION_TYPE = NotificationType.DEFAULT_NOTIFICATION_TYPE;
    public static final Boolean DEFAULT_ORIGINAL_IS_ALL_DAY = false;
    public static final Long DEFAULT_ORIGINAL_TIME = 0L;
    public static final OldVersionCalendarEventAttendee.Status DEFAULT_SELF_ATTENDEE_STATUS = OldVersionCalendarEventAttendee.Status.NEEDS_ACTION;
    public static final Sharability DEFAULT_SHARABILITY = Sharability.FORBIDDEN_NOT_ACCESSIBLE;
    public static final Source DEFAULT_SOURCE = Source.UNKNOWN_SOURCE;
    public static final Long DEFAULT_START_TIME = 0L;
    public static final Status DEFAULT_STATUS = Status.TENTATIVE;
    public static final Type DEFAULT_TYPE = Type.DEFAULT_TYPE;
    public static final Long DEFAULT_UPDATE_TIME = 0L;
    public static final Integer DEFAULT_VERSION = 0;
    public static final Visibility DEFAULT_VISIBILITY = Visibility.DEFAULT;
    public static final Boolean DEFAULT_WILL_CREATOR_ATTEND = false;
    public static final Boolean DEFAULT_WILL_ORGANIZER_ATTEND = false;
    public static final Boolean DEFAULT_WILL_SUCCESSOR_ATTEND = false;
    private static final long serialVersionUID = 0;
    public final List<OldVersionCalendarEventAttendee> attendees;
    public final String audio_url;
    public final MappingColor cal_color;
    public final String calendar_id;
    public final Integer color;
    public final ConflictType conflict_type;
    public final Long create_time;
    public final OldVersionCalendarEventAttendee creator;
    public final String creator_calendar_id;
    public final String description;
    public final CalendarDirtyType dirty_type;
    public final DisplayType display_type;
    public final String docs_description;
    public final Long end_time;
    public final String end_timezone;
    public final MappingColor event_color;
    public final Boolean guest_can_invite;
    public final Boolean guest_can_modify;
    public final Boolean guest_can_see_other_guests;
    public final Boolean has_alarm;
    public final Boolean has_attendee;
    public final String id;
    public final Integer importance;
    public final Boolean is_all_day;
    public final Boolean is_cross_tenant;
    public final Deletable is_deletable;
    public final Boolean is_editable;
    public final Boolean is_free;
    public final Boolean is_scheduled;
    public final String key;
    public final Long last_date;
    public final CalendarLocation location;
    public final String meeting_id;
    public final String meeting_minute_url;
    public final Boolean need_update;
    public final NotificationType notification_type;
    public final OldVersionCalendarEventAttendee organizer;
    public final String organizer_calendar_id;
    public final String original_event_key;
    public final Boolean original_is_all_day;
    public final Long original_time;
    public final List<CalendarEventReminder> reminders;
    public final String rrule;
    public final OldVersionCalendarEventAttendee.Status self_attendee_status;
    public final String server_id;
    public final Sharability sharability;
    public final Source source;
    public final Long start_time;
    public final String start_timezone;
    public final Status status;
    public final OldVersionCalendarEventAttendee successor;
    public final String successor_calendar_id;
    public final String summary;
    public final Type type;
    public final Long update_time;
    public final String url;
    public final Integer version;
    public final VideoMeeting video_meeting;
    public final Visibility visibility;
    public final Boolean will_creator_attend;
    public final Boolean will_organizer_attend;
    public final Boolean will_successor_attend;

    public enum Deletable implements WireEnum {
        NOT(1),
        SELF(2),
        ALL(3);
        
        public static final ProtoAdapter<Deletable> ADAPTER = ProtoAdapter.newEnumAdapter(Deletable.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Deletable fromValue(int i) {
            if (i == 1) {
                return NOT;
            }
            if (i == 2) {
                return SELF;
            }
            if (i != 3) {
                return null;
            }
            return ALL;
        }

        private Deletable(int i) {
            this.value = i;
        }
    }

    public enum DisplayType implements WireEnum {
        INVISIBLE(1),
        LIMITED(2),
        FULL(3);
        
        public static final ProtoAdapter<DisplayType> ADAPTER = ProtoAdapter.newEnumAdapter(DisplayType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static DisplayType fromValue(int i) {
            if (i == 1) {
                return INVISIBLE;
            }
            if (i == 2) {
                return LIMITED;
            }
            if (i != 3) {
                return null;
            }
            return FULL;
        }

        private DisplayType(int i) {
            this.value = i;
        }
    }

    public enum NotificationType implements WireEnum {
        DEFAULT_NOTIFICATION_TYPE(1),
        NO_NOTIFICATION(2),
        SEND_NOTIFICATION(3);
        
        public static final ProtoAdapter<NotificationType> ADAPTER = ProtoAdapter.newEnumAdapter(NotificationType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static NotificationType fromValue(int i) {
            if (i == 1) {
                return DEFAULT_NOTIFICATION_TYPE;
            }
            if (i == 2) {
                return NO_NOTIFICATION;
            }
            if (i != 3) {
                return null;
            }
            return SEND_NOTIFICATION;
        }

        private NotificationType(int i) {
            this.value = i;
        }
    }

    public enum Sharability implements WireEnum {
        FORBIDDEN_NOT_ACCESSIBLE(1),
        FORBIDDEN_PRIVATE(2),
        SHARABLE(3);
        
        public static final ProtoAdapter<Sharability> ADAPTER = ProtoAdapter.newEnumAdapter(Sharability.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Sharability fromValue(int i) {
            if (i == 1) {
                return FORBIDDEN_NOT_ACCESSIBLE;
            }
            if (i == 2) {
                return FORBIDDEN_PRIVATE;
            }
            if (i != 3) {
                return null;
            }
            return SHARABLE;
        }

        private Sharability(int i) {
            this.value = i;
        }
    }

    public enum Source implements WireEnum {
        UNKNOWN_SOURCE(0),
        WEB(1),
        IOS(2),
        IOS_APP(3),
        ANDROID(4),
        ANDROID_APP(5),
        PC_CLIENT(6),
        GOOGLE(7),
        PEOPLE(8);
        
        public static final ProtoAdapter<Source> ADAPTER = ProtoAdapter.newEnumAdapter(Source.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Source fromValue(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN_SOURCE;
                case 1:
                    return WEB;
                case 2:
                    return IOS;
                case 3:
                    return IOS_APP;
                case 4:
                    return ANDROID;
                case 5:
                    return ANDROID_APP;
                case 6:
                    return PC_CLIENT;
                case 7:
                    return GOOGLE;
                case 8:
                    return PEOPLE;
                default:
                    return null;
            }
        }

        private Source(int i) {
            this.value = i;
        }
    }

    public enum Span implements WireEnum {
        NONE_SPAN(0),
        THIS_EVENT(1),
        FUTURE_EVENTS(2),
        ALL_EVENTS(3);
        
        public static final ProtoAdapter<Span> ADAPTER = ProtoAdapter.newEnumAdapter(Span.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Span fromValue(int i) {
            if (i == 0) {
                return NONE_SPAN;
            }
            if (i == 1) {
                return THIS_EVENT;
            }
            if (i == 2) {
                return FUTURE_EVENTS;
            }
            if (i != 3) {
                return null;
            }
            return ALL_EVENTS;
        }

        private Span(int i) {
            this.value = i;
        }
    }

    public enum Status implements WireEnum {
        TENTATIVE(1),
        CONFIRMED(2),
        CANCELED(3);
        
        public static final ProtoAdapter<Status> ADAPTER = ProtoAdapter.newEnumAdapter(Status.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Status fromValue(int i) {
            if (i == 1) {
                return TENTATIVE;
            }
            if (i == 2) {
                return CONFIRMED;
            }
            if (i != 3) {
                return null;
            }
            return CANCELED;
        }

        private Status(int i) {
            this.value = i;
        }
    }

    public enum Type implements WireEnum {
        DEFAULT_TYPE(1),
        MEETING(2);
        
        public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Type fromValue(int i) {
            if (i == 1) {
                return DEFAULT_TYPE;
            }
            if (i != 2) {
                return null;
            }
            return MEETING;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    public enum Visibility implements WireEnum {
        DEFAULT(1),
        PUBLIC(2),
        PRIVATE(3);
        
        public static final ProtoAdapter<Visibility> ADAPTER = ProtoAdapter.newEnumAdapter(Visibility.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Visibility fromValue(int i) {
            if (i == 1) {
                return DEFAULT;
            }
            if (i == 2) {
                return PUBLIC;
            }
            if (i != 3) {
                return null;
            }
            return PRIVATE;
        }

        private Visibility(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.OldVersionCalendarEvent$b */
    private static final class C15887b extends ProtoAdapter<OldVersionCalendarEvent> {
        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, OldVersionCalendarEvent oldVersionCalendarEvent) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, oldVersionCalendarEvent.id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, oldVersionCalendarEvent.creator_calendar_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, oldVersionCalendarEvent.calendar_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, oldVersionCalendarEvent.organizer_calendar_id);
            if (oldVersionCalendarEvent.server_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, oldVersionCalendarEvent.server_id);
            }
            if (oldVersionCalendarEvent.self_attendee_status != null) {
                OldVersionCalendarEventAttendee.Status.ADAPTER.encodeWithTag(protoWriter, 6, oldVersionCalendarEvent.self_attendee_status);
            }
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, oldVersionCalendarEvent.key);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 8, oldVersionCalendarEvent.original_time);
            if (oldVersionCalendarEvent.original_event_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, oldVersionCalendarEvent.original_event_key);
            }
            if (oldVersionCalendarEvent.original_is_all_day != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 10, oldVersionCalendarEvent.original_is_all_day);
            }
            if (oldVersionCalendarEvent.is_free != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 11, oldVersionCalendarEvent.is_free);
            }
            if (oldVersionCalendarEvent.last_date != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 12, oldVersionCalendarEvent.last_date);
            }
            if (oldVersionCalendarEvent.create_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 13, oldVersionCalendarEvent.create_time);
            }
            if (oldVersionCalendarEvent.update_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 14, oldVersionCalendarEvent.update_time);
            }
            if (oldVersionCalendarEvent.color != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 15, oldVersionCalendarEvent.color);
            }
            if (oldVersionCalendarEvent.source != null) {
                Source.ADAPTER.encodeWithTag(protoWriter, 16, oldVersionCalendarEvent.source);
            }
            if (oldVersionCalendarEvent.visibility != null) {
                Visibility.ADAPTER.encodeWithTag(protoWriter, 17, oldVersionCalendarEvent.visibility);
            }
            if (oldVersionCalendarEvent.importance != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 18, oldVersionCalendarEvent.importance);
            }
            if (oldVersionCalendarEvent.dirty_type != null) {
                CalendarDirtyType.ADAPTER.encodeWithTag(protoWriter, 19, oldVersionCalendarEvent.dirty_type);
            }
            if (oldVersionCalendarEvent.version != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 20, oldVersionCalendarEvent.version);
            }
            if (oldVersionCalendarEvent.need_update != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 21, oldVersionCalendarEvent.need_update);
            }
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 22, oldVersionCalendarEvent.summary);
            if (oldVersionCalendarEvent.description != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 23, oldVersionCalendarEvent.description);
            }
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 24, oldVersionCalendarEvent.is_all_day);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 25, oldVersionCalendarEvent.start_time);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 26, oldVersionCalendarEvent.start_timezone);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 27, oldVersionCalendarEvent.end_time);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 28, oldVersionCalendarEvent.end_timezone);
            if (oldVersionCalendarEvent.status != null) {
                Status.ADAPTER.encodeWithTag(protoWriter, 29, oldVersionCalendarEvent.status);
            }
            if (oldVersionCalendarEvent.rrule != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 30, oldVersionCalendarEvent.rrule);
            }
            if (oldVersionCalendarEvent.guest_can_invite != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 31, oldVersionCalendarEvent.guest_can_invite);
            }
            if (oldVersionCalendarEvent.guest_can_see_other_guests != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 32, oldVersionCalendarEvent.guest_can_see_other_guests);
            }
            if (oldVersionCalendarEvent.guest_can_modify != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 33, oldVersionCalendarEvent.guest_can_modify);
            }
            if (oldVersionCalendarEvent.audio_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 34, oldVersionCalendarEvent.audio_url);
            }
            if (oldVersionCalendarEvent.url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 35, oldVersionCalendarEvent.url);
            }
            if (oldVersionCalendarEvent.location != null) {
                CalendarLocation.ADAPTER.encodeWithTag(protoWriter, 36, oldVersionCalendarEvent.location);
            }
            if (oldVersionCalendarEvent.has_alarm != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 37, oldVersionCalendarEvent.has_alarm);
            }
            if (oldVersionCalendarEvent.has_attendee != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 38, oldVersionCalendarEvent.has_attendee);
            }
            if (oldVersionCalendarEvent.is_scheduled != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 39, oldVersionCalendarEvent.is_scheduled);
            }
            if (oldVersionCalendarEvent.creator != null) {
                OldVersionCalendarEventAttendee.ADAPTER.encodeWithTag(protoWriter, 40, oldVersionCalendarEvent.creator);
            }
            if (oldVersionCalendarEvent.organizer != null) {
                OldVersionCalendarEventAttendee.ADAPTER.encodeWithTag(protoWriter, 41, oldVersionCalendarEvent.organizer);
            }
            OldVersionCalendarEventAttendee.ADAPTER.asRepeated().encodeWithTag(protoWriter, 42, oldVersionCalendarEvent.attendees);
            CalendarEventReminder.ADAPTER.asRepeated().encodeWithTag(protoWriter, 43, oldVersionCalendarEvent.reminders);
            if (oldVersionCalendarEvent.display_type != null) {
                DisplayType.ADAPTER.encodeWithTag(protoWriter, 44, oldVersionCalendarEvent.display_type);
            }
            if (oldVersionCalendarEvent.event_color != null) {
                MappingColor.ADAPTER.encodeWithTag(protoWriter, 45, oldVersionCalendarEvent.event_color);
            }
            if (oldVersionCalendarEvent.cal_color != null) {
                MappingColor.ADAPTER.encodeWithTag(protoWriter, 46, oldVersionCalendarEvent.cal_color);
            }
            if (oldVersionCalendarEvent.conflict_type != null) {
                ConflictType.ADAPTER.encodeWithTag(protoWriter, 47, oldVersionCalendarEvent.conflict_type);
            }
            if (oldVersionCalendarEvent.type != null) {
                Type.ADAPTER.encodeWithTag(protoWriter, 48, oldVersionCalendarEvent.type);
            }
            if (oldVersionCalendarEvent.meeting_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 49, oldVersionCalendarEvent.meeting_id);
            }
            if (oldVersionCalendarEvent.is_editable != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 50, oldVersionCalendarEvent.is_editable);
            }
            if (oldVersionCalendarEvent.is_deletable != null) {
                Deletable.ADAPTER.encodeWithTag(protoWriter, 51, oldVersionCalendarEvent.is_deletable);
            }
            if (oldVersionCalendarEvent.sharability != null) {
                Sharability.ADAPTER.encodeWithTag(protoWriter, 52, oldVersionCalendarEvent.sharability);
            }
            if (oldVersionCalendarEvent.docs_description != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 53, oldVersionCalendarEvent.docs_description);
            }
            if (oldVersionCalendarEvent.successor_calendar_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 54, oldVersionCalendarEvent.successor_calendar_id);
            }
            if (oldVersionCalendarEvent.successor != null) {
                OldVersionCalendarEventAttendee.ADAPTER.encodeWithTag(protoWriter, 55, oldVersionCalendarEvent.successor);
            }
            if (oldVersionCalendarEvent.notification_type != null) {
                NotificationType.ADAPTER.encodeWithTag(protoWriter, 56, oldVersionCalendarEvent.notification_type);
            }
            if (oldVersionCalendarEvent.is_cross_tenant != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 57, oldVersionCalendarEvent.is_cross_tenant);
            }
            if (oldVersionCalendarEvent.will_creator_attend != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 58, oldVersionCalendarEvent.will_creator_attend);
            }
            if (oldVersionCalendarEvent.will_organizer_attend != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 59, oldVersionCalendarEvent.will_organizer_attend);
            }
            if (oldVersionCalendarEvent.will_successor_attend != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 60, oldVersionCalendarEvent.will_successor_attend);
            }
            if (oldVersionCalendarEvent.video_meeting != null) {
                VideoMeeting.ADAPTER.encodeWithTag(protoWriter, 61, oldVersionCalendarEvent.video_meeting);
            }
            if (oldVersionCalendarEvent.meeting_minute_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 62, oldVersionCalendarEvent.meeting_minute_url);
            }
            protoWriter.writeBytes(oldVersionCalendarEvent.unknownFields());
        }

        C15887b() {
            super(FieldEncoding.LENGTH_DELIMITED, OldVersionCalendarEvent.class);
        }

        /* renamed from: a */
        public int encodedSize(OldVersionCalendarEvent oldVersionCalendarEvent) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            int i18;
            int i19;
            int i20;
            int i21;
            int i22;
            int i23;
            int i24;
            int i25;
            int i26;
            int i27;
            int i28;
            int i29;
            int i30;
            int i31;
            int i32;
            int i33;
            int i34;
            int i35;
            int i36;
            int i37;
            int i38;
            int i39;
            int i40;
            int i41;
            int i42;
            int i43;
            int i44;
            int i45;
            int i46;
            int i47;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, oldVersionCalendarEvent.id) + ProtoAdapter.STRING.encodedSizeWithTag(2, oldVersionCalendarEvent.creator_calendar_id) + ProtoAdapter.STRING.encodedSizeWithTag(3, oldVersionCalendarEvent.calendar_id) + ProtoAdapter.STRING.encodedSizeWithTag(4, oldVersionCalendarEvent.organizer_calendar_id);
            int i48 = 0;
            if (oldVersionCalendarEvent.server_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(5, oldVersionCalendarEvent.server_id);
            } else {
                i = 0;
            }
            int i49 = encodedSizeWithTag + i;
            if (oldVersionCalendarEvent.self_attendee_status != null) {
                i2 = OldVersionCalendarEventAttendee.Status.ADAPTER.encodedSizeWithTag(6, oldVersionCalendarEvent.self_attendee_status);
            } else {
                i2 = 0;
            }
            int encodedSizeWithTag2 = i49 + i2 + ProtoAdapter.STRING.encodedSizeWithTag(7, oldVersionCalendarEvent.key) + ProtoAdapter.INT64.encodedSizeWithTag(8, oldVersionCalendarEvent.original_time);
            if (oldVersionCalendarEvent.original_event_key != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(9, oldVersionCalendarEvent.original_event_key);
            } else {
                i3 = 0;
            }
            int i50 = encodedSizeWithTag2 + i3;
            if (oldVersionCalendarEvent.original_is_all_day != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(10, oldVersionCalendarEvent.original_is_all_day);
            } else {
                i4 = 0;
            }
            int i51 = i50 + i4;
            if (oldVersionCalendarEvent.is_free != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(11, oldVersionCalendarEvent.is_free);
            } else {
                i5 = 0;
            }
            int i52 = i51 + i5;
            if (oldVersionCalendarEvent.last_date != null) {
                i6 = ProtoAdapter.INT64.encodedSizeWithTag(12, oldVersionCalendarEvent.last_date);
            } else {
                i6 = 0;
            }
            int i53 = i52 + i6;
            if (oldVersionCalendarEvent.create_time != null) {
                i7 = ProtoAdapter.INT64.encodedSizeWithTag(13, oldVersionCalendarEvent.create_time);
            } else {
                i7 = 0;
            }
            int i54 = i53 + i7;
            if (oldVersionCalendarEvent.update_time != null) {
                i8 = ProtoAdapter.INT64.encodedSizeWithTag(14, oldVersionCalendarEvent.update_time);
            } else {
                i8 = 0;
            }
            int i55 = i54 + i8;
            if (oldVersionCalendarEvent.color != null) {
                i9 = ProtoAdapter.INT32.encodedSizeWithTag(15, oldVersionCalendarEvent.color);
            } else {
                i9 = 0;
            }
            int i56 = i55 + i9;
            if (oldVersionCalendarEvent.source != null) {
                i10 = Source.ADAPTER.encodedSizeWithTag(16, oldVersionCalendarEvent.source);
            } else {
                i10 = 0;
            }
            int i57 = i56 + i10;
            if (oldVersionCalendarEvent.visibility != null) {
                i11 = Visibility.ADAPTER.encodedSizeWithTag(17, oldVersionCalendarEvent.visibility);
            } else {
                i11 = 0;
            }
            int i58 = i57 + i11;
            if (oldVersionCalendarEvent.importance != null) {
                i12 = ProtoAdapter.INT32.encodedSizeWithTag(18, oldVersionCalendarEvent.importance);
            } else {
                i12 = 0;
            }
            int i59 = i58 + i12;
            if (oldVersionCalendarEvent.dirty_type != null) {
                i13 = CalendarDirtyType.ADAPTER.encodedSizeWithTag(19, oldVersionCalendarEvent.dirty_type);
            } else {
                i13 = 0;
            }
            int i60 = i59 + i13;
            if (oldVersionCalendarEvent.version != null) {
                i14 = ProtoAdapter.INT32.encodedSizeWithTag(20, oldVersionCalendarEvent.version);
            } else {
                i14 = 0;
            }
            int i61 = i60 + i14;
            if (oldVersionCalendarEvent.need_update != null) {
                i15 = ProtoAdapter.BOOL.encodedSizeWithTag(21, oldVersionCalendarEvent.need_update);
            } else {
                i15 = 0;
            }
            int encodedSizeWithTag3 = i61 + i15 + ProtoAdapter.STRING.encodedSizeWithTag(22, oldVersionCalendarEvent.summary);
            if (oldVersionCalendarEvent.description != null) {
                i16 = ProtoAdapter.STRING.encodedSizeWithTag(23, oldVersionCalendarEvent.description);
            } else {
                i16 = 0;
            }
            int encodedSizeWithTag4 = encodedSizeWithTag3 + i16 + ProtoAdapter.BOOL.encodedSizeWithTag(24, oldVersionCalendarEvent.is_all_day) + ProtoAdapter.INT64.encodedSizeWithTag(25, oldVersionCalendarEvent.start_time) + ProtoAdapter.STRING.encodedSizeWithTag(26, oldVersionCalendarEvent.start_timezone) + ProtoAdapter.INT64.encodedSizeWithTag(27, oldVersionCalendarEvent.end_time) + ProtoAdapter.STRING.encodedSizeWithTag(28, oldVersionCalendarEvent.end_timezone);
            if (oldVersionCalendarEvent.status != null) {
                i17 = Status.ADAPTER.encodedSizeWithTag(29, oldVersionCalendarEvent.status);
            } else {
                i17 = 0;
            }
            int i62 = encodedSizeWithTag4 + i17;
            if (oldVersionCalendarEvent.rrule != null) {
                i18 = ProtoAdapter.STRING.encodedSizeWithTag(30, oldVersionCalendarEvent.rrule);
            } else {
                i18 = 0;
            }
            int i63 = i62 + i18;
            if (oldVersionCalendarEvent.guest_can_invite != null) {
                i19 = ProtoAdapter.BOOL.encodedSizeWithTag(31, oldVersionCalendarEvent.guest_can_invite);
            } else {
                i19 = 0;
            }
            int i64 = i63 + i19;
            if (oldVersionCalendarEvent.guest_can_see_other_guests != null) {
                i20 = ProtoAdapter.BOOL.encodedSizeWithTag(32, oldVersionCalendarEvent.guest_can_see_other_guests);
            } else {
                i20 = 0;
            }
            int i65 = i64 + i20;
            if (oldVersionCalendarEvent.guest_can_modify != null) {
                i21 = ProtoAdapter.BOOL.encodedSizeWithTag(33, oldVersionCalendarEvent.guest_can_modify);
            } else {
                i21 = 0;
            }
            int i66 = i65 + i21;
            if (oldVersionCalendarEvent.audio_url != null) {
                i22 = ProtoAdapter.STRING.encodedSizeWithTag(34, oldVersionCalendarEvent.audio_url);
            } else {
                i22 = 0;
            }
            int i67 = i66 + i22;
            if (oldVersionCalendarEvent.url != null) {
                i23 = ProtoAdapter.STRING.encodedSizeWithTag(35, oldVersionCalendarEvent.url);
            } else {
                i23 = 0;
            }
            int i68 = i67 + i23;
            if (oldVersionCalendarEvent.location != null) {
                i24 = CalendarLocation.ADAPTER.encodedSizeWithTag(36, oldVersionCalendarEvent.location);
            } else {
                i24 = 0;
            }
            int i69 = i68 + i24;
            if (oldVersionCalendarEvent.has_alarm != null) {
                i25 = ProtoAdapter.BOOL.encodedSizeWithTag(37, oldVersionCalendarEvent.has_alarm);
            } else {
                i25 = 0;
            }
            int i70 = i69 + i25;
            if (oldVersionCalendarEvent.has_attendee != null) {
                i26 = ProtoAdapter.BOOL.encodedSizeWithTag(38, oldVersionCalendarEvent.has_attendee);
            } else {
                i26 = 0;
            }
            int i71 = i70 + i26;
            if (oldVersionCalendarEvent.is_scheduled != null) {
                i27 = ProtoAdapter.BOOL.encodedSizeWithTag(39, oldVersionCalendarEvent.is_scheduled);
            } else {
                i27 = 0;
            }
            int i72 = i71 + i27;
            if (oldVersionCalendarEvent.creator != null) {
                i28 = OldVersionCalendarEventAttendee.ADAPTER.encodedSizeWithTag(40, oldVersionCalendarEvent.creator);
            } else {
                i28 = 0;
            }
            int i73 = i72 + i28;
            if (oldVersionCalendarEvent.organizer != null) {
                i29 = OldVersionCalendarEventAttendee.ADAPTER.encodedSizeWithTag(41, oldVersionCalendarEvent.organizer);
            } else {
                i29 = 0;
            }
            int encodedSizeWithTag5 = i73 + i29 + OldVersionCalendarEventAttendee.ADAPTER.asRepeated().encodedSizeWithTag(42, oldVersionCalendarEvent.attendees) + CalendarEventReminder.ADAPTER.asRepeated().encodedSizeWithTag(43, oldVersionCalendarEvent.reminders);
            if (oldVersionCalendarEvent.display_type != null) {
                i30 = DisplayType.ADAPTER.encodedSizeWithTag(44, oldVersionCalendarEvent.display_type);
            } else {
                i30 = 0;
            }
            int i74 = encodedSizeWithTag5 + i30;
            if (oldVersionCalendarEvent.event_color != null) {
                i31 = MappingColor.ADAPTER.encodedSizeWithTag(45, oldVersionCalendarEvent.event_color);
            } else {
                i31 = 0;
            }
            int i75 = i74 + i31;
            if (oldVersionCalendarEvent.cal_color != null) {
                i32 = MappingColor.ADAPTER.encodedSizeWithTag(46, oldVersionCalendarEvent.cal_color);
            } else {
                i32 = 0;
            }
            int i76 = i75 + i32;
            if (oldVersionCalendarEvent.conflict_type != null) {
                i33 = ConflictType.ADAPTER.encodedSizeWithTag(47, oldVersionCalendarEvent.conflict_type);
            } else {
                i33 = 0;
            }
            int i77 = i76 + i33;
            if (oldVersionCalendarEvent.type != null) {
                i34 = Type.ADAPTER.encodedSizeWithTag(48, oldVersionCalendarEvent.type);
            } else {
                i34 = 0;
            }
            int i78 = i77 + i34;
            if (oldVersionCalendarEvent.meeting_id != null) {
                i35 = ProtoAdapter.STRING.encodedSizeWithTag(49, oldVersionCalendarEvent.meeting_id);
            } else {
                i35 = 0;
            }
            int i79 = i78 + i35;
            if (oldVersionCalendarEvent.is_editable != null) {
                i36 = ProtoAdapter.BOOL.encodedSizeWithTag(50, oldVersionCalendarEvent.is_editable);
            } else {
                i36 = 0;
            }
            int i80 = i79 + i36;
            if (oldVersionCalendarEvent.is_deletable != null) {
                i37 = Deletable.ADAPTER.encodedSizeWithTag(51, oldVersionCalendarEvent.is_deletable);
            } else {
                i37 = 0;
            }
            int i81 = i80 + i37;
            if (oldVersionCalendarEvent.sharability != null) {
                i38 = Sharability.ADAPTER.encodedSizeWithTag(52, oldVersionCalendarEvent.sharability);
            } else {
                i38 = 0;
            }
            int i82 = i81 + i38;
            if (oldVersionCalendarEvent.docs_description != null) {
                i39 = ProtoAdapter.STRING.encodedSizeWithTag(53, oldVersionCalendarEvent.docs_description);
            } else {
                i39 = 0;
            }
            int i83 = i82 + i39;
            if (oldVersionCalendarEvent.successor_calendar_id != null) {
                i40 = ProtoAdapter.STRING.encodedSizeWithTag(54, oldVersionCalendarEvent.successor_calendar_id);
            } else {
                i40 = 0;
            }
            int i84 = i83 + i40;
            if (oldVersionCalendarEvent.successor != null) {
                i41 = OldVersionCalendarEventAttendee.ADAPTER.encodedSizeWithTag(55, oldVersionCalendarEvent.successor);
            } else {
                i41 = 0;
            }
            int i85 = i84 + i41;
            if (oldVersionCalendarEvent.notification_type != null) {
                i42 = NotificationType.ADAPTER.encodedSizeWithTag(56, oldVersionCalendarEvent.notification_type);
            } else {
                i42 = 0;
            }
            int i86 = i85 + i42;
            if (oldVersionCalendarEvent.is_cross_tenant != null) {
                i43 = ProtoAdapter.BOOL.encodedSizeWithTag(57, oldVersionCalendarEvent.is_cross_tenant);
            } else {
                i43 = 0;
            }
            int i87 = i86 + i43;
            if (oldVersionCalendarEvent.will_creator_attend != null) {
                i44 = ProtoAdapter.BOOL.encodedSizeWithTag(58, oldVersionCalendarEvent.will_creator_attend);
            } else {
                i44 = 0;
            }
            int i88 = i87 + i44;
            if (oldVersionCalendarEvent.will_organizer_attend != null) {
                i45 = ProtoAdapter.BOOL.encodedSizeWithTag(59, oldVersionCalendarEvent.will_organizer_attend);
            } else {
                i45 = 0;
            }
            int i89 = i88 + i45;
            if (oldVersionCalendarEvent.will_successor_attend != null) {
                i46 = ProtoAdapter.BOOL.encodedSizeWithTag(60, oldVersionCalendarEvent.will_successor_attend);
            } else {
                i46 = 0;
            }
            int i90 = i89 + i46;
            if (oldVersionCalendarEvent.video_meeting != null) {
                i47 = VideoMeeting.ADAPTER.encodedSizeWithTag(61, oldVersionCalendarEvent.video_meeting);
            } else {
                i47 = 0;
            }
            int i91 = i90 + i47;
            if (oldVersionCalendarEvent.meeting_minute_url != null) {
                i48 = ProtoAdapter.STRING.encodedSizeWithTag(62, oldVersionCalendarEvent.meeting_minute_url);
            }
            return i91 + i48 + oldVersionCalendarEvent.unknownFields().size();
        }

        /* renamed from: a */
        public OldVersionCalendarEvent decode(ProtoReader protoReader) throws IOException {
            C15886a aVar = new C15886a();
            aVar.f41779a = "";
            aVar.f41780b = "";
            aVar.f41781c = "";
            aVar.f41782d = "";
            aVar.f41783e = "";
            aVar.f41784f = OldVersionCalendarEventAttendee.Status.NEEDS_ACTION;
            aVar.f41785g = "";
            aVar.f41786h = 0L;
            aVar.f41787i = "";
            aVar.f41788j = false;
            aVar.f41789k = false;
            aVar.f41790l = 0L;
            aVar.f41791m = 0L;
            aVar.f41792n = 0L;
            aVar.f41793o = -1;
            aVar.f41794p = Source.UNKNOWN_SOURCE;
            aVar.f41795q = Visibility.DEFAULT;
            aVar.f41796r = 0;
            aVar.f41797s = CalendarDirtyType.NONE_DIRTY_TYPE;
            aVar.f41798t = 0;
            aVar.f41799u = false;
            aVar.f41800v = "";
            aVar.f41801w = "";
            aVar.f41802x = false;
            aVar.f41803y = 0L;
            aVar.f41804z = "";
            aVar.f41753A = 0L;
            aVar.f41754B = "";
            aVar.f41755C = Status.TENTATIVE;
            aVar.f41756D = "";
            aVar.f41757E = true;
            aVar.f41758F = true;
            aVar.f41759G = false;
            aVar.f41760H = "";
            aVar.f41761I = "";
            aVar.f41763K = false;
            aVar.f41764L = false;
            aVar.f41765M = false;
            aVar.f41770R = DisplayType.INVISIBLE;
            aVar.f41773U = ConflictType.NONE;
            aVar.f41774V = Type.DEFAULT_TYPE;
            aVar.f41775W = "";
            aVar.f41776X = false;
            aVar.f41777Y = Deletable.NOT;
            aVar.f41778Z = Sharability.FORBIDDEN_NOT_ACCESSIBLE;
            aVar.aa = "";
            aVar.ab = "";
            aVar.ad = NotificationType.DEFAULT_NOTIFICATION_TYPE;
            aVar.ae = false;
            aVar.af = false;
            aVar.ag = false;
            aVar.ah = false;
            aVar.aj = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f41779a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f41780b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f41781c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f41782d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f41783e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            try {
                                aVar.f41784f = OldVersionCalendarEventAttendee.Status.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 7:
                            aVar.f41785g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f41786h = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 9:
                            aVar.f41787i = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 10:
                            aVar.f41788j = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 11:
                            aVar.f41789k = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f41790l = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 13:
                            aVar.f41791m = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 14:
                            aVar.f41792n = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 15:
                            aVar.f41793o = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 16:
                            try {
                                aVar.f41794p = Source.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 17:
                            try {
                                aVar.f41795q = Visibility.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                break;
                            }
                        case 18:
                            aVar.f41796r = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 19:
                            try {
                                aVar.f41797s = CalendarDirtyType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e4.value));
                                break;
                            }
                        case 20:
                            aVar.f41798t = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 21:
                            aVar.f41799u = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 22:
                            aVar.f41800v = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 23:
                            aVar.f41801w = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 24:
                            aVar.f41802x = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case AvailableCode.ERROR_ON_ACTIVITY_RESULT /*{ENCODED_INT: 25}*/:
                            aVar.f41803y = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 26:
                            aVar.f41804z = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /*{ENCODED_INT: 27}*/:
                            aVar.f41753A = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case IVideoEventLogger.LOGGER_OPTION_ENABLE_SR /*{ENCODED_INT: 28}*/:
                            aVar.f41754B = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 29:
                            try {
                                aVar.f41755C = Status.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e5.value));
                                break;
                            }
                        case 30:
                            aVar.f41756D = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case TTVideoEngine.PLAYER_OPTION_ENABLE_PLAYER3_HARDWARE_DECODE /*{ENCODED_INT: 31}*/:
                            aVar.f41757E = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 32:
                            aVar.f41758F = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 33:
                            aVar.f41759G = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 34:
                            aVar.f41760H = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 35:
                            aVar.f41761I = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 36:
                            aVar.f41762J = CalendarLocation.ADAPTER.decode(protoReader);
                            break;
                        case 37:
                            aVar.f41763K = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 38:
                            aVar.f41764L = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 39:
                            aVar.f41765M = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 40:
                            aVar.f41766N = OldVersionCalendarEventAttendee.ADAPTER.decode(protoReader);
                            break;
                        case 41:
                            aVar.f41767O = OldVersionCalendarEventAttendee.ADAPTER.decode(protoReader);
                            break;
                        case 42:
                            aVar.f41768P.add(OldVersionCalendarEventAttendee.ADAPTER.decode(protoReader));
                            break;
                        case 43:
                            aVar.f41769Q.add(CalendarEventReminder.ADAPTER.decode(protoReader));
                            break;
                        case 44:
                            try {
                                aVar.f41770R = DisplayType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e6) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e6.value));
                                break;
                            }
                        case 45:
                            aVar.f41771S = MappingColor.ADAPTER.decode(protoReader);
                            break;
                        case 46:
                            aVar.f41772T = MappingColor.ADAPTER.decode(protoReader);
                            break;
                        case 47:
                            try {
                                aVar.f41773U = ConflictType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e7) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e7.value));
                                break;
                            }
                        case 48:
                            try {
                                aVar.f41774V = Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e8) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e8.value));
                                break;
                            }
                        case 49:
                            aVar.f41775W = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case MmListControl.f116813f /*{ENCODED_INT: 50}*/:
                            aVar.f41776X = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 51:
                            try {
                                aVar.f41777Y = Deletable.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e9) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e9.value));
                                break;
                            }
                        case 52:
                            try {
                                aVar.f41778Z = Sharability.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e10) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e10.value));
                                break;
                            }
                        case 53:
                            aVar.aa = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 54:
                            aVar.ab = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 55:
                            aVar.ac = OldVersionCalendarEventAttendee.ADAPTER.decode(protoReader);
                            break;
                        case 56:
                            try {
                                aVar.ad = NotificationType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e11.value));
                                break;
                            }
                        case 57:
                            aVar.ae = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 58:
                            aVar.af = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 59:
                            aVar.ag = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 60:
                            aVar.ah = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 61:
                            aVar.f175432ai = VideoMeeting.ADAPTER.decode(protoReader);
                            break;
                        case 62:
                            aVar.aj = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.OldVersionCalendarEvent$a */
    public static final class C15886a extends Message.Builder<OldVersionCalendarEvent, C15886a> {

        /* renamed from: A */
        public Long f41753A;

        /* renamed from: B */
        public String f41754B;

        /* renamed from: C */
        public Status f41755C;

        /* renamed from: D */
        public String f41756D;

        /* renamed from: E */
        public Boolean f41757E;

        /* renamed from: F */
        public Boolean f41758F;

        /* renamed from: G */
        public Boolean f41759G;

        /* renamed from: H */
        public String f41760H;

        /* renamed from: I */
        public String f41761I;

        /* renamed from: J */
        public CalendarLocation f41762J;

        /* renamed from: K */
        public Boolean f41763K;

        /* renamed from: L */
        public Boolean f41764L;

        /* renamed from: M */
        public Boolean f41765M;

        /* renamed from: N */
        public OldVersionCalendarEventAttendee f41766N;

        /* renamed from: O */
        public OldVersionCalendarEventAttendee f41767O;

        /* renamed from: P */
        public List<OldVersionCalendarEventAttendee> f41768P = Internal.newMutableList();

        /* renamed from: Q */
        public List<CalendarEventReminder> f41769Q = Internal.newMutableList();

        /* renamed from: R */
        public DisplayType f41770R;

        /* renamed from: S */
        public MappingColor f41771S;

        /* renamed from: T */
        public MappingColor f41772T;

        /* renamed from: U */
        public ConflictType f41773U;

        /* renamed from: V */
        public Type f41774V;

        /* renamed from: W */
        public String f41775W;

        /* renamed from: X */
        public Boolean f41776X;

        /* renamed from: Y */
        public Deletable f41777Y;

        /* renamed from: Z */
        public Sharability f41778Z;

        /* renamed from: a */
        public String f41779a;
        public String aa;
        public String ab;
        public OldVersionCalendarEventAttendee ac;
        public NotificationType ad;
        public Boolean ae;
        public Boolean af;
        public Boolean ag;
        public Boolean ah;

        /* renamed from: ai  reason: collision with root package name */
        public VideoMeeting f175432ai;
        public String aj;

        /* renamed from: b */
        public String f41780b;

        /* renamed from: c */
        public String f41781c;

        /* renamed from: d */
        public String f41782d;

        /* renamed from: e */
        public String f41783e;

        /* renamed from: f */
        public OldVersionCalendarEventAttendee.Status f41784f;

        /* renamed from: g */
        public String f41785g;

        /* renamed from: h */
        public Long f41786h;

        /* renamed from: i */
        public String f41787i;

        /* renamed from: j */
        public Boolean f41788j;

        /* renamed from: k */
        public Boolean f41789k;

        /* renamed from: l */
        public Long f41790l;

        /* renamed from: m */
        public Long f41791m;

        /* renamed from: n */
        public Long f41792n;

        /* renamed from: o */
        public Integer f41793o;

        /* renamed from: p */
        public Source f41794p;

        /* renamed from: q */
        public Visibility f41795q;

        /* renamed from: r */
        public Integer f41796r;

        /* renamed from: s */
        public CalendarDirtyType f41797s;

        /* renamed from: t */
        public Integer f41798t;

        /* renamed from: u */
        public Boolean f41799u;

        /* renamed from: v */
        public String f41800v;

        /* renamed from: w */
        public String f41801w;

        /* renamed from: x */
        public Boolean f41802x;

        /* renamed from: y */
        public Long f41803y;

        /* renamed from: z */
        public String f41804z;

        /* renamed from: a */
        public OldVersionCalendarEvent build() {
            String str;
            String str2;
            String str3;
            String str4;
            Long l;
            String str5;
            Boolean bool;
            Long l2;
            String str6;
            Long l3;
            String str7;
            String str8 = this.f41779a;
            if (str8 != null && (str = this.f41780b) != null && (str2 = this.f41781c) != null && (str3 = this.f41782d) != null && (str4 = this.f41785g) != null && (l = this.f41786h) != null && (str5 = this.f41800v) != null && (bool = this.f41802x) != null && (l2 = this.f41803y) != null && (str6 = this.f41804z) != null && (l3 = this.f41753A) != null && (str7 = this.f41754B) != null) {
                return new OldVersionCalendarEvent(str8, str, str2, str3, this.f41783e, this.f41784f, str4, l, this.f41787i, this.f41788j, this.f41789k, this.f41790l, this.f41791m, this.f41792n, this.f41793o, this.f41794p, this.f41795q, this.f41796r, this.f41797s, this.f41798t, this.f41799u, str5, this.f41801w, bool, l2, str6, l3, str7, this.f41755C, this.f41756D, this.f41757E, this.f41758F, this.f41759G, this.f41760H, this.f41761I, this.f41762J, this.f41763K, this.f41764L, this.f41765M, this.f41766N, this.f41767O, this.f41768P, this.f41769Q, this.f41770R, this.f41771S, this.f41772T, this.f41773U, this.f41774V, this.f41775W, this.f41776X, this.f41777Y, this.f41778Z, this.aa, this.ab, this.ac, this.ad, this.ae, this.af, this.ag, this.ah, this.f175432ai, this.aj, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str8, "id", this.f41780b, "creator_calendar_id", this.f41781c, "calendar_id", this.f41782d, "organizer_calendar_id", this.f41785g, "key", this.f41786h, "original_time", this.f41800v, "summary", this.f41802x, "is_all_day", this.f41803y, "start_time", this.f41804z, "start_timezone", this.f41753A, "end_time", this.f41754B, "end_timezone");
        }
    }

    @Override // com.squareup.wire.Message
    public C15886a newBuilder() {
        C15886a aVar = new C15886a();
        aVar.f41779a = this.id;
        aVar.f41780b = this.creator_calendar_id;
        aVar.f41781c = this.calendar_id;
        aVar.f41782d = this.organizer_calendar_id;
        aVar.f41783e = this.server_id;
        aVar.f41784f = this.self_attendee_status;
        aVar.f41785g = this.key;
        aVar.f41786h = this.original_time;
        aVar.f41787i = this.original_event_key;
        aVar.f41788j = this.original_is_all_day;
        aVar.f41789k = this.is_free;
        aVar.f41790l = this.last_date;
        aVar.f41791m = this.create_time;
        aVar.f41792n = this.update_time;
        aVar.f41793o = this.color;
        aVar.f41794p = this.source;
        aVar.f41795q = this.visibility;
        aVar.f41796r = this.importance;
        aVar.f41797s = this.dirty_type;
        aVar.f41798t = this.version;
        aVar.f41799u = this.need_update;
        aVar.f41800v = this.summary;
        aVar.f41801w = this.description;
        aVar.f41802x = this.is_all_day;
        aVar.f41803y = this.start_time;
        aVar.f41804z = this.start_timezone;
        aVar.f41753A = this.end_time;
        aVar.f41754B = this.end_timezone;
        aVar.f41755C = this.status;
        aVar.f41756D = this.rrule;
        aVar.f41757E = this.guest_can_invite;
        aVar.f41758F = this.guest_can_see_other_guests;
        aVar.f41759G = this.guest_can_modify;
        aVar.f41760H = this.audio_url;
        aVar.f41761I = this.url;
        aVar.f41762J = this.location;
        aVar.f41763K = this.has_alarm;
        aVar.f41764L = this.has_attendee;
        aVar.f41765M = this.is_scheduled;
        aVar.f41766N = this.creator;
        aVar.f41767O = this.organizer;
        aVar.f41768P = Internal.copyOf("attendees", this.attendees);
        aVar.f41769Q = Internal.copyOf("reminders", this.reminders);
        aVar.f41770R = this.display_type;
        aVar.f41771S = this.event_color;
        aVar.f41772T = this.cal_color;
        aVar.f41773U = this.conflict_type;
        aVar.f41774V = this.type;
        aVar.f41775W = this.meeting_id;
        aVar.f41776X = this.is_editable;
        aVar.f41777Y = this.is_deletable;
        aVar.f41778Z = this.sharability;
        aVar.aa = this.docs_description;
        aVar.ab = this.successor_calendar_id;
        aVar.ac = this.successor;
        aVar.ad = this.notification_type;
        aVar.ae = this.is_cross_tenant;
        aVar.af = this.will_creator_attend;
        aVar.ag = this.will_organizer_attend;
        aVar.ah = this.will_successor_attend;
        aVar.f175432ai = this.video_meeting;
        aVar.aj = this.meeting_minute_url;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "OldVersionCalendarEvent");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", creator_calendar_id=");
        sb.append(this.creator_calendar_id);
        sb.append(", calendar_id=");
        sb.append(this.calendar_id);
        sb.append(", organizer_calendar_id=");
        sb.append(this.organizer_calendar_id);
        if (this.server_id != null) {
            sb.append(", server_id=");
            sb.append(this.server_id);
        }
        if (this.self_attendee_status != null) {
            sb.append(", self_attendee_status=");
            sb.append(this.self_attendee_status);
        }
        sb.append(", key=");
        sb.append(this.key);
        sb.append(", original_time=");
        sb.append(this.original_time);
        if (this.original_event_key != null) {
            sb.append(", original_event_key=");
            sb.append(this.original_event_key);
        }
        if (this.original_is_all_day != null) {
            sb.append(", original_is_all_day=");
            sb.append(this.original_is_all_day);
        }
        if (this.is_free != null) {
            sb.append(", is_free=");
            sb.append(this.is_free);
        }
        if (this.last_date != null) {
            sb.append(", last_date=");
            sb.append(this.last_date);
        }
        if (this.create_time != null) {
            sb.append(", create_time=");
            sb.append(this.create_time);
        }
        if (this.update_time != null) {
            sb.append(", update_time=");
            sb.append(this.update_time);
        }
        if (this.color != null) {
            sb.append(", color=");
            sb.append(this.color);
        }
        if (this.source != null) {
            sb.append(", source=");
            sb.append(this.source);
        }
        if (this.visibility != null) {
            sb.append(", visibility=");
            sb.append(this.visibility);
        }
        if (this.importance != null) {
            sb.append(", importance=");
            sb.append(this.importance);
        }
        if (this.dirty_type != null) {
            sb.append(", dirty_type=");
            sb.append(this.dirty_type);
        }
        if (this.version != null) {
            sb.append(", version=");
            sb.append(this.version);
        }
        if (this.need_update != null) {
            sb.append(", need_update=");
            sb.append(this.need_update);
        }
        sb.append(", summary=");
        sb.append(this.summary);
        if (this.description != null) {
            sb.append(", description=");
            sb.append(this.description);
        }
        sb.append(", is_all_day=");
        sb.append(this.is_all_day);
        sb.append(", start_time=");
        sb.append(this.start_time);
        sb.append(", start_timezone=");
        sb.append(this.start_timezone);
        sb.append(", end_time=");
        sb.append(this.end_time);
        sb.append(", end_timezone=");
        sb.append(this.end_timezone);
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.rrule != null) {
            sb.append(", rrule=");
            sb.append(this.rrule);
        }
        if (this.guest_can_invite != null) {
            sb.append(", guest_can_invite=");
            sb.append(this.guest_can_invite);
        }
        if (this.guest_can_see_other_guests != null) {
            sb.append(", guest_can_see_other_guests=");
            sb.append(this.guest_can_see_other_guests);
        }
        if (this.guest_can_modify != null) {
            sb.append(", guest_can_modify=");
            sb.append(this.guest_can_modify);
        }
        if (this.audio_url != null) {
            sb.append(", audio_url=");
            sb.append(this.audio_url);
        }
        if (this.url != null) {
            sb.append(", url=");
            sb.append(this.url);
        }
        if (this.location != null) {
            sb.append(", location=");
            sb.append(this.location);
        }
        if (this.has_alarm != null) {
            sb.append(", has_alarm=");
            sb.append(this.has_alarm);
        }
        if (this.has_attendee != null) {
            sb.append(", has_attendee=");
            sb.append(this.has_attendee);
        }
        if (this.is_scheduled != null) {
            sb.append(", is_scheduled=");
            sb.append(this.is_scheduled);
        }
        if (this.creator != null) {
            sb.append(", creator=");
            sb.append(this.creator);
        }
        if (this.organizer != null) {
            sb.append(", organizer=");
            sb.append(this.organizer);
        }
        if (!this.attendees.isEmpty()) {
            sb.append(", attendees=");
            sb.append(this.attendees);
        }
        if (!this.reminders.isEmpty()) {
            sb.append(", reminders=");
            sb.append(this.reminders);
        }
        if (this.display_type != null) {
            sb.append(", display_type=");
            sb.append(this.display_type);
        }
        if (this.event_color != null) {
            sb.append(", event_color=");
            sb.append(this.event_color);
        }
        if (this.cal_color != null) {
            sb.append(", cal_color=");
            sb.append(this.cal_color);
        }
        if (this.conflict_type != null) {
            sb.append(", conflict_type=");
            sb.append(this.conflict_type);
        }
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.meeting_id != null) {
            sb.append(", meeting_id=");
            sb.append(this.meeting_id);
        }
        if (this.is_editable != null) {
            sb.append(", is_editable=");
            sb.append(this.is_editable);
        }
        if (this.is_deletable != null) {
            sb.append(", is_deletable=");
            sb.append(this.is_deletable);
        }
        if (this.sharability != null) {
            sb.append(", sharability=");
            sb.append(this.sharability);
        }
        if (this.docs_description != null) {
            sb.append(", docs_description=");
            sb.append(this.docs_description);
        }
        if (this.successor_calendar_id != null) {
            sb.append(", successor_calendar_id=");
            sb.append(this.successor_calendar_id);
        }
        if (this.successor != null) {
            sb.append(", successor=");
            sb.append(this.successor);
        }
        if (this.notification_type != null) {
            sb.append(", notification_type=");
            sb.append(this.notification_type);
        }
        if (this.is_cross_tenant != null) {
            sb.append(", is_cross_tenant=");
            sb.append(this.is_cross_tenant);
        }
        if (this.will_creator_attend != null) {
            sb.append(", will_creator_attend=");
            sb.append(this.will_creator_attend);
        }
        if (this.will_organizer_attend != null) {
            sb.append(", will_organizer_attend=");
            sb.append(this.will_organizer_attend);
        }
        if (this.will_successor_attend != null) {
            sb.append(", will_successor_attend=");
            sb.append(this.will_successor_attend);
        }
        if (this.video_meeting != null) {
            sb.append(", video_meeting=");
            sb.append(this.video_meeting);
        }
        if (this.meeting_minute_url != null) {
            sb.append(", meeting_minute_url=");
            sb.append(this.meeting_minute_url);
        }
        StringBuilder replace = sb.replace(0, 2, "OldVersionCalendarEvent{");
        replace.append('}');
        return replace.toString();
    }

    public OldVersionCalendarEvent(String str, String str2, String str3, String str4, String str5, OldVersionCalendarEventAttendee.Status status2, String str6, Long l, String str7, Boolean bool, Boolean bool2, Long l2, Long l3, Long l4, Integer num, Source source2, Visibility visibility2, Integer num2, CalendarDirtyType calendarDirtyType, Integer num3, Boolean bool3, String str8, String str9, Boolean bool4, Long l5, String str10, Long l6, String str11, Status status3, String str12, Boolean bool5, Boolean bool6, Boolean bool7, String str13, String str14, CalendarLocation calendarLocation, Boolean bool8, Boolean bool9, Boolean bool10, OldVersionCalendarEventAttendee oldVersionCalendarEventAttendee, OldVersionCalendarEventAttendee oldVersionCalendarEventAttendee2, List<OldVersionCalendarEventAttendee> list, List<CalendarEventReminder> list2, DisplayType displayType, MappingColor mappingColor, MappingColor mappingColor2, ConflictType conflictType, Type type2, String str15, Boolean bool11, Deletable deletable, Sharability sharability2, String str16, String str17, OldVersionCalendarEventAttendee oldVersionCalendarEventAttendee3, NotificationType notificationType, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, VideoMeeting videoMeeting, String str18) {
        this(str, str2, str3, str4, str5, status2, str6, l, str7, bool, bool2, l2, l3, l4, num, source2, visibility2, num2, calendarDirtyType, num3, bool3, str8, str9, bool4, l5, str10, l6, str11, status3, str12, bool5, bool6, bool7, str13, str14, calendarLocation, bool8, bool9, bool10, oldVersionCalendarEventAttendee, oldVersionCalendarEventAttendee2, list, list2, displayType, mappingColor, mappingColor2, conflictType, type2, str15, bool11, deletable, sharability2, str16, str17, oldVersionCalendarEventAttendee3, notificationType, bool12, bool13, bool14, bool15, videoMeeting, str18, ByteString.EMPTY);
    }

    public OldVersionCalendarEvent(String str, String str2, String str3, String str4, String str5, OldVersionCalendarEventAttendee.Status status2, String str6, Long l, String str7, Boolean bool, Boolean bool2, Long l2, Long l3, Long l4, Integer num, Source source2, Visibility visibility2, Integer num2, CalendarDirtyType calendarDirtyType, Integer num3, Boolean bool3, String str8, String str9, Boolean bool4, Long l5, String str10, Long l6, String str11, Status status3, String str12, Boolean bool5, Boolean bool6, Boolean bool7, String str13, String str14, CalendarLocation calendarLocation, Boolean bool8, Boolean bool9, Boolean bool10, OldVersionCalendarEventAttendee oldVersionCalendarEventAttendee, OldVersionCalendarEventAttendee oldVersionCalendarEventAttendee2, List<OldVersionCalendarEventAttendee> list, List<CalendarEventReminder> list2, DisplayType displayType, MappingColor mappingColor, MappingColor mappingColor2, ConflictType conflictType, Type type2, String str15, Boolean bool11, Deletable deletable, Sharability sharability2, String str16, String str17, OldVersionCalendarEventAttendee oldVersionCalendarEventAttendee3, NotificationType notificationType, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, VideoMeeting videoMeeting, String str18, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.creator_calendar_id = str2;
        this.calendar_id = str3;
        this.organizer_calendar_id = str4;
        this.server_id = str5;
        this.self_attendee_status = status2;
        this.key = str6;
        this.original_time = l;
        this.original_event_key = str7;
        this.original_is_all_day = bool;
        this.is_free = bool2;
        this.last_date = l2;
        this.create_time = l3;
        this.update_time = l4;
        this.color = num;
        this.source = source2;
        this.visibility = visibility2;
        this.importance = num2;
        this.dirty_type = calendarDirtyType;
        this.version = num3;
        this.need_update = bool3;
        this.summary = str8;
        this.description = str9;
        this.is_all_day = bool4;
        this.start_time = l5;
        this.start_timezone = str10;
        this.end_time = l6;
        this.end_timezone = str11;
        this.status = status3;
        this.rrule = str12;
        this.guest_can_invite = bool5;
        this.guest_can_see_other_guests = bool6;
        this.guest_can_modify = bool7;
        this.audio_url = str13;
        this.url = str14;
        this.location = calendarLocation;
        this.has_alarm = bool8;
        this.has_attendee = bool9;
        this.is_scheduled = bool10;
        this.creator = oldVersionCalendarEventAttendee;
        this.organizer = oldVersionCalendarEventAttendee2;
        this.attendees = Internal.immutableCopyOf("attendees", list);
        this.reminders = Internal.immutableCopyOf("reminders", list2);
        this.display_type = displayType;
        this.event_color = mappingColor;
        this.cal_color = mappingColor2;
        this.conflict_type = conflictType;
        this.type = type2;
        this.meeting_id = str15;
        this.is_editable = bool11;
        this.is_deletable = deletable;
        this.sharability = sharability2;
        this.docs_description = str16;
        this.successor_calendar_id = str17;
        this.successor = oldVersionCalendarEventAttendee3;
        this.notification_type = notificationType;
        this.is_cross_tenant = bool12;
        this.will_creator_attend = bool13;
        this.will_organizer_attend = bool14;
        this.will_successor_attend = bool15;
        this.video_meeting = videoMeeting;
        this.meeting_minute_url = str18;
    }
}
