package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class CalendarContent extends Message<CalendarContent, C14708a> {
    public static final ProtoAdapter<CalendarContent> ADAPTER = new C14709b();
    public static final Long DEFAULT_END_TIME = 0L;
    public static final Boolean DEFAULT_IS_ALL_DAY = false;
    public static final CalendarMessageType DEFAULT_MESSAGE_TYPE = CalendarMessageType.UNKNOWN;
    public static final CalendarMessageVersion DEFAULT_MESSAGE_VERSION = CalendarMessageVersion.V1;
    public static final Long DEFAULT_START_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final CalendarMessageCard calendar_card;
    public final String card_title;
    public final Long end_time;
    public final String end_timezone;
    public final CalendarEventMessageCard event_card;
    public final Boolean is_all_day;
    public final Map<String, Chatter> message_chatters;
    public final CalendarMessageType message_type;
    public final CalendarMessageVersion message_version;
    public final String payload;
    public final String rrule;
    public final Long start_time;
    public final String start_timezone;

    public enum CalendarMessageType implements WireEnum {
        UNKNOWN(0),
        REPLY_ACCEPT(1),
        REPLY_DECLINE(2),
        REPLY_TENTATIVE(3),
        EVENT_INVITE(4),
        EVENT_DELETE(5),
        EVENT_UPDATE(6),
        EVENT_RESCHEDULE(7),
        CALENDAR_UPDATE(8),
        EVENT_UPDATE_LOCATION(9),
        SELF_ATTENDEE_STATUS_CHANGE(10),
        ADJUST_SHARE_CALENDAR_MEMBER(11),
        REMOVE_SHARE_CALENDAR_MEMBER(12),
        DELETE_SHARE_CALENDAR(13),
        EVENT_UPDATE_DESCRIPTION(14),
        REPLY_ACCEPT_AFTER_DECLINE(15);
        
        public static final ProtoAdapter<CalendarMessageType> ADAPTER = ProtoAdapter.newEnumAdapter(CalendarMessageType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static CalendarMessageType fromValue(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN;
                case 1:
                    return REPLY_ACCEPT;
                case 2:
                    return REPLY_DECLINE;
                case 3:
                    return REPLY_TENTATIVE;
                case 4:
                    return EVENT_INVITE;
                case 5:
                    return EVENT_DELETE;
                case 6:
                    return EVENT_UPDATE;
                case 7:
                    return EVENT_RESCHEDULE;
                case 8:
                    return CALENDAR_UPDATE;
                case 9:
                    return EVENT_UPDATE_LOCATION;
                case 10:
                    return SELF_ATTENDEE_STATUS_CHANGE;
                case 11:
                    return ADJUST_SHARE_CALENDAR_MEMBER;
                case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                    return REMOVE_SHARE_CALENDAR_MEMBER;
                case 13:
                    return DELETE_SHARE_CALENDAR;
                case 14:
                    return EVENT_UPDATE_DESCRIPTION;
                case 15:
                    return REPLY_ACCEPT_AFTER_DECLINE;
                default:
                    return null;
            }
        }

        private CalendarMessageType(int i) {
            this.value = i;
        }
    }

    public enum CalendarMessageVersion implements WireEnum {
        V1(1),
        V2(2),
        V3(3);
        
        public static final ProtoAdapter<CalendarMessageVersion> ADAPTER = ProtoAdapter.newEnumAdapter(CalendarMessageVersion.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static CalendarMessageVersion fromValue(int i) {
            if (i == 1) {
                return V1;
            }
            if (i == 2) {
                return V2;
            }
            if (i != 3) {
                return null;
            }
            return V3;
        }

        private CalendarMessageVersion(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.CalendarContent$b */
    private static final class C14709b extends ProtoAdapter<CalendarContent> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, Chatter>> f38891a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, Chatter.ADAPTER);

        C14709b() {
            super(FieldEncoding.LENGTH_DELIMITED, CalendarContent.class);
        }

        /* renamed from: a */
        public int encodedSize(CalendarContent calendarContent) {
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
            if (calendarContent.payload != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, calendarContent.payload);
            } else {
                i = 0;
            }
            if (calendarContent.card_title != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, calendarContent.card_title);
            } else {
                i2 = 0;
            }
            int i13 = i + i2;
            if (calendarContent.start_time != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, calendarContent.start_time);
            } else {
                i3 = 0;
            }
            int i14 = i13 + i3;
            if (calendarContent.end_time != null) {
                i4 = ProtoAdapter.INT64.encodedSizeWithTag(4, calendarContent.end_time);
            } else {
                i4 = 0;
            }
            int i15 = i14 + i4;
            if (calendarContent.start_timezone != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, calendarContent.start_timezone);
            } else {
                i5 = 0;
            }
            int i16 = i15 + i5;
            if (calendarContent.end_timezone != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(6, calendarContent.end_timezone);
            } else {
                i6 = 0;
            }
            int i17 = i16 + i6;
            if (calendarContent.is_all_day != null) {
                i7 = ProtoAdapter.BOOL.encodedSizeWithTag(7, calendarContent.is_all_day);
            } else {
                i7 = 0;
            }
            int i18 = i17 + i7;
            if (calendarContent.rrule != null) {
                i8 = ProtoAdapter.STRING.encodedSizeWithTag(8, calendarContent.rrule);
            } else {
                i8 = 0;
            }
            int i19 = i18 + i8;
            if (calendarContent.calendar_card != null) {
                i9 = CalendarMessageCard.ADAPTER.encodedSizeWithTag(9, calendarContent.calendar_card);
            } else {
                i9 = 0;
            }
            int i20 = i19 + i9;
            if (calendarContent.event_card != null) {
                i10 = CalendarEventMessageCard.ADAPTER.encodedSizeWithTag(10, calendarContent.event_card);
            } else {
                i10 = 0;
            }
            int i21 = i20 + i10;
            if (calendarContent.message_type != null) {
                i11 = CalendarMessageType.ADAPTER.encodedSizeWithTag(11, calendarContent.message_type);
            } else {
                i11 = 0;
            }
            int i22 = i21 + i11;
            if (calendarContent.message_version != null) {
                i12 = CalendarMessageVersion.ADAPTER.encodedSizeWithTag(12, calendarContent.message_version);
            }
            return i22 + i12 + this.f38891a.encodedSizeWithTag(13, calendarContent.message_chatters) + calendarContent.unknownFields().size();
        }

        /* renamed from: a */
        public CalendarContent decode(ProtoReader protoReader) throws IOException {
            C14708a aVar = new C14708a();
            aVar.f38878a = "";
            aVar.f38879b = "";
            aVar.f38880c = 0L;
            aVar.f38881d = 0L;
            aVar.f38882e = "";
            aVar.f38883f = "";
            aVar.f38884g = false;
            aVar.f38885h = "";
            aVar.f38888k = CalendarMessageType.UNKNOWN;
            aVar.f38889l = CalendarMessageVersion.V1;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f38878a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f38879b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f38880c = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            aVar.f38881d = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            aVar.f38882e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f38883f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f38884g = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 8:
                            aVar.f38885h = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 9:
                            aVar.f38886i = CalendarMessageCard.ADAPTER.decode(protoReader);
                            break;
                        case 10:
                            aVar.f38887j = CalendarEventMessageCard.ADAPTER.decode(protoReader);
                            break;
                        case 11:
                            try {
                                aVar.f38888k = CalendarMessageType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            try {
                                aVar.f38889l = CalendarMessageVersion.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 13:
                            aVar.f38890m.putAll(this.f38891a.decode(protoReader));
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
        public void encode(ProtoWriter protoWriter, CalendarContent calendarContent) throws IOException {
            if (calendarContent.payload != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, calendarContent.payload);
            }
            if (calendarContent.card_title != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, calendarContent.card_title);
            }
            if (calendarContent.start_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, calendarContent.start_time);
            }
            if (calendarContent.end_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, calendarContent.end_time);
            }
            if (calendarContent.start_timezone != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, calendarContent.start_timezone);
            }
            if (calendarContent.end_timezone != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, calendarContent.end_timezone);
            }
            if (calendarContent.is_all_day != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, calendarContent.is_all_day);
            }
            if (calendarContent.rrule != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, calendarContent.rrule);
            }
            if (calendarContent.calendar_card != null) {
                CalendarMessageCard.ADAPTER.encodeWithTag(protoWriter, 9, calendarContent.calendar_card);
            }
            if (calendarContent.event_card != null) {
                CalendarEventMessageCard.ADAPTER.encodeWithTag(protoWriter, 10, calendarContent.event_card);
            }
            if (calendarContent.message_type != null) {
                CalendarMessageType.ADAPTER.encodeWithTag(protoWriter, 11, calendarContent.message_type);
            }
            if (calendarContent.message_version != null) {
                CalendarMessageVersion.ADAPTER.encodeWithTag(protoWriter, 12, calendarContent.message_version);
            }
            this.f38891a.encodeWithTag(protoWriter, 13, calendarContent.message_chatters);
            protoWriter.writeBytes(calendarContent.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.CalendarContent$a */
    public static final class C14708a extends Message.Builder<CalendarContent, C14708a> {

        /* renamed from: a */
        public String f38878a;

        /* renamed from: b */
        public String f38879b;

        /* renamed from: c */
        public Long f38880c;

        /* renamed from: d */
        public Long f38881d;

        /* renamed from: e */
        public String f38882e;

        /* renamed from: f */
        public String f38883f;

        /* renamed from: g */
        public Boolean f38884g;

        /* renamed from: h */
        public String f38885h;

        /* renamed from: i */
        public CalendarMessageCard f38886i;

        /* renamed from: j */
        public CalendarEventMessageCard f38887j;

        /* renamed from: k */
        public CalendarMessageType f38888k;

        /* renamed from: l */
        public CalendarMessageVersion f38889l;

        /* renamed from: m */
        public Map<String, Chatter> f38890m = Internal.newMutableMap();

        /* renamed from: a */
        public CalendarContent build() {
            return new CalendarContent(this.f38878a, this.f38879b, this.f38880c, this.f38881d, this.f38882e, this.f38883f, this.f38884g, this.f38885h, this.f38886i, this.f38887j, this.f38888k, this.f38889l, this.f38890m, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C14708a newBuilder() {
        C14708a aVar = new C14708a();
        aVar.f38878a = this.payload;
        aVar.f38879b = this.card_title;
        aVar.f38880c = this.start_time;
        aVar.f38881d = this.end_time;
        aVar.f38882e = this.start_timezone;
        aVar.f38883f = this.end_timezone;
        aVar.f38884g = this.is_all_day;
        aVar.f38885h = this.rrule;
        aVar.f38886i = this.calendar_card;
        aVar.f38887j = this.event_card;
        aVar.f38888k = this.message_type;
        aVar.f38889l = this.message_version;
        aVar.f38890m = Internal.copyOf("message_chatters", this.message_chatters);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "CalendarContent");
        StringBuilder sb = new StringBuilder();
        if (this.payload != null) {
            sb.append(", payload=");
            sb.append(this.payload);
        }
        if (this.card_title != null) {
            sb.append(", card_title=");
            sb.append(this.card_title);
        }
        if (this.start_time != null) {
            sb.append(", start_time=");
            sb.append(this.start_time);
        }
        if (this.end_time != null) {
            sb.append(", end_time=");
            sb.append(this.end_time);
        }
        if (this.start_timezone != null) {
            sb.append(", start_timezone=");
            sb.append(this.start_timezone);
        }
        if (this.end_timezone != null) {
            sb.append(", end_timezone=");
            sb.append(this.end_timezone);
        }
        if (this.is_all_day != null) {
            sb.append(", is_all_day=");
            sb.append(this.is_all_day);
        }
        if (this.rrule != null) {
            sb.append(", rrule=");
            sb.append(this.rrule);
        }
        if (this.calendar_card != null) {
            sb.append(", calendar_card=");
            sb.append(this.calendar_card);
        }
        if (this.event_card != null) {
            sb.append(", event_card=");
            sb.append(this.event_card);
        }
        if (this.message_type != null) {
            sb.append(", message_type=");
            sb.append(this.message_type);
        }
        if (this.message_version != null) {
            sb.append(", message_version=");
            sb.append(this.message_version);
        }
        if (!this.message_chatters.isEmpty()) {
            sb.append(", message_chatters=");
            sb.append(this.message_chatters);
        }
        StringBuilder replace = sb.replace(0, 2, "CalendarContent{");
        replace.append('}');
        return replace.toString();
    }

    public CalendarContent(String str, String str2, Long l, Long l2, String str3, String str4, Boolean bool, String str5, CalendarMessageCard calendarMessageCard, CalendarEventMessageCard calendarEventMessageCard, CalendarMessageType calendarMessageType, CalendarMessageVersion calendarMessageVersion, Map<String, Chatter> map) {
        this(str, str2, l, l2, str3, str4, bool, str5, calendarMessageCard, calendarEventMessageCard, calendarMessageType, calendarMessageVersion, map, ByteString.EMPTY);
    }

    public CalendarContent(String str, String str2, Long l, Long l2, String str3, String str4, Boolean bool, String str5, CalendarMessageCard calendarMessageCard, CalendarEventMessageCard calendarEventMessageCard, CalendarMessageType calendarMessageType, CalendarMessageVersion calendarMessageVersion, Map<String, Chatter> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.payload = str;
        this.card_title = str2;
        this.start_time = l;
        this.end_time = l2;
        this.start_timezone = str3;
        this.end_timezone = str4;
        this.is_all_day = bool;
        this.rrule = str5;
        this.calendar_card = calendarMessageCard;
        this.event_card = calendarEventMessageCard;
        this.message_type = calendarMessageType;
        this.message_version = calendarMessageVersion;
        this.message_chatters = Internal.immutableCopyOf("message_chatters", map);
    }
}
