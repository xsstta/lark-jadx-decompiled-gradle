package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.calendar.v1.Calendar;
import com.bytedance.lark.pb.calendar.v1.CalendarEventAttendee;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class SearchCalendarEventContent extends Message<SearchCalendarEventContent, C16018a> {
    public static final ProtoAdapter<SearchCalendarEventContent> ADAPTER = new C16019b();
    public static final Integer DEFAULT_CALENDAR_COLOR_INDEX = 0;
    public static final Calendar.Type DEFAULT_CALENDAR_TYPE = Calendar.Type.UNKNOWN_TYPE;
    public static final Integer DEFAULT_EVENT_COLOR_INDEX = 0;
    public static final Boolean DEFAULT_IS_ALL_DAY = false;
    public static final Boolean DEFAULT_IS_CROSS_TENANT = false;
    public static final Long DEFAULT_ORIGINAL_TIME = 0L;
    public static final CalendarEventAttendee.Status DEFAULT_SELF_ATTENDEE_STATUS = CalendarEventAttendee.Status.NEEDS_ACTION;
    private static final long serialVersionUID = 0;
    public final String attendee;
    public final Integer calendar_color_index;
    public final String calendar_id;
    public final Calendar.Type calendar_type;
    public final String creator;
    public final String description;
    public final Integer event_color_index;
    public final List<EventHighLight> event_highlights;
    public final Boolean is_all_day;
    public final Boolean is_cross_tenant;
    public final String key;
    public final String location;
    public final String organizer;
    public final Long original_time;
    public final String owner;
    public final String resource;
    public final CalendarEventAttendee.Status self_attendee_status;
    public final String start_timezone;
    public final String summary;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.SearchCalendarEventContent$b */
    private static final class C16019b extends ProtoAdapter<SearchCalendarEventContent> {
        C16019b() {
            super(FieldEncoding.LENGTH_DELIMITED, SearchCalendarEventContent.class);
        }

        /* renamed from: a */
        public int encodedSize(SearchCalendarEventContent searchCalendarEventContent) {
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
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, searchCalendarEventContent.calendar_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, searchCalendarEventContent.key) + ProtoAdapter.INT64.encodedSizeWithTag(3, searchCalendarEventContent.original_time) + ProtoAdapter.STRING.encodedSizeWithTag(4, searchCalendarEventContent.summary);
            int i14 = 0;
            if (searchCalendarEventContent.attendee != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(5, searchCalendarEventContent.attendee);
            } else {
                i = 0;
            }
            int i15 = encodedSizeWithTag + i;
            if (searchCalendarEventContent.organizer != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(6, searchCalendarEventContent.organizer);
            } else {
                i2 = 0;
            }
            int i16 = i15 + i2;
            if (searchCalendarEventContent.resource != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(7, searchCalendarEventContent.resource);
            } else {
                i3 = 0;
            }
            int i17 = i16 + i3;
            if (searchCalendarEventContent.location != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(8, searchCalendarEventContent.location);
            } else {
                i4 = 0;
            }
            int i18 = i17 + i4;
            if (searchCalendarEventContent.description != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(9, searchCalendarEventContent.description);
            } else {
                i5 = 0;
            }
            int encodedSizeWithTag2 = i18 + i5 + EventHighLight.ADAPTER.asRepeated().encodedSizeWithTag(10, searchCalendarEventContent.event_highlights);
            if (searchCalendarEventContent.owner != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(11, searchCalendarEventContent.owner);
            } else {
                i6 = 0;
            }
            int i19 = encodedSizeWithTag2 + i6;
            if (searchCalendarEventContent.self_attendee_status != null) {
                i7 = CalendarEventAttendee.Status.ADAPTER.encodedSizeWithTag(12, searchCalendarEventContent.self_attendee_status);
            } else {
                i7 = 0;
            }
            int i20 = i19 + i7;
            if (searchCalendarEventContent.event_color_index != null) {
                i8 = ProtoAdapter.INT32.encodedSizeWithTag(13, searchCalendarEventContent.event_color_index);
            } else {
                i8 = 0;
            }
            int i21 = i20 + i8;
            if (searchCalendarEventContent.calendar_color_index != null) {
                i9 = ProtoAdapter.INT32.encodedSizeWithTag(14, searchCalendarEventContent.calendar_color_index);
            } else {
                i9 = 0;
            }
            int i22 = i21 + i9;
            if (searchCalendarEventContent.is_all_day != null) {
                i10 = ProtoAdapter.BOOL.encodedSizeWithTag(15, searchCalendarEventContent.is_all_day);
            } else {
                i10 = 0;
            }
            int i23 = i22 + i10;
            if (searchCalendarEventContent.calendar_type != null) {
                i11 = Calendar.Type.ADAPTER.encodedSizeWithTag(16, searchCalendarEventContent.calendar_type);
            } else {
                i11 = 0;
            }
            int i24 = i23 + i11;
            if (searchCalendarEventContent.start_timezone != null) {
                i12 = ProtoAdapter.STRING.encodedSizeWithTag(17, searchCalendarEventContent.start_timezone);
            } else {
                i12 = 0;
            }
            int i25 = i24 + i12;
            if (searchCalendarEventContent.is_cross_tenant != null) {
                i13 = ProtoAdapter.BOOL.encodedSizeWithTag(18, searchCalendarEventContent.is_cross_tenant);
            } else {
                i13 = 0;
            }
            int i26 = i25 + i13;
            if (searchCalendarEventContent.creator != null) {
                i14 = ProtoAdapter.STRING.encodedSizeWithTag(19, searchCalendarEventContent.creator);
            }
            return i26 + i14 + searchCalendarEventContent.unknownFields().size();
        }

        /* renamed from: a */
        public SearchCalendarEventContent decode(ProtoReader protoReader) throws IOException {
            C16018a aVar = new C16018a();
            aVar.f42058a = "";
            aVar.f42059b = "";
            aVar.f42060c = 0L;
            aVar.f42061d = "";
            aVar.f42062e = "";
            aVar.f42063f = "";
            aVar.f42064g = "";
            aVar.f42065h = "";
            aVar.f42066i = "";
            aVar.f42068k = "";
            aVar.f42069l = CalendarEventAttendee.Status.NEEDS_ACTION;
            aVar.f42070m = 0;
            aVar.f42071n = 0;
            aVar.f42072o = false;
            aVar.f42073p = Calendar.Type.UNKNOWN_TYPE;
            aVar.f42074q = "";
            aVar.f42075r = false;
            aVar.f42076s = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f42058a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f42059b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f42060c = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            aVar.f42061d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f42062e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f42063f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f42064g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f42065h = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 9:
                            aVar.f42066i = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 10:
                            aVar.f42067j.add(EventHighLight.ADAPTER.decode(protoReader));
                            break;
                        case 11:
                            aVar.f42068k = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            try {
                                aVar.f42069l = CalendarEventAttendee.Status.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 13:
                            aVar.f42070m = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 14:
                            aVar.f42071n = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 15:
                            aVar.f42072o = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 16:
                            try {
                                aVar.f42073p = Calendar.Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 17:
                            aVar.f42074q = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 18:
                            aVar.f42075r = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 19:
                            aVar.f42076s = ProtoAdapter.STRING.decode(protoReader);
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

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SearchCalendarEventContent searchCalendarEventContent) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, searchCalendarEventContent.calendar_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, searchCalendarEventContent.key);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, searchCalendarEventContent.original_time);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, searchCalendarEventContent.summary);
            if (searchCalendarEventContent.attendee != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, searchCalendarEventContent.attendee);
            }
            if (searchCalendarEventContent.organizer != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, searchCalendarEventContent.organizer);
            }
            if (searchCalendarEventContent.resource != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, searchCalendarEventContent.resource);
            }
            if (searchCalendarEventContent.location != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, searchCalendarEventContent.location);
            }
            if (searchCalendarEventContent.description != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, searchCalendarEventContent.description);
            }
            EventHighLight.ADAPTER.asRepeated().encodeWithTag(protoWriter, 10, searchCalendarEventContent.event_highlights);
            if (searchCalendarEventContent.owner != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, searchCalendarEventContent.owner);
            }
            if (searchCalendarEventContent.self_attendee_status != null) {
                CalendarEventAttendee.Status.ADAPTER.encodeWithTag(protoWriter, 12, searchCalendarEventContent.self_attendee_status);
            }
            if (searchCalendarEventContent.event_color_index != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 13, searchCalendarEventContent.event_color_index);
            }
            if (searchCalendarEventContent.calendar_color_index != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 14, searchCalendarEventContent.calendar_color_index);
            }
            if (searchCalendarEventContent.is_all_day != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 15, searchCalendarEventContent.is_all_day);
            }
            if (searchCalendarEventContent.calendar_type != null) {
                Calendar.Type.ADAPTER.encodeWithTag(protoWriter, 16, searchCalendarEventContent.calendar_type);
            }
            if (searchCalendarEventContent.start_timezone != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 17, searchCalendarEventContent.start_timezone);
            }
            if (searchCalendarEventContent.is_cross_tenant != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 18, searchCalendarEventContent.is_cross_tenant);
            }
            if (searchCalendarEventContent.creator != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 19, searchCalendarEventContent.creator);
            }
            protoWriter.writeBytes(searchCalendarEventContent.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.SearchCalendarEventContent$a */
    public static final class C16018a extends Message.Builder<SearchCalendarEventContent, C16018a> {

        /* renamed from: a */
        public String f42058a;

        /* renamed from: b */
        public String f42059b;

        /* renamed from: c */
        public Long f42060c;

        /* renamed from: d */
        public String f42061d;

        /* renamed from: e */
        public String f42062e;

        /* renamed from: f */
        public String f42063f;

        /* renamed from: g */
        public String f42064g;

        /* renamed from: h */
        public String f42065h;

        /* renamed from: i */
        public String f42066i;

        /* renamed from: j */
        public List<EventHighLight> f42067j = Internal.newMutableList();

        /* renamed from: k */
        public String f42068k;

        /* renamed from: l */
        public CalendarEventAttendee.Status f42069l;

        /* renamed from: m */
        public Integer f42070m;

        /* renamed from: n */
        public Integer f42071n;

        /* renamed from: o */
        public Boolean f42072o;

        /* renamed from: p */
        public Calendar.Type f42073p;

        /* renamed from: q */
        public String f42074q;

        /* renamed from: r */
        public Boolean f42075r;

        /* renamed from: s */
        public String f42076s;

        /* renamed from: a */
        public SearchCalendarEventContent build() {
            String str;
            Long l;
            String str2;
            String str3 = this.f42058a;
            if (str3 != null && (str = this.f42059b) != null && (l = this.f42060c) != null && (str2 = this.f42061d) != null) {
                return new SearchCalendarEventContent(str3, str, l, str2, this.f42062e, this.f42063f, this.f42064g, this.f42065h, this.f42066i, this.f42067j, this.f42068k, this.f42069l, this.f42070m, this.f42071n, this.f42072o, this.f42073p, this.f42074q, this.f42075r, this.f42076s, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str3, "calendar_id", this.f42059b, "key", this.f42060c, "original_time", this.f42061d, "summary");
        }
    }

    @Override // com.squareup.wire.Message
    public C16018a newBuilder() {
        C16018a aVar = new C16018a();
        aVar.f42058a = this.calendar_id;
        aVar.f42059b = this.key;
        aVar.f42060c = this.original_time;
        aVar.f42061d = this.summary;
        aVar.f42062e = this.attendee;
        aVar.f42063f = this.organizer;
        aVar.f42064g = this.resource;
        aVar.f42065h = this.location;
        aVar.f42066i = this.description;
        aVar.f42067j = Internal.copyOf("event_highlights", this.event_highlights);
        aVar.f42068k = this.owner;
        aVar.f42069l = this.self_attendee_status;
        aVar.f42070m = this.event_color_index;
        aVar.f42071n = this.calendar_color_index;
        aVar.f42072o = this.is_all_day;
        aVar.f42073p = this.calendar_type;
        aVar.f42074q = this.start_timezone;
        aVar.f42075r = this.is_cross_tenant;
        aVar.f42076s = this.creator;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "SearchCalendarEventContent");
        StringBuilder sb = new StringBuilder();
        sb.append(", calendar_id=");
        sb.append(this.calendar_id);
        sb.append(", key=");
        sb.append(this.key);
        sb.append(", original_time=");
        sb.append(this.original_time);
        sb.append(", summary=");
        sb.append(this.summary);
        if (this.attendee != null) {
            sb.append(", attendee=");
            sb.append(this.attendee);
        }
        if (this.organizer != null) {
            sb.append(", organizer=");
            sb.append(this.organizer);
        }
        if (this.resource != null) {
            sb.append(", resource=");
            sb.append(this.resource);
        }
        if (this.location != null) {
            sb.append(", location=");
            sb.append(this.location);
        }
        if (this.description != null) {
            sb.append(", description=");
            sb.append(this.description);
        }
        if (!this.event_highlights.isEmpty()) {
            sb.append(", event_highlights=");
            sb.append(this.event_highlights);
        }
        if (this.owner != null) {
            sb.append(", owner=");
            sb.append(this.owner);
        }
        if (this.self_attendee_status != null) {
            sb.append(", self_attendee_status=");
            sb.append(this.self_attendee_status);
        }
        if (this.event_color_index != null) {
            sb.append(", event_color_index=");
            sb.append(this.event_color_index);
        }
        if (this.calendar_color_index != null) {
            sb.append(", calendar_color_index=");
            sb.append(this.calendar_color_index);
        }
        if (this.is_all_day != null) {
            sb.append(", is_all_day=");
            sb.append(this.is_all_day);
        }
        if (this.calendar_type != null) {
            sb.append(", calendar_type=");
            sb.append(this.calendar_type);
        }
        if (this.start_timezone != null) {
            sb.append(", start_timezone=");
            sb.append(this.start_timezone);
        }
        if (this.is_cross_tenant != null) {
            sb.append(", is_cross_tenant=");
            sb.append(this.is_cross_tenant);
        }
        if (this.creator != null) {
            sb.append(", creator=");
            sb.append(this.creator);
        }
        StringBuilder replace = sb.replace(0, 2, "SearchCalendarEventContent{");
        replace.append('}');
        return replace.toString();
    }

    public SearchCalendarEventContent(String str, String str2, Long l, String str3, String str4, String str5, String str6, String str7, String str8, List<EventHighLight> list, String str9, CalendarEventAttendee.Status status, Integer num, Integer num2, Boolean bool, Calendar.Type type, String str10, Boolean bool2, String str11) {
        this(str, str2, l, str3, str4, str5, str6, str7, str8, list, str9, status, num, num2, bool, type, str10, bool2, str11, ByteString.EMPTY);
    }

    public SearchCalendarEventContent(String str, String str2, Long l, String str3, String str4, String str5, String str6, String str7, String str8, List<EventHighLight> list, String str9, CalendarEventAttendee.Status status, Integer num, Integer num2, Boolean bool, Calendar.Type type, String str10, Boolean bool2, String str11, ByteString byteString) {
        super(ADAPTER, byteString);
        this.calendar_id = str;
        this.key = str2;
        this.original_time = l;
        this.summary = str3;
        this.attendee = str4;
        this.organizer = str5;
        this.resource = str6;
        this.location = str7;
        this.description = str8;
        this.event_highlights = Internal.immutableCopyOf("event_highlights", list);
        this.owner = str9;
        this.self_attendee_status = status;
        this.event_color_index = num;
        this.calendar_color_index = num2;
        this.is_all_day = bool;
        this.calendar_type = type;
        this.start_timezone = str10;
        this.is_cross_tenant = bool2;
        this.creator = str11;
    }
}
