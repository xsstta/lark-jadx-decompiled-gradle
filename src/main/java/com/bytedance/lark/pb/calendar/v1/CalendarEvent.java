package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.calendar.v1.CalendarEventAttendee;
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

public final class CalendarEvent extends Message<CalendarEvent, C15516a> {
    public static final ProtoAdapter<CalendarEvent> ADAPTER = new C15517b();
    public static final Integer DEFAULT_ATTENDEE_SOURCE = 1;
    public static final Category DEFAULT_CATEGORY = Category.DEFAULT_CATEGORY;
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
    public static final CalendarEventAttendee.Status DEFAULT_SELF_ATTENDEE_STATUS = CalendarEventAttendee.Status.NEEDS_ACTION;
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
    public final List<CalendarEventAttachment> attachments;
    public final EventAttendeeInfo attendee_info;
    public final Integer attendee_source;
    public final List<CalendarEventAttendee> attendees;
    public final String audio_url;
    public final MappingColor cal_color;
    public final CalendarEventDisplayInfo calendar_event_display_info;
    public final String calendar_id;
    public final Category category;
    public final Integer color;
    public final ConflictType conflict_type;
    public final Long create_time;
    public final CalendarEventAttendee creator;
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
    public final CalendarEventAttendee organizer;
    public final String organizer_calendar_id;
    public final String original_event_key;
    public final Boolean original_is_all_day;
    public final Long original_time;
    public final List<CalendarEventReminder> reminders;
    public final String rrule;
    public final CalendarSchemaCollection schema;
    public final CalendarEventAttendee.Status self_attendee_status;
    public final String server_id;
    public final Sharability sharability;
    public final Source source;
    public final Long start_time;
    public final String start_timezone;
    public final Status status;
    public final CalendarEventAttendee successor;
    public final String successor_calendar_id;
    public final String summary;
    public final Type type;
    public final Long update_time;
    public final String url;
    public final EventInviteOperator user_invite_operator;
    public final String user_invite_operator_id;
    public final Integer version;
    public final String version64;
    public final VideoMeeting video_meeting;
    public final Visibility visibility;
    public final Boolean will_creator_attend;
    public final Boolean will_organizer_attend;
    public final Boolean will_successor_attend;

    public enum Category implements WireEnum {
        DEFAULT_CATEGORY(1),
        SAME_PAGE_MEETING(2),
        RESOURCE_STRATEGY(3),
        RESOURCE_REQUISITION(4);
        
        public static final ProtoAdapter<Category> ADAPTER = ProtoAdapter.newEnumAdapter(Category.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Category fromValue(int i) {
            if (i == 1) {
                return DEFAULT_CATEGORY;
            }
            if (i == 2) {
                return SAME_PAGE_MEETING;
            }
            if (i == 3) {
                return RESOURCE_STRATEGY;
            }
            if (i != 4) {
                return null;
            }
            return RESOURCE_REQUISITION;
        }

        private Category(int i) {
            this.value = i;
        }
    }

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
        PEOPLE(8),
        PLACE_HOLDER(9),
        OPEN_API(10),
        CALDAV(11),
        TIMEOFF(12),
        EMAIL(13),
        EXCHANGE(14);
        
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
                case 9:
                    return PLACE_HOLDER;
                case 10:
                    return OPEN_API;
                case 11:
                    return CALDAV;
                case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                    return TIMEOFF;
                case 13:
                    return EMAIL;
                case 14:
                    return EXCHANGE;
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

    public CalendarEvent(String str, String str2, String str3, String str4, String str5, CalendarEventAttendee.Status status2, String str6, Long l, String str7, Boolean bool, Boolean bool2, Long l2, Long l3, Long l4, Integer num, Source source2, Visibility visibility2, Integer num2, CalendarDirtyType calendarDirtyType, Integer num3, Boolean bool3, String str8, String str9, Boolean bool4, Long l5, String str10, Long l6, String str11, Status status3, String str12, Boolean bool5, Boolean bool6, Boolean bool7, String str13, String str14, CalendarLocation calendarLocation, Boolean bool8, Boolean bool9, Boolean bool10, CalendarEventAttendee calendarEventAttendee, CalendarEventAttendee calendarEventAttendee2, List<CalendarEventAttendee> list, List<CalendarEventReminder> list2, DisplayType displayType, MappingColor mappingColor, MappingColor mappingColor2, ConflictType conflictType, Type type2, String str15, Boolean bool11, Deletable deletable, Sharability sharability2, String str16, String str17, CalendarEventAttendee calendarEventAttendee3, NotificationType notificationType, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, VideoMeeting videoMeeting, String str18, String str19, CalendarEventDisplayInfo calendarEventDisplayInfo, List<CalendarEventAttachment> list3, EventInviteOperator eventInviteOperator, Integer num4, CalendarSchemaCollection calendarSchemaCollection, String str20, Category category2, EventAttendeeInfo eventAttendeeInfo) {
        this(str, str2, str3, str4, str5, status2, str6, l, str7, bool, bool2, l2, l3, l4, num, source2, visibility2, num2, calendarDirtyType, num3, bool3, str8, str9, bool4, l5, str10, l6, str11, status3, str12, bool5, bool6, bool7, str13, str14, calendarLocation, bool8, bool9, bool10, calendarEventAttendee, calendarEventAttendee2, list, list2, displayType, mappingColor, mappingColor2, conflictType, type2, str15, bool11, deletable, sharability2, str16, str17, calendarEventAttendee3, notificationType, bool12, bool13, bool14, bool15, videoMeeting, str18, str19, calendarEventDisplayInfo, list3, eventInviteOperator, num4, calendarSchemaCollection, str20, category2, eventAttendeeInfo, ByteString.EMPTY);
    }

