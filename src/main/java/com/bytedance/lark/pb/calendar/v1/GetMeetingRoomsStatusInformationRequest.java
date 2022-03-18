package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class GetMeetingRoomsStatusInformationRequest extends Message<GetMeetingRoomsStatusInformationRequest, C15740a> {
    public static final ProtoAdapter<GetMeetingRoomsStatusInformationRequest> ADAPTER = new C15741b();
    public static final Long DEFAULT_END_TIME = 0L;
    public static final Long DEFAULT_START_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final List<String> calendar_ids;
    public final Long end_time;
    public final String event_rrule;
    public final Long start_time;
    public final String start_timezone;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetMeetingRoomsStatusInformationRequest$b */
    private static final class C15741b extends ProtoAdapter<GetMeetingRoomsStatusInformationRequest> {
        C15741b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetMeetingRoomsStatusInformationRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetMeetingRoomsStatusInformationRequest getMeetingRoomsStatusInformationRequest) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (getMeetingRoomsStatusInformationRequest.start_time != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, getMeetingRoomsStatusInformationRequest.start_time);
            } else {
                i = 0;
            }
            if (getMeetingRoomsStatusInformationRequest.end_time != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, getMeetingRoomsStatusInformationRequest.end_time);
            } else {
                i2 = 0;
            }
            int encodedSizeWithTag = i + i2 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(4, getMeetingRoomsStatusInformationRequest.calendar_ids);
            if (getMeetingRoomsStatusInformationRequest.event_rrule != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(5, getMeetingRoomsStatusInformationRequest.event_rrule);
            } else {
                i3 = 0;
            }
            int i5 = encodedSizeWithTag + i3;
            if (getMeetingRoomsStatusInformationRequest.start_timezone != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(7, getMeetingRoomsStatusInformationRequest.start_timezone);
            }
            return i5 + i4 + getMeetingRoomsStatusInformationRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetMeetingRoomsStatusInformationRequest decode(ProtoReader protoReader) throws IOException {
            C15740a aVar = new C15740a();
            aVar.f41505a = 0L;
            aVar.f41506b = 0L;
            aVar.f41508d = "";
            aVar.f41509e = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41505a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f41506b = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f41507c.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 5) {
                    aVar.f41508d = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 7) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41509e = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetMeetingRoomsStatusInformationRequest getMeetingRoomsStatusInformationRequest) throws IOException {
            if (getMeetingRoomsStatusInformationRequest.start_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, getMeetingRoomsStatusInformationRequest.start_time);
            }
            if (getMeetingRoomsStatusInformationRequest.end_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, getMeetingRoomsStatusInformationRequest.end_time);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 4, getMeetingRoomsStatusInformationRequest.calendar_ids);
            if (getMeetingRoomsStatusInformationRequest.event_rrule != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, getMeetingRoomsStatusInformationRequest.event_rrule);
            }
            if (getMeetingRoomsStatusInformationRequest.start_timezone != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, getMeetingRoomsStatusInformationRequest.start_timezone);
            }
            protoWriter.writeBytes(getMeetingRoomsStatusInformationRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetMeetingRoomsStatusInformationRequest$a */
    public static final class C15740a extends Message.Builder<GetMeetingRoomsStatusInformationRequest, C15740a> {

        /* renamed from: a */
        public Long f41505a;

        /* renamed from: b */
        public Long f41506b;

        /* renamed from: c */
        public List<String> f41507c = Internal.newMutableList();

        /* renamed from: d */
        public String f41508d;

        /* renamed from: e */
        public String f41509e;

        /* renamed from: a */
        public GetMeetingRoomsStatusInformationRequest build() {
            return new GetMeetingRoomsStatusInformationRequest(this.f41505a, this.f41506b, this.f41507c, this.f41508d, this.f41509e, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C15740a mo56917a(Long l) {
            this.f41505a = l;
            return this;
        }

        /* renamed from: b */
        public C15740a mo56921b(Long l) {
            this.f41506b = l;
            return this;
        }

        /* renamed from: a */
        public C15740a mo56918a(String str) {
            this.f41508d = str;
            return this;
        }

        /* renamed from: a */
        public C15740a mo56919a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f41507c = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15740a newBuilder() {
        C15740a aVar = new C15740a();
        aVar.f41505a = this.start_time;
        aVar.f41506b = this.end_time;
        aVar.f41507c = Internal.copyOf("calendar_ids", this.calendar_ids);
        aVar.f41508d = this.event_rrule;
        aVar.f41509e = this.start_timezone;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetMeetingRoomsStatusInformationRequest");
        StringBuilder sb = new StringBuilder();
        if (this.start_time != null) {
            sb.append(", start_time=");
            sb.append(this.start_time);
        }
        if (this.end_time != null) {
            sb.append(", end_time=");
            sb.append(this.end_time);
        }
        if (!this.calendar_ids.isEmpty()) {
            sb.append(", calendar_ids=");
            sb.append(this.calendar_ids);
        }
        if (this.event_rrule != null) {
            sb.append(", event_rrule=");
            sb.append(this.event_rrule);
        }
        if (this.start_timezone != null) {
            sb.append(", start_timezone=");
            sb.append(this.start_timezone);
        }
        StringBuilder replace = sb.replace(0, 2, "GetMeetingRoomsStatusInformationRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetMeetingRoomsStatusInformationRequest(Long l, Long l2, List<String> list, String str, String str2) {
        this(l, l2, list, str, str2, ByteString.EMPTY);
    }

    public GetMeetingRoomsStatusInformationRequest(Long l, Long l2, List<String> list, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.start_time = l;
        this.end_time = l2;
        this.calendar_ids = Internal.immutableCopyOf("calendar_ids", list);
        this.event_rrule = str;
        this.start_timezone = str2;
    }
}
