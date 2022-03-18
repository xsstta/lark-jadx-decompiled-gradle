package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Chatter;
import com.bytedance.lark.pb.basic.v1.ChatterMeetingStatus;
import com.bytedance.lark.pb.basic.v1.RoomMeetingStatus;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okio.ByteString;

public final class CalendarInfo extends Message<CalendarInfo, C50495a> {
    public static final ProtoAdapter<CalendarInfo> ADAPTER = new C50496b();
    public static final Boolean DEFAULT_CAN_ENTER_OR_CREATE_GROUP = false;
    public static final EventType DEFAULT_EVENT_TYPE = EventType.UNKNOWN_EVENT_TYPE;
    public static final Long DEFAULT_GROUP_ID = 0L;
    public static final Boolean DEFAULT_IS_ALL_DAY = false;
    public static final Long DEFAULT_THE_EVENT_END_TIME = 0L;
    public static final Long DEFAULT_THE_EVENT_START_TIME = 0L;
    public static final Integer DEFAULT_TOTAL = 0;
    public static final Long DEFAULT_WHOLE_EVENT_END_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final List<CalendarLocation> calendar_locations;
    public final Boolean can_enter_or_create_group;
    public final Map<String, ChatterMeetingStatus> chatter_meeting_status;
    public final String creator_id;
    public final String description;
    public final EventType event_type;
    public final Long group_id;
    public final Boolean is_all_day;
    public final String organizer_id;
    public final Map<String, RoomMeetingStatus> room_meeting_status;
    public final Map<String, CalendarAcceptStatus> room_status;
    public final Map<String, Room> rooms;
    public final Map<String, String> subtitles;
    public final Long the_event_end_time;
    public final Long the_event_start_time;
    public final String topic;
    public final Integer total;
    public final Map<String, CalendarAcceptStatus> user_status;
    public final Map<String, Chatter> users;
    public final Map<String, Boolean> version_support;
    public final Map<String, Room> view_rooms;
    public final Long whole_event_end_time;

    public enum CalendarAcceptStatus implements WireEnum {
        UNKNOWN_STATUS(0),
        ACCEPT(1),
        REJECT(2),
        TBD(3);
        
        public static final ProtoAdapter<CalendarAcceptStatus> ADAPTER = ProtoAdapter.newEnumAdapter(CalendarAcceptStatus.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static CalendarAcceptStatus fromValue(int i) {
            if (i == 0) {
                return UNKNOWN_STATUS;
            }
            if (i == 1) {
                return ACCEPT;
            }
            if (i == 2) {
                return REJECT;
            }
            if (i != 3) {
                return null;
            }
            return TBD;
        }

        private CalendarAcceptStatus(int i) {
            this.value = i;
        }
    }

    public enum EventType implements WireEnum {
        UNKNOWN_EVENT_TYPE(0),
        SINGLE(1),
        CYCLE(2);
        
        public static final ProtoAdapter<EventType> ADAPTER = ProtoAdapter.newEnumAdapter(EventType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static EventType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN_EVENT_TYPE;
            }
            if (i == 1) {
                return SINGLE;
            }
            if (i != 2) {
                return null;
            }
            return CYCLE;
        }

        private EventType(int i) {
            this.value = i;
        }
    }

    public static final class CalendarLocation extends Message<CalendarLocation, C50493a> {
        public static final ProtoAdapter<CalendarLocation> ADAPTER = new C50494b();
        private static final long serialVersionUID = 0;
        public final String address;
        public final String name;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.CalendarInfo$CalendarLocation$b */
        private static final class C50494b extends ProtoAdapter<CalendarLocation> {
            C50494b() {
                super(FieldEncoding.LENGTH_DELIMITED, CalendarLocation.class);
            }

            /* renamed from: a */
            public int encodedSize(CalendarLocation calendarLocation) {
                int i;
                int i2 = 0;
                if (calendarLocation.name != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, calendarLocation.name);
                } else {
                    i = 0;
                }
                if (calendarLocation.address != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, calendarLocation.address);
                }
                return i + i2 + calendarLocation.unknownFields().size();
            }

