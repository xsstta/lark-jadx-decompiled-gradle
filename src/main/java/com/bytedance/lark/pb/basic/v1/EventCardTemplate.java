package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.calendar.v1.ConflictType;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okio.ByteString;

public final class EventCardTemplate extends Message<EventCardTemplate, C14935a> {
    public static final ProtoAdapter<EventCardTemplate> ADAPTER = new C14936b();
    public static final Integer DEFAULT_ATTENDEE_COUNT = 0;
    public static final Long DEFAULT_CONFLICT_TIME = 0L;
    public static final ConflictType DEFAULT_CONFLICT_TYPE = ConflictType.NONE;
    public static final Long DEFAULT_END_TIME = 0L;
    public static final Integer DEFAULT_EVENT_TYPE = 0;
    public static final Boolean DEFAULT_IS_ALL_DAY = false;
    public static final Boolean DEFAULT_IS_CROSS_TENANT = false;
    public static final Boolean DEFAULT_IS_OPTIONAL = false;
    public static final Long DEFAULT_ORIGINAL_TIME = 0L;
    public static final Integer DEFAULT_SELF_ATTENDEE_STATUS = 0;
    public static final Long DEFAULT_START_TIME = 0L;
    public static final Integer DEFAULT_TYPE = 0;
    public static final Long DEFAULT_VERSION = 0L;
    private static final long serialVersionUID = 0;
    public final List<String> attendee_chatter_ids;
    public final Integer attendee_count;
    public final String calendar_id;
    public final List<String> chat_ids;
    public final Map<String, String> chat_names;
    public final Long conflict_time;
    public final ConflictType conflict_type;
    public final String description;
    public final Long end_time;
    public final String end_timezone;
    public final Integer event_type;
    public final String id;
    public final List<String> individual_chatter_ids;
    public final Boolean is_all_day;
    public final Boolean is_cross_tenant;
    public final List<Boolean> is_meeting_rooms_disabled;
    public final Boolean is_optional;
    public final String key;
    public final String location;
    public final List<String> meeting_rooms;
    public final Long original_time;
    public final String rrule;
    public final Integer self_attendee_status;
    public final String sender_id;
    public final Long start_time;
    public final String start_timezone;
    public final String summary;
    public final Integer type;
    public final Long version;

    /* renamed from: com.bytedance.lark.pb.basic.v1.EventCardTemplate$b */
    private static final class C14936b extends ProtoAdapter<EventCardTemplate> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f39578a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C14936b() {
            super(FieldEncoding.LENGTH_DELIMITED, EventCardTemplate.class);
        }

