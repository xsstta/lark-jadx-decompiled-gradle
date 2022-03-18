package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.calendar.v1.CalendarEvent;
import com.bytedance.lark.pb.calendar.v1.CalendarEventAttendee;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class RoomViewInstance extends Message<RoomViewInstance, C15986a> {
    public static final ProtoAdapter<RoomViewInstance> ADAPTER = new C15987b();
    public static final CalendarEvent.Category DEFAULT_CATEGORY = CalendarEvent.Category.DEFAULT_CATEGORY;
    public static final UserAccessibility DEFAULT_CURRENT_USER_ACCESSIBILITY = UserAccessibility.LIMITED;
    public static final Integer DEFAULT_END_DAY = 0;
    public static final Integer DEFAULT_END_MINUTE = 0;
    public static final Long DEFAULT_END_TIME = 0L;
    public static final Boolean DEFAULT_IS_ALL_DAY = false;
    public static final Long DEFAULT_ORIGINAL_TIME = 0L;
    public static final CalendarEventAttendee.Status DEFAULT_RESERVATION_STATUS = CalendarEventAttendee.Status.ACCEPT;
    public static final Integer DEFAULT_START_DAY = 0;
    public static final Integer DEFAULT_START_MINUTE = 0;
    public static final Long DEFAULT_START_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final CalendarEvent.Category category;
    public final UserAccessibility current_user_accessibility;
    public final String current_user_accessible_calendar_id;
    public final Integer end_day;
    public final Integer end_minute;
    public final Long end_time;
    public final String end_timezone;
    public final String event_key;
    public final Boolean is_all_day;
    public final Long original_time;
    public final CalendarEventAttendee.Status reservation_status;
    public final String resource_calendar_id;
    public final ResourceContactPerson resource_contact_person;
    public final Integer start_day;
    public final Integer start_minute;
    public final Long start_time;
    public final String start_timezone;
    public final String summary;

    public enum UserAccessibility implements WireEnum {
        LIMITED(0),
        SUMMARY_VISIBLE(1),
        EVENT_VISIBILE(2),
        JOINED(3);
        
        public static final ProtoAdapter<UserAccessibility> ADAPTER = ProtoAdapter.newEnumAdapter(UserAccessibility.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static UserAccessibility fromValue(int i) {
            if (i == 0) {
                return LIMITED;
            }
            if (i == 1) {
                return SUMMARY_VISIBLE;
            }
            if (i == 2) {
                return EVENT_VISIBILE;
            }
            if (i != 3) {
                return null;
            }
            return JOINED;
        }

        private UserAccessibility(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.RoomViewInstance$b */
    private static final class C15987b extends ProtoAdapter<RoomViewInstance> {
        C15987b() {
            super(FieldEncoding.LENGTH_DELIMITED, RoomViewInstance.class);
        }

        /* renamed from: a */
        public int encodedSize(RoomViewInstance roomViewInstance) {
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
            int i18 = 0;
            if (roomViewInstance.resource_calendar_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, roomViewInstance.resource_calendar_id);
            } else {
                i = 0;
            }
            if (roomViewInstance.resource_contact_person != null) {
                i2 = ResourceContactPerson.ADAPTER.encodedSizeWithTag(2, roomViewInstance.resource_contact_person);
            } else {
                i2 = 0;
            }
            int i19 = i + i2;
            if (roomViewInstance.current_user_accessibility != null) {
                i3 = UserAccessibility.ADAPTER.encodedSizeWithTag(3, roomViewInstance.current_user_accessibility);
            } else {
                i3 = 0;
            }
            int i20 = i19 + i3;
            if (roomViewInstance.event_key != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, roomViewInstance.event_key);
            } else {
                i4 = 0;
            }
            int i21 = i20 + i4;
            if (roomViewInstance.original_time != null) {
                i5 = ProtoAdapter.INT64.encodedSizeWithTag(5, roomViewInstance.original_time);
            } else {
                i5 = 0;
            }
            int i22 = i21 + i5;
            if (roomViewInstance.start_time != null) {
                i6 = ProtoAdapter.INT64.encodedSizeWithTag(6, roomViewInstance.start_time);
            } else {
                i6 = 0;
            }
            int i23 = i22 + i6;
            if (roomViewInstance.start_timezone != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(7, roomViewInstance.start_timezone);
            } else {
                i7 = 0;
            }
            int i24 = i23 + i7;
            if (roomViewInstance.end_time != null) {
                i8 = ProtoAdapter.INT64.encodedSizeWithTag(8, roomViewInstance.end_time);
            } else {
                i8 = 0;
            }
            int i25 = i24 + i8;
            if (roomViewInstance.end_timezone != null) {
                i9 = ProtoAdapter.STRING.encodedSizeWithTag(9, roomViewInstance.end_timezone);
            } else {
                i9 = 0;
            }
            int i26 = i25 + i9;
            if (roomViewInstance.start_day != null) {
                i10 = ProtoAdapter.INT32.encodedSizeWithTag(10, roomViewInstance.start_day);
            } else {
                i10 = 0;
            }
            int i27 = i26 + i10;
            if (roomViewInstance.end_day != null) {
                i11 = ProtoAdapter.INT32.encodedSizeWithTag(11, roomViewInstance.end_day);
            } else {
                i11 = 0;
            }
            int i28 = i27 + i11;
            if (roomViewInstance.start_minute != null) {
                i12 = ProtoAdapter.INT32.encodedSizeWithTag(12, roomViewInstance.start_minute);
            } else {
                i12 = 0;
            }
            int i29 = i28 + i12;
            if (roomViewInstance.end_minute != null) {
                i13 = ProtoAdapter.INT32.encodedSizeWithTag(13, roomViewInstance.end_minute);
            } else {
                i13 = 0;
            }
            int i30 = i29 + i13;
            if (roomViewInstance.summary != null) {
                i14 = ProtoAdapter.STRING.encodedSizeWithTag(14, roomViewInstance.summary);
            } else {
                i14 = 0;
            }
            int i31 = i30 + i14;
            if (roomViewInstance.is_all_day != null) {
                i15 = ProtoAdapter.BOOL.encodedSizeWithTag(15, roomViewInstance.is_all_day);
            } else {
                i15 = 0;
            }
            int i32 = i31 + i15;
            if (roomViewInstance.category != null) {
                i16 = CalendarEvent.Category.ADAPTER.encodedSizeWithTag(16, roomViewInstance.category);
            } else {
                i16 = 0;
            }
            int i33 = i32 + i16;
            if (roomViewInstance.current_user_accessible_calendar_id != null) {
                i17 = ProtoAdapter.STRING.encodedSizeWithTag(17, roomViewInstance.current_user_accessible_calendar_id);
            } else {
                i17 = 0;
            }
            int i34 = i33 + i17;
            if (roomViewInstance.reservation_status != null) {
                i18 = CalendarEventAttendee.Status.ADAPTER.encodedSizeWithTag(18, roomViewInstance.reservation_status);
            }
            return i34 + i18 + roomViewInstance.unknownFields().size();
        }

        /* renamed from: a */
        public RoomViewInstance decode(ProtoReader protoReader) throws IOException {
            C15986a aVar = new C15986a();
            aVar.f41985a = "";
            aVar.f41987c = UserAccessibility.LIMITED;
            aVar.f41988d = "";
            aVar.f41989e = 0L;
            aVar.f41990f = 0L;
            aVar.f41991g = "";
            aVar.f41992h = 0L;
            aVar.f41993i = "";
            aVar.f41994j = 0;
            aVar.f41995k = 0;
            aVar.f41996l = 0;
            aVar.f41997m = 0;
            aVar.f41998n = "";
            aVar.f41999o = false;
            aVar.f42000p = CalendarEvent.Category.DEFAULT_CATEGORY;
            aVar.f42001q = "";
            aVar.f42002r = CalendarEventAttendee.Status.ACCEPT;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f41985a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f41986b = ResourceContactPerson.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            try {
                                aVar.f41987c = UserAccessibility.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 4:
                            aVar.f41988d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f41989e = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            aVar.f41990f = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 7:
                            aVar.f41991g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f41992h = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 9:
                            aVar.f41993i = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 10:
                            aVar.f41994j = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 11:
                            aVar.f41995k = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f41996l = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 13:
                            aVar.f41997m = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 14:
                            aVar.f41998n = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 15:
                            aVar.f41999o = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 16:
                            try {
                                aVar.f42000p = CalendarEvent.Category.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 17:
                            aVar.f42001q = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 18:
                            try {
                                aVar.f42002r = CalendarEventAttendee.Status.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                break;
                            }
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

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, RoomViewInstance roomViewInstance) throws IOException {
            if (roomViewInstance.resource_calendar_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, roomViewInstance.resource_calendar_id);
            }
            if (roomViewInstance.resource_contact_person != null) {
                ResourceContactPerson.ADAPTER.encodeWithTag(protoWriter, 2, roomViewInstance.resource_contact_person);
            }
            if (roomViewInstance.current_user_accessibility != null) {
                UserAccessibility.ADAPTER.encodeWithTag(protoWriter, 3, roomViewInstance.current_user_accessibility);
            }
            if (roomViewInstance.event_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, roomViewInstance.event_key);
            }
            if (roomViewInstance.original_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, roomViewInstance.original_time);
            }
            if (roomViewInstance.start_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, roomViewInstance.start_time);
            }
            if (roomViewInstance.start_timezone != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, roomViewInstance.start_timezone);
            }
            if (roomViewInstance.end_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 8, roomViewInstance.end_time);
            }
            if (roomViewInstance.end_timezone != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, roomViewInstance.end_timezone);
            }
            if (roomViewInstance.start_day != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 10, roomViewInstance.start_day);
            }
            if (roomViewInstance.end_day != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 11, roomViewInstance.end_day);
            }
            if (roomViewInstance.start_minute != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 12, roomViewInstance.start_minute);
            }
            if (roomViewInstance.end_minute != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 13, roomViewInstance.end_minute);
            }
            if (roomViewInstance.summary != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 14, roomViewInstance.summary);
            }
            if (roomViewInstance.is_all_day != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 15, roomViewInstance.is_all_day);
            }
            if (roomViewInstance.category != null) {
                CalendarEvent.Category.ADAPTER.encodeWithTag(protoWriter, 16, roomViewInstance.category);
            }
            if (roomViewInstance.current_user_accessible_calendar_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 17, roomViewInstance.current_user_accessible_calendar_id);
            }
            if (roomViewInstance.reservation_status != null) {
                CalendarEventAttendee.Status.ADAPTER.encodeWithTag(protoWriter, 18, roomViewInstance.reservation_status);
            }
            protoWriter.writeBytes(roomViewInstance.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.RoomViewInstance$a */
    public static final class C15986a extends Message.Builder<RoomViewInstance, C15986a> {

        /* renamed from: a */
        public String f41985a;

        /* renamed from: b */
        public ResourceContactPerson f41986b;

        /* renamed from: c */
        public UserAccessibility f41987c;

        /* renamed from: d */
        public String f41988d;

        /* renamed from: e */
        public Long f41989e;

        /* renamed from: f */
        public Long f41990f;

        /* renamed from: g */
        public String f41991g;

        /* renamed from: h */
        public Long f41992h;

        /* renamed from: i */
        public String f41993i;

        /* renamed from: j */
        public Integer f41994j;

        /* renamed from: k */
        public Integer f41995k;

        /* renamed from: l */
        public Integer f41996l;

        /* renamed from: m */
        public Integer f41997m;

        /* renamed from: n */
        public String f41998n;

        /* renamed from: o */
        public Boolean f41999o;

        /* renamed from: p */
        public CalendarEvent.Category f42000p;

        /* renamed from: q */
        public String f42001q;

        /* renamed from: r */
        public CalendarEventAttendee.Status f42002r;

        /* renamed from: a */
        public RoomViewInstance build() {
            return new RoomViewInstance(this.f41985a, this.f41986b, this.f41987c, this.f41988d, this.f41989e, this.f41990f, this.f41991g, this.f41992h, this.f41993i, this.f41994j, this.f41995k, this.f41996l, this.f41997m, this.f41998n, this.f41999o, this.f42000p, this.f42001q, this.f42002r, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15986a newBuilder() {
        C15986a aVar = new C15986a();
        aVar.f41985a = this.resource_calendar_id;
        aVar.f41986b = this.resource_contact_person;
        aVar.f41987c = this.current_user_accessibility;
        aVar.f41988d = this.event_key;
        aVar.f41989e = this.original_time;
        aVar.f41990f = this.start_time;
        aVar.f41991g = this.start_timezone;
        aVar.f41992h = this.end_time;
        aVar.f41993i = this.end_timezone;
        aVar.f41994j = this.start_day;
        aVar.f41995k = this.end_day;
        aVar.f41996l = this.start_minute;
        aVar.f41997m = this.end_minute;
        aVar.f41998n = this.summary;
        aVar.f41999o = this.is_all_day;
        aVar.f42000p = this.category;
        aVar.f42001q = this.current_user_accessible_calendar_id;
        aVar.f42002r = this.reservation_status;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "RoomViewInstance");
        StringBuilder sb = new StringBuilder();
        if (this.resource_calendar_id != null) {
            sb.append(", resource_calendar_id=");
            sb.append(this.resource_calendar_id);
        }
        if (this.resource_contact_person != null) {
            sb.append(", resource_contact_person=");
            sb.append(this.resource_contact_person);
        }
        if (this.current_user_accessibility != null) {
            sb.append(", current_user_accessibility=");
            sb.append(this.current_user_accessibility);
        }
        if (this.event_key != null) {
            sb.append(", event_key=");
            sb.append(this.event_key);
        }
        if (this.original_time != null) {
            sb.append(", original_time=");
            sb.append(this.original_time);
        }
        if (this.start_time != null) {
            sb.append(", start_time=");
            sb.append(this.start_time);
        }
        if (this.start_timezone != null) {
            sb.append(", start_timezone=");
            sb.append(this.start_timezone);
        }
        if (this.end_time != null) {
            sb.append(", end_time=");
            sb.append(this.end_time);
        }
        if (this.end_timezone != null) {
            sb.append(", end_timezone=");
            sb.append(this.end_timezone);
        }
        if (this.start_day != null) {
            sb.append(", start_day=");
            sb.append(this.start_day);
        }
        if (this.end_day != null) {
            sb.append(", end_day=");
            sb.append(this.end_day);
        }
        if (this.start_minute != null) {
            sb.append(", start_minute=");
            sb.append(this.start_minute);
        }
        if (this.end_minute != null) {
            sb.append(", end_minute=");
            sb.append(this.end_minute);
        }
        if (this.summary != null) {
            sb.append(", summary=");
            sb.append(this.summary);
        }
        if (this.is_all_day != null) {
            sb.append(", is_all_day=");
            sb.append(this.is_all_day);
        }
        if (this.category != null) {
            sb.append(", category=");
            sb.append(this.category);
        }
        if (this.current_user_accessible_calendar_id != null) {
            sb.append(", current_user_accessible_calendar_id=");
            sb.append(this.current_user_accessible_calendar_id);
        }
        if (this.reservation_status != null) {
            sb.append(", reservation_status=");
            sb.append(this.reservation_status);
        }
        StringBuilder replace = sb.replace(0, 2, "RoomViewInstance{");
        replace.append('}');
        return replace.toString();
    }

    public RoomViewInstance(String str, ResourceContactPerson resourceContactPerson, UserAccessibility userAccessibility, String str2, Long l, Long l2, String str3, Long l3, String str4, Integer num, Integer num2, Integer num3, Integer num4, String str5, Boolean bool, CalendarEvent.Category category2, String str6, CalendarEventAttendee.Status status) {
        this(str, resourceContactPerson, userAccessibility, str2, l, l2, str3, l3, str4, num, num2, num3, num4, str5, bool, category2, str6, status, ByteString.EMPTY);
    }

    public RoomViewInstance(String str, ResourceContactPerson resourceContactPerson, UserAccessibility userAccessibility, String str2, Long l, Long l2, String str3, Long l3, String str4, Integer num, Integer num2, Integer num3, Integer num4, String str5, Boolean bool, CalendarEvent.Category category2, String str6, CalendarEventAttendee.Status status, ByteString byteString) {
        super(ADAPTER, byteString);
        this.resource_calendar_id = str;
        this.resource_contact_person = resourceContactPerson;
        this.current_user_accessibility = userAccessibility;
        this.event_key = str2;
        this.original_time = l;
        this.start_time = l2;
        this.start_timezone = str3;
        this.end_time = l3;
        this.end_timezone = str4;
        this.start_day = num;
        this.end_day = num2;
        this.start_minute = num3;
        this.end_minute = num4;
        this.summary = str5;
        this.is_all_day = bool;
        this.category = category2;
        this.current_user_accessible_calendar_id = str6;
        this.reservation_status = status;
    }
}