    public CalendarEvent(String str, String str2, String str3, String str4, String str5, CalendarEventAttendee.Status status2, String str6, Long l, String str7, Boolean bool, Boolean bool2, Long l2, Long l3, Long l4, Integer num, Source source2, Visibility visibility2, Integer num2, CalendarDirtyType calendarDirtyType, Integer num3, Boolean bool3, String str8, String str9, Boolean bool4, Long l5, String str10, Long l6, String str11, Status status3, String str12, Boolean bool5, Boolean bool6, Boolean bool7, String str13, String str14, CalendarLocation calendarLocation, Boolean bool8, Boolean bool9, Boolean bool10, CalendarEventAttendee calendarEventAttendee, CalendarEventAttendee calendarEventAttendee2, List<CalendarEventAttendee> list, List<CalendarEventReminder> list2, DisplayType displayType, MappingColor mappingColor, MappingColor mappingColor2, ConflictType conflictType, Type type2, String str15, Boolean bool11, Deletable deletable, Sharability sharability2, String str16, String str17, CalendarEventAttendee calendarEventAttendee3, NotificationType notificationType, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, VideoMeeting videoMeeting, String str18, String str19, CalendarEventDisplayInfo calendarEventDisplayInfo, List<CalendarEventAttachment> list3, EventInviteOperator eventInviteOperator, Integer num4, CalendarSchemaCollection calendarSchemaCollection, String str20, Category category2, EventAttendeeInfo eventAttendeeInfo, ByteString byteString) {
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
        this.creator = calendarEventAttendee;
        this.organizer = calendarEventAttendee2;
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
        this.successor = calendarEventAttendee3;
        this.notification_type = notificationType;
        this.is_cross_tenant = bool12;
        this.will_creator_attend = bool13;
        this.will_organizer_attend = bool14;
        this.will_successor_attend = bool15;
        this.video_meeting = videoMeeting;
        this.meeting_minute_url = str18;
        this.user_invite_operator_id = str19;
        this.calendar_event_display_info = calendarEventDisplayInfo;
        this.attachments = Internal.immutableCopyOf("attachments", list3);
        this.user_invite_operator = eventInviteOperator;
        this.attendee_source = num4;
        this.schema = calendarSchemaCollection;
        this.version64 = str20;
        this.category = category2;
        this.attendee_info = eventAttendeeInfo;
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.CalendarEvent$a */
    public static final class C15516a extends Message.Builder<CalendarEvent, C15516a> {

        /* renamed from: A */
        public Long f41039A;

        /* renamed from: B */
        public String f41040B;

        /* renamed from: C */
        public Status f41041C;

        /* renamed from: D */
        public String f41042D;

        /* renamed from: E */
        public Boolean f41043E;

        /* renamed from: F */
        public Boolean f41044F;

        /* renamed from: G */
        public Boolean f41045G;

        /* renamed from: H */
        public String f41046H;

        /* renamed from: I */
        public String f41047I;

        /* renamed from: J */
        public CalendarLocation f41048J;

        /* renamed from: K */
        public Boolean f41049K;

        /* renamed from: L */
        public Boolean f41050L;

        /* renamed from: M */
        public Boolean f41051M;

        /* renamed from: N */
        public CalendarEventAttendee f41052N;

        /* renamed from: O */
        public CalendarEventAttendee f41053O;

        /* renamed from: P */
        public List<CalendarEventAttendee> f41054P = Internal.newMutableList();

        /* renamed from: Q */
        public List<CalendarEventReminder> f41055Q = Internal.newMutableList();

        /* renamed from: R */
        public DisplayType f41056R;

        /* renamed from: S */
        public MappingColor f41057S;

        /* renamed from: T */
        public MappingColor f41058T;

        /* renamed from: U */
        public ConflictType f41059U;

        /* renamed from: V */
        public Type f41060V;

        /* renamed from: W */
        public String f41061W;

        /* renamed from: X */
        public Boolean f41062X;

        /* renamed from: Y */
        public Deletable f41063Y;

        /* renamed from: Z */
        public Sharability f41064Z;

        /* renamed from: a */
        public String f41065a;
        public String aa;
        public String ab;
        public CalendarEventAttendee ac;
        public NotificationType ad;
        public Boolean ae;
        public Boolean af;
        public Boolean ag;
        public Boolean ah;

        /* renamed from: ai  reason: collision with root package name */
        public VideoMeeting f175431ai;
        public String aj;
        public String ak;
        public CalendarEventDisplayInfo al;
        public List<CalendarEventAttachment> am = Internal.newMutableList();
        public EventInviteOperator an;
        public Integer ao;
        public CalendarSchemaCollection ap;
        public String aq;
        public Category ar;
        public EventAttendeeInfo as;

        /* renamed from: b */
        public String f41066b;

        /* renamed from: c */
        public String f41067c;

        /* renamed from: d */
        public String f41068d;

        /* renamed from: e */
        public String f41069e;

        /* renamed from: f */
        public CalendarEventAttendee.Status f41070f;

        /* renamed from: g */
        public String f41071g;

        /* renamed from: h */
        public Long f41072h;

        /* renamed from: i */
        public String f41073i;

        /* renamed from: j */
        public Boolean f41074j;

        /* renamed from: k */
        public Boolean f41075k;

        /* renamed from: l */
        public Long f41076l;

        /* renamed from: m */
        public Long f41077m;

        /* renamed from: n */
        public Long f41078n;

        /* renamed from: o */
        public Integer f41079o;

        /* renamed from: p */
        public Source f41080p;

        /* renamed from: q */
        public Visibility f41081q;

        /* renamed from: r */
        public Integer f41082r;

        /* renamed from: s */
        public CalendarDirtyType f41083s;

        /* renamed from: t */
        public Integer f41084t;

        /* renamed from: u */
        public Boolean f41085u;

        /* renamed from: v */
        public String f41086v;

        /* renamed from: w */
        public String f41087w;

        /* renamed from: x */
        public Boolean f41088x;

        /* renamed from: y */
        public Long f41089y;

        /* renamed from: z */
        public String f41090z;

        /* renamed from: a */
        public C15516a mo56206a(String str) {
            this.f41065a = str;
            return this;
        }

        /* renamed from: a */
        public C15516a mo56194a(CalendarEventAttendee.Status status) {
            this.f41070f = status;
            return this;
        }

        /* renamed from: a */
        public C15516a mo56205a(Long l) {
            this.f41072h = l;
            return this;
        }

        /* renamed from: a */
        public C15516a mo56203a(Boolean bool) {
            this.f41074j = bool;
            return this;
        }

        /* renamed from: a */
        public C15516a mo56204a(Integer num) {
            this.f41079o = num;
            return this;
        }

        /* renamed from: a */
        public C15516a mo56197a(CalendarLocation calendarLocation) {
            this.f41048J = calendarLocation;
            return this;
        }

        /* renamed from: a */
        public C15516a mo56195a(CalendarEventAttendee calendarEventAttendee) {
            this.f41052N = calendarEventAttendee;
            return this;
        }

        /* renamed from: a */
        public C15516a mo56207a(List<CalendarEventAttendee> list) {
            Internal.checkElementsNotNull(list);
            this.f41054P = list;
            return this;
        }

        /* renamed from: a */
        public C15516a mo56201a(MappingColor mappingColor) {
            this.f41057S = mappingColor;
            return this;
        }

        /* renamed from: a */
        public C15516a mo56198a(ConflictType conflictType) {
            this.f41059U = conflictType;
            return this;
        }

        /* renamed from: a */
        public C15516a mo56202a(VideoMeeting videoMeeting) {
            this.f175431ai = videoMeeting;
            return this;
        }

        /* renamed from: a */
        public C15516a mo56196a(CalendarEventDisplayInfo calendarEventDisplayInfo) {
            this.al = calendarEventDisplayInfo;
            return this;
        }

        /* renamed from: a */
        public C15516a mo56200a(EventInviteOperator eventInviteOperator) {
            this.an = eventInviteOperator;
            return this;
        }

        /* renamed from: a */
        public C15516a mo56199a(EventAttendeeInfo eventAttendeeInfo) {
            this.as = eventAttendeeInfo;
            return this;
        }

        /* renamed from: a */
        public CalendarEvent build() {
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
            String str8 = this.f41065a;
            if (str8 != null && (str = this.f41066b) != null && (str2 = this.f41067c) != null && (str3 = this.f41068d) != null && (str4 = this.f41071g) != null && (l = this.f41072h) != null && (str5 = this.f41086v) != null && (bool = this.f41088x) != null && (l2 = this.f41089y) != null && (str6 = this.f41090z) != null && (l3 = this.f41039A) != null && (str7 = this.f41040B) != null) {
                return new CalendarEvent(str8, str, str2, str3, this.f41069e, this.f41070f, str4, l, this.f41073i, this.f41074j, this.f41075k, this.f41076l, this.f41077m, this.f41078n, this.f41079o, this.f41080p, this.f41081q, this.f41082r, this.f41083s, this.f41084t, this.f41085u, str5, this.f41087w, bool, l2, str6, l3, str7, this.f41041C, this.f41042D, this.f41043E, this.f41044F, this.f41045G, this.f41046H, this.f41047I, this.f41048J, this.f41049K, this.f41050L, this.f41051M, this.f41052N, this.f41053O, this.f41054P, this.f41055Q, this.f41056R, this.f41057S, this.f41058T, this.f41059U, this.f41060V, this.f41061W, this.f41062X, this.f41063Y, this.f41064Z, this.aa, this.ab, this.ac, this.ad, this.ae, this.af, this.ag, this.ah, this.f175431ai, this.aj, this.ak, this.al, this.am, this.an, this.ao, this.ap, this.aq, this.ar, this.as, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str8, "id", this.f41066b, "creator_calendar_id", this.f41067c, "calendar_id", this.f41068d, "organizer_calendar_id", this.f41071g, "key", this.f41072h, "original_time", this.f41086v, "summary", this.f41088x, "is_all_day", this.f41089y, "start_time", this.f41090z, "start_timezone", this.f41039A, "end_time", this.f41040B, "end_timezone");
        }

        /* renamed from: a */
        public C15516a mo56184a(CalendarDirtyType calendarDirtyType) {
            this.f41083s = calendarDirtyType;
            return this;
        }

        /* renamed from: b */
        public C15516a mo56209b(CalendarEventAttendee calendarEventAttendee) {
            this.f41053O = calendarEventAttendee;
            return this;
        }

        /* renamed from: c */
        public C15516a mo56216c(CalendarEventAttendee calendarEventAttendee) {
            this.ac = calendarEventAttendee;
            return this;
        }

        /* renamed from: d */
        public C15516a mo56222d(Boolean bool) {
            this.f41088x = bool;
            return this;
        }

        /* renamed from: e */
        public C15516a mo56226e(Boolean bool) {
            this.f41043E = bool;
            return this;
        }

        /* renamed from: f */
        public C15516a mo56229f(Boolean bool) {
            this.f41044F = bool;
            return this;
        }

        /* renamed from: g */
        public C15516a mo56232g(Boolean bool) {
            this.f41045G = bool;
            return this;
        }

        /* renamed from: h */
        public C15516a mo56234h(Boolean bool) {
            this.f41049K = bool;
            return this;
        }

        /* renamed from: i */
        public C15516a mo56236i(Boolean bool) {
            this.f41050L = bool;
            return this;
        }

        /* renamed from: j */
        public C15516a mo56238j(Boolean bool) {
            this.f41051M = bool;
            return this;
        }

        /* renamed from: k */
        public C15516a mo56240k(Boolean bool) {
            this.f41062X = bool;
            return this;
        }

        /* renamed from: l */
        public C15516a mo56242l(Boolean bool) {
            this.ae = bool;
            return this;
        }

        /* renamed from: m */
        public C15516a mo56244m(Boolean bool) {
            this.af = bool;
            return this;
        }

        /* renamed from: n */
        public C15516a mo56246n(Boolean bool) {
            this.ag = bool;
            return this;
        }

        /* renamed from: o */
        public C15516a mo56248o(Boolean bool) {
            this.ah = bool;
            return this;
        }

        /* renamed from: p */
        public C15516a mo56250p(String str) {
            this.aa = str;
            return this;
        }

        /* renamed from: q */
        public C15516a mo56251q(String str) {
            this.aj = str;
            return this;
        }

        /* renamed from: r */
        public C15516a mo56252r(String str) {
            this.ak = str;
            return this;
        }

        /* renamed from: a */
        public C15516a mo56185a(Category category) {
            this.ar = category;
            return this;
        }

        /* renamed from: b */
        public C15516a mo56210b(MappingColor mappingColor) {
            this.f41058T = mappingColor;
            return this;
        }

        /* renamed from: c */
        public C15516a mo56217c(Boolean bool) {
            this.f41085u = bool;
            return this;
        }

        /* renamed from: d */
        public C15516a mo56223d(Integer num) {
            this.ao = num;
            return this;
        }

        /* renamed from: e */
        public C15516a mo56227e(Long l) {
            this.f41089y = l;
            return this;
        }

        /* renamed from: f */
        public C15516a mo56230f(Long l) {
            this.f41039A = l;
            return this;
        }

        /* renamed from: g */
        public C15516a mo56233g(String str) {
            this.f41073i = str;
            return this;
        }

        /* renamed from: h */
        public C15516a mo56235h(String str) {
            this.f41086v = str;
            return this;
        }

        /* renamed from: i */
        public C15516a mo56237i(String str) {
            this.f41087w = str;
            return this;
        }

        /* renamed from: j */
        public C15516a mo56239j(String str) {
            this.f41090z = str;
            return this;
        }

        /* renamed from: k */
        public C15516a mo56241k(String str) {
            this.f41040B = str;
            return this;
        }

        /* renamed from: l */
        public C15516a mo56243l(String str) {
            this.f41042D = str;
            return this;
        }

        /* renamed from: m */
        public C15516a mo56245m(String str) {
            this.f41046H = str;
            return this;
        }

        /* renamed from: n */
        public C15516a mo56247n(String str) {
            this.f41047I = str;
            return this;
        }

        /* renamed from: o */
        public C15516a mo56249o(String str) {
            this.f41061W = str;
            return this;
        }

        /* renamed from: a */
        public C15516a mo56186a(Deletable deletable) {
            this.f41063Y = deletable;
            return this;
        }

        /* renamed from: b */
        public C15516a mo56211b(Boolean bool) {
            this.f41075k = bool;
            return this;
        }

        /* renamed from: c */
        public C15516a mo56218c(Integer num) {
            this.f41084t = num;
            return this;
        }

        /* renamed from: d */
        public C15516a mo56224d(Long l) {
            this.f41078n = l;
            return this;
        }

        /* renamed from: e */
        public C15516a mo56228e(String str) {
            this.f41069e = str;
            return this;
        }

        /* renamed from: f */
        public C15516a mo56231f(String str) {
            this.f41071g = str;
            return this;
        }

        /* renamed from: a */
        public C15516a mo56187a(DisplayType displayType) {
            this.f41056R = displayType;
            return this;
        }

        /* renamed from: b */
        public C15516a mo56212b(Integer num) {
            this.f41082r = num;
            return this;
        }

        /* renamed from: c */
        public C15516a mo56219c(Long l) {
            this.f41077m = l;
            return this;
        }

        /* renamed from: d */
        public C15516a mo56225d(String str) {
            this.f41068d = str;
            return this;
        }

        /* renamed from: a */
        public C15516a mo56188a(NotificationType notificationType) {
            this.ad = notificationType;
            return this;
        }

        /* renamed from: b */
        public C15516a mo56213b(Long l) {
            this.f41076l = l;
            return this;
        }

        /* renamed from: c */
        public C15516a mo56220c(String str) {
            this.f41067c = str;
            return this;
        }

        /* renamed from: a */
        public C15516a mo56189a(Sharability sharability) {
            this.f41064Z = sharability;
            return this;
        }

        /* renamed from: b */
        public C15516a mo56214b(String str) {
            this.f41066b = str;
            return this;
        }

        /* renamed from: c */
        public C15516a mo56221c(List<CalendarEventAttachment> list) {
            Internal.checkElementsNotNull(list);
            this.am = list;
            return this;
        }

        /* renamed from: a */
        public C15516a mo56190a(Source source) {
            this.f41080p = source;
            return this;
        }

        /* renamed from: b */
        public C15516a mo56215b(List<CalendarEventReminder> list) {
            Internal.checkElementsNotNull(list);
            this.f41055Q = list;
            return this;
        }

        /* renamed from: a */
        public C15516a mo56191a(Status status) {
            this.f41041C = status;
            return this;
        }

        /* renamed from: a */
        public C15516a mo56192a(Type type) {
            this.f41060V = type;
            return this;
        }

        /* renamed from: a */
        public C15516a mo56193a(Visibility visibility) {
            this.f41081q = visibility;
            return this;
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.CalendarEvent$b */
    private static final class C15517b extends ProtoAdapter<CalendarEvent> {
        /* renamed from: a */
        public CalendarEvent decode(ProtoReader protoReader) throws IOException {
            C15516a aVar = new C15516a();
            aVar.f41065a = "";
            aVar.f41066b = "";
            aVar.f41067c = "";
            aVar.f41068d = "";
            aVar.f41069e = "";
            aVar.f41070f = CalendarEventAttendee.Status.NEEDS_ACTION;
            aVar.f41071g = "";
            aVar.f41072h = 0L;
            aVar.f41073i = "";
            aVar.f41074j = false;
            aVar.f41075k = false;
            aVar.f41076l = 0L;
            aVar.f41077m = 0L;
            aVar.f41078n = 0L;
            aVar.f41079o = -1;
            aVar.f41080p = Source.UNKNOWN_SOURCE;
            aVar.f41081q = Visibility.DEFAULT;
            aVar.f41082r = 0;
            aVar.f41083s = CalendarDirtyType.NONE_DIRTY_TYPE;
            aVar.f41084t = 0;
            aVar.f41085u = false;
            aVar.f41086v = "";
            aVar.f41087w = "";
            aVar.f41088x = false;
            aVar.f41089y = 0L;
            aVar.f41090z = "";
            aVar.f41039A = 0L;
            aVar.f41040B = "";
            aVar.f41041C = Status.TENTATIVE;
            aVar.f41042D = "";
            aVar.f41043E = true;
            aVar.f41044F = true;
            aVar.f41045G = false;
            aVar.f41046H = "";
            aVar.f41047I = "";
            aVar.f41049K = false;
            aVar.f41050L = false;
            aVar.f41051M = false;
            aVar.f41056R = DisplayType.INVISIBLE;
            aVar.f41059U = ConflictType.NONE;
            aVar.f41060V = Type.DEFAULT_TYPE;
            aVar.f41061W = "";
            aVar.f41062X = false;
            aVar.f41063Y = Deletable.NOT;
            aVar.f41064Z = Sharability.FORBIDDEN_NOT_ACCESSIBLE;
            aVar.aa = "";
            aVar.ab = "";
            aVar.ad = NotificationType.DEFAULT_NOTIFICATION_TYPE;
            aVar.ae = false;
            aVar.af = false;
            aVar.ag = false;
            aVar.ah = false;
            aVar.aj = "";
            aVar.ak = "";
            aVar.ao = 1;
            aVar.aq = "";
            aVar.ar = Category.DEFAULT_CATEGORY;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f41065a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f41066b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f41067c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f41068d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f41069e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            try {
                                aVar.f41070f = CalendarEventAttendee.Status.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 7:
                            aVar.f41071g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f41072h = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 9:
                            aVar.f41073i = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 10:
                            aVar.f41074j = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 11:
                            aVar.f41075k = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f41076l = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 13:
                            aVar.f41077m = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 14:
                            aVar.f41078n = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 15:
                            aVar.f41079o = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 16:
                            try {
                                aVar.f41080p = Source.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 17:
                            try {
                                aVar.f41081q = Visibility.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                break;
                            }
                        case 18:
                            aVar.f41082r = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 19:
                            try {
                                aVar.f41083s = CalendarDirtyType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e4.value));
                                break;
                            }
                        case 20:
                            aVar.f41084t = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 21:
                            aVar.f41085u = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 22:
                            aVar.f41086v = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 23:
                            aVar.f41087w = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 24:
                            aVar.f41088x = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case AvailableCode.ERROR_ON_ACTIVITY_RESULT /*{ENCODED_INT: 25}*/:
                            aVar.f41089y = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 26:
                            aVar.f41090z = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /*{ENCODED_INT: 27}*/:
                            aVar.f41039A = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case IVideoEventLogger.LOGGER_OPTION_ENABLE_SR /*{ENCODED_INT: 28}*/:
                            aVar.f41040B = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 29:
                            try {
                                aVar.f41041C = Status.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e5.value));
                                break;
                            }
                        case 30:
                            aVar.f41042D = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case TTVideoEngine.PLAYER_OPTION_ENABLE_PLAYER3_HARDWARE_DECODE /*{ENCODED_INT: 31}*/:
                            aVar.f41043E = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 32:
                            aVar.f41044F = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 33:
                            aVar.f41045G = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 34:
                            aVar.f41046H = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 35:
                            aVar.f41047I = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 36:
                            aVar.f41048J = CalendarLocation.ADAPTER.decode(protoReader);
                            break;
                        case 37:
                            aVar.f41049K = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 38:
                            aVar.f41050L = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 39:
                            aVar.f41051M = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 40:
                            aVar.f41052N = CalendarEventAttendee.ADAPTER.decode(protoReader);
                            break;
                        case 41:
                            aVar.f41053O = CalendarEventAttendee.ADAPTER.decode(protoReader);
                            break;
                        case 42:
                            aVar.f41054P.add(CalendarEventAttendee.ADAPTER.decode(protoReader));
                            break;
                        case 43:
                            aVar.f41055Q.add(CalendarEventReminder.ADAPTER.decode(protoReader));
                            break;
                        case 44:
                            try {
                                aVar.f41056R = DisplayType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e6) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e6.value));
                                break;
                            }
                        case 45:
                            aVar.f41057S = MappingColor.ADAPTER.decode(protoReader);
                            break;
                        case 46:
                            aVar.f41058T = MappingColor.ADAPTER.decode(protoReader);
                            break;
                        case 47:
                            try {
                                aVar.f41059U = ConflictType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e7) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e7.value));
                                break;
                            }
                        case 48:
                            try {
                                aVar.f41060V = Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e8) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e8.value));
                                break;
                            }
                        case 49:
                            aVar.f41061W = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case MmListControl.f116813f /*{ENCODED_INT: 50}*/:
                            aVar.f41062X = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 51:
                            try {
                                aVar.f41063Y = Deletable.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e9) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e9.value));
                                break;
                            }
                        case 52:
                            try {
                                aVar.f41064Z = Sharability.ADAPTER.decode(protoReader);
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
                            aVar.ac = CalendarEventAttendee.ADAPTER.decode(protoReader);
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
                            aVar.f175431ai = VideoMeeting.ADAPTER.decode(protoReader);
                            break;
                        case 62:
                            aVar.aj = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 63:
                            aVar.ak = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 64:
                            aVar.al = CalendarEventDisplayInfo.ADAPTER.decode(protoReader);
                            break;
                        case 65:
                            aVar.am.add(CalendarEventAttachment.ADAPTER.decode(protoReader));
                            break;
                        case 66:
                            aVar.an = EventInviteOperator.ADAPTER.decode(protoReader);
                            break;
                        case 67:
                            aVar.ao = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 68:
                            aVar.ap = CalendarSchemaCollection.ADAPTER.decode(protoReader);
                            break;
                        case 69:
                            aVar.aq = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 70:
                            try {
                                aVar.ar = Category.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e12) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e12.value));
                                break;
                            }
                        case 71:
                            aVar.as = EventAttendeeInfo.ADAPTER.decode(protoReader);
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

        C15517b() {
            super(FieldEncoding.LENGTH_DELIMITED, CalendarEvent.class);
        }

        /* renamed from: a */
        public int encodedSize(CalendarEvent calendarEvent) {
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
            int i48;
            int i49;
            int i50;
            int i51;
            int i52;
            int i53;
            int i54;
            int i55;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, calendarEvent.id) + ProtoAdapter.STRING.encodedSizeWithTag(2, calendarEvent.creator_calendar_id) + ProtoAdapter.STRING.encodedSizeWithTag(3, calendarEvent.calendar_id) + ProtoAdapter.STRING.encodedSizeWithTag(4, calendarEvent.organizer_calendar_id);
            int i56 = 0;
            if (calendarEvent.server_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(5, calendarEvent.server_id);
            } else {
                i = 0;
            }
            int i57 = encodedSizeWithTag + i;
            if (calendarEvent.self_attendee_status != null) {
                i2 = CalendarEventAttendee.Status.ADAPTER.encodedSizeWithTag(6, calendarEvent.self_attendee_status);
            } else {
                i2 = 0;
            }
            int encodedSizeWithTag2 = i57 + i2 + ProtoAdapter.STRING.encodedSizeWithTag(7, calendarEvent.key) + ProtoAdapter.INT64.encodedSizeWithTag(8, calendarEvent.original_time);
            if (calendarEvent.original_event_key != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(9, calendarEvent.original_event_key);
            } else {
                i3 = 0;
            }
            int i58 = encodedSizeWithTag2 + i3;
            if (calendarEvent.original_is_all_day != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(10, calendarEvent.original_is_all_day);
            } else {
                i4 = 0;
            }
            int i59 = i58 + i4;
            if (calendarEvent.is_free != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(11, calendarEvent.is_free);
            } else {
                i5 = 0;
            }
            int i60 = i59 + i5;
            if (calendarEvent.last_date != null) {
                i6 = ProtoAdapter.INT64.encodedSizeWithTag(12, calendarEvent.last_date);
            } else {
                i6 = 0;
            }
            int i61 = i60 + i6;
            if (calendarEvent.create_time != null) {
                i7 = ProtoAdapter.INT64.encodedSizeWithTag(13, calendarEvent.create_time);
            } else {
                i7 = 0;
            }
            int i62 = i61 + i7;
            if (calendarEvent.update_time != null) {
                i8 = ProtoAdapter.INT64.encodedSizeWithTag(14, calendarEvent.update_time);
            } else {
                i8 = 0;
            }
            int i63 = i62 + i8;
            if (calendarEvent.color != null) {
                i9 = ProtoAdapter.INT32.encodedSizeWithTag(15, calendarEvent.color);
            } else {
                i9 = 0;
            }
            int i64 = i63 + i9;
            if (calendarEvent.source != null) {
                i10 = Source.ADAPTER.encodedSizeWithTag(16, calendarEvent.source);
            } else {
                i10 = 0;
            }
            int i65 = i64 + i10;
            if (calendarEvent.visibility != null) {
                i11 = Visibility.ADAPTER.encodedSizeWithTag(17, calendarEvent.visibility);
            } else {
                i11 = 0;
            }
            int i66 = i65 + i11;
            if (calendarEvent.importance != null) {
                i12 = ProtoAdapter.INT32.encodedSizeWithTag(18, calendarEvent.importance);
            } else {
                i12 = 0;
            }
            int i67 = i66 + i12;
            if (calendarEvent.dirty_type != null) {
                i13 = CalendarDirtyType.ADAPTER.encodedSizeWithTag(19, calendarEvent.dirty_type);
            } else {
                i13 = 0;
            }
            int i68 = i67 + i13;
            if (calendarEvent.version != null) {
                i14 = ProtoAdapter.INT32.encodedSizeWithTag(20, calendarEvent.version);
            } else {
                i14 = 0;
            }
            int i69 = i68 + i14;
            if (calendarEvent.need_update != null) {
                i15 = ProtoAdapter.BOOL.encodedSizeWithTag(21, calendarEvent.need_update);
            } else {
                i15 = 0;
            }
            int encodedSizeWithTag3 = i69 + i15 + ProtoAdapter.STRING.encodedSizeWithTag(22, calendarEvent.summary);
            if (calendarEvent.description != null) {
                i16 = ProtoAdapter.STRING.encodedSizeWithTag(23, calendarEvent.description);
            } else {
                i16 = 0;
            }
            int encodedSizeWithTag4 = encodedSizeWithTag3 + i16 + ProtoAdapter.BOOL.encodedSizeWithTag(24, calendarEvent.is_all_day) + ProtoAdapter.INT64.encodedSizeWithTag(25, calendarEvent.start_time) + ProtoAdapter.STRING.encodedSizeWithTag(26, calendarEvent.start_timezone) + ProtoAdapter.INT64.encodedSizeWithTag(27, calendarEvent.end_time) + ProtoAdapter.STRING.encodedSizeWithTag(28, calendarEvent.end_timezone);
            if (calendarEvent.status != null) {
                i17 = Status.ADAPTER.encodedSizeWithTag(29, calendarEvent.status);
            } else {
                i17 = 0;
            }
            int i70 = encodedSizeWithTag4 + i17;
            if (calendarEvent.rrule != null) {
                i18 = ProtoAdapter.STRING.encodedSizeWithTag(30, calendarEvent.rrule);
            } else {
                i18 = 0;
            }
            int i71 = i70 + i18;
            if (calendarEvent.guest_can_invite != null) {
                i19 = ProtoAdapter.BOOL.encodedSizeWithTag(31, calendarEvent.guest_can_invite);
            } else {
                i19 = 0;
            }
            int i72 = i71 + i19;
            if (calendarEvent.guest_can_see_other_guests != null) {
                i20 = ProtoAdapter.BOOL.encodedSizeWithTag(32, calendarEvent.guest_can_see_other_guests);
            } else {
                i20 = 0;
            }
            int i73 = i72 + i20;
            if (calendarEvent.guest_can_modify != null) {
                i21 = ProtoAdapter.BOOL.encodedSizeWithTag(33, calendarEvent.guest_can_modify);
            } else {
                i21 = 0;
            }
            int i74 = i73 + i21;
            if (calendarEvent.audio_url != null) {
                i22 = ProtoAdapter.STRING.encodedSizeWithTag(34, calendarEvent.audio_url);
            } else {
                i22 = 0;
            }
            int i75 = i74 + i22;
            if (calendarEvent.url != null) {
                i23 = ProtoAdapter.STRING.encodedSizeWithTag(35, calendarEvent.url);
            } else {
                i23 = 0;
            }
            int i76 = i75 + i23;
            if (calendarEvent.location != null) {
                i24 = CalendarLocation.ADAPTER.encodedSizeWithTag(36, calendarEvent.location);
            } else {
                i24 = 0;
            }
            int i77 = i76 + i24;
            if (calendarEvent.has_alarm != null) {
                i25 = ProtoAdapter.BOOL.encodedSizeWithTag(37, calendarEvent.has_alarm);
            } else {
                i25 = 0;
            }
            int i78 = i77 + i25;
            if (calendarEvent.has_attendee != null) {
                i26 = ProtoAdapter.BOOL.encodedSizeWithTag(38, calendarEvent.has_attendee);
            } else {
                i26 = 0;
            }
            int i79 = i78 + i26;
            if (calendarEvent.is_scheduled != null) {
                i27 = ProtoAdapter.BOOL.encodedSizeWithTag(39, calendarEvent.is_scheduled);
            } else {
                i27 = 0;
            }
            int i80 = i79 + i27;
            if (calendarEvent.creator != null) {
                i28 = CalendarEventAttendee.ADAPTER.encodedSizeWithTag(40, calendarEvent.creator);
            } else {
                i28 = 0;
            }
            int i81 = i80 + i28;
            if (calendarEvent.organizer != null) {
                i29 = CalendarEventAttendee.ADAPTER.encodedSizeWithTag(41, calendarEvent.organizer);
            } else {
                i29 = 0;
            }
            int encodedSizeWithTag5 = i81 + i29 + CalendarEventAttendee.ADAPTER.asRepeated().encodedSizeWithTag(42, calendarEvent.attendees) + CalendarEventReminder.ADAPTER.asRepeated().encodedSizeWithTag(43, calendarEvent.reminders);
            if (calendarEvent.display_type != null) {
                i30 = DisplayType.ADAPTER.encodedSizeWithTag(44, calendarEvent.display_type);
            } else {
                i30 = 0;
            }
            int i82 = encodedSizeWithTag5 + i30;
            if (calendarEvent.event_color != null) {
                i31 = MappingColor.ADAPTER.encodedSizeWithTag(45, calendarEvent.event_color);
            } else {
                i31 = 0;
            }
            int i83 = i82 + i31;
            if (calendarEvent.cal_color != null) {
                i32 = MappingColor.ADAPTER.encodedSizeWithTag(46, calendarEvent.cal_color);
            } else {
                i32 = 0;
            }
            int i84 = i83 + i32;
            if (calendarEvent.conflict_type != null) {
                i33 = ConflictType.ADAPTER.encodedSizeWithTag(47, calendarEvent.conflict_type);
            } else {
                i33 = 0;
            }
            int i85 = i84 + i33;
            if (calendarEvent.type != null) {
                i34 = Type.ADAPTER.encodedSizeWithTag(48, calendarEvent.type);
            } else {
                i34 = 0;
            }
            int i86 = i85 + i34;
            if (calendarEvent.meeting_id != null) {
                i35 = ProtoAdapter.STRING.encodedSizeWithTag(49, calendarEvent.meeting_id);
            } else {
                i35 = 0;
            }
            int i87 = i86 + i35;
            if (calendarEvent.is_editable != null) {
                i36 = ProtoAdapter.BOOL.encodedSizeWithTag(50, calendarEvent.is_editable);
            } else {
                i36 = 0;
            }
            int i88 = i87 + i36;
            if (calendarEvent.is_deletable != null) {
                i37 = Deletable.ADAPTER.encodedSizeWithTag(51, calendarEvent.is_deletable);
            } else {
                i37 = 0;
            }
            int i89 = i88 + i37;
            if (calendarEvent.sharability != null) {
                i38 = Sharability.ADAPTER.encodedSizeWithTag(52, calendarEvent.sharability);
            } else {
                i38 = 0;
            }
            int i90 = i89 + i38;
            if (calendarEvent.docs_description != null) {
                i39 = ProtoAdapter.STRING.encodedSizeWithTag(53, calendarEvent.docs_description);
            } else {
                i39 = 0;
            }
            int i91 = i90 + i39;
            if (calendarEvent.successor_calendar_id != null) {
                i40 = ProtoAdapter.STRING.encodedSizeWithTag(54, calendarEvent.successor_calendar_id);
            } else {
                i40 = 0;
            }
            int i92 = i91 + i40;
            if (calendarEvent.successor != null) {
                i41 = CalendarEventAttendee.ADAPTER.encodedSizeWithTag(55, calendarEvent.successor);
            } else {
                i41 = 0;
            }
            int i93 = i92 + i41;
            if (calendarEvent.notification_type != null) {
                i42 = NotificationType.ADAPTER.encodedSizeWithTag(56, calendarEvent.notification_type);
            } else {
                i42 = 0;
            }
            int i94 = i93 + i42;
            if (calendarEvent.is_cross_tenant != null) {
                i43 = ProtoAdapter.BOOL.encodedSizeWithTag(57, calendarEvent.is_cross_tenant);
            } else {
                i43 = 0;
            }
            int i95 = i94 + i43;
            if (calendarEvent.will_creator_attend != null) {
                i44 = ProtoAdapter.BOOL.encodedSizeWithTag(58, calendarEvent.will_creator_attend);
            } else {
                i44 = 0;
            }
            int i96 = i95 + i44;
            if (calendarEvent.will_organizer_attend != null) {
                i45 = ProtoAdapter.BOOL.encodedSizeWithTag(59, calendarEvent.will_organizer_attend);
            } else {
                i45 = 0;
            }
            int i97 = i96 + i45;
            if (calendarEvent.will_successor_attend != null) {
                i46 = ProtoAdapter.BOOL.encodedSizeWithTag(60, calendarEvent.will_successor_attend);
            } else {
                i46 = 0;
            }
            int i98 = i97 + i46;
            if (calendarEvent.video_meeting != null) {
                i47 = VideoMeeting.ADAPTER.encodedSizeWithTag(61, calendarEvent.video_meeting);
            } else {
                i47 = 0;
            }
            int i99 = i98 + i47;
            if (calendarEvent.meeting_minute_url != null) {
                i48 = ProtoAdapter.STRING.encodedSizeWithTag(62, calendarEvent.meeting_minute_url);
            } else {
                i48 = 0;
            }
            int i100 = i99 + i48;
            if (calendarEvent.user_invite_operator_id != null) {
                i49 = ProtoAdapter.STRING.encodedSizeWithTag(63, calendarEvent.user_invite_operator_id);
            } else {
                i49 = 0;
            }
            int i101 = i100 + i49;
            if (calendarEvent.calendar_event_display_info != null) {
                i50 = CalendarEventDisplayInfo.ADAPTER.encodedSizeWithTag(64, calendarEvent.calendar_event_display_info);
            } else {
                i50 = 0;
            }
            int encodedSizeWithTag6 = i101 + i50 + CalendarEventAttachment.ADAPTER.asRepeated().encodedSizeWithTag(65, calendarEvent.attachments);
            if (calendarEvent.user_invite_operator != null) {
                i51 = EventInviteOperator.ADAPTER.encodedSizeWithTag(66, calendarEvent.user_invite_operator);
            } else {
                i51 = 0;
            }
            int i102 = encodedSizeWithTag6 + i51;
            if (calendarEvent.attendee_source != null) {
                i52 = ProtoAdapter.INT32.encodedSizeWithTag(67, calendarEvent.attendee_source);
            } else {
                i52 = 0;
            }
            int i103 = i102 + i52;
            if (calendarEvent.schema != null) {
                i53 = CalendarSchemaCollection.ADAPTER.encodedSizeWithTag(68, calendarEvent.schema);
            } else {
                i53 = 0;
            }
            int i104 = i103 + i53;
            if (calendarEvent.version64 != null) {
                i54 = ProtoAdapter.STRING.encodedSizeWithTag(69, calendarEvent.version64);
            } else {
                i54 = 0;
            }
            int i105 = i104 + i54;
            if (calendarEvent.category != null) {
                i55 = Category.ADAPTER.encodedSizeWithTag(70, calendarEvent.category);
            } else {
                i55 = 0;
            }
            int i106 = i105 + i55;
            if (calendarEvent.attendee_info != null) {
                i56 = EventAttendeeInfo.ADAPTER.encodedSizeWithTag(71, calendarEvent.attendee_info);
            }
            return i106 + i56 + calendarEvent.unknownFields().size();
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CalendarEvent calendarEvent) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, calendarEvent.id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, calendarEvent.creator_calendar_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, calendarEvent.calendar_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, calendarEvent.organizer_calendar_id);
            if (calendarEvent.server_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, calendarEvent.server_id);
            }
            if (calendarEvent.self_attendee_status != null) {
                CalendarEventAttendee.Status.ADAPTER.encodeWithTag(protoWriter, 6, calendarEvent.self_attendee_status);
            }
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, calendarEvent.key);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 8, calendarEvent.original_time);
            if (calendarEvent.original_event_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, calendarEvent.original_event_key);
            }
            if (calendarEvent.original_is_all_day != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 10, calendarEvent.original_is_all_day);
            }
            if (calendarEvent.is_free != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 11, calendarEvent.is_free);
            }
            if (calendarEvent.last_date != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 12, calendarEvent.last_date);
            }
            if (calendarEvent.create_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 13, calendarEvent.create_time);
            }
            if (calendarEvent.update_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 14, calendarEvent.update_time);
            }
            if (calendarEvent.color != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 15, calendarEvent.color);
            }
            if (calendarEvent.source != null) {
                Source.ADAPTER.encodeWithTag(protoWriter, 16, calendarEvent.source);
            }
            if (calendarEvent.visibility != null) {
                Visibility.ADAPTER.encodeWithTag(protoWriter, 17, calendarEvent.visibility);
            }
            if (calendarEvent.importance != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 18, calendarEvent.importance);
            }
            if (calendarEvent.dirty_type != null) {
                CalendarDirtyType.ADAPTER.encodeWithTag(protoWriter, 19, calendarEvent.dirty_type);
            }
            if (calendarEvent.version != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 20, calendarEvent.version);
            }
            if (calendarEvent.need_update != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 21, calendarEvent.need_update);
            }
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 22, calendarEvent.summary);
            if (calendarEvent.description != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 23, calendarEvent.description);
            }
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 24, calendarEvent.is_all_day);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 25, calendarEvent.start_time);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 26, calendarEvent.start_timezone);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 27, calendarEvent.end_time);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 28, calendarEvent.end_timezone);
            if (calendarEvent.status != null) {
                Status.ADAPTER.encodeWithTag(protoWriter, 29, calendarEvent.status);
            }
            if (calendarEvent.rrule != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 30, calendarEvent.rrule);
            }
            if (calendarEvent.guest_can_invite != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 31, calendarEvent.guest_can_invite);
            }
            if (calendarEvent.guest_can_see_other_guests != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 32, calendarEvent.guest_can_see_other_guests);
            }
            if (calendarEvent.guest_can_modify != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 33, calendarEvent.guest_can_modify);
            }
            if (calendarEvent.audio_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 34, calendarEvent.audio_url);
            }
            if (calendarEvent.url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 35, calendarEvent.url);
            }
            if (calendarEvent.location != null) {
                CalendarLocation.ADAPTER.encodeWithTag(protoWriter, 36, calendarEvent.location);
            }
            if (calendarEvent.has_alarm != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 37, calendarEvent.has_alarm);
            }
            if (calendarEvent.has_attendee != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 38, calendarEvent.has_attendee);
            }
            if (calendarEvent.is_scheduled != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 39, calendarEvent.is_scheduled);
            }
            if (calendarEvent.creator != null) {
                CalendarEventAttendee.ADAPTER.encodeWithTag(protoWriter, 40, calendarEvent.creator);
            }
            if (calendarEvent.organizer != null) {
                CalendarEventAttendee.ADAPTER.encodeWithTag(protoWriter, 41, calendarEvent.organizer);
            }
            CalendarEventAttendee.ADAPTER.asRepeated().encodeWithTag(protoWriter, 42, calendarEvent.attendees);
            CalendarEventReminder.ADAPTER.asRepeated().encodeWithTag(protoWriter, 43, calendarEvent.reminders);
            if (calendarEvent.display_type != null) {
                DisplayType.ADAPTER.encodeWithTag(protoWriter, 44, calendarEvent.display_type);
            }
            if (calendarEvent.event_color != null) {
                MappingColor.ADAPTER.encodeWithTag(protoWriter, 45, calendarEvent.event_color);
            }
            if (calendarEvent.cal_color != null) {
                MappingColor.ADAPTER.encodeWithTag(protoWriter, 46, calendarEvent.cal_color);
            }
            if (calendarEvent.conflict_type != null) {
                ConflictType.ADAPTER.encodeWithTag(protoWriter, 47, calendarEvent.conflict_type);
            }
            if (calendarEvent.type != null) {
                Type.ADAPTER.encodeWithTag(protoWriter, 48, calendarEvent.type);
            }
            if (calendarEvent.meeting_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 49, calendarEvent.meeting_id);
            }
            if (calendarEvent.is_editable != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 50, calendarEvent.is_editable);
            }
            if (calendarEvent.is_deletable != null) {
                Deletable.ADAPTER.encodeWithTag(protoWriter, 51, calendarEvent.is_deletable);
            }
            if (calendarEvent.sharability != null) {
                Sharability.ADAPTER.encodeWithTag(protoWriter, 52, calendarEvent.sharability);
            }
            if (calendarEvent.docs_description != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 53, calendarEvent.docs_description);
            }
            if (calendarEvent.successor_calendar_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 54, calendarEvent.successor_calendar_id);
            }
            if (calendarEvent.successor != null) {
                CalendarEventAttendee.ADAPTER.encodeWithTag(protoWriter, 55, calendarEvent.successor);
            }
            if (calendarEvent.notification_type != null) {
                NotificationType.ADAPTER.encodeWithTag(protoWriter, 56, calendarEvent.notification_type);
            }
            if (calendarEvent.is_cross_tenant != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 57, calendarEvent.is_cross_tenant);
            }
            if (calendarEvent.will_creator_attend != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 58, calendarEvent.will_creator_attend);
            }
            if (calendarEvent.will_organizer_attend != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 59, calendarEvent.will_organizer_attend);
            }
            if (calendarEvent.will_successor_attend != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 60, calendarEvent.will_successor_attend);
            }
            if (calendarEvent.video_meeting != null) {
                VideoMeeting.ADAPTER.encodeWithTag(protoWriter, 61, calendarEvent.video_meeting);
            }
            if (calendarEvent.meeting_minute_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 62, calendarEvent.meeting_minute_url);
            }
            if (calendarEvent.user_invite_operator_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 63, calendarEvent.user_invite_operator_id);
            }
            if (calendarEvent.calendar_event_display_info != null) {
                CalendarEventDisplayInfo.ADAPTER.encodeWithTag(protoWriter, 64, calendarEvent.calendar_event_display_info);
            }
            CalendarEventAttachment.ADAPTER.asRepeated().encodeWithTag(protoWriter, 65, calendarEvent.attachments);
            if (calendarEvent.user_invite_operator != null) {
                EventInviteOperator.ADAPTER.encodeWithTag(protoWriter, 66, calendarEvent.user_invite_operator);
            }
            if (calendarEvent.attendee_source != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 67, calendarEvent.attendee_source);
            }
            if (calendarEvent.schema != null) {
                CalendarSchemaCollection.ADAPTER.encodeWithTag(protoWriter, 68, calendarEvent.schema);
            }
            if (calendarEvent.version64 != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 69, calendarEvent.version64);
            }
            if (calendarEvent.category != null) {
                Category.ADAPTER.encodeWithTag(protoWriter, 70, calendarEvent.category);
            }
            if (calendarEvent.attendee_info != null) {
                EventAttendeeInfo.ADAPTER.encodeWithTag(protoWriter, 71, calendarEvent.attendee_info);
            }
            protoWriter.writeBytes(calendarEvent.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15516a newBuilder() {
        C15516a aVar = new C15516a();
        aVar.f41065a = this.id;
        aVar.f41066b = this.creator_calendar_id;
        aVar.f41067c = this.calendar_id;
        aVar.f41068d = this.organizer_calendar_id;
        aVar.f41069e = this.server_id;
        aVar.f41070f = this.self_attendee_status;
        aVar.f41071g = this.key;
        aVar.f41072h = this.original_time;
        aVar.f41073i = this.original_event_key;
        aVar.f41074j = this.original_is_all_day;
        aVar.f41075k = this.is_free;
        aVar.f41076l = this.last_date;
        aVar.f41077m = this.create_time;
        aVar.f41078n = this.update_time;
        aVar.f41079o = this.color;
        aVar.f41080p = this.source;
        aVar.f41081q = this.visibility;
        aVar.f41082r = this.importance;
        aVar.f41083s = this.dirty_type;
        aVar.f41084t = this.version;
        aVar.f41085u = this.need_update;
        aVar.f41086v = this.summary;
        aVar.f41087w = this.description;
        aVar.f41088x = this.is_all_day;
        aVar.f41089y = this.start_time;
        aVar.f41090z = this.start_timezone;
        aVar.f41039A = this.end_time;
        aVar.f41040B = this.end_timezone;
        aVar.f41041C = this.status;
        aVar.f41042D = this.rrule;
        aVar.f41043E = this.guest_can_invite;
        aVar.f41044F = this.guest_can_see_other_guests;
        aVar.f41045G = this.guest_can_modify;
        aVar.f41046H = this.audio_url;
        aVar.f41047I = this.url;
        aVar.f41048J = this.location;
        aVar.f41049K = this.has_alarm;
        aVar.f41050L = this.has_attendee;
        aVar.f41051M = this.is_scheduled;
        aVar.f41052N = this.creator;
        aVar.f41053O = this.organizer;
        aVar.f41054P = Internal.copyOf("attendees", this.attendees);
        aVar.f41055Q = Internal.copyOf("reminders", this.reminders);
        aVar.f41056R = this.display_type;
        aVar.f41057S = this.event_color;
        aVar.f41058T = this.cal_color;
        aVar.f41059U = this.conflict_type;
        aVar.f41060V = this.type;
        aVar.f41061W = this.meeting_id;
        aVar.f41062X = this.is_editable;
        aVar.f41063Y = this.is_deletable;
        aVar.f41064Z = this.sharability;
        aVar.aa = this.docs_description;
        aVar.ab = this.successor_calendar_id;
        aVar.ac = this.successor;
        aVar.ad = this.notification_type;
        aVar.ae = this.is_cross_tenant;
        aVar.af = this.will_creator_attend;
        aVar.ag = this.will_organizer_attend;
        aVar.ah = this.will_successor_attend;
        aVar.f175431ai = this.video_meeting;
        aVar.aj = this.meeting_minute_url;
        aVar.ak = this.user_invite_operator_id;
        aVar.al = this.calendar_event_display_info;
        aVar.am = Internal.copyOf("attachments", this.attachments);
        aVar.an = this.user_invite_operator;
        aVar.ao = this.attendee_source;
        aVar.ap = this.schema;
        aVar.aq = this.version64;
        aVar.ar = this.category;
        aVar.as = this.attendee_info;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "CalendarEvent");
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
        if (this.user_invite_operator_id != null) {
            sb.append(", user_invite_operator_id=");
            sb.append(this.user_invite_operator_id);
        }
        if (this.calendar_event_display_info != null) {
            sb.append(", calendar_event_display_info=");
            sb.append(this.calendar_event_display_info);
        }
        if (!this.attachments.isEmpty()) {
            sb.append(", attachments=");
            sb.append(this.attachments);
        }
        if (this.user_invite_operator != null) {
            sb.append(", user_invite_operator=");
            sb.append(this.user_invite_operator);
        }
        if (this.attendee_source != null) {
            sb.append(", attendee_source=");
            sb.append(this.attendee_source);
        }
        if (this.schema != null) {
            sb.append(", schema=");
            sb.append(this.schema);
        }
        if (this.version64 != null) {
            sb.append(", version64=");
            sb.append(this.version64);
        }
        if (this.category != null) {
            sb.append(", category=");
            sb.append(this.category);
        }
        if (this.attendee_info != null) {
            sb.append(", attendee_info=");
            sb.append(this.attendee_info);
        }
        StringBuilder replace = sb.replace(0, 2, "CalendarEvent{");
        replace.append('}');
        return replace.toString();
    }
}
