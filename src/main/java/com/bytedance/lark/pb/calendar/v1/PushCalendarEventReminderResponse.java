package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
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

public final class PushCalendarEventReminderResponse extends Message<PushCalendarEventReminderResponse, C15946a> {
    public static final ProtoAdapter<PushCalendarEventReminderResponse> ADAPTER = new C15947b();
    public static final Long DEFAULT_END_TIME = 0L;
    public static final Boolean DEFAULT_IS_ALL_DAY = false;
    public static final Integer DEFAULT_MINUTES = 0;
    public static final Long DEFAULT_ORIGINAL_TIME = 0L;
    public static final Long DEFAULT_START_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final String calendar_id;
    public final Long end_time;
    public final String event_id;
    public final Boolean is_all_day;
    public final List<Boolean> is_meeting_rooms_disabled;
    public final String key;
    public final String location;
    public final List<String> meeting_rooms;
    public final Integer minutes;
    public final Long original_time;
    public final Long start_time;
    public final String title;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.PushCalendarEventReminderResponse$b */
    private static final class C15947b extends ProtoAdapter<PushCalendarEventReminderResponse> {
        C15947b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushCalendarEventReminderResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PushCalendarEventReminderResponse pushCalendarEventReminderResponse) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, pushCalendarEventReminderResponse.title) + ProtoAdapter.STRING.encodedSizeWithTag(2, pushCalendarEventReminderResponse.event_id) + ProtoAdapter.INT64.encodedSizeWithTag(3, pushCalendarEventReminderResponse.start_time);
            int i7 = 0;
            if (pushCalendarEventReminderResponse.location != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(4, pushCalendarEventReminderResponse.location);
            } else {
                i = 0;
            }
            int i8 = encodedSizeWithTag + i;
            if (pushCalendarEventReminderResponse.end_time != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(5, pushCalendarEventReminderResponse.end_time);
            } else {
                i2 = 0;
            }
            int encodedSizeWithTag2 = i8 + i2 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(6, pushCalendarEventReminderResponse.meeting_rooms);
            if (pushCalendarEventReminderResponse.is_all_day != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(7, pushCalendarEventReminderResponse.is_all_day);
            } else {
                i3 = 0;
            }
            int i9 = encodedSizeWithTag2 + i3;
            if (pushCalendarEventReminderResponse.calendar_id != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(8, pushCalendarEventReminderResponse.calendar_id);
            } else {
                i4 = 0;
            }
            int i10 = i9 + i4;
            if (pushCalendarEventReminderResponse.key != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(9, pushCalendarEventReminderResponse.key);
            } else {
                i5 = 0;
            }
            int i11 = i10 + i5;
            if (pushCalendarEventReminderResponse.original_time != null) {
                i6 = ProtoAdapter.INT64.encodedSizeWithTag(10, pushCalendarEventReminderResponse.original_time);
            } else {
                i6 = 0;
            }
            int i12 = i11 + i6;
            if (pushCalendarEventReminderResponse.minutes != null) {
                i7 = ProtoAdapter.INT32.encodedSizeWithTag(11, pushCalendarEventReminderResponse.minutes);
            }
            return i12 + i7 + ProtoAdapter.BOOL.asRepeated().encodedSizeWithTag(12, pushCalendarEventReminderResponse.is_meeting_rooms_disabled) + pushCalendarEventReminderResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PushCalendarEventReminderResponse decode(ProtoReader protoReader) throws IOException {
            C15946a aVar = new C15946a();
            aVar.f41930a = "";
            aVar.f41931b = "";
            aVar.f41932c = 0L;
            aVar.f41933d = "";
            aVar.f41934e = 0L;
            aVar.f41936g = false;
            aVar.f41937h = "";
            aVar.f41938i = "";
            aVar.f41939j = 0L;
            aVar.f41940k = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f41930a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f41931b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f41932c = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            aVar.f41933d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f41934e = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            aVar.f41935f.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 7:
                            aVar.f41936g = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 8:
                            aVar.f41937h = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 9:
                            aVar.f41938i = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 10:
                            aVar.f41939j = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 11:
                            aVar.f41940k = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f41941l.add(ProtoAdapter.BOOL.decode(protoReader));
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
        public void encode(ProtoWriter protoWriter, PushCalendarEventReminderResponse pushCalendarEventReminderResponse) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pushCalendarEventReminderResponse.title);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, pushCalendarEventReminderResponse.event_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, pushCalendarEventReminderResponse.start_time);
            if (pushCalendarEventReminderResponse.location != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, pushCalendarEventReminderResponse.location);
            }
            if (pushCalendarEventReminderResponse.end_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, pushCalendarEventReminderResponse.end_time);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 6, pushCalendarEventReminderResponse.meeting_rooms);
            if (pushCalendarEventReminderResponse.is_all_day != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, pushCalendarEventReminderResponse.is_all_day);
            }
            if (pushCalendarEventReminderResponse.calendar_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, pushCalendarEventReminderResponse.calendar_id);
            }
            if (pushCalendarEventReminderResponse.key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, pushCalendarEventReminderResponse.key);
            }
            if (pushCalendarEventReminderResponse.original_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 10, pushCalendarEventReminderResponse.original_time);
            }
            if (pushCalendarEventReminderResponse.minutes != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 11, pushCalendarEventReminderResponse.minutes);
            }
            ProtoAdapter.BOOL.asRepeated().encodeWithTag(protoWriter, 12, pushCalendarEventReminderResponse.is_meeting_rooms_disabled);
            protoWriter.writeBytes(pushCalendarEventReminderResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.PushCalendarEventReminderResponse$a */
    public static final class C15946a extends Message.Builder<PushCalendarEventReminderResponse, C15946a> {

        /* renamed from: a */
        public String f41930a;

        /* renamed from: b */
        public String f41931b;

        /* renamed from: c */
        public Long f41932c;

        /* renamed from: d */
        public String f41933d;

        /* renamed from: e */
        public Long f41934e;

        /* renamed from: f */
        public List<String> f41935f = Internal.newMutableList();

        /* renamed from: g */
        public Boolean f41936g;

        /* renamed from: h */
        public String f41937h;

        /* renamed from: i */
        public String f41938i;

        /* renamed from: j */
        public Long f41939j;

        /* renamed from: k */
        public Integer f41940k;

        /* renamed from: l */
        public List<Boolean> f41941l = Internal.newMutableList();

        /* renamed from: a */
        public PushCalendarEventReminderResponse build() {
            String str;
            Long l;
            String str2 = this.f41930a;
            if (str2 != null && (str = this.f41931b) != null && (l = this.f41932c) != null) {
                return new PushCalendarEventReminderResponse(str2, str, l, this.f41933d, this.f41934e, this.f41935f, this.f41936g, this.f41937h, this.f41938i, this.f41939j, this.f41940k, this.f41941l, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "title", this.f41931b, "event_id", this.f41932c, "start_time");
        }
    }

    @Override // com.squareup.wire.Message
    public C15946a newBuilder() {
        C15946a aVar = new C15946a();
        aVar.f41930a = this.title;
        aVar.f41931b = this.event_id;
        aVar.f41932c = this.start_time;
        aVar.f41933d = this.location;
        aVar.f41934e = this.end_time;
        aVar.f41935f = Internal.copyOf("meeting_rooms", this.meeting_rooms);
        aVar.f41936g = this.is_all_day;
        aVar.f41937h = this.calendar_id;
        aVar.f41938i = this.key;
        aVar.f41939j = this.original_time;
        aVar.f41940k = this.minutes;
        aVar.f41941l = Internal.copyOf("is_meeting_rooms_disabled", this.is_meeting_rooms_disabled);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "PushCalendarEventReminderResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", event_id=");
        sb.append(this.event_id);
        sb.append(", start_time=");
        sb.append(this.start_time);
        if (this.location != null) {
            sb.append(", location=");
            sb.append(this.location);
        }
        if (this.end_time != null) {
            sb.append(", end_time=");
            sb.append(this.end_time);
        }
        if (!this.meeting_rooms.isEmpty()) {
            sb.append(", meeting_rooms=");
            sb.append(this.meeting_rooms);
        }
        if (this.is_all_day != null) {
            sb.append(", is_all_day=");
            sb.append(this.is_all_day);
        }
        if (this.calendar_id != null) {
            sb.append(", calendar_id=");
            sb.append(this.calendar_id);
        }
        if (this.key != null) {
            sb.append(", key=");
            sb.append(this.key);
        }
        if (this.original_time != null) {
            sb.append(", original_time=");
            sb.append(this.original_time);
        }
        if (this.minutes != null) {
            sb.append(", minutes=");
            sb.append(this.minutes);
        }
        if (!this.is_meeting_rooms_disabled.isEmpty()) {
            sb.append(", is_meeting_rooms_disabled=");
            sb.append(this.is_meeting_rooms_disabled);
        }
        StringBuilder replace = sb.replace(0, 2, "PushCalendarEventReminderResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PushCalendarEventReminderResponse(String str, String str2, Long l, String str3, Long l2, List<String> list, Boolean bool, String str4, String str5, Long l3, Integer num, List<Boolean> list2) {
        this(str, str2, l, str3, l2, list, bool, str4, str5, l3, num, list2, ByteString.EMPTY);
    }

    public PushCalendarEventReminderResponse(String str, String str2, Long l, String str3, Long l2, List<String> list, Boolean bool, String str4, String str5, Long l3, Integer num, List<Boolean> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.title = str;
        this.event_id = str2;
        this.start_time = l;
        this.location = str3;
        this.end_time = l2;
        this.meeting_rooms = Internal.immutableCopyOf("meeting_rooms", list);
        this.is_all_day = bool;
        this.calendar_id = str4;
        this.key = str5;
        this.original_time = l3;
        this.minutes = num;
        this.is_meeting_rooms_disabled = Internal.immutableCopyOf("is_meeting_rooms_disabled", list2);
    }
}