        /* renamed from: a */
        public int encodedSize(EventCardTemplate eventCardTemplate) {
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
            int i23 = 0;
            if (eventCardTemplate.summary != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, eventCardTemplate.summary);
            } else {
                i = 0;
            }
            if (eventCardTemplate.sender_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, eventCardTemplate.sender_id);
            } else {
                i2 = 0;
            }
            int i24 = i + i2;
            if (eventCardTemplate.is_optional != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, eventCardTemplate.is_optional);
            } else {
                i3 = 0;
            }
            int i25 = i24 + i3;
            if (eventCardTemplate.start_time != null) {
                i4 = ProtoAdapter.INT64.encodedSizeWithTag(4, eventCardTemplate.start_time);
            } else {
                i4 = 0;
            }
            int i26 = i25 + i4;
            if (eventCardTemplate.end_time != null) {
                i5 = ProtoAdapter.INT64.encodedSizeWithTag(5, eventCardTemplate.end_time);
            } else {
                i5 = 0;
            }
            int i27 = i26 + i5;
            if (eventCardTemplate.rrule != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(6, eventCardTemplate.rrule);
            } else {
                i6 = 0;
            }
            int i28 = i27 + i6;
            if (eventCardTemplate.is_all_day != null) {
                i7 = ProtoAdapter.BOOL.encodedSizeWithTag(7, eventCardTemplate.is_all_day);
            } else {
                i7 = 0;
            }
            int i29 = i28 + i7;
            if (eventCardTemplate.version != null) {
                i8 = ProtoAdapter.INT64.encodedSizeWithTag(8, eventCardTemplate.version);
            } else {
                i8 = 0;
            }
            int i30 = i29 + i8;
            if (eventCardTemplate.start_timezone != null) {
                i9 = ProtoAdapter.STRING.encodedSizeWithTag(9, eventCardTemplate.start_timezone);
            } else {
                i9 = 0;
            }
            int i31 = i30 + i9;
            if (eventCardTemplate.end_timezone != null) {
                i10 = ProtoAdapter.STRING.encodedSizeWithTag(10, eventCardTemplate.end_timezone);
            } else {
                i10 = 0;
            }
            int i32 = i31 + i10;
            if (eventCardTemplate.id != null) {
                i11 = ProtoAdapter.STRING.encodedSizeWithTag(11, eventCardTemplate.id);
            } else {
                i11 = 0;
            }
            int i33 = i32 + i11;
            if (eventCardTemplate.type != null) {
                i12 = ProtoAdapter.INT32.encodedSizeWithTag(12, eventCardTemplate.type);
            } else {
                i12 = 0;
            }
            int i34 = i33 + i12;
            if (eventCardTemplate.key != null) {
                i13 = ProtoAdapter.STRING.encodedSizeWithTag(13, eventCardTemplate.key);
            } else {
                i13 = 0;
            }
            int i35 = i34 + i13;
            if (eventCardTemplate.original_time != null) {
                i14 = ProtoAdapter.INT64.encodedSizeWithTag(14, eventCardTemplate.original_time);
            } else {
                i14 = 0;
            }
            int i36 = i35 + i14;
            if (eventCardTemplate.calendar_id != null) {
                i15 = ProtoAdapter.STRING.encodedSizeWithTag(15, eventCardTemplate.calendar_id);
            } else {
                i15 = 0;
            }
            int encodedSizeWithTag = i36 + i15 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(16, eventCardTemplate.meeting_rooms) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(17, eventCardTemplate.attendee_chatter_ids) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(18, eventCardTemplate.chat_ids);
            if (eventCardTemplate.self_attendee_status != null) {
                i16 = ProtoAdapter.INT32.encodedSizeWithTag(19, eventCardTemplate.self_attendee_status);
            } else {
                i16 = 0;
            }
            int i37 = encodedSizeWithTag + i16;
            if (eventCardTemplate.attendee_count != null) {
                i17 = ProtoAdapter.INT32.encodedSizeWithTag(20, eventCardTemplate.attendee_count);
            } else {
                i17 = 0;
            }
            int i38 = i37 + i17;
            if (eventCardTemplate.location != null) {
                i18 = ProtoAdapter.STRING.encodedSizeWithTag(21, eventCardTemplate.location);
            } else {
                i18 = 0;
            }
            int i39 = i38 + i18;
            if (eventCardTemplate.description != null) {
                i19 = ProtoAdapter.STRING.encodedSizeWithTag(22, eventCardTemplate.description);
            } else {
                i19 = 0;
            }
            int i40 = i39 + i19;
            if (eventCardTemplate.event_type != null) {
                i20 = ProtoAdapter.INT32.encodedSizeWithTag(23, eventCardTemplate.event_type);
            } else {
                i20 = 0;
            }
            int i41 = i40 + i20;
            if (eventCardTemplate.is_cross_tenant != null) {
                i21 = ProtoAdapter.BOOL.encodedSizeWithTag(24, eventCardTemplate.is_cross_tenant);
            } else {
                i21 = 0;
            }
            int encodedSizeWithTag2 = i41 + i21 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(25, eventCardTemplate.individual_chatter_ids) + ProtoAdapter.BOOL.asRepeated().encodedSizeWithTag(26, eventCardTemplate.is_meeting_rooms_disabled);
            if (eventCardTemplate.conflict_type != null) {
                i22 = ConflictType.ADAPTER.encodedSizeWithTag(100, eventCardTemplate.conflict_type);
            } else {
                i22 = 0;
            }
            int i42 = encodedSizeWithTag2 + i22;
            if (eventCardTemplate.conflict_time != null) {
                i23 = ProtoAdapter.INT64.encodedSizeWithTag(101, eventCardTemplate.conflict_time);
            }
            return i42 + i23 + this.f39578a.encodedSizeWithTag(102, eventCardTemplate.chat_names) + eventCardTemplate.unknownFields().size();
        }

        /* renamed from: a */
        public EventCardTemplate decode(ProtoReader protoReader) throws IOException {
            C14935a aVar = new C14935a();
            aVar.f39552a = "";
            aVar.f39553b = "";
            aVar.f39554c = false;
            aVar.f39555d = 0L;
            aVar.f39556e = 0L;
            aVar.f39557f = "";
            aVar.f39558g = false;
            aVar.f39559h = 0L;
            aVar.f39560i = "";
            aVar.f39561j = "";
            aVar.f39562k = "";
            aVar.f39563l = 0;
            aVar.f39564m = "";
            aVar.f39565n = 0L;
            aVar.f39566o = "";
            aVar.f39570s = 0;
            aVar.f39571t = 0;
            aVar.f39572u = "";
            aVar.f39573v = "";
            aVar.f39574w = 0;
            aVar.f39575x = false;
            aVar.f39549A = ConflictType.NONE;
            aVar.f39550B = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f39552a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f39553b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f39554c = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 4:
                            aVar.f39555d = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            aVar.f39556e = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            aVar.f39557f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f39558g = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 8:
                            aVar.f39559h = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 9:
                            aVar.f39560i = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 10:
                            aVar.f39561j = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 11:
                            aVar.f39562k = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f39563l = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 13:
                            aVar.f39564m = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 14:
                            aVar.f39565n = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 15:
                            aVar.f39566o = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 16:
                            aVar.f39567p.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 17:
                            aVar.f39568q.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 18:
                            aVar.f39569r.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 19:
                            aVar.f39570s = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 20:
                            aVar.f39571t = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 21:
                            aVar.f39572u = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 22:
                            aVar.f39573v = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 23:
                            aVar.f39574w = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 24:
                            aVar.f39575x = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case AvailableCode.ERROR_ON_ACTIVITY_RESULT /*{ENCODED_INT: 25}*/:
                            aVar.f39576y.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 26:
                            aVar.f39577z.add(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        default:
                            switch (nextTag) {
                                case 100:
                                    try {
                                        aVar.f39549A = ConflictType.ADAPTER.decode(protoReader);
                                        continue;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                        break;
                                    }
                                case 101:
                                    aVar.f39550B = ProtoAdapter.INT64.decode(protoReader);
                                    continue;
                                case 102:
                                    aVar.f39551C.putAll(this.f39578a.decode(protoReader));
                                    continue;
                                default:
                                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    continue;
                            }
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, EventCardTemplate eventCardTemplate) throws IOException {
            if (eventCardTemplate.summary != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, eventCardTemplate.summary);
            }
            if (eventCardTemplate.sender_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, eventCardTemplate.sender_id);
            }
            if (eventCardTemplate.is_optional != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, eventCardTemplate.is_optional);
            }
            if (eventCardTemplate.start_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, eventCardTemplate.start_time);
            }
            if (eventCardTemplate.end_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, eventCardTemplate.end_time);
            }
            if (eventCardTemplate.rrule != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, eventCardTemplate.rrule);
            }
            if (eventCardTemplate.is_all_day != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, eventCardTemplate.is_all_day);
            }
            if (eventCardTemplate.version != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 8, eventCardTemplate.version);
            }
            if (eventCardTemplate.start_timezone != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, eventCardTemplate.start_timezone);
            }
            if (eventCardTemplate.end_timezone != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, eventCardTemplate.end_timezone);
            }
            if (eventCardTemplate.id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, eventCardTemplate.id);
            }
            if (eventCardTemplate.type != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 12, eventCardTemplate.type);
            }
            if (eventCardTemplate.key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 13, eventCardTemplate.key);
            }
            if (eventCardTemplate.original_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 14, eventCardTemplate.original_time);
            }
            if (eventCardTemplate.calendar_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 15, eventCardTemplate.calendar_id);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 16, eventCardTemplate.meeting_rooms);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 17, eventCardTemplate.attendee_chatter_ids);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 18, eventCardTemplate.chat_ids);
            if (eventCardTemplate.self_attendee_status != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 19, eventCardTemplate.self_attendee_status);
            }
            if (eventCardTemplate.attendee_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 20, eventCardTemplate.attendee_count);
            }
            if (eventCardTemplate.location != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 21, eventCardTemplate.location);
            }
            if (eventCardTemplate.description != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 22, eventCardTemplate.description);
            }
            if (eventCardTemplate.event_type != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 23, eventCardTemplate.event_type);
            }
            if (eventCardTemplate.is_cross_tenant != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 24, eventCardTemplate.is_cross_tenant);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 25, eventCardTemplate.individual_chatter_ids);
            ProtoAdapter.BOOL.asRepeated().encodeWithTag(protoWriter, 26, eventCardTemplate.is_meeting_rooms_disabled);
            if (eventCardTemplate.conflict_type != null) {
                ConflictType.ADAPTER.encodeWithTag(protoWriter, 100, eventCardTemplate.conflict_type);
            }
            if (eventCardTemplate.conflict_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 101, eventCardTemplate.conflict_time);
            }
            this.f39578a.encodeWithTag(protoWriter, 102, eventCardTemplate.chat_names);
            protoWriter.writeBytes(eventCardTemplate.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.EventCardTemplate$a */
    public static final class C14935a extends Message.Builder<EventCardTemplate, C14935a> {

        /* renamed from: A */
        public ConflictType f39549A;

        /* renamed from: B */
        public Long f39550B;

        /* renamed from: C */
        public Map<String, String> f39551C = Internal.newMutableMap();

        /* renamed from: a */
        public String f39552a;

        /* renamed from: b */
        public String f39553b;

        /* renamed from: c */
        public Boolean f39554c;

        /* renamed from: d */
        public Long f39555d;

        /* renamed from: e */
        public Long f39556e;

        /* renamed from: f */
        public String f39557f;

        /* renamed from: g */
        public Boolean f39558g;

        /* renamed from: h */
        public Long f39559h;

        /* renamed from: i */
        public String f39560i;

        /* renamed from: j */
        public String f39561j;

        /* renamed from: k */
        public String f39562k;

        /* renamed from: l */
        public Integer f39563l;

        /* renamed from: m */
        public String f39564m;

        /* renamed from: n */
        public Long f39565n;

        /* renamed from: o */
        public String f39566o;

        /* renamed from: p */
        public List<String> f39567p = Internal.newMutableList();

        /* renamed from: q */
        public List<String> f39568q = Internal.newMutableList();

        /* renamed from: r */
        public List<String> f39569r = Internal.newMutableList();

        /* renamed from: s */
        public Integer f39570s;

        /* renamed from: t */
        public Integer f39571t;

        /* renamed from: u */
        public String f39572u;

        /* renamed from: v */
        public String f39573v;

        /* renamed from: w */
        public Integer f39574w;

        /* renamed from: x */
        public Boolean f39575x;

        /* renamed from: y */
        public List<String> f39576y = Internal.newMutableList();

        /* renamed from: z */
        public List<Boolean> f39577z = Internal.newMutableList();

        /* renamed from: a */
        public EventCardTemplate build() {
            return new EventCardTemplate(this.f39552a, this.f39553b, this.f39554c, this.f39555d, this.f39556e, this.f39557f, this.f39558g, this.f39559h, this.f39560i, this.f39561j, this.f39562k, this.f39563l, this.f39564m, this.f39565n, this.f39566o, this.f39567p, this.f39568q, this.f39569r, this.f39570s, this.f39571t, this.f39572u, this.f39573v, this.f39574w, this.f39575x, this.f39576y, this.f39577z, this.f39549A, this.f39550B, this.f39551C, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C14935a newBuilder() {
        C14935a aVar = new C14935a();
        aVar.f39552a = this.summary;
        aVar.f39553b = this.sender_id;
        aVar.f39554c = this.is_optional;
        aVar.f39555d = this.start_time;
        aVar.f39556e = this.end_time;
        aVar.f39557f = this.rrule;
        aVar.f39558g = this.is_all_day;
        aVar.f39559h = this.version;
        aVar.f39560i = this.start_timezone;
        aVar.f39561j = this.end_timezone;
        aVar.f39562k = this.id;
        aVar.f39563l = this.type;
        aVar.f39564m = this.key;
        aVar.f39565n = this.original_time;
        aVar.f39566o = this.calendar_id;
        aVar.f39567p = Internal.copyOf("meeting_rooms", this.meeting_rooms);
        aVar.f39568q = Internal.copyOf("attendee_chatter_ids", this.attendee_chatter_ids);
        aVar.f39569r = Internal.copyOf("chat_ids", this.chat_ids);
        aVar.f39570s = this.self_attendee_status;
        aVar.f39571t = this.attendee_count;
        aVar.f39572u = this.location;
        aVar.f39573v = this.description;
        aVar.f39574w = this.event_type;
        aVar.f39575x = this.is_cross_tenant;
        aVar.f39576y = Internal.copyOf("individual_chatter_ids", this.individual_chatter_ids);
        aVar.f39577z = Internal.copyOf("is_meeting_rooms_disabled", this.is_meeting_rooms_disabled);
        aVar.f39549A = this.conflict_type;
        aVar.f39550B = this.conflict_time;
        aVar.f39551C = Internal.copyOf("chat_names", this.chat_names);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "EventCardTemplate");
        StringBuilder sb = new StringBuilder();
        if (this.summary != null) {
            sb.append(", summary=");
            sb.append(this.summary);
        }
        if (this.sender_id != null) {
            sb.append(", sender_id=");
            sb.append(this.sender_id);
        }
        if (this.is_optional != null) {
            sb.append(", is_optional=");
            sb.append(this.is_optional);
        }
        if (this.start_time != null) {
            sb.append(", start_time=");
            sb.append(this.start_time);
        }
        if (this.end_time != null) {
            sb.append(", end_time=");
            sb.append(this.end_time);
        }
        if (this.rrule != null) {
            sb.append(", rrule=");
            sb.append(this.rrule);
        }
        if (this.is_all_day != null) {
            sb.append(", is_all_day=");
            sb.append(this.is_all_day);
        }
        if (this.version != null) {
            sb.append(", version=");
            sb.append(this.version);
        }
        if (this.start_timezone != null) {
            sb.append(", start_timezone=");
            sb.append(this.start_timezone);
        }
        if (this.end_timezone != null) {
            sb.append(", end_timezone=");
            sb.append(this.end_timezone);
        }
        if (this.id != null) {
            sb.append(", id=");
            sb.append(this.id);
        }
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.key != null) {
            sb.append(", key=");
            sb.append(this.key);
        }
        if (this.original_time != null) {
            sb.append(", original_time=");
            sb.append(this.original_time);
        }
        if (this.calendar_id != null) {
            sb.append(", calendar_id=");
            sb.append(this.calendar_id);
        }
        if (!this.meeting_rooms.isEmpty()) {
            sb.append(", meeting_rooms=");
            sb.append(this.meeting_rooms);
        }
        if (!this.attendee_chatter_ids.isEmpty()) {
            sb.append(", attendee_chatter_ids=");
            sb.append(this.attendee_chatter_ids);
        }
        if (!this.chat_ids.isEmpty()) {
            sb.append(", chat_ids=");
            sb.append(this.chat_ids);
        }
        if (this.self_attendee_status != null) {
            sb.append(", self_attendee_status=");
            sb.append(this.self_attendee_status);
        }
        if (this.attendee_count != null) {
            sb.append(", attendee_count=");
            sb.append(this.attendee_count);
        }
        if (this.location != null) {
            sb.append(", location=");
            sb.append(this.location);
        }
        if (this.description != null) {
            sb.append(", description=");
            sb.append(this.description);
        }
        if (this.event_type != null) {
            sb.append(", event_type=");
            sb.append(this.event_type);
        }
        if (this.is_cross_tenant != null) {
            sb.append(", is_cross_tenant=");
            sb.append(this.is_cross_tenant);
        }
        if (!this.individual_chatter_ids.isEmpty()) {
            sb.append(", individual_chatter_ids=");
            sb.append(this.individual_chatter_ids);
        }
        if (!this.is_meeting_rooms_disabled.isEmpty()) {
            sb.append(", is_meeting_rooms_disabled=");
            sb.append(this.is_meeting_rooms_disabled);
        }
        if (this.conflict_type != null) {
            sb.append(", conflict_type=");
            sb.append(this.conflict_type);
        }
        if (this.conflict_time != null) {
            sb.append(", conflict_time=");
            sb.append(this.conflict_time);
        }
        if (!this.chat_names.isEmpty()) {
            sb.append(", chat_names=");
            sb.append(this.chat_names);
        }
        StringBuilder replace = sb.replace(0, 2, "EventCardTemplate{");
        replace.append('}');
        return replace.toString();
    }

    public EventCardTemplate(String str, String str2, Boolean bool, Long l, Long l2, String str3, Boolean bool2, Long l3, String str4, String str5, String str6, Integer num, String str7, Long l4, String str8, List<String> list, List<String> list2, List<String> list3, Integer num2, Integer num3, String str9, String str10, Integer num4, Boolean bool3, List<String> list4, List<Boolean> list5, ConflictType conflictType, Long l5, Map<String, String> map) {
        this(str, str2, bool, l, l2, str3, bool2, l3, str4, str5, str6, num, str7, l4, str8, list, list2, list3, num2, num3, str9, str10, num4, bool3, list4, list5, conflictType, l5, map, ByteString.EMPTY);
    }

    public EventCardTemplate(String str, String str2, Boolean bool, Long l, Long l2, String str3, Boolean bool2, Long l3, String str4, String str5, String str6, Integer num, String str7, Long l4, String str8, List<String> list, List<String> list2, List<String> list3, Integer num2, Integer num3, String str9, String str10, Integer num4, Boolean bool3, List<String> list4, List<Boolean> list5, ConflictType conflictType, Long l5, Map<String, String> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.summary = str;
        this.sender_id = str2;
        this.is_optional = bool;
        this.start_time = l;
        this.end_time = l2;
        this.rrule = str3;
        this.is_all_day = bool2;
        this.version = l3;
        this.start_timezone = str4;
        this.end_timezone = str5;
        this.id = str6;
        this.type = num;
        this.key = str7;
        this.original_time = l4;
        this.calendar_id = str8;
        this.meeting_rooms = Internal.immutableCopyOf("meeting_rooms", list);
        this.attendee_chatter_ids = Internal.immutableCopyOf("attendee_chatter_ids", list2);
        this.chat_ids = Internal.immutableCopyOf("chat_ids", list3);
        this.self_attendee_status = num2;
        this.attendee_count = num3;
        this.location = str9;
        this.description = str10;
        this.event_type = num4;
        this.is_cross_tenant = bool3;
        this.individual_chatter_ids = Internal.immutableCopyOf("individual_chatter_ids", list4);
        this.is_meeting_rooms_disabled = Internal.immutableCopyOf("is_meeting_rooms_disabled", list5);
        this.conflict_type = conflictType;
        this.conflict_time = l5;
        this.chat_names = Internal.immutableCopyOf("chat_names", map);
    }
}
