package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.calendar.v1.CalendarEvent;
import com.bytedance.lark.pb.calendar.v1.CalendarEventAttendee;
import com.bytedance.lark.pb.calendar.v1.ConflictType;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.log.IVideoEventLogger;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okio.ByteString;

public final class CalendarEventMessageCard extends Message<CalendarEventMessageCard, C14714a> {
    public static final ProtoAdapter<CalendarEventMessageCard> ADAPTER = new C14715b();
    public static final Integer DEFAULT_ATTENDEE_COUNT = 0;
    public static final EventCardStatus DEFAULT_CARD_STATUS = EventCardStatus.NORMAL;
    public static final Long DEFAULT_CONFLICT_TIME = 0L;
    public static final ConflictType DEFAULT_CONFLICT_TYPE = ConflictType.NONE;
    public static final Long DEFAULT_END_TIME = 0L;
    public static final CalendarEvent.Type DEFAULT_EVENT_TYPE = CalendarEvent.Type.DEFAULT_TYPE;
    public static final Boolean DEFAULT_IS_ALL_DAY = false;
    public static final Boolean DEFAULT_IS_CROSS_TENANT = false;
    public static final Boolean DEFAULT_IS_OPTIONAL = false;
    public static final Long DEFAULT_ORIGINAL_TIME = 0L;
    public static final CalendarEventAttendee.Status DEFAULT_SELF_ATTENDEE_STATUS = CalendarEventAttendee.Status.NEEDS_ACTION;
    public static final Boolean DEFAULT_SHOW_REPLY_INVITER_ENTRY = true;
    public static final Long DEFAULT_START_TIME = 0L;
    public static final Long DEFAULT_VERSION = 0L;
    private static final long serialVersionUID = 0;
    public final Integer attendee_count;
    public final List<String> attendee_user_ids;
    public final String calendar_id;
    public final EventCardInfoForDiff card_info_for_diff;
    public final EventCardStatus card_status;
    public final Map<String, String> chat_names;
    public final Long conflict_time;
    public final ConflictType conflict_type;
    public final RichText desc_rich_text;
    public final String description;
    public final Long end_time;
    public final String end_timezone;
    public final String event_id;
    public final String event_key;
    public final CalendarEvent.Type event_type;
    public final Boolean is_all_day;
    public final Boolean is_cross_tenant;
    public final List<Boolean> is_meeting_rooms_disabled;
    public final Boolean is_optional;
    public final String location;
    public final List<String> meeting_rooms;
    public final Long original_time;
    public final String rrule;
    public final CalendarEventAttendee.Status self_attendee_status;
    public final String sender_user_id;
    public final Boolean show_reply_inviter_entry;
    public final Long start_time;
    public final String start_timezone;
    public final String summary;
    public final String user_invite_operator_id;
    public final Long version;

    public enum EventCardStatus implements WireEnum {
        NORMAL(0),
        INVALID(1);
        
        public static final ProtoAdapter<EventCardStatus> ADAPTER = ProtoAdapter.newEnumAdapter(EventCardStatus.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static EventCardStatus fromValue(int i) {
            if (i == 0) {
                return NORMAL;
            }
            if (i != 1) {
                return null;
            }
            return INVALID;
        }

        private EventCardStatus(int i) {
            this.value = i;
        }
    }

    public static final class EventCardInfoForDiff extends Message<EventCardInfoForDiff, C14712a> {
        public static final ProtoAdapter<EventCardInfoForDiff> ADAPTER = new C14713b();
        public static final Long DEFAULT_END_TIME = 0L;
        public static final Boolean DEFAULT_IS_ALL_DAY = false;
        public static final Long DEFAULT_START_TIME = 0L;
        private static final long serialVersionUID = 0;
        public final String description;
        public final Long end_time;
        public final Boolean is_all_day;
        public final List<Boolean> is_meeting_rooms_disabled;
        public final String location;
        public final List<String> meeting_rooms;
        public final String rrule;
        public final Long start_time;

        /* renamed from: com.bytedance.lark.pb.basic.v1.CalendarEventMessageCard$EventCardInfoForDiff$b */
        private static final class C14713b extends ProtoAdapter<EventCardInfoForDiff> {
            C14713b() {
                super(FieldEncoding.LENGTH_DELIMITED, EventCardInfoForDiff.class);
            }