            /* renamed from: a */
            public CalendarLocation decode(ProtoReader protoReader) throws IOException {
                C50493a aVar = new C50493a();
                aVar.f126051a = "";
                aVar.f126052b = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f126051a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f126052b = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, CalendarLocation calendarLocation) throws IOException {
                if (calendarLocation.name != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, calendarLocation.name);
                }
                if (calendarLocation.address != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, calendarLocation.address);
                }
                protoWriter.writeBytes(calendarLocation.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.CalendarInfo$CalendarLocation$a */
        public static final class C50493a extends Message.Builder<CalendarLocation, C50493a> {

            /* renamed from: a */
            public String f126051a;

            /* renamed from: b */
            public String f126052b;

            /* renamed from: a */
            public CalendarLocation build() {
                return new CalendarLocation(this.f126051a, this.f126052b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50493a newBuilder() {
            C50493a aVar = new C50493a();
            aVar.f126051a = this.name;
            aVar.f126052b = this.address;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "CalendarLocation");
            StringBuilder sb = new StringBuilder();
            if (this.name != null) {
                sb.append(", name=");
                sb.append(this.name);
            }
            if (this.address != null) {
                sb.append(", address=");
                sb.append(this.address);
            }
            StringBuilder replace = sb.replace(0, 2, "CalendarLocation{");
            replace.append('}');
            return replace.toString();
        }

        public CalendarLocation(String str, String str2) {
            this(str, str2, ByteString.EMPTY);
        }

        public CalendarLocation(String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.name = str;
            this.address = str2;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.CalendarInfo$a */
    public static final class C50495a extends Message.Builder<CalendarInfo, C50495a> {

        /* renamed from: a */
        public String f126053a;

        /* renamed from: b */
        public Long f126054b;

        /* renamed from: c */
        public Long f126055c;

        /* renamed from: d */
        public Long f126056d;

        /* renamed from: e */
        public EventType f126057e;

        /* renamed from: f */
        public String f126058f;

        /* renamed from: g */
        public Map<String, Chatter> f126059g = Internal.newMutableMap();

        /* renamed from: h */
        public Map<String, Room> f126060h = Internal.newMutableMap();

        /* renamed from: i */
        public Map<String, ChatterMeetingStatus> f126061i = Internal.newMutableMap();

        /* renamed from: j */
        public Map<String, RoomMeetingStatus> f126062j = Internal.newMutableMap();

        /* renamed from: k */
        public Map<String, CalendarAcceptStatus> f126063k = Internal.newMutableMap();

        /* renamed from: l */
        public Map<String, CalendarAcceptStatus> f126064l = Internal.newMutableMap();

        /* renamed from: m */
        public Map<String, String> f126065m = Internal.newMutableMap();

        /* renamed from: n */
        public Integer f126066n;

        /* renamed from: o */
        public Map<String, Boolean> f126067o = Internal.newMutableMap();

        /* renamed from: p */
        public Boolean f126068p;

        /* renamed from: q */
        public Boolean f126069q;

        /* renamed from: r */
        public String f126070r;

        /* renamed from: s */
        public String f126071s;

        /* renamed from: t */
        public List<CalendarLocation> f126072t = Internal.newMutableList();

        /* renamed from: u */
        public Long f126073u;

        /* renamed from: v */
        public Map<String, Room> f126074v = Internal.newMutableMap();

        /* renamed from: a */
        public CalendarInfo build() {
            return new CalendarInfo(this.f126053a, this.f126054b, this.f126055c, this.f126056d, this.f126057e, this.f126058f, this.f126059g, this.f126060h, this.f126061i, this.f126062j, this.f126063k, this.f126064l, this.f126065m, this.f126066n, this.f126067o, this.f126068p, this.f126069q, this.f126070r, this.f126071s, this.f126072t, this.f126073u, this.f126074v, super.buildUnknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.CalendarInfo$b */
    private static final class C50496b extends ProtoAdapter<CalendarInfo> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, Chatter>> f126075a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, Chatter.ADAPTER);

        /* renamed from: b */
        private final ProtoAdapter<Map<String, Room>> f126076b = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, Room.ADAPTER);

        /* renamed from: c */
        private final ProtoAdapter<Map<String, ChatterMeetingStatus>> f126077c = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ChatterMeetingStatus.ADAPTER);

        /* renamed from: d */
        private final ProtoAdapter<Map<String, RoomMeetingStatus>> f126078d = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, RoomMeetingStatus.ADAPTER);

        /* renamed from: e */
        private final ProtoAdapter<Map<String, CalendarAcceptStatus>> f126079e = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, CalendarAcceptStatus.ADAPTER);

        /* renamed from: f */
        private final ProtoAdapter<Map<String, CalendarAcceptStatus>> f126080f = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, CalendarAcceptStatus.ADAPTER);

        /* renamed from: g */
        private final ProtoAdapter<Map<String, String>> f126081g = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        /* renamed from: h */
        private final ProtoAdapter<Map<String, Boolean>> f126082h = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.BOOL);

        /* renamed from: i */
        private final ProtoAdapter<Map<String, Room>> f126083i = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, Room.ADAPTER);

        C50496b() {
            super(FieldEncoding.LENGTH_DELIMITED, CalendarInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(CalendarInfo calendarInfo) {
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
            int i12 = 0;
            if (calendarInfo.topic != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, calendarInfo.topic);
            } else {
                i = 0;
            }
            if (calendarInfo.the_event_start_time != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, calendarInfo.the_event_start_time);
            } else {
                i2 = 0;
            }
            int i13 = i + i2;
            if (calendarInfo.the_event_end_time != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, calendarInfo.the_event_end_time);
            } else {
                i3 = 0;
            }
            int i14 = i13 + i3;
            if (calendarInfo.whole_event_end_time != null) {
                i4 = ProtoAdapter.INT64.encodedSizeWithTag(4, calendarInfo.whole_event_end_time);
            } else {
                i4 = 0;
            }
            int i15 = i14 + i4;
            if (calendarInfo.event_type != null) {
                i5 = EventType.ADAPTER.encodedSizeWithTag(5, calendarInfo.event_type);
            } else {
                i5 = 0;
            }
            int i16 = i15 + i5;
            if (calendarInfo.description != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(6, calendarInfo.description);
            } else {
                i6 = 0;
            }
            int encodedSizeWithTag = i16 + i6 + this.f126075a.encodedSizeWithTag(7, calendarInfo.users) + this.f126076b.encodedSizeWithTag(8, calendarInfo.rooms) + this.f126077c.encodedSizeWithTag(9, calendarInfo.chatter_meeting_status) + this.f126078d.encodedSizeWithTag(10, calendarInfo.room_meeting_status) + this.f126079e.encodedSizeWithTag(11, calendarInfo.user_status) + this.f126080f.encodedSizeWithTag(12, calendarInfo.room_status) + this.f126081g.encodedSizeWithTag(13, calendarInfo.subtitles);
            if (calendarInfo.total != null) {
                i7 = ProtoAdapter.INT32.encodedSizeWithTag(14, calendarInfo.total);
            } else {
                i7 = 0;
            }
            int encodedSizeWithTag2 = encodedSizeWithTag + i7 + this.f126082h.encodedSizeWithTag(15, calendarInfo.version_support);
            if (calendarInfo.can_enter_or_create_group != null) {
                i8 = ProtoAdapter.BOOL.encodedSizeWithTag(16, calendarInfo.can_enter_or_create_group);
            } else {
                i8 = 0;
            }
            int i17 = encodedSizeWithTag2 + i8;
            if (calendarInfo.is_all_day != null) {
                i9 = ProtoAdapter.BOOL.encodedSizeWithTag(17, calendarInfo.is_all_day);
            } else {
                i9 = 0;
            }
            int i18 = i17 + i9;
            if (calendarInfo.creator_id != null) {
                i10 = ProtoAdapter.STRING.encodedSizeWithTag(18, calendarInfo.creator_id);
            } else {
                i10 = 0;
            }
            int i19 = i18 + i10;
            if (calendarInfo.organizer_id != null) {
                i11 = ProtoAdapter.STRING.encodedSizeWithTag(19, calendarInfo.organizer_id);
            } else {
                i11 = 0;
            }
            int encodedSizeWithTag3 = i19 + i11 + CalendarLocation.ADAPTER.asRepeated().encodedSizeWithTag(20, calendarInfo.calendar_locations);
            if (calendarInfo.group_id != null) {
                i12 = ProtoAdapter.INT64.encodedSizeWithTag(21, calendarInfo.group_id);
            }
            return encodedSizeWithTag3 + i12 + this.f126083i.encodedSizeWithTag(22, calendarInfo.view_rooms) + calendarInfo.unknownFields().size();
        }

        /* renamed from: a */
        public CalendarInfo decode(ProtoReader protoReader) throws IOException {
            C50495a aVar = new C50495a();
            aVar.f126053a = "";
            aVar.f126054b = 0L;
            aVar.f126055c = 0L;
            aVar.f126056d = 0L;
            aVar.f126057e = EventType.UNKNOWN_EVENT_TYPE;
            aVar.f126058f = "";
            aVar.f126066n = 0;
            aVar.f126068p = false;
            aVar.f126069q = false;
            aVar.f126070r = "";
            aVar.f126071s = "";
            aVar.f126073u = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f126053a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f126054b = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            aVar.f126055c = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            aVar.f126056d = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            try {
                                aVar.f126057e = EventType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 6:
                            aVar.f126058f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f126059g.putAll(this.f126075a.decode(protoReader));
                            break;
                        case 8:
                            aVar.f126060h.putAll(this.f126076b.decode(protoReader));
                            break;
                        case 9:
                            aVar.f126061i.putAll(this.f126077c.decode(protoReader));
                            break;
                        case 10:
                            aVar.f126062j.putAll(this.f126078d.decode(protoReader));
                            break;
                        case 11:
                            aVar.f126063k.putAll(this.f126079e.decode(protoReader));
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1:
                            aVar.f126064l.putAll(this.f126080f.decode(protoReader));
                            break;
                        case 13:
                            aVar.f126065m.putAll(this.f126081g.decode(protoReader));
                            break;
                        case 14:
                            aVar.f126066n = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 15:
                            aVar.f126067o.putAll(this.f126082h.decode(protoReader));
                            break;
                        case 16:
                            aVar.f126068p = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 17:
                            aVar.f126069q = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 18:
                            aVar.f126070r = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 19:
                            aVar.f126071s = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 20:
                            aVar.f126072t.add(CalendarLocation.ADAPTER.decode(protoReader));
                            break;
                        case 21:
                            aVar.f126073u = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 22:
                            aVar.f126074v.putAll(this.f126083i.decode(protoReader));
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
        public void encode(ProtoWriter protoWriter, CalendarInfo calendarInfo) throws IOException {
            if (calendarInfo.topic != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, calendarInfo.topic);
            }
            if (calendarInfo.the_event_start_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, calendarInfo.the_event_start_time);
            }
            if (calendarInfo.the_event_end_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, calendarInfo.the_event_end_time);
            }
            if (calendarInfo.whole_event_end_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, calendarInfo.whole_event_end_time);
            }
            if (calendarInfo.event_type != null) {
                EventType.ADAPTER.encodeWithTag(protoWriter, 5, calendarInfo.event_type);
            }
            if (calendarInfo.description != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, calendarInfo.description);
            }
            this.f126075a.encodeWithTag(protoWriter, 7, calendarInfo.users);
            this.f126076b.encodeWithTag(protoWriter, 8, calendarInfo.rooms);
            this.f126077c.encodeWithTag(protoWriter, 9, calendarInfo.chatter_meeting_status);
            this.f126078d.encodeWithTag(protoWriter, 10, calendarInfo.room_meeting_status);
            this.f126079e.encodeWithTag(protoWriter, 11, calendarInfo.user_status);
            this.f126080f.encodeWithTag(protoWriter, 12, calendarInfo.room_status);
            this.f126081g.encodeWithTag(protoWriter, 13, calendarInfo.subtitles);
            if (calendarInfo.total != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 14, calendarInfo.total);
            }
            this.f126082h.encodeWithTag(protoWriter, 15, calendarInfo.version_support);
            if (calendarInfo.can_enter_or_create_group != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 16, calendarInfo.can_enter_or_create_group);
            }
            if (calendarInfo.is_all_day != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 17, calendarInfo.is_all_day);
            }
            if (calendarInfo.creator_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 18, calendarInfo.creator_id);
            }
            if (calendarInfo.organizer_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 19, calendarInfo.organizer_id);
            }
            CalendarLocation.ADAPTER.asRepeated().encodeWithTag(protoWriter, 20, calendarInfo.calendar_locations);
            if (calendarInfo.group_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 21, calendarInfo.group_id);
            }
            this.f126083i.encodeWithTag(protoWriter, 22, calendarInfo.view_rooms);
            protoWriter.writeBytes(calendarInfo.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50495a newBuilder() {
        C50495a aVar = new C50495a();
        aVar.f126053a = this.topic;
        aVar.f126054b = this.the_event_start_time;
        aVar.f126055c = this.the_event_end_time;
        aVar.f126056d = this.whole_event_end_time;
        aVar.f126057e = this.event_type;
        aVar.f126058f = this.description;
        aVar.f126059g = Internal.copyOf("users", this.users);
        aVar.f126060h = Internal.copyOf("rooms", this.rooms);
        aVar.f126061i = Internal.copyOf("chatter_meeting_status", this.chatter_meeting_status);
        aVar.f126062j = Internal.copyOf("room_meeting_status", this.room_meeting_status);
        aVar.f126063k = Internal.copyOf("user_status", this.user_status);
        aVar.f126064l = Internal.copyOf("room_status", this.room_status);
        aVar.f126065m = Internal.copyOf("subtitles", this.subtitles);
        aVar.f126066n = this.total;
        aVar.f126067o = Internal.copyOf("version_support", this.version_support);
        aVar.f126068p = this.can_enter_or_create_group;
        aVar.f126069q = this.is_all_day;
        aVar.f126070r = this.creator_id;
        aVar.f126071s = this.organizer_id;
        aVar.f126072t = Internal.copyOf("calendar_locations", this.calendar_locations);
        aVar.f126073u = this.group_id;
        aVar.f126074v = Internal.copyOf("view_rooms", this.view_rooms);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "CalendarInfo");
        StringBuilder sb = new StringBuilder();
        if (this.topic != null) {
            sb.append(", topic=");
            sb.append(this.topic);
        }
        if (this.the_event_start_time != null) {
            sb.append(", the_event_start_time=");
            sb.append(this.the_event_start_time);
        }
        if (this.the_event_end_time != null) {
            sb.append(", the_event_end_time=");
            sb.append(this.the_event_end_time);
        }
        if (this.whole_event_end_time != null) {
            sb.append(", whole_event_end_time=");
            sb.append(this.whole_event_end_time);
        }
        if (this.event_type != null) {
            sb.append(", event_type=");
            sb.append(this.event_type);
        }
        if (this.description != null) {
            sb.append(", description=");
            sb.append(this.description);
        }
        if (!this.users.isEmpty()) {
            sb.append(", users=");
            sb.append(this.users);
        }
        if (!this.rooms.isEmpty()) {
            sb.append(", rooms=");
            sb.append(this.rooms);
        }
        if (!this.chatter_meeting_status.isEmpty()) {
            sb.append(", chatter_meeting_status=");
            sb.append(this.chatter_meeting_status);
        }
        if (!this.room_meeting_status.isEmpty()) {
            sb.append(", room_meeting_status=");
            sb.append(this.room_meeting_status);
        }
        if (!this.user_status.isEmpty()) {
            sb.append(", user_status=");
            sb.append(this.user_status);
        }
        if (!this.room_status.isEmpty()) {
            sb.append(", room_status=");
            sb.append(this.room_status);
        }
        if (!this.subtitles.isEmpty()) {
            sb.append(", subtitles=");
            sb.append(this.subtitles);
        }
        if (this.total != null) {
            sb.append(", total=");
            sb.append(this.total);
        }
        if (!this.version_support.isEmpty()) {
            sb.append(", version_support=");
            sb.append(this.version_support);
        }
        if (this.can_enter_or_create_group != null) {
            sb.append(", can_enter_or_create_group=");
            sb.append(this.can_enter_or_create_group);
        }
        if (this.is_all_day != null) {
            sb.append(", is_all_day=");
            sb.append(this.is_all_day);
        }
        if (this.creator_id != null) {
            sb.append(", creator_id=");
            sb.append(this.creator_id);
        }
        if (this.organizer_id != null) {
            sb.append(", organizer_id=");
            sb.append(this.organizer_id);
        }
        if (!this.calendar_locations.isEmpty()) {
            sb.append(", calendar_locations=");
            sb.append(this.calendar_locations);
        }
        if (this.group_id != null) {
            sb.append(", group_id=");
            sb.append(this.group_id);
        }
        if (!this.view_rooms.isEmpty()) {
            sb.append(", view_rooms=");
            sb.append(this.view_rooms);
        }
        StringBuilder replace = sb.replace(0, 2, "CalendarInfo{");
        replace.append('}');
        return replace.toString();
    }

    public CalendarInfo(String str, Long l, Long l2, Long l3, EventType eventType, String str2, Map<String, Chatter> map, Map<String, Room> map2, Map<String, ChatterMeetingStatus> map3, Map<String, RoomMeetingStatus> map4, Map<String, CalendarAcceptStatus> map5, Map<String, CalendarAcceptStatus> map6, Map<String, String> map7, Integer num, Map<String, Boolean> map8, Boolean bool, Boolean bool2, String str3, String str4, List<CalendarLocation> list, Long l4, Map<String, Room> map9) {
        this(str, l, l2, l3, eventType, str2, map, map2, map3, map4, map5, map6, map7, num, map8, bool, bool2, str3, str4, list, l4, map9, ByteString.EMPTY);
    }

    public CalendarInfo(String str, Long l, Long l2, Long l3, EventType eventType, String str2, Map<String, Chatter> map, Map<String, Room> map2, Map<String, ChatterMeetingStatus> map3, Map<String, RoomMeetingStatus> map4, Map<String, CalendarAcceptStatus> map5, Map<String, CalendarAcceptStatus> map6, Map<String, String> map7, Integer num, Map<String, Boolean> map8, Boolean bool, Boolean bool2, String str3, String str4, List<CalendarLocation> list, Long l4, Map<String, Room> map9, ByteString byteString) {
        super(ADAPTER, byteString);
        this.topic = str;
        this.the_event_start_time = l;
        this.the_event_end_time = l2;
        this.whole_event_end_time = l3;
        this.event_type = eventType;
        this.description = str2;
        this.users = Internal.immutableCopyOf("users", map);
        this.rooms = Internal.immutableCopyOf("rooms", map2);
        this.chatter_meeting_status = Internal.immutableCopyOf("chatter_meeting_status", map3);
        this.room_meeting_status = Internal.immutableCopyOf("room_meeting_status", map4);
        this.user_status = Internal.immutableCopyOf("user_status", map5);
        this.room_status = Internal.immutableCopyOf("room_status", map6);
        this.subtitles = Internal.immutableCopyOf("subtitles", map7);
        this.total = num;
        this.version_support = Internal.immutableCopyOf("version_support", map8);
        this.can_enter_or_create_group = bool;
        this.is_all_day = bool2;
        this.creator_id = str3;
        this.organizer_id = str4;
        this.calendar_locations = Internal.immutableCopyOf("calendar_locations", list);
        this.group_id = l4;
        this.view_rooms = Internal.immutableCopyOf("view_rooms", map9);
    }
}
