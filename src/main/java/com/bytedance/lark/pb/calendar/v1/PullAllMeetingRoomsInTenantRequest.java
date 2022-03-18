package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PullAllMeetingRoomsInTenantRequest extends Message<PullAllMeetingRoomsInTenantRequest, C15912a> {
    public static final ProtoAdapter<PullAllMeetingRoomsInTenantRequest> ADAPTER = new C15913b();
    public static final Long DEFAULT_END_TIME = 0L;
    public static final Long DEFAULT_START_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final Long end_time;
    public final Long start_time;
    public final String start_timezone;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.PullAllMeetingRoomsInTenantRequest$b */
    private static final class C15913b extends ProtoAdapter<PullAllMeetingRoomsInTenantRequest> {
        C15913b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullAllMeetingRoomsInTenantRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PullAllMeetingRoomsInTenantRequest pullAllMeetingRoomsInTenantRequest) {
            int i;
            int i2;
            int i3 = 0;
            if (pullAllMeetingRoomsInTenantRequest.start_time != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, pullAllMeetingRoomsInTenantRequest.start_time);
            } else {
                i = 0;
            }
            if (pullAllMeetingRoomsInTenantRequest.end_time != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, pullAllMeetingRoomsInTenantRequest.end_time);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (pullAllMeetingRoomsInTenantRequest.start_timezone != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, pullAllMeetingRoomsInTenantRequest.start_timezone);
            }
            return i4 + i3 + pullAllMeetingRoomsInTenantRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PullAllMeetingRoomsInTenantRequest decode(ProtoReader protoReader) throws IOException {
            C15912a aVar = new C15912a();
            aVar.f41871a = 0L;
            aVar.f41872b = 0L;
            aVar.f41873c = "UTC";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41871a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f41872b = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41873c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PullAllMeetingRoomsInTenantRequest pullAllMeetingRoomsInTenantRequest) throws IOException {
            if (pullAllMeetingRoomsInTenantRequest.start_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, pullAllMeetingRoomsInTenantRequest.start_time);
            }
            if (pullAllMeetingRoomsInTenantRequest.end_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, pullAllMeetingRoomsInTenantRequest.end_time);
            }
            if (pullAllMeetingRoomsInTenantRequest.start_timezone != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, pullAllMeetingRoomsInTenantRequest.start_timezone);
            }
            protoWriter.writeBytes(pullAllMeetingRoomsInTenantRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.PullAllMeetingRoomsInTenantRequest$a */
    public static final class C15912a extends Message.Builder<PullAllMeetingRoomsInTenantRequest, C15912a> {

        /* renamed from: a */
        public Long f41871a;

        /* renamed from: b */
        public Long f41872b;

        /* renamed from: c */
        public String f41873c;

        /* renamed from: a */
        public PullAllMeetingRoomsInTenantRequest build() {
            return new PullAllMeetingRoomsInTenantRequest(this.f41871a, this.f41872b, this.f41873c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C15912a mo57363a(Long l) {
            this.f41871a = l;
            return this;
        }

        /* renamed from: b */
        public C15912a mo57365b(Long l) {
            this.f41872b = l;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15912a newBuilder() {
        C15912a aVar = new C15912a();
        aVar.f41871a = this.start_time;
        aVar.f41872b = this.end_time;
        aVar.f41873c = this.start_timezone;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "PullAllMeetingRoomsInTenantRequest");
        StringBuilder sb = new StringBuilder();
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
        StringBuilder replace = sb.replace(0, 2, "PullAllMeetingRoomsInTenantRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PullAllMeetingRoomsInTenantRequest(Long l, Long l2, String str) {
        this(l, l2, str, ByteString.EMPTY);
    }

    public PullAllMeetingRoomsInTenantRequest(Long l, Long l2, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.start_time = l;
        this.end_time = l2;
        this.start_timezone = str;
    }
}