            /* renamed from: a */
            public int encodedSize(EventCardInfoForDiff eventCardInfoForDiff) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                int i6 = 0;
                if (eventCardInfoForDiff.start_time != null) {
                    i = ProtoAdapter.INT64.encodedSizeWithTag(1, eventCardInfoForDiff.start_time);
                } else {
                    i = 0;
                }
                if (eventCardInfoForDiff.end_time != null) {
                    i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, eventCardInfoForDiff.end_time);
                } else {
                    i2 = 0;
                }
                int i7 = i + i2;
                if (eventCardInfoForDiff.rrule != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, eventCardInfoForDiff.rrule);
                } else {
                    i3 = 0;
                }
                int i8 = i7 + i3;
                if (eventCardInfoForDiff.is_all_day != null) {
                    i4 = ProtoAdapter.BOOL.encodedSizeWithTag(4, eventCardInfoForDiff.is_all_day);
                } else {
                    i4 = 0;
                }
                int i9 = i8 + i4;
                if (eventCardInfoForDiff.description != null) {
                    i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, eventCardInfoForDiff.description);
                } else {
                    i5 = 0;
                }
                int i10 = i9 + i5;
                if (eventCardInfoForDiff.location != null) {
                    i6 = ProtoAdapter.STRING.encodedSizeWithTag(6, eventCardInfoForDiff.location);
                }
                return i10 + i6 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(7, eventCardInfoForDiff.meeting_rooms) + ProtoAdapter.BOOL.asRepeated().encodedSizeWithTag(8, eventCardInfoForDiff.is_meeting_rooms_disabled) + eventCardInfoForDiff.unknownFields().size();
            }

            /* renamed from: a */
            public EventCardInfoForDiff decode(ProtoReader protoReader) throws IOException {
                C14712a aVar = new C14712a();
                aVar.f38894a = 0L;
                aVar.f38895b = 0L;
                aVar.f38896c = "";
                aVar.f38897d = false;
                aVar.f38898e = "";
                aVar.f38899f = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                aVar.f38894a = ProtoAdapter.INT64.decode(protoReader);
                                break;
                            case 2:
                                aVar.f38895b = ProtoAdapter.INT64.decode(protoReader);
                                break;
                            case 3:
                                aVar.f38896c = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 4:
                                aVar.f38897d = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 5:
                                aVar.f38898e = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 6:
                                aVar.f38899f = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 7:
                                aVar.f38900g.add(ProtoAdapter.STRING.decode(protoReader));
                                break;
                            case 8:
                                aVar.f38901h.add(ProtoAdapter.BOOL.decode(protoReader));
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
            public void encode(ProtoWriter protoWriter, EventCardInfoForDiff eventCardInfoForDiff) throws IOException {
                if (eventCardInfoForDiff.start_time != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, eventCardInfoForDiff.start_time);
                }
                if (eventCardInfoForDiff.end_time != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, eventCardInfoForDiff.end_time);
                }
                if (eventCardInfoForDiff.rrule != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, eventCardInfoForDiff.rrule);
                }
                if (eventCardInfoForDiff.is_all_day != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, eventCardInfoForDiff.is_all_day);
                }
                if (eventCardInfoForDiff.description != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, eventCardInfoForDiff.description);
                }
                if (eventCardInfoForDiff.location != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, eventCardInfoForDiff.location);
                }
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 7, eventCardInfoForDiff.meeting_rooms);
                ProtoAdapter.BOOL.asRepeated().encodeWithTag(protoWriter, 8, eventCardInfoForDiff.is_meeting_rooms_disabled);
                protoWriter.writeBytes(eventCardInfoForDiff.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.CalendarEventMessageCard$EventCardInfoForDiff$a */
        public static final class C14712a extends Message.Builder<EventCardInfoForDiff, C14712a> {

            /* renamed from: a */
            public Long f38894a;

            /* renamed from: b */
            public Long f38895b;

            /* renamed from: c */
            public String f38896c;

            /* renamed from: d */
            public Boolean f38897d;

            /* renamed from: e */
            public String f38898e;

            /* renamed from: f */
            public String f38899f;

            /* renamed from: g */
            public List<String> f38900g = Internal.newMutableList();

            /* renamed from: h */
            public List<Boolean> f38901h = Internal.newMutableList();

            /* renamed from: a */
            public EventCardInfoForDiff build() {
                return new EventCardInfoForDiff(this.f38894a, this.f38895b, this.f38896c, this.f38897d, this.f38898e, this.f38899f, this.f38900g, this.f38901h, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C14712a newBuilder() {
            C14712a aVar = new C14712a();
            aVar.f38894a = this.start_time;
            aVar.f38895b = this.end_time;
            aVar.f38896c = this.rrule;
            aVar.f38897d = this.is_all_day;
            aVar.f38898e = this.description;
            aVar.f38899f = this.location;
            aVar.f38900g = Internal.copyOf("meeting_rooms", this.meeting_rooms);
            aVar.f38901h = Internal.copyOf("is_meeting_rooms_disabled", this.is_meeting_rooms_disabled);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "EventCardInfoForDiff");
            StringBuilder sb = new StringBuilder();
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
            if (this.description != null) {
                sb.append(", description=");
                sb.append(this.description);
            }
            if (this.location != null) {
                sb.append(", location=");
                sb.append(this.location);
            }
            if (!this.meeting_rooms.isEmpty()) {
                sb.append(", meeting_rooms=");
                sb.append(this.meeting_rooms);
            }
            if (!this.is_meeting_rooms_disabled.isEmpty()) {
                sb.append(", is_meeting_rooms_disabled=");
                sb.append(this.is_meeting_rooms_disabled);
            }
            StringBuilder replace = sb.replace(0, 2, "EventCardInfoForDiff{");
            replace.append('}');
            return replace.toString();
        }

        public EventCardInfoForDiff(Long l, Long l2, String str, Boolean bool, String str2, String str3, List<String> list, List<Boolean> list2) {
            this(l, l2, str, bool, str2, str3, list, list2, ByteString.EMPTY);
        }

        public EventCardInfoForDiff(Long l, Long l2, String str, Boolean bool, String str2, String str3, List<String> list, List<Boolean> list2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.start_time = l;
            this.end_time = l2;
            this.rrule = str;
            this.is_all_day = bool;
            this.description = str2;
            this.location = str3;
            this.meeting_rooms = Internal.immutableCopyOf("meeting_rooms", list);
            this.is_meeting_rooms_disabled = Internal.immutableCopyOf("is_meeting_rooms_disabled", list2);
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.CalendarEventMessageCard$b */
    private static final class C14715b extends ProtoAdapter<CalendarEventMessageCard> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f38933a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C14715b() {
            super(FieldEncoding.LENGTH_DELIMITED, CalendarEventMessageCard.class);
        }

        /* renamed from: a */
        public int encodedSize(CalendarEventMessageCard calendarEventMessageCard) {
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
            int i27 = 0;
            if (calendarEventMessageCard.event_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, calendarEventMessageCard.event_id);
            } else {
                i = 0;
            }
            if (calendarEventMessageCard.sender_user_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, calendarEventMessageCard.sender_user_id);
            } else {
                i2 = 0;
            }
            int i28 = i + i2;
            if (calendarEventMessageCard.summary != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, calendarEventMessageCard.summary);
            } else {
                i3 = 0;
            }
            int i29 = i28 + i3;
            if (calendarEventMessageCard.is_all_day != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(4, calendarEventMessageCard.is_all_day);
            } else {
                i4 = 0;
            }
            int i30 = i29 + i4;
            if (calendarEventMessageCard.start_time != null) {
                i5 = ProtoAdapter.INT64.encodedSizeWithTag(5, calendarEventMessageCard.start_time);
            } else {
                i5 = 0;
            }
            int i31 = i30 + i5;
            if (calendarEventMessageCard.start_timezone != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(6, calendarEventMessageCard.start_timezone);
            } else {
                i6 = 0;
            }
            int i32 = i31 + i6;
            if (calendarEventMessageCard.end_time != null) {
                i7 = ProtoAdapter.INT64.encodedSizeWithTag(7, calendarEventMessageCard.end_time);
            } else {
                i7 = 0;
            }
            int i33 = i32 + i7;
            if (calendarEventMessageCard.end_timezone != null) {
                i8 = ProtoAdapter.STRING.encodedSizeWithTag(8, calendarEventMessageCard.end_timezone);
            } else {
                i8 = 0;
            }
            int i34 = i33 + i8;
            if (calendarEventMessageCard.rrule != null) {
                i9 = ProtoAdapter.STRING.encodedSizeWithTag(9, calendarEventMessageCard.rrule);
            } else {
                i9 = 0;
            }
            int i35 = i34 + i9;
            if (calendarEventMessageCard.location != null) {
                i10 = ProtoAdapter.STRING.encodedSizeWithTag(10, calendarEventMessageCard.location);
            } else {
                i10 = 0;
            }
            int encodedSizeWithTag = i35 + i10 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(11, calendarEventMessageCard.meeting_rooms) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(12, calendarEventMessageCard.attendee_user_ids);
            if (calendarEventMessageCard.conflict_type != null) {
                i11 = ConflictType.ADAPTER.encodedSizeWithTag(13, calendarEventMessageCard.conflict_type);
            } else {
                i11 = 0;
            }
            int i36 = encodedSizeWithTag + i11;
            if (calendarEventMessageCard.self_attendee_status != null) {
                i12 = CalendarEventAttendee.Status.ADAPTER.encodedSizeWithTag(14, calendarEventMessageCard.self_attendee_status);
            } else {
                i12 = 0;
            }
            int i37 = i36 + i12;
            if (calendarEventMessageCard.attendee_count != null) {
                i13 = ProtoAdapter.INT32.encodedSizeWithTag(15, calendarEventMessageCard.attendee_count);
            } else {
                i13 = 0;
            }
            int i38 = i37 + i13;
            if (calendarEventMessageCard.is_optional != null) {
                i14 = ProtoAdapter.BOOL.encodedSizeWithTag(16, calendarEventMessageCard.is_optional);
            } else {
                i14 = 0;
            }
            int i39 = i38 + i14;
            if (calendarEventMessageCard.calendar_id != null) {
                i15 = ProtoAdapter.STRING.encodedSizeWithTag(17, calendarEventMessageCard.calendar_id);
            } else {
                i15 = 0;
            }
            int i40 = i39 + i15;
            if (calendarEventMessageCard.event_key != null) {
                i16 = ProtoAdapter.STRING.encodedSizeWithTag(18, calendarEventMessageCard.event_key);
            } else {
                i16 = 0;
            }
            int i41 = i40 + i16;
            if (calendarEventMessageCard.original_time != null) {
                i17 = ProtoAdapter.INT64.encodedSizeWithTag(19, calendarEventMessageCard.original_time);
            } else {
                i17 = 0;
            }
            int i42 = i41 + i17;
            if (calendarEventMessageCard.description != null) {
                i18 = ProtoAdapter.STRING.encodedSizeWithTag(20, calendarEventMessageCard.description);
            } else {
                i18 = 0;
            }
            int i43 = i42 + i18;
            if (calendarEventMessageCard.conflict_time != null) {
                i19 = ProtoAdapter.INT64.encodedSizeWithTag(21, calendarEventMessageCard.conflict_time);
            } else {
                i19 = 0;
            }
            int i44 = i43 + i19;
            if (calendarEventMessageCard.event_type != null) {
                i20 = CalendarEvent.Type.ADAPTER.encodedSizeWithTag(22, calendarEventMessageCard.event_type);
            } else {
                i20 = 0;
            }
            int encodedSizeWithTag2 = i44 + i20 + this.f38933a.encodedSizeWithTag(23, calendarEventMessageCard.chat_names);
            if (calendarEventMessageCard.is_cross_tenant != null) {
                i21 = ProtoAdapter.BOOL.encodedSizeWithTag(24, calendarEventMessageCard.is_cross_tenant);
            } else {
                i21 = 0;
            }
            int i45 = encodedSizeWithTag2 + i21;
            if (calendarEventMessageCard.version != null) {
                i22 = ProtoAdapter.INT64.encodedSizeWithTag(25, calendarEventMessageCard.version);
            } else {
                i22 = 0;
            }
            int i46 = i45 + i22;
            if (calendarEventMessageCard.desc_rich_text != null) {
                i23 = RichText.ADAPTER.encodedSizeWithTag(26, calendarEventMessageCard.desc_rich_text);
            } else {
                i23 = 0;
            }
            int encodedSizeWithTag3 = i46 + i23 + ProtoAdapter.BOOL.asRepeated().encodedSizeWithTag(27, calendarEventMessageCard.is_meeting_rooms_disabled);
            if (calendarEventMessageCard.user_invite_operator_id != null) {
                i24 = ProtoAdapter.STRING.encodedSizeWithTag(28, calendarEventMessageCard.user_invite_operator_id);
            } else {
                i24 = 0;
            }
            int i47 = encodedSizeWithTag3 + i24;
            if (calendarEventMessageCard.show_reply_inviter_entry != null) {
                i25 = ProtoAdapter.BOOL.encodedSizeWithTag(29, calendarEventMessageCard.show_reply_inviter_entry);
            } else {
                i25 = 0;
            }
            int i48 = i47 + i25;
            if (calendarEventMessageCard.card_status != null) {
                i26 = EventCardStatus.ADAPTER.encodedSizeWithTag(30, calendarEventMessageCard.card_status);
            } else {
                i26 = 0;
            }
            int i49 = i48 + i26;
            if (calendarEventMessageCard.card_info_for_diff != null) {
                i27 = EventCardInfoForDiff.ADAPTER.encodedSizeWithTag(31, calendarEventMessageCard.card_info_for_diff);
            }
            return i49 + i27 + calendarEventMessageCard.unknownFields().size();
        }

        /* renamed from: a */
        public CalendarEventMessageCard decode(ProtoReader protoReader) throws IOException {
            C14714a aVar = new C14714a();
            aVar.f38907a = "";
            aVar.f38908b = "";
            aVar.f38909c = "";
            aVar.f38910d = false;
            aVar.f38911e = 0L;
            aVar.f38912f = "";
            aVar.f38913g = 0L;
            aVar.f38914h = "";
            aVar.f38915i = "";
            aVar.f38916j = "";
            aVar.f38919m = ConflictType.NONE;
            aVar.f38920n = CalendarEventAttendee.Status.NEEDS_ACTION;
            aVar.f38921o = 0;
            aVar.f38922p = false;
            aVar.f38923q = "";
            aVar.f38924r = "";
            aVar.f38925s = 0L;
            aVar.f38926t = "";
            aVar.f38927u = 0L;
            aVar.f38928v = CalendarEvent.Type.DEFAULT_TYPE;
            aVar.f38930x = false;
            aVar.f38931y = 0L;
            aVar.f38903B = "";
            aVar.f38904C = true;
            aVar.f38905D = EventCardStatus.NORMAL;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f38907a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f38908b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f38909c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f38910d = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 5:
                            aVar.f38911e = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            aVar.f38912f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f38913g = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 8:
                            aVar.f38914h = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 9:
                            aVar.f38915i = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 10:
                            aVar.f38916j = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 11:
                            aVar.f38917k.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f38918l.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 13:
                            try {
                                aVar.f38919m = ConflictType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 14:
                            try {
                                aVar.f38920n = CalendarEventAttendee.Status.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 15:
                            aVar.f38921o = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 16:
                            aVar.f38922p = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 17:
                            aVar.f38923q = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 18:
                            aVar.f38924r = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 19:
                            aVar.f38925s = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 20:
                            aVar.f38926t = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 21:
                            aVar.f38927u = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 22:
                            try {
                                aVar.f38928v = CalendarEvent.Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                break;
                            }
                        case 23:
                            aVar.f38929w.putAll(this.f38933a.decode(protoReader));
                            break;
                        case 24:
                            aVar.f38930x = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case AvailableCode.ERROR_ON_ACTIVITY_RESULT /*{ENCODED_INT: 25}*/:
                            aVar.f38931y = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 26:
                            aVar.f38932z = RichText.ADAPTER.decode(protoReader);
                            break;
                        case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /*{ENCODED_INT: 27}*/:
                            aVar.f38902A.add(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case IVideoEventLogger.LOGGER_OPTION_ENABLE_SR /*{ENCODED_INT: 28}*/:
                            aVar.f38903B = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 29:
                            aVar.f38904C = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 30:
                            try {
                                aVar.f38905D = EventCardStatus.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e4.value));
                                break;
                            }
                        case TTVideoEngine.PLAYER_OPTION_ENABLE_PLAYER3_HARDWARE_DECODE /*{ENCODED_INT: 31}*/:
                            aVar.f38906E = EventCardInfoForDiff.ADAPTER.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, CalendarEventMessageCard calendarEventMessageCard) throws IOException {
            if (calendarEventMessageCard.event_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, calendarEventMessageCard.event_id);
            }
            if (calendarEventMessageCard.sender_user_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, calendarEventMessageCard.sender_user_id);
            }
            if (calendarEventMessageCard.summary != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, calendarEventMessageCard.summary);
            }
            if (calendarEventMessageCard.is_all_day != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, calendarEventMessageCard.is_all_day);
            }
            if (calendarEventMessageCard.start_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, calendarEventMessageCard.start_time);
            }
            if (calendarEventMessageCard.start_timezone != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, calendarEventMessageCard.start_timezone);
            }
            if (calendarEventMessageCard.end_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, calendarEventMessageCard.end_time);
            }
            if (calendarEventMessageCard.end_timezone != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, calendarEventMessageCard.end_timezone);
            }
            if (calendarEventMessageCard.rrule != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, calendarEventMessageCard.rrule);
            }
            if (calendarEventMessageCard.location != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, calendarEventMessageCard.location);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 11, calendarEventMessageCard.meeting_rooms);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 12, calendarEventMessageCard.attendee_user_ids);
            if (calendarEventMessageCard.conflict_type != null) {
                ConflictType.ADAPTER.encodeWithTag(protoWriter, 13, calendarEventMessageCard.conflict_type);
            }
            if (calendarEventMessageCard.self_attendee_status != null) {
                CalendarEventAttendee.Status.ADAPTER.encodeWithTag(protoWriter, 14, calendarEventMessageCard.self_attendee_status);
            }
            if (calendarEventMessageCard.attendee_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 15, calendarEventMessageCard.attendee_count);
            }
            if (calendarEventMessageCard.is_optional != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 16, calendarEventMessageCard.is_optional);
            }
            if (calendarEventMessageCard.calendar_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 17, calendarEventMessageCard.calendar_id);
            }
            if (calendarEventMessageCard.event_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 18, calendarEventMessageCard.event_key);
            }
            if (calendarEventMessageCard.original_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 19, calendarEventMessageCard.original_time);
            }
            if (calendarEventMessageCard.description != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 20, calendarEventMessageCard.description);
            }
            if (calendarEventMessageCard.conflict_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 21, calendarEventMessageCard.conflict_time);
            }
            if (calendarEventMessageCard.event_type != null) {
                CalendarEvent.Type.ADAPTER.encodeWithTag(protoWriter, 22, calendarEventMessageCard.event_type);
            }
            this.f38933a.encodeWithTag(protoWriter, 23, calendarEventMessageCard.chat_names);
            if (calendarEventMessageCard.is_cross_tenant != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 24, calendarEventMessageCard.is_cross_tenant);
            }
            if (calendarEventMessageCard.version != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 25, calendarEventMessageCard.version);
            }
            if (calendarEventMessageCard.desc_rich_text != null) {
                RichText.ADAPTER.encodeWithTag(protoWriter, 26, calendarEventMessageCard.desc_rich_text);
            }
            ProtoAdapter.BOOL.asRepeated().encodeWithTag(protoWriter, 27, calendarEventMessageCard.is_meeting_rooms_disabled);
            if (calendarEventMessageCard.user_invite_operator_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 28, calendarEventMessageCard.user_invite_operator_id);
            }
            if (calendarEventMessageCard.show_reply_inviter_entry != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 29, calendarEventMessageCard.show_reply_inviter_entry);
            }
            if (calendarEventMessageCard.card_status != null) {
                EventCardStatus.ADAPTER.encodeWithTag(protoWriter, 30, calendarEventMessageCard.card_status);
            }
            if (calendarEventMessageCard.card_info_for_diff != null) {
                EventCardInfoForDiff.ADAPTER.encodeWithTag(protoWriter, 31, calendarEventMessageCard.card_info_for_diff);
            }
            protoWriter.writeBytes(calendarEventMessageCard.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.CalendarEventMessageCard$a */
    public static final class C14714a extends Message.Builder<CalendarEventMessageCard, C14714a> {

        /* renamed from: A */
        public List<Boolean> f38902A = Internal.newMutableList();

        /* renamed from: B */
        public String f38903B;

        /* renamed from: C */
        public Boolean f38904C;

        /* renamed from: D */
        public EventCardStatus f38905D;

        /* renamed from: E */
        public EventCardInfoForDiff f38906E;

        /* renamed from: a */
        public String f38907a;

        /* renamed from: b */
        public String f38908b;

        /* renamed from: c */
        public String f38909c;

        /* renamed from: d */
        public Boolean f38910d;

        /* renamed from: e */
        public Long f38911e;

        /* renamed from: f */
        public String f38912f;

        /* renamed from: g */
        public Long f38913g;

        /* renamed from: h */
        public String f38914h;

        /* renamed from: i */
        public String f38915i;

        /* renamed from: j */
        public String f38916j;

        /* renamed from: k */
        public List<String> f38917k = Internal.newMutableList();

        /* renamed from: l */
        public List<String> f38918l = Internal.newMutableList();

        /* renamed from: m */
        public ConflictType f38919m;

        /* renamed from: n */
        public CalendarEventAttendee.Status f38920n;

        /* renamed from: o */
        public Integer f38921o;

        /* renamed from: p */
        public Boolean f38922p;

        /* renamed from: q */
        public String f38923q;

        /* renamed from: r */
        public String f38924r;

        /* renamed from: s */
        public Long f38925s;

        /* renamed from: t */
        public String f38926t;

        /* renamed from: u */
        public Long f38927u;

        /* renamed from: v */
        public CalendarEvent.Type f38928v;

        /* renamed from: w */
        public Map<String, String> f38929w = Internal.newMutableMap();

        /* renamed from: x */
        public Boolean f38930x;

        /* renamed from: y */
        public Long f38931y;

        /* renamed from: z */
        public RichText f38932z;

        /* renamed from: a */
        public CalendarEventMessageCard build() {
            return new CalendarEventMessageCard(this.f38907a, this.f38908b, this.f38909c, this.f38910d, this.f38911e, this.f38912f, this.f38913g, this.f38914h, this.f38915i, this.f38916j, this.f38917k, this.f38918l, this.f38919m, this.f38920n, this.f38921o, this.f38922p, this.f38923q, this.f38924r, this.f38925s, this.f38926t, this.f38927u, this.f38928v, this.f38929w, this.f38930x, this.f38931y, this.f38932z, this.f38902A, this.f38903B, this.f38904C, this.f38905D, this.f38906E, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C14714a newBuilder() {
        C14714a aVar = new C14714a();
        aVar.f38907a = this.event_id;
        aVar.f38908b = this.sender_user_id;
        aVar.f38909c = this.summary;
        aVar.f38910d = this.is_all_day;
        aVar.f38911e = this.start_time;
        aVar.f38912f = this.start_timezone;
        aVar.f38913g = this.end_time;
        aVar.f38914h = this.end_timezone;
        aVar.f38915i = this.rrule;
        aVar.f38916j = this.location;
        aVar.f38917k = Internal.copyOf("meeting_rooms", this.meeting_rooms);
        aVar.f38918l = Internal.copyOf("attendee_user_ids", this.attendee_user_ids);
        aVar.f38919m = this.conflict_type;
        aVar.f38920n = this.self_attendee_status;
        aVar.f38921o = this.attendee_count;
        aVar.f38922p = this.is_optional;
        aVar.f38923q = this.calendar_id;
        aVar.f38924r = this.event_key;
        aVar.f38925s = this.original_time;
        aVar.f38926t = this.description;
        aVar.f38927u = this.conflict_time;
        aVar.f38928v = this.event_type;
        aVar.f38929w = Internal.copyOf("chat_names", this.chat_names);
        aVar.f38930x = this.is_cross_tenant;
        aVar.f38931y = this.version;
        aVar.f38932z = this.desc_rich_text;
        aVar.f38902A = Internal.copyOf("is_meeting_rooms_disabled", this.is_meeting_rooms_disabled);
        aVar.f38903B = this.user_invite_operator_id;
        aVar.f38904C = this.show_reply_inviter_entry;
        aVar.f38905D = this.card_status;
        aVar.f38906E = this.card_info_for_diff;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "CalendarEventMessageCard");
        StringBuilder sb = new StringBuilder();
        if (this.event_id != null) {
            sb.append(", event_id=");
            sb.append(this.event_id);
        }
        if (this.sender_user_id != null) {
            sb.append(", sender_user_id=");
            sb.append(this.sender_user_id);
        }
        if (this.summary != null) {
            sb.append(", summary=");
            sb.append(this.summary);
        }
        if (this.is_all_day != null) {
            sb.append(", is_all_day=");
            sb.append(this.is_all_day);
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
        if (this.rrule != null) {
            sb.append(", rrule=");
            sb.append(this.rrule);
        }
        if (this.location != null) {
            sb.append(", location=");
            sb.append(this.location);
        }
        if (!this.meeting_rooms.isEmpty()) {
            sb.append(", meeting_rooms=");
            sb.append(this.meeting_rooms);
        }
        if (!this.attendee_user_ids.isEmpty()) {
            sb.append(", attendee_user_ids=");
            sb.append(this.attendee_user_ids);
        }
        if (this.conflict_type != null) {
            sb.append(", conflict_type=");
            sb.append(this.conflict_type);
        }
        if (this.self_attendee_status != null) {
            sb.append(", self_attendee_status=");
            sb.append(this.self_attendee_status);
        }
        if (this.attendee_count != null) {
            sb.append(", attendee_count=");
            sb.append(this.attendee_count);
        }
        if (this.is_optional != null) {
            sb.append(", is_optional=");
            sb.append(this.is_optional);
        }
        if (this.calendar_id != null) {
            sb.append(", calendar_id=");
            sb.append(this.calendar_id);
        }
        if (this.event_key != null) {
            sb.append(", event_key=");
            sb.append(this.event_key);
        }
        if (this.original_time != null) {
            sb.append(", original_time=");
            sb.append(this.original_time);
        }
        if (this.description != null) {
            sb.append(", description=");
            sb.append(this.description);
        }
        if (this.conflict_time != null) {
            sb.append(", conflict_time=");
            sb.append(this.conflict_time);
        }
        if (this.event_type != null) {
            sb.append(", event_type=");
            sb.append(this.event_type);
        }
        if (!this.chat_names.isEmpty()) {
            sb.append(", chat_names=");
            sb.append(this.chat_names);
        }
        if (this.is_cross_tenant != null) {
            sb.append(", is_cross_tenant=");
            sb.append(this.is_cross_tenant);
        }
        if (this.version != null) {
            sb.append(", version=");
            sb.append(this.version);
        }
        if (this.desc_rich_text != null) {
            sb.append(", desc_rich_text=");
            sb.append(this.desc_rich_text);
        }
        if (!this.is_meeting_rooms_disabled.isEmpty()) {
            sb.append(", is_meeting_rooms_disabled=");
            sb.append(this.is_meeting_rooms_disabled);
        }
        if (this.user_invite_operator_id != null) {
            sb.append(", user_invite_operator_id=");
            sb.append(this.user_invite_operator_id);
        }
        if (this.show_reply_inviter_entry != null) {
            sb.append(", show_reply_inviter_entry=");
            sb.append(this.show_reply_inviter_entry);
        }
        if (this.card_status != null) {
            sb.append(", card_status=");
            sb.append(this.card_status);
        }
        if (this.card_info_for_diff != null) {
            sb.append(", card_info_for_diff=");
            sb.append(this.card_info_for_diff);
        }
        StringBuilder replace = sb.replace(0, 2, "CalendarEventMessageCard{");
        replace.append('}');
        return replace.toString();
    }

    public CalendarEventMessageCard(String str, String str2, String str3, Boolean bool, Long l, String str4, Long l2, String str5, String str6, String str7, List<String> list, List<String> list2, ConflictType conflictType, CalendarEventAttendee.Status status, Integer num, Boolean bool2, String str8, String str9, Long l3, String str10, Long l4, CalendarEvent.Type type, Map<String, String> map, Boolean bool3, Long l5, RichText richText, List<Boolean> list3, String str11, Boolean bool4, EventCardStatus eventCardStatus, EventCardInfoForDiff eventCardInfoForDiff) {
        this(str, str2, str3, bool, l, str4, l2, str5, str6, str7, list, list2, conflictType, status, num, bool2, str8, str9, l3, str10, l4, type, map, bool3, l5, richText, list3, str11, bool4, eventCardStatus, eventCardInfoForDiff, ByteString.EMPTY);
    }

    public CalendarEventMessageCard(String str, String str2, String str3, Boolean bool, Long l, String str4, Long l2, String str5, String str6, String str7, List<String> list, List<String> list2, ConflictType conflictType, CalendarEventAttendee.Status status, Integer num, Boolean bool2, String str8, String str9, Long l3, String str10, Long l4, CalendarEvent.Type type, Map<String, String> map, Boolean bool3, Long l5, RichText richText, List<Boolean> list3, String str11, Boolean bool4, EventCardStatus eventCardStatus, EventCardInfoForDiff eventCardInfoForDiff, ByteString byteString) {
        super(ADAPTER, byteString);
        this.event_id = str;
        this.sender_user_id = str2;
        this.summary = str3;
        this.is_all_day = bool;
        this.start_time = l;
        this.start_timezone = str4;
        this.end_time = l2;
        this.end_timezone = str5;
        this.rrule = str6;
        this.location = str7;
        this.meeting_rooms = Internal.immutableCopyOf("meeting_rooms", list);
        this.attendee_user_ids = Internal.immutableCopyOf("attendee_user_ids", list2);
        this.conflict_type = conflictType;
        this.self_attendee_status = status;
        this.attendee_count = num;
        this.is_optional = bool2;
        this.calendar_id = str8;
        this.event_key = str9;
        this.original_time = l3;
        this.description = str10;
        this.conflict_time = l4;
        this.event_type = type;
        this.chat_names = Internal.immutableCopyOf("chat_names", map);
        this.is_cross_tenant = bool3;
        this.version = l5;
        this.desc_rich_text = richText;
        this.is_meeting_rooms_disabled = Internal.immutableCopyOf("is_meeting_rooms_disabled", list3);
        this.user_invite_operator_id = str11;
        this.show_reply_inviter_entry = bool4;
        this.card_status = eventCardStatus;
        this.card_info_for_diff = eventCardInfoForDiff;
    }
}
