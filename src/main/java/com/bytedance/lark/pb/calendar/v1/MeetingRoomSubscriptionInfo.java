package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MeetingRoomSubscriptionInfo extends Message<MeetingRoomSubscriptionInfo, C15876a> {
    public static final ProtoAdapter<MeetingRoomSubscriptionInfo> ADAPTER = new C15877b();
    public static final Long DEFAULT_END_TIME = 0L;
    public static final Boolean DEFAULT_IS_ALL_DAY = false;
    public static final Boolean DEFAULT_IS_PUBLIC = false;
    public static final Long DEFAULT_START_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final String calendar_id;
    public final EventCreator creator;
    public final Long end_time;
    public final String event_id;
    public final EventCreator event_organizer;
    public final Boolean is_all_day;
    public final Boolean is_public;
    public final EventCreator original_event_creator;
    public final Long start_time;
    public final String summary;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.MeetingRoomSubscriptionInfo$b */
    private static final class C15877b extends ProtoAdapter<MeetingRoomSubscriptionInfo> {
        C15877b() {
            super(FieldEncoding.LENGTH_DELIMITED, MeetingRoomSubscriptionInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(MeetingRoomSubscriptionInfo meetingRoomSubscriptionInfo) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10 = 0;
            if (meetingRoomSubscriptionInfo.is_public != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, meetingRoomSubscriptionInfo.is_public);
            } else {
                i = 0;
            }
            if (meetingRoomSubscriptionInfo.summary != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, meetingRoomSubscriptionInfo.summary);
            } else {
                i2 = 0;
            }
            int i11 = i + i2;
            if (meetingRoomSubscriptionInfo.creator != null) {
                i3 = EventCreator.ADAPTER.encodedSizeWithTag(3, meetingRoomSubscriptionInfo.creator);
            } else {
                i3 = 0;
            }
            int i12 = i11 + i3;
            if (meetingRoomSubscriptionInfo.event_id != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, meetingRoomSubscriptionInfo.event_id);
            } else {
                i4 = 0;
            }
            int i13 = i12 + i4;
            if (meetingRoomSubscriptionInfo.calendar_id != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, meetingRoomSubscriptionInfo.calendar_id);
            } else {
                i5 = 0;
            }
            int i14 = i13 + i5;
            if (meetingRoomSubscriptionInfo.start_time != null) {
                i6 = ProtoAdapter.INT64.encodedSizeWithTag(6, meetingRoomSubscriptionInfo.start_time);
            } else {
                i6 = 0;
            }
            int i15 = i14 + i6;
            if (meetingRoomSubscriptionInfo.end_time != null) {
                i7 = ProtoAdapter.INT64.encodedSizeWithTag(7, meetingRoomSubscriptionInfo.end_time);
            } else {
                i7 = 0;
            }
            int i16 = i15 + i7;
            if (meetingRoomSubscriptionInfo.is_all_day != null) {
                i8 = ProtoAdapter.BOOL.encodedSizeWithTag(8, meetingRoomSubscriptionInfo.is_all_day);
            } else {
                i8 = 0;
            }
            int i17 = i16 + i8;
            if (meetingRoomSubscriptionInfo.original_event_creator != null) {
                i9 = EventCreator.ADAPTER.encodedSizeWithTag(9, meetingRoomSubscriptionInfo.original_event_creator);
            } else {
                i9 = 0;
            }
            int i18 = i17 + i9;
            if (meetingRoomSubscriptionInfo.event_organizer != null) {
                i10 = EventCreator.ADAPTER.encodedSizeWithTag(10, meetingRoomSubscriptionInfo.event_organizer);
            }
            return i18 + i10 + meetingRoomSubscriptionInfo.unknownFields().size();
        }

        /* renamed from: a */
        public MeetingRoomSubscriptionInfo decode(ProtoReader protoReader) throws IOException {
            C15876a aVar = new C15876a();
            aVar.f41719a = false;
            aVar.f41720b = "";
            aVar.f41722d = "";
            aVar.f41723e = "";
            aVar.f41724f = 0L;
            aVar.f41725g = 0L;
            aVar.f41726h = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f41719a = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 2:
                            aVar.f41720b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f41721c = EventCreator.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            aVar.f41722d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f41723e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f41724f = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 7:
                            aVar.f41725g = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 8:
                            aVar.f41726h = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 9:
                            aVar.f41727i = EventCreator.ADAPTER.decode(protoReader);
                            break;
                        case 10:
                            aVar.f41728j = EventCreator.ADAPTER.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, MeetingRoomSubscriptionInfo meetingRoomSubscriptionInfo) throws IOException {
            if (meetingRoomSubscriptionInfo.is_public != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, meetingRoomSubscriptionInfo.is_public);
            }
            if (meetingRoomSubscriptionInfo.summary != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, meetingRoomSubscriptionInfo.summary);
            }
            if (meetingRoomSubscriptionInfo.creator != null) {
                EventCreator.ADAPTER.encodeWithTag(protoWriter, 3, meetingRoomSubscriptionInfo.creator);
            }
            if (meetingRoomSubscriptionInfo.event_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, meetingRoomSubscriptionInfo.event_id);
            }
            if (meetingRoomSubscriptionInfo.calendar_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, meetingRoomSubscriptionInfo.calendar_id);
            }
            if (meetingRoomSubscriptionInfo.start_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, meetingRoomSubscriptionInfo.start_time);
            }
            if (meetingRoomSubscriptionInfo.end_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, meetingRoomSubscriptionInfo.end_time);
            }
            if (meetingRoomSubscriptionInfo.is_all_day != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, meetingRoomSubscriptionInfo.is_all_day);
            }
            if (meetingRoomSubscriptionInfo.original_event_creator != null) {
                EventCreator.ADAPTER.encodeWithTag(protoWriter, 9, meetingRoomSubscriptionInfo.original_event_creator);
            }
            if (meetingRoomSubscriptionInfo.event_organizer != null) {
                EventCreator.ADAPTER.encodeWithTag(protoWriter, 10, meetingRoomSubscriptionInfo.event_organizer);
            }
            protoWriter.writeBytes(meetingRoomSubscriptionInfo.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.MeetingRoomSubscriptionInfo$a */
    public static final class C15876a extends Message.Builder<MeetingRoomSubscriptionInfo, C15876a> {

        /* renamed from: a */
        public Boolean f41719a;

        /* renamed from: b */
        public String f41720b;

        /* renamed from: c */
        public EventCreator f41721c;

        /* renamed from: d */
        public String f41722d;

        /* renamed from: e */
        public String f41723e;

        /* renamed from: f */
        public Long f41724f;

        /* renamed from: g */
        public Long f41725g;

        /* renamed from: h */
        public Boolean f41726h;

        /* renamed from: i */
        public EventCreator f41727i;

        /* renamed from: j */
        public EventCreator f41728j;

        /* renamed from: a */
        public MeetingRoomSubscriptionInfo build() {
            return new MeetingRoomSubscriptionInfo(this.f41719a, this.f41720b, this.f41721c, this.f41722d, this.f41723e, this.f41724f, this.f41725g, this.f41726h, this.f41727i, this.f41728j, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15876a newBuilder() {
        C15876a aVar = new C15876a();
        aVar.f41719a = this.is_public;
        aVar.f41720b = this.summary;
        aVar.f41721c = this.creator;
        aVar.f41722d = this.event_id;
        aVar.f41723e = this.calendar_id;
        aVar.f41724f = this.start_time;
        aVar.f41725g = this.end_time;
        aVar.f41726h = this.is_all_day;
        aVar.f41727i = this.original_event_creator;
        aVar.f41728j = this.event_organizer;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "MeetingRoomSubscriptionInfo");
        StringBuilder sb = new StringBuilder();
        if (this.is_public != null) {
            sb.append(", is_public=");
            sb.append(this.is_public);
        }
        if (this.summary != null) {
            sb.append(", summary=");
            sb.append(this.summary);
        }
        if (this.creator != null) {
            sb.append(", creator=");
            sb.append(this.creator);
        }
        if (this.event_id != null) {
            sb.append(", event_id=");
            sb.append(this.event_id);
        }
        if (this.calendar_id != null) {
            sb.append(", calendar_id=");
            sb.append(this.calendar_id);
        }
        if (this.start_time != null) {
            sb.append(", start_time=");
            sb.append(this.start_time);
        }
        if (this.end_time != null) {
            sb.append(", end_time=");
            sb.append(this.end_time);
        }
        if (this.is_all_day != null) {
            sb.append(", is_all_day=");
            sb.append(this.is_all_day);
        }
        if (this.original_event_creator != null) {
            sb.append(", original_event_creator=");
            sb.append(this.original_event_creator);
        }
        if (this.event_organizer != null) {
            sb.append(", event_organizer=");
            sb.append(this.event_organizer);
        }
        StringBuilder replace = sb.replace(0, 2, "MeetingRoomSubscriptionInfo{");
        replace.append('}');
        return replace.toString();
    }

    public MeetingRoomSubscriptionInfo(Boolean bool, String str, EventCreator eventCreator, String str2, String str3, Long l, Long l2, Boolean bool2, EventCreator eventCreator2, EventCreator eventCreator3) {
        this(bool, str, eventCreator, str2, str3, l, l2, bool2, eventCreator2, eventCreator3, ByteString.EMPTY);
    }

    public MeetingRoomSubscriptionInfo(Boolean bool, String str, EventCreator eventCreator, String str2, String str3, Long l, Long l2, Boolean bool2, EventCreator eventCreator2, EventCreator eventCreator3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.is_public = bool;
        this.summary = str;
        this.creator = eventCreator;
        this.event_id = str2;
        this.calendar_id = str3;
        this.start_time = l;
        this.end_time = l2;
        this.is_all_day = bool2;
        this.original_event_creator = eventCreator2;
        this.event_organizer = eventCreator3;
    }
}
